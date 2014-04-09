/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Granted Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.GrantedScenario#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.GrantedScenario#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.GrantedScenario#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getGrantedScenario()
 * @model
 * @generated
 */
public interface GrantedScenario extends ScenarioElement
{
  /**
   * Returns the value of the '<em><b>User</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User</em>' reference.
   * @see #setUser(User)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getGrantedScenario_User()
   * @model
   * @generated
   */
  User getUser();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.GrantedScenario#getUser <em>User</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User</em>' reference.
   * @see #getUser()
   * @generated
   */
  void setUser(User value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getGrantedScenario_Roles()
   * @model
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Object</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getGrantedScenario_Object()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getObject();

} // GrantedScenario
