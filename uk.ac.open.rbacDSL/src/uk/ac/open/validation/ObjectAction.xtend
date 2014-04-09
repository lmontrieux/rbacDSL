package uk.ac.open.validation

class ObjectAction {
	var object = null
	var action = null
	
	new(String object, String action) {
		this.object = object
		this.action = action
	}
	
	def getObject() {
		return object
	}
	
	def getAction() {
		return action
	}
	
	override public boolean equals(Object comp) {
		if (!(comp instanceof ObjectAction))
			return false
		var objAction = comp as ObjectAction
		if ((objAction.object == object) && (objAction.action == action)) 
			return true
		return false
	}
}