/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.DeliveryObligation;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Obligation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.DeliveryObligationImpl#getDay <em>Day</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.DeliveryObligationImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.DeliveryObligationImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryObligationImpl extends PrimaryObligationTypeImpl implements DeliveryObligation
{
  /**
   * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected static final int DAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected int day = DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected static final int MONTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected int month = MONTH_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeliveryObligationImpl()
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
    return PactDSLPackage.Literals.DELIVERY_OBLIGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDay(int newDay)
  {
    int oldDay = day;
    day = newDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.DELIVERY_OBLIGATION__DAY, oldDay, day));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMonth(int newMonth)
  {
    int oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.DELIVERY_OBLIGATION__MONTH, oldMonth, month));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYear(int newYear)
  {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.DELIVERY_OBLIGATION__YEAR, oldYear, year));
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
      case PactDSLPackage.DELIVERY_OBLIGATION__DAY:
        return getDay();
      case PactDSLPackage.DELIVERY_OBLIGATION__MONTH:
        return getMonth();
      case PactDSLPackage.DELIVERY_OBLIGATION__YEAR:
        return getYear();
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
      case PactDSLPackage.DELIVERY_OBLIGATION__DAY:
        setDay((Integer)newValue);
        return;
      case PactDSLPackage.DELIVERY_OBLIGATION__MONTH:
        setMonth((Integer)newValue);
        return;
      case PactDSLPackage.DELIVERY_OBLIGATION__YEAR:
        setYear((Integer)newValue);
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
      case PactDSLPackage.DELIVERY_OBLIGATION__DAY:
        setDay(DAY_EDEFAULT);
        return;
      case PactDSLPackage.DELIVERY_OBLIGATION__MONTH:
        setMonth(MONTH_EDEFAULT);
        return;
      case PactDSLPackage.DELIVERY_OBLIGATION__YEAR:
        setYear(YEAR_EDEFAULT);
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
      case PactDSLPackage.DELIVERY_OBLIGATION__DAY:
        return day != DAY_EDEFAULT;
      case PactDSLPackage.DELIVERY_OBLIGATION__MONTH:
        return month != MONTH_EDEFAULT;
      case PactDSLPackage.DELIVERY_OBLIGATION__YEAR:
        return year != YEAR_EDEFAULT;
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
    result.append(" (day: ");
    result.append(day);
    result.append(", month: ");
    result.append(month);
    result.append(", year: ");
    result.append(year);
    result.append(')');
    return result.toString();
  }

} //DeliveryObligationImpl
