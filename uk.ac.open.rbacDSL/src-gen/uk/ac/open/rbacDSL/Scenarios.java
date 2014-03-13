/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenarios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Scenarios#getUserScenarios <em>User Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Scenarios#getUserRoleScenarios <em>User Role Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Scenarios#getResourceRoleScenarios <em>Resource Role Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Scenarios#getRoleScenarios <em>Role Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getScenarios()
 * @model
 * @generated
 */
public interface Scenarios extends EObject
{
  /**
   * Returns the value of the '<em><b>User Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.UserScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Scenarios</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getScenarios_UserScenarios()
   * @model containment="true"
   * @generated
   */
  EList<UserScenario> getUserScenarios();

  /**
   * Returns the value of the '<em><b>User Role Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.UserRoleScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Role Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Role Scenarios</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getScenarios_UserRoleScenarios()
   * @model containment="true"
   * @generated
   */
  EList<UserRoleScenario> getUserRoleScenarios();

  /**
   * Returns the value of the '<em><b>Resource Role Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.ResourceRoleScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource Role Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource Role Scenarios</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getScenarios_ResourceRoleScenarios()
   * @model containment="true"
   * @generated
   */
  EList<ResourceRoleScenario> getResourceRoleScenarios();

  /**
   * Returns the value of the '<em><b>Role Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.ResourceScenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Scenarios</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getScenarios_RoleScenarios()
   * @model containment="true"
   * @generated
   */
  EList<ResourceScenario> getRoleScenarios();

} // Scenarios
