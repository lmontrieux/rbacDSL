/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getSsod <em>Ssod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getDsod <em>Dsod</em>}</li>
 *   <li>{@link uk.ac.open.rbacDSL.impl.RoleImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends PolicyElementImpl implements Role
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected EList<Role> parent;

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
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

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
  public EList<Role> getParent()
  {
    if (parent == null)
    {
      parent = new EObjectResolvingEList<Role>(Role.class, this, RbacDSLPackage.ROLE__PARENT);
    }
    return parent;
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
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, RbacDSLPackage.ROLE__ASSIGNMENTS);
    }
    return assignments;
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
      case RbacDSLPackage.ROLE__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case RbacDSLPackage.ROLE__PARENT:
        return getParent();
      case RbacDSLPackage.ROLE__SSOD:
        return getSsod();
      case RbacDSLPackage.ROLE__DSOD:
        return getDsod();
      case RbacDSLPackage.ROLE__ASSIGNMENTS:
        return getAssignments();
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
      case RbacDSLPackage.ROLE__PARENT:
        getParent().clear();
        getParent().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.ROLE__SSOD:
        getSsod().clear();
        getSsod().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.ROLE__DSOD:
        getDsod().clear();
        getDsod().addAll((Collection<? extends Role>)newValue);
        return;
      case RbacDSLPackage.ROLE__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
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
      case RbacDSLPackage.ROLE__PARENT:
        getParent().clear();
        return;
      case RbacDSLPackage.ROLE__SSOD:
        getSsod().clear();
        return;
      case RbacDSLPackage.ROLE__DSOD:
        getDsod().clear();
        return;
      case RbacDSLPackage.ROLE__ASSIGNMENTS:
        getAssignments().clear();
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
      case RbacDSLPackage.ROLE__PARENT:
        return parent != null && !parent.isEmpty();
      case RbacDSLPackage.ROLE__SSOD:
        return ssod != null && !ssod.isEmpty();
      case RbacDSLPackage.ROLE__DSOD:
        return dsod != null && !dsod.isEmpty();
      case RbacDSLPackage.ROLE__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RoleImpl
