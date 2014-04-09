/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Role Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.UserRoleScenario#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getUserRoleScenario()
 * @model
 * @generated
 */
public interface UserRoleScenario extends ScenarioElement
{
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
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getUserRoleScenario_Roles()
   * @model
   * @generated
   */
  EList<Role> getRoles();

} // UserRoleScenario
