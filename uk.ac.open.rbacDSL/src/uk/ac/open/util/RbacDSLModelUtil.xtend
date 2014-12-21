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
	
	def static containingContsraint(EObject e) {
		e.getContainerOfType(typeof(PolicyConstraint))
	}
	
	def static containingSoDSet(EObject e) {
		e.getContainerOfType(typeof(SoD))
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
}