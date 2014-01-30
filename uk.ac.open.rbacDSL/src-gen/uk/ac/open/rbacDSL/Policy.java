/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Policy#getUsers <em>Users</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Policy#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Policy#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Policy#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject
{
  /**
   * Returns the value of the '<em><b>Users</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getPolicy_Users()
   * @model containment="true"
   * @generated
   */
  EList<User> getUsers();

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getPolicy_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getPolicy_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<Permission> getPermissions();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Resource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getPolicy_Resources()
   * @model containment="true"
   * @generated
   */
  EList<Resource> getResources();

} // Policy
