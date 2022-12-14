/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;
import imperialmsc.lmw21.pactdsl.pactDSL.RightToUse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right To Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.RightToUseImpl#getCustomUsage <em>Custom Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightToUseImpl extends StateTypeImpl implements RightToUse
{
  /**
   * The default value of the '{@link #getCustomUsage() <em>Custom Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomUsage()
   * @generated
   * @ordered
   */
  protected static final String CUSTOM_USAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomUsage() <em>Custom Usage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomUsage()
   * @generated
   * @ordered
   */
  protected String customUsage = CUSTOM_USAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightToUseImpl()
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
    return PactDSLPackage.Literals.RIGHT_TO_USE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCustomUsage()
  {
    return customUsage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCustomUsage(String newCustomUsage)
  {
    String oldCustomUsage = customUsage;
    customUsage = newCustomUsage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.RIGHT_TO_USE__CUSTOM_USAGE, oldCustomUsage, customUsage));
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
      case PactDSLPackage.RIGHT_TO_USE__CUSTOM_USAGE:
        return getCustomUsage();
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
      case PactDSLPackage.RIGHT_TO_USE__CUSTOM_USAGE:
        setCustomUsage((String)newValue);
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
      case PactDSLPackage.RIGHT_TO_USE__CUSTOM_USAGE:
        setCustomUsage(CUSTOM_USAGE_EDEFAULT);
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
      case PactDSLPackage.RIGHT_TO_USE__CUSTOM_USAGE:
        return CUSTOM_USAGE_EDEFAULT == null ? customUsage != null : !CUSTOM_USAGE_EDEFAULT.equals(customUsage);
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
    result.append(" (customUsage: ");
    result.append(customUsage);
    result.append(')');
    return result.toString();
  }

} //RightToUseImpl
