/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getParent <em>Parent</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getSsod <em>Ssod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getDsod <em>Dsod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Role#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject
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
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.Role#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Role)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Parent()
   * @model
   * @generated
   */
  Role getParent();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.Role#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Role value);

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
   * Returns the value of the '<em><b>Permissions</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRole_Permissions()
   * @model
   * @generated
   */
  EList<Permission> getPermissions();

} // Role
