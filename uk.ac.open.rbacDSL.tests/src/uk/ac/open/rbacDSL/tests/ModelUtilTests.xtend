package uk.ac.open.rbacDSL.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.open.RbacDSLInjectorProvider
import uk.ac.open.rbacDSL.Rbac
import uk.ac.open.rbacDSL.Role

import static extension uk.ac.open.util.RbacDSLModelUtil.*
import uk.ac.open.rbacDSL.User
import uk.ac.open.rbacDSL.Operation

@InjectWith(RbacDSLInjectorProvider)
@RunWith(XtextRunner)

class ModelUtilTests {
	@Inject extension ParseHelper<Rbac> parser
	@Inject extension ValidationTestHelper
	
	@Test
	def void testAncestorsNone() {
		'''
		policy MyPolicy {
			role Role1 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(true, (policies.head.policyElements.head as Role).ancestors().isEmpty())
		]
	}
	
	@Test
	def void testOneParent() {
		'''
		policy MyPolicy {
			role Role1 extends Role2 {}
			role Role2 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(1, (policies.head.policyElements.head as Role).ancestors().size())
		]
	}
	
	@Test
	def void testMultipleParents() {
		'''
		policy MyPolicy {
			role Role1 extends Role2 Role3 Role4 {}
			role Role2 {}
			role Role3 {}
			role Role4 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(3, (policies.head.policyElements.head as Role).ancestors().size())
		]
	}
	
	@Test
	def void testOneGrandParent() {
		'''
		policy MyPolicy {
			role Role1 extends Role2 {}
			role Role2 extends Role3 {}
			role Role3 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(2, (policies.head.policyElements.head as Role).ancestors().size())
		]
	}
	
	@Test
	def void testMultipleGrandParents() {
		'''
		policy MyPolicy {
			role Role1 extends Role2 Role3 {}
			role Role2 extends Role4 Role5 {}
			role Role3 extends Role6 Role7 {}
			role Role4 {}
			role Role5 {}
			role Role6 {}
			role Role7 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(6, (policies.head.policyElements.head as Role).ancestors().size())
		]
	}
	
	@Test
	def void testAncestorsDuplicates() {
		'''
		policy MyPolicy {
			role Role1 extends Role2 Role3 {}
			role Role2 extends Role4 {}
			role Role3 extends Role4 {}
			role Role4 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(3, (policies.head.policyElements.head as Role).ancestors().size())
		]
	}
	
	
	@Test
	def void testAllRoles() {
		'''
		policy MyPolicy {
			user User1 {
				Role1 Role2
			}
			role Role1 extends Role3 Role4 {}
			role Role2 {}
			role Role3 extends Role5 {}
			role Role4 {}
			role Role5 {}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(5, (policies.head.policyElements.head as User).allRoles.size)
		]
	}
	
	@Test
	def void testProvidingOneRole() {
		'''
		policy MyPolicy {
			user User1 {}
			role Role1 {Obj1.read}
			object Obj1 {read}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(1, (policies.head.policyElements.filter[obj | obj instanceof uk.ac.open.rbacDSL.Object].head as uk.ac.open.rbacDSL.Object).operations.head.providingRoles.size())
		]
	}
	
	@Test
	def void testProvidingMultRoles() {
		'''
		policy MyPolicy {
			user User1 {}
			role Role1 {Obj1.read}
			role Role2 {Obj1.read}
			role Role3 {}
			role Role4 {Obj1.read}
			object Obj1 {read}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(3, (policies.head.policyElements.filter[obj | obj instanceof uk.ac.open.rbacDSL.Object].head as uk.ac.open.rbacDSL.Object).operations.head.providingRoles.size())
		]
	}
	
	@Test
	def void testProvidingNoRole() {
		'''
		policy MyPolicy {
			user User1 {}
			role Role1 {}
			object Obj1 {read}
		}
		'''.parse => [
			assertNoErrors
			Assert::assertEquals(0, (policies.head.policyElements.filter[obj | obj instanceof uk.ac.open.rbacDSL.Object].head as uk.ac.open.rbacDSL.Object).operations.head.providingRoles.size())
		]
	}
}