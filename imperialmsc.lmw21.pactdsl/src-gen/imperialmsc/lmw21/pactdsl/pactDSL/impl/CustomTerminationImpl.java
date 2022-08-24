/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Termination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.CustomTerminationImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.CustomTerminationImpl#getCustomTerminationClause <em>Custom Termination Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomTerminationImpl extends TerminationTypeImpl implements CustomTermination
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected EObject superType;

  /**
   * The default value of the '{@link #getCustomTerminationClause() <em>Custom Termination Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomTerminationClause()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_TERMINATION_CLAUSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomTerminationClause() <em>Custom Termination Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomTerminationClause()
   * @generated
   * @ordered
   */
  protected String customTerminationClause = CUSTOM_TERMINATION_CLAUSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CustomTerminationImpl()
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
    return PactDSLPackage.Literals.CUSTOM_TERMINATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(EObject newSuperType)
  {
    EObject oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCustomTerminationClause()
  {
    return customTerminationClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomTerminationClause(String newCustomTerminationClause)
  {
    String oldCustomTerminationClause = customTerminationClause;
    customTerminationClause = newCustomTerminationClause;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.CUSTOM_TERMINATION__CUSTOM_TERMINATION_CLAUSE, oldCustomTerminationClause, customTerminationClause));
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
      case PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case PactDSLPackage.CUSTOM_TERMINATION__CUSTOM_TERMINATION_CLAUSE:
        return getCustomTerminationClause();
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
      case PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE:
        setSuperType((EObject)newValue);
        return;
      case PactDSLPackage.CUSTOM_TERMINATION__CUSTOM_TERMINATION_CLAUSE:
        setCustomTerminationClause((String)newValue);
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
      case PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE:
        setSuperType((EObject)null);
        return;
      case PactDSLPackage.CUSTOM_TERMINATION__CUSTOM_TERMINATION_CLAUSE:
        setCustomTerminationClause(CUSTOM_TERMINATION_CLAUSE_EDEFAULT);
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
      case PactDSLPackage.CUSTOM_TERMINATION__SUPER_TYPE:
        return superType != null;
      case PactDSLPackage.CUSTOM_TERMINATION__CUSTOM_TERMINATION_CLAUSE:
        return CUSTOM_TERMINATION_CLAUSE_EDEFAULT == null ? customTerminationClause != null : !CUSTOM_TERMINATION_CLAUSE_EDEFAULT.equals(customTerminationClause);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (CustomTerminationClause: ");
    result.append(customTerminationClause);
    result.append(')');
    return result.toString();
  }

} //CustomTerminationImpl