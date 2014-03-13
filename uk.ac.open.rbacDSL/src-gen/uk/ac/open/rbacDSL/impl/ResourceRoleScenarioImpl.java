/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Resource;
import uk.ac.open.rbacDSL.ResourceRoleScenario;
import uk.ac.open.rbacDSL.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Role Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ResourceRoleScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ResourceRoleScenarioImpl#getRole <em>Role</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ResourceRoleScenarioImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceRoleScenarioImpl extends MinimalEObjectImpl.Container implements ResourceRoleScenario
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected EList<Role> role;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<Resource> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceRoleScenarioImpl()
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
    return RbacDSLPackage.Literals.RESOURCE_ROLE_SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.RESOURCE_ROLE_SCENARIO__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRole()
  {
    if (role == null)
    {
      role = new EObjectResolvingEList<Role>(Role.class, this, RbacDSLPackage.RESOURCE_ROLE_SCENARIO__ROLE);
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Resource> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectResolvingEList<Resource>(Resource.class, this, RbacDSLPackage.RESOURCE_ROLE_SCENARIO__RESOURCES);
    }
    return resources;
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
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__NAME:
        return getName();
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__ROLE:
        return getRole();
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__RESOURCES:
        return getResources();
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
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__NAME:
        setName((String)newValue);
        return;
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__ROLE:
        getRole().clear();
        getRole().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends Resource>)newValue);
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
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__ROLE:
        getRole().clear();
        return;
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__RESOURCES:
        getResources().clear();
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
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__ROLE:
        return role != null && !role.isEmpty();
      case RbacDSLPackage.RESOURCE_ROLE_SCENARIO__RESOURCES:
        return resources != null && !resources.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ResourceRoleScenarioImpl
