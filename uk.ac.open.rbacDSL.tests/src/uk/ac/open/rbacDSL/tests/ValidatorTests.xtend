package uk.ac.open.rbacDSL.tests

import org.eclipse.xtext.junit4.InjectWith
import uk.ac.open.RbacDSLInjectorProvider
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import uk.ac.open.rbacDSL.Rbac
import org.junit.Test
import uk.ac.open.rbacDSL.RbacDSLPackage
import uk.ac.open.validation.RbacDSLValidator

@InjectWith(RbacDSLInjectorProvider)
@RunWith(XtextRunner)
class ValidatorTests {
	@Inject extension ParseHelper<Rbac> parser
	@Inject extension ValidationTestHelper
	
	@Test
	def void testEmptyUserWarning() {
		'''
		policy MyPolicy {
			user User1{}
		}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.user,
			RbacDSLValidator::EMPTY_USER,
			"User has no role assignment"
		)
	}
}