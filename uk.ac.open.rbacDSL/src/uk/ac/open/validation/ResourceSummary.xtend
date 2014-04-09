package uk.ac.open.validation

import java.util.List
import uk.ac.open.rbacDSL.Permission

class ResourceSummary {
	var name = null
	List<String> permissions = null
	
	new(String name, List<Permission> permissions) {
		this.name = name
		for (Permission permission:permissions) {
			this.permissions.add(permission.name)
		}
	}
	
	def getName() {
		return name
	}
	
	def isEmpty() {
		return permissions.isEmpty()
	}
	
	def removePermission(Permission permission) {
		permissions.remove(permission.name)
	}
}