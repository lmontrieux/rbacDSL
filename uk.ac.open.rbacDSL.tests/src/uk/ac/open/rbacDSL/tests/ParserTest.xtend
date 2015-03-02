package uk.ac.open.rbacDSL.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.open.RbacDSLInjectorProvider
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import uk.ac.open.rbacDSL.Rbac
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Inject

@InjectWith(RbacDSLInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	
	@Inject extension ParseHelper<Rbac> parser
	@Inject extension ValidationTestHelper
	@Inject Provider<ResourceSet> resourceSetProvider;
	
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
				user User1 {Role1}
				role Role1 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserWithMultipleRefs() {
		'''
			policy MyPolicy {
				user User1 {Role1 Role2}
				role Role1 {}
				role Role2 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithOneSSoD() {
		'''
			policy MyPolicy {
				role Role1 {}
				role Role2 {}
				ssod {(Role1 Role2)}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithOneDSoD() {
		'''
			policy MyPolicy {
				role Role1 {}
				role Role2 {}
				dsod {(Role1 Role2)}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleSSoD() {
		'''
			policy MyPolicy {
				role Role1 {}
				role Role2 {}
				role Role3 {}
				ssod{(Role1 Role2) (Role1 Role3)}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleDSoD() {
		'''
			policy MyPolicy {
				role Role1 {}
				role Role2 {}
				role Role3 {}
				dsod{(Role1 Role3) (Role1 Role2)}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithMultipleSoD() {
		'''
			policy MyPolicy {
				role Role1 {}
				role Role2 {}
				role Role3 {}
				role Role4 {}
				role Role5 {}
				ssod{(Role1 Role2) (Role1 Role3)}
				dsod{(Role1 Role4) (Role1 Role5)}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseObjectOneOperation() {
		'''
			policy MyPolicy {
				object Obj11 {read}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseObjectMultipleOperations() {
		'''
			policy MyPolicy {
				object Obj11 {read write}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleOneObjectOneOperation() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read}
				object Obj11 {read}
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void parseRoleOneObjectMultipleOperation() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read Obj11.write}
				object Obj11 {read write
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsOneOperation() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read Obj2.read}
				object Obj11 {read}
				object Obj2 {read}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsDifferentOperation() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read Obj2.write}
				object Obj11 {read}
				object Obj2 {write}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsMultipleOperations() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read Obj11.write Obj2.read Obj2.write}
				object Obj11 {read write}
				object Obj2 {read write}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsDifferentOperations() {
		'''
			policy MyPolicy {
				role Role1 {Obj11.read Obj11.create Obj2.read Obj2.write}
				object Obj11 {read create}
				object Obj2 {read write}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseEmptyConstraints() {
		'''
			policy MyPolicy{}
			constraints MyConstraints{}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseEmptyConstraintsMultLists() {
		'''
			policy MyPolicy{}
			constraints MyConstraints{}
			constraints OtherConstraints{}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseMultiplePolicies() {
		'''
			policy Policy1 {}
			policy Policy2 {}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseMultiplePoliciesMultipleConstraints() {
		'''
			policy Policy1 {}
			policy Policy2 {}
			constraints Constraints1{}
			constraints Constraints2{}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseMultiplePoliciesNoNameClash() {
		'''
		policy Policy1 {
			user User1 {}
		}
		policy Policy2 {
			user User1 {}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseTwoEmptyFiles() {
		val resourceSet = resourceSetProvider.get
		val first = '''policy Policy1 {}'''.parse(resourceSet)
		val second = '''constraints Constraints1 {}'''.parse(resourceSet)
		first.assertNoErrors
		second.assertNoErrors
	}
	
	@Test
	def void parseRoleAssignmentsFirst() {
		'''
		policy Policy1 {
			ssod {(Role1 Role2)}
			role Role1 {}
			role Role2 {
					Obj1.read
			}
			object Obj1{read}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleAssignmentsMiddle() {
		'''
		policy Policy1 {
			role Role1 {}
			role Role3 {}
			ssod {(Role1 Role2)}
			dsod {(Role2 Role3)}
			role Role2 {
					Obj1.read
			}
			object Obj1{read}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleHierarchy() {
		'''
		policy MyPolicy {
			role Role1{}
			role Role2 extends Role1{}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleHierarchy() {
		'''
		policy MyPolicy {
			role Role1 {}
			role Role2 {}
			role Role3 extends Role1 Role2 {}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseGrantedConstraint() {
		'''
		policy MyPolicy {
			user User1{Role1}
			role Role1{Obj1.read}
			object Obj1{read}
		}
		constraints MyConstraints {
			granted MyGranted {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseGrantedConstraintMultUsers() {
		'''
		policy MyPolicy {
			user User1{Role1}
			user User2{Role1}
			role Role1{Obj1.read}
			object Obj1{read}
		}
		constraints MyConstraints {
			granted MyGranted {
				users {MyPolicy.User1 MyPolicy.User2}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseGrantedConstraintMultRoles() {
		'''
		policy MyPolicy {
			user User1{Role1 Role2}
			user User2{Role1 Role2}
			role Role1{Obj1.read}
			role Role2{}
			object Obj1{read}
		}
		constraints MyConstraints {
			granted MyGranted {
				users {MyPolicy.User1 MyPolicy.User2}
				roles {MyPolicy.Role1 MyPolicy.Role2}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseGrantedConstraintMultObjects() {
		'''
		policy MyPolicy {
			user User1{Role1}
			role Role1{Obj1.read Obj2.read}
			object Obj1{read}
			object Obj2{read}
		}
		constraints MyConstraints {
			granted MyGranted {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read MyPolicy.Obj2.read}
			}
		}
		'''.parse.assertNoErrors
	}

	@Test
	def void parseForbiddenConstraint() {
		'''
		policy MyPolicy {
			user User1{Role1}
			role Role1{}
			object Obj1{read}
		}
		constraints MyConstraints {
			forbidden MyForbidden {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseForbiddenConstraintMultUsers() {
		'''
		policy MyPolicy {
			user User1{Role1}
			user User2{Role1}
			role Role1{}
			object Obj1{read}
		}
		constraints MyConstraints {
			forbidden MyForbidden {
				users {MyPolicy.User1 MyPolicy.User2}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseForbiddenConstraintMultRoles() {
		'''
		policy MyPolicy {
			user User1{Role1 Role2}
			user User2{Role1 Role2}
			role Role1{}
			role Role2{}
			object Obj1{read}
		}
		constraints MyConstraints {
			forbidden MyForbidden {
				users {MyPolicy.User1 MyPolicy.User2}
				roles {MyPolicy.Role1 MyPolicy.Role2}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseForbiddenConstraintMultObjects() {
		'''
		policy MyPolicy {
			user User1{Role1}
			role Role1{}
			object Obj1{read}
			object Obj2{read}
		}
		constraints MyConstraints {
			forbidden MyForbidden {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read MyPolicy.Obj2.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseMultipleGrantedConstraints() {
		'''
		policy MyPolicy {
			user User1 {Role1}
			user User2 {Role1}
			role Role1 {Obj1.read}
			object Obj1{read}
		}
		constraints MyConstraints {
			granted Granted1 {
				users {MyPolicy.User1}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
			granted Granted2 {
				users {MyPolicy.User2}
				roles {MyPolicy.Role1}
				operations {MyPolicy.Obj1.read}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseUserRoleConstraint() {
		'''
		policy MyPolicy {
			user User1 {Role1}
			role Role1 {Obj1.read Obj1.write}
			object Obj1{read write}
		}
		constraints MyConstraints {
			role-operations RolePerm {
				role MyPolicy.Role1
				operations {MyPolicy.Obj1.read MyPolicy.Obj1.write}
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseOperationsConstraint() {
		'''
		policy MyPolicy {
			user User1 {Role1}
			role Role1 {Obj1.read Obj1.write}
			object Obj1{read write}
		}
		constraints MyConstraints {
			operations {MyPolicy.Obj1.read MyPolicy.Obj1.write}
		}
		'''.parse.assertNoErrors
	}
}