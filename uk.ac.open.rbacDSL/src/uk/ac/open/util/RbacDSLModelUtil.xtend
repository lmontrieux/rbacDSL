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
}