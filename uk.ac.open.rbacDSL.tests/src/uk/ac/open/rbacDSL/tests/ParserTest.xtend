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
}