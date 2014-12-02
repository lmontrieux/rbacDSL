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
	
	@Test
	def void testRoleNoActionsWarning() {
		'''
		policy MyPolicy {
			role Role1{}
		}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::ROLE_NO_ACTIONS,
			"Role has no actions assigned on any object"
		)
	}
	
	@Test
	def void testOnlyOneSSoDError() {
		'''
		policy MyPolicy {
			role Role1{}
			role Role2{}
			role Role3{}
			ssod{(Role1 Role2)}
			ssod{(Role2 Role3)}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.SSoD,
			RbacDSLValidator::ONLY_ONE_SSOD,
			"Several ssod blocks in the same policy"
		)
	}
	
	@Test
	def void testOnlyOneDSoDError() {
		'''
		policy MyPolicy {
			role Role1{}
			role Role2{}
			role Role3{}
			dsod{(Role1 Role2)}
			dsod{(Role2 Role3)}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.DSoD,
			RbacDSLValidator::ONLY_ONE_DSOD,
			"Several dsod blocks in the same policy"
		)
	}
	
	@Test
	def void testNoSSoDWithSelf() {
		'''
		policy MyPolicy {
			role Role1{}
			ssod{(Role1 Role1)}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.tupleRole,
			RbacDSLValidator::NO_SOD_WITH_SELF,
			"SoD constraint between an role and itself"
		)
	}
	
	@Test
	def void testNoDSoDWithSelf() {
		'''
		policy MyPolicy {
			role Role1{}
			dsod{(Role1 Role1)}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.tupleRole,
			RbacDSLValidator::NO_SOD_WITH_SELF,
			"SoD constraint between an role and itself"
		)
	}
	
	@Test
	def void testNoSoDConflicts() {
		'''
		policy MyPolicy {
			role Role1{}
			role Role2{}
			ssod{(Role1 Role2)}
			dsod{(Role1 Role2)}
		}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.tupleRole,
			RbacDSLValidator::NO_SOD_CONFLICT,
			"DSoD constraint unnecessary because of an identical SSoD constraint"
		)
	}
	
	@Test
	def void testNoSoDConflictsReversed() {
		'''
		policy MyPolicy {
			role Role1{}
			role Role2{}
			ssod{(Role1 Role2)}
			dsod{(Role2 Role1)}
		}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.tupleRole,
			RbacDSLValidator::NO_SOD_CONFLICT,
			"DSoD constraint unnecessary because of an identical SSoD constraint"
		)
	}
	
	@Test
	def void testNoDuplicateRoleExtension() {
		'''
		policy MyPolicy {
			role Role1 {}
			role Role2 extends Role1 Role1 {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::NO_DUPLICATE_ROLE_EXTENSION,
			"Duplicate role extension"
		)
	}
	
	@Test
	def void testNoDuplicateRoleExtensions2() {
		'''
		policy MyPolicy {
			role Role1 {}
			role Role2 {}
			role Role3 extends Role1 Role2 Role1 {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::NO_DUPLICATE_ROLE_EXTENSION,
			"Duplicate role extension"
		)
	}
	
	@Test
	def void testNoRoleExtendingItself() {
		'''
		policy MyPolicy {
			role Role1 extends Role1 {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::NO_ROLE_EXTENDING_ITSELF,
			"Role extending itself"
		)
	}
}