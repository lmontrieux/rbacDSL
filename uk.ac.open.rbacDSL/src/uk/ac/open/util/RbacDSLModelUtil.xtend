package uk.ac.open.util

import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.Policy
import uk.ac.open.rbacDSL.SSoD
import uk.ac.open.rbacDSL.DSoD
import uk.ac.open.rbacDSL.TupleRole

class RbacDSLModelUtil {
	def static getPermissions(Role role) {
		role.permissions
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
}