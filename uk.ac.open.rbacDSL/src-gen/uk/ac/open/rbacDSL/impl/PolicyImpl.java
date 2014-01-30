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

import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.Policy;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Resource;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.PolicyImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.PolicyImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.PolicyImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.PolicyImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyImpl extends MinimalEObjectImpl.Container implements Policy
{
  /**
   * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsers()
   * @generated
   * @ordered
   */
  protected EList<User> users;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<Permission> permissions;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
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
  protected PolicyImpl()
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
    return RbacDSLPackage.Literals.POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<User> getUsers()
  {
    if (users == null)
    {
      users = new EObjectContainmentEList<User>(User.class, this, RbacDSLPackage.POLICY__USERS);
    }
    return users;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, RbacDSLPackage.POLICY__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Permission> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<Permission>(Permission.class, this, RbacDSLPackage.POLICY__PERMISSIONS);
    }
    return permissions;
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
      resources = new EObjectContainmentEList<Resource>(Resource.class, this, RbacDSLPackage.POLICY__RESOURCES);
    }
    return resources;
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
      case RbacDSLPackage.POLICY__USERS:
        return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.POLICY__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.POLICY__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
      case RbacDSLPackage.POLICY__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case RbacDSLPackage.POLICY__USERS:
        return getUsers();
      case RbacDSLPackage.POLICY__ROLES:
        return getRoles();
      case RbacDSLPackage.POLICY__PERMISSIONS:
        return getPermissions();
      case RbacDSLPackage.POLICY__RESOURCES:
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
      case RbacDSLPackage.POLICY__USERS:
        getUsers().clear();
        getUsers().addAll((Collection<? extends User>)newValue);
        return;
      case RbacDSLPackage.POLICY__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.POLICY__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends Permission>)newValue);
        return;
      case RbacDSLPackage.POLICY__RESOURCES:
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
      case RbacDSLPackage.POLICY__USERS:
        getUsers().clear();
        return;
      case RbacDSLPackage.POLICY__ROLES:
        getRoles().clear();
        return;
      case RbacDSLPackage.POLICY__PERMISSIONS:
        getPermissions().clear();
        return;
      case RbacDSLPackage.POLICY__RESOURCES:
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
      case RbacDSLPackage.POLICY__USERS:
        return users != null && !users.isEmpty();
      case RbacDSLPackage.POLICY__ROLES:
        return roles != null && !roles.isEmpty();
      case RbacDSLPackage.POLICY__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
      case RbacDSLPackage.POLICY__RESOURCES:
        return resources != null && !resources.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PolicyImpl
