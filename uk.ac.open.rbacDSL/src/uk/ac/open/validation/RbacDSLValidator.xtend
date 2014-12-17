/*
 * generated by Xtext
 */
package uk.ac.open.validation

import org.eclipse.xtext.validation.Check
import uk.ac.open.rbacDSL.Policy
import uk.ac.open.rbacDSL.RbacDSLPackage
import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.TupleRole
import uk.ac.open.rbacDSL.User

import static extension uk.ac.open.util.RbacDSLModelUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import uk.ac.open.rbacDSL.SSoD
import uk.ac.open.rbacDSL.DSoD
import java.util.Arrays
import uk.ac.open.rbacDSL.PolicyConstraint
import java.util.List

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class RbacDSLValidator extends AbstractRbacDSLValidator {
	public static val DUPLICATE_PERMISSION_ASSIGNMENT = "uk.ac.open.rbacdsl.DuplicatePermissionAssignment"
	public static val DUPLICATE_OPERATION_REFERENCE = "uk.ac.open.rbacdsl.DuplicateOperationReference"
	public static val DUPLICATE_ROLE_ASSIGNMENT = "uk.ac.open.rbacdsl.DuplicateRoleAssignment"
	public static val DUPLICATE_ROLE_EXTENSION = "uk.ac.open.rbacdsl.DuplicateRoleExtension"
	public static val DUPLICATE_ROLE_REFERENCE = "uk.ac.open.rbacdsl.DuplicateRoleReference"
	public static val DUPLICATE_USER_REFERENCE = "uk.ac.open.rbacdsl.DuplicateUserReference"
	public static val EMPTY_POLICY = "uk.ac.open.rbacdsl.EmptyPolicy"
	public static val EMPTY_ROLE = "uk.ac.open.rbacdsl.EmptyRole"
	public static val EMPTY_USER = "uk.ac.open.rbacdsl.EmptyUser"
	public static val MULTIPLE_DSOD_BLOCKS = "uk.ac.open.rbacdsl.MultipleDSoDBlocks"
	public static val MULTIPLE_SSOD_BLOCKS = "uk.ac.open.rbacdsl.MultipleSSoDBlocks"
	public static val ROLE_EXTENDING_ITSELF = "uk.ac.open.rbacdsl.RoleExtendingItself"
	public static val SOD_CONFLICT = "uk.ac.open.rbacdsl.SoDConflict"
	public static val SOD_WITH_SELF = "uk.ac.open.rbacdsl.SoDWithSelf"
	public static val UNASSIGNED_ROLE = "uk.ac.open.rbacdsl.UnassignedRole"
	
	/**
	 * Finds roles in constraints that are not /assigned/ to /all/ the users in 
	 * the constraint.
	 * A role cannot be activated by a user if it isn't assigned to the user, 
	 * so any of there roles should trigger an error. The error marker appears 
	 * on the role.
	 */
	@Check
	def checkUnassignedRolesInConstraint(PolicyConstraint constraint) {
		for (user:constraint.users) {
			for (role:checkUnassignedRolesForUser(user, constraint.roles)) {
				error("Role not assigned to user '" + user.name + "'",
					RbacDSLPackage::eINSTANCE.policyConstraint_Roles,
					constraint.roles.indexOf(role),
					UNASSIGNED_ROLE
				)
			}
		}
	}
	
	private def checkUnassignedRolesForUser(User user, List<Role> roles) {
		roles.filter[r | !user.roles.contains(r)]
	}
	
	@Check
	def checkEmptyPolicy(Policy policy) {
		if (policy.policyElements.isEmpty())
			warning('''Empty policy''',
				RbacDSLPackage::eINSTANCE.policy_Name,
				EMPTY_POLICY
			)
	}
	
	@Check
	def checkEmptyUser(User user) {
		if (user.roles.isEmpty())
			warning('''User has no role assignment''',
				RbacDSLPackage::eINSTANCE.user_Name,
				EMPTY_USER
			)
	}
	
	@Check
	def checkEmptyRole(Role role) {
		if (role.permissions.isEmpty())
			warning('''Role has no operations assigned on any object''',
				RbacDSLPackage::eINSTANCE.role_Name,
				EMPTY_ROLE
			)
	}
	
	@Check
	def checkMultipleSSoDBlocks(Policy policy) {
		val ssods = policy.ssod
		if (ssods.size() > 1)
			error('''Several ssod blocks in the same policy''',
				ssods.get(1),
				null,
				MULTIPLE_SSOD_BLOCKS
			)
	}
	
	@Check
	def checkMultipleDSoDBlocks(Policy policy) {
		val dsods = policy.dsod
		if (dsods.size() > 1)
			error('''Several dsod blocks in the same policy''',
				dsods.get(1),
				null,
				MULTIPLE_DSOD_BLOCKS
			)
	}
	
	@Check
	def checkSoDWithSelf(TupleRole tuple) {
		if (tuple.fst.equals(tuple.snd))
			error('''SoD constraint between an role and itself''',
				tuple,
				null,
				SOD_WITH_SELF
			)
	}
	
	/**
	 * A role should not extend the same role multiple times
	 */
	@Check
	def checkDuplicateRoleExtensions(Role role) {
		for (var i = 0; i < role.parents.toArray.length; i++) {
			var parent = role.parents.toArray.get(i);
			val previous = Arrays.copyOfRange(role.parents.toArray, 0, i) //subset of parents array before parent
			if (previous.contains(parent)) {
				error('''Duplicate role extension''',
					RbacDSLPackage::eINSTANCE.role_Parents,
					i,
					DUPLICATE_ROLE_EXTENSION
				)
				error('''Duplicate role extension''',
					RbacDSLPackage::eINSTANCE.role_Parents,
					previous.indexOf(parent),
					DUPLICATE_ROLE_EXTENSION
				)
			}
		}
	}
	
	/**
	 * A role should not extend itself
	 */
	 @Check
	 def checkRoleExtendingItself(Role role) {
	 	if (role.parents.contains(role))
	 		error('''Role extending itself''',
	 			role,
	 			null,
	 			ROLE_EXTENDING_ITSELF
	 		)
	 }
	 
	 @Check
	 def checkDuplicateRoleAssignment(User user) {
	 	if (user.roles.size() <= 1)
	 		return;
	 	for (var i = 0; i < user.roles.size(); i++) {
	 		var current = user.roles.get(i)
	 		for (var j = i+1; j < user.roles.size(); j++) {
	 			if (current.equals(user.roles.get(j))) {
	 				error('''Duplicate role assignment''',
	 					RbacDSLPackage::eINSTANCE.user_Roles,
	 					j,
	 					DUPLICATE_ROLE_ASSIGNMENT
	 				)
	 				error('''Duplicate role assignment''',
	 					RbacDSLPackage::eINSTANCE.user_Roles,
	 					i,
	 					DUPLICATE_ROLE_ASSIGNMENT
	 				)	
	 			}
	 		}
	 	}
	 }
	 
	 @Check
	 def checkDuplicateUserReferences(PolicyConstraint constraint) {
	 	if (constraint.users.size() <= 1)
	 		return;
	 	for (var i = 0; i < constraint.users.size(); i++) {
	 		var current = constraint.users.get(i)
	 		for (var j = i+1; j < constraint.users.size(); j++) {
	 			if (current.equals(constraint.users.get(j))) {
	 				error('''Duplicate user reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Users,
	 					j,
	 					DUPLICATE_USER_REFERENCE
	 				)
	 				error('''Duplicate user reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Users,
	 					i,
	 					DUPLICATE_USER_REFERENCE
	 				)
	 			}
	 		}
	 	}
	 }
	 
	 @Check
	 def checkDuplicateRoleReferences(PolicyConstraint constraint) {
	 	if (constraint.roles.size() <= 1)
	 		return;
	 	for (var i = 0; i < constraint.roles.size(); i++) {
	 		var current = constraint.roles.get(i)
	 		for (var j = i+1; j < constraint.roles.size(); j++) {
	 			if (current.equals(constraint.roles.get(j))) {
	 				error('''Duplicate role reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Roles,
	 					j,
	 					DUPLICATE_ROLE_REFERENCE
	 				)
	 				error('''Duplicate role reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Roles,
	 					i,
	 					DUPLICATE_ROLE_REFERENCE
	 				)
	 			}
	 		}
	 	}
	 }
	 
	 @Check
	 def checkDuplicateOperationReferences(PolicyConstraint constraint) {
	 	if (constraint.operations.size() <= 1)
	 		return;
	 	for (var i = 0; i < constraint.operations.size(); i++) {
	 		var current = constraint.operations.get(i)
	 		for (var j = i+1; j < constraint.operations.size(); j++) {
	 			if (current.equals(constraint.operations.get(j))) {
	 				error('''Duplicate operation reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Operations,
	 					j,
	 					DUPLICATE_OPERATION_REFERENCE
	 				)
	 				error('''Duplicate operation reference''',
	 					RbacDSLPackage::eINSTANCE.policyConstraint_Operations,
	 					i,
	 					DUPLICATE_OPERATION_REFERENCE
	 				)
	 			}
	 		}
	 	}
	 }
	
	/*
	 * Raises a warning if a DSoD constraint is identical to an SSoD constraint.
	 * In such a case, the DSoD constraint is unnecessary.
	 */
	@Check
	def checkSoDConflict(TupleRole tuple) {
		if (tuple.getContainerOfType(typeof(DSoD)) != null) {
			for (SSoD ssod:tuple.policy.ssod) {
				for (TupleRole current:ssod.ssod) {
					if(equivalent(tuple, current)) {
						warning('''DSoD constraint unnecessary because of an identical SSoD constraint''',
							tuple,
							null,
							SOD_CONFLICT
						)
					}
				}
			}
		}
	}
	
	/*
	 * Determines if two tuples involve the same two roles
	 */
	private def equivalent(TupleRole tuple1, TupleRole tuple2) {
		if (((tuple1.fst == tuple2.fst) && (tuple1.snd == tuple2.snd))
			|| ((tuple1.fst == tuple2.snd) && (tuple1.snd == tuple2.fst)))
			return true
		return false
	}
}
