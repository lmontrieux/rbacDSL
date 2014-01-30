/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rbac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Rbac#getPolicy <em>Policy</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Rbac#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRbac()
 * @model
 * @generated
 */
public interface Rbac extends EObject
{
  /**
   * Returns the value of the '<em><b>Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy</em>' containment reference.
   * @see #setPolicy(Policy)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRbac_Policy()
   * @model containment="true"
   * @generated
   */
  Policy getPolicy();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.Rbac#getPolicy <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy</em>' containment reference.
   * @see #getPolicy()
   * @generated
   */
  void setPolicy(Policy value);

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference.
   * @see #setScenarios(Scenarios)
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRbac_Scenarios()
   * @model containment="true"
   * @generated
   */
  Scenarios getScenarios();

  /**
   * Sets the value of the '{@link uk.ac.open.rbacDSL.Rbac#getScenarios <em>Scenarios</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenarios</em>' containment reference.
   * @see #getScenarios()
   * @generated
   */
  void setScenarios(Scenarios value);

} // Rbac
