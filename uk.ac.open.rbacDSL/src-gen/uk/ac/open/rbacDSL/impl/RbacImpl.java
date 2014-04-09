/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.rbacDSL.PolicyElement;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.ScenarioElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rbac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RbacImpl#getPolicyElements <em>Policy Elements</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RbacImpl#getScenarioElements <em>Scenario Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RbacImpl extends MinimalEObjectImpl.Container implements Rbac
{
  /**
   * The cached value of the '{@link #getPolicyElements() <em>Policy Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyElements()
   * @generated
   * @ordered
   */
  protected EList<PolicyElement> policyElements;

  /**
   * The cached value of the '{@link #getScenarioElements() <em>Scenario Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioElements()
   * @generated
   * @ordered
   */
  protected EList<ScenarioElement> scenarioElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RbacImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RbacDSLPackage.Literals.RBAC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PolicyElement> getPolicyElements()
  {
    if (policyElements == null)
    {
      policyElements = new EObjectContainmentEList<PolicyElement>(PolicyElement.class, this, RbacDSLPackage.RBAC__POLICY_ELEMENTS);
    }
    return policyElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScenarioElement> getScenarioElements()
  {
    if (scenarioElements == null)
    {
      scenarioElements = new EObjectContainmentEList<ScenarioElement>(ScenarioElement.class, this, RbacDSLPackage.RBAC__SCENARIO_ELEMENTS);
    }
    return scenarioElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY_ELEMENTS:
        return ((InternalEList<?>)getPolicyElements()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.RBAC__SCENARIO_ELEMENTS:
        return ((InternalEList<?>)getScenarioElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY_ELEMENTS:
        return getPolicyElements();
      case RbacDSLPackage.RBAC__SCENARIO_ELEMENTS:
        return getScenarioElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY_ELEMENTS:
        getPolicyElements().clear();
        getPolicyElements().addAll((Collection<? extends PolicyElement>)newValue);
        return;
      case RbacDSLPackage.RBAC__SCENARIO_ELEMENTS:
        getScenarioElements().clear();
        getScenarioElements().addAll((Collection<? extends ScenarioElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY_ELEMENTS:
        getPolicyElements().clear();
        return;
      case RbacDSLPackage.RBAC__SCENARIO_ELEMENTS:
        getScenarioElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY_ELEMENTS:
        return policyElements != null && !policyElements.isEmpty();
      case RbacDSLPackage.RBAC__SCENARIO_ELEMENTS:
        return scenarioElements != null && !scenarioElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RbacImpl
