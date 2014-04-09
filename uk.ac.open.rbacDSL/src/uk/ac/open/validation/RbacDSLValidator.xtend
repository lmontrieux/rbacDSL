/*
 * generated by Xtext
 */
package uk.ac.open.validation

import org.eclipse.xtext.validation.Check
import uk.ac.open.rbacDSL.Assignment
import uk.ac.open.rbacDSL.ForbiddenScenario
import uk.ac.open.rbacDSL.GrantedScenario
import uk.ac.open.rbacDSL.ObjectRoleScenario
import uk.ac.open.rbacDSL.ObjectScenario
import uk.ac.open.rbacDSL.Permission
import uk.ac.open.rbacDSL.RbacDSLPackage
import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.User
import uk.ac.open.rbacDSL.UserRoleScenario

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class RbacDSLValidator extends AbstractRbacDSLValidator {
	
	public static val SSOD_VIOLATION = "uk.ac.open.rbacDSL.SSoD";
	public static val DSOD_VIOLATION = "uk.ac.open.rbacDSL.DSoD";
	
	/**
	 * Detects cycles in role hierarchies
	 */
//	@Check
//	def checkNoCyleInRoleHierarchies(Role role) {
//		if (role.parent.isEmpty())
//			return;
//		val visitedRoles = <Role>newHashSet();
//		visitedRoles.add(role);
//		var current = role.parent;
//		while (!current.isEmpty()) {
//			for (Role currentRole:current) {
//				if (visitedRoles.contains(currentRole)) {
//					error("cycle in role hierarchy of role '" + currentRole.name + "'", RbacDSLPackage::eINSTANCE.role_Parent);
//					return
//				}
//				visitedRoles.add(currentRole)
//			}
//		}
//	}
	
	@Check
	def checkNoSSoDViolations(User user) {
		var roles = user.roles
		for (Role role:roles) {
			if (!role.ssod.isEmpty()) {
				for (Role ssod:role.ssod) {
					if (roles.contains(ssod)) {
						error("SSoD violation for user '" 
							+ user.name + "'", 
							RbacDSLPackage::eINSTANCE.user_Roles,
							SSOD_VIOLATION, role.name, ssod.name);
					}
				}
			}
		}
	}
	
	@Check
	def checkNoDSoDViolationsGranted(GrantedScenario scenario) {
		var roles = scenario.roles
		for (Role role:roles) {
			if (!role.dsod.isEmpty()) {
				for (Role dsod:role.dsod) {
					if (roles.contains(dsod)) {
						error("DSoD violation for scenario '"
							+ scenario.name + "'",
							RbacDSLPackage::eINSTANCE.grantedScenario_Roles,
							DSOD_VIOLATION, role.name);
					}
				}
			}
		}
	}
	
	@Check
	def checkNoDSoDViolationsForbidden(ForbiddenScenario scenario) {
		var roles = scenario.roles
		for (Role role:roles) {
			if (!role.dsod.isEmpty()) {
				for (Role dsod:role.dsod) {
					if (roles.contains(dsod)) {
						error("DSoD violation for scenario '"
							+ scenario.name + "'",
							RbacDSLPackage::eINSTANCE.forbiddenScenario_Roles,
							DSOD_VIOLATION, role.name);
					}
				}
			}
		}
	}
	
	@Check
	def checkRoleActivation(GrantedScenario scenario) {
		var assigned = scenario.user.roles
		var activated = scenario.roles
		if (!assigned.containsAll(activated)) {
			error("Attempt to activate a role not assigned to the user " 
				+ "for scenario '" + scenario.name + "'", 
				RbacDSLPackage::eINSTANCE.grantedScenario_Roles)
		}
	}
	
	@Check
	def checkRoleActivation(ForbiddenScenario scenario) {
		var assigned = scenario.user.roles
		var activated = scenario.roles
		if (!assigned.containsAll(activated)) {
			error("Attempt to activate a role not assigned to the user " 
				+ "for scenario '" + scenario.name + "'", 
				RbacDSLPackage::eINSTANCE.forbiddenScenario_Roles)
		}
	}
	
	/**
	 * Checks the policy against granted scenarios:
	 * the list of required actions must be a subset of the list of available 
	 * actions
	 */
	@Check
	def checkGrantedScenario(GrantedScenario scenario) {
		// first we build a list of available actions for each object
		var availableObjectActions = <ObjectAction>newArrayList()
		for (Role role:scenario.roles) {
			for (Assignment assignment:role.assignments) {
				for (Permission action:assignment.actions) {
					availableObjectActions.add(
						new ObjectAction(assignment.object.name, action.name)
					)
				}
			}
		}
		// if no roles are active, we fail, since there must be at least one 
		// action on one object
		if (availableObjectActions.isEmpty()) {
			error("Granted scenario violation on scenario '"
				+ scenario.name + "'", 
				RbacDSLPackage::eINSTANCE.grantedScenario_Object
			)
		}
		
		// now we check that each required action is available
		for (Assignment assignment:scenario.object) {
			for (Permission action:assignment.actions) {
				if (!availableObjectActions.contains(
					new ObjectAction(assignment.object.name, action.name)
				)) {
					error("Granted scenario violation on scenario '"
						+ scenario.name + "'", 
						RbacDSLPackage::eINSTANCE.grantedScenario_Object
					)
				}
			}
		}
	}
	
	/**
	 * Checks the policy against forbidden scenarios:
	 * the list of required actions must *not* be a subset of the list of 
	 * available
	 * actions, i.e. at least one action must be missing
	 */
	@Check
	def checkForbiddenScenario(ForbiddenScenario scenario) {
		// first we build a list of available actions for each object
		var availableObjectActions = <ObjectAction>newArrayList()
		for (Role role:scenario.roles) {
			for (Assignment assignment:role.assignments) {
				for (Permission action:assignment.actions) {
					availableObjectActions.add(
						new ObjectAction(assignment.object.name, action.name)
					)
				}
			}
		}
		var success = false
		// now we check that each required action is available
		for (Assignment assignment:scenario.object) {
			for (Permission action:assignment.actions) {
				if (!availableObjectActions.contains(
					new ObjectAction(assignment.object.name, action.name)
				)) {
					success = true
				}
			}
		}
		if (!success)
			error("Forbidden scenario violation on scenario '"
				+ scenario.name + "'", 
				RbacDSLPackage::eINSTANCE.forbiddenScenario_Object
			)
	}
	
	@Check
	def checkUserRoleScenario(UserRoleScenario scenario) {
	}
	
	@Check
	def checkAssignmentPermissions(Assignment assignment) {
		if (!assignment.object.permissions.containsAll(assignment.actions)) {
			error("Action not available for object '" + assignment.object.name
				+ "'", RbacDSLPackage::eINSTANCE.assignment_Object
			)
		}
	}
	
	@Check
	def checkObjectRoleScenario(ObjectRoleScenario scenario) {
		var oalist = new ObjectsActionsList(scenario.role)
		var assignments = scenario.assignment
		for (Assignment assignment:assignments) {
			var actions = newArrayList()
			for (Permission permission:assignment.actions) {
				actions.add(permission.name)
			}
			if (!oalist.hasAllActions(assignment.object.name, actions)) {
				error("Object-Role Scenario violation for scenario '" 
					+ scenario.name + "'", 
					RbacDSLPackage::eINSTANCE.objectRoleScenario_Role
				)
			}
		}
	}
	
	@Check
	def checkObjectScenario(ObjectScenario scenario) {
		
	}
}
