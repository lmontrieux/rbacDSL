package uk.ac.open.util

import uk.ac.open.rbacDSL.Role

class RbacDSLModelUtil {
	def static getPermissions(Role role) {
		role.permissions
	}
}