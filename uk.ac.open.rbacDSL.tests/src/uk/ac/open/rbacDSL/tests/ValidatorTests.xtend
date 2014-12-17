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
	def void testUnassignedRole() {
		'''
		policy MyPolicy {
			user User1 {}
			role Role1 {}
			operations {Obj1.read}
		}
		constraints MyConstraints {
			granted Granted1 {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
		}'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.policyConstraint,
			RbacDSLValidator::UNASSIGNED_ROLE,
			"Role not assigned to user 'User1'"
		)
	}
	
	@Test
	def void testEmptyPolicy() {
		'''
		policy MyPolicy{}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.policy,
			RbacDSLValidator::EMPTY_POLICY,
			"Empty policy"
		)
	}
	
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
	def void testRoleNoOperationsWarning() {
		'''
		policy MyPolicy {
			role Role1{}
		}
		'''.parse.assertWarning(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::EMPTY_ROLE,
			"Role has no operations assigned on any object"
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
			RbacDSLValidator::MULTIPLE_SSOD_BLOCKS,
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
			RbacDSLValidator::MULTIPLE_DSOD_BLOCKS,
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
			RbacDSLValidator::SOD_WITH_SELF,
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
			RbacDSLValidator::SOD_WITH_SELF,
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
			RbacDSLValidator::SOD_CONFLICT,
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
			RbacDSLValidator::SOD_CONFLICT,
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
			RbacDSLValidator::DUPLICATE_ROLE_EXTENSION,
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
			RbacDSLValidator::DUPLICATE_ROLE_EXTENSION,
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
			RbacDSLValidator::ROLE_EXTENDING_ITSELF,
			"Role extending itself"
		)
	}
	
	@Test
	def void testNoRoleExtendingItselfMultiple() {
		'''
		policy MyPolicy {
			role Role0
			role MyRole
			role Role1 extends Role0 Role1 MyRole {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.role,
			RbacDSLValidator::ROLE_EXTENDING_ITSELF,
			"Role extending itself"
		)
	}
	
	@Test
	def void testNoDoubleUserRoleAssignment() {
		'''
		policy MyPolicy {
			user User1 {Role1 Role1}
			role Role1 {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.user,
			RbacDSLValidator::DUPLICATE_ROLE_ASSIGNMENT,
			"Duplicate role assignment"
		)
	}
	
	@Test
	def void testNoDoubleUserRoleAssignment2() {
		'''
		policy MyPolicy {
			user User1 {Role1 Role2 Role1}
			role Role1 {}
			role Role2 {}
		}
		'''.parse.assertError(
			RbacDSLPackage::eINSTANCE.user,
			RbacDSLValidator::DUPLICATE_ROLE_ASSIGNMENT,
			"Duplicate role assignment"
		)
	}
}