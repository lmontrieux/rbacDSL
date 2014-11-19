package uk.ac.open.rbacDSL.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.open.RbacDSLInjectorProvider
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import uk.ac.open.rbacDSL.Rbac

@InjectWith(RbacDSLInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject extension ParseHelper<Rbac> parser
	@Inject extension ValidationTestHelper
	
	@Test
	def void parseEmptyPolicy() {
		'''
			policy {
			}
			scenarios {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneUser() {
		'''
			policy {
				user User1 {}
			}
			scenarios {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneRole() {
		'''
			policy {
				role Role1 {}
			}
			scenarios {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneAction() {
		'''
			policy {
				action Perm1
			}
			scenarios {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneObject() {
		'''
			policy {
				object Obj1 {}
			}
			scenarios {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneGrantedScenario() {
		'''
			policy {
				user User1 {}
				object Obj1 {}
			}
			scenarios {
				grantedScenario Granted {
					user User1
					object Obj1
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneForbiddenScenario() {
		'''
			policy {
				user User1 {}
				object Obj1 {}
			}
			scenarios {
				forbiddenScenario Forbidden {
					user User1
					object Obj1
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneUserRoleScenario() {
		'''
			policy {
				role Role1 {}
			}
			scenarios {
				userRoleScenario UserRole {
					role Role1
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneObjectRoleScenario() {
		'''
			policy {
				role Role1 {}
				object Obj1 {}
				action read
			}
			scenarios {
				objectRoleScenario ObjectRole {
					role Role1
					object Obj1[read]
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parsePolicyOneObjectScenario() {
		'''
			policy {
				object Obj1 {action read}
				action read
			}
			scenarios {
				userRoleScenario ObjectScenario {
					object Obj1[read]
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserRolePermWithRefs() {
		'''
			policy {
				user User1 {
					role Role1
				}
				role Role1 {
					object Obj1[read]
				}
				action read
				object Obj1 {
					action read
				}
			}
			scenarios {
				
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserMultipleRoles() {
		'''
			policy {
				user User1 {
					role Role1
					role Role2
				}
				role Role1 {}
				role Role2 {}
			} scenarios {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjects() {
		'''
			policy {
				role Role1 {
					object Obj1 [read]
					object Obj2 [read]
				}
				action read
				object Obj1 {
					action read
				}
				object Obj2 {
					action read
				}
			} scenarios {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleActions() {
		'''
			policy {
				role Role1 {
					object Obj1 [read write]
				}
				action read
				action write
				object Obj1 {
					action read
					action write
				}
			}
			scenarios {}
		'''.parse.assertNoErrors
	}
}