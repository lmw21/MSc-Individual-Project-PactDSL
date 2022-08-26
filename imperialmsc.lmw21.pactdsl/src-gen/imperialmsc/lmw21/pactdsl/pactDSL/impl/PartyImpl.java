/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.Address;
import imperialmsc.lmw21.pactdsl.pactDSL.CompanyNumber;
import imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm;
import imperialmsc.lmw21.pactdsl.pactDSL.Feature;
import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage;
import imperialmsc.lmw21.pactdsl.pactDSL.Party;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getName <em>Name</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getCompanyNumber <em>Company Number</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.impl.PartyImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends EntityTypeImpl implements Party
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
   * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullname()
   * @generated
   * @ordered
   */
  protected static final String FULLNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullname()
   * @generated
   * @ordered
   */
  protected String fullname = FULLNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected EList<DefinedTerm> definition;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected EList<Address> address;

  /**
   * The cached value of the '{@link #getCompanyNumber() <em>Company Number</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompanyNumber()
   * @generated
   * @ordered
   */
  protected EList<CompanyNumber> companyNumber;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartyImpl()
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
    return PactDSLPackage.Literals.PARTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.PARTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFullname()
  {
    return fullname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFullname(String newFullname)
  {
    String oldFullname = fullname;
    fullname = newFullname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PactDSLPackage.PARTY__FULLNAME, oldFullname, fullname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DefinedTerm> getDefinition()
  {
    if (definition == null)
    {
      definition = new EObjectContainmentEList<DefinedTerm>(DefinedTerm.class, this, PactDSLPackage.PARTY__DEFINITION);
    }
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Address> getAddress()
  {
    if (address == null)
    {
      address = new EObjectContainmentEList<Address>(Address.class, this, PactDSLPackage.PARTY__ADDRESS);
    }
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CompanyNumber> getCompanyNumber()
  {
    if (companyNumber == null)
    {
      companyNumber = new EObjectContainmentEList<CompanyNumber>(CompanyNumber.class, this, PactDSLPackage.PARTY__COMPANY_NUMBER);
    }
    return companyNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Feature> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature>(Feature.class, this, PactDSLPackage.PARTY__FEATURES);
    }
    return features;
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
      case PactDSLPackage.PARTY__DEFINITION:
        return ((InternalEList<?>)getDefinition()).basicRemove(otherEnd, msgs);
      case PactDSLPackage.PARTY__ADDRESS:
        return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
      case PactDSLPackage.PARTY__COMPANY_NUMBER:
        return ((InternalEList<?>)getCompanyNumber()).basicRemove(otherEnd, msgs);
      case PactDSLPackage.PARTY__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case PactDSLPackage.PARTY__NAME:
        return getName();
      case PactDSLPackage.PARTY__FULLNAME:
        return getFullname();
      case PactDSLPackage.PARTY__DEFINITION:
        return getDefinition();
      case PactDSLPackage.PARTY__ADDRESS:
        return getAddress();
      case PactDSLPackage.PARTY__COMPANY_NUMBER:
        return getCompanyNumber();
      case PactDSLPackage.PARTY__FEATURES:
        return getFeatures();
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
      case PactDSLPackage.PARTY__NAME:
        setName((String)newValue);
        return;
      case PactDSLPackage.PARTY__FULLNAME:
        setFullname((String)newValue);
        return;
      case PactDSLPackage.PARTY__DEFINITION:
        getDefinition().clear();
        getDefinition().addAll((Collection<? extends DefinedTerm>)newValue);
        return;
      case PactDSLPackage.PARTY__ADDRESS:
        getAddress().clear();
        getAddress().addAll((Collection<? extends Address>)newValue);
        return;
      case PactDSLPackage.PARTY__COMPANY_NUMBER:
        getCompanyNumber().clear();
        getCompanyNumber().addAll((Collection<? extends CompanyNumber>)newValue);
        return;
      case PactDSLPackage.PARTY__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature>)newValue);
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
      case PactDSLPackage.PARTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PactDSLPackage.PARTY__FULLNAME:
        setFullname(FULLNAME_EDEFAULT);
        return;
      case PactDSLPackage.PARTY__DEFINITION:
        getDefinition().clear();
        return;
      case PactDSLPackage.PARTY__ADDRESS:
        getAddress().clear();
        return;
      case PactDSLPackage.PARTY__COMPANY_NUMBER:
        getCompanyNumber().clear();
        return;
      case PactDSLPackage.PARTY__FEATURES:
        getFeatures().clear();
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
      case PactDSLPackage.PARTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PactDSLPackage.PARTY__FULLNAME:
        return FULLNAME_EDEFAULT == null ? fullname != null : !FULLNAME_EDEFAULT.equals(fullname);
      case PactDSLPackage.PARTY__DEFINITION:
        return definition != null && !definition.isEmpty();
      case PactDSLPackage.PARTY__ADDRESS:
        return address != null && !address.isEmpty();
      case PactDSLPackage.PARTY__COMPANY_NUMBER:
        return companyNumber != null && !companyNumber.isEmpty();
      case PactDSLPackage.PARTY__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fullname: ");
    result.append(fullname);
    result.append(')');
    return result.toString();
  }

} //PartyImpl
