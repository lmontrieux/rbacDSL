/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Assignment#getObject <em>Object</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Assignment#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(RBACObject)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getAssignment_Object()
   * @model
   * @generated
   */
  RBACObject getObject();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.Assignment#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(RBACObject value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getAssignment_Actions()
   * @model
   * @generated
   */
  EList<Permission> getActions();

} // Assignment
