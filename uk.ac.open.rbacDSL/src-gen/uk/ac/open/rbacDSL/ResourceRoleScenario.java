/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Role Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.ResourceRoleScenario#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.ResourceRoleScenario#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.ResourceRoleScenario#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getResourceRoleScenario()
 * @model
 * @generated
 */
public interface ResourceRoleScenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getResourceRoleScenario_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.ResourceRoleScenario#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getResourceRoleScenario_Role()
   * @model
   * @generated
   */
  EList<Role> getRole();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getResourceRoleScenario_Resources()
   * @model
   * @generated
   */
  EList<Resource> getResources();

} // ResourceRoleScenario
