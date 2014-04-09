/**
 */
package uk.ac.open.rbacDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.ObjectScenario;
import uk.ac.open.rbacDSL.RbacDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.rbacDSL.impl.ObjectScenarioImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectScenarioImpl extends ScenarioElementImpl implements ObjectScenario
{
  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectScenarioImpl()
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
    return RbacDSLPackage.Literals.OBJECT_SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignment()
  {
    if (assignment == null)
    {
      assignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT);
    }
    return assignment;
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
      case RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT:
        return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
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
      case RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT:
        return getAssignment();
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
      case RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT:
        getAssignment().clear();
        getAssignment().addAll((Collection<? extends Assignment>)newValue);
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
      case RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT:
        getAssignment().clear();
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
      case RbacDSLPackage.OBJECT_SCENARIO__ASSIGNMENT:
        return assignment != null && !assignment.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ObjectScenarioImpl
