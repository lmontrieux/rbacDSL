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
					roles {Role1 Role2}
				}
				role Role1 {}
				role Role2 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithOneSSoD() {
		'''
			policy MyPolicy {
				role Role1 {
					ssod {Role2}
				}
				role Role2 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithOneDSoD() {
		'''
			policy MyPolicy {
				role Role1 {
					dsod {Role2}
				}
				role Role2 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleSSoD() {
		'''
			policy MyPolicy {
				role Role1 {
					ssod {Role2 Role3}
				}
				role Role2 {}
				role Role3 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleDSoD() {
		'''
			policy MyPolicy {
				role Role1 {
					dsod {Role2 Role3}
				}
				role Role2 {}
				role Role3 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleWithMultipleSoD() {
		'''
			policy MyPolicy {
				role Role1 {
					ssod {Role2 Role3}
					dsod {Role4 Role5}
				}
				role Role2 {}
				role Role3 {}
				role Role4 {}
				role Role5 {}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseObjectOneAction() {
		'''
			policy MyPolicy {
				object Obj11 {
					actions {read}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseObjectMultipleActions() {
		'''
			policy MyPolicy {
				object Obj11 {
					actions {read write}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleOneObjectOneAction() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read}}
				}
				object Obj11 {
					actions {read}
				}
			}
		'''.parse.assertNoErrors
	}

	@Test
	def void parseRoleOneObjectMultipleAction() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read write}}
				}
				object Obj11 {
					actions {read write}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsOneAction() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read} Obj2{read}}
				}
				object Obj11 {
					actions {read}
				}
				object Obj2 {
					actions {read}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsDifferentAction() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read} Obj2{write}}
				}
				object Obj11 {
					actions {read}
				}
				object Obj2 {
					actions {write}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsMultipleActions() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read write} Obj2{read write}}
				}
				object Obj11 {
					actions {read write}
				}
				object Obj2 {
					actions {read write}
				}
			}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void parseRoleMultipleObjectsDifferentActions() {
		'''
			policy MyPolicy {
				role Role1 {
					permissions {Obj11{read create} Obj2{read write}}
				}
				object Obj11 {
					actions {read create}
				}
				object Obj2 {
					actions {read write}
				}
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
			role Role1 {}
			role Role2 {
				permissions {
					Obj1{read}
				}
				ssod { Role1 }
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
			role Role2 {
				dsod {Role3 }
				permissions {
					Obj1{read}
				}
				ssod { Role1 }
			}
			object Obj1{read}
		}
		'''.parse.assertNoErrors
	}

}