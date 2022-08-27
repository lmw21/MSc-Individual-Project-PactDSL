/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.ForBreach;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;
import imperialmsc.lmw21.pactdsl.pactDSL.Party;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Breach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ForBreachImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ForBreachImpl#getObligationBreached <em>Obligation Breached</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ForBreachImpl#getRemedialScheme <em>Remedial Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForBreachImpl extends TerminationTypeImpl implements ForBreach
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Party superType;

  /**
   * The default value of the '{@link #getObligationBreached() <em>Obligation Breached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligationBreached()
   * @generated
   * @ordered
   */
  protected static final String OBLIGATION_BREACHED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObligationBreached() <em>Obligation Breached</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligationBreached()
   * @generated
   * @ordered
   */
  protected String obligationBreached = OBLIGATION_BREACHED_EDEFAULT;

  /**
   * The default value of the '{@link #getRemedialScheme() <em>Remedial Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemedialScheme()
   * @generated
   * @ordered
   */
  protected static final String REMEDIAL_SCHEME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemedialScheme() <em>Remedial Scheme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemedialScheme()
   * @generated
   * @ordered
   */
  protected String remedialScheme = REMEDIAL_SCHEME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForBreachImpl()
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
    return PactDSLPackage.Literals.FOR_BREACH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Party getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Party)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PactDSLPackage.FOR_BREACH__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Party basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuperType(Party newSuperType)
  {
    Party oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FOR_BREACH__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getObligationBreached()
  {
    return obligationBreached;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObligationBreached(String newObligationBreached)
  {
    String oldObligationBreached = obligationBreached;
    obligationBreached = newObligationBreached;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FOR_BREACH__OBLIGATION_BREACHED, oldObligationBreached, obligationBreached));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRemedialScheme()
  {
    return remedialScheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRemedialScheme(String newRemedialScheme)
  {
    String oldRemedialScheme = remedialScheme;
    remedialScheme = newRemedialScheme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FOR_BREACH__REMEDIAL_SCHEME, oldRemedialScheme, remedialScheme));
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
      case PactDSLPackage.FOR_BREACH__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case PactDSLPackage.FOR_BREACH__OBLIGATION_BREACHED:
        return getObligationBreached();
      case PactDSLPackage.FOR_BREACH__REMEDIAL_SCHEME:
        return getRemedialScheme();
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
      case PactDSLPackage.FOR_BREACH__SUPER_TYPE:
        setSuperType((Party)newValue);
        return;
      case PactDSLPackage.FOR_BREACH__OBLIGATION_BREACHED:
        setObligationBreached((String)newValue);
        return;
      case PactDSLPackage.FOR_BREACH__REMEDIAL_SCHEME:
        setRemedialScheme((String)newValue);
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
      case PactDSLPackage.FOR_BREACH__SUPER_TYPE:
        setSuperType((Party)null);
        return;
      case PactDSLPackage.FOR_BREACH__OBLIGATION_BREACHED:
        setObligationBreached(OBLIGATION_BREACHED_EDEFAULT);
        return;
      case PactDSLPackage.FOR_BREACH__REMEDIAL_SCHEME:
        setRemedialScheme(REMEDIAL_SCHEME_EDEFAULT);
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
      case PactDSLPackage.FOR_BREACH__SUPER_TYPE:
        return superType != null;
      case PactDSLPackage.FOR_BREACH__OBLIGATION_BREACHED:
        return OBLIGATION_BREACHED_EDEFAULT == null ? obligationBreached != null : !OBLIGATION_BREACHED_EDEFAULT.equals(obligationBreached);
      case PactDSLPackage.FOR_BREACH__REMEDIAL_SCHEME:
        return REMEDIAL_SCHEME_EDEFAULT == null ? remedialScheme != null : !REMEDIAL_SCHEME_EDEFAULT.equals(remedialScheme);
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
    result.append(" (ObligationBreached: ");
    result.append(obligationBreached);
    result.append(", remedialScheme: ");
    result.append(remedialScheme);
    result.append(')');
    return result.toString();
  }

} //ForBreachImpl
