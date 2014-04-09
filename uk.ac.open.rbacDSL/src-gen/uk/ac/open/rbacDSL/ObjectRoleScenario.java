/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Role Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.ObjectRoleScenario#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.ObjectRoleScenario#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getObjectRoleScenario()
 * @model
 * @generated
 */
public interface ObjectRoleScenario extends ScenarioElement
{
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
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getObjectRoleScenario_Role()
   * @model
   * @generated
   */
  EList<Role> getRole();

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getObjectRoleScenario_Assignment()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getAssignment();

} // ObjectRoleScenario
