/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.open.rbacDSL.RbacDSLPackage
 * @generated
 */
public interface RbacDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RbacDSLFactory eINSTANCE = uk.ac.open.rbacDSL.impl.RbacDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rbac</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rbac</em>'.
   * @generated
   */
  Rbac createRbac();

  /**
   * Returns a new object of class '<em>Policy Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Policy Element</em>'.
   * @generated
   */
  PolicyElement createPolicyElement();

  /**
   * Returns a new object of class '<em>Scenario Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario Element</em>'.
   * @generated
   */
  ScenarioElement createScenarioElement();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Permission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permission</em>'.
   * @generated
   */
  Permission createPermission();

  /**
   * Returns a new object of class '<em>RBAC Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RBAC Object</em>'.
   * @generated
   */
  RBACObject createRBACObject();

  /**
   * Returns a new object of class '<em>Granted Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Granted Scenario</em>'.
   * @generated
   */
  GrantedScenario createGrantedScenario();

  /**
   * Returns a new object of class '<em>Forbidden Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forbidden Scenario</em>'.
   * @generated
   */
  ForbiddenScenario createForbiddenScenario();

  /**
   * Returns a new object of class '<em>User Role Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Role Scenario</em>'.
   * @generated
   */
  UserRoleScenario createUserRoleScenario();

  /**
   * Returns a new object of class '<em>Object Role Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Role Scenario</em>'.
   * @generated
   */
  ObjectRoleScenario createObjectRoleScenario();

  /**
   * Returns a new object of class '<em>Object Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Scenario</em>'.
   * @generated
   */
  ObjectScenario createObjectScenario();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RbacDSLPackage getRbacDSLPackage();

} //RbacDSLFactory
