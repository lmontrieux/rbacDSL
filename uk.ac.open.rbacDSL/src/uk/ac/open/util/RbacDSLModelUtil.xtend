package uk.ac.open.util

import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.Policy
import uk.ac.open.rbacDSL.SSoD
import uk.ac.open.rbacDSL.DSoD
import uk.ac.open.rbacDSL.TupleRole
import uk.ac.open.rbacDSL.User
import uk.ac.open.rbacDSL.Constraints
import uk.ac.open.rbacDSL.GrantedConstraint
import uk.ac.open.rbacDSL.ForbiddenConstraint
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.xtext.EcoreUtil2.*
import uk.ac.open.rbacDSL.Rbac
import uk.ac.open.rbacDSL.PolicyConstraint
import uk.ac.open.rbacDSL.SoD
import java.util.Set
import java.util.List
import uk.ac.open.rbacDSL.Operation
import uk.ac.open.rbacDSL.UserConstraint

class RbacDSLModelUtil {
	
	def static users(Policy policy) {
		policy.policyElements.filter(typeof(User))
	}
	
	def static roles(Policy policy) {
		policy.policyElements.filter(typeof(Role))
	}
	
	def static ssod(Policy policy) {
		policy.policyElements.filter(typeof(SSoD))
	}
	
	def static dsod(Policy policy) {
		policy.policyElements.filter(typeof(DSoD))
	}
	
	def static policy(TupleRole tuple) {
		tuple.eContainer.eContainer as Policy
	}
	
	def static granted(Constraints constraints) {
		constraints.constraints.filter(typeof(GrantedConstraint))
	}
	
	def static forbidden(Constraints constraints) {
		constraints.constraints.filter(typeof(ForbiddenConstraint))
	}
	
	def static containingModel(EObject e) {
		e.getContainerOfType(typeof(Rbac))
	}
	
	def static containingPolicy(EObject e) {
		e.getContainerOfType(typeof(Policy))
	}
	
	def static containingConstraintSet(EObject e) {
		e.getContainerOfType(typeof(Constraints))
	}
	
	def static containingRbacModel(EObject e) {
		e.getContainerOfType(typeof(Rbac))
	}
	
	def static containingUser(EObject e) {
		e.getContainerOfType(typeof(User))
	}
	
	def static containingRole(EObject e) {
		e.getContainerOfType(typeof(Role))
	}
	
	def static containingConstraint(EObject e) {
		e.getContainerOfType(typeof(PolicyConstraint))
	}
	
	def static containingSoDSet(EObject e) {
		e.getContainerOfType(typeof(SoD))
	}
	
	def static containingSSoDSet(EObject e) {
		e.getContainerOfType(typeof(SSoD))
	}
	
	def static containingDSoDSet(EObject e) {
		e.getContainerOfType(typeof(DSoD))
	}
	
	def static containingObject(EObject e) {
		e.getContainerOfType(typeof(uk.ac.open.rbacDSL.Object))
	}
	
	def static allRoles(User user) {
		user.roles + user.roles.ancestors
	}
	
	def static allRoles(UserConstraint const) {
		const.roles + const.roles.ancestors
	}
	
	/**
	 * Takes a role and returns a list of DSoD roles
	 */
	def static dsodWith(Role r) {
		val dsods = r.containingPolicy().dsod
		var tuples = newArrayList
		for (dsod:dsods) {
			tuples.addAll(dsod.dsod)
		}
		var conflicts = newArrayList
		for (tuple:tuples) {
			if (involves(tuple, r) != null)
				conflicts.add(involves(tuple, r))
		}
		return conflicts
	}
	
	def static involves(TupleRole tuple, Role r) {
		if (tuple.fst == r)
			return tuple.snd
		else if (tuple.snd == r)
			return tuple.fst
		else
			return null
	}
	
	def static ssodWith(Role r) {
		val ssods = r.containingPolicy().ssod
		var tuples = newArrayList
		for (ssod:ssods) {
			tuples.addAll(ssod.ssod)
		}
		var conflicts = newArrayList
		for(tuple:tuples) {
			if (involves(tuple, r) != null)
				conflicts.add(involves(tuple, r))
		}
		return conflicts
	}
	
	def static ancestors(Role r) {
		var visited = newHashSet
		for (parent:r.parents) {
			visited.add(parent)
			visited.addAll(ancestors(parent, visited))
		}
		return visited
	}
	
	def static ancestors(List<Role> roles) {
		var ancestors = newHashSet
		for (role:roles) {
			ancestors.addAll(ancestors(role))
		}
		return ancestors
	}
	
	/**
	 * Assigns a role to a user.
	 * If the role is already assigned, returns false
	 */
	def static assignRole(User user, Role role) {
		user.roles.add(role)
	}
	
	/**
	 * Finds a user object referenced in a constraint, using its name
	 * Returns null if there's no user with said name
	 * Returns a list of users if several users exist with the same name
	 */
	def static user(UserConstraint constraint, String userName) {
		return constraint.users.filter[user | user.name.equals(userName)]
	}
	
	/**
	 * Finds a role object referenced in a constraint, using its name
	 * Returns an empty list if there's no role with said name
	 * Returns a list of roles if several roles exist with the same name
	 */
	def static role(UserConstraint constraint, String roleName) {
		return constraint.roles.filter[role | role.name.equals(roleName)]
	}
	
	/**
	 * Returns a list of all the roles providing a particular operation
	 * This does not consider role hierarchies
	 */
	def static providingRoles(Operation operation) {
		operation.containingPolicy.roles.filter[role | role.permissions.contains(operation)]
	}
	
	/**
	 * Finds an SSoD tuple in a policy that matches a string representation
	 * Returns only one match, even if there exist several
	 */
	def static ssodTuple(Policy policy, String tupleStr) {
		for (SSoD block:policy.ssod) {
			var tuple = block.findTuple(tupleStr)
			if (tuple != null)
				return tuple
		}
		return null
	}
	
	/**
	 * Finds a DSoD tuple in a policy that matches a string representation
	 * Returns only one match, even if there exist several
	 */
	def static dsodTuple(Policy policy, String tupleStr) {
		for (DSoD block:policy.dsod) {
			var tuple = block.findTuple(tupleStr)
			if (tuple != null)
				return tuple
		}
		return null
	}
	
	private def static findTuple(SSoD block, String tupleStr) {
		for (TupleRole tuple:block.ssod) {
			if (tuple.toString.equals(tupleStr))
				return tuple
		}
		return null
	}
	
	private def static findTuple(DSoD block, String tupleStr) {
		for (TupleRole tuple:block.dsod) {
			if (tuple.toString.equals(tupleStr))
				return tuple
		}
		return null
	}
	
	private def static ancestors(Role r, Set<Role> visited) {
		for (parent:r.parents) {
			if (!visited.contains(parent)) {
				visited.add(parent)
				ancestors(parent, visited)
			}
		}
		return visited
	}
}