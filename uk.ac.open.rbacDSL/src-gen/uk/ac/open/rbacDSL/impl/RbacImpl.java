/**
 */
package uk.ac.open.rbacDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.rbacDSL.Policy;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Scenarios;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rbac</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RbacImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RbacImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RbacImpl extends MinimalEObjectImpl.Container implements Rbac
{
  /**
   * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicy()
   * @generated
   * @ordered
   */
  protected Policy policy;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected Scenarios scenarios;

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
  public Policy getPolicy()
  {
    return policy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPolicy(Policy newPolicy, NotificationChain msgs)
  {
    Policy oldPolicy = policy;
    policy = newPolicy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RbacDSLPackage.RBAC__POLICY, oldPolicy, newPolicy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPolicy(Policy newPolicy)
  {
    if (newPolicy != policy)
    {
      NotificationChain msgs = null;
      if (policy != null)
        msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RbacDSLPackage.RBAC__POLICY, null, msgs);
      if (newPolicy != null)
        msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RbacDSLPackage.RBAC__POLICY, null, msgs);
      msgs = basicSetPolicy(newPolicy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.RBAC__POLICY, newPolicy, newPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenarios getScenarios()
  {
    return scenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScenarios(Scenarios newScenarios, NotificationChain msgs)
  {
    Scenarios oldScenarios = scenarios;
    scenarios = newScenarios;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RbacDSLPackage.RBAC__SCENARIOS, oldScenarios, newScenarios);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScenarios(Scenarios newScenarios)
  {
    if (newScenarios != scenarios)
    {
      NotificationChain msgs = null;
      if (scenarios != null)
        msgs = ((InternalEObject)scenarios).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RbacDSLPackage.RBAC__SCENARIOS, null, msgs);
      if (newScenarios != null)
        msgs = ((InternalEObject)newScenarios).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RbacDSLPackage.RBAC__SCENARIOS, null, msgs);
      msgs = basicSetScenarios(newScenarios, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.RBAC__SCENARIOS, newScenarios, newScenarios));
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
      case RbacDSLPackage.RBAC__POLICY:
        return basicSetPolicy(null, msgs);
      case RbacDSLPackage.RBAC__SCENARIOS:
        return basicSetScenarios(null, msgs);
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
      case RbacDSLPackage.RBAC__POLICY:
        return getPolicy();
      case RbacDSLPackage.RBAC__SCENARIOS:
        return getScenarios();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RbacDSLPackage.RBAC__POLICY:
        setPolicy((Policy)newValue);
        return;
      case RbacDSLPackage.RBAC__SCENARIOS:
        setScenarios((Scenarios)newValue);
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
      case RbacDSLPackage.RBAC__POLICY:
        setPolicy((Policy)null);
        return;
      case RbacDSLPackage.RBAC__SCENARIOS:
        setScenarios((Scenarios)null);
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
      case RbacDSLPackage.RBAC__POLICY:
        return policy != null;
      case RbacDSLPackage.RBAC__SCENARIOS:
        return scenarios != null;
    }
    return super.eIsSet(featureID);
  }

} //RbacImpl
