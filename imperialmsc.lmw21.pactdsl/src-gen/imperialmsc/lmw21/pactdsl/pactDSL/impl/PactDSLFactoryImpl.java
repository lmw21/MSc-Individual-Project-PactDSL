/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL.impl;

import imperialmsc.lmw21.pactdsl.pactDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PactDSLFactoryImpl extends EFactoryImpl implements PactDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PactDSLFactory init()
  {
    try
    {
      PactDSLFactory thePactDSLFactory = (PactDSLFactory)EPackage.Registry.INSTANCE.getEFactory(PactDSLPackage.eNS_URI);
      if (thePactDSLFactory != null)
      {
        return thePactDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PactDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PactDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PactDSLPackage.MODEL: return createModel();
      case PactDSLPackage.ENTITY_TYPE: return createEntityType();
      case PactDSLPackage.PARTY: return createParty();
      case PactDSLPackage.THIRD_PARTY: return createThirdParty();
      case PactDSLPackage.SUBJECT_MATTER: return createSubjectMatter();
      case PactDSLPackage.DEFINED_TERM: return createDefinedTerm();
      case PactDSLPackage.ADDRESS: return createAddress();
      case PactDSLPackage.COMPANY_NUMBER: return createCompanyNumber();
      case PactDSLPackage.FEATURE: return createFeature();
      case PactDSLPackage.FORMALITY_TYPE: return createFormalityType();
      case PactDSLPackage.IN_WRITING: return createInWriting();
      case PactDSLPackage.BY_EMAIL: return createByEmail();
      case PactDSLPackage.GIVING_NOTICE: return createGivingNotice();
      case PactDSLPackage.CUSTOM_FORMALITY: return createCustomFormality();
      case PactDSLPackage.ACTION_TYPE: return createActionType();
      case PactDSLPackage.GIVEN_CONSENT: return createGivenConsent();
      case PactDSLPackage.GIVEN_WRITTEN_CONSENT: return createGivenWrittenConsent();
      case PactDSLPackage.STATE_TYPE: return createStateType();
      case PactDSLPackage.OWNERSHIP: return createOwnership();
      case PactDSLPackage.RIGHT_TO_USE: return createRightToUse();
      case PactDSLPackage.PRIMARY_OBLIGATION_TYPE: return createPrimaryObligationType();
      case PactDSLPackage.PAYMENT_OBLIGATION: return createPaymentObligation();
      case PactDSLPackage.DELIVERY_OBLIGATION: return createDeliveryObligation();
      case PactDSLPackage.TRANSFER_OBLIGATION: return createTransferObligation();
      case PactDSLPackage.LICENCE_OBLIGATION: return createLicenceObligation();
      case PactDSLPackage.CONSTRAINT_PARTY: return createConstraintParty();
      case PactDSLPackage.CONSTRAINT_THIRD_PARTY: return createConstraintThirdParty();
      case PactDSLPackage.TERMINATION_TYPE: return createTerminationType();
      case PactDSLPackage.FOR_CONVENIENCE: return createForConvenience();
      case PactDSLPackage.ON_REASONABLE_NOTICE: return createOnReasonableNotice();
      case PactDSLPackage.FOR_BREACH: return createForBreach();
      case PactDSLPackage.ON_INSOLVENCY_EVENT: return createOnInsolvencyEvent();
      case PactDSLPackage.CUSTOM_TERMINATION: return createCustomTermination();
      case PactDSLPackage.BOILERPLATE_TYPE: return createBoilerplateType();
      case PactDSLPackage.APPLICABLE_LAW: return createApplicableLaw();
      case PactDSLPackage.JURISDICTION: return createJurisdiction();
      case PactDSLPackage.NOTICES: return createNotices();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Party createParty()
  {
    PartyImpl party = new PartyImpl();
    return party;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ThirdParty createThirdParty()
  {
    ThirdPartyImpl thirdParty = new ThirdPartyImpl();
    return thirdParty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubjectMatter createSubjectMatter()
  {
    SubjectMatterImpl subjectMatter = new SubjectMatterImpl();
    return subjectMatter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefinedTerm createDefinedTerm()
  {
    DefinedTermImpl definedTerm = new DefinedTermImpl();
    return definedTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Address createAddress()
  {
    AddressImpl address = new AddressImpl();
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompanyNumber createCompanyNumber()
  {
    CompanyNumberImpl companyNumber = new CompanyNumberImpl();
    return companyNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FormalityType createFormalityType()
  {
    FormalityTypeImpl formalityType = new FormalityTypeImpl();
    return formalityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InWriting createInWriting()
  {
    InWritingImpl inWriting = new InWritingImpl();
    return inWriting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ByEmail createByEmail()
  {
    ByEmailImpl byEmail = new ByEmailImpl();
    return byEmail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GivingNotice createGivingNotice()
  {
    GivingNoticeImpl givingNotice = new GivingNoticeImpl();
    return givingNotice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomFormality createCustomFormality()
  {
    CustomFormalityImpl customFormality = new CustomFormalityImpl();
    return customFormality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionType createActionType()
  {
    ActionTypeImpl actionType = new ActionTypeImpl();
    return actionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GivenConsent createGivenConsent()
  {
    GivenConsentImpl givenConsent = new GivenConsentImpl();
    return givenConsent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GivenWrittenConsent createGivenWrittenConsent()
  {
    GivenWrittenConsentImpl givenWrittenConsent = new GivenWrittenConsentImpl();
    return givenWrittenConsent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateType createStateType()
  {
    StateTypeImpl stateType = new StateTypeImpl();
    return stateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ownership createOwnership()
  {
    OwnershipImpl ownership = new OwnershipImpl();
    return ownership;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightToUse createRightToUse()
  {
    RightToUseImpl rightToUse = new RightToUseImpl();
    return rightToUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimaryObligationType createPrimaryObligationType()
  {
    PrimaryObligationTypeImpl primaryObligationType = new PrimaryObligationTypeImpl();
    return primaryObligationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PaymentObligation createPaymentObligation()
  {
    PaymentObligationImpl paymentObligation = new PaymentObligationImpl();
    return paymentObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeliveryObligation createDeliveryObligation()
  {
    DeliveryObligationImpl deliveryObligation = new DeliveryObligationImpl();
    return deliveryObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransferObligation createTransferObligation()
  {
    TransferObligationImpl transferObligation = new TransferObligationImpl();
    return transferObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LicenceObligation createLicenceObligation()
  {
    LicenceObligationImpl licenceObligation = new LicenceObligationImpl();
    return licenceObligation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstraintParty createConstraintParty()
  {
    ConstraintPartyImpl constraintParty = new ConstraintPartyImpl();
    return constraintParty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConstraintThirdParty createConstraintThirdParty()
  {
    ConstraintThirdPartyImpl constraintThirdParty = new ConstraintThirdPartyImpl();
    return constraintThirdParty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TerminationType createTerminationType()
  {
    TerminationTypeImpl terminationType = new TerminationTypeImpl();
    return terminationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForConvenience createForConvenience()
  {
    ForConvenienceImpl forConvenience = new ForConvenienceImpl();
    return forConvenience;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnReasonableNotice createOnReasonableNotice()
  {
    OnReasonableNoticeImpl onReasonableNotice = new OnReasonableNoticeImpl();
    return onReasonableNotice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForBreach createForBreach()
  {
    ForBreachImpl forBreach = new ForBreachImpl();
    return forBreach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OnInsolvencyEvent createOnInsolvencyEvent()
  {
    OnInsolvencyEventImpl onInsolvencyEvent = new OnInsolvencyEventImpl();
    return onInsolvencyEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CustomTermination createCustomTermination()
  {
    CustomTerminationImpl customTermination = new CustomTerminationImpl();
    return customTermination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoilerplateType createBoilerplateType()
  {
    BoilerplateTypeImpl boilerplateType = new BoilerplateTypeImpl();
    return boilerplateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApplicableLaw createApplicableLaw()
  {
    ApplicableLawImpl applicableLaw = new ApplicableLawImpl();
    return applicableLaw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Jurisdiction createJurisdiction()
  {
    JurisdictionImpl jurisdiction = new JurisdictionImpl();
    return jurisdiction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Notices createNotices()
  {
    NoticesImpl notices = new NoticesImpl();
    return notices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PactDSLPackage getPactDSLPackage()
  {
    return (PactDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PactDSLPackage getPackage()
  {
    return PactDSLPackage.eINSTANCE;
  }

} //PactDSLFactoryImpl