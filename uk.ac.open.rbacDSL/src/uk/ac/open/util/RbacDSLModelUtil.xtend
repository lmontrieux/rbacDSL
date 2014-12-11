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
	def static getPermissions(Role role) {
		role.permissions
	}
	
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
}