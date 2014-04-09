/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.ForbiddenScenario;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forbidden Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl#getUser <em>User</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ForbiddenScenarioImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForbiddenScenarioImpl extends ScenarioElementImpl implements ForbiddenScenario
{
  /**
   * The cached value of the '{@link #getUser() <em>User</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser()
   * @generated
   * @ordered
   */
  protected User user;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObject()
   * @generated
   * @ordered
   */
  protected EList<Assignment> object;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForbiddenScenarioImpl()
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
    return RbacDSLPackage.Literals.FORBIDDEN_SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getUser()
  {
    if (user != null && user.eIsProxy())
    {
      InternalEObject oldUser = (InternalEObject)user;
      user = (User)eResolveProxy(oldUser);
      if (user != oldUser)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RbacDSLPackage.FORBIDDEN_SCENARIO__USER, oldUser, user));
      }
    }
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User basicGetUser()
  {
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser(User newUser)
  {
    User oldUser = user;
    user = newUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RbacDSLPackage.FORBIDDEN_SCENARIO__USER, oldUser, user));
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
      roles = new EObjectResolvingEList<Role>(Role.class, this, RbacDSLPackage.FORBIDDEN_SCENARIO__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getObject()
  {
    if (object == null)
    {
      object = new EObjectContainmentEList<Assignment>(Assignment.class, this, RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT);
    }
    return object;
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
      case RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT:
        return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
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
      case RbacDSLPackage.FORBIDDEN_SCENARIO__USER:
        if (resolve) return getUser();
        return basicGetUser();
      case RbacDSLPackage.FORBIDDEN_SCENARIO__ROLES:
        return getRoles();
      case RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT:
        return getObject();
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
      case RbacDSLPackage.FORBIDDEN_SCENARIO__USER:
        setUser((User)newValue);
        return;
      case RbacDSLPackage.FORBIDDEN_SCENARIO__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT:
        getObject().clear();
        getObject().addAll((Collection<? extends Assignment>)newValue);
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
      case RbacDSLPackage.FORBIDDEN_SCENARIO__USER:
        setUser((User)null);
        return;
      case RbacDSLPackage.FORBIDDEN_SCENARIO__ROLES:
        getRoles().clear();
        return;
      case RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT:
        getObject().clear();
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
      case RbacDSLPackage.FORBIDDEN_SCENARIO__USER:
        return user != null;
      case RbacDSLPackage.FORBIDDEN_SCENARIO__ROLES:
        return roles != null && !roles.isEmpty();
      case RbacDSLPackage.FORBIDDEN_SCENARIO__OBJECT:
        return object != null && !object.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForbiddenScenarioImpl
