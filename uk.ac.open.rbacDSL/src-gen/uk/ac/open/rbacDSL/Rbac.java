/**
 */
package uk.ac.open.rbacDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rbac</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.Rbac#getPolicyElements <em>Policy Elements</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.Rbac#getScenarioElements <em>Scenario Elements</em>}</li>
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
   * Returns the value of the '<em><b>Policy Elements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.PolicyElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policy Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy Elements</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRbac_PolicyElements()
   * @model containment="true"
   * @generated
   */
  EList<PolicyElement> getPolicyElements();

  /**
   * Returns the value of the '<em><b>Scenario Elements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.rbacDSL.ScenarioElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario Elements</em>' containment reference list.
   * @see uk.ac.open.rbacDSL.RbacDSLPackage#getRbac_ScenarioElements()
   * @model containment="true"
   * @generated
   */
  EList<ScenarioElement> getScenarioElements();

} // Rbac
