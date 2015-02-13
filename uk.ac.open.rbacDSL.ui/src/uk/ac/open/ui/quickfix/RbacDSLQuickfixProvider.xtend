/*
* generated by Xtext
*/
package uk.ac.open.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import uk.ac.open.rbacDSL.DSoD
import uk.ac.open.rbacDSL.Policy
import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.TupleRole
import uk.ac.open.validation.RbacDSLValidator

import static extension uk.ac.open.util.RbacDSLModelUtil.*
import uk.ac.open.rbacDSL.SSoD
import uk.ac.open.rbacDSL.User
import uk.ac.open.rbacDSL.PolicyConstraint
import java.util.List

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class RbacDSLQuickfixProvider extends DefaultQuickfixProvider {
	
	/**
	 * Remove the role from the list of roles involved in a constraint
	 */
	@Fix(RbacDSLValidator::DSOD_CONFLICT)
	def void removeDSoDConflictingRoleFromAssignment(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove role from constraint", //label
			"Remove role " + issue.data.get(0) + " from constraint", //description
			"", //icon
			[
				element, context |
				(element as PolicyConstraint).roles.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::DSOD_WITH_SELF)
	def void removeSelfDSoD(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove DSoD constraint", //label
			"Remove DSoD constraint", //description
			"", //icon
			[
				element, context |
				(element as TupleRole).containingDSoDSet.dsod.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::DUPLICATE_ROLE_ASSIGNMENT)
	def void removeDuplicateRole(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate role assignment", //label
			"Remove duplicate role assignment", //description
			"", //icon
			[
				element, context |
				(element as User).roles.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::DUPLICATE_ROLE_EXTENSION)
	def void removeDuplicateRoleExtension(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate role extension", //label
			"Remove duplicate role extension", //description
			"", //icon
			[
				element, context |
				(element as Role).parents.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::DUPLICATE_ROLE_REFERENCE)
	def void removeDuplicateRoleReference(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate role reference", //label
			"Remove duplicate role reference", //description
			"", //icon
			[
				element, context |
				(element as PolicyConstraint).roles.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::DUPLICATE_USER_REFERENCE)
	def void removeDuplicateUserReference(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate user reference", //label
			"Remove duplicate user reference", //description
			"", //icon
			[
				element, context |
				(element as PolicyConstraint).users.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::EMPTY_DSOD)
	def void removeEmptyDSoDList(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove empty DSoD list", //label
			"Remove empty DSoD list", //description
			"", //icon
			[
				element, context |
				(element as DSoD).containingPolicy.policyElements.remove(element as DSoD)
			]
		)
	}
	
	@Fix(RbacDSLValidator::EMPTY_POLICY)
	def void removeEmptyPolicy(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove empty constraint", //label
			"Remove empty constraint", //description
			"", //icon
			[
				element, context |
				(element as Policy).containingModel.policies.remove(element)
			]
		)
	}
	
	@Fix(RbacDSLValidator::EMPTY_ROLE)
	def void removeEmptyRole(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove empty role", //label
			"Remove empty role", //description
			"", //icon
			[
				element, context |
				(element as Role).containingPolicy.policyElements.remove(element)
			]
		)
	}
	
	@Fix(RbacDSLValidator::EMPTY_SSOD)
	def void removeEmptySSoDList(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove empty SSoD list", //label
			"Remove empty SSoD list", //description
			"", //icon
			[
				element, context |
				(element as SSoD).containingPolicy.policyElements.remove(element as SSoD)
			]
		)
	}
	
	@Fix(RbacDSLValidator::EMPTY_USER)
	def void removeEmptyUser(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove empty user", //label
			"Remove empty user " + issue.data.get(0), //description
			"", //icon
			[
				element, context |
				(element as User).containingPolicy.policyElements.remove(element as User)
			]
		)
	}
	
	@Fix(RbacDSLValidator::MULTIPLE_DSOD_BLOCKS)
	def void removeDuplicateDSoDBlock(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate DSoD block", //label
			"Remove duplicate DSoD block", //description
			"", //icon
			[
				element, context |
				(element as DSoD).containingPolicy.policyElements.remove(element as DSoD)
			]
		)
	}
	
	@Fix(RbacDSLValidator::MULTIPLE_DSOD_BLOCKS)
	def void mergeDuplicateDSoDBlock(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Merge duplicate DSoD block", //label
			"Merge duplicate DSoD block", //description
			"", //icon
			[
				element, context |
				(element as DSoD).containingPolicy.mergeDSoDBlocks()
			]
		)
	}
	
	@Fix(RbacDSLValidator::MULTIPLE_SSOD_BLOCKS)
	def void removeDuplicateSSoDBlock(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove duplicate SSoD block", //label
			"Remove duplicate SSoD block", //description
			"", //icon
			[
				element, context |
				(element as SSoD).containingPolicy.policyElements.remove(element as SSoD)
			]
		)
	}
	
	@Fix(RbacDSLValidator::MULTIPLE_SSOD_BLOCKS)
	def void mergeDuplicateSSoDBlock(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Merge duplicate SSoD block", //label
			"Merge duplicate SSoD block", //description
			"", //icon
			[
				element, context |
				(element as SSoD).containingPolicy.mergeSSoDBlocks()
			]
		)
	}
	
	@Fix(RbacDSLValidator::ROLE_EXTENDING_ITSELF)
	def void removeRoleSelfExtension(Issue issue, 
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove role from list of parents", //label
			"Remove role " + issue.data.get(1) + " from list of parents", //description
			"", //icon
			[
				element, context |
				(element as Role).parents.remove(Integer.parseInt(issue.data.get(0)))
				
			]
		)
	}
	
	@Fix(RbacDSLValidator::SSOD_WITH_SELF)
	def void removeSelfSSoD(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove SSoD constraint", //label
			"Remove SSoD constraint " + issue.data.get(0), //description
			"", //icon
			[
				element, context |
				(element as TupleRole).containingSSoDSet.ssod.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::UNASSIGNED_ROLE)
	def void removeUnassignedRole(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Remove unassigned role", //label
			"Remove unassigned role", //description
			"", //icon
			[
				element, context |
				(element as PolicyConstraint).roles.remove(Integer.parseInt(issue.data.get(0)))
			]
		)
	}
	
	@Fix(RbacDSLValidator::UNASSIGNED_ROLE)
	def void assignUnassignedRole(Issue issue,
		IssueResolutionAcceptor acceptor
	) {
		acceptor.accept(issue,
			"Assign role to all constraint users", //label
			"Assign role to all constraint users", //description
			"", //icon
			[
				element, context |
				(element as PolicyConstraint).users.assignRole((element as PolicyConstraint).roles.get(Integer.parseInt(issue.data.get(0))))
			]
		)
	}
	
	/**
	 * Merges all DSoD blocks in a policy into the first block.
	 * Removes empty blocks
	 */
	private def mergeDSoDBlocks(Policy policy) {
		var blocks = policy.dsod
		val dsodBlock = blocks.get(0)
		blocks.forEach[block | dsodBlock.dsod.addAll(block.dsod)]
		for (var i = 1; i < blocks.size(); i++) {
			policy.policyElements.remove(blocks.get(i))
		}
	}
	
	/**
	 * Merges all SSoD blocks in a policy into the first block.
	 * Removes empty blocks
	 */
	private def mergeSSoDBlocks(Policy policy) {
		var blocks = policy.ssod
		val ssodBlock = blocks.get(0)
		blocks.forEach[block | ssodBlock.ssod.addAll(block.ssod)]
		for (var i = 1; i < blocks.size(); i++) {
			policy.policyElements.remove(blocks.get(i))
		}
	}
	
	/**
	 * Assigns a role to all the users in the list.
	 * Does not create a duplicate assignment for users to which the role
	 * is already assigned
	 */
	private def assignRole(List<User> users, Role role) {
		for (user:users) {
			if (!user.roles.contains(role))
				user.roles.add(role)
		}
	}
}
