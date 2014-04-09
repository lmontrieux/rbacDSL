/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBAC Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.RBACObject#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRBACObject()
 * @model
 * @generated
 */
public interface RBACObject extends PolicyElement
{
  /**
   * Returns the value of the '<em><b>Permissions</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRBACObject_Permissions()
   * @model
   * @generated
   */
  EList<Permission> getPermissions();

} // RBACObject
