package uk.ac.open.validation

import java.util.List

class ObjectDescription {
	public var name = null
	List<String> actions = null
	
	new(String name, List<String> actions) {
		this.name = name
		this.actions = actions
	}
	
	def hasAction(String action) {
		for (String current:actions) {
			if (action == current)
				return true
		}
		return false
	}
	
	def hasAllActions(List<String> actions) {
		for (String action:actions) {
			if (!hasAction(action))
				return false
		}
		return true
	}
	
	def addActions(List<String> actions) {
		for (String action:actions) {
			if (!this.actions.contains(action))
				this.actions.add(action)
		}
	}
}