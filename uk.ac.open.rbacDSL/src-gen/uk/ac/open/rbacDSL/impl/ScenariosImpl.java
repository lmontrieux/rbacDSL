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

import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.ResourceRoleScenario;
import uk.ac.open.rbacDSL.ResourceScenario;
import uk.ac.open.rbacDSL.Scenarios;
import uk.ac.open.rbacDSL.UserRoleScenario;
import uk.ac.open.rbacDSL.UserScenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenarios</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ScenariosImpl#getUserScenarios <em>User Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ScenariosImpl#getUserRoleScenarios <em>User Role Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ScenariosImpl#getResourceRoleScenarios <em>Resource Role Scenarios</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ScenariosImpl#getRoleScenarios <em>Role Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenariosImpl extends MinimalEObjectImpl.Container implements Scenarios
{
  /**
   * The cached value of the '{@link #getUserScenarios() <em>User Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserScenarios()
   * @generated
   * @ordered
   */
  protected EList<UserScenario> userScenarios;

  /**
   * The cached value of the '{@link #getUserRoleScenarios() <em>User Role Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserRoleScenarios()
   * @generated
   * @ordered
   */
  protected EList<UserRoleScenario> userRoleScenarios;

  /**
   * The cached value of the '{@link #getResourceRoleScenarios() <em>Resource Role Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceRoleScenarios()
   * @generated
   * @ordered
   */
  protected EList<ResourceRoleScenario> resourceRoleScenarios;

  /**
   * The cached value of the '{@link #getRoleScenarios() <em>Role Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoleScenarios()
   * @generated
   * @ordered
   */
  protected EList<ResourceScenario> roleScenarios;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenariosImpl()
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
    return RbacDSLPackage.Literals.SCENARIOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UserScenario> getUserScenarios()
  {
    if (userScenarios == null)
    {
      userScenarios = new EObjectContainmentEList<UserScenario>(UserScenario.class, this, RbacDSLPackage.SCENARIOS__USER_SCENARIOS);
    }
    return userScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UserRoleScenario> getUserRoleScenarios()
  {
    if (userRoleScenarios == null)
    {
      userRoleScenarios = new EObjectContainmentEList<UserRoleScenario>(UserRoleScenario.class, this, RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS);
    }
    return userRoleScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceRoleScenario> getResourceRoleScenarios()
  {
    if (resourceRoleScenarios == null)
    {
      resourceRoleScenarios = new EObjectContainmentEList<ResourceRoleScenario>(ResourceRoleScenario.class, this, RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS);
    }
    return resourceRoleScenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResourceScenario> getRoleScenarios()
  {
    if (roleScenarios == null)
    {
      roleScenarios = new EObjectContainmentEList<ResourceScenario>(ResourceScenario.class, this, RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS);
    }
    return roleScenarios;
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
      case RbacDSLPackage.SCENARIOS__USER_SCENARIOS:
        return ((InternalEList<?>)getUserScenarios()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS:
        return ((InternalEList<?>)getUserRoleScenarios()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS:
        return ((InternalEList<?>)getResourceRoleScenarios()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS:
        return ((InternalEList<?>)getRoleScenarios()).basicRemove(otherEnd, msgs);
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
      case RbacDSLPackage.SCENARIOS__USER_SCENARIOS:
        return getUserScenarios();
      case RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS:
        return getUserRoleScenarios();
      case RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS:
        return getResourceRoleScenarios();
      case RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS:
        return getRoleScenarios();
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
      case RbacDSLPackage.SCENARIOS__USER_SCENARIOS:
        getUserScenarios().clear();
        getUserScenarios().addAll((Collection<? extends UserScenario>)newValue);
        return;
      case RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS:
        getUserRoleScenarios().clear();
        getUserRoleScenarios().addAll((Collection<? extends UserRoleScenario>)newValue);
        return;
      case RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS:
        getResourceRoleScenarios().clear();
        getResourceRoleScenarios().addAll((Collection<? extends ResourceRoleScenario>)newValue);
        return;
      case RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS:
        getRoleScenarios().clear();
        getRoleScenarios().addAll((Collection<? extends ResourceScenario>)newValue);
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
      case RbacDSLPackage.SCENARIOS__USER_SCENARIOS:
        getUserScenarios().clear();
        return;
      case RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS:
        getUserRoleScenarios().clear();
        return;
      case RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS:
        getResourceRoleScenarios().clear();
        return;
      case RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS:
        getRoleScenarios().clear();
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
      case RbacDSLPackage.SCENARIOS__USER_SCENARIOS:
        return userScenarios != null && !userScenarios.isEmpty();
      case RbacDSLPackage.SCENARIOS__USER_ROLE_SCENARIOS:
        return userRoleScenarios != null && !userRoleScenarios.isEmpty();
      case RbacDSLPackage.SCENARIOS__RESOURCE_ROLE_SCENARIOS:
        return resourceRoleScenarios != null && !resourceRoleScenarios.isEmpty();
      case RbacDSLPackage.SCENARIOS__ROLE_SCENARIOS:
        return roleScenarios != null && !roleScenarios.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScenariosImpl
