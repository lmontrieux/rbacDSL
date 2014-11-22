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

}