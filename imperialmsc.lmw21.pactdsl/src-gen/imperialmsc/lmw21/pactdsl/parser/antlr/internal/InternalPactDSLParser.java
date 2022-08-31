package imperialmsc.lmw21.pactdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContractTitle:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'SecondaryObligations:'", "'Liability'", "'Termination:'", "'StateAfterContractDischarged:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'Ownership:'", "'owns'", "'doesNotOwn'", "'RightToUse:'", "'mayUse'", "'mayNotUse'", "'State:'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'CustomObligation:'", "'SecondaryObligation:'", "'uponBreachOf'", "'LiabilityToParty:'", "'shallNotBeLiable'", "'for'", "'LiabilityToThirdParty:'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPactDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPactDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPactDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPactDSL.g"; }



     	private PactDSLGrammarAccess grammarAccess;

        public InternalPactDSLParser(TokenStream input, PactDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected PactDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalPactDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPactDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPactDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPactDSL.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'SecondaryObligations:' )? ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )* (otherlv_21= 'Liability' )? ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )* (otherlv_24= 'Termination:' )? ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )* (otherlv_27= 'StateAfterContractDischarged:' )? ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )* (otherlv_30= 'Boilerplate:' )? ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        EObject lv_entityTypes_4_0 = null;

        EObject lv_formalityTypes_7_0 = null;

        EObject lv_actionTypes_10_0 = null;

        EObject lv_stateTypes_13_0 = null;

        EObject lv_primaryObligationTypes_16_0 = null;

        EObject lv_secondaryObligationTypes_19_0 = null;

        EObject lv_liabilityTypes_22_0 = null;

        EObject lv_terminationTypes_25_0 = null;

        EObject lv_stateTypes_28_0 = null;

        EObject lv_boilerplateTypes_31_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:77:2: ( (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'SecondaryObligations:' )? ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )* (otherlv_21= 'Liability' )? ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )* (otherlv_24= 'Termination:' )? ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )* (otherlv_27= 'StateAfterContractDischarged:' )? ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )* (otherlv_30= 'Boilerplate:' )? ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )* ) )
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'SecondaryObligations:' )? ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )* (otherlv_21= 'Liability' )? ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )* (otherlv_24= 'Termination:' )? ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )* (otherlv_27= 'StateAfterContractDischarged:' )? ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )* (otherlv_30= 'Boilerplate:' )? ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )* )
            {
            // InternalPactDSL.g:78:2: (otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'SecondaryObligations:' )? ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )* (otherlv_21= 'Liability' )? ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )* (otherlv_24= 'Termination:' )? ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )* (otherlv_27= 'StateAfterContractDischarged:' )? ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )* (otherlv_30= 'Boilerplate:' )? ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )* )
            // InternalPactDSL.g:79:3: otherlv_0= 'ContractTitle:' ( (lv_title_1_0= RULE_STRING ) ) (otherlv_2= '.' )+ otherlv_3= 'Entities:' ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+ (otherlv_6= 'Formalities:' )? ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )* (otherlv_9= 'Actions:' )? ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )* (otherlv_12= 'StateOnSignature:' )? ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )* otherlv_15= 'PrimaryObligations:' ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+ (otherlv_18= 'SecondaryObligations:' )? ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )* (otherlv_21= 'Liability' )? ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )* (otherlv_24= 'Termination:' )? ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )* (otherlv_27= 'StateAfterContractDischarged:' )? ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )* (otherlv_30= 'Boilerplate:' )? ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getContractTitleKeyword_0());
            		
            // InternalPactDSL.g:83:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalPactDSL.g:84:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:84:4: (lv_title_1_0= RULE_STRING )
            // InternalPactDSL.g:85:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:101:3: (otherlv_2= '.' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPactDSL.g:102:4: otherlv_2= '.'
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFullStopKeyword_2());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getEntitiesKeyword_3());
            		
            // InternalPactDSL.g:111:3: ( ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=23 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPactDSL.g:112:4: ( (lv_entityTypes_4_0= ruleEntityType ) ) otherlv_5= '.'
            	    {
            	    // InternalPactDSL.g:112:4: ( (lv_entityTypes_4_0= ruleEntityType ) )
            	    // InternalPactDSL.g:113:5: (lv_entityTypes_4_0= ruleEntityType )
            	    {
            	    // InternalPactDSL.g:113:5: (lv_entityTypes_4_0= ruleEntityType )
            	    // InternalPactDSL.g:114:6: lv_entityTypes_4_0= ruleEntityType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_entityTypes_4_0=ruleEntityType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entityTypes",
            	    							lv_entityTypes_4_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.EntityType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getFullStopKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalPactDSL.g:136:3: (otherlv_6= 'Formalities:' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPactDSL.g:137:4: otherlv_6= 'Formalities:'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getFormalitiesKeyword_5());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:142:3: ( ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=31 && LA4_0<=32)||LA4_0==34||LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPactDSL.g:143:4: ( (lv_formalityTypes_7_0= ruleFormalityType ) ) otherlv_8= '.'
            	    {
            	    // InternalPactDSL.g:143:4: ( (lv_formalityTypes_7_0= ruleFormalityType ) )
            	    // InternalPactDSL.g:144:5: (lv_formalityTypes_7_0= ruleFormalityType )
            	    {
            	    // InternalPactDSL.g:144:5: (lv_formalityTypes_7_0= ruleFormalityType )
            	    // InternalPactDSL.g:145:6: lv_formalityTypes_7_0= ruleFormalityType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_formalityTypes_7_0=ruleFormalityType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"formalityTypes",
            	    							lv_formalityTypes_7_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.FormalityType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,12,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getFullStopKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPactDSL.g:167:3: (otherlv_9= 'Actions:' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:168:4: otherlv_9= 'Actions:'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getActionsKeyword_7());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:173:3: ( ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPactDSL.g:174:4: ( (lv_actionTypes_10_0= ruleActionType ) ) otherlv_11= '.'
            	    {
            	    // InternalPactDSL.g:174:4: ( (lv_actionTypes_10_0= ruleActionType ) )
            	    // InternalPactDSL.g:175:5: (lv_actionTypes_10_0= ruleActionType )
            	    {
            	    // InternalPactDSL.g:175:5: (lv_actionTypes_10_0= ruleActionType )
            	    // InternalPactDSL.g:176:6: lv_actionTypes_10_0= ruleActionType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_actionTypes_10_0=ruleActionType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actionTypes",
            	    							lv_actionTypes_10_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.ActionType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,12,FOLLOW_9); 

            	    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getFullStopKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalPactDSL.g:198:3: (otherlv_12= 'StateOnSignature:' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPactDSL.g:199:4: otherlv_12= 'StateOnSignature:'
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getStateOnSignatureKeyword_9());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:204:3: ( ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40||LA8_0==43||LA8_0==46) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPactDSL.g:205:4: ( (lv_stateTypes_13_0= ruleStateType ) ) otherlv_14= '.'
            	    {
            	    // InternalPactDSL.g:205:4: ( (lv_stateTypes_13_0= ruleStateType ) )
            	    // InternalPactDSL.g:206:5: (lv_stateTypes_13_0= ruleStateType )
            	    {
            	    // InternalPactDSL.g:206:5: (lv_stateTypes_13_0= ruleStateType )
            	    // InternalPactDSL.g:207:6: lv_stateTypes_13_0= ruleStateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stateTypes_13_0=ruleStateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateTypes",
            	    							lv_stateTypes_13_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.StateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,12,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getFullStopKeyword_10_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11());
            		
            // InternalPactDSL.g:233:3: ( ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==47||LA9_0==52||LA9_0==54||LA9_0==56||LA9_0==60||LA9_0==62||LA9_0==66) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPactDSL.g:234:4: ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) ) otherlv_17= '.'
            	    {
            	    // InternalPactDSL.g:234:4: ( (lv_primaryObligationTypes_16_0= rulePrimaryObligationType ) )
            	    // InternalPactDSL.g:235:5: (lv_primaryObligationTypes_16_0= rulePrimaryObligationType )
            	    {
            	    // InternalPactDSL.g:235:5: (lv_primaryObligationTypes_16_0= rulePrimaryObligationType )
            	    // InternalPactDSL.g:236:6: lv_primaryObligationTypes_16_0= rulePrimaryObligationType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_primaryObligationTypes_16_0=rulePrimaryObligationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"primaryObligationTypes",
            	    							lv_primaryObligationTypes_16_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.PrimaryObligationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_17=(Token)match(input,12,FOLLOW_12); 

            	    				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getFullStopKeyword_12_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalPactDSL.g:258:3: (otherlv_18= 'SecondaryObligations:' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:259:4: otherlv_18= 'SecondaryObligations:'
                    {
                    otherlv_18=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getModelAccess().getSecondaryObligationsKeyword_13());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:264:3: ( ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==67) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPactDSL.g:265:4: ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) ) otherlv_20= '.'
            	    {
            	    // InternalPactDSL.g:265:4: ( (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType ) )
            	    // InternalPactDSL.g:266:5: (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType )
            	    {
            	    // InternalPactDSL.g:266:5: (lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType )
            	    // InternalPactDSL.g:267:6: lv_secondaryObligationTypes_19_0= ruleSecondaryObligationType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getSecondaryObligationTypesSecondaryObligationTypeParserRuleCall_14_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_secondaryObligationTypes_19_0=ruleSecondaryObligationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"secondaryObligationTypes",
            	    							lv_secondaryObligationTypes_19_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.SecondaryObligationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_20=(Token)match(input,12,FOLLOW_13); 

            	    				newLeafNode(otherlv_20, grammarAccess.getModelAccess().getFullStopKeyword_14_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalPactDSL.g:289:3: (otherlv_21= 'Liability' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPactDSL.g:290:4: otherlv_21= 'Liability'
                    {
                    otherlv_21=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getModelAccess().getLiabilityKeyword_15());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:295:3: ( ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==69||LA13_0==72) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPactDSL.g:296:4: ( (lv_liabilityTypes_22_0= ruleLiabilityType ) ) otherlv_23= '.'
            	    {
            	    // InternalPactDSL.g:296:4: ( (lv_liabilityTypes_22_0= ruleLiabilityType ) )
            	    // InternalPactDSL.g:297:5: (lv_liabilityTypes_22_0= ruleLiabilityType )
            	    {
            	    // InternalPactDSL.g:297:5: (lv_liabilityTypes_22_0= ruleLiabilityType )
            	    // InternalPactDSL.g:298:6: lv_liabilityTypes_22_0= ruleLiabilityType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getLiabilityTypesLiabilityTypeParserRuleCall_16_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_liabilityTypes_22_0=ruleLiabilityType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"liabilityTypes",
            	    							lv_liabilityTypes_22_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.LiabilityType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_23=(Token)match(input,12,FOLLOW_14); 

            	    				newLeafNode(otherlv_23, grammarAccess.getModelAccess().getFullStopKeyword_16_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPactDSL.g:320:3: (otherlv_24= 'Termination:' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||(LA14_1>=20 && LA14_1<=22)||LA14_1==40||LA14_1==43||LA14_1==46||LA14_1==73||(LA14_1>=76 && LA14_1<=77)||LA14_1==79||(LA14_1>=81 && LA14_1<=83)) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalPactDSL.g:321:4: otherlv_24= 'Termination:'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_24, grammarAccess.getModelAccess().getTerminationKeyword_17());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:326:3: ( ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20||LA15_0==73||(LA15_0>=76 && LA15_0<=77)||LA15_0==79) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPactDSL.g:327:4: ( (lv_terminationTypes_25_0= ruleTerminationType ) ) otherlv_26= '.'
            	    {
            	    // InternalPactDSL.g:327:4: ( (lv_terminationTypes_25_0= ruleTerminationType ) )
            	    // InternalPactDSL.g:328:5: (lv_terminationTypes_25_0= ruleTerminationType )
            	    {
            	    // InternalPactDSL.g:328:5: (lv_terminationTypes_25_0= ruleTerminationType )
            	    // InternalPactDSL.g:329:6: lv_terminationTypes_25_0= ruleTerminationType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_18_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_terminationTypes_25_0=ruleTerminationType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terminationTypes",
            	    							lv_terminationTypes_25_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.TerminationType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_26=(Token)match(input,12,FOLLOW_15); 

            	    				newLeafNode(otherlv_26, grammarAccess.getModelAccess().getFullStopKeyword_18_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalPactDSL.g:351:3: (otherlv_27= 'StateAfterContractDischarged:' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPactDSL.g:352:4: otherlv_27= 'StateAfterContractDischarged:'
                    {
                    otherlv_27=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getModelAccess().getStateAfterContractDischargedKeyword_19());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:357:3: ( ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40||LA17_0==43||LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPactDSL.g:358:4: ( (lv_stateTypes_28_0= ruleStateType ) ) otherlv_29= '.'
            	    {
            	    // InternalPactDSL.g:358:4: ( (lv_stateTypes_28_0= ruleStateType ) )
            	    // InternalPactDSL.g:359:5: (lv_stateTypes_28_0= ruleStateType )
            	    {
            	    // InternalPactDSL.g:359:5: (lv_stateTypes_28_0= ruleStateType )
            	    // InternalPactDSL.g:360:6: lv_stateTypes_28_0= ruleStateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_20_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_stateTypes_28_0=ruleStateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"stateTypes",
            	    							lv_stateTypes_28_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.StateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_29=(Token)match(input,12,FOLLOW_16); 

            	    				newLeafNode(otherlv_29, grammarAccess.getModelAccess().getFullStopKeyword_20_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalPactDSL.g:382:3: (otherlv_30= 'Boilerplate:' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||LA18_1==22||(LA18_1>=81 && LA18_1<=83)) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalPactDSL.g:383:4: otherlv_30= 'Boilerplate:'
                    {
                    otherlv_30=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_30, grammarAccess.getModelAccess().getBoilerplateKeyword_21());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:388:3: ( ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22||(LA19_0>=81 && LA19_0<=83)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPactDSL.g:389:4: ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) ) otherlv_32= '.'
            	    {
            	    // InternalPactDSL.g:389:4: ( (lv_boilerplateTypes_31_0= ruleBoilerplateType ) )
            	    // InternalPactDSL.g:390:5: (lv_boilerplateTypes_31_0= ruleBoilerplateType )
            	    {
            	    // InternalPactDSL.g:390:5: (lv_boilerplateTypes_31_0= ruleBoilerplateType )
            	    // InternalPactDSL.g:391:6: lv_boilerplateTypes_31_0= ruleBoilerplateType
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_22_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_boilerplateTypes_31_0=ruleBoilerplateType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"boilerplateTypes",
            	    							lv_boilerplateTypes_31_0,
            	    							"imperialmsc.lmw21.pactdsl.PactDSL.BoilerplateType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_32=(Token)match(input,12,FOLLOW_17); 

            	    				newLeafNode(otherlv_32, grammarAccess.getModelAccess().getFullStopKeyword_22_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityType"
    // InternalPactDSL.g:417:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalPactDSL.g:417:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalPactDSL.g:418:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalPactDSL.g:424:1: ruleEntityType returns [EObject current=null] : (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        EObject this_EffectiveDate_0 = null;

        EObject this_Party_1 = null;

        EObject this_ThirdParty_2 = null;

        EObject this_SubjectMatter_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:430:2: ( (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter ) )
            // InternalPactDSL.g:431:2: (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter )
            {
            // InternalPactDSL.g:431:2: (this_EffectiveDate_0= ruleEffectiveDate | this_Party_1= ruleParty | this_ThirdParty_2= ruleThirdParty | this_SubjectMatter_3= ruleSubjectMatter )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt20=1;
                }
                break;
            case 24:
                {
                alt20=2;
                }
                break;
            case 25:
                {
                alt20=3;
                }
                break;
            case 26:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPactDSL.g:432:3: this_EffectiveDate_0= ruleEffectiveDate
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EffectiveDate_0=ruleEffectiveDate();

                    state._fsp--;


                    			current = this_EffectiveDate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:441:3: this_Party_1= ruleParty
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Party_1=ruleParty();

                    state._fsp--;


                    			current = this_Party_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:450:3: this_ThirdParty_2= ruleThirdParty
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ThirdParty_2=ruleThirdParty();

                    state._fsp--;


                    			current = this_ThirdParty_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:459:3: this_SubjectMatter_3= ruleSubjectMatter
                    {

                    			newCompositeNode(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubjectMatter_3=ruleSubjectMatter();

                    state._fsp--;


                    			current = this_SubjectMatter_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEffectiveDate"
    // InternalPactDSL.g:471:1: entryRuleEffectiveDate returns [EObject current=null] : iv_ruleEffectiveDate= ruleEffectiveDate EOF ;
    public final EObject entryRuleEffectiveDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveDate = null;


        try {
            // InternalPactDSL.g:471:54: (iv_ruleEffectiveDate= ruleEffectiveDate EOF )
            // InternalPactDSL.g:472:2: iv_ruleEffectiveDate= ruleEffectiveDate EOF
            {
             newCompositeNode(grammarAccess.getEffectiveDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffectiveDate=ruleEffectiveDate();

            state._fsp--;

             current =iv_ruleEffectiveDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectiveDate"


    // $ANTLR start "ruleEffectiveDate"
    // InternalPactDSL.g:478:1: ruleEffectiveDate returns [EObject current=null] : (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleEffectiveDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_day_1_0=null;
        Token lv_month_2_0=null;
        Token lv_year_3_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:484:2: ( (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ ) )
            // InternalPactDSL.g:485:2: (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ )
            {
            // InternalPactDSL.g:485:2: (otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+ )
            // InternalPactDSL.g:486:3: otherlv_0= 'EffectiveDate:' ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0());
            		
            // InternalPactDSL.g:490:3: ( ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_INT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPactDSL.g:491:4: ( (lv_day_1_0= RULE_INT ) ) ( (lv_month_2_0= RULE_INT ) ) ( (lv_year_3_0= RULE_INT ) )
            	    {
            	    // InternalPactDSL.g:491:4: ( (lv_day_1_0= RULE_INT ) )
            	    // InternalPactDSL.g:492:5: (lv_day_1_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:492:5: (lv_day_1_0= RULE_INT )
            	    // InternalPactDSL.g:493:6: lv_day_1_0= RULE_INT
            	    {
            	    lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_day_1_0, grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"day",
            	    							lv_day_1_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:509:4: ( (lv_month_2_0= RULE_INT ) )
            	    // InternalPactDSL.g:510:5: (lv_month_2_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:510:5: (lv_month_2_0= RULE_INT )
            	    // InternalPactDSL.g:511:6: lv_month_2_0= RULE_INT
            	    {
            	    lv_month_2_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_month_2_0, grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"month",
            	    							lv_month_2_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:527:4: ( (lv_year_3_0= RULE_INT ) )
            	    // InternalPactDSL.g:528:5: (lv_year_3_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:528:5: (lv_year_3_0= RULE_INT )
            	    // InternalPactDSL.g:529:6: lv_year_3_0= RULE_INT
            	    {
            	    lv_year_3_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    						newLeafNode(lv_year_3_0, grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEffectiveDateRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"year",
            	    							lv_year_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectiveDate"


    // $ANTLR start "entryRuleParty"
    // InternalPactDSL.g:550:1: entryRuleParty returns [EObject current=null] : iv_ruleParty= ruleParty EOF ;
    public final EObject entryRuleParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParty = null;


        try {
            // InternalPactDSL.g:550:46: (iv_ruleParty= ruleParty EOF )
            // InternalPactDSL.g:551:2: iv_ruleParty= ruleParty EOF
            {
             newCompositeNode(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParty=ruleParty();

            state._fsp--;

             current =iv_ruleParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalPactDSL.g:557:1: ruleParty returns [EObject current=null] : (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:563:2: ( (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:564:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:564:2: (otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:565:3: otherlv_0= 'Party:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPartyAccess().getPartyKeyword_0());
            		
            // InternalPactDSL.g:569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:570:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:587:3: ( (lv_fullname_2_0= RULE_STRING ) )
            // InternalPactDSL.g:588:4: (lv_fullname_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:588:4: (lv_fullname_2_0= RULE_STRING )
            // InternalPactDSL.g:589:5: lv_fullname_2_0= RULE_STRING
            {
            lv_fullname_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_fullname_2_0, grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fullname",
            						lv_fullname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:605:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=27 && LA22_0<=30)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPactDSL.g:606:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:606:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:607:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleThirdParty"
    // InternalPactDSL.g:628:1: entryRuleThirdParty returns [EObject current=null] : iv_ruleThirdParty= ruleThirdParty EOF ;
    public final EObject entryRuleThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdParty = null;


        try {
            // InternalPactDSL.g:628:51: (iv_ruleThirdParty= ruleThirdParty EOF )
            // InternalPactDSL.g:629:2: iv_ruleThirdParty= ruleThirdParty EOF
            {
             newCompositeNode(grammarAccess.getThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThirdParty=ruleThirdParty();

            state._fsp--;

             current =iv_ruleThirdParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThirdParty"


    // $ANTLR start "ruleThirdParty"
    // InternalPactDSL.g:635:1: ruleThirdParty returns [EObject current=null] : (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_fullname_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:641:2: ( (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:642:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:642:2: (otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:643:3: otherlv_0= 'ThirdParty:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fullname_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:647:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:648:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:648:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:649:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:665:3: ( (lv_fullname_2_0= RULE_STRING ) )
            // InternalPactDSL.g:666:4: (lv_fullname_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:666:4: (lv_fullname_2_0= RULE_STRING )
            // InternalPactDSL.g:667:5: lv_fullname_2_0= RULE_STRING
            {
            lv_fullname_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_fullname_2_0, grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fullname",
            						lv_fullname_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:683:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=27 && LA23_0<=30)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPactDSL.g:684:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:684:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:685:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThirdPartyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThirdParty"


    // $ANTLR start "entryRuleSubjectMatter"
    // InternalPactDSL.g:706:1: entryRuleSubjectMatter returns [EObject current=null] : iv_ruleSubjectMatter= ruleSubjectMatter EOF ;
    public final EObject entryRuleSubjectMatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubjectMatter = null;


        try {
            // InternalPactDSL.g:706:54: (iv_ruleSubjectMatter= ruleSubjectMatter EOF )
            // InternalPactDSL.g:707:2: iv_ruleSubjectMatter= ruleSubjectMatter EOF
            {
             newCompositeNode(grammarAccess.getSubjectMatterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubjectMatter=ruleSubjectMatter();

            state._fsp--;

             current =iv_ruleSubjectMatter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubjectMatter"


    // $ANTLR start "ruleSubjectMatter"
    // InternalPactDSL.g:713:1: ruleSubjectMatter returns [EObject current=null] : (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) ;
    public final EObject ruleSubjectMatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_subjectMatter_2_0=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:719:2: ( (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* ) )
            // InternalPactDSL.g:720:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            {
            // InternalPactDSL.g:720:2: (otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )* )
            // InternalPactDSL.g:721:3: otherlv_0= 'SubjectMatter:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_subjectMatter_2_0= RULE_STRING ) ) ( (lv_feature_3_0= ruleFeature ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0());
            		
            // InternalPactDSL.g:725:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPactDSL.g:726:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPactDSL.g:726:4: (lv_name_1_0= RULE_ID )
            // InternalPactDSL.g:727:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubjectMatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPactDSL.g:743:3: ( (lv_subjectMatter_2_0= RULE_STRING ) )
            // InternalPactDSL.g:744:4: (lv_subjectMatter_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:744:4: (lv_subjectMatter_2_0= RULE_STRING )
            // InternalPactDSL.g:745:5: lv_subjectMatter_2_0= RULE_STRING
            {
            lv_subjectMatter_2_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_subjectMatter_2_0, grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubjectMatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subjectMatter",
            						lv_subjectMatter_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:761:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=27 && LA24_0<=30)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPactDSL.g:762:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalPactDSL.g:762:4: (lv_feature_3_0= ruleFeature )
            	    // InternalPactDSL.g:763:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubjectMatterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"imperialmsc.lmw21.pactdsl.PactDSL.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubjectMatter"


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:784:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalPactDSL.g:784:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalPactDSL.g:785:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPactDSL.g:791:1: ruleFeature returns [EObject current=null] : ( (lv_featuretype_0_0= ruleFeatureType ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject lv_featuretype_0_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:797:2: ( ( (lv_featuretype_0_0= ruleFeatureType ) ) )
            // InternalPactDSL.g:798:2: ( (lv_featuretype_0_0= ruleFeatureType ) )
            {
            // InternalPactDSL.g:798:2: ( (lv_featuretype_0_0= ruleFeatureType ) )
            // InternalPactDSL.g:799:3: (lv_featuretype_0_0= ruleFeatureType )
            {
            // InternalPactDSL.g:799:3: (lv_featuretype_0_0= ruleFeatureType )
            // InternalPactDSL.g:800:4: lv_featuretype_0_0= ruleFeatureType
            {

            				newCompositeNode(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_featuretype_0_0=ruleFeatureType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFeatureRule());
            				}
            				set(
            					current,
            					"featuretype",
            					lv_featuretype_0_0,
            					"imperialmsc.lmw21.pactdsl.PactDSL.FeatureType");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // InternalPactDSL.g:820:1: entryRuleFeatureType returns [EObject current=null] : iv_ruleFeatureType= ruleFeatureType EOF ;
    public final EObject entryRuleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureType = null;


        try {
            // InternalPactDSL.g:820:52: (iv_ruleFeatureType= ruleFeatureType EOF )
            // InternalPactDSL.g:821:2: iv_ruleFeatureType= ruleFeatureType EOF
            {
             newCompositeNode(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureType=ruleFeatureType();

            state._fsp--;

             current =iv_ruleFeatureType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalPactDSL.g:827:1: ruleFeatureType returns [EObject current=null] : (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature ) ;
    public final EObject ruleFeatureType() throws RecognitionException {
        EObject current = null;

        EObject this_DefinedTerm_0 = null;

        EObject this_Address_1 = null;

        EObject this_CompanyNumber_2 = null;

        EObject this_CustomFeature_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:833:2: ( (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature ) )
            // InternalPactDSL.g:834:2: (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature )
            {
            // InternalPactDSL.g:834:2: (this_DefinedTerm_0= ruleDefinedTerm | this_Address_1= ruleAddress | this_CompanyNumber_2= ruleCompanyNumber | this_CustomFeature_3= ruleCustomFeature )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt25=1;
                }
                break;
            case 28:
                {
                alt25=2;
                }
                break;
            case 29:
                {
                alt25=3;
                }
                break;
            case 30:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPactDSL.g:835:3: this_DefinedTerm_0= ruleDefinedTerm
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DefinedTerm_0=ruleDefinedTerm();

                    state._fsp--;


                    			current = this_DefinedTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:844:3: this_Address_1= ruleAddress
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Address_1=ruleAddress();

                    state._fsp--;


                    			current = this_Address_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:853:3: this_CompanyNumber_2= ruleCompanyNumber
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompanyNumber_2=ruleCompanyNumber();

                    state._fsp--;


                    			current = this_CompanyNumber_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:862:3: this_CustomFeature_3= ruleCustomFeature
                    {

                    			newCompositeNode(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomFeature_3=ruleCustomFeature();

                    state._fsp--;


                    			current = this_CustomFeature_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:874:1: entryRuleDefinedTerm returns [EObject current=null] : iv_ruleDefinedTerm= ruleDefinedTerm EOF ;
    public final EObject entryRuleDefinedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedTerm = null;


        try {
            // InternalPactDSL.g:874:52: (iv_ruleDefinedTerm= ruleDefinedTerm EOF )
            // InternalPactDSL.g:875:2: iv_ruleDefinedTerm= ruleDefinedTerm EOF
            {
             newCompositeNode(grammarAccess.getDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinedTerm=ruleDefinedTerm();

            state._fsp--;

             current =iv_ruleDefinedTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedTerm"


    // $ANTLR start "ruleDefinedTerm"
    // InternalPactDSL.g:881:1: ruleDefinedTerm returns [EObject current=null] : (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefinedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_definition_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:887:2: ( (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:888:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:888:2: (otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:889:3: otherlv_0= 'definedAs' ( (lv_definition_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0());
            		
            // InternalPactDSL.g:893:3: ( (lv_definition_1_0= RULE_STRING ) )
            // InternalPactDSL.g:894:4: (lv_definition_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:894:4: (lv_definition_1_0= RULE_STRING )
            // InternalPactDSL.g:895:5: lv_definition_1_0= RULE_STRING
            {
            lv_definition_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_definition_1_0, grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinedTermRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedTerm"


    // $ANTLR start "entryRuleAddress"
    // InternalPactDSL.g:915:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // InternalPactDSL.g:915:48: (iv_ruleAddress= ruleAddress EOF )
            // InternalPactDSL.g:916:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalPactDSL.g:922:1: ruleAddress returns [EObject current=null] : (otherlv_0= 'withAddress' ( (lv_address_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_address_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:928:2: ( (otherlv_0= 'withAddress' ( (lv_address_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:929:2: (otherlv_0= 'withAddress' ( (lv_address_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:929:2: (otherlv_0= 'withAddress' ( (lv_address_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:930:3: otherlv_0= 'withAddress' ( (lv_address_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getWithAddressKeyword_0());
            		
            // InternalPactDSL.g:934:3: ( (lv_address_1_0= RULE_STRING ) )
            // InternalPactDSL.g:935:4: (lv_address_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:935:4: (lv_address_1_0= RULE_STRING )
            // InternalPactDSL.g:936:5: lv_address_1_0= RULE_STRING
            {
            lv_address_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_address_1_0, grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"address",
            						lv_address_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleCompanyNumber"
    // InternalPactDSL.g:956:1: entryRuleCompanyNumber returns [EObject current=null] : iv_ruleCompanyNumber= ruleCompanyNumber EOF ;
    public final EObject entryRuleCompanyNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompanyNumber = null;


        try {
            // InternalPactDSL.g:956:54: (iv_ruleCompanyNumber= ruleCompanyNumber EOF )
            // InternalPactDSL.g:957:2: iv_ruleCompanyNumber= ruleCompanyNumber EOF
            {
             newCompositeNode(grammarAccess.getCompanyNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompanyNumber=ruleCompanyNumber();

            state._fsp--;

             current =iv_ruleCompanyNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompanyNumber"


    // $ANTLR start "ruleCompanyNumber"
    // InternalPactDSL.g:963:1: ruleCompanyNumber returns [EObject current=null] : (otherlv_0= 'withCompanyNumber' ( (lv_companyNumber_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCompanyNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_companyNumber_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:969:2: ( (otherlv_0= 'withCompanyNumber' ( (lv_companyNumber_1_0= RULE_INT ) ) ) )
            // InternalPactDSL.g:970:2: (otherlv_0= 'withCompanyNumber' ( (lv_companyNumber_1_0= RULE_INT ) ) )
            {
            // InternalPactDSL.g:970:2: (otherlv_0= 'withCompanyNumber' ( (lv_companyNumber_1_0= RULE_INT ) ) )
            // InternalPactDSL.g:971:3: otherlv_0= 'withCompanyNumber' ( (lv_companyNumber_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0());
            		
            // InternalPactDSL.g:975:3: ( (lv_companyNumber_1_0= RULE_INT ) )
            // InternalPactDSL.g:976:4: (lv_companyNumber_1_0= RULE_INT )
            {
            // InternalPactDSL.g:976:4: (lv_companyNumber_1_0= RULE_INT )
            // InternalPactDSL.g:977:5: lv_companyNumber_1_0= RULE_INT
            {
            lv_companyNumber_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_companyNumber_1_0, grammarAccess.getCompanyNumberAccess().getCompanyNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"companyNumber",
            						lv_companyNumber_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompanyNumber"


    // $ANTLR start "entryRuleCustomFeature"
    // InternalPactDSL.g:997:1: entryRuleCustomFeature returns [EObject current=null] : iv_ruleCustomFeature= ruleCustomFeature EOF ;
    public final EObject entryRuleCustomFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFeature = null;


        try {
            // InternalPactDSL.g:997:54: (iv_ruleCustomFeature= ruleCustomFeature EOF )
            // InternalPactDSL.g:998:2: iv_ruleCustomFeature= ruleCustomFeature EOF
            {
             newCompositeNode(grammarAccess.getCustomFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomFeature=ruleCustomFeature();

            state._fsp--;

             current =iv_ruleCustomFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFeature"


    // $ANTLR start "ruleCustomFeature"
    // InternalPactDSL.g:1004:1: ruleCustomFeature returns [EObject current=null] : (otherlv_0= 'withFeature' ( (lv_customFeature_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customFeature_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1010:2: ( (otherlv_0= 'withFeature' ( (lv_customFeature_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1011:2: (otherlv_0= 'withFeature' ( (lv_customFeature_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1011:2: (otherlv_0= 'withFeature' ( (lv_customFeature_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1012:3: otherlv_0= 'withFeature' ( (lv_customFeature_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0());
            		
            // InternalPactDSL.g:1016:3: ( (lv_customFeature_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1017:4: (lv_customFeature_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1017:4: (lv_customFeature_1_0= RULE_STRING )
            // InternalPactDSL.g:1018:5: lv_customFeature_1_0= RULE_STRING
            {
            lv_customFeature_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customFeature_1_0, grammarAccess.getCustomFeatureAccess().getCustomFeatureSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customFeature",
            						lv_customFeature_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:1038:1: entryRuleFormalityType returns [EObject current=null] : iv_ruleFormalityType= ruleFormalityType EOF ;
    public final EObject entryRuleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalityType = null;


        try {
            // InternalPactDSL.g:1038:54: (iv_ruleFormalityType= ruleFormalityType EOF )
            // InternalPactDSL.g:1039:2: iv_ruleFormalityType= ruleFormalityType EOF
            {
             newCompositeNode(grammarAccess.getFormalityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormalityType=ruleFormalityType();

            state._fsp--;

             current =iv_ruleFormalityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalityType"


    // $ANTLR start "ruleFormalityType"
    // InternalPactDSL.g:1045:1: ruleFormalityType returns [EObject current=null] : (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) ;
    public final EObject ruleFormalityType() throws RecognitionException {
        EObject current = null;

        EObject this_InWriting_0 = null;

        EObject this_ByEmail_1 = null;

        EObject this_GivingNotice_2 = null;

        EObject this_CustomFormality_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1051:2: ( (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality ) )
            // InternalPactDSL.g:1052:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            {
            // InternalPactDSL.g:1052:2: (this_InWriting_0= ruleInWriting | this_ByEmail_1= ruleByEmail | this_GivingNotice_2= ruleGivingNotice | this_CustomFormality_3= ruleCustomFormality )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt26=1;
                }
                break;
            case 32:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            case 37:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalPactDSL.g:1053:3: this_InWriting_0= ruleInWriting
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InWriting_0=ruleInWriting();

                    state._fsp--;


                    			current = this_InWriting_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1062:3: this_ByEmail_1= ruleByEmail
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ByEmail_1=ruleByEmail();

                    state._fsp--;


                    			current = this_ByEmail_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1071:3: this_GivingNotice_2= ruleGivingNotice
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivingNotice_2=ruleGivingNotice();

                    state._fsp--;


                    			current = this_GivingNotice_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1080:3: this_CustomFormality_3= ruleCustomFormality
                    {

                    			newCompositeNode(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomFormality_3=ruleCustomFormality();

                    state._fsp--;


                    			current = this_CustomFormality_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalityType"


    // $ANTLR start "entryRuleInWriting"
    // InternalPactDSL.g:1092:1: entryRuleInWriting returns [EObject current=null] : iv_ruleInWriting= ruleInWriting EOF ;
    public final EObject entryRuleInWriting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInWriting = null;


        try {
            // InternalPactDSL.g:1092:50: (iv_ruleInWriting= ruleInWriting EOF )
            // InternalPactDSL.g:1093:2: iv_ruleInWriting= ruleInWriting EOF
            {
             newCompositeNode(grammarAccess.getInWritingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInWriting=ruleInWriting();

            state._fsp--;

             current =iv_ruleInWriting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInWriting"


    // $ANTLR start "ruleInWriting"
    // InternalPactDSL.g:1099:1: ruleInWriting returns [EObject current=null] : (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInWriting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customWritingFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1105:2: ( (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1106:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1106:2: (otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1107:3: otherlv_0= 'inWriting' ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInWritingAccess().getInWritingKeyword_0());
            		
            // InternalPactDSL.g:1111:3: ( (lv_customWritingFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1112:4: (lv_customWritingFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1112:4: (lv_customWritingFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1113:5: lv_customWritingFormality_1_0= RULE_STRING
            {
            lv_customWritingFormality_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customWritingFormality_1_0, grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInWritingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customWritingFormality",
            						lv_customWritingFormality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInWriting"


    // $ANTLR start "entryRuleByEmail"
    // InternalPactDSL.g:1133:1: entryRuleByEmail returns [EObject current=null] : iv_ruleByEmail= ruleByEmail EOF ;
    public final EObject entryRuleByEmail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleByEmail = null;


        try {
            // InternalPactDSL.g:1133:48: (iv_ruleByEmail= ruleByEmail EOF )
            // InternalPactDSL.g:1134:2: iv_ruleByEmail= ruleByEmail EOF
            {
             newCompositeNode(grammarAccess.getByEmailRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleByEmail=ruleByEmail();

            state._fsp--;

             current =iv_ruleByEmail; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleByEmail"


    // $ANTLR start "ruleByEmail"
    // InternalPactDSL.g:1140:1: ruleByEmail returns [EObject current=null] : (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleByEmail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_emailAddress_2_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1146:2: ( (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1147:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1147:2: (otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1148:3: otherlv_0= 'byEmail' otherlv_1= 'to' ( (lv_emailAddress_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getByEmailAccess().getByEmailKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getByEmailAccess().getToKeyword_1());
            		
            // InternalPactDSL.g:1156:3: ( (lv_emailAddress_2_0= RULE_STRING ) )
            // InternalPactDSL.g:1157:4: (lv_emailAddress_2_0= RULE_STRING )
            {
            // InternalPactDSL.g:1157:4: (lv_emailAddress_2_0= RULE_STRING )
            // InternalPactDSL.g:1158:5: lv_emailAddress_2_0= RULE_STRING
            {
            lv_emailAddress_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_emailAddress_2_0, grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getByEmailRule());
            					}
            					setWithLastConsumed(
            						current,
            						"emailAddress",
            						lv_emailAddress_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleByEmail"


    // $ANTLR start "entryRuleGivingNotice"
    // InternalPactDSL.g:1178:1: entryRuleGivingNotice returns [EObject current=null] : iv_ruleGivingNotice= ruleGivingNotice EOF ;
    public final EObject entryRuleGivingNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivingNotice = null;


        try {
            // InternalPactDSL.g:1178:53: (iv_ruleGivingNotice= ruleGivingNotice EOF )
            // InternalPactDSL.g:1179:2: iv_ruleGivingNotice= ruleGivingNotice EOF
            {
             newCompositeNode(grammarAccess.getGivingNoticeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivingNotice=ruleGivingNotice();

            state._fsp--;

             current =iv_ruleGivingNotice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivingNotice"


    // $ANTLR start "ruleGivingNotice"
    // InternalPactDSL.g:1185:1: ruleGivingNotice returns [EObject current=null] : (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )? ) ;
    public final EObject ruleGivingNotice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_numDays_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1191:2: ( (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )? ) )
            // InternalPactDSL.g:1192:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )? )
            {
            // InternalPactDSL.g:1192:2: (otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )? )
            // InternalPactDSL.g:1193:3: otherlv_0= 'givingNoticeTo' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0());
            		
            // InternalPactDSL.g:1197:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1198:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1198:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1199:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivingNoticeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1210:3: (otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPactDSL.g:1211:4: otherlv_2= 'withDuration' ( (lv_numDays_3_0= RULE_INT ) ) otherlv_4= 'days'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0());
                    			
                    // InternalPactDSL.g:1215:4: ( (lv_numDays_3_0= RULE_INT ) )
                    // InternalPactDSL.g:1216:5: (lv_numDays_3_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1216:5: (lv_numDays_3_0= RULE_INT )
                    // InternalPactDSL.g:1217:6: lv_numDays_3_0= RULE_INT
                    {
                    lv_numDays_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_numDays_3_0, grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGivingNoticeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numDays",
                    							lv_numDays_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivingNotice"


    // $ANTLR start "entryRuleCustomFormality"
    // InternalPactDSL.g:1242:1: entryRuleCustomFormality returns [EObject current=null] : iv_ruleCustomFormality= ruleCustomFormality EOF ;
    public final EObject entryRuleCustomFormality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomFormality = null;


        try {
            // InternalPactDSL.g:1242:56: (iv_ruleCustomFormality= ruleCustomFormality EOF )
            // InternalPactDSL.g:1243:2: iv_ruleCustomFormality= ruleCustomFormality EOF
            {
             newCompositeNode(grammarAccess.getCustomFormalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomFormality=ruleCustomFormality();

            state._fsp--;

             current =iv_ruleCustomFormality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomFormality"


    // $ANTLR start "ruleCustomFormality"
    // InternalPactDSL.g:1249:1: ruleCustomFormality returns [EObject current=null] : (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomFormality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customFormality_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1255:2: ( (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1256:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1256:2: (otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1257:3: otherlv_0= 'ContractFormality' ( (lv_customFormality_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0());
            		
            // InternalPactDSL.g:1261:3: ( (lv_customFormality_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1262:4: (lv_customFormality_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1262:4: (lv_customFormality_1_0= RULE_STRING )
            // InternalPactDSL.g:1263:5: lv_customFormality_1_0= RULE_STRING
            {
            lv_customFormality_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customFormality_1_0, grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomFormalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customFormality",
            						lv_customFormality_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomFormality"


    // $ANTLR start "entryRuleActionType"
    // InternalPactDSL.g:1283:1: entryRuleActionType returns [EObject current=null] : iv_ruleActionType= ruleActionType EOF ;
    public final EObject entryRuleActionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionType = null;


        try {
            // InternalPactDSL.g:1283:51: (iv_ruleActionType= ruleActionType EOF )
            // InternalPactDSL.g:1284:2: iv_ruleActionType= ruleActionType EOF
            {
             newCompositeNode(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionType=ruleActionType();

            state._fsp--;

             current =iv_ruleActionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalPactDSL.g:1290:1: ruleActionType returns [EObject current=null] : (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent | this_CustomAction_2= ruleCustomAction ) ;
    public final EObject ruleActionType() throws RecognitionException {
        EObject current = null;

        EObject this_GivenConsent_0 = null;

        EObject this_GivenWrittenConsent_1 = null;

        EObject this_CustomAction_2 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1296:2: ( (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent | this_CustomAction_2= ruleCustomAction ) )
            // InternalPactDSL.g:1297:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent | this_CustomAction_2= ruleCustomAction )
            {
            // InternalPactDSL.g:1297:2: (this_GivenConsent_0= ruleGivenConsent | this_GivenWrittenConsent_1= ruleGivenWrittenConsent | this_CustomAction_2= ruleCustomAction )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    alt28=3;
                    }
                    break;
                case 39:
                    {
                    alt28=2;
                    }
                    break;
                case 38:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPactDSL.g:1298:3: this_GivenConsent_0= ruleGivenConsent
                    {

                    			newCompositeNode(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivenConsent_0=ruleGivenConsent();

                    state._fsp--;


                    			current = this_GivenConsent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1307:3: this_GivenWrittenConsent_1= ruleGivenWrittenConsent
                    {

                    			newCompositeNode(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GivenWrittenConsent_1=ruleGivenWrittenConsent();

                    state._fsp--;


                    			current = this_GivenWrittenConsent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1316:3: this_CustomAction_2= ruleCustomAction
                    {

                    			newCompositeNode(grammarAccess.getActionTypeAccess().getCustomActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomAction_2=ruleCustomAction();

                    state._fsp--;


                    			current = this_CustomAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGivenConsent"
    // InternalPactDSL.g:1328:1: entryRuleGivenConsent returns [EObject current=null] : iv_ruleGivenConsent= ruleGivenConsent EOF ;
    public final EObject entryRuleGivenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenConsent = null;


        try {
            // InternalPactDSL.g:1328:53: (iv_ruleGivenConsent= ruleGivenConsent EOF )
            // InternalPactDSL.g:1329:2: iv_ruleGivenConsent= ruleGivenConsent EOF
            {
             newCompositeNode(grammarAccess.getGivenConsentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenConsent=ruleGivenConsent();

            state._fsp--;

             current =iv_ruleGivenConsent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivenConsent"


    // $ANTLR start "ruleGivenConsent"
    // InternalPactDSL.g:1335:1: ruleGivenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) ;
    public final EObject ruleGivenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1341:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' ) )
            // InternalPactDSL.g:1342:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            {
            // InternalPactDSL.g:1342:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent' )
            // InternalPactDSL.g:1343:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveConsent'
            {
            // InternalPactDSL.g:1343:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1344:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1344:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1345:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivenConsent"


    // $ANTLR start "entryRuleGivenWrittenConsent"
    // InternalPactDSL.g:1364:1: entryRuleGivenWrittenConsent returns [EObject current=null] : iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF ;
    public final EObject entryRuleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGivenWrittenConsent = null;


        try {
            // InternalPactDSL.g:1364:60: (iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:1365:2: iv_ruleGivenWrittenConsent= ruleGivenWrittenConsent EOF
            {
             newCompositeNode(grammarAccess.getGivenWrittenConsentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGivenWrittenConsent=ruleGivenWrittenConsent();

            state._fsp--;

             current =iv_ruleGivenWrittenConsent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGivenWrittenConsent"


    // $ANTLR start "ruleGivenWrittenConsent"
    // InternalPactDSL.g:1371:1: ruleGivenWrittenConsent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) ;
    public final EObject ruleGivenWrittenConsent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1377:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:1378:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:1378:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent' )
            // InternalPactDSL.g:1379:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'gaveWrittenConsent'
            {
            // InternalPactDSL.g:1379:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1380:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1380:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1381:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGivenWrittenConsentRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGivenWrittenConsent"


    // $ANTLR start "entryRuleCustomAction"
    // InternalPactDSL.g:1400:1: entryRuleCustomAction returns [EObject current=null] : iv_ruleCustomAction= ruleCustomAction EOF ;
    public final EObject entryRuleCustomAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAction = null;


        try {
            // InternalPactDSL.g:1400:53: (iv_ruleCustomAction= ruleCustomAction EOF )
            // InternalPactDSL.g:1401:2: iv_ruleCustomAction= ruleCustomAction EOF
            {
             newCompositeNode(grammarAccess.getCustomActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomAction=ruleCustomAction();

            state._fsp--;

             current =iv_ruleCustomAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomAction"


    // $ANTLR start "ruleCustomAction"
    // InternalPactDSL.g:1407:1: ruleCustomAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_customAction_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customAction_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1413:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_customAction_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:1414:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_customAction_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:1414:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_customAction_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:1415:3: ( (otherlv_0= RULE_ID ) ) ( (lv_customAction_1_0= RULE_STRING ) )
            {
            // InternalPactDSL.g:1415:3: ( (otherlv_0= RULE_ID ) )
            // InternalPactDSL.g:1416:4: (otherlv_0= RULE_ID )
            {
            // InternalPactDSL.g:1416:4: (otherlv_0= RULE_ID )
            // InternalPactDSL.g:1417:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getCustomActionAccess().getSuperTypePartyCrossReference_0_0());
            				

            }


            }

            // InternalPactDSL.g:1428:3: ( (lv_customAction_1_0= RULE_STRING ) )
            // InternalPactDSL.g:1429:4: (lv_customAction_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:1429:4: (lv_customAction_1_0= RULE_STRING )
            // InternalPactDSL.g:1430:5: lv_customAction_1_0= RULE_STRING
            {
            lv_customAction_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customAction_1_0, grammarAccess.getCustomActionAccess().getCustomActionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customAction",
            						lv_customAction_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomAction"


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:1450:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // InternalPactDSL.g:1450:50: (iv_ruleStateType= ruleStateType EOF )
            // InternalPactDSL.g:1451:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // InternalPactDSL.g:1457:1: ruleStateType returns [EObject current=null] : (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse | this_CustomState_2= ruleCustomState ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        EObject this_Ownership_0 = null;

        EObject this_RightToUse_1 = null;

        EObject this_CustomState_2 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1463:2: ( (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse | this_CustomState_2= ruleCustomState ) )
            // InternalPactDSL.g:1464:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse | this_CustomState_2= ruleCustomState )
            {
            // InternalPactDSL.g:1464:2: (this_Ownership_0= ruleOwnership | this_RightToUse_1= ruleRightToUse | this_CustomState_2= ruleCustomState )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt29=1;
                }
                break;
            case 43:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalPactDSL.g:1465:3: this_Ownership_0= ruleOwnership
                    {

                    			newCompositeNode(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ownership_0=ruleOwnership();

                    state._fsp--;


                    			current = this_Ownership_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1474:3: this_RightToUse_1= ruleRightToUse
                    {

                    			newCompositeNode(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightToUse_1=ruleRightToUse();

                    state._fsp--;


                    			current = this_RightToUse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1483:3: this_CustomState_2= ruleCustomState
                    {

                    			newCompositeNode(grammarAccess.getStateTypeAccess().getCustomStateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomState_2=ruleCustomState();

                    state._fsp--;


                    			current = this_CustomState_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleOwnership"
    // InternalPactDSL.g:1495:1: entryRuleOwnership returns [EObject current=null] : iv_ruleOwnership= ruleOwnership EOF ;
    public final EObject entryRuleOwnership() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOwnership = null;


        try {
            // InternalPactDSL.g:1495:50: (iv_ruleOwnership= ruleOwnership EOF )
            // InternalPactDSL.g:1496:2: iv_ruleOwnership= ruleOwnership EOF
            {
             newCompositeNode(grammarAccess.getOwnershipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOwnership=ruleOwnership();

            state._fsp--;

             current =iv_ruleOwnership; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOwnership"


    // $ANTLR start "ruleOwnership"
    // InternalPactDSL.g:1502:1: ruleOwnership returns [EObject current=null] : (otherlv_0= 'Ownership:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customOwnership_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleOwnership() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_customOwnership_5_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1508:2: ( (otherlv_0= 'Ownership:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customOwnership_5_0= RULE_STRING ) )? ) )
            // InternalPactDSL.g:1509:2: (otherlv_0= 'Ownership:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customOwnership_5_0= RULE_STRING ) )? )
            {
            // InternalPactDSL.g:1509:2: (otherlv_0= 'Ownership:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customOwnership_5_0= RULE_STRING ) )? )
            // InternalPactDSL.g:1510:3: otherlv_0= 'Ownership:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customOwnership_5_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOwnershipAccess().getOwnershipKeyword_0());
            		
            // InternalPactDSL.g:1514:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1515:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1515:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1516:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOwnershipRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1527:3: (otherlv_2= 'owns' | otherlv_3= 'doesNotOwn' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPactDSL.g:1528:4: otherlv_2= 'owns'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getOwnershipAccess().getOwnsKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1533:4: otherlv_3= 'doesNotOwn'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getOwnershipAccess().getDoesNotOwnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1538:3: ( (otherlv_4= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPactDSL.g:1539:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:1539:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:1540:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOwnershipRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:1551:3: ( (lv_customOwnership_5_0= RULE_STRING ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPactDSL.g:1552:4: (lv_customOwnership_5_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:1552:4: (lv_customOwnership_5_0= RULE_STRING )
                    // InternalPactDSL.g:1553:5: lv_customOwnership_5_0= RULE_STRING
                    {
                    lv_customOwnership_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_customOwnership_5_0, grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOwnershipRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"customOwnership",
                    						lv_customOwnership_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOwnership"


    // $ANTLR start "entryRuleRightToUse"
    // InternalPactDSL.g:1573:1: entryRuleRightToUse returns [EObject current=null] : iv_ruleRightToUse= ruleRightToUse EOF ;
    public final EObject entryRuleRightToUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightToUse = null;


        try {
            // InternalPactDSL.g:1573:51: (iv_ruleRightToUse= ruleRightToUse EOF )
            // InternalPactDSL.g:1574:2: iv_ruleRightToUse= ruleRightToUse EOF
            {
             newCompositeNode(grammarAccess.getRightToUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightToUse=ruleRightToUse();

            state._fsp--;

             current =iv_ruleRightToUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightToUse"


    // $ANTLR start "ruleRightToUse"
    // InternalPactDSL.g:1580:1: ruleRightToUse returns [EObject current=null] : (otherlv_0= 'RightToUse:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customUsage_5_0= RULE_STRING ) )? ) ;
    public final EObject ruleRightToUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_customUsage_5_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1586:2: ( (otherlv_0= 'RightToUse:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customUsage_5_0= RULE_STRING ) )? ) )
            // InternalPactDSL.g:1587:2: (otherlv_0= 'RightToUse:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customUsage_5_0= RULE_STRING ) )? )
            {
            // InternalPactDSL.g:1587:2: (otherlv_0= 'RightToUse:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customUsage_5_0= RULE_STRING ) )? )
            // InternalPactDSL.g:1588:3: otherlv_0= 'RightToUse:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' ) ( (otherlv_4= RULE_ID ) )? ( (lv_customUsage_5_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRightToUseAccess().getRightToUseKeyword_0());
            		
            // InternalPactDSL.g:1592:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1593:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1593:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1594:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRightToUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1605:3: (otherlv_2= 'mayUse' | otherlv_3= 'mayNotUse' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            else if ( (LA33_0==45) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalPactDSL.g:1606:4: otherlv_2= 'mayUse'
                    {
                    otherlv_2=(Token)match(input,44,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getRightToUseAccess().getMayUseKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1611:4: otherlv_3= 'mayNotUse'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getRightToUseAccess().getMayNotUseKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:1616:3: ( (otherlv_4= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPactDSL.g:1617:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:1617:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:1618:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRightToUseRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:1629:3: ( (lv_customUsage_5_0= RULE_STRING ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPactDSL.g:1630:4: (lv_customUsage_5_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:1630:4: (lv_customUsage_5_0= RULE_STRING )
                    // InternalPactDSL.g:1631:5: lv_customUsage_5_0= RULE_STRING
                    {
                    lv_customUsage_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_customUsage_5_0, grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRightToUseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"customUsage",
                    						lv_customUsage_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightToUse"


    // $ANTLR start "entryRuleCustomState"
    // InternalPactDSL.g:1651:1: entryRuleCustomState returns [EObject current=null] : iv_ruleCustomState= ruleCustomState EOF ;
    public final EObject entryRuleCustomState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomState = null;


        try {
            // InternalPactDSL.g:1651:52: (iv_ruleCustomState= ruleCustomState EOF )
            // InternalPactDSL.g:1652:2: iv_ruleCustomState= ruleCustomState EOF
            {
             newCompositeNode(grammarAccess.getCustomStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomState=ruleCustomState();

            state._fsp--;

             current =iv_ruleCustomState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomState"


    // $ANTLR start "ruleCustomState"
    // InternalPactDSL.g:1658:1: ruleCustomState returns [EObject current=null] : (otherlv_0= 'State:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ( (lv_customState_3_0= RULE_STRING ) )? ) ;
    public final EObject ruleCustomState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_customState_3_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1664:2: ( (otherlv_0= 'State:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ( (lv_customState_3_0= RULE_STRING ) )? ) )
            // InternalPactDSL.g:1665:2: (otherlv_0= 'State:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ( (lv_customState_3_0= RULE_STRING ) )? )
            {
            // InternalPactDSL.g:1665:2: (otherlv_0= 'State:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ( (lv_customState_3_0= RULE_STRING ) )? )
            // InternalPactDSL.g:1666:3: otherlv_0= 'State:' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ( (lv_customState_3_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomStateAccess().getStateKeyword_0());
            		
            // InternalPactDSL.g:1670:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1671:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1671:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1672:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomStateAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:1683:3: ( (otherlv_2= RULE_ID ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPactDSL.g:1684:4: (otherlv_2= RULE_ID )
                    {
                    // InternalPactDSL.g:1684:4: (otherlv_2= RULE_ID )
                    // InternalPactDSL.g:1685:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCustomStateRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(otherlv_2, grammarAccess.getCustomStateAccess().getSuperTypeSubjectMatterCrossReference_2_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:1696:3: ( (lv_customState_3_0= RULE_STRING ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPactDSL.g:1697:4: (lv_customState_3_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:1697:4: (lv_customState_3_0= RULE_STRING )
                    // InternalPactDSL.g:1698:5: lv_customState_3_0= RULE_STRING
                    {
                    lv_customState_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_customState_3_0, grammarAccess.getCustomStateAccess().getCustomStateSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCustomStateRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"customState",
                    						lv_customState_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomState"


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:1718:1: entryRulePrimaryObligationType returns [EObject current=null] : iv_rulePrimaryObligationType= rulePrimaryObligationType EOF ;
    public final EObject entryRulePrimaryObligationType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryObligationType = null;


        try {
            // InternalPactDSL.g:1718:62: (iv_rulePrimaryObligationType= rulePrimaryObligationType EOF )
            // InternalPactDSL.g:1719:2: iv_rulePrimaryObligationType= rulePrimaryObligationType EOF
            {
             newCompositeNode(grammarAccess.getPrimaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryObligationType=rulePrimaryObligationType();

            state._fsp--;

             current =iv_rulePrimaryObligationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryObligationType"


    // $ANTLR start "rulePrimaryObligationType"
    // InternalPactDSL.g:1725:1: rulePrimaryObligationType returns [EObject current=null] : (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | this_CustomObligation_6= ruleCustomObligation ) ;
    public final EObject rulePrimaryObligationType() throws RecognitionException {
        EObject current = null;

        EObject this_PaymentObligation_0 = null;

        EObject this_DeliveryObligation_1 = null;

        EObject this_TransferObligation_2 = null;

        EObject this_LicenceObligation_3 = null;

        EObject this_ConstraintParty_4 = null;

        EObject this_ConstraintThirdParty_5 = null;

        EObject this_CustomObligation_6 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:1731:2: ( (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | this_CustomObligation_6= ruleCustomObligation ) )
            // InternalPactDSL.g:1732:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | this_CustomObligation_6= ruleCustomObligation )
            {
            // InternalPactDSL.g:1732:2: (this_PaymentObligation_0= rulePaymentObligation | this_DeliveryObligation_1= ruleDeliveryObligation | this_TransferObligation_2= ruleTransferObligation | this_LicenceObligation_3= ruleLicenceObligation | this_ConstraintParty_4= ruleConstraintParty | this_ConstraintThirdParty_5= ruleConstraintThirdParty | this_CustomObligation_6= ruleCustomObligation )
            int alt38=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 52:
                {
                alt38=2;
                }
                break;
            case 54:
                {
                alt38=3;
                }
                break;
            case 56:
                {
                alt38=4;
                }
                break;
            case 60:
                {
                alt38=5;
                }
                break;
            case 62:
                {
                alt38=6;
                }
                break;
            case 66:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalPactDSL.g:1733:3: this_PaymentObligation_0= rulePaymentObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaymentObligation_0=rulePaymentObligation();

                    state._fsp--;


                    			current = this_PaymentObligation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1742:3: this_DeliveryObligation_1= ruleDeliveryObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeliveryObligation_1=ruleDeliveryObligation();

                    state._fsp--;


                    			current = this_DeliveryObligation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1751:3: this_TransferObligation_2= ruleTransferObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransferObligation_2=ruleTransferObligation();

                    state._fsp--;


                    			current = this_TransferObligation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1760:3: this_LicenceObligation_3= ruleLicenceObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LicenceObligation_3=ruleLicenceObligation();

                    state._fsp--;


                    			current = this_LicenceObligation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1769:3: this_ConstraintParty_4= ruleConstraintParty
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintParty_4=ruleConstraintParty();

                    state._fsp--;


                    			current = this_ConstraintParty_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPactDSL.g:1778:3: this_ConstraintThirdParty_5= ruleConstraintThirdParty
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConstraintThirdParty_5=ruleConstraintThirdParty();

                    state._fsp--;


                    			current = this_ConstraintThirdParty_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPactDSL.g:1787:3: this_CustomObligation_6= ruleCustomObligation
                    {

                    			newCompositeNode(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomObligation_6=ruleCustomObligation();

                    state._fsp--;


                    			current = this_CustomObligation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryObligationType"


    // $ANTLR start "entryRulePaymentObligation"
    // InternalPactDSL.g:1799:1: entryRulePaymentObligation returns [EObject current=null] : iv_rulePaymentObligation= rulePaymentObligation EOF ;
    public final EObject entryRulePaymentObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentObligation = null;


        try {
            // InternalPactDSL.g:1799:58: (iv_rulePaymentObligation= rulePaymentObligation EOF )
            // InternalPactDSL.g:1800:2: iv_rulePaymentObligation= rulePaymentObligation EOF
            {
             newCompositeNode(grammarAccess.getPaymentObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaymentObligation=rulePaymentObligation();

            state._fsp--;

             current =iv_rulePaymentObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaymentObligation"


    // $ANTLR start "rulePaymentObligation"
    // InternalPactDSL.g:1806:1: rulePaymentObligation returns [EObject current=null] : (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject rulePaymentObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sum_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1812:2: ( (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1813:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1813:2: (otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1814:3: otherlv_0= 'PaymentObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0());
            		
            // InternalPactDSL.g:1818:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1819:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1819:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1820:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getPaymentObligationAccess().getPayKeyword_3());
            		
            // InternalPactDSL.g:1839:3: ( (lv_sum_4_0= RULE_INT ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPactDSL.g:1840:4: (lv_sum_4_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:1840:4: (lv_sum_4_0= RULE_INT )
            	    // InternalPactDSL.g:1841:5: lv_sum_4_0= RULE_INT
            	    {
            	    lv_sum_4_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            	    					newLeafNode(lv_sum_4_0, grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPaymentObligationRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"sum",
            	    						lv_sum_4_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getPaymentObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1861:3: ( (otherlv_6= RULE_ID ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPactDSL.g:1862:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1862:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:1863:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPaymentObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_6, grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // InternalPactDSL.g:1874:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPactDSL.g:1875:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getPaymentObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:1883:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:1884:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1884:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:1885:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1901:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:1902:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1902:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:1903:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:1919:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:1920:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:1920:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:1921:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPaymentObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaymentObligation"


    // $ANTLR start "entryRuleDeliveryObligation"
    // InternalPactDSL.g:1942:1: entryRuleDeliveryObligation returns [EObject current=null] : iv_ruleDeliveryObligation= ruleDeliveryObligation EOF ;
    public final EObject entryRuleDeliveryObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeliveryObligation = null;


        try {
            // InternalPactDSL.g:1942:59: (iv_ruleDeliveryObligation= ruleDeliveryObligation EOF )
            // InternalPactDSL.g:1943:2: iv_ruleDeliveryObligation= ruleDeliveryObligation EOF
            {
             newCompositeNode(grammarAccess.getDeliveryObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeliveryObligation=ruleDeliveryObligation();

            state._fsp--;

             current =iv_ruleDeliveryObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeliveryObligation"


    // $ANTLR start "ruleDeliveryObligation"
    // InternalPactDSL.g:1949:1: ruleDeliveryObligation returns [EObject current=null] : (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDeliveryObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:1955:2: ( (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:1956:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:1956:2: (otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:1957:3: otherlv_0= 'DeliveryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'deliver' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0());
            		
            // InternalPactDSL.g:1961:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:1962:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:1962:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:1963:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getDeliveryObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3());
            		
            // InternalPactDSL.g:1982:3: ( (otherlv_4= RULE_ID ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPactDSL.g:1983:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:1983:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:1984:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getDeliveryObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:1999:3: ( (otherlv_6= RULE_ID ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPactDSL.g:2000:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2000:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2001:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDeliveryObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // InternalPactDSL.g:2012:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPactDSL.g:2013:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:2021:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:2022:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2022:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:2023:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2039:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:2040:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2040:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:2041:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2057:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:2058:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2058:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:2059:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeliveryObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeliveryObligation"


    // $ANTLR start "entryRuleTransferObligation"
    // InternalPactDSL.g:2080:1: entryRuleTransferObligation returns [EObject current=null] : iv_ruleTransferObligation= ruleTransferObligation EOF ;
    public final EObject entryRuleTransferObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferObligation = null;


        try {
            // InternalPactDSL.g:2080:59: (iv_ruleTransferObligation= ruleTransferObligation EOF )
            // InternalPactDSL.g:2081:2: iv_ruleTransferObligation= ruleTransferObligation EOF
            {
             newCompositeNode(grammarAccess.getTransferObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransferObligation=ruleTransferObligation();

            state._fsp--;

             current =iv_ruleTransferObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransferObligation"


    // $ANTLR start "ruleTransferObligation"
    // InternalPactDSL.g:2087:1: ruleTransferObligation returns [EObject current=null] : (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTransferObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_day_9_0=null;
        Token lv_month_10_0=null;
        Token lv_year_11_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2093:2: ( (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:2094:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:2094:2: (otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:2095:3: otherlv_0= 'TransferObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'transfer' ( (otherlv_4= RULE_ID ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0());
            		
            // InternalPactDSL.g:2099:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2100:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2100:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2101:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransferObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getTransferObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,55,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTransferObligationAccess().getTransferKeyword_3());
            		
            // InternalPactDSL.g:2120:3: ( (otherlv_4= RULE_ID ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPactDSL.g:2121:4: (otherlv_4= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2121:4: (otherlv_4= RULE_ID )
            	    // InternalPactDSL.g:2122:5: otherlv_4= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getTransferObligationAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:2137:3: ( (otherlv_6= RULE_ID ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPactDSL.g:2138:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2138:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2139:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTransferObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_6, grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // InternalPactDSL.g:2150:3: (otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPactDSL.g:2151:4: otherlv_7= 'by' otherlv_8= 'date' ( (lv_day_9_0= RULE_INT ) ) ( (lv_month_10_0= RULE_INT ) ) ( (lv_year_11_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_35); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransferObligationAccess().getByKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransferObligationAccess().getDateKeyword_7_1());
                    			
                    // InternalPactDSL.g:2159:4: ( (lv_day_9_0= RULE_INT ) )
                    // InternalPactDSL.g:2160:5: (lv_day_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2160:5: (lv_day_9_0= RULE_INT )
                    // InternalPactDSL.g:2161:6: lv_day_9_0= RULE_INT
                    {
                    lv_day_9_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_day_9_0, grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2177:4: ( (lv_month_10_0= RULE_INT ) )
                    // InternalPactDSL.g:2178:5: (lv_month_10_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2178:5: (lv_month_10_0= RULE_INT )
                    // InternalPactDSL.g:2179:6: lv_month_10_0= RULE_INT
                    {
                    lv_month_10_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_month_10_0, grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2195:4: ( (lv_year_11_0= RULE_INT ) )
                    // InternalPactDSL.g:2196:5: (lv_year_11_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2196:5: (lv_year_11_0= RULE_INT )
                    // InternalPactDSL.g:2197:6: lv_year_11_0= RULE_INT
                    {
                    lv_year_11_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_11_0, grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransferObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransferObligation"


    // $ANTLR start "entryRuleLicenceObligation"
    // InternalPactDSL.g:2218:1: entryRuleLicenceObligation returns [EObject current=null] : iv_ruleLicenceObligation= ruleLicenceObligation EOF ;
    public final EObject entryRuleLicenceObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicenceObligation = null;


        try {
            // InternalPactDSL.g:2218:58: (iv_ruleLicenceObligation= ruleLicenceObligation EOF )
            // InternalPactDSL.g:2219:2: iv_ruleLicenceObligation= ruleLicenceObligation EOF
            {
             newCompositeNode(grammarAccess.getLicenceObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLicenceObligation=ruleLicenceObligation();

            state._fsp--;

             current =iv_ruleLicenceObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLicenceObligation"


    // $ANTLR start "ruleLicenceObligation"
    // InternalPactDSL.g:2225:1: ruleLicenceObligation returns [EObject current=null] : (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* ) ;
    public final EObject ruleLicenceObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_day_11_0=null;
        Token lv_month_12_0=null;
        Token lv_year_13_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2231:2: ( (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* ) )
            // InternalPactDSL.g:2232:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* )
            {
            // InternalPactDSL.g:2232:2: (otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )* )
            // InternalPactDSL.g:2233:3: otherlv_0= 'LicenceObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'grant' otherlv_4= 'Licence' otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'to' ( (otherlv_8= RULE_ID ) )+ (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0());
            		
            // InternalPactDSL.g:2237:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2238:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2238:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2239:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLicenceObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getLicenceObligationAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getLicenceObligationAccess().getGrantKeyword_3());
            		
            otherlv_4=(Token)match(input,58,FOLLOW_41); 

            			newLeafNode(otherlv_4, grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4());
            		
            otherlv_5=(Token)match(input,59,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getLicenceObligationAccess().getInKeyword_5());
            		
            // InternalPactDSL.g:2266:3: ( (otherlv_6= RULE_ID ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPactDSL.g:2267:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2267:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2268:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    					newLeafNode(otherlv_6, grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_7=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getLicenceObligationAccess().getToKeyword_7());
            		
            // InternalPactDSL.g:2283:3: ( (otherlv_8= RULE_ID ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPactDSL.g:2284:4: (otherlv_8= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2284:4: (otherlv_8= RULE_ID )
            	    // InternalPactDSL.g:2285:5: otherlv_8= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    					}
            	    				
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    					newLeafNode(otherlv_8, grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            // InternalPactDSL.g:2296:3: (otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==50) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPactDSL.g:2297:4: otherlv_9= 'by' otherlv_10= 'date' ( (lv_day_11_0= RULE_INT ) ) ( (lv_month_12_0= RULE_INT ) ) ( (lv_year_13_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,50,FOLLOW_35); 

            	    				newLeafNode(otherlv_9, grammarAccess.getLicenceObligationAccess().getByKeyword_9_0());
            	    			
            	    otherlv_10=(Token)match(input,51,FOLLOW_18); 

            	    				newLeafNode(otherlv_10, grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1());
            	    			
            	    // InternalPactDSL.g:2305:4: ( (lv_day_11_0= RULE_INT ) )
            	    // InternalPactDSL.g:2306:5: (lv_day_11_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2306:5: (lv_day_11_0= RULE_INT )
            	    // InternalPactDSL.g:2307:6: lv_day_11_0= RULE_INT
            	    {
            	    lv_day_11_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_day_11_0, grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"day",
            	    							lv_day_11_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:2323:4: ( (lv_month_12_0= RULE_INT ) )
            	    // InternalPactDSL.g:2324:5: (lv_month_12_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2324:5: (lv_month_12_0= RULE_INT )
            	    // InternalPactDSL.g:2325:6: lv_month_12_0= RULE_INT
            	    {
            	    lv_month_12_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            	    						newLeafNode(lv_month_12_0, grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"month",
            	    							lv_month_12_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }

            	    // InternalPactDSL.g:2341:4: ( (lv_year_13_0= RULE_INT ) )
            	    // InternalPactDSL.g:2342:5: (lv_year_13_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2342:5: (lv_year_13_0= RULE_INT )
            	    // InternalPactDSL.g:2343:6: lv_year_13_0= RULE_INT
            	    {
            	    lv_year_13_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            	    						newLeafNode(lv_year_13_0, grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLicenceObligationRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"year",
            	    							lv_year_13_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:2364:1: entryRuleConstraintParty returns [EObject current=null] : iv_ruleConstraintParty= ruleConstraintParty EOF ;
    public final EObject entryRuleConstraintParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintParty = null;


        try {
            // InternalPactDSL.g:2364:56: (iv_ruleConstraintParty= ruleConstraintParty EOF )
            // InternalPactDSL.g:2365:2: iv_ruleConstraintParty= ruleConstraintParty EOF
            {
             newCompositeNode(grammarAccess.getConstraintPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintParty=ruleConstraintParty();

            state._fsp--;

             current =iv_ruleConstraintParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintParty"


    // $ANTLR start "ruleConstraintParty"
    // InternalPactDSL.g:2371:1: ruleConstraintParty returns [EObject current=null] : (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleConstraintParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forbiddenAction_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2377:2: ( (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2378:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2378:2: (otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:2379:3: otherlv_0= 'ConstraintParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0());
            		
            // InternalPactDSL.g:2383:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2384:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2384:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2385:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2400:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2401:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2401:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2402:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

            					newLeafNode(lv_forbiddenAction_3_0, grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forbiddenAction",
            						lv_forbiddenAction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2418:3: ( (otherlv_4= RULE_ID ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPactDSL.g:2419:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2419:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2420:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_45); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2431:3: (otherlv_5= 'to' ( (otherlv_6= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==33) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPactDSL.g:2432:4: otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstraintPartyAccess().getToKeyword_5_0());
                    			
                    // InternalPactDSL.g:2436:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:2437:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:2437:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:2438:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintPartyRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintParty"


    // $ANTLR start "entryRuleConstraintThirdParty"
    // InternalPactDSL.g:2454:1: entryRuleConstraintThirdParty returns [EObject current=null] : iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF ;
    public final EObject entryRuleConstraintThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintThirdParty = null;


        try {
            // InternalPactDSL.g:2454:61: (iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:2455:2: iv_ruleConstraintThirdParty= ruleConstraintThirdParty EOF
            {
             newCompositeNode(grammarAccess.getConstraintThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraintThirdParty=ruleConstraintThirdParty();

            state._fsp--;

             current =iv_ruleConstraintThirdParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintThirdParty"


    // $ANTLR start "ruleConstraintThirdParty"
    // InternalPactDSL.g:2461:1: ruleConstraintThirdParty returns [EObject current=null] : (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) ;
    public final EObject ruleConstraintThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_forbiddenAction_3_0=null;
        Token otherlv_4=null;
        Token lv_additionalInfo_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2467:2: ( (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:2468:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:2468:2: (otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )? )
            // InternalPactDSL.g:2469:3: otherlv_0= 'ConstraintThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'mustNot' ( (lv_forbiddenAction_3_0= RULE_STRING ) ) ( (otherlv_4= RULE_ID ) )? ( (lv_additionalInfo_5_0= RULE_STRING ) )? (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )? (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,62,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:2473:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2474:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2474:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2475:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2());
            		
            // InternalPactDSL.g:2490:3: ( (lv_forbiddenAction_3_0= RULE_STRING ) )
            // InternalPactDSL.g:2491:4: (lv_forbiddenAction_3_0= RULE_STRING )
            {
            // InternalPactDSL.g:2491:4: (lv_forbiddenAction_3_0= RULE_STRING )
            // InternalPactDSL.g:2492:5: lv_forbiddenAction_3_0= RULE_STRING
            {
            lv_forbiddenAction_3_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

            					newLeafNode(lv_forbiddenAction_3_0, grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"forbiddenAction",
            						lv_forbiddenAction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2508:3: ( (otherlv_4= RULE_ID ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPactDSL.g:2509:4: (otherlv_4= RULE_ID )
                    {
                    // InternalPactDSL.g:2509:4: (otherlv_4= RULE_ID )
                    // InternalPactDSL.g:2510:5: otherlv_4= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    					}
                    				
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_47); 

                    					newLeafNode(otherlv_4, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0());
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2521:3: ( (lv_additionalInfo_5_0= RULE_STRING ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPactDSL.g:2522:4: (lv_additionalInfo_5_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:2522:4: (lv_additionalInfo_5_0= RULE_STRING )
                    // InternalPactDSL.g:2523:5: lv_additionalInfo_5_0= RULE_STRING
                    {
                    lv_additionalInfo_5_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

                    					newLeafNode(lv_additionalInfo_5_0, grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"additionalInfo",
                    						lv_additionalInfo_5_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2539:3: (otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==33) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPactDSL.g:2540:4: otherlv_6= 'to' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0());
                    			
                    // InternalPactDSL.g:2544:4: ( (otherlv_7= RULE_ID ) )
                    // InternalPactDSL.g:2545:5: (otherlv_7= RULE_ID )
                    {
                    // InternalPactDSL.g:2545:5: (otherlv_7= RULE_ID )
                    // InternalPactDSL.g:2546:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(otherlv_7, grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalPactDSL.g:2558:3: (otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPactDSL.g:2559:4: otherlv_8= 'unless' otherlv_9= 'withWrittenConsent' otherlv_10= 'of' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,64,FOLLOW_51); 

                    				newLeafNode(otherlv_9, grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1());
                    			
                    otherlv_10=(Token)match(input,65,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2());
                    			
                    // InternalPactDSL.g:2571:4: ( (otherlv_11= RULE_ID ) )
                    // InternalPactDSL.g:2572:5: (otherlv_11= RULE_ID )
                    {
                    // InternalPactDSL.g:2572:5: (otherlv_11= RULE_ID )
                    // InternalPactDSL.g:2573:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintThirdPartyRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_11, grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintThirdParty"


    // $ANTLR start "entryRuleCustomObligation"
    // InternalPactDSL.g:2589:1: entryRuleCustomObligation returns [EObject current=null] : iv_ruleCustomObligation= ruleCustomObligation EOF ;
    public final EObject entryRuleCustomObligation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomObligation = null;


        try {
            // InternalPactDSL.g:2589:57: (iv_ruleCustomObligation= ruleCustomObligation EOF )
            // InternalPactDSL.g:2590:2: iv_ruleCustomObligation= ruleCustomObligation EOF
            {
             newCompositeNode(grammarAccess.getCustomObligationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomObligation=ruleCustomObligation();

            state._fsp--;

             current =iv_ruleCustomObligation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomObligation"


    // $ANTLR start "ruleCustomObligation"
    // InternalPactDSL.g:2596:1: ruleCustomObligation returns [EObject current=null] : (otherlv_0= 'CustomObligation:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'must' | otherlv_3= 'mustNot' ) ( (lv_customObligation_4_0= RULE_STRING ) ) (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCustomObligation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_customObligation_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_day_7_0=null;
        Token lv_month_8_0=null;
        Token lv_year_9_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2602:2: ( (otherlv_0= 'CustomObligation:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'must' | otherlv_3= 'mustNot' ) ( (lv_customObligation_4_0= RULE_STRING ) ) (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )? ) )
            // InternalPactDSL.g:2603:2: (otherlv_0= 'CustomObligation:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'must' | otherlv_3= 'mustNot' ) ( (lv_customObligation_4_0= RULE_STRING ) ) (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )? )
            {
            // InternalPactDSL.g:2603:2: (otherlv_0= 'CustomObligation:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'must' | otherlv_3= 'mustNot' ) ( (lv_customObligation_4_0= RULE_STRING ) ) (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )? )
            // InternalPactDSL.g:2604:3: otherlv_0= 'CustomObligation:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= 'must' | otherlv_3= 'mustNot' ) ( (lv_customObligation_4_0= RULE_STRING ) ) (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomObligationAccess().getCustomObligationKeyword_0());
            		
            // InternalPactDSL.g:2608:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2609:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2609:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2610:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomObligationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_52); 

            					newLeafNode(otherlv_1, grammarAccess.getCustomObligationAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            // InternalPactDSL.g:2621:3: (otherlv_2= 'must' | otherlv_3= 'mustNot' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==48) ) {
                alt57=1;
            }
            else if ( (LA57_0==61) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalPactDSL.g:2622:4: otherlv_2= 'must'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getCustomObligationAccess().getMustKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:2627:4: otherlv_3= 'mustNot'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCustomObligationAccess().getMustNotKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalPactDSL.g:2632:3: ( (lv_customObligation_4_0= RULE_STRING ) )
            // InternalPactDSL.g:2633:4: (lv_customObligation_4_0= RULE_STRING )
            {
            // InternalPactDSL.g:2633:4: (lv_customObligation_4_0= RULE_STRING )
            // InternalPactDSL.g:2634:5: lv_customObligation_4_0= RULE_STRING
            {
            lv_customObligation_4_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_customObligation_4_0, grammarAccess.getCustomObligationAccess().getCustomObligationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomObligationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customObligation",
            						lv_customObligation_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:2650:3: (otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPactDSL.g:2651:4: otherlv_5= 'by' otherlv_6= 'date' ( (lv_day_7_0= RULE_INT ) ) ( (lv_month_8_0= RULE_INT ) ) ( (lv_year_9_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_35); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustomObligationAccess().getByKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getCustomObligationAccess().getDateKeyword_4_1());
                    			
                    // InternalPactDSL.g:2659:4: ( (lv_day_7_0= RULE_INT ) )
                    // InternalPactDSL.g:2660:5: (lv_day_7_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2660:5: (lv_day_7_0= RULE_INT )
                    // InternalPactDSL.g:2661:6: lv_day_7_0= RULE_INT
                    {
                    lv_day_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_day_7_0, grammarAccess.getCustomObligationAccess().getDayINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"day",
                    							lv_day_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2677:4: ( (lv_month_8_0= RULE_INT ) )
                    // InternalPactDSL.g:2678:5: (lv_month_8_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2678:5: (lv_month_8_0= RULE_INT )
                    // InternalPactDSL.g:2679:6: lv_month_8_0= RULE_INT
                    {
                    lv_month_8_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_month_8_0, grammarAccess.getCustomObligationAccess().getMonthINTTerminalRuleCall_4_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"month",
                    							lv_month_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalPactDSL.g:2695:4: ( (lv_year_9_0= RULE_INT ) )
                    // InternalPactDSL.g:2696:5: (lv_year_9_0= RULE_INT )
                    {
                    // InternalPactDSL.g:2696:5: (lv_year_9_0= RULE_INT )
                    // InternalPactDSL.g:2697:6: lv_year_9_0= RULE_INT
                    {
                    lv_year_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_year_9_0, grammarAccess.getCustomObligationAccess().getYearINTTerminalRuleCall_4_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomObligationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"year",
                    							lv_year_9_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomObligation"


    // $ANTLR start "entryRuleSecondaryObligationType"
    // InternalPactDSL.g:2718:1: entryRuleSecondaryObligationType returns [EObject current=null] : iv_ruleSecondaryObligationType= ruleSecondaryObligationType EOF ;
    public final EObject entryRuleSecondaryObligationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondaryObligationType = null;


        try {
            // InternalPactDSL.g:2718:64: (iv_ruleSecondaryObligationType= ruleSecondaryObligationType EOF )
            // InternalPactDSL.g:2719:2: iv_ruleSecondaryObligationType= ruleSecondaryObligationType EOF
            {
             newCompositeNode(grammarAccess.getSecondaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondaryObligationType=ruleSecondaryObligationType();

            state._fsp--;

             current =iv_ruleSecondaryObligationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecondaryObligationType"


    // $ANTLR start "ruleSecondaryObligationType"
    // InternalPactDSL.g:2725:1: ruleSecondaryObligationType returns [EObject current=null] : (otherlv_0= 'SecondaryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'uponBreachOf' ( (lv_customPrimaryObligation_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleSecondaryObligationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_sum_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_customPrimaryObligation_8_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2731:2: ( (otherlv_0= 'SecondaryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'uponBreachOf' ( (lv_customPrimaryObligation_8_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:2732:2: (otherlv_0= 'SecondaryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'uponBreachOf' ( (lv_customPrimaryObligation_8_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:2732:2: (otherlv_0= 'SecondaryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'uponBreachOf' ( (lv_customPrimaryObligation_8_0= RULE_STRING ) ) )
            // InternalPactDSL.g:2733:3: otherlv_0= 'SecondaryObligation:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'must' otherlv_3= 'pay' ( (lv_sum_4_0= RULE_INT ) )+ otherlv_5= 'to' ( (otherlv_6= RULE_ID ) )+ otherlv_7= 'uponBreachOf' ( (lv_customPrimaryObligation_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSecondaryObligationTypeAccess().getSecondaryObligationKeyword_0());
            		
            // InternalPactDSL.g:2737:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2738:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2738:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2739:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecondaryObligationTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_1, grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,48,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getSecondaryObligationTypeAccess().getMustKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getSecondaryObligationTypeAccess().getPayKeyword_3());
            		
            // InternalPactDSL.g:2758:3: ( (lv_sum_4_0= RULE_INT ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_INT) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalPactDSL.g:2759:4: (lv_sum_4_0= RULE_INT )
            	    {
            	    // InternalPactDSL.g:2759:4: (lv_sum_4_0= RULE_INT )
            	    // InternalPactDSL.g:2760:5: lv_sum_4_0= RULE_INT
            	    {
            	    lv_sum_4_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            	    					newLeafNode(lv_sum_4_0, grammarAccess.getSecondaryObligationTypeAccess().getSumINTTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSecondaryObligationTypeRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"sum",
            	    						lv_sum_4_0,
            	    						"org.eclipse.xtext.common.Terminals.INT");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getSecondaryObligationTypeAccess().getToKeyword_5());
            		
            // InternalPactDSL.g:2780:3: ( (otherlv_6= RULE_ID ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPactDSL.g:2781:4: (otherlv_6= RULE_ID )
            	    {
            	    // InternalPactDSL.g:2781:4: (otherlv_6= RULE_ID )
            	    // InternalPactDSL.g:2782:5: otherlv_6= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSecondaryObligationTypeRule());
            	    					}
            	    				
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_53); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);

            otherlv_7=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSecondaryObligationTypeAccess().getUponBreachOfKeyword_7());
            		
            // InternalPactDSL.g:2797:3: ( (lv_customPrimaryObligation_8_0= RULE_STRING ) )
            // InternalPactDSL.g:2798:4: (lv_customPrimaryObligation_8_0= RULE_STRING )
            {
            // InternalPactDSL.g:2798:4: (lv_customPrimaryObligation_8_0= RULE_STRING )
            // InternalPactDSL.g:2799:5: lv_customPrimaryObligation_8_0= RULE_STRING
            {
            lv_customPrimaryObligation_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customPrimaryObligation_8_0, grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecondaryObligationTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customPrimaryObligation",
            						lv_customPrimaryObligation_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecondaryObligationType"


    // $ANTLR start "entryRuleLiabilityType"
    // InternalPactDSL.g:2819:1: entryRuleLiabilityType returns [EObject current=null] : iv_ruleLiabilityType= ruleLiabilityType EOF ;
    public final EObject entryRuleLiabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiabilityType = null;


        try {
            // InternalPactDSL.g:2819:54: (iv_ruleLiabilityType= ruleLiabilityType EOF )
            // InternalPactDSL.g:2820:2: iv_ruleLiabilityType= ruleLiabilityType EOF
            {
             newCompositeNode(grammarAccess.getLiabilityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiabilityType=ruleLiabilityType();

            state._fsp--;

             current =iv_ruleLiabilityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiabilityType"


    // $ANTLR start "ruleLiabilityType"
    // InternalPactDSL.g:2826:1: ruleLiabilityType returns [EObject current=null] : (this_LiabilityToParty_0= ruleLiabilityToParty | this_LiabilityToThirdParty_1= ruleLiabilityToThirdParty ) ;
    public final EObject ruleLiabilityType() throws RecognitionException {
        EObject current = null;

        EObject this_LiabilityToParty_0 = null;

        EObject this_LiabilityToThirdParty_1 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:2832:2: ( (this_LiabilityToParty_0= ruleLiabilityToParty | this_LiabilityToThirdParty_1= ruleLiabilityToThirdParty ) )
            // InternalPactDSL.g:2833:2: (this_LiabilityToParty_0= ruleLiabilityToParty | this_LiabilityToThirdParty_1= ruleLiabilityToThirdParty )
            {
            // InternalPactDSL.g:2833:2: (this_LiabilityToParty_0= ruleLiabilityToParty | this_LiabilityToThirdParty_1= ruleLiabilityToThirdParty )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            else if ( (LA61_0==72) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalPactDSL.g:2834:3: this_LiabilityToParty_0= ruleLiabilityToParty
                    {

                    			newCompositeNode(grammarAccess.getLiabilityTypeAccess().getLiabilityToPartyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiabilityToParty_0=ruleLiabilityToParty();

                    state._fsp--;


                    			current = this_LiabilityToParty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:2843:3: this_LiabilityToThirdParty_1= ruleLiabilityToThirdParty
                    {

                    			newCompositeNode(grammarAccess.getLiabilityTypeAccess().getLiabilityToThirdPartyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiabilityToThirdParty_1=ruleLiabilityToThirdParty();

                    state._fsp--;


                    			current = this_LiabilityToThirdParty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiabilityType"


    // $ANTLR start "entryRuleLiabilityToParty"
    // InternalPactDSL.g:2855:1: entryRuleLiabilityToParty returns [EObject current=null] : iv_ruleLiabilityToParty= ruleLiabilityToParty EOF ;
    public final EObject entryRuleLiabilityToParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiabilityToParty = null;


        try {
            // InternalPactDSL.g:2855:57: (iv_ruleLiabilityToParty= ruleLiabilityToParty EOF )
            // InternalPactDSL.g:2856:2: iv_ruleLiabilityToParty= ruleLiabilityToParty EOF
            {
             newCompositeNode(grammarAccess.getLiabilityToPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiabilityToParty=ruleLiabilityToParty();

            state._fsp--;

             current =iv_ruleLiabilityToParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiabilityToParty"


    // $ANTLR start "ruleLiabilityToParty"
    // InternalPactDSL.g:2862:1: ruleLiabilityToParty returns [EObject current=null] : (otherlv_0= 'LiabilityToParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiabilityToParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_customLoss_6_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2868:2: ( (otherlv_0= 'LiabilityToParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:2869:2: (otherlv_0= 'LiabilityToParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:2869:2: (otherlv_0= 'LiabilityToParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) )
            // InternalPactDSL.g:2870:3: otherlv_0= 'LiabilityToParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLiabilityToPartyAccess().getLiabilityToPartyKeyword_0());
            		
            // InternalPactDSL.g:2874:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2875:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2875:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2876:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_1, grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getLiabilityToPartyAccess().getShallNotBeLiableKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLiabilityToPartyAccess().getToKeyword_3());
            		
            // InternalPactDSL.g:2895:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:2896:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:2896:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:2897:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToPartyRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_4, grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLiabilityToPartyAccess().getForKeyword_5());
            		
            // InternalPactDSL.g:2912:3: ( (lv_customLoss_6_0= RULE_STRING ) )
            // InternalPactDSL.g:2913:4: (lv_customLoss_6_0= RULE_STRING )
            {
            // InternalPactDSL.g:2913:4: (lv_customLoss_6_0= RULE_STRING )
            // InternalPactDSL.g:2914:5: lv_customLoss_6_0= RULE_STRING
            {
            lv_customLoss_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customLoss_6_0, grammarAccess.getLiabilityToPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customLoss",
            						lv_customLoss_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiabilityToParty"


    // $ANTLR start "entryRuleLiabilityToThirdParty"
    // InternalPactDSL.g:2934:1: entryRuleLiabilityToThirdParty returns [EObject current=null] : iv_ruleLiabilityToThirdParty= ruleLiabilityToThirdParty EOF ;
    public final EObject entryRuleLiabilityToThirdParty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiabilityToThirdParty = null;


        try {
            // InternalPactDSL.g:2934:62: (iv_ruleLiabilityToThirdParty= ruleLiabilityToThirdParty EOF )
            // InternalPactDSL.g:2935:2: iv_ruleLiabilityToThirdParty= ruleLiabilityToThirdParty EOF
            {
             newCompositeNode(grammarAccess.getLiabilityToThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiabilityToThirdParty=ruleLiabilityToThirdParty();

            state._fsp--;

             current =iv_ruleLiabilityToThirdParty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiabilityToThirdParty"


    // $ANTLR start "ruleLiabilityToThirdParty"
    // InternalPactDSL.g:2941:1: ruleLiabilityToThirdParty returns [EObject current=null] : (otherlv_0= 'LiabilityToThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiabilityToThirdParty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_customLoss_6_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:2947:2: ( (otherlv_0= 'LiabilityToThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:2948:2: (otherlv_0= 'LiabilityToThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:2948:2: (otherlv_0= 'LiabilityToThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) ) )
            // InternalPactDSL.g:2949:3: otherlv_0= 'LiabilityToThirdParty:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'shallNotBeLiable' otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'for' ( (lv_customLoss_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLiabilityToThirdPartyAccess().getLiabilityToThirdPartyKeyword_0());
            		
            // InternalPactDSL.g:2953:3: ( (otherlv_1= RULE_ID ) )
            // InternalPactDSL.g:2954:4: (otherlv_1= RULE_ID )
            {
            // InternalPactDSL.g:2954:4: (otherlv_1= RULE_ID )
            // InternalPactDSL.g:2955:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToThirdPartyRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(otherlv_1, grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypePartyCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,70,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getLiabilityToThirdPartyAccess().getShallNotBeLiableKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getLiabilityToThirdPartyAccess().getToKeyword_3());
            		
            // InternalPactDSL.g:2974:3: ( (otherlv_4= RULE_ID ) )
            // InternalPactDSL.g:2975:4: (otherlv_4= RULE_ID )
            {
            // InternalPactDSL.g:2975:4: (otherlv_4= RULE_ID )
            // InternalPactDSL.g:2976:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToThirdPartyRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(otherlv_4, grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeThirdPartyCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLiabilityToThirdPartyAccess().getForKeyword_5());
            		
            // InternalPactDSL.g:2991:3: ( (lv_customLoss_6_0= RULE_STRING ) )
            // InternalPactDSL.g:2992:4: (lv_customLoss_6_0= RULE_STRING )
            {
            // InternalPactDSL.g:2992:4: (lv_customLoss_6_0= RULE_STRING )
            // InternalPactDSL.g:2993:5: lv_customLoss_6_0= RULE_STRING
            {
            lv_customLoss_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customLoss_6_0, grammarAccess.getLiabilityToThirdPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLiabilityToThirdPartyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customLoss",
            						lv_customLoss_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiabilityToThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:3013:1: entryRuleTerminationType returns [EObject current=null] : iv_ruleTerminationType= ruleTerminationType EOF ;
    public final EObject entryRuleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminationType = null;


        try {
            // InternalPactDSL.g:3013:56: (iv_ruleTerminationType= ruleTerminationType EOF )
            // InternalPactDSL.g:3014:2: iv_ruleTerminationType= ruleTerminationType EOF
            {
             newCompositeNode(grammarAccess.getTerminationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminationType=ruleTerminationType();

            state._fsp--;

             current =iv_ruleTerminationType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminationType"


    // $ANTLR start "ruleTerminationType"
    // InternalPactDSL.g:3020:1: ruleTerminationType returns [EObject current=null] : (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) ;
    public final EObject ruleTerminationType() throws RecognitionException {
        EObject current = null;

        EObject this_ForConvenience_0 = null;

        EObject this_OnReasonableNotice_1 = null;

        EObject this_ForBreach_2 = null;

        EObject this_OnInsolvencyEvent_3 = null;

        EObject this_CustomTermination_4 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3026:2: ( (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination ) )
            // InternalPactDSL.g:3027:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            {
            // InternalPactDSL.g:3027:2: (this_ForConvenience_0= ruleForConvenience | this_OnReasonableNotice_1= ruleOnReasonableNotice | this_ForBreach_2= ruleForBreach | this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent | this_CustomTermination_4= ruleCustomTermination )
            int alt62=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt62=1;
                }
                break;
            case 76:
                {
                alt62=2;
                }
                break;
            case 77:
                {
                alt62=3;
                }
                break;
            case 79:
                {
                alt62=4;
                }
                break;
            case 20:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalPactDSL.g:3028:3: this_ForConvenience_0= ruleForConvenience
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForConvenience_0=ruleForConvenience();

                    state._fsp--;


                    			current = this_ForConvenience_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:3037:3: this_OnReasonableNotice_1= ruleOnReasonableNotice
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnReasonableNotice_1=ruleOnReasonableNotice();

                    state._fsp--;


                    			current = this_OnReasonableNotice_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:3046:3: this_ForBreach_2= ruleForBreach
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForBreach_2=ruleForBreach();

                    state._fsp--;


                    			current = this_ForBreach_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:3055:3: this_OnInsolvencyEvent_3= ruleOnInsolvencyEvent
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_OnInsolvencyEvent_3=ruleOnInsolvencyEvent();

                    state._fsp--;


                    			current = this_OnInsolvencyEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:3064:3: this_CustomTermination_4= ruleCustomTermination
                    {

                    			newCompositeNode(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomTermination_4=ruleCustomTermination();

                    state._fsp--;


                    			current = this_CustomTermination_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminationType"


    // $ANTLR start "entryRuleForConvenience"
    // InternalPactDSL.g:3076:1: entryRuleForConvenience returns [EObject current=null] : iv_ruleForConvenience= ruleForConvenience EOF ;
    public final EObject entryRuleForConvenience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForConvenience = null;


        try {
            // InternalPactDSL.g:3076:55: (iv_ruleForConvenience= ruleForConvenience EOF )
            // InternalPactDSL.g:3077:2: iv_ruleForConvenience= ruleForConvenience EOF
            {
             newCompositeNode(grammarAccess.getForConvenienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForConvenience=ruleForConvenience();

            state._fsp--;

             current =iv_ruleForConvenience; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForConvenience"


    // $ANTLR start "ruleForConvenience"
    // InternalPactDSL.g:3083:1: ruleForConvenience returns [EObject current=null] : (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleForConvenience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_customTermination_5_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3089:2: ( (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:3090:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:3090:2: (otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) ) )
            // InternalPactDSL.g:3091:3: otherlv_0= 'TerminationForConvenience:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (lv_customTermination_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0());
            		
            // InternalPactDSL.g:3095:3: ( (otherlv_1= RULE_ID ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalPactDSL.g:3096:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:3096:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:3097:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForConvenienceRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getForConvenienceAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getForConvenienceAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForConvenienceAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:3120:3: ( (lv_customTermination_5_0= RULE_STRING ) )
            // InternalPactDSL.g:3121:4: (lv_customTermination_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:3121:4: (lv_customTermination_5_0= RULE_STRING )
            // InternalPactDSL.g:3122:5: lv_customTermination_5_0= RULE_STRING
            {
            lv_customTermination_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customTermination_5_0, grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForConvenienceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customTermination",
            						lv_customTermination_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForConvenience"


    // $ANTLR start "entryRuleOnReasonableNotice"
    // InternalPactDSL.g:3142:1: entryRuleOnReasonableNotice returns [EObject current=null] : iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF ;
    public final EObject entryRuleOnReasonableNotice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnReasonableNotice = null;


        try {
            // InternalPactDSL.g:3142:59: (iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:3143:2: iv_ruleOnReasonableNotice= ruleOnReasonableNotice EOF
            {
             newCompositeNode(grammarAccess.getOnReasonableNoticeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnReasonableNotice=ruleOnReasonableNotice();

            state._fsp--;

             current =iv_ruleOnReasonableNotice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnReasonableNotice"


    // $ANTLR start "ruleOnReasonableNotice"
    // InternalPactDSL.g:3149:1: ruleOnReasonableNotice returns [EObject current=null] : (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleOnReasonableNotice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3155:2: ( (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalPactDSL.g:3156:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalPactDSL.g:3156:2: (otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) ) )
            // InternalPactDSL.g:3157:3: otherlv_0= 'TerminationOnReasonableNotice:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'by' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0());
            		
            // InternalPactDSL.g:3161:3: ( (otherlv_1= RULE_ID ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalPactDSL.g:3162:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:3162:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:3163:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnReasonableNoticeRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4());
            		
            // InternalPactDSL.g:3186:3: ( (otherlv_5= RULE_ID ) )
            // InternalPactDSL.g:3187:4: (otherlv_5= RULE_ID )
            {
            // InternalPactDSL.g:3187:4: (otherlv_5= RULE_ID )
            // InternalPactDSL.g:3188:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnReasonableNoticeRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnReasonableNotice"


    // $ANTLR start "entryRuleForBreach"
    // InternalPactDSL.g:3203:1: entryRuleForBreach returns [EObject current=null] : iv_ruleForBreach= ruleForBreach EOF ;
    public final EObject entryRuleForBreach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBreach = null;


        try {
            // InternalPactDSL.g:3203:50: (iv_ruleForBreach= ruleForBreach EOF )
            // InternalPactDSL.g:3204:2: iv_ruleForBreach= ruleForBreach EOF
            {
             newCompositeNode(grammarAccess.getForBreachRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForBreach=ruleForBreach();

            state._fsp--;

             current =iv_ruleForBreach; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForBreach"


    // $ANTLR start "ruleForBreach"
    // InternalPactDSL.g:3210:1: ruleForBreach returns [EObject current=null] : (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleForBreach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ObligationBreached_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_remedialScheme_9_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3216:2: ( (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )? ) )
            // InternalPactDSL.g:3217:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )? )
            {
            // InternalPactDSL.g:3217:2: (otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )? )
            // InternalPactDSL.g:3218:3: otherlv_0= 'TerminationForBreach:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'forBreachOf' ( (lv_ObligationBreached_5_0= RULE_STRING ) )+ otherlv_6= 'by' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0());
            		
            // InternalPactDSL.g:3222:3: ( (otherlv_1= RULE_ID ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalPactDSL.g:3223:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:3223:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:3224:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForBreachRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    					newLeafNode(otherlv_1, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getForBreachAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getForBreachAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getForBreachAccess().getForBreachOfKeyword_4());
            		
            // InternalPactDSL.g:3247:3: ( (lv_ObligationBreached_5_0= RULE_STRING ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_STRING) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalPactDSL.g:3248:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    {
            	    // InternalPactDSL.g:3248:4: (lv_ObligationBreached_5_0= RULE_STRING )
            	    // InternalPactDSL.g:3249:5: lv_ObligationBreached_5_0= RULE_STRING
            	    {
            	    lv_ObligationBreached_5_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            	    					newLeafNode(lv_ObligationBreached_5_0, grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForBreachRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"ObligationBreached",
            	    						lv_ObligationBreached_5_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);

            otherlv_6=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getForBreachAccess().getByKeyword_6());
            		
            // InternalPactDSL.g:3269:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:3270:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:3270:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:3271:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForBreachRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_49); 

            					newLeafNode(otherlv_7, grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0());
            				

            }


            }

            // InternalPactDSL.g:3282:3: (otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==63) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalPactDSL.g:3283:4: otherlv_8= 'unless' ( (lv_remedialScheme_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,63,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getForBreachAccess().getUnlessKeyword_8_0());
                    			
                    // InternalPactDSL.g:3287:4: ( (lv_remedialScheme_9_0= RULE_STRING ) )
                    // InternalPactDSL.g:3288:5: (lv_remedialScheme_9_0= RULE_STRING )
                    {
                    // InternalPactDSL.g:3288:5: (lv_remedialScheme_9_0= RULE_STRING )
                    // InternalPactDSL.g:3289:6: lv_remedialScheme_9_0= RULE_STRING
                    {
                    lv_remedialScheme_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_remedialScheme_9_0, grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForBreachRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"remedialScheme",
                    							lv_remedialScheme_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForBreach"


    // $ANTLR start "entryRuleOnInsolvencyEvent"
    // InternalPactDSL.g:3310:1: entryRuleOnInsolvencyEvent returns [EObject current=null] : iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF ;
    public final EObject entryRuleOnInsolvencyEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnInsolvencyEvent = null;


        try {
            // InternalPactDSL.g:3310:58: (iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:3311:2: iv_ruleOnInsolvencyEvent= ruleOnInsolvencyEvent EOF
            {
             newCompositeNode(grammarAccess.getOnInsolvencyEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnInsolvencyEvent=ruleOnInsolvencyEvent();

            state._fsp--;

             current =iv_ruleOnInsolvencyEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnInsolvencyEvent"


    // $ANTLR start "ruleOnInsolvencyEvent"
    // InternalPactDSL.g:3317:1: ruleOnInsolvencyEvent returns [EObject current=null] : (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleOnInsolvencyEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_InsolvencyEvent_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3323:2: ( (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalPactDSL.g:3324:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalPactDSL.g:3324:2: (otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) ) )
            // InternalPactDSL.g:3325:3: otherlv_0= 'TerminationUponInsolvency:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' otherlv_4= 'upon' ( (lv_InsolvencyEvent_5_0= RULE_STRING ) ) otherlv_6= 'of' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0());
            		
            // InternalPactDSL.g:3329:3: ( (otherlv_1= RULE_ID ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_ID) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalPactDSL.g:3330:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:3330:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:3331:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    					newLeafNode(otherlv_1, grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3());
            		
            otherlv_4=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4());
            		
            // InternalPactDSL.g:3354:3: ( (lv_InsolvencyEvent_5_0= RULE_STRING ) )
            // InternalPactDSL.g:3355:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            {
            // InternalPactDSL.g:3355:4: (lv_InsolvencyEvent_5_0= RULE_STRING )
            // InternalPactDSL.g:3356:5: lv_InsolvencyEvent_5_0= RULE_STRING
            {
            lv_InsolvencyEvent_5_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            					newLeafNode(lv_InsolvencyEvent_5_0, grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"InsolvencyEvent",
            						lv_InsolvencyEvent_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,65,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6());
            		
            // InternalPactDSL.g:3376:3: ( (otherlv_7= RULE_ID ) )
            // InternalPactDSL.g:3377:4: (otherlv_7= RULE_ID )
            {
            // InternalPactDSL.g:3377:4: (otherlv_7= RULE_ID )
            // InternalPactDSL.g:3378:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnInsolvencyEventRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnInsolvencyEvent"


    // $ANTLR start "entryRuleCustomTermination"
    // InternalPactDSL.g:3393:1: entryRuleCustomTermination returns [EObject current=null] : iv_ruleCustomTermination= ruleCustomTermination EOF ;
    public final EObject entryRuleCustomTermination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomTermination = null;


        try {
            // InternalPactDSL.g:3393:58: (iv_ruleCustomTermination= ruleCustomTermination EOF )
            // InternalPactDSL.g:3394:2: iv_ruleCustomTermination= ruleCustomTermination EOF
            {
             newCompositeNode(grammarAccess.getCustomTerminationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomTermination=ruleCustomTermination();

            state._fsp--;

             current =iv_ruleCustomTermination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomTermination"


    // $ANTLR start "ruleCustomTermination"
    // InternalPactDSL.g:3400:1: ruleCustomTermination returns [EObject current=null] : (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_customTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) ;
    public final EObject ruleCustomTermination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_customTerminationClause_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3406:2: ( (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_customTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? ) )
            // InternalPactDSL.g:3407:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_customTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            {
            // InternalPactDSL.g:3407:2: (otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_customTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )? )
            // InternalPactDSL.g:3408:3: otherlv_0= 'Termination:' ( (otherlv_1= RULE_ID ) )+ otherlv_2= 'may' otherlv_3= 'terminate' ( (lv_customTerminationClause_4_0= RULE_STRING ) ) (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0());
            		
            // InternalPactDSL.g:3412:3: ( (otherlv_1= RULE_ID ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalPactDSL.g:3413:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalPactDSL.g:3413:4: (otherlv_1= RULE_ID )
            	    // InternalPactDSL.g:3414:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCustomTerminationRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            otherlv_2=(Token)match(input,74,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getCustomTerminationAccess().getMayKeyword_2());
            		
            otherlv_3=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3());
            		
            // InternalPactDSL.g:3433:3: ( (lv_customTerminationClause_4_0= RULE_STRING ) )
            // InternalPactDSL.g:3434:4: (lv_customTerminationClause_4_0= RULE_STRING )
            {
            // InternalPactDSL.g:3434:4: (lv_customTerminationClause_4_0= RULE_STRING )
            // InternalPactDSL.g:3435:5: lv_customTerminationClause_4_0= RULE_STRING
            {
            lv_customTerminationClause_4_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_customTerminationClause_4_0, grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomTerminationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customTerminationClause",
            						lv_customTerminationClause_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:3451:3: (otherlv_5= 'by' ( (otherlv_6= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalPactDSL.g:3452:4: otherlv_5= 'by' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getCustomTerminationAccess().getByKeyword_5_0());
                    			
                    // InternalPactDSL.g:3456:4: ( (otherlv_6= RULE_ID ) )
                    // InternalPactDSL.g:3457:5: (otherlv_6= RULE_ID )
                    {
                    // InternalPactDSL.g:3457:5: (otherlv_6= RULE_ID )
                    // InternalPactDSL.g:3458:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCustomTerminationRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomTermination"


    // $ANTLR start "entryRuleBoilerplateType"
    // InternalPactDSL.g:3474:1: entryRuleBoilerplateType returns [EObject current=null] : iv_ruleBoilerplateType= ruleBoilerplateType EOF ;
    public final EObject entryRuleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoilerplateType = null;


        try {
            // InternalPactDSL.g:3474:56: (iv_ruleBoilerplateType= ruleBoilerplateType EOF )
            // InternalPactDSL.g:3475:2: iv_ruleBoilerplateType= ruleBoilerplateType EOF
            {
             newCompositeNode(grammarAccess.getBoilerplateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoilerplateType=ruleBoilerplateType();

            state._fsp--;

             current =iv_ruleBoilerplateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoilerplateType"


    // $ANTLR start "ruleBoilerplateType"
    // InternalPactDSL.g:3481:1: ruleBoilerplateType returns [EObject current=null] : (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices | this_CustomBoilerplate_3= ruleCustomBoilerplate ) ;
    public final EObject ruleBoilerplateType() throws RecognitionException {
        EObject current = null;

        EObject this_ApplicableLaw_0 = null;

        EObject this_Jurisdiction_1 = null;

        EObject this_Notices_2 = null;

        EObject this_CustomBoilerplate_3 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3487:2: ( (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices | this_CustomBoilerplate_3= ruleCustomBoilerplate ) )
            // InternalPactDSL.g:3488:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices | this_CustomBoilerplate_3= ruleCustomBoilerplate )
            {
            // InternalPactDSL.g:3488:2: (this_ApplicableLaw_0= ruleApplicableLaw | this_Jurisdiction_1= ruleJurisdiction | this_Notices_2= ruleNotices | this_CustomBoilerplate_3= ruleCustomBoilerplate )
            int alt71=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt71=1;
                }
                break;
            case 82:
                {
                alt71=2;
                }
                break;
            case 83:
                {
                alt71=3;
                }
                break;
            case 22:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalPactDSL.g:3489:3: this_ApplicableLaw_0= ruleApplicableLaw
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicableLaw_0=ruleApplicableLaw();

                    state._fsp--;


                    			current = this_ApplicableLaw_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:3498:3: this_Jurisdiction_1= ruleJurisdiction
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Jurisdiction_1=ruleJurisdiction();

                    state._fsp--;


                    			current = this_Jurisdiction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:3507:3: this_Notices_2= ruleNotices
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Notices_2=ruleNotices();

                    state._fsp--;


                    			current = this_Notices_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:3516:3: this_CustomBoilerplate_3= ruleCustomBoilerplate
                    {

                    			newCompositeNode(grammarAccess.getBoilerplateTypeAccess().getCustomBoilerplateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CustomBoilerplate_3=ruleCustomBoilerplate();

                    state._fsp--;


                    			current = this_CustomBoilerplate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoilerplateType"


    // $ANTLR start "entryRuleApplicableLaw"
    // InternalPactDSL.g:3528:1: entryRuleApplicableLaw returns [EObject current=null] : iv_ruleApplicableLaw= ruleApplicableLaw EOF ;
    public final EObject entryRuleApplicableLaw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicableLaw = null;


        try {
            // InternalPactDSL.g:3528:54: (iv_ruleApplicableLaw= ruleApplicableLaw EOF )
            // InternalPactDSL.g:3529:2: iv_ruleApplicableLaw= ruleApplicableLaw EOF
            {
             newCompositeNode(grammarAccess.getApplicableLawRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicableLaw=ruleApplicableLaw();

            state._fsp--;

             current =iv_ruleApplicableLaw; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicableLaw"


    // $ANTLR start "ruleApplicableLaw"
    // InternalPactDSL.g:3535:1: ruleApplicableLaw returns [EObject current=null] : (otherlv_0= 'ApplicableLaw:' ( (lv_customApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleApplicableLaw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customApplicableLaw_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3541:2: ( (otherlv_0= 'ApplicableLaw:' ( (lv_customApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:3542:2: (otherlv_0= 'ApplicableLaw:' ( (lv_customApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:3542:2: (otherlv_0= 'ApplicableLaw:' ( (lv_customApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:3543:3: otherlv_0= 'ApplicableLaw:' ( (lv_customApplicableLaw_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0());
            		
            // InternalPactDSL.g:3547:3: ( (lv_customApplicableLaw_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3548:4: (lv_customApplicableLaw_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3548:4: (lv_customApplicableLaw_1_0= RULE_STRING )
            // InternalPactDSL.g:3549:5: lv_customApplicableLaw_1_0= RULE_STRING
            {
            lv_customApplicableLaw_1_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            					newLeafNode(lv_customApplicableLaw_1_0, grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicableLawRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customApplicableLaw",
            						lv_customApplicableLaw_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:3565:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==27) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPactDSL.g:3566:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:3566:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:3567:5: lv_definition_2_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_definition_2_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicableLawRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_2_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicableLaw"


    // $ANTLR start "entryRuleJurisdiction"
    // InternalPactDSL.g:3588:1: entryRuleJurisdiction returns [EObject current=null] : iv_ruleJurisdiction= ruleJurisdiction EOF ;
    public final EObject entryRuleJurisdiction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJurisdiction = null;


        try {
            // InternalPactDSL.g:3588:53: (iv_ruleJurisdiction= ruleJurisdiction EOF )
            // InternalPactDSL.g:3589:2: iv_ruleJurisdiction= ruleJurisdiction EOF
            {
             newCompositeNode(grammarAccess.getJurisdictionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJurisdiction=ruleJurisdiction();

            state._fsp--;

             current =iv_ruleJurisdiction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJurisdiction"


    // $ANTLR start "ruleJurisdiction"
    // InternalPactDSL.g:3595:1: ruleJurisdiction returns [EObject current=null] : (otherlv_0= 'Jurisdiction:' ( (lv_customJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) ;
    public final EObject ruleJurisdiction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customJurisdiction_1_0=null;
        EObject lv_definition_2_0 = null;



        	enterRule();

        try {
            // InternalPactDSL.g:3601:2: ( (otherlv_0= 'Jurisdiction:' ( (lv_customJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? ) )
            // InternalPactDSL.g:3602:2: (otherlv_0= 'Jurisdiction:' ( (lv_customJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            {
            // InternalPactDSL.g:3602:2: (otherlv_0= 'Jurisdiction:' ( (lv_customJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )? )
            // InternalPactDSL.g:3603:3: otherlv_0= 'Jurisdiction:' ( (lv_customJurisdiction_1_0= RULE_STRING ) ) ( (lv_definition_2_0= ruleDefinedTerm ) )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0());
            		
            // InternalPactDSL.g:3607:3: ( (lv_customJurisdiction_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3608:4: (lv_customJurisdiction_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3608:4: (lv_customJurisdiction_1_0= RULE_STRING )
            // InternalPactDSL.g:3609:5: lv_customJurisdiction_1_0= RULE_STRING
            {
            lv_customJurisdiction_1_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

            					newLeafNode(lv_customJurisdiction_1_0, grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJurisdictionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customJurisdiction",
            						lv_customJurisdiction_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPactDSL.g:3625:3: ( (lv_definition_2_0= ruleDefinedTerm ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==27) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalPactDSL.g:3626:4: (lv_definition_2_0= ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:3626:4: (lv_definition_2_0= ruleDefinedTerm )
                    // InternalPactDSL.g:3627:5: lv_definition_2_0= ruleDefinedTerm
                    {

                    					newCompositeNode(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_definition_2_0=ruleDefinedTerm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJurisdictionRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_2_0,
                    						"imperialmsc.lmw21.pactdsl.PactDSL.DefinedTerm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJurisdiction"


    // $ANTLR start "entryRuleNotices"
    // InternalPactDSL.g:3648:1: entryRuleNotices returns [EObject current=null] : iv_ruleNotices= ruleNotices EOF ;
    public final EObject entryRuleNotices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotices = null;


        try {
            // InternalPactDSL.g:3648:48: (iv_ruleNotices= ruleNotices EOF )
            // InternalPactDSL.g:3649:2: iv_ruleNotices= ruleNotices EOF
            {
             newCompositeNode(grammarAccess.getNoticesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotices=ruleNotices();

            state._fsp--;

             current =iv_ruleNotices; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotices"


    // $ANTLR start "ruleNotices"
    // InternalPactDSL.g:3655:1: ruleNotices returns [EObject current=null] : (otherlv_0= 'Notices:' ( (lv_customNotice_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotices() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customNotice_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3661:2: ( (otherlv_0= 'Notices:' ( (lv_customNotice_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:3662:2: (otherlv_0= 'Notices:' ( (lv_customNotice_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:3662:2: (otherlv_0= 'Notices:' ( (lv_customNotice_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:3663:3: otherlv_0= 'Notices:' ( (lv_customNotice_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNoticesAccess().getNoticesKeyword_0());
            		
            // InternalPactDSL.g:3667:3: ( (lv_customNotice_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3668:4: (lv_customNotice_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3668:4: (lv_customNotice_1_0= RULE_STRING )
            // InternalPactDSL.g:3669:5: lv_customNotice_1_0= RULE_STRING
            {
            lv_customNotice_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customNotice_1_0, grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNoticesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customNotice",
            						lv_customNotice_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotices"


    // $ANTLR start "entryRuleCustomBoilerplate"
    // InternalPactDSL.g:3689:1: entryRuleCustomBoilerplate returns [EObject current=null] : iv_ruleCustomBoilerplate= ruleCustomBoilerplate EOF ;
    public final EObject entryRuleCustomBoilerplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomBoilerplate = null;


        try {
            // InternalPactDSL.g:3689:58: (iv_ruleCustomBoilerplate= ruleCustomBoilerplate EOF )
            // InternalPactDSL.g:3690:2: iv_ruleCustomBoilerplate= ruleCustomBoilerplate EOF
            {
             newCompositeNode(grammarAccess.getCustomBoilerplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomBoilerplate=ruleCustomBoilerplate();

            state._fsp--;

             current =iv_ruleCustomBoilerplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomBoilerplate"


    // $ANTLR start "ruleCustomBoilerplate"
    // InternalPactDSL.g:3696:1: ruleCustomBoilerplate returns [EObject current=null] : (otherlv_0= 'Boilerplate:' ( (lv_customBoilerplate_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCustomBoilerplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customBoilerplate_1_0=null;


        	enterRule();

        try {
            // InternalPactDSL.g:3702:2: ( (otherlv_0= 'Boilerplate:' ( (lv_customBoilerplate_1_0= RULE_STRING ) ) ) )
            // InternalPactDSL.g:3703:2: (otherlv_0= 'Boilerplate:' ( (lv_customBoilerplate_1_0= RULE_STRING ) ) )
            {
            // InternalPactDSL.g:3703:2: (otherlv_0= 'Boilerplate:' ( (lv_customBoilerplate_1_0= RULE_STRING ) ) )
            // InternalPactDSL.g:3704:3: otherlv_0= 'Boilerplate:' ( (lv_customBoilerplate_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCustomBoilerplateAccess().getBoilerplateKeyword_0());
            		
            // InternalPactDSL.g:3708:3: ( (lv_customBoilerplate_1_0= RULE_STRING ) )
            // InternalPactDSL.g:3709:4: (lv_customBoilerplate_1_0= RULE_STRING )
            {
            // InternalPactDSL.g:3709:4: (lv_customBoilerplate_1_0= RULE_STRING )
            // InternalPactDSL.g:3710:5: lv_customBoilerplate_1_0= RULE_STRING
            {
            lv_customBoilerplate_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_customBoilerplate_1_0, grammarAccess.getCustomBoilerplateAccess().getCustomBoilerplateSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomBoilerplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customBoilerplate",
            						lv_customBoilerplate_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomBoilerplate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000049258783C040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000492580038040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000490000030040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000490000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x5150800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x5150C900007C0002L,0x00000000000EB32CL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000490000780002L,0x00000000000EB328L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000490000700002L,0x00000000000EB320L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000490000700002L,0x00000000000EB200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000490000400002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000042L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000200000052L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000200000012L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000200000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x2001000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000008000002L});

}