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

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class RbacDSLValidator extends AbstractRbacDSLValidator {
	public static val EMPTY_POLICY = "uk.ac.open.rbacdsl.EmptyPolicy"
	public static val EMPTY_USER = "uk.ac.open.rbacdsl.EmptyUser"
	public static val DUPLICATE_PERMISSION_ASSIGNMENT = "uk.ac.open.rbacdsl.DuplicatePermissionAssignment"
	public static val DUPLICATE_ROLE_ASSIGNMENT = "uk.ac.open.rbacdsl.DuplicateRoleAssignment"
	public static val DUPLICATE_ROLE_EXTENSION = "uk.ac.open.rbacdsl.DuplicateRoleExtension"
	public static val ROLE_EXTENDING_ITSELF = "uk.ac.open.rbacdsl.RoleExtendingItself"
	public static val SOD_CONFLICT = "uk.ac.open.rbacdsl.SoDConflict"
	public static val SOD_WITH_SELF = "uk.ac.open.rbacdsl.SoDWithSelf"
	public static val MULTIPLE_DSOD_BLOCKS = "uk.ac.open.rbacdsl.MultipleDSoDBlocks"
	public static val MULTIPLE_SSOD_BLOCKS = "uk.ac.open.rbacdsl.MultipleSSoDBlocks"
	public static val EMPTY_ROLE = "uk.ac.open.rbacdsl.EmptyRole"
	
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
			warning('''Role has no actions assigned on any object''',
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
			if (Arrays.copyOfRange(role.parents.toArray, 0, i).contains(parent)) {
				error('''Duplicate role extension''',
					role.parents.get(i),
					null,
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
	 			if (current.equals(user.roles.get(j)))
	 				error('''Role assigned twice to the user''',
	 					user,
	 					RbacDSLPackage::eINSTANCE.user_Roles,
	 					DUPLICATE_ROLE_ASSIGNMENT
	 				)
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
