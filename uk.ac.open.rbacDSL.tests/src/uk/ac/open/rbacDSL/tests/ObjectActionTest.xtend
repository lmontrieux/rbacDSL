package uk.ac.open.rbacDSL.tests

import org.junit.Assert
import org.junit.Test
import uk.ac.open.validation.ObjectAction

class ObjectActionTest {
	
	@Test
	def testObjectActionEquals() {
		var objAction = new ObjectAction("object", "action")
		var objAction2 = new ObjectAction("object", "action")
		if (!(objAction == objAction2))
			Assert::fail()
	}
	
	@Test
	def testObjectActionEqualsFailAction() {
		var objAction = new ObjectAction("object", "action1")
		var objAction2 = new ObjectAction("object", "action2")
		if (objAction == objAction2)
			Assert::fail()
	}
	
	@Test
	def testObjectActionEqualsFailObject() {
		var objAction = new ObjectAction("object1", "action")
		var objAction2 = new ObjectAction("object2", "action")
		if (objAction == objAction2)
			Assert::fail()
	}
	
	@Test
	def testObjectActionListNotContains() {
		var list = <ObjectAction>newArrayList
		list.add(new ObjectAction("object1", "action1"))
		list.add(new ObjectAction("object1", "action2"))
		list.add(new ObjectAction("object2", "action1"))
		list.add(new ObjectAction("object2", "action3"))
		
		if (list.contains(new ObjectAction("object3", "action1")))
			Assert::fail()
	}
	
	@Test
	def testObjectActionListContains() {
		var list = <ObjectAction>newArrayList
		list.add(new ObjectAction("object1", "action1"))
		list.add(new ObjectAction("object1", "action2"))
		list.add(new ObjectAction("object2", "action1"))
		list.add(new ObjectAction("object2", "action3"))
		
		if (!list.contains(new ObjectAction("object2", "action1")))
			Assert::fail()
	}
}