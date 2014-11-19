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
			policy MyPolicy {
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseOneUser() {
		'''
			policy MyPolicy {
				user User1 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseOneRole() {
		'''
			policy MyPolicy {
				role Role1 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseOneObject() {
		'''
			policy MyPolicy {
				object Obj1 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUsersRolesObjectsNoOrder() {
		'''
			policy MyPolicy {
				role Role1 {}
				user User1 {}
				object Obj1 {}
				role Role2 {}
				role Role3 {}
				user User3{}
				object Obj3 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserWithOneRef() {
		'''
			policy MyPolicy {
				user User1 {
					roles {Role1}
				}
				role Role1 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserWithMultipleRefs() {
		'''
			policy MyPolicy {
				user User1 {
					roles {Role1,Role2}
				}
				role Role1 {}
				role Role2 {}
			}
		'''.parse.assertNoErrors
	}

}