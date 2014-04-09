package uk.ac.open.validation

import java.util.List
import uk.ac.open.rbacDSL.Role
import uk.ac.open.rbacDSL.Assignment
import uk.ac.open.rbacDSL.Permission

class ObjectsActionsList {
	List<ObjectDescription> objects = newArrayList()
	
	new(List<Role> roles) {
		for (Role role:roles) {
			for (Assignment assignment:role.assignments) {
				var actions = newArrayList()
				for (Permission permission:assignment.actions) {
					actions.add(permission.name)
				}
				if (!hasObject(assignment.object.name)) {
					objects.add(new ObjectDescription(assignment.object.name, actions))
				} else {
					getObject(assignment.object.name).addActions(actions)
				}
			}
		}
	}
	
	def hasObject(String name) {
		for (ObjectDescription object:objects) {
			if (object.name == name)
				return true
		}
		return false
	}
	
	def ObjectDescription getObject(String name) {
		for (ObjectDescription object:objects) {
			if (object.name == name)
				return object
		}
		return null
	}
	
	def hasAction(String object, String action) {
		for (ObjectDescription description:objects) {
			if (description.name == object) {
				return description.hasAction(action)
			}
		}
		return false
	}
	
	def hasAllActions(String object, List<String> actions) {
		for (ObjectDescription description:objects) {
			if (description.name == object) {
				return description.hasAllActions(actions)
			}
		}
	}
}