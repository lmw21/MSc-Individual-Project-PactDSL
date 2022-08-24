/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;
import imperialmsc.lmw21.pactdsl.pactDSL.Party;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Convenience</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ForConvenienceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.ForConvenienceImpl#getCustomTermination <em>Custom Termination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForConvenienceImpl extends TerminationTypeImpl implements ForConvenience
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
   * The default value of the '{@link #getCustomTermination() <em>Custom Termination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomTermination()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_TERMINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomTermination() <em>Custom Termination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomTermination()
   * @generated
   * @ordered
   */
  protected String customTermination = CUSTOM_TERMINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForConvenienceImpl()
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
    return PactDSLPackage.Literals.FOR_CONVENIENCE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCustomTermination()
  {
    return customTermination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomTermination(String newCustomTermination)
  {
    String oldCustomTermination = customTermination;
    customTermination = newCustomTermination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.FOR_CONVENIENCE__CUSTOM_TERMINATION, oldCustomTermination, customTermination));
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
      case PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case PactDSLPackage.FOR_CONVENIENCE__CUSTOM_TERMINATION:
        return getCustomTermination();
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
      case PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE:
        setSuperType((Party)newValue);
        return;
      case PactDSLPackage.FOR_CONVENIENCE__CUSTOM_TERMINATION:
        setCustomTermination((String)newValue);
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
      case PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE:
        setSuperType((Party)null);
        return;
      case PactDSLPackage.FOR_CONVENIENCE__CUSTOM_TERMINATION:
        setCustomTermination(CUSTOM_TERMINATION_EDEFAULT);
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
      case PactDSLPackage.FOR_CONVENIENCE__SUPER_TYPE:
        return superType != null;
      case PactDSLPackage.FOR_CONVENIENCE__CUSTOM_TERMINATION:
        return CUSTOM_TERMINATION_EDEFAULT == null ? customTermination != null : !CUSTOM_TERMINATION_EDEFAULT.equals(customTermination);
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
    result.append(" (customTermination: ");
    result.append(customTermination);
    result.append(')');
    return result.toString();
  }

} //ForConvenienceImpl