/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getSsod <em>Ssod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getDsod <em>Dsod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role
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
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Role parent;

  /**
   * The cached value of the '{@link #getSsod() <em>Ssod</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSsod()
   * @generated
   * @ordered
   */
  protected EList<Role> ssod;

  /**
   * The cached value of the '{@link #getDsod() <em>Dsod</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDsod()
   * @generated
   * @ordered
   */
  protected EList<Role> dsod;

  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<Permission> permissions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleImpl()
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
    return RbacDSLPackage.Literals.ROLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.ROLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Role)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacDSLPackage.ROLE__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Role newParent)
  {
    Role oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.ROLE__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getSsod()
  {
    if (ssod == null)
    {
      ssod = new EObjectResolvingEList<Role>(Role.class, this, RbacDSLPackage.ROLE__SSOD);
    }
    return ssod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getDsod()
  {
    if (dsod == null)
    {
      dsod = new EObjectResolvingEList<Role>(Role.class, this, RbacDSLPackage.ROLE__DSOD);
    }
    return dsod;
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
      permissions = new EObjectResolvingEList<Permission>(Permission.class, this, RbacDSLPackage.ROLE__PERMISSIONS);
    }
    return permissions;
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
      case RbacDSLPackage.ROLE__NAME:
        return getName();
      case RbacDSLPackage.ROLE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case RbacDSLPackage.ROLE__SSOD:
        return getSsod();
      case RbacDSLPackage.ROLE__DSOD:
        return getDsod();
      case RbacDSLPackage.ROLE__PERMISSIONS:
        return getPermissions();
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
      case RbacDSLPackage.ROLE__NAME:
        setName((String)newValue);
        return;
      case RbacDSLPackage.ROLE__PARENT:
        setParent((Role)newValue);
        return;
      case RbacDSLPackage.ROLE__SSOD:
        getSsod().clear();
        getSsod().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.ROLE__DSOD:
        getDsod().clear();
        getDsod().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.ROLE__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends Permission>)newValue);
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
      case RbacDSLPackage.ROLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RbacDSLPackage.ROLE__PARENT:
        setParent((Role)null);
        return;
      case RbacDSLPackage.ROLE__SSOD:
        getSsod().clear();
        return;
      case RbacDSLPackage.ROLE__DSOD:
        getDsod().clear();
        return;
      case RbacDSLPackage.ROLE__PERMISSIONS:
        getPermissions().clear();
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
      case RbacDSLPackage.ROLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RbacDSLPackage.ROLE__PARENT:
        return parent != null;
      case RbacDSLPackage.ROLE__SSOD:
        return ssod != null && !ssod.isEmpty();
      case RbacDSLPackage.ROLE__DSOD:
        return dsod != null && !dsod.isEmpty();
      case RbacDSLPackage.ROLE__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
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

} //RoleImpl
