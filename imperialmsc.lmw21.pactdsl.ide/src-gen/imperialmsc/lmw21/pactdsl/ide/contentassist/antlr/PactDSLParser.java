/*
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import imperialmsc.lmw21.pactdsl.ide.contentassist.antlr.internal.InternalPactDSLParser;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PactDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PactDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PactDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEntityTypeAccess().getAlternatives(), "rule__EntityType__Alternatives");
			builder.put(grammarAccess.getFeatureTypeAccess().getAlternatives(), "rule__FeatureType__Alternatives");
			builder.put(grammarAccess.getFormalityTypeAccess().getAlternatives(), "rule__FormalityType__Alternatives");
			builder.put(grammarAccess.getActionTypeAccess().getAlternatives(), "rule__ActionType__Alternatives");
			builder.put(grammarAccess.getStateTypeAccess().getAlternatives(), "rule__StateType__Alternatives");
			builder.put(grammarAccess.getOwnershipAccess().getAlternatives_1(), "rule__Ownership__Alternatives_1");
			builder.put(grammarAccess.getRightToUseAccess().getAlternatives_1(), "rule__RightToUse__Alternatives_1");
			builder.put(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives(), "rule__PrimaryObligationType__Alternatives");
			builder.put(grammarAccess.getTerminationTypeAccess().getAlternatives(), "rule__TerminationType__Alternatives");
			builder.put(grammarAccess.getBoilerplateTypeAccess().getAlternatives(), "rule__BoilerplateType__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
			builder.put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
			builder.put(grammarAccess.getModelAccess().getGroup_8(), "rule__Model__Group_8__0");
			builder.put(grammarAccess.getModelAccess().getGroup_10(), "rule__Model__Group_10__0");
			builder.put(grammarAccess.getModelAccess().getGroup_12(), "rule__Model__Group_12__0");
			builder.put(grammarAccess.getModelAccess().getGroup_14(), "rule__Model__Group_14__0");
			builder.put(grammarAccess.getModelAccess().getGroup_16(), "rule__Model__Group_16__0");
			builder.put(grammarAccess.getModelAccess().getGroup_18(), "rule__Model__Group_18__0");
			builder.put(grammarAccess.getModelAccess().getGroup_20(), "rule__Model__Group_20__0");
			builder.put(grammarAccess.getEffectiveDateAccess().getGroup(), "rule__EffectiveDate__Group__0");
			builder.put(grammarAccess.getEffectiveDateAccess().getGroup_1(), "rule__EffectiveDate__Group_1__0");
			builder.put(grammarAccess.getPartyAccess().getGroup(), "rule__Party__Group__0");
			builder.put(grammarAccess.getThirdPartyAccess().getGroup(), "rule__ThirdParty__Group__0");
			builder.put(grammarAccess.getSubjectMatterAccess().getGroup(), "rule__SubjectMatter__Group__0");
			builder.put(grammarAccess.getDefinedTermAccess().getGroup(), "rule__DefinedTerm__Group__0");
			builder.put(grammarAccess.getAddressAccess().getGroup(), "rule__Address__Group__0");
			builder.put(grammarAccess.getCompanyNumberAccess().getGroup(), "rule__CompanyNumber__Group__0");
			builder.put(grammarAccess.getCustomFeatureAccess().getGroup(), "rule__CustomFeature__Group__0");
			builder.put(grammarAccess.getInWritingAccess().getGroup(), "rule__InWriting__Group__0");
			builder.put(grammarAccess.getByEmailAccess().getGroup(), "rule__ByEmail__Group__0");
			builder.put(grammarAccess.getGivingNoticeAccess().getGroup(), "rule__GivingNotice__Group__0");
			builder.put(grammarAccess.getGivingNoticeAccess().getGroup_2(), "rule__GivingNotice__Group_2__0");
			builder.put(grammarAccess.getCustomFormalityAccess().getGroup(), "rule__CustomFormality__Group__0");
			builder.put(grammarAccess.getGivenConsentAccess().getGroup(), "rule__GivenConsent__Group__0");
			builder.put(grammarAccess.getGivenWrittenConsentAccess().getGroup(), "rule__GivenWrittenConsent__Group__0");
			builder.put(grammarAccess.getOwnershipAccess().getGroup(), "rule__Ownership__Group__0");
			builder.put(grammarAccess.getRightToUseAccess().getGroup(), "rule__RightToUse__Group__0");
			builder.put(grammarAccess.getPaymentObligationAccess().getGroup(), "rule__PaymentObligation__Group__0");
			builder.put(grammarAccess.getPaymentObligationAccess().getGroup_7(), "rule__PaymentObligation__Group_7__0");
			builder.put(grammarAccess.getDeliveryObligationAccess().getGroup(), "rule__DeliveryObligation__Group__0");
			builder.put(grammarAccess.getDeliveryObligationAccess().getGroup_7(), "rule__DeliveryObligation__Group_7__0");
			builder.put(grammarAccess.getTransferObligationAccess().getGroup(), "rule__TransferObligation__Group__0");
			builder.put(grammarAccess.getTransferObligationAccess().getGroup_7(), "rule__TransferObligation__Group_7__0");
			builder.put(grammarAccess.getLicenceObligationAccess().getGroup(), "rule__LicenceObligation__Group__0");
			builder.put(grammarAccess.getLicenceObligationAccess().getGroup_9(), "rule__LicenceObligation__Group_9__0");
			builder.put(grammarAccess.getConstraintPartyAccess().getGroup(), "rule__ConstraintParty__Group__0");
			builder.put(grammarAccess.getConstraintPartyAccess().getGroup_5(), "rule__ConstraintParty__Group_5__0");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getGroup(), "rule__ConstraintThirdParty__Group__0");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getGroup_6(), "rule__ConstraintThirdParty__Group_6__0");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getGroup_7(), "rule__ConstraintThirdParty__Group_7__0");
			builder.put(grammarAccess.getForConvenienceAccess().getGroup(), "rule__ForConvenience__Group__0");
			builder.put(grammarAccess.getOnReasonableNoticeAccess().getGroup(), "rule__OnReasonableNotice__Group__0");
			builder.put(grammarAccess.getForBreachAccess().getGroup(), "rule__ForBreach__Group__0");
			builder.put(grammarAccess.getForBreachAccess().getGroup_8(), "rule__ForBreach__Group_8__0");
			builder.put(grammarAccess.getOnInsolvencyEventAccess().getGroup(), "rule__OnInsolvencyEvent__Group__0");
			builder.put(grammarAccess.getCustomTerminationAccess().getGroup(), "rule__CustomTermination__Group__0");
			builder.put(grammarAccess.getCustomTerminationAccess().getGroup_5(), "rule__CustomTermination__Group_5__0");
			builder.put(grammarAccess.getApplicableLawAccess().getGroup(), "rule__ApplicableLaw__Group__0");
			builder.put(grammarAccess.getJurisdictionAccess().getGroup(), "rule__Jurisdiction__Group__0");
			builder.put(grammarAccess.getNoticesAccess().getGroup(), "rule__Notices__Group__0");
			builder.put(grammarAccess.getModelAccess().getTitleAssignment_1(), "rule__Model__TitleAssignment_1");
			builder.put(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0(), "rule__Model__EntityTypesAssignment_4_0");
			builder.put(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0(), "rule__Model__FormalityTypesAssignment_6_0");
			builder.put(grammarAccess.getModelAccess().getActionTypesAssignment_8_0(), "rule__Model__ActionTypesAssignment_8_0");
			builder.put(grammarAccess.getModelAccess().getStateTypesAssignment_10_0(), "rule__Model__StateTypesAssignment_10_0");
			builder.put(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0(), "rule__Model__PrimaryObligationTypesAssignment_12_0");
			builder.put(grammarAccess.getModelAccess().getStateTypesAssignment_14_0(), "rule__Model__StateTypesAssignment_14_0");
			builder.put(grammarAccess.getModelAccess().getTerminationTypesAssignment_16_0(), "rule__Model__TerminationTypesAssignment_16_0");
			builder.put(grammarAccess.getModelAccess().getStateTypesAssignment_18_0(), "rule__Model__StateTypesAssignment_18_0");
			builder.put(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_20_0(), "rule__Model__BoilerplateTypesAssignment_20_0");
			builder.put(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0(), "rule__EffectiveDate__DayAssignment_1_0");
			builder.put(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1(), "rule__EffectiveDate__MonthAssignment_1_1");
			builder.put(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2(), "rule__EffectiveDate__YearAssignment_1_2");
			builder.put(grammarAccess.getPartyAccess().getNameAssignment_1(), "rule__Party__NameAssignment_1");
			builder.put(grammarAccess.getPartyAccess().getFullnameAssignment_2(), "rule__Party__FullnameAssignment_2");
			builder.put(grammarAccess.getPartyAccess().getFeatureAssignment_3(), "rule__Party__FeatureAssignment_3");
			builder.put(grammarAccess.getThirdPartyAccess().getNameAssignment_1(), "rule__ThirdParty__NameAssignment_1");
			builder.put(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2(), "rule__ThirdParty__FullnameAssignment_2");
			builder.put(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3(), "rule__ThirdParty__FeatureAssignment_3");
			builder.put(grammarAccess.getSubjectMatterAccess().getNameAssignment_1(), "rule__SubjectMatter__NameAssignment_1");
			builder.put(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2(), "rule__SubjectMatter__SubjectMatterAssignment_2");
			builder.put(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3(), "rule__SubjectMatter__FeatureAssignment_3");
			builder.put(grammarAccess.getFeatureAccess().getFeaturetypeAssignment(), "rule__Feature__FeaturetypeAssignment");
			builder.put(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1(), "rule__DefinedTerm__DefinitionAssignment_1");
			builder.put(grammarAccess.getAddressAccess().getDefinitionAssignment_1(), "rule__Address__DefinitionAssignment_1");
			builder.put(grammarAccess.getCompanyNumberAccess().getDefinitionAssignment_1(), "rule__CompanyNumber__DefinitionAssignment_1");
			builder.put(grammarAccess.getCustomFeatureAccess().getFeatureAssignment_1(), "rule__CustomFeature__FeatureAssignment_1");
			builder.put(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1(), "rule__InWriting__CustomWritingFormalityAssignment_1");
			builder.put(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2(), "rule__ByEmail__EmailAddressAssignment_2");
			builder.put(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1(), "rule__GivingNotice__SuperTypeAssignment_1");
			builder.put(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1(), "rule__GivingNotice__NumDaysAssignment_2_1");
			builder.put(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1(), "rule__CustomFormality__CustomFormalityAssignment_1");
			builder.put(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0(), "rule__GivenConsent__SuperTypeAssignment_0");
			builder.put(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0(), "rule__GivenWrittenConsent__SuperTypeAssignment_0");
			builder.put(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_0(), "rule__Ownership__SuperTypeAssignment_0");
			builder.put(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_2(), "rule__Ownership__CustomOwnershipAssignment_2");
			builder.put(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3(), "rule__Ownership__SuperTypeAssignment_3");
			builder.put(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_0(), "rule__RightToUse__SuperTypeAssignment_0");
			builder.put(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_2(), "rule__RightToUse__CustomUsageAssignment_2");
			builder.put(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3(), "rule__RightToUse__SuperTypeAssignment_3");
			builder.put(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6(), "rule__PrimaryObligationType__CustomObligationAssignment_6");
			builder.put(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1(), "rule__PaymentObligation__SuperTypeAssignment_1");
			builder.put(grammarAccess.getPaymentObligationAccess().getSumAssignment_4(), "rule__PaymentObligation__SumAssignment_4");
			builder.put(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6(), "rule__PaymentObligation__SuperTypeAssignment_6");
			builder.put(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2(), "rule__PaymentObligation__DayAssignment_7_2");
			builder.put(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3(), "rule__PaymentObligation__MonthAssignment_7_3");
			builder.put(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4(), "rule__PaymentObligation__YearAssignment_7_4");
			builder.put(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1(), "rule__DeliveryObligation__SuperTypeAssignment_1");
			builder.put(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4(), "rule__DeliveryObligation__SuperTypeAssignment_4");
			builder.put(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6(), "rule__DeliveryObligation__SuperTypeAssignment_6");
			builder.put(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2(), "rule__DeliveryObligation__DayAssignment_7_2");
			builder.put(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3(), "rule__DeliveryObligation__MonthAssignment_7_3");
			builder.put(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4(), "rule__DeliveryObligation__YearAssignment_7_4");
			builder.put(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1(), "rule__TransferObligation__SuperTypeAssignment_1");
			builder.put(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4(), "rule__TransferObligation__SuperTypeAssignment_4");
			builder.put(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6(), "rule__TransferObligation__SuperTypeAssignment_6");
			builder.put(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2(), "rule__TransferObligation__DayAssignment_7_2");
			builder.put(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3(), "rule__TransferObligation__MonthAssignment_7_3");
			builder.put(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4(), "rule__TransferObligation__YearAssignment_7_4");
			builder.put(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1(), "rule__LicenceObligation__SuperTypeAssignment_1");
			builder.put(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6(), "rule__LicenceObligation__SuperTypeAssignment_6");
			builder.put(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8(), "rule__LicenceObligation__SuperTypeAssignment_8");
			builder.put(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2(), "rule__LicenceObligation__DayAssignment_9_2");
			builder.put(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3(), "rule__LicenceObligation__MonthAssignment_9_3");
			builder.put(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4(), "rule__LicenceObligation__YearAssignment_9_4");
			builder.put(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1(), "rule__ConstraintParty__SuperTypeAssignment_1");
			builder.put(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3(), "rule__ConstraintParty__ForbiddenActionAssignment_3");
			builder.put(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4(), "rule__ConstraintParty__SuperTypeAssignment_4");
			builder.put(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1(), "rule__ConstraintParty__SuperTypeAssignment_5_1");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1(), "rule__ConstraintThirdParty__SuperTypeAssignment_1");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3(), "rule__ConstraintThirdParty__ForbiddenActionAssignment_3");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4(), "rule__ConstraintThirdParty__SuperTypeAssignment_4");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5(), "rule__ConstraintThirdParty__AdditionalInfoAssignment_5");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1(), "rule__ConstraintThirdParty__SuperTypeAssignment_6_1");
			builder.put(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3(), "rule__ConstraintThirdParty__SuperTypeAssignment_7_3");
			builder.put(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1(), "rule__ForConvenience__SuperTypeAssignment_1");
			builder.put(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5(), "rule__ForConvenience__CustomTerminationAssignment_5");
			builder.put(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1(), "rule__OnReasonableNotice__SuperTypeAssignment_1");
			builder.put(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5(), "rule__OnReasonableNotice__SuperTypeAssignment_5");
			builder.put(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1(), "rule__ForBreach__SuperTypeAssignment_1");
			builder.put(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5(), "rule__ForBreach__ObligationBreachedAssignment_5");
			builder.put(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7(), "rule__ForBreach__SuperTypeAssignment_7");
			builder.put(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1(), "rule__ForBreach__RemedialSchemeAssignment_8_1");
			builder.put(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1(), "rule__OnInsolvencyEvent__SuperTypeAssignment_1");
			builder.put(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5(), "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5");
			builder.put(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7(), "rule__OnInsolvencyEvent__SuperTypeAssignment_7");
			builder.put(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1(), "rule__CustomTermination__SuperTypeAssignment_1");
			builder.put(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4(), "rule__CustomTermination__CustomTerminationClauseAssignment_4");
			builder.put(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1(), "rule__CustomTermination__SuperTypeAssignment_5_1");
			builder.put(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1(), "rule__ApplicableLaw__CustomApplicableLawAssignment_1");
			builder.put(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2(), "rule__ApplicableLaw__DefinitionAssignment_2");
			builder.put(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1(), "rule__Jurisdiction__CustomJurisdictionAssignment_1");
			builder.put(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2(), "rule__Jurisdiction__DefinitionAssignment_2");
			builder.put(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1(), "rule__Notices__CustomNoticeAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PactDSLGrammarAccess grammarAccess;

	@Override
	protected InternalPactDSLParser createParser() {
		InternalPactDSLParser result = new InternalPactDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PactDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PactDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
