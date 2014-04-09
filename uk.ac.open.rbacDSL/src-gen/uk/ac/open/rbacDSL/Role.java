/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getParent <em>Parent</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getSsod <em>Ssod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getDsod <em>Dsod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends PolicyElement
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Parent()
   * @model
   * @generated
   */
  EList<Role> getParent();

  /**
   * Returns the value of the '<em><b>Ssod</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ssod</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ssod</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Ssod()
   * @model
   * @generated
   */
  EList<Role> getSsod();

  /**
   * Returns the value of the '<em><b>Dsod</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsod</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsod</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Dsod()
   * @model
   * @generated
   */
  EList<Role> getDsod();

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getAssignments();

} // Role
