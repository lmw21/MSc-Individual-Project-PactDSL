package imperialmsc.lmw21.pactdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'owns'", "'doesNotOwn'", "'mayUse'", "'mayNotUse'", "'must'", "'mustNot'", "'ContractTitle:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'SecondaryObligations:'", "'Liability'", "'Termination:'", "'StateAfterContractDischarged:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'Ownership:'", "'RightToUse:'", "'State:'", "'PaymentObligation:'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'CustomObligation:'", "'SecondaryObligation:'", "'uponBreachOf'", "'LiabilityToParty:'", "'shallNotBeLiable'", "'for'", "'LiabilityToThirdParty:'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
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

    	public void setGrammarAccess(PactDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPactDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPactDSL.g:54:1: ( ruleModel EOF )
            // InternalPactDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPactDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPactDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPactDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalPactDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityType"
    // InternalPactDSL.g:78:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:79:1: ( ruleEntityType EOF )
            // InternalPactDSL.g:80:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalPactDSL.g:87:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:91:2: ( ( ( rule__EntityType__Alternatives ) ) )
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            {
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            // InternalPactDSL.g:93:3: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:94:3: ( rule__EntityType__Alternatives )
            // InternalPactDSL.g:94:4: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEffectiveDate"
    // InternalPactDSL.g:103:1: entryRuleEffectiveDate : ruleEffectiveDate EOF ;
    public final void entryRuleEffectiveDate() throws RecognitionException {
        try {
            // InternalPactDSL.g:104:1: ( ruleEffectiveDate EOF )
            // InternalPactDSL.g:105:1: ruleEffectiveDate EOF
            {
             before(grammarAccess.getEffectiveDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectiveDate();

            state._fsp--;

             after(grammarAccess.getEffectiveDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffectiveDate"


    // $ANTLR start "ruleEffectiveDate"
    // InternalPactDSL.g:112:1: ruleEffectiveDate : ( ( rule__EffectiveDate__Group__0 ) ) ;
    public final void ruleEffectiveDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:116:2: ( ( ( rule__EffectiveDate__Group__0 ) ) )
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            {
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            // InternalPactDSL.g:118:3: ( rule__EffectiveDate__Group__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup()); 
            // InternalPactDSL.g:119:3: ( rule__EffectiveDate__Group__0 )
            // InternalPactDSL.g:119:4: rule__EffectiveDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectiveDate"


    // $ANTLR start "entryRuleParty"
    // InternalPactDSL.g:128:1: entryRuleParty : ruleParty EOF ;
    public final void entryRuleParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:129:1: ( ruleParty EOF )
            // InternalPactDSL.g:130:1: ruleParty EOF
            {
             before(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalPactDSL.g:137:1: ruleParty : ( ( rule__Party__Group__0 ) ) ;
    public final void ruleParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:141:2: ( ( ( rule__Party__Group__0 ) ) )
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            {
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            // InternalPactDSL.g:143:3: ( rule__Party__Group__0 )
            {
             before(grammarAccess.getPartyAccess().getGroup()); 
            // InternalPactDSL.g:144:3: ( rule__Party__Group__0 )
            // InternalPactDSL.g:144:4: rule__Party__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleThirdParty"
    // InternalPactDSL.g:153:1: entryRuleThirdParty : ruleThirdParty EOF ;
    public final void entryRuleThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:154:1: ( ruleThirdParty EOF )
            // InternalPactDSL.g:155:1: ruleThirdParty EOF
            {
             before(grammarAccess.getThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleThirdParty();

            state._fsp--;

             after(grammarAccess.getThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThirdParty"


    // $ANTLR start "ruleThirdParty"
    // InternalPactDSL.g:162:1: ruleThirdParty : ( ( rule__ThirdParty__Group__0 ) ) ;
    public final void ruleThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:166:2: ( ( ( rule__ThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            // InternalPactDSL.g:168:3: ( rule__ThirdParty__Group__0 )
            {
             before(grammarAccess.getThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:169:3: ( rule__ThirdParty__Group__0 )
            // InternalPactDSL.g:169:4: rule__ThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThirdParty"


    // $ANTLR start "entryRuleSubjectMatter"
    // InternalPactDSL.g:178:1: entryRuleSubjectMatter : ruleSubjectMatter EOF ;
    public final void entryRuleSubjectMatter() throws RecognitionException {
        try {
            // InternalPactDSL.g:179:1: ( ruleSubjectMatter EOF )
            // InternalPactDSL.g:180:1: ruleSubjectMatter EOF
            {
             before(grammarAccess.getSubjectMatterRule()); 
            pushFollow(FOLLOW_1);
            ruleSubjectMatter();

            state._fsp--;

             after(grammarAccess.getSubjectMatterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubjectMatter"


    // $ANTLR start "ruleSubjectMatter"
    // InternalPactDSL.g:187:1: ruleSubjectMatter : ( ( rule__SubjectMatter__Group__0 ) ) ;
    public final void ruleSubjectMatter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:191:2: ( ( ( rule__SubjectMatter__Group__0 ) ) )
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            {
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            // InternalPactDSL.g:193:3: ( rule__SubjectMatter__Group__0 )
            {
             before(grammarAccess.getSubjectMatterAccess().getGroup()); 
            // InternalPactDSL.g:194:3: ( rule__SubjectMatter__Group__0 )
            // InternalPactDSL.g:194:4: rule__SubjectMatter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubjectMatter"


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:203:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalPactDSL.g:204:1: ( ruleFeature EOF )
            // InternalPactDSL.g:205:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPactDSL.g:212:1: ruleFeature : ( ( rule__Feature__FeaturetypeAssignment ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:216:2: ( ( ( rule__Feature__FeaturetypeAssignment ) ) )
            // InternalPactDSL.g:217:2: ( ( rule__Feature__FeaturetypeAssignment ) )
            {
            // InternalPactDSL.g:217:2: ( ( rule__Feature__FeaturetypeAssignment ) )
            // InternalPactDSL.g:218:3: ( rule__Feature__FeaturetypeAssignment )
            {
             before(grammarAccess.getFeatureAccess().getFeaturetypeAssignment()); 
            // InternalPactDSL.g:219:3: ( rule__Feature__FeaturetypeAssignment )
            // InternalPactDSL.g:219:4: rule__Feature__FeaturetypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Feature__FeaturetypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getFeaturetypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFeatureType"
    // InternalPactDSL.g:228:1: entryRuleFeatureType : ruleFeatureType EOF ;
    public final void entryRuleFeatureType() throws RecognitionException {
        try {
            // InternalPactDSL.g:229:1: ( ruleFeatureType EOF )
            // InternalPactDSL.g:230:1: ruleFeatureType EOF
            {
             before(grammarAccess.getFeatureTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureType"


    // $ANTLR start "ruleFeatureType"
    // InternalPactDSL.g:237:1: ruleFeatureType : ( ( rule__FeatureType__Alternatives ) ) ;
    public final void ruleFeatureType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:241:2: ( ( ( rule__FeatureType__Alternatives ) ) )
            // InternalPactDSL.g:242:2: ( ( rule__FeatureType__Alternatives ) )
            {
            // InternalPactDSL.g:242:2: ( ( rule__FeatureType__Alternatives ) )
            // InternalPactDSL.g:243:3: ( rule__FeatureType__Alternatives )
            {
             before(grammarAccess.getFeatureTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:244:3: ( rule__FeatureType__Alternatives )
            // InternalPactDSL.g:244:4: rule__FeatureType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FeatureType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureType"


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:253:1: entryRuleDefinedTerm : ruleDefinedTerm EOF ;
    public final void entryRuleDefinedTerm() throws RecognitionException {
        try {
            // InternalPactDSL.g:254:1: ( ruleDefinedTerm EOF )
            // InternalPactDSL.g:255:1: ruleDefinedTerm EOF
            {
             before(grammarAccess.getDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getDefinedTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinedTerm"


    // $ANTLR start "ruleDefinedTerm"
    // InternalPactDSL.g:262:1: ruleDefinedTerm : ( ( rule__DefinedTerm__Group__0 ) ) ;
    public final void ruleDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:266:2: ( ( ( rule__DefinedTerm__Group__0 ) ) )
            // InternalPactDSL.g:267:2: ( ( rule__DefinedTerm__Group__0 ) )
            {
            // InternalPactDSL.g:267:2: ( ( rule__DefinedTerm__Group__0 ) )
            // InternalPactDSL.g:268:3: ( rule__DefinedTerm__Group__0 )
            {
             before(grammarAccess.getDefinedTermAccess().getGroup()); 
            // InternalPactDSL.g:269:3: ( rule__DefinedTerm__Group__0 )
            // InternalPactDSL.g:269:4: rule__DefinedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedTerm"


    // $ANTLR start "entryRuleAddress"
    // InternalPactDSL.g:278:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalPactDSL.g:279:1: ( ruleAddress EOF )
            // InternalPactDSL.g:280:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalPactDSL.g:287:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:291:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalPactDSL.g:292:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalPactDSL.g:292:2: ( ( rule__Address__Group__0 ) )
            // InternalPactDSL.g:293:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalPactDSL.g:294:3: ( rule__Address__Group__0 )
            // InternalPactDSL.g:294:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleCompanyNumber"
    // InternalPactDSL.g:303:1: entryRuleCompanyNumber : ruleCompanyNumber EOF ;
    public final void entryRuleCompanyNumber() throws RecognitionException {
        try {
            // InternalPactDSL.g:304:1: ( ruleCompanyNumber EOF )
            // InternalPactDSL.g:305:1: ruleCompanyNumber EOF
            {
             before(grammarAccess.getCompanyNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getCompanyNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompanyNumber"


    // $ANTLR start "ruleCompanyNumber"
    // InternalPactDSL.g:312:1: ruleCompanyNumber : ( ( rule__CompanyNumber__Group__0 ) ) ;
    public final void ruleCompanyNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:316:2: ( ( ( rule__CompanyNumber__Group__0 ) ) )
            // InternalPactDSL.g:317:2: ( ( rule__CompanyNumber__Group__0 ) )
            {
            // InternalPactDSL.g:317:2: ( ( rule__CompanyNumber__Group__0 ) )
            // InternalPactDSL.g:318:3: ( rule__CompanyNumber__Group__0 )
            {
             before(grammarAccess.getCompanyNumberAccess().getGroup()); 
            // InternalPactDSL.g:319:3: ( rule__CompanyNumber__Group__0 )
            // InternalPactDSL.g:319:4: rule__CompanyNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompanyNumber"


    // $ANTLR start "entryRuleCustomFeature"
    // InternalPactDSL.g:328:1: entryRuleCustomFeature : ruleCustomFeature EOF ;
    public final void entryRuleCustomFeature() throws RecognitionException {
        try {
            // InternalPactDSL.g:329:1: ( ruleCustomFeature EOF )
            // InternalPactDSL.g:330:1: ruleCustomFeature EOF
            {
             before(grammarAccess.getCustomFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomFeature();

            state._fsp--;

             after(grammarAccess.getCustomFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomFeature"


    // $ANTLR start "ruleCustomFeature"
    // InternalPactDSL.g:337:1: ruleCustomFeature : ( ( rule__CustomFeature__Group__0 ) ) ;
    public final void ruleCustomFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:341:2: ( ( ( rule__CustomFeature__Group__0 ) ) )
            // InternalPactDSL.g:342:2: ( ( rule__CustomFeature__Group__0 ) )
            {
            // InternalPactDSL.g:342:2: ( ( rule__CustomFeature__Group__0 ) )
            // InternalPactDSL.g:343:3: ( rule__CustomFeature__Group__0 )
            {
             before(grammarAccess.getCustomFeatureAccess().getGroup()); 
            // InternalPactDSL.g:344:3: ( rule__CustomFeature__Group__0 )
            // InternalPactDSL.g:344:4: rule__CustomFeature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:353:1: entryRuleFormalityType : ruleFormalityType EOF ;
    public final void entryRuleFormalityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:354:1: ( ruleFormalityType EOF )
            // InternalPactDSL.g:355:1: ruleFormalityType EOF
            {
             before(grammarAccess.getFormalityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getFormalityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormalityType"


    // $ANTLR start "ruleFormalityType"
    // InternalPactDSL.g:362:1: ruleFormalityType : ( ( rule__FormalityType__Alternatives ) ) ;
    public final void ruleFormalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:366:2: ( ( ( rule__FormalityType__Alternatives ) ) )
            // InternalPactDSL.g:367:2: ( ( rule__FormalityType__Alternatives ) )
            {
            // InternalPactDSL.g:367:2: ( ( rule__FormalityType__Alternatives ) )
            // InternalPactDSL.g:368:3: ( rule__FormalityType__Alternatives )
            {
             before(grammarAccess.getFormalityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:369:3: ( rule__FormalityType__Alternatives )
            // InternalPactDSL.g:369:4: rule__FormalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormalityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalityType"


    // $ANTLR start "entryRuleInWriting"
    // InternalPactDSL.g:378:1: entryRuleInWriting : ruleInWriting EOF ;
    public final void entryRuleInWriting() throws RecognitionException {
        try {
            // InternalPactDSL.g:379:1: ( ruleInWriting EOF )
            // InternalPactDSL.g:380:1: ruleInWriting EOF
            {
             before(grammarAccess.getInWritingRule()); 
            pushFollow(FOLLOW_1);
            ruleInWriting();

            state._fsp--;

             after(grammarAccess.getInWritingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInWriting"


    // $ANTLR start "ruleInWriting"
    // InternalPactDSL.g:387:1: ruleInWriting : ( ( rule__InWriting__Group__0 ) ) ;
    public final void ruleInWriting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:391:2: ( ( ( rule__InWriting__Group__0 ) ) )
            // InternalPactDSL.g:392:2: ( ( rule__InWriting__Group__0 ) )
            {
            // InternalPactDSL.g:392:2: ( ( rule__InWriting__Group__0 ) )
            // InternalPactDSL.g:393:3: ( rule__InWriting__Group__0 )
            {
             before(grammarAccess.getInWritingAccess().getGroup()); 
            // InternalPactDSL.g:394:3: ( rule__InWriting__Group__0 )
            // InternalPactDSL.g:394:4: rule__InWriting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInWriting"


    // $ANTLR start "entryRuleByEmail"
    // InternalPactDSL.g:403:1: entryRuleByEmail : ruleByEmail EOF ;
    public final void entryRuleByEmail() throws RecognitionException {
        try {
            // InternalPactDSL.g:404:1: ( ruleByEmail EOF )
            // InternalPactDSL.g:405:1: ruleByEmail EOF
            {
             before(grammarAccess.getByEmailRule()); 
            pushFollow(FOLLOW_1);
            ruleByEmail();

            state._fsp--;

             after(grammarAccess.getByEmailRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleByEmail"


    // $ANTLR start "ruleByEmail"
    // InternalPactDSL.g:412:1: ruleByEmail : ( ( rule__ByEmail__Group__0 ) ) ;
    public final void ruleByEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:416:2: ( ( ( rule__ByEmail__Group__0 ) ) )
            // InternalPactDSL.g:417:2: ( ( rule__ByEmail__Group__0 ) )
            {
            // InternalPactDSL.g:417:2: ( ( rule__ByEmail__Group__0 ) )
            // InternalPactDSL.g:418:3: ( rule__ByEmail__Group__0 )
            {
             before(grammarAccess.getByEmailAccess().getGroup()); 
            // InternalPactDSL.g:419:3: ( rule__ByEmail__Group__0 )
            // InternalPactDSL.g:419:4: rule__ByEmail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByEmail"


    // $ANTLR start "entryRuleGivingNotice"
    // InternalPactDSL.g:428:1: entryRuleGivingNotice : ruleGivingNotice EOF ;
    public final void entryRuleGivingNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:429:1: ( ruleGivingNotice EOF )
            // InternalPactDSL.g:430:1: ruleGivingNotice EOF
            {
             before(grammarAccess.getGivingNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleGivingNotice();

            state._fsp--;

             after(grammarAccess.getGivingNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivingNotice"


    // $ANTLR start "ruleGivingNotice"
    // InternalPactDSL.g:437:1: ruleGivingNotice : ( ( rule__GivingNotice__Group__0 ) ) ;
    public final void ruleGivingNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:441:2: ( ( ( rule__GivingNotice__Group__0 ) ) )
            // InternalPactDSL.g:442:2: ( ( rule__GivingNotice__Group__0 ) )
            {
            // InternalPactDSL.g:442:2: ( ( rule__GivingNotice__Group__0 ) )
            // InternalPactDSL.g:443:3: ( rule__GivingNotice__Group__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup()); 
            // InternalPactDSL.g:444:3: ( rule__GivingNotice__Group__0 )
            // InternalPactDSL.g:444:4: rule__GivingNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivingNotice"


    // $ANTLR start "entryRuleCustomFormality"
    // InternalPactDSL.g:453:1: entryRuleCustomFormality : ruleCustomFormality EOF ;
    public final void entryRuleCustomFormality() throws RecognitionException {
        try {
            // InternalPactDSL.g:454:1: ( ruleCustomFormality EOF )
            // InternalPactDSL.g:455:1: ruleCustomFormality EOF
            {
             before(grammarAccess.getCustomFormalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomFormality();

            state._fsp--;

             after(grammarAccess.getCustomFormalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomFormality"


    // $ANTLR start "ruleCustomFormality"
    // InternalPactDSL.g:462:1: ruleCustomFormality : ( ( rule__CustomFormality__Group__0 ) ) ;
    public final void ruleCustomFormality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:466:2: ( ( ( rule__CustomFormality__Group__0 ) ) )
            // InternalPactDSL.g:467:2: ( ( rule__CustomFormality__Group__0 ) )
            {
            // InternalPactDSL.g:467:2: ( ( rule__CustomFormality__Group__0 ) )
            // InternalPactDSL.g:468:3: ( rule__CustomFormality__Group__0 )
            {
             before(grammarAccess.getCustomFormalityAccess().getGroup()); 
            // InternalPactDSL.g:469:3: ( rule__CustomFormality__Group__0 )
            // InternalPactDSL.g:469:4: rule__CustomFormality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomFormality"


    // $ANTLR start "entryRuleActionType"
    // InternalPactDSL.g:478:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalPactDSL.g:479:1: ( ruleActionType EOF )
            // InternalPactDSL.g:480:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalPactDSL.g:487:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:491:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalPactDSL.g:492:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalPactDSL.g:492:2: ( ( rule__ActionType__Alternatives ) )
            // InternalPactDSL.g:493:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:494:3: ( rule__ActionType__Alternatives )
            // InternalPactDSL.g:494:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGivenConsent"
    // InternalPactDSL.g:503:1: entryRuleGivenConsent : ruleGivenConsent EOF ;
    public final void entryRuleGivenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:504:1: ( ruleGivenConsent EOF )
            // InternalPactDSL.g:505:1: ruleGivenConsent EOF
            {
             before(grammarAccess.getGivenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenConsent();

            state._fsp--;

             after(grammarAccess.getGivenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivenConsent"


    // $ANTLR start "ruleGivenConsent"
    // InternalPactDSL.g:512:1: ruleGivenConsent : ( ( rule__GivenConsent__Group__0 ) ) ;
    public final void ruleGivenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:516:2: ( ( ( rule__GivenConsent__Group__0 ) ) )
            // InternalPactDSL.g:517:2: ( ( rule__GivenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:517:2: ( ( rule__GivenConsent__Group__0 ) )
            // InternalPactDSL.g:518:3: ( rule__GivenConsent__Group__0 )
            {
             before(grammarAccess.getGivenConsentAccess().getGroup()); 
            // InternalPactDSL.g:519:3: ( rule__GivenConsent__Group__0 )
            // InternalPactDSL.g:519:4: rule__GivenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenConsent"


    // $ANTLR start "entryRuleGivenWrittenConsent"
    // InternalPactDSL.g:528:1: entryRuleGivenWrittenConsent : ruleGivenWrittenConsent EOF ;
    public final void entryRuleGivenWrittenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:529:1: ( ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:530:1: ruleGivenWrittenConsent EOF
            {
             before(grammarAccess.getGivenWrittenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenWrittenConsent();

            state._fsp--;

             after(grammarAccess.getGivenWrittenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGivenWrittenConsent"


    // $ANTLR start "ruleGivenWrittenConsent"
    // InternalPactDSL.g:537:1: ruleGivenWrittenConsent : ( ( rule__GivenWrittenConsent__Group__0 ) ) ;
    public final void ruleGivenWrittenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:541:2: ( ( ( rule__GivenWrittenConsent__Group__0 ) ) )
            // InternalPactDSL.g:542:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:542:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            // InternalPactDSL.g:543:3: ( rule__GivenWrittenConsent__Group__0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 
            // InternalPactDSL.g:544:3: ( rule__GivenWrittenConsent__Group__0 )
            // InternalPactDSL.g:544:4: rule__GivenWrittenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenWrittenConsent"


    // $ANTLR start "entryRuleCustomAction"
    // InternalPactDSL.g:553:1: entryRuleCustomAction : ruleCustomAction EOF ;
    public final void entryRuleCustomAction() throws RecognitionException {
        try {
            // InternalPactDSL.g:554:1: ( ruleCustomAction EOF )
            // InternalPactDSL.g:555:1: ruleCustomAction EOF
            {
             before(grammarAccess.getCustomActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomAction();

            state._fsp--;

             after(grammarAccess.getCustomActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomAction"


    // $ANTLR start "ruleCustomAction"
    // InternalPactDSL.g:562:1: ruleCustomAction : ( ( rule__CustomAction__Group__0 ) ) ;
    public final void ruleCustomAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:566:2: ( ( ( rule__CustomAction__Group__0 ) ) )
            // InternalPactDSL.g:567:2: ( ( rule__CustomAction__Group__0 ) )
            {
            // InternalPactDSL.g:567:2: ( ( rule__CustomAction__Group__0 ) )
            // InternalPactDSL.g:568:3: ( rule__CustomAction__Group__0 )
            {
             before(grammarAccess.getCustomActionAccess().getGroup()); 
            // InternalPactDSL.g:569:3: ( rule__CustomAction__Group__0 )
            // InternalPactDSL.g:569:4: rule__CustomAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomAction"


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:578:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:579:1: ( ruleStateType EOF )
            // InternalPactDSL.g:580:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // InternalPactDSL.g:587:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:591:2: ( ( ( rule__StateType__Alternatives ) ) )
            // InternalPactDSL.g:592:2: ( ( rule__StateType__Alternatives ) )
            {
            // InternalPactDSL.g:592:2: ( ( rule__StateType__Alternatives ) )
            // InternalPactDSL.g:593:3: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:594:3: ( rule__StateType__Alternatives )
            // InternalPactDSL.g:594:4: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleOwnership"
    // InternalPactDSL.g:603:1: entryRuleOwnership : ruleOwnership EOF ;
    public final void entryRuleOwnership() throws RecognitionException {
        try {
            // InternalPactDSL.g:604:1: ( ruleOwnership EOF )
            // InternalPactDSL.g:605:1: ruleOwnership EOF
            {
             before(grammarAccess.getOwnershipRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnership();

            state._fsp--;

             after(grammarAccess.getOwnershipRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOwnership"


    // $ANTLR start "ruleOwnership"
    // InternalPactDSL.g:612:1: ruleOwnership : ( ( rule__Ownership__Group__0 ) ) ;
    public final void ruleOwnership() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:616:2: ( ( ( rule__Ownership__Group__0 ) ) )
            // InternalPactDSL.g:617:2: ( ( rule__Ownership__Group__0 ) )
            {
            // InternalPactDSL.g:617:2: ( ( rule__Ownership__Group__0 ) )
            // InternalPactDSL.g:618:3: ( rule__Ownership__Group__0 )
            {
             before(grammarAccess.getOwnershipAccess().getGroup()); 
            // InternalPactDSL.g:619:3: ( rule__Ownership__Group__0 )
            // InternalPactDSL.g:619:4: rule__Ownership__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnership"


    // $ANTLR start "entryRuleRightToUse"
    // InternalPactDSL.g:628:1: entryRuleRightToUse : ruleRightToUse EOF ;
    public final void entryRuleRightToUse() throws RecognitionException {
        try {
            // InternalPactDSL.g:629:1: ( ruleRightToUse EOF )
            // InternalPactDSL.g:630:1: ruleRightToUse EOF
            {
             before(grammarAccess.getRightToUseRule()); 
            pushFollow(FOLLOW_1);
            ruleRightToUse();

            state._fsp--;

             after(grammarAccess.getRightToUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightToUse"


    // $ANTLR start "ruleRightToUse"
    // InternalPactDSL.g:637:1: ruleRightToUse : ( ( rule__RightToUse__Group__0 ) ) ;
    public final void ruleRightToUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:641:2: ( ( ( rule__RightToUse__Group__0 ) ) )
            // InternalPactDSL.g:642:2: ( ( rule__RightToUse__Group__0 ) )
            {
            // InternalPactDSL.g:642:2: ( ( rule__RightToUse__Group__0 ) )
            // InternalPactDSL.g:643:3: ( rule__RightToUse__Group__0 )
            {
             before(grammarAccess.getRightToUseAccess().getGroup()); 
            // InternalPactDSL.g:644:3: ( rule__RightToUse__Group__0 )
            // InternalPactDSL.g:644:4: rule__RightToUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightToUse"


    // $ANTLR start "entryRuleCustomState"
    // InternalPactDSL.g:653:1: entryRuleCustomState : ruleCustomState EOF ;
    public final void entryRuleCustomState() throws RecognitionException {
        try {
            // InternalPactDSL.g:654:1: ( ruleCustomState EOF )
            // InternalPactDSL.g:655:1: ruleCustomState EOF
            {
             before(grammarAccess.getCustomStateRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomState();

            state._fsp--;

             after(grammarAccess.getCustomStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomState"


    // $ANTLR start "ruleCustomState"
    // InternalPactDSL.g:662:1: ruleCustomState : ( ( rule__CustomState__Group__0 ) ) ;
    public final void ruleCustomState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:666:2: ( ( ( rule__CustomState__Group__0 ) ) )
            // InternalPactDSL.g:667:2: ( ( rule__CustomState__Group__0 ) )
            {
            // InternalPactDSL.g:667:2: ( ( rule__CustomState__Group__0 ) )
            // InternalPactDSL.g:668:3: ( rule__CustomState__Group__0 )
            {
             before(grammarAccess.getCustomStateAccess().getGroup()); 
            // InternalPactDSL.g:669:3: ( rule__CustomState__Group__0 )
            // InternalPactDSL.g:669:4: rule__CustomState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomState"


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:678:1: entryRulePrimaryObligationType : rulePrimaryObligationType EOF ;
    public final void entryRulePrimaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:679:1: ( rulePrimaryObligationType EOF )
            // InternalPactDSL.g:680:1: rulePrimaryObligationType EOF
            {
             before(grammarAccess.getPrimaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getPrimaryObligationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryObligationType"


    // $ANTLR start "rulePrimaryObligationType"
    // InternalPactDSL.g:687:1: rulePrimaryObligationType : ( ( rule__PrimaryObligationType__Alternatives ) ) ;
    public final void rulePrimaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:691:2: ( ( ( rule__PrimaryObligationType__Alternatives ) ) )
            // InternalPactDSL.g:692:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            {
            // InternalPactDSL.g:692:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            // InternalPactDSL.g:693:3: ( rule__PrimaryObligationType__Alternatives )
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:694:3: ( rule__PrimaryObligationType__Alternatives )
            // InternalPactDSL.g:694:4: rule__PrimaryObligationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryObligationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryObligationType"


    // $ANTLR start "entryRulePaymentObligation"
    // InternalPactDSL.g:703:1: entryRulePaymentObligation : rulePaymentObligation EOF ;
    public final void entryRulePaymentObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:704:1: ( rulePaymentObligation EOF )
            // InternalPactDSL.g:705:1: rulePaymentObligation EOF
            {
             before(grammarAccess.getPaymentObligationRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentObligation();

            state._fsp--;

             after(grammarAccess.getPaymentObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaymentObligation"


    // $ANTLR start "rulePaymentObligation"
    // InternalPactDSL.g:712:1: rulePaymentObligation : ( ( rule__PaymentObligation__Group__0 ) ) ;
    public final void rulePaymentObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:716:2: ( ( ( rule__PaymentObligation__Group__0 ) ) )
            // InternalPactDSL.g:717:2: ( ( rule__PaymentObligation__Group__0 ) )
            {
            // InternalPactDSL.g:717:2: ( ( rule__PaymentObligation__Group__0 ) )
            // InternalPactDSL.g:718:3: ( rule__PaymentObligation__Group__0 )
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup()); 
            // InternalPactDSL.g:719:3: ( rule__PaymentObligation__Group__0 )
            // InternalPactDSL.g:719:4: rule__PaymentObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentObligation"


    // $ANTLR start "entryRuleDeliveryObligation"
    // InternalPactDSL.g:728:1: entryRuleDeliveryObligation : ruleDeliveryObligation EOF ;
    public final void entryRuleDeliveryObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:729:1: ( ruleDeliveryObligation EOF )
            // InternalPactDSL.g:730:1: ruleDeliveryObligation EOF
            {
             before(grammarAccess.getDeliveryObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeliveryObligation();

            state._fsp--;

             after(grammarAccess.getDeliveryObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeliveryObligation"


    // $ANTLR start "ruleDeliveryObligation"
    // InternalPactDSL.g:737:1: ruleDeliveryObligation : ( ( rule__DeliveryObligation__Group__0 ) ) ;
    public final void ruleDeliveryObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:741:2: ( ( ( rule__DeliveryObligation__Group__0 ) ) )
            // InternalPactDSL.g:742:2: ( ( rule__DeliveryObligation__Group__0 ) )
            {
            // InternalPactDSL.g:742:2: ( ( rule__DeliveryObligation__Group__0 ) )
            // InternalPactDSL.g:743:3: ( rule__DeliveryObligation__Group__0 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup()); 
            // InternalPactDSL.g:744:3: ( rule__DeliveryObligation__Group__0 )
            // InternalPactDSL.g:744:4: rule__DeliveryObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryObligation"


    // $ANTLR start "entryRuleTransferObligation"
    // InternalPactDSL.g:753:1: entryRuleTransferObligation : ruleTransferObligation EOF ;
    public final void entryRuleTransferObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:754:1: ( ruleTransferObligation EOF )
            // InternalPactDSL.g:755:1: ruleTransferObligation EOF
            {
             before(grammarAccess.getTransferObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransferObligation();

            state._fsp--;

             after(grammarAccess.getTransferObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransferObligation"


    // $ANTLR start "ruleTransferObligation"
    // InternalPactDSL.g:762:1: ruleTransferObligation : ( ( rule__TransferObligation__Group__0 ) ) ;
    public final void ruleTransferObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:766:2: ( ( ( rule__TransferObligation__Group__0 ) ) )
            // InternalPactDSL.g:767:2: ( ( rule__TransferObligation__Group__0 ) )
            {
            // InternalPactDSL.g:767:2: ( ( rule__TransferObligation__Group__0 ) )
            // InternalPactDSL.g:768:3: ( rule__TransferObligation__Group__0 )
            {
             before(grammarAccess.getTransferObligationAccess().getGroup()); 
            // InternalPactDSL.g:769:3: ( rule__TransferObligation__Group__0 )
            // InternalPactDSL.g:769:4: rule__TransferObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransferObligation"


    // $ANTLR start "entryRuleLicenceObligation"
    // InternalPactDSL.g:778:1: entryRuleLicenceObligation : ruleLicenceObligation EOF ;
    public final void entryRuleLicenceObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:779:1: ( ruleLicenceObligation EOF )
            // InternalPactDSL.g:780:1: ruleLicenceObligation EOF
            {
             before(grammarAccess.getLicenceObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleLicenceObligation();

            state._fsp--;

             after(grammarAccess.getLicenceObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLicenceObligation"


    // $ANTLR start "ruleLicenceObligation"
    // InternalPactDSL.g:787:1: ruleLicenceObligation : ( ( rule__LicenceObligation__Group__0 ) ) ;
    public final void ruleLicenceObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:791:2: ( ( ( rule__LicenceObligation__Group__0 ) ) )
            // InternalPactDSL.g:792:2: ( ( rule__LicenceObligation__Group__0 ) )
            {
            // InternalPactDSL.g:792:2: ( ( rule__LicenceObligation__Group__0 ) )
            // InternalPactDSL.g:793:3: ( rule__LicenceObligation__Group__0 )
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup()); 
            // InternalPactDSL.g:794:3: ( rule__LicenceObligation__Group__0 )
            // InternalPactDSL.g:794:4: rule__LicenceObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:803:1: entryRuleConstraintParty : ruleConstraintParty EOF ;
    public final void entryRuleConstraintParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:804:1: ( ruleConstraintParty EOF )
            // InternalPactDSL.g:805:1: ruleConstraintParty EOF
            {
             before(grammarAccess.getConstraintPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintParty();

            state._fsp--;

             after(grammarAccess.getConstraintPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintParty"


    // $ANTLR start "ruleConstraintParty"
    // InternalPactDSL.g:812:1: ruleConstraintParty : ( ( rule__ConstraintParty__Group__0 ) ) ;
    public final void ruleConstraintParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:816:2: ( ( ( rule__ConstraintParty__Group__0 ) ) )
            // InternalPactDSL.g:817:2: ( ( rule__ConstraintParty__Group__0 ) )
            {
            // InternalPactDSL.g:817:2: ( ( rule__ConstraintParty__Group__0 ) )
            // InternalPactDSL.g:818:3: ( rule__ConstraintParty__Group__0 )
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup()); 
            // InternalPactDSL.g:819:3: ( rule__ConstraintParty__Group__0 )
            // InternalPactDSL.g:819:4: rule__ConstraintParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintParty"


    // $ANTLR start "entryRuleConstraintThirdParty"
    // InternalPactDSL.g:828:1: entryRuleConstraintThirdParty : ruleConstraintThirdParty EOF ;
    public final void entryRuleConstraintThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:829:1: ( ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:830:1: ruleConstraintThirdParty EOF
            {
             before(grammarAccess.getConstraintThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintThirdParty();

            state._fsp--;

             after(grammarAccess.getConstraintThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintThirdParty"


    // $ANTLR start "ruleConstraintThirdParty"
    // InternalPactDSL.g:837:1: ruleConstraintThirdParty : ( ( rule__ConstraintThirdParty__Group__0 ) ) ;
    public final void ruleConstraintThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:841:2: ( ( ( rule__ConstraintThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:842:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:842:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            // InternalPactDSL.g:843:3: ( rule__ConstraintThirdParty__Group__0 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:844:3: ( rule__ConstraintThirdParty__Group__0 )
            // InternalPactDSL.g:844:4: rule__ConstraintThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintThirdParty"


    // $ANTLR start "entryRuleCustomObligation"
    // InternalPactDSL.g:853:1: entryRuleCustomObligation : ruleCustomObligation EOF ;
    public final void entryRuleCustomObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:854:1: ( ruleCustomObligation EOF )
            // InternalPactDSL.g:855:1: ruleCustomObligation EOF
            {
             before(grammarAccess.getCustomObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomObligation();

            state._fsp--;

             after(grammarAccess.getCustomObligationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomObligation"


    // $ANTLR start "ruleCustomObligation"
    // InternalPactDSL.g:862:1: ruleCustomObligation : ( ( rule__CustomObligation__Group__0 ) ) ;
    public final void ruleCustomObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:866:2: ( ( ( rule__CustomObligation__Group__0 ) ) )
            // InternalPactDSL.g:867:2: ( ( rule__CustomObligation__Group__0 ) )
            {
            // InternalPactDSL.g:867:2: ( ( rule__CustomObligation__Group__0 ) )
            // InternalPactDSL.g:868:3: ( rule__CustomObligation__Group__0 )
            {
             before(grammarAccess.getCustomObligationAccess().getGroup()); 
            // InternalPactDSL.g:869:3: ( rule__CustomObligation__Group__0 )
            // InternalPactDSL.g:869:4: rule__CustomObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomObligation"


    // $ANTLR start "entryRuleSecondaryObligationType"
    // InternalPactDSL.g:878:1: entryRuleSecondaryObligationType : ruleSecondaryObligationType EOF ;
    public final void entryRuleSecondaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:879:1: ( ruleSecondaryObligationType EOF )
            // InternalPactDSL.g:880:1: ruleSecondaryObligationType EOF
            {
             before(grammarAccess.getSecondaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSecondaryObligationType();

            state._fsp--;

             after(grammarAccess.getSecondaryObligationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecondaryObligationType"


    // $ANTLR start "ruleSecondaryObligationType"
    // InternalPactDSL.g:887:1: ruleSecondaryObligationType : ( ( rule__SecondaryObligationType__Group__0 ) ) ;
    public final void ruleSecondaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:891:2: ( ( ( rule__SecondaryObligationType__Group__0 ) ) )
            // InternalPactDSL.g:892:2: ( ( rule__SecondaryObligationType__Group__0 ) )
            {
            // InternalPactDSL.g:892:2: ( ( rule__SecondaryObligationType__Group__0 ) )
            // InternalPactDSL.g:893:3: ( rule__SecondaryObligationType__Group__0 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getGroup()); 
            // InternalPactDSL.g:894:3: ( rule__SecondaryObligationType__Group__0 )
            // InternalPactDSL.g:894:4: rule__SecondaryObligationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecondaryObligationType"


    // $ANTLR start "entryRuleLiabilityType"
    // InternalPactDSL.g:903:1: entryRuleLiabilityType : ruleLiabilityType EOF ;
    public final void entryRuleLiabilityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:904:1: ( ruleLiabilityType EOF )
            // InternalPactDSL.g:905:1: ruleLiabilityType EOF
            {
             before(grammarAccess.getLiabilityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLiabilityType();

            state._fsp--;

             after(grammarAccess.getLiabilityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiabilityType"


    // $ANTLR start "ruleLiabilityType"
    // InternalPactDSL.g:912:1: ruleLiabilityType : ( ( rule__LiabilityType__Alternatives ) ) ;
    public final void ruleLiabilityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:916:2: ( ( ( rule__LiabilityType__Alternatives ) ) )
            // InternalPactDSL.g:917:2: ( ( rule__LiabilityType__Alternatives ) )
            {
            // InternalPactDSL.g:917:2: ( ( rule__LiabilityType__Alternatives ) )
            // InternalPactDSL.g:918:3: ( rule__LiabilityType__Alternatives )
            {
             before(grammarAccess.getLiabilityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:919:3: ( rule__LiabilityType__Alternatives )
            // InternalPactDSL.g:919:4: rule__LiabilityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiabilityType"


    // $ANTLR start "entryRuleLiabilityToParty"
    // InternalPactDSL.g:928:1: entryRuleLiabilityToParty : ruleLiabilityToParty EOF ;
    public final void entryRuleLiabilityToParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:929:1: ( ruleLiabilityToParty EOF )
            // InternalPactDSL.g:930:1: ruleLiabilityToParty EOF
            {
             before(grammarAccess.getLiabilityToPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleLiabilityToParty();

            state._fsp--;

             after(grammarAccess.getLiabilityToPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiabilityToParty"


    // $ANTLR start "ruleLiabilityToParty"
    // InternalPactDSL.g:937:1: ruleLiabilityToParty : ( ( rule__LiabilityToParty__Group__0 ) ) ;
    public final void ruleLiabilityToParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:941:2: ( ( ( rule__LiabilityToParty__Group__0 ) ) )
            // InternalPactDSL.g:942:2: ( ( rule__LiabilityToParty__Group__0 ) )
            {
            // InternalPactDSL.g:942:2: ( ( rule__LiabilityToParty__Group__0 ) )
            // InternalPactDSL.g:943:3: ( rule__LiabilityToParty__Group__0 )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getGroup()); 
            // InternalPactDSL.g:944:3: ( rule__LiabilityToParty__Group__0 )
            // InternalPactDSL.g:944:4: rule__LiabilityToParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiabilityToParty"


    // $ANTLR start "entryRuleLiabilityToThirdParty"
    // InternalPactDSL.g:953:1: entryRuleLiabilityToThirdParty : ruleLiabilityToThirdParty EOF ;
    public final void entryRuleLiabilityToThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:954:1: ( ruleLiabilityToThirdParty EOF )
            // InternalPactDSL.g:955:1: ruleLiabilityToThirdParty EOF
            {
             before(grammarAccess.getLiabilityToThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleLiabilityToThirdParty();

            state._fsp--;

             after(grammarAccess.getLiabilityToThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiabilityToThirdParty"


    // $ANTLR start "ruleLiabilityToThirdParty"
    // InternalPactDSL.g:962:1: ruleLiabilityToThirdParty : ( ( rule__LiabilityToThirdParty__Group__0 ) ) ;
    public final void ruleLiabilityToThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:966:2: ( ( ( rule__LiabilityToThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:967:2: ( ( rule__LiabilityToThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:967:2: ( ( rule__LiabilityToThirdParty__Group__0 ) )
            // InternalPactDSL.g:968:3: ( rule__LiabilityToThirdParty__Group__0 )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:969:3: ( rule__LiabilityToThirdParty__Group__0 )
            // InternalPactDSL.g:969:4: rule__LiabilityToThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiabilityToThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:978:1: entryRuleTerminationType : ruleTerminationType EOF ;
    public final void entryRuleTerminationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:979:1: ( ruleTerminationType EOF )
            // InternalPactDSL.g:980:1: ruleTerminationType EOF
            {
             before(grammarAccess.getTerminationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getTerminationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminationType"


    // $ANTLR start "ruleTerminationType"
    // InternalPactDSL.g:987:1: ruleTerminationType : ( ( rule__TerminationType__Alternatives ) ) ;
    public final void ruleTerminationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:991:2: ( ( ( rule__TerminationType__Alternatives ) ) )
            // InternalPactDSL.g:992:2: ( ( rule__TerminationType__Alternatives ) )
            {
            // InternalPactDSL.g:992:2: ( ( rule__TerminationType__Alternatives ) )
            // InternalPactDSL.g:993:3: ( rule__TerminationType__Alternatives )
            {
             before(grammarAccess.getTerminationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:994:3: ( rule__TerminationType__Alternatives )
            // InternalPactDSL.g:994:4: rule__TerminationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminationType"


    // $ANTLR start "entryRuleForConvenience"
    // InternalPactDSL.g:1003:1: entryRuleForConvenience : ruleForConvenience EOF ;
    public final void entryRuleForConvenience() throws RecognitionException {
        try {
            // InternalPactDSL.g:1004:1: ( ruleForConvenience EOF )
            // InternalPactDSL.g:1005:1: ruleForConvenience EOF
            {
             before(grammarAccess.getForConvenienceRule()); 
            pushFollow(FOLLOW_1);
            ruleForConvenience();

            state._fsp--;

             after(grammarAccess.getForConvenienceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForConvenience"


    // $ANTLR start "ruleForConvenience"
    // InternalPactDSL.g:1012:1: ruleForConvenience : ( ( rule__ForConvenience__Group__0 ) ) ;
    public final void ruleForConvenience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1016:2: ( ( ( rule__ForConvenience__Group__0 ) ) )
            // InternalPactDSL.g:1017:2: ( ( rule__ForConvenience__Group__0 ) )
            {
            // InternalPactDSL.g:1017:2: ( ( rule__ForConvenience__Group__0 ) )
            // InternalPactDSL.g:1018:3: ( rule__ForConvenience__Group__0 )
            {
             before(grammarAccess.getForConvenienceAccess().getGroup()); 
            // InternalPactDSL.g:1019:3: ( rule__ForConvenience__Group__0 )
            // InternalPactDSL.g:1019:4: rule__ForConvenience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForConvenience"


    // $ANTLR start "entryRuleOnReasonableNotice"
    // InternalPactDSL.g:1028:1: entryRuleOnReasonableNotice : ruleOnReasonableNotice EOF ;
    public final void entryRuleOnReasonableNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:1029:1: ( ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:1030:1: ruleOnReasonableNotice EOF
            {
             before(grammarAccess.getOnReasonableNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleOnReasonableNotice();

            state._fsp--;

             after(grammarAccess.getOnReasonableNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnReasonableNotice"


    // $ANTLR start "ruleOnReasonableNotice"
    // InternalPactDSL.g:1037:1: ruleOnReasonableNotice : ( ( rule__OnReasonableNotice__Group__0 ) ) ;
    public final void ruleOnReasonableNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1041:2: ( ( ( rule__OnReasonableNotice__Group__0 ) ) )
            // InternalPactDSL.g:1042:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            {
            // InternalPactDSL.g:1042:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            // InternalPactDSL.g:1043:3: ( rule__OnReasonableNotice__Group__0 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 
            // InternalPactDSL.g:1044:3: ( rule__OnReasonableNotice__Group__0 )
            // InternalPactDSL.g:1044:4: rule__OnReasonableNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnReasonableNotice"


    // $ANTLR start "entryRuleForBreach"
    // InternalPactDSL.g:1053:1: entryRuleForBreach : ruleForBreach EOF ;
    public final void entryRuleForBreach() throws RecognitionException {
        try {
            // InternalPactDSL.g:1054:1: ( ruleForBreach EOF )
            // InternalPactDSL.g:1055:1: ruleForBreach EOF
            {
             before(grammarAccess.getForBreachRule()); 
            pushFollow(FOLLOW_1);
            ruleForBreach();

            state._fsp--;

             after(grammarAccess.getForBreachRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForBreach"


    // $ANTLR start "ruleForBreach"
    // InternalPactDSL.g:1062:1: ruleForBreach : ( ( rule__ForBreach__Group__0 ) ) ;
    public final void ruleForBreach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1066:2: ( ( ( rule__ForBreach__Group__0 ) ) )
            // InternalPactDSL.g:1067:2: ( ( rule__ForBreach__Group__0 ) )
            {
            // InternalPactDSL.g:1067:2: ( ( rule__ForBreach__Group__0 ) )
            // InternalPactDSL.g:1068:3: ( rule__ForBreach__Group__0 )
            {
             before(grammarAccess.getForBreachAccess().getGroup()); 
            // InternalPactDSL.g:1069:3: ( rule__ForBreach__Group__0 )
            // InternalPactDSL.g:1069:4: rule__ForBreach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForBreach"


    // $ANTLR start "entryRuleOnInsolvencyEvent"
    // InternalPactDSL.g:1078:1: entryRuleOnInsolvencyEvent : ruleOnInsolvencyEvent EOF ;
    public final void entryRuleOnInsolvencyEvent() throws RecognitionException {
        try {
            // InternalPactDSL.g:1079:1: ( ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:1080:1: ruleOnInsolvencyEvent EOF
            {
             before(grammarAccess.getOnInsolvencyEventRule()); 
            pushFollow(FOLLOW_1);
            ruleOnInsolvencyEvent();

            state._fsp--;

             after(grammarAccess.getOnInsolvencyEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnInsolvencyEvent"


    // $ANTLR start "ruleOnInsolvencyEvent"
    // InternalPactDSL.g:1087:1: ruleOnInsolvencyEvent : ( ( rule__OnInsolvencyEvent__Group__0 ) ) ;
    public final void ruleOnInsolvencyEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1091:2: ( ( ( rule__OnInsolvencyEvent__Group__0 ) ) )
            // InternalPactDSL.g:1092:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            {
            // InternalPactDSL.g:1092:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            // InternalPactDSL.g:1093:3: ( rule__OnInsolvencyEvent__Group__0 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 
            // InternalPactDSL.g:1094:3: ( rule__OnInsolvencyEvent__Group__0 )
            // InternalPactDSL.g:1094:4: rule__OnInsolvencyEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnInsolvencyEvent"


    // $ANTLR start "entryRuleCustomTermination"
    // InternalPactDSL.g:1103:1: entryRuleCustomTermination : ruleCustomTermination EOF ;
    public final void entryRuleCustomTermination() throws RecognitionException {
        try {
            // InternalPactDSL.g:1104:1: ( ruleCustomTermination EOF )
            // InternalPactDSL.g:1105:1: ruleCustomTermination EOF
            {
             before(grammarAccess.getCustomTerminationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomTermination();

            state._fsp--;

             after(grammarAccess.getCustomTerminationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomTermination"


    // $ANTLR start "ruleCustomTermination"
    // InternalPactDSL.g:1112:1: ruleCustomTermination : ( ( rule__CustomTermination__Group__0 ) ) ;
    public final void ruleCustomTermination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1116:2: ( ( ( rule__CustomTermination__Group__0 ) ) )
            // InternalPactDSL.g:1117:2: ( ( rule__CustomTermination__Group__0 ) )
            {
            // InternalPactDSL.g:1117:2: ( ( rule__CustomTermination__Group__0 ) )
            // InternalPactDSL.g:1118:3: ( rule__CustomTermination__Group__0 )
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup()); 
            // InternalPactDSL.g:1119:3: ( rule__CustomTermination__Group__0 )
            // InternalPactDSL.g:1119:4: rule__CustomTermination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTermination"


    // $ANTLR start "entryRuleBoilerplateType"
    // InternalPactDSL.g:1128:1: entryRuleBoilerplateType : ruleBoilerplateType EOF ;
    public final void entryRuleBoilerplateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:1129:1: ( ruleBoilerplateType EOF )
            // InternalPactDSL.g:1130:1: ruleBoilerplateType EOF
            {
             before(grammarAccess.getBoilerplateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getBoilerplateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoilerplateType"


    // $ANTLR start "ruleBoilerplateType"
    // InternalPactDSL.g:1137:1: ruleBoilerplateType : ( ( rule__BoilerplateType__Alternatives ) ) ;
    public final void ruleBoilerplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1141:2: ( ( ( rule__BoilerplateType__Alternatives ) ) )
            // InternalPactDSL.g:1142:2: ( ( rule__BoilerplateType__Alternatives ) )
            {
            // InternalPactDSL.g:1142:2: ( ( rule__BoilerplateType__Alternatives ) )
            // InternalPactDSL.g:1143:3: ( rule__BoilerplateType__Alternatives )
            {
             before(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:1144:3: ( rule__BoilerplateType__Alternatives )
            // InternalPactDSL.g:1144:4: rule__BoilerplateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoilerplateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoilerplateType"


    // $ANTLR start "entryRuleApplicableLaw"
    // InternalPactDSL.g:1153:1: entryRuleApplicableLaw : ruleApplicableLaw EOF ;
    public final void entryRuleApplicableLaw() throws RecognitionException {
        try {
            // InternalPactDSL.g:1154:1: ( ruleApplicableLaw EOF )
            // InternalPactDSL.g:1155:1: ruleApplicableLaw EOF
            {
             before(grammarAccess.getApplicableLawRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicableLaw();

            state._fsp--;

             after(grammarAccess.getApplicableLawRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicableLaw"


    // $ANTLR start "ruleApplicableLaw"
    // InternalPactDSL.g:1162:1: ruleApplicableLaw : ( ( rule__ApplicableLaw__Group__0 ) ) ;
    public final void ruleApplicableLaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1166:2: ( ( ( rule__ApplicableLaw__Group__0 ) ) )
            // InternalPactDSL.g:1167:2: ( ( rule__ApplicableLaw__Group__0 ) )
            {
            // InternalPactDSL.g:1167:2: ( ( rule__ApplicableLaw__Group__0 ) )
            // InternalPactDSL.g:1168:3: ( rule__ApplicableLaw__Group__0 )
            {
             before(grammarAccess.getApplicableLawAccess().getGroup()); 
            // InternalPactDSL.g:1169:3: ( rule__ApplicableLaw__Group__0 )
            // InternalPactDSL.g:1169:4: rule__ApplicableLaw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicableLaw"


    // $ANTLR start "entryRuleJurisdiction"
    // InternalPactDSL.g:1178:1: entryRuleJurisdiction : ruleJurisdiction EOF ;
    public final void entryRuleJurisdiction() throws RecognitionException {
        try {
            // InternalPactDSL.g:1179:1: ( ruleJurisdiction EOF )
            // InternalPactDSL.g:1180:1: ruleJurisdiction EOF
            {
             before(grammarAccess.getJurisdictionRule()); 
            pushFollow(FOLLOW_1);
            ruleJurisdiction();

            state._fsp--;

             after(grammarAccess.getJurisdictionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJurisdiction"


    // $ANTLR start "ruleJurisdiction"
    // InternalPactDSL.g:1187:1: ruleJurisdiction : ( ( rule__Jurisdiction__Group__0 ) ) ;
    public final void ruleJurisdiction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1191:2: ( ( ( rule__Jurisdiction__Group__0 ) ) )
            // InternalPactDSL.g:1192:2: ( ( rule__Jurisdiction__Group__0 ) )
            {
            // InternalPactDSL.g:1192:2: ( ( rule__Jurisdiction__Group__0 ) )
            // InternalPactDSL.g:1193:3: ( rule__Jurisdiction__Group__0 )
            {
             before(grammarAccess.getJurisdictionAccess().getGroup()); 
            // InternalPactDSL.g:1194:3: ( rule__Jurisdiction__Group__0 )
            // InternalPactDSL.g:1194:4: rule__Jurisdiction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJurisdiction"


    // $ANTLR start "entryRuleNotices"
    // InternalPactDSL.g:1203:1: entryRuleNotices : ruleNotices EOF ;
    public final void entryRuleNotices() throws RecognitionException {
        try {
            // InternalPactDSL.g:1204:1: ( ruleNotices EOF )
            // InternalPactDSL.g:1205:1: ruleNotices EOF
            {
             before(grammarAccess.getNoticesRule()); 
            pushFollow(FOLLOW_1);
            ruleNotices();

            state._fsp--;

             after(grammarAccess.getNoticesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotices"


    // $ANTLR start "ruleNotices"
    // InternalPactDSL.g:1212:1: ruleNotices : ( ( rule__Notices__Group__0 ) ) ;
    public final void ruleNotices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1216:2: ( ( ( rule__Notices__Group__0 ) ) )
            // InternalPactDSL.g:1217:2: ( ( rule__Notices__Group__0 ) )
            {
            // InternalPactDSL.g:1217:2: ( ( rule__Notices__Group__0 ) )
            // InternalPactDSL.g:1218:3: ( rule__Notices__Group__0 )
            {
             before(grammarAccess.getNoticesAccess().getGroup()); 
            // InternalPactDSL.g:1219:3: ( rule__Notices__Group__0 )
            // InternalPactDSL.g:1219:4: rule__Notices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotices"


    // $ANTLR start "entryRuleCustomBoilerplate"
    // InternalPactDSL.g:1228:1: entryRuleCustomBoilerplate : ruleCustomBoilerplate EOF ;
    public final void entryRuleCustomBoilerplate() throws RecognitionException {
        try {
            // InternalPactDSL.g:1229:1: ( ruleCustomBoilerplate EOF )
            // InternalPactDSL.g:1230:1: ruleCustomBoilerplate EOF
            {
             before(grammarAccess.getCustomBoilerplateRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomBoilerplate();

            state._fsp--;

             after(grammarAccess.getCustomBoilerplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomBoilerplate"


    // $ANTLR start "ruleCustomBoilerplate"
    // InternalPactDSL.g:1237:1: ruleCustomBoilerplate : ( ( rule__CustomBoilerplate__Group__0 ) ) ;
    public final void ruleCustomBoilerplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1241:2: ( ( ( rule__CustomBoilerplate__Group__0 ) ) )
            // InternalPactDSL.g:1242:2: ( ( rule__CustomBoilerplate__Group__0 ) )
            {
            // InternalPactDSL.g:1242:2: ( ( rule__CustomBoilerplate__Group__0 ) )
            // InternalPactDSL.g:1243:3: ( rule__CustomBoilerplate__Group__0 )
            {
             before(grammarAccess.getCustomBoilerplateAccess().getGroup()); 
            // InternalPactDSL.g:1244:3: ( rule__CustomBoilerplate__Group__0 )
            // InternalPactDSL.g:1244:4: rule__CustomBoilerplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomBoilerplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomBoilerplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomBoilerplate"


    // $ANTLR start "rule__EntityType__Alternatives"
    // InternalPactDSL.g:1252:1: rule__EntityType__Alternatives : ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1256:1: ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPactDSL.g:1257:2: ( ruleEffectiveDate )
                    {
                    // InternalPactDSL.g:1257:2: ( ruleEffectiveDate )
                    // InternalPactDSL.g:1258:3: ruleEffectiveDate
                    {
                     before(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectiveDate();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1263:2: ( ruleParty )
                    {
                    // InternalPactDSL.g:1263:2: ( ruleParty )
                    // InternalPactDSL.g:1264:3: ruleParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1269:2: ( ruleThirdParty )
                    {
                    // InternalPactDSL.g:1269:2: ( ruleThirdParty )
                    // InternalPactDSL.g:1270:3: ruleThirdParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThirdParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1275:2: ( ruleSubjectMatter )
                    {
                    // InternalPactDSL.g:1275:2: ( ruleSubjectMatter )
                    // InternalPactDSL.g:1276:3: ruleSubjectMatter
                    {
                     before(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubjectMatter();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityType__Alternatives"


    // $ANTLR start "rule__FeatureType__Alternatives"
    // InternalPactDSL.g:1285:1: rule__FeatureType__Alternatives : ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) );
    public final void rule__FeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1289:1: ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 34:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPactDSL.g:1290:2: ( ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:1290:2: ( ruleDefinedTerm )
                    // InternalPactDSL.g:1291:3: ruleDefinedTerm
                    {
                     before(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinedTerm();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getDefinedTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1296:2: ( ruleAddress )
                    {
                    // InternalPactDSL.g:1296:2: ( ruleAddress )
                    // InternalPactDSL.g:1297:3: ruleAddress
                    {
                     before(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAddress();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getAddressParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1302:2: ( ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:1302:2: ( ruleCompanyNumber )
                    // InternalPactDSL.g:1303:3: ruleCompanyNumber
                    {
                     before(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCompanyNumber();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getCompanyNumberParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1308:2: ( ruleCustomFeature )
                    {
                    // InternalPactDSL.g:1308:2: ( ruleCustomFeature )
                    // InternalPactDSL.g:1309:3: ruleCustomFeature
                    {
                     before(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureTypeAccess().getCustomFeatureParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureType__Alternatives"


    // $ANTLR start "rule__FormalityType__Alternatives"
    // InternalPactDSL.g:1318:1: rule__FormalityType__Alternatives : ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) );
    public final void rule__FormalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1322:1: ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPactDSL.g:1323:2: ( ruleInWriting )
                    {
                    // InternalPactDSL.g:1323:2: ( ruleInWriting )
                    // InternalPactDSL.g:1324:3: ruleInWriting
                    {
                     before(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInWriting();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1329:2: ( ruleByEmail )
                    {
                    // InternalPactDSL.g:1329:2: ( ruleByEmail )
                    // InternalPactDSL.g:1330:3: ruleByEmail
                    {
                     before(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByEmail();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1335:2: ( ruleGivingNotice )
                    {
                    // InternalPactDSL.g:1335:2: ( ruleGivingNotice )
                    // InternalPactDSL.g:1336:3: ruleGivingNotice
                    {
                     before(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGivingNotice();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1341:2: ( ruleCustomFormality )
                    {
                    // InternalPactDSL.g:1341:2: ( ruleCustomFormality )
                    // InternalPactDSL.g:1342:3: ruleCustomFormality
                    {
                     before(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomFormality();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormalityType__Alternatives"


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalPactDSL.g:1351:1: rule__ActionType__Alternatives : ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) | ( ruleCustomAction ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1355:1: ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) | ( ruleCustomAction ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 45:
                    {
                    alt4=2;
                    }
                    break;
                case 44:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPactDSL.g:1356:2: ( ruleGivenConsent )
                    {
                    // InternalPactDSL.g:1356:2: ( ruleGivenConsent )
                    // InternalPactDSL.g:1357:3: ruleGivenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1362:2: ( ruleGivenWrittenConsent )
                    {
                    // InternalPactDSL.g:1362:2: ( ruleGivenWrittenConsent )
                    // InternalPactDSL.g:1363:3: ruleGivenWrittenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenWrittenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1368:2: ( ruleCustomAction )
                    {
                    // InternalPactDSL.g:1368:2: ( ruleCustomAction )
                    // InternalPactDSL.g:1369:3: ruleCustomAction
                    {
                     before(grammarAccess.getActionTypeAccess().getCustomActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomAction();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getCustomActionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__StateType__Alternatives"
    // InternalPactDSL.g:1378:1: rule__StateType__Alternatives : ( ( ruleOwnership ) | ( ruleRightToUse ) | ( ruleCustomState ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1382:1: ( ( ruleOwnership ) | ( ruleRightToUse ) | ( ruleCustomState ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt5=1;
                }
                break;
            case 47:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:1383:2: ( ruleOwnership )
                    {
                    // InternalPactDSL.g:1383:2: ( ruleOwnership )
                    // InternalPactDSL.g:1384:3: ruleOwnership
                    {
                     before(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOwnership();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1389:2: ( ruleRightToUse )
                    {
                    // InternalPactDSL.g:1389:2: ( ruleRightToUse )
                    // InternalPactDSL.g:1390:3: ruleRightToUse
                    {
                     before(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightToUse();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1395:2: ( ruleCustomState )
                    {
                    // InternalPactDSL.g:1395:2: ( ruleCustomState )
                    // InternalPactDSL.g:1396:3: ruleCustomState
                    {
                     before(grammarAccess.getStateTypeAccess().getCustomStateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomState();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getCustomStateParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Alternatives"


    // $ANTLR start "rule__Ownership__Alternatives_2"
    // InternalPactDSL.g:1405:1: rule__Ownership__Alternatives_2 : ( ( 'owns' ) | ( 'doesNotOwn' ) );
    public final void rule__Ownership__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1409:1: ( ( 'owns' ) | ( 'doesNotOwn' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPactDSL.g:1410:2: ( 'owns' )
                    {
                    // InternalPactDSL.g:1410:2: ( 'owns' )
                    // InternalPactDSL.g:1411:3: 'owns'
                    {
                     before(grammarAccess.getOwnershipAccess().getOwnsKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getOwnsKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1416:2: ( 'doesNotOwn' )
                    {
                    // InternalPactDSL.g:1416:2: ( 'doesNotOwn' )
                    // InternalPactDSL.g:1417:3: 'doesNotOwn'
                    {
                     before(grammarAccess.getOwnershipAccess().getDoesNotOwnKeyword_2_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getDoesNotOwnKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Alternatives_2"


    // $ANTLR start "rule__RightToUse__Alternatives_2"
    // InternalPactDSL.g:1426:1: rule__RightToUse__Alternatives_2 : ( ( 'mayUse' ) | ( 'mayNotUse' ) );
    public final void rule__RightToUse__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1430:1: ( ( 'mayUse' ) | ( 'mayNotUse' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPactDSL.g:1431:2: ( 'mayUse' )
                    {
                    // InternalPactDSL.g:1431:2: ( 'mayUse' )
                    // InternalPactDSL.g:1432:3: 'mayUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayUseKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayUseKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1437:2: ( 'mayNotUse' )
                    {
                    // InternalPactDSL.g:1437:2: ( 'mayNotUse' )
                    // InternalPactDSL.g:1438:3: 'mayNotUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_2_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Alternatives_2"


    // $ANTLR start "rule__PrimaryObligationType__Alternatives"
    // InternalPactDSL.g:1447:1: rule__PrimaryObligationType__Alternatives : ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ruleCustomObligation ) );
    public final void rule__PrimaryObligationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1451:1: ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ruleCustomObligation ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt8=1;
                }
                break;
            case 53:
                {
                alt8=2;
                }
                break;
            case 55:
                {
                alt8=3;
                }
                break;
            case 57:
                {
                alt8=4;
                }
                break;
            case 61:
                {
                alt8=5;
                }
                break;
            case 62:
                {
                alt8=6;
                }
                break;
            case 66:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPactDSL.g:1452:2: ( rulePaymentObligation )
                    {
                    // InternalPactDSL.g:1452:2: ( rulePaymentObligation )
                    // InternalPactDSL.g:1453:3: rulePaymentObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1458:2: ( ruleDeliveryObligation )
                    {
                    // InternalPactDSL.g:1458:2: ( ruleDeliveryObligation )
                    // InternalPactDSL.g:1459:3: ruleDeliveryObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeliveryObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1464:2: ( ruleTransferObligation )
                    {
                    // InternalPactDSL.g:1464:2: ( ruleTransferObligation )
                    // InternalPactDSL.g:1465:3: ruleTransferObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransferObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1470:2: ( ruleLicenceObligation )
                    {
                    // InternalPactDSL.g:1470:2: ( ruleLicenceObligation )
                    // InternalPactDSL.g:1471:3: ruleLicenceObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLicenceObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1476:2: ( ruleConstraintParty )
                    {
                    // InternalPactDSL.g:1476:2: ( ruleConstraintParty )
                    // InternalPactDSL.g:1477:3: ruleConstraintParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPactDSL.g:1482:2: ( ruleConstraintThirdParty )
                    {
                    // InternalPactDSL.g:1482:2: ( ruleConstraintThirdParty )
                    // InternalPactDSL.g:1483:3: ruleConstraintThirdParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintThirdParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPactDSL.g:1488:2: ( ruleCustomObligation )
                    {
                    // InternalPactDSL.g:1488:2: ( ruleCustomObligation )
                    // InternalPactDSL.g:1489:3: ruleCustomObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryObligationType__Alternatives"


    // $ANTLR start "rule__CustomObligation__Alternatives_2"
    // InternalPactDSL.g:1498:1: rule__CustomObligation__Alternatives_2 : ( ( 'must' ) | ( 'mustNot' ) );
    public final void rule__CustomObligation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1502:1: ( ( 'must' ) | ( 'mustNot' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPactDSL.g:1503:2: ( 'must' )
                    {
                    // InternalPactDSL.g:1503:2: ( 'must' )
                    // InternalPactDSL.g:1504:3: 'must'
                    {
                     before(grammarAccess.getCustomObligationAccess().getMustKeyword_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCustomObligationAccess().getMustKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1509:2: ( 'mustNot' )
                    {
                    // InternalPactDSL.g:1509:2: ( 'mustNot' )
                    // InternalPactDSL.g:1510:3: 'mustNot'
                    {
                     before(grammarAccess.getCustomObligationAccess().getMustNotKeyword_2_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCustomObligationAccess().getMustNotKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Alternatives_2"


    // $ANTLR start "rule__LiabilityType__Alternatives"
    // InternalPactDSL.g:1519:1: rule__LiabilityType__Alternatives : ( ( ruleLiabilityToParty ) | ( ruleLiabilityToThirdParty ) );
    public final void rule__LiabilityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1523:1: ( ( ruleLiabilityToParty ) | ( ruleLiabilityToThirdParty ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==69) ) {
                alt10=1;
            }
            else if ( (LA10_0==72) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:1524:2: ( ruleLiabilityToParty )
                    {
                    // InternalPactDSL.g:1524:2: ( ruleLiabilityToParty )
                    // InternalPactDSL.g:1525:3: ruleLiabilityToParty
                    {
                     before(grammarAccess.getLiabilityTypeAccess().getLiabilityToPartyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiabilityToParty();

                    state._fsp--;

                     after(grammarAccess.getLiabilityTypeAccess().getLiabilityToPartyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1530:2: ( ruleLiabilityToThirdParty )
                    {
                    // InternalPactDSL.g:1530:2: ( ruleLiabilityToThirdParty )
                    // InternalPactDSL.g:1531:3: ruleLiabilityToThirdParty
                    {
                     before(grammarAccess.getLiabilityTypeAccess().getLiabilityToThirdPartyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiabilityToThirdParty();

                    state._fsp--;

                     after(grammarAccess.getLiabilityTypeAccess().getLiabilityToThirdPartyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityType__Alternatives"


    // $ANTLR start "rule__TerminationType__Alternatives"
    // InternalPactDSL.g:1540:1: rule__TerminationType__Alternatives : ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) );
    public final void rule__TerminationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1544:1: ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt11=1;
                }
                break;
            case 76:
                {
                alt11=2;
                }
                break;
            case 77:
                {
                alt11=3;
                }
                break;
            case 79:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPactDSL.g:1545:2: ( ruleForConvenience )
                    {
                    // InternalPactDSL.g:1545:2: ( ruleForConvenience )
                    // InternalPactDSL.g:1546:3: ruleForConvenience
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForConvenience();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1551:2: ( ruleOnReasonableNotice )
                    {
                    // InternalPactDSL.g:1551:2: ( ruleOnReasonableNotice )
                    // InternalPactDSL.g:1552:3: ruleOnReasonableNotice
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOnReasonableNotice();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1557:2: ( ruleForBreach )
                    {
                    // InternalPactDSL.g:1557:2: ( ruleForBreach )
                    // InternalPactDSL.g:1558:3: ruleForBreach
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForBreach();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1563:2: ( ruleOnInsolvencyEvent )
                    {
                    // InternalPactDSL.g:1563:2: ( ruleOnInsolvencyEvent )
                    // InternalPactDSL.g:1564:3: ruleOnInsolvencyEvent
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOnInsolvencyEvent();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1569:2: ( ruleCustomTermination )
                    {
                    // InternalPactDSL.g:1569:2: ( ruleCustomTermination )
                    // InternalPactDSL.g:1570:3: ruleCustomTermination
                    {
                     before(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomTermination();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminationType__Alternatives"


    // $ANTLR start "rule__BoilerplateType__Alternatives"
    // InternalPactDSL.g:1579:1: rule__BoilerplateType__Alternatives : ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) | ( ruleCustomBoilerplate ) );
    public final void rule__BoilerplateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1583:1: ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) | ( ruleCustomBoilerplate ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt12=1;
                }
                break;
            case 82:
                {
                alt12=2;
                }
                break;
            case 83:
                {
                alt12=3;
                }
                break;
            case 28:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalPactDSL.g:1584:2: ( ruleApplicableLaw )
                    {
                    // InternalPactDSL.g:1584:2: ( ruleApplicableLaw )
                    // InternalPactDSL.g:1585:3: ruleApplicableLaw
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicableLaw();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1590:2: ( ruleJurisdiction )
                    {
                    // InternalPactDSL.g:1590:2: ( ruleJurisdiction )
                    // InternalPactDSL.g:1591:3: ruleJurisdiction
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJurisdiction();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1596:2: ( ruleNotices )
                    {
                    // InternalPactDSL.g:1596:2: ( ruleNotices )
                    // InternalPactDSL.g:1597:3: ruleNotices
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNotices();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1602:2: ( ruleCustomBoilerplate )
                    {
                    // InternalPactDSL.g:1602:2: ( ruleCustomBoilerplate )
                    // InternalPactDSL.g:1603:3: ruleCustomBoilerplate
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getCustomBoilerplateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomBoilerplate();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getCustomBoilerplateParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoilerplateType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPactDSL.g:1612:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1616:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPactDSL.g:1617:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalPactDSL.g:1624:1: rule__Model__Group__0__Impl : ( 'ContractTitle:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1628:1: ( ( 'ContractTitle:' ) )
            // InternalPactDSL.g:1629:1: ( 'ContractTitle:' )
            {
            // InternalPactDSL.g:1629:1: ( 'ContractTitle:' )
            // InternalPactDSL.g:1630:2: 'ContractTitle:'
            {
             before(grammarAccess.getModelAccess().getContractTitleKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getContractTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalPactDSL.g:1639:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1643:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPactDSL.g:1644:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalPactDSL.g:1651:1: rule__Model__Group__1__Impl : ( ( rule__Model__TitleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1655:1: ( ( ( rule__Model__TitleAssignment_1 ) ) )
            // InternalPactDSL.g:1656:1: ( ( rule__Model__TitleAssignment_1 ) )
            {
            // InternalPactDSL.g:1656:1: ( ( rule__Model__TitleAssignment_1 ) )
            // InternalPactDSL.g:1657:2: ( rule__Model__TitleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTitleAssignment_1()); 
            // InternalPactDSL.g:1658:2: ( rule__Model__TitleAssignment_1 )
            // InternalPactDSL.g:1658:3: rule__Model__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalPactDSL.g:1666:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1670:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPactDSL.g:1671:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalPactDSL.g:1678:1: rule__Model__Group__2__Impl : ( ( ( '.' ) ) ( ( '.' )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1682:1: ( ( ( ( '.' ) ) ( ( '.' )* ) ) )
            // InternalPactDSL.g:1683:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            {
            // InternalPactDSL.g:1683:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            // InternalPactDSL.g:1684:2: ( ( '.' ) ) ( ( '.' )* )
            {
            // InternalPactDSL.g:1684:2: ( ( '.' ) )
            // InternalPactDSL.g:1685:3: ( '.' )
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1686:3: ( '.' )
            // InternalPactDSL.g:1686:4: '.'
            {
            match(input,18,FOLLOW_6); 

            }

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }

            // InternalPactDSL.g:1689:2: ( ( '.' )* )
            // InternalPactDSL.g:1690:3: ( '.' )*
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1691:3: ( '.' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPactDSL.g:1691:4: '.'
            	    {
            	    match(input,18,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalPactDSL.g:1700:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1704:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPactDSL.g:1705:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalPactDSL.g:1712:1: rule__Model__Group__3__Impl : ( 'Entities:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1716:1: ( ( 'Entities:' ) )
            // InternalPactDSL.g:1717:1: ( 'Entities:' )
            {
            // InternalPactDSL.g:1717:1: ( 'Entities:' )
            // InternalPactDSL.g:1718:2: 'Entities:'
            {
             before(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalPactDSL.g:1727:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1731:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPactDSL.g:1732:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalPactDSL.g:1739:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1743:1: ( ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) )
            // InternalPactDSL.g:1744:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            {
            // InternalPactDSL.g:1744:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            // InternalPactDSL.g:1745:2: ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* )
            {
            // InternalPactDSL.g:1745:2: ( ( rule__Model__Group_4__0 ) )
            // InternalPactDSL.g:1746:3: ( rule__Model__Group_4__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1747:3: ( rule__Model__Group_4__0 )
            // InternalPactDSL.g:1747:4: rule__Model__Group_4__0
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }

            // InternalPactDSL.g:1750:2: ( ( rule__Model__Group_4__0 )* )
            // InternalPactDSL.g:1751:3: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1752:3: ( rule__Model__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=32)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPactDSL.g:1752:4: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalPactDSL.g:1761:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1765:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalPactDSL.g:1766:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalPactDSL.g:1773:1: rule__Model__Group__5__Impl : ( ( 'Formalities:' )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1777:1: ( ( ( 'Formalities:' )? ) )
            // InternalPactDSL.g:1778:1: ( ( 'Formalities:' )? )
            {
            // InternalPactDSL.g:1778:1: ( ( 'Formalities:' )? )
            // InternalPactDSL.g:1779:2: ( 'Formalities:' )?
            {
             before(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 
            // InternalPactDSL.g:1780:2: ( 'Formalities:' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPactDSL.g:1780:3: 'Formalities:'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalPactDSL.g:1788:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1792:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalPactDSL.g:1793:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalPactDSL.g:1800:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1804:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // InternalPactDSL.g:1805:1: ( ( rule__Model__Group_6__0 )* )
            {
            // InternalPactDSL.g:1805:1: ( ( rule__Model__Group_6__0 )* )
            // InternalPactDSL.g:1806:2: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalPactDSL.g:1807:2: ( rule__Model__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=37 && LA16_0<=38)||LA16_0==40||LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPactDSL.g:1807:3: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalPactDSL.g:1815:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1819:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalPactDSL.g:1820:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalPactDSL.g:1827:1: rule__Model__Group__7__Impl : ( ( 'Actions:' )? ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1831:1: ( ( ( 'Actions:' )? ) )
            // InternalPactDSL.g:1832:1: ( ( 'Actions:' )? )
            {
            // InternalPactDSL.g:1832:1: ( ( 'Actions:' )? )
            // InternalPactDSL.g:1833:2: ( 'Actions:' )?
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_7()); 
            // InternalPactDSL.g:1834:2: ( 'Actions:' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPactDSL.g:1834:3: 'Actions:'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getActionsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalPactDSL.g:1842:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1846:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalPactDSL.g:1847:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalPactDSL.g:1854:1: rule__Model__Group__8__Impl : ( ( rule__Model__Group_8__0 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1858:1: ( ( ( rule__Model__Group_8__0 )* ) )
            // InternalPactDSL.g:1859:1: ( ( rule__Model__Group_8__0 )* )
            {
            // InternalPactDSL.g:1859:1: ( ( rule__Model__Group_8__0 )* )
            // InternalPactDSL.g:1860:2: ( rule__Model__Group_8__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_8()); 
            // InternalPactDSL.g:1861:2: ( rule__Model__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPactDSL.g:1861:3: rule__Model__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalPactDSL.g:1869:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1873:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalPactDSL.g:1874:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalPactDSL.g:1881:1: rule__Model__Group__9__Impl : ( ( 'StateOnSignature:' )? ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1885:1: ( ( ( 'StateOnSignature:' )? ) )
            // InternalPactDSL.g:1886:1: ( ( 'StateOnSignature:' )? )
            {
            // InternalPactDSL.g:1886:1: ( ( 'StateOnSignature:' )? )
            // InternalPactDSL.g:1887:2: ( 'StateOnSignature:' )?
            {
             before(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 
            // InternalPactDSL.g:1888:2: ( 'StateOnSignature:' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPactDSL.g:1888:3: 'StateOnSignature:'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalPactDSL.g:1896:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1900:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalPactDSL.g:1901:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalPactDSL.g:1908:1: rule__Model__Group__10__Impl : ( ( rule__Model__Group_10__0 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1912:1: ( ( ( rule__Model__Group_10__0 )* ) )
            // InternalPactDSL.g:1913:1: ( ( rule__Model__Group_10__0 )* )
            {
            // InternalPactDSL.g:1913:1: ( ( rule__Model__Group_10__0 )* )
            // InternalPactDSL.g:1914:2: ( rule__Model__Group_10__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_10()); 
            // InternalPactDSL.g:1915:2: ( rule__Model__Group_10__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=46 && LA20_0<=48)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPactDSL.g:1915:3: rule__Model__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalPactDSL.g:1923:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1927:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalPactDSL.g:1928:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalPactDSL.g:1935:1: rule__Model__Group__11__Impl : ( 'PrimaryObligations:' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1939:1: ( ( 'PrimaryObligations:' ) )
            // InternalPactDSL.g:1940:1: ( 'PrimaryObligations:' )
            {
            // InternalPactDSL.g:1940:1: ( 'PrimaryObligations:' )
            // InternalPactDSL.g:1941:2: 'PrimaryObligations:'
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalPactDSL.g:1950:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1954:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalPactDSL.g:1955:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalPactDSL.g:1962:1: rule__Model__Group__12__Impl : ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1966:1: ( ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) )
            // InternalPactDSL.g:1967:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            {
            // InternalPactDSL.g:1967:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            // InternalPactDSL.g:1968:2: ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* )
            {
            // InternalPactDSL.g:1968:2: ( ( rule__Model__Group_12__0 ) )
            // InternalPactDSL.g:1969:3: ( rule__Model__Group_12__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1970:3: ( rule__Model__Group_12__0 )
            // InternalPactDSL.g:1970:4: rule__Model__Group_12__0
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }

            // InternalPactDSL.g:1973:2: ( ( rule__Model__Group_12__0 )* )
            // InternalPactDSL.g:1974:3: ( rule__Model__Group_12__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1975:3: ( rule__Model__Group_12__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==49||LA21_0==53||LA21_0==55||LA21_0==57||(LA21_0>=61 && LA21_0<=62)||LA21_0==66) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPactDSL.g:1975:4: rule__Model__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Model__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalPactDSL.g:1984:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1988:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalPactDSL.g:1989:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalPactDSL.g:1996:1: rule__Model__Group__13__Impl : ( ( 'SecondaryObligations:' )? ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2000:1: ( ( ( 'SecondaryObligations:' )? ) )
            // InternalPactDSL.g:2001:1: ( ( 'SecondaryObligations:' )? )
            {
            // InternalPactDSL.g:2001:1: ( ( 'SecondaryObligations:' )? )
            // InternalPactDSL.g:2002:2: ( 'SecondaryObligations:' )?
            {
             before(grammarAccess.getModelAccess().getSecondaryObligationsKeyword_13()); 
            // InternalPactDSL.g:2003:2: ( 'SecondaryObligations:' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPactDSL.g:2003:3: 'SecondaryObligations:'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getSecondaryObligationsKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Model__Group__14"
    // InternalPactDSL.g:2011:1: rule__Model__Group__14 : rule__Model__Group__14__Impl rule__Model__Group__15 ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2015:1: ( rule__Model__Group__14__Impl rule__Model__Group__15 )
            // InternalPactDSL.g:2016:2: rule__Model__Group__14__Impl rule__Model__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14"


    // $ANTLR start "rule__Model__Group__14__Impl"
    // InternalPactDSL.g:2023:1: rule__Model__Group__14__Impl : ( ( rule__Model__Group_14__0 )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2027:1: ( ( ( rule__Model__Group_14__0 )* ) )
            // InternalPactDSL.g:2028:1: ( ( rule__Model__Group_14__0 )* )
            {
            // InternalPactDSL.g:2028:1: ( ( rule__Model__Group_14__0 )* )
            // InternalPactDSL.g:2029:2: ( rule__Model__Group_14__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_14()); 
            // InternalPactDSL.g:2030:2: ( rule__Model__Group_14__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==67) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPactDSL.g:2030:3: rule__Model__Group_14__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Model__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14__Impl"


    // $ANTLR start "rule__Model__Group__15"
    // InternalPactDSL.g:2038:1: rule__Model__Group__15 : rule__Model__Group__15__Impl rule__Model__Group__16 ;
    public final void rule__Model__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2042:1: ( rule__Model__Group__15__Impl rule__Model__Group__16 )
            // InternalPactDSL.g:2043:2: rule__Model__Group__15__Impl rule__Model__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15"


    // $ANTLR start "rule__Model__Group__15__Impl"
    // InternalPactDSL.g:2050:1: rule__Model__Group__15__Impl : ( ( 'Liability' )? ) ;
    public final void rule__Model__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2054:1: ( ( ( 'Liability' )? ) )
            // InternalPactDSL.g:2055:1: ( ( 'Liability' )? )
            {
            // InternalPactDSL.g:2055:1: ( ( 'Liability' )? )
            // InternalPactDSL.g:2056:2: ( 'Liability' )?
            {
             before(grammarAccess.getModelAccess().getLiabilityKeyword_15()); 
            // InternalPactDSL.g:2057:2: ( 'Liability' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalPactDSL.g:2057:3: 'Liability'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getLiabilityKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15__Impl"


    // $ANTLR start "rule__Model__Group__16"
    // InternalPactDSL.g:2065:1: rule__Model__Group__16 : rule__Model__Group__16__Impl rule__Model__Group__17 ;
    public final void rule__Model__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2069:1: ( rule__Model__Group__16__Impl rule__Model__Group__17 )
            // InternalPactDSL.g:2070:2: rule__Model__Group__16__Impl rule__Model__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16"


    // $ANTLR start "rule__Model__Group__16__Impl"
    // InternalPactDSL.g:2077:1: rule__Model__Group__16__Impl : ( ( rule__Model__Group_16__0 )* ) ;
    public final void rule__Model__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2081:1: ( ( ( rule__Model__Group_16__0 )* ) )
            // InternalPactDSL.g:2082:1: ( ( rule__Model__Group_16__0 )* )
            {
            // InternalPactDSL.g:2082:1: ( ( rule__Model__Group_16__0 )* )
            // InternalPactDSL.g:2083:2: ( rule__Model__Group_16__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_16()); 
            // InternalPactDSL.g:2084:2: ( rule__Model__Group_16__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==69||LA25_0==72) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPactDSL.g:2084:3: rule__Model__Group_16__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Model__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16__Impl"


    // $ANTLR start "rule__Model__Group__17"
    // InternalPactDSL.g:2092:1: rule__Model__Group__17 : rule__Model__Group__17__Impl rule__Model__Group__18 ;
    public final void rule__Model__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2096:1: ( rule__Model__Group__17__Impl rule__Model__Group__18 )
            // InternalPactDSL.g:2097:2: rule__Model__Group__17__Impl rule__Model__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17"


    // $ANTLR start "rule__Model__Group__17__Impl"
    // InternalPactDSL.g:2104:1: rule__Model__Group__17__Impl : ( ( 'Termination:' )? ) ;
    public final void rule__Model__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2108:1: ( ( ( 'Termination:' )? ) )
            // InternalPactDSL.g:2109:1: ( ( 'Termination:' )? )
            {
            // InternalPactDSL.g:2109:1: ( ( 'Termination:' )? )
            // InternalPactDSL.g:2110:2: ( 'Termination:' )?
            {
             before(grammarAccess.getModelAccess().getTerminationKeyword_17()); 
            // InternalPactDSL.g:2111:2: ( 'Termination:' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||(LA26_1>=26 && LA26_1<=28)||(LA26_1>=46 && LA26_1<=48)||LA26_1==73||(LA26_1>=76 && LA26_1<=77)||LA26_1==79||(LA26_1>=81 && LA26_1<=83)) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalPactDSL.g:2111:3: 'Termination:'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTerminationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17__Impl"


    // $ANTLR start "rule__Model__Group__18"
    // InternalPactDSL.g:2119:1: rule__Model__Group__18 : rule__Model__Group__18__Impl rule__Model__Group__19 ;
    public final void rule__Model__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2123:1: ( rule__Model__Group__18__Impl rule__Model__Group__19 )
            // InternalPactDSL.g:2124:2: rule__Model__Group__18__Impl rule__Model__Group__19
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18"


    // $ANTLR start "rule__Model__Group__18__Impl"
    // InternalPactDSL.g:2131:1: rule__Model__Group__18__Impl : ( ( rule__Model__Group_18__0 )* ) ;
    public final void rule__Model__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2135:1: ( ( ( rule__Model__Group_18__0 )* ) )
            // InternalPactDSL.g:2136:1: ( ( rule__Model__Group_18__0 )* )
            {
            // InternalPactDSL.g:2136:1: ( ( rule__Model__Group_18__0 )* )
            // InternalPactDSL.g:2137:2: ( rule__Model__Group_18__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_18()); 
            // InternalPactDSL.g:2138:2: ( rule__Model__Group_18__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26||LA27_0==73||(LA27_0>=76 && LA27_0<=77)||LA27_0==79) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPactDSL.g:2138:3: rule__Model__Group_18__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Model__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18__Impl"


    // $ANTLR start "rule__Model__Group__19"
    // InternalPactDSL.g:2146:1: rule__Model__Group__19 : rule__Model__Group__19__Impl rule__Model__Group__20 ;
    public final void rule__Model__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2150:1: ( rule__Model__Group__19__Impl rule__Model__Group__20 )
            // InternalPactDSL.g:2151:2: rule__Model__Group__19__Impl rule__Model__Group__20
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19"


    // $ANTLR start "rule__Model__Group__19__Impl"
    // InternalPactDSL.g:2158:1: rule__Model__Group__19__Impl : ( ( 'StateAfterContractDischarged:' )? ) ;
    public final void rule__Model__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2162:1: ( ( ( 'StateAfterContractDischarged:' )? ) )
            // InternalPactDSL.g:2163:1: ( ( 'StateAfterContractDischarged:' )? )
            {
            // InternalPactDSL.g:2163:1: ( ( 'StateAfterContractDischarged:' )? )
            // InternalPactDSL.g:2164:2: ( 'StateAfterContractDischarged:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterContractDischargedKeyword_19()); 
            // InternalPactDSL.g:2165:2: ( 'StateAfterContractDischarged:' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPactDSL.g:2165:3: 'StateAfterContractDischarged:'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateAfterContractDischargedKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19__Impl"


    // $ANTLR start "rule__Model__Group__20"
    // InternalPactDSL.g:2173:1: rule__Model__Group__20 : rule__Model__Group__20__Impl rule__Model__Group__21 ;
    public final void rule__Model__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2177:1: ( rule__Model__Group__20__Impl rule__Model__Group__21 )
            // InternalPactDSL.g:2178:2: rule__Model__Group__20__Impl rule__Model__Group__21
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20"


    // $ANTLR start "rule__Model__Group__20__Impl"
    // InternalPactDSL.g:2185:1: rule__Model__Group__20__Impl : ( ( rule__Model__Group_20__0 )* ) ;
    public final void rule__Model__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2189:1: ( ( ( rule__Model__Group_20__0 )* ) )
            // InternalPactDSL.g:2190:1: ( ( rule__Model__Group_20__0 )* )
            {
            // InternalPactDSL.g:2190:1: ( ( rule__Model__Group_20__0 )* )
            // InternalPactDSL.g:2191:2: ( rule__Model__Group_20__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_20()); 
            // InternalPactDSL.g:2192:2: ( rule__Model__Group_20__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=46 && LA29_0<=48)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPactDSL.g:2192:3: rule__Model__Group_20__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20__Impl"


    // $ANTLR start "rule__Model__Group__21"
    // InternalPactDSL.g:2200:1: rule__Model__Group__21 : rule__Model__Group__21__Impl rule__Model__Group__22 ;
    public final void rule__Model__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2204:1: ( rule__Model__Group__21__Impl rule__Model__Group__22 )
            // InternalPactDSL.g:2205:2: rule__Model__Group__21__Impl rule__Model__Group__22
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__21"


    // $ANTLR start "rule__Model__Group__21__Impl"
    // InternalPactDSL.g:2212:1: rule__Model__Group__21__Impl : ( ( 'Boilerplate:' )? ) ;
    public final void rule__Model__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2216:1: ( ( ( 'Boilerplate:' )? ) )
            // InternalPactDSL.g:2217:1: ( ( 'Boilerplate:' )? )
            {
            // InternalPactDSL.g:2217:1: ( ( 'Boilerplate:' )? )
            // InternalPactDSL.g:2218:2: ( 'Boilerplate:' )?
            {
             before(grammarAccess.getModelAccess().getBoilerplateKeyword_21()); 
            // InternalPactDSL.g:2219:2: ( 'Boilerplate:' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||LA30_1==28||(LA30_1>=81 && LA30_1<=83)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalPactDSL.g:2219:3: 'Boilerplate:'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getBoilerplateKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__21__Impl"


    // $ANTLR start "rule__Model__Group__22"
    // InternalPactDSL.g:2227:1: rule__Model__Group__22 : rule__Model__Group__22__Impl ;
    public final void rule__Model__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2231:1: ( rule__Model__Group__22__Impl )
            // InternalPactDSL.g:2232:2: rule__Model__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__22"


    // $ANTLR start "rule__Model__Group__22__Impl"
    // InternalPactDSL.g:2238:1: rule__Model__Group__22__Impl : ( ( rule__Model__Group_22__0 )* ) ;
    public final void rule__Model__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2242:1: ( ( ( rule__Model__Group_22__0 )* ) )
            // InternalPactDSL.g:2243:1: ( ( rule__Model__Group_22__0 )* )
            {
            // InternalPactDSL.g:2243:1: ( ( rule__Model__Group_22__0 )* )
            // InternalPactDSL.g:2244:2: ( rule__Model__Group_22__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_22()); 
            // InternalPactDSL.g:2245:2: ( rule__Model__Group_22__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==28||(LA31_0>=81 && LA31_0<=83)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPactDSL.g:2245:3: rule__Model__Group_22__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Model__Group_22__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__22__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalPactDSL.g:2254:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2258:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalPactDSL.g:2259:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalPactDSL.g:2266:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__EntityTypesAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2270:1: ( ( ( rule__Model__EntityTypesAssignment_4_0 ) ) )
            // InternalPactDSL.g:2271:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            {
            // InternalPactDSL.g:2271:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            // InternalPactDSL.g:2272:2: ( rule__Model__EntityTypesAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 
            // InternalPactDSL.g:2273:2: ( rule__Model__EntityTypesAssignment_4_0 )
            // InternalPactDSL.g:2273:3: rule__Model__EntityTypesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__EntityTypesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalPactDSL.g:2281:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2285:1: ( rule__Model__Group_4__1__Impl )
            // InternalPactDSL.g:2286:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalPactDSL.g:2292:1: rule__Model__Group_4__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2296:1: ( ( '.' ) )
            // InternalPactDSL.g:2297:1: ( '.' )
            {
            // InternalPactDSL.g:2297:1: ( '.' )
            // InternalPactDSL.g:2298:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // InternalPactDSL.g:2308:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2312:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalPactDSL.g:2313:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // InternalPactDSL.g:2320:1: rule__Model__Group_6__0__Impl : ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2324:1: ( ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) )
            // InternalPactDSL.g:2325:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            {
            // InternalPactDSL.g:2325:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            // InternalPactDSL.g:2326:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            {
             before(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 
            // InternalPactDSL.g:2327:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            // InternalPactDSL.g:2327:3: rule__Model__FormalityTypesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormalityTypesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // InternalPactDSL.g:2335:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2339:1: ( rule__Model__Group_6__1__Impl )
            // InternalPactDSL.g:2340:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // InternalPactDSL.g:2346:1: rule__Model__Group_6__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2350:1: ( ( '.' ) )
            // InternalPactDSL.g:2351:1: ( '.' )
            {
            // InternalPactDSL.g:2351:1: ( '.' )
            // InternalPactDSL.g:2352:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_8__0"
    // InternalPactDSL.g:2362:1: rule__Model__Group_8__0 : rule__Model__Group_8__0__Impl rule__Model__Group_8__1 ;
    public final void rule__Model__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2366:1: ( rule__Model__Group_8__0__Impl rule__Model__Group_8__1 )
            // InternalPactDSL.g:2367:2: rule__Model__Group_8__0__Impl rule__Model__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0"


    // $ANTLR start "rule__Model__Group_8__0__Impl"
    // InternalPactDSL.g:2374:1: rule__Model__Group_8__0__Impl : ( ( rule__Model__ActionTypesAssignment_8_0 ) ) ;
    public final void rule__Model__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2378:1: ( ( ( rule__Model__ActionTypesAssignment_8_0 ) ) )
            // InternalPactDSL.g:2379:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            {
            // InternalPactDSL.g:2379:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            // InternalPactDSL.g:2380:2: ( rule__Model__ActionTypesAssignment_8_0 )
            {
             before(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 
            // InternalPactDSL.g:2381:2: ( rule__Model__ActionTypesAssignment_8_0 )
            // InternalPactDSL.g:2381:3: rule__Model__ActionTypesAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ActionTypesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0__Impl"


    // $ANTLR start "rule__Model__Group_8__1"
    // InternalPactDSL.g:2389:1: rule__Model__Group_8__1 : rule__Model__Group_8__1__Impl ;
    public final void rule__Model__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2393:1: ( rule__Model__Group_8__1__Impl )
            // InternalPactDSL.g:2394:2: rule__Model__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1"


    // $ANTLR start "rule__Model__Group_8__1__Impl"
    // InternalPactDSL.g:2400:1: rule__Model__Group_8__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2404:1: ( ( '.' ) )
            // InternalPactDSL.g:2405:1: ( '.' )
            {
            // InternalPactDSL.g:2405:1: ( '.' )
            // InternalPactDSL.g:2406:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1__Impl"


    // $ANTLR start "rule__Model__Group_10__0"
    // InternalPactDSL.g:2416:1: rule__Model__Group_10__0 : rule__Model__Group_10__0__Impl rule__Model__Group_10__1 ;
    public final void rule__Model__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2420:1: ( rule__Model__Group_10__0__Impl rule__Model__Group_10__1 )
            // InternalPactDSL.g:2421:2: rule__Model__Group_10__0__Impl rule__Model__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0"


    // $ANTLR start "rule__Model__Group_10__0__Impl"
    // InternalPactDSL.g:2428:1: rule__Model__Group_10__0__Impl : ( ( rule__Model__StateTypesAssignment_10_0 ) ) ;
    public final void rule__Model__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2432:1: ( ( ( rule__Model__StateTypesAssignment_10_0 ) ) )
            // InternalPactDSL.g:2433:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            {
            // InternalPactDSL.g:2433:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            // InternalPactDSL.g:2434:2: ( rule__Model__StateTypesAssignment_10_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 
            // InternalPactDSL.g:2435:2: ( rule__Model__StateTypesAssignment_10_0 )
            // InternalPactDSL.g:2435:3: rule__Model__StateTypesAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0__Impl"


    // $ANTLR start "rule__Model__Group_10__1"
    // InternalPactDSL.g:2443:1: rule__Model__Group_10__1 : rule__Model__Group_10__1__Impl ;
    public final void rule__Model__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2447:1: ( rule__Model__Group_10__1__Impl )
            // InternalPactDSL.g:2448:2: rule__Model__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1"


    // $ANTLR start "rule__Model__Group_10__1__Impl"
    // InternalPactDSL.g:2454:1: rule__Model__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2458:1: ( ( '.' ) )
            // InternalPactDSL.g:2459:1: ( '.' )
            {
            // InternalPactDSL.g:2459:1: ( '.' )
            // InternalPactDSL.g:2460:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1__Impl"


    // $ANTLR start "rule__Model__Group_12__0"
    // InternalPactDSL.g:2470:1: rule__Model__Group_12__0 : rule__Model__Group_12__0__Impl rule__Model__Group_12__1 ;
    public final void rule__Model__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2474:1: ( rule__Model__Group_12__0__Impl rule__Model__Group_12__1 )
            // InternalPactDSL.g:2475:2: rule__Model__Group_12__0__Impl rule__Model__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0"


    // $ANTLR start "rule__Model__Group_12__0__Impl"
    // InternalPactDSL.g:2482:1: rule__Model__Group_12__0__Impl : ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) ;
    public final void rule__Model__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2486:1: ( ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) )
            // InternalPactDSL.g:2487:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            {
            // InternalPactDSL.g:2487:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            // InternalPactDSL.g:2488:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 
            // InternalPactDSL.g:2489:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            // InternalPactDSL.g:2489:3: rule__Model__PrimaryObligationTypesAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PrimaryObligationTypesAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0__Impl"


    // $ANTLR start "rule__Model__Group_12__1"
    // InternalPactDSL.g:2497:1: rule__Model__Group_12__1 : rule__Model__Group_12__1__Impl ;
    public final void rule__Model__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2501:1: ( rule__Model__Group_12__1__Impl )
            // InternalPactDSL.g:2502:2: rule__Model__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1"


    // $ANTLR start "rule__Model__Group_12__1__Impl"
    // InternalPactDSL.g:2508:1: rule__Model__Group_12__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2512:1: ( ( '.' ) )
            // InternalPactDSL.g:2513:1: ( '.' )
            {
            // InternalPactDSL.g:2513:1: ( '.' )
            // InternalPactDSL.g:2514:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1__Impl"


    // $ANTLR start "rule__Model__Group_14__0"
    // InternalPactDSL.g:2524:1: rule__Model__Group_14__0 : rule__Model__Group_14__0__Impl rule__Model__Group_14__1 ;
    public final void rule__Model__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2528:1: ( rule__Model__Group_14__0__Impl rule__Model__Group_14__1 )
            // InternalPactDSL.g:2529:2: rule__Model__Group_14__0__Impl rule__Model__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0"


    // $ANTLR start "rule__Model__Group_14__0__Impl"
    // InternalPactDSL.g:2536:1: rule__Model__Group_14__0__Impl : ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) ) ;
    public final void rule__Model__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2540:1: ( ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) ) )
            // InternalPactDSL.g:2541:1: ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) )
            {
            // InternalPactDSL.g:2541:1: ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) )
            // InternalPactDSL.g:2542:2: ( rule__Model__SecondaryObligationTypesAssignment_14_0 )
            {
             before(grammarAccess.getModelAccess().getSecondaryObligationTypesAssignment_14_0()); 
            // InternalPactDSL.g:2543:2: ( rule__Model__SecondaryObligationTypesAssignment_14_0 )
            // InternalPactDSL.g:2543:3: rule__Model__SecondaryObligationTypesAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__SecondaryObligationTypesAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSecondaryObligationTypesAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0__Impl"


    // $ANTLR start "rule__Model__Group_14__1"
    // InternalPactDSL.g:2551:1: rule__Model__Group_14__1 : rule__Model__Group_14__1__Impl ;
    public final void rule__Model__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2555:1: ( rule__Model__Group_14__1__Impl )
            // InternalPactDSL.g:2556:2: rule__Model__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1"


    // $ANTLR start "rule__Model__Group_14__1__Impl"
    // InternalPactDSL.g:2562:1: rule__Model__Group_14__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2566:1: ( ( '.' ) )
            // InternalPactDSL.g:2567:1: ( '.' )
            {
            // InternalPactDSL.g:2567:1: ( '.' )
            // InternalPactDSL.g:2568:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1__Impl"


    // $ANTLR start "rule__Model__Group_16__0"
    // InternalPactDSL.g:2578:1: rule__Model__Group_16__0 : rule__Model__Group_16__0__Impl rule__Model__Group_16__1 ;
    public final void rule__Model__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2582:1: ( rule__Model__Group_16__0__Impl rule__Model__Group_16__1 )
            // InternalPactDSL.g:2583:2: rule__Model__Group_16__0__Impl rule__Model__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0"


    // $ANTLR start "rule__Model__Group_16__0__Impl"
    // InternalPactDSL.g:2590:1: rule__Model__Group_16__0__Impl : ( ( rule__Model__LiabilityTypesAssignment_16_0 ) ) ;
    public final void rule__Model__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2594:1: ( ( ( rule__Model__LiabilityTypesAssignment_16_0 ) ) )
            // InternalPactDSL.g:2595:1: ( ( rule__Model__LiabilityTypesAssignment_16_0 ) )
            {
            // InternalPactDSL.g:2595:1: ( ( rule__Model__LiabilityTypesAssignment_16_0 ) )
            // InternalPactDSL.g:2596:2: ( rule__Model__LiabilityTypesAssignment_16_0 )
            {
             before(grammarAccess.getModelAccess().getLiabilityTypesAssignment_16_0()); 
            // InternalPactDSL.g:2597:2: ( rule__Model__LiabilityTypesAssignment_16_0 )
            // InternalPactDSL.g:2597:3: rule__Model__LiabilityTypesAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__LiabilityTypesAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getLiabilityTypesAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0__Impl"


    // $ANTLR start "rule__Model__Group_16__1"
    // InternalPactDSL.g:2605:1: rule__Model__Group_16__1 : rule__Model__Group_16__1__Impl ;
    public final void rule__Model__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2609:1: ( rule__Model__Group_16__1__Impl )
            // InternalPactDSL.g:2610:2: rule__Model__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1"


    // $ANTLR start "rule__Model__Group_16__1__Impl"
    // InternalPactDSL.g:2616:1: rule__Model__Group_16__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2620:1: ( ( '.' ) )
            // InternalPactDSL.g:2621:1: ( '.' )
            {
            // InternalPactDSL.g:2621:1: ( '.' )
            // InternalPactDSL.g:2622:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1__Impl"


    // $ANTLR start "rule__Model__Group_18__0"
    // InternalPactDSL.g:2632:1: rule__Model__Group_18__0 : rule__Model__Group_18__0__Impl rule__Model__Group_18__1 ;
    public final void rule__Model__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2636:1: ( rule__Model__Group_18__0__Impl rule__Model__Group_18__1 )
            // InternalPactDSL.g:2637:2: rule__Model__Group_18__0__Impl rule__Model__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0"


    // $ANTLR start "rule__Model__Group_18__0__Impl"
    // InternalPactDSL.g:2644:1: rule__Model__Group_18__0__Impl : ( ( rule__Model__TerminationTypesAssignment_18_0 ) ) ;
    public final void rule__Model__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2648:1: ( ( ( rule__Model__TerminationTypesAssignment_18_0 ) ) )
            // InternalPactDSL.g:2649:1: ( ( rule__Model__TerminationTypesAssignment_18_0 ) )
            {
            // InternalPactDSL.g:2649:1: ( ( rule__Model__TerminationTypesAssignment_18_0 ) )
            // InternalPactDSL.g:2650:2: ( rule__Model__TerminationTypesAssignment_18_0 )
            {
             before(grammarAccess.getModelAccess().getTerminationTypesAssignment_18_0()); 
            // InternalPactDSL.g:2651:2: ( rule__Model__TerminationTypesAssignment_18_0 )
            // InternalPactDSL.g:2651:3: rule__Model__TerminationTypesAssignment_18_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__TerminationTypesAssignment_18_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTerminationTypesAssignment_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0__Impl"


    // $ANTLR start "rule__Model__Group_18__1"
    // InternalPactDSL.g:2659:1: rule__Model__Group_18__1 : rule__Model__Group_18__1__Impl ;
    public final void rule__Model__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2663:1: ( rule__Model__Group_18__1__Impl )
            // InternalPactDSL.g:2664:2: rule__Model__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1"


    // $ANTLR start "rule__Model__Group_18__1__Impl"
    // InternalPactDSL.g:2670:1: rule__Model__Group_18__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2674:1: ( ( '.' ) )
            // InternalPactDSL.g:2675:1: ( '.' )
            {
            // InternalPactDSL.g:2675:1: ( '.' )
            // InternalPactDSL.g:2676:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1__Impl"


    // $ANTLR start "rule__Model__Group_20__0"
    // InternalPactDSL.g:2686:1: rule__Model__Group_20__0 : rule__Model__Group_20__0__Impl rule__Model__Group_20__1 ;
    public final void rule__Model__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2690:1: ( rule__Model__Group_20__0__Impl rule__Model__Group_20__1 )
            // InternalPactDSL.g:2691:2: rule__Model__Group_20__0__Impl rule__Model__Group_20__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0"


    // $ANTLR start "rule__Model__Group_20__0__Impl"
    // InternalPactDSL.g:2698:1: rule__Model__Group_20__0__Impl : ( ( rule__Model__StateTypesAssignment_20_0 ) ) ;
    public final void rule__Model__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2702:1: ( ( ( rule__Model__StateTypesAssignment_20_0 ) ) )
            // InternalPactDSL.g:2703:1: ( ( rule__Model__StateTypesAssignment_20_0 ) )
            {
            // InternalPactDSL.g:2703:1: ( ( rule__Model__StateTypesAssignment_20_0 ) )
            // InternalPactDSL.g:2704:2: ( rule__Model__StateTypesAssignment_20_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_20_0()); 
            // InternalPactDSL.g:2705:2: ( rule__Model__StateTypesAssignment_20_0 )
            // InternalPactDSL.g:2705:3: rule__Model__StateTypesAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0__Impl"


    // $ANTLR start "rule__Model__Group_20__1"
    // InternalPactDSL.g:2713:1: rule__Model__Group_20__1 : rule__Model__Group_20__1__Impl ;
    public final void rule__Model__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2717:1: ( rule__Model__Group_20__1__Impl )
            // InternalPactDSL.g:2718:2: rule__Model__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1"


    // $ANTLR start "rule__Model__Group_20__1__Impl"
    // InternalPactDSL.g:2724:1: rule__Model__Group_20__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2728:1: ( ( '.' ) )
            // InternalPactDSL.g:2729:1: ( '.' )
            {
            // InternalPactDSL.g:2729:1: ( '.' )
            // InternalPactDSL.g:2730:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1__Impl"


    // $ANTLR start "rule__Model__Group_22__0"
    // InternalPactDSL.g:2740:1: rule__Model__Group_22__0 : rule__Model__Group_22__0__Impl rule__Model__Group_22__1 ;
    public final void rule__Model__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2744:1: ( rule__Model__Group_22__0__Impl rule__Model__Group_22__1 )
            // InternalPactDSL.g:2745:2: rule__Model__Group_22__0__Impl rule__Model__Group_22__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_22__0"


    // $ANTLR start "rule__Model__Group_22__0__Impl"
    // InternalPactDSL.g:2752:1: rule__Model__Group_22__0__Impl : ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) ) ;
    public final void rule__Model__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2756:1: ( ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) ) )
            // InternalPactDSL.g:2757:1: ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) )
            {
            // InternalPactDSL.g:2757:1: ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) )
            // InternalPactDSL.g:2758:2: ( rule__Model__BoilerplateTypesAssignment_22_0 )
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_22_0()); 
            // InternalPactDSL.g:2759:2: ( rule__Model__BoilerplateTypesAssignment_22_0 )
            // InternalPactDSL.g:2759:3: rule__Model__BoilerplateTypesAssignment_22_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__BoilerplateTypesAssignment_22_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_22__0__Impl"


    // $ANTLR start "rule__Model__Group_22__1"
    // InternalPactDSL.g:2767:1: rule__Model__Group_22__1 : rule__Model__Group_22__1__Impl ;
    public final void rule__Model__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2771:1: ( rule__Model__Group_22__1__Impl )
            // InternalPactDSL.g:2772:2: rule__Model__Group_22__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_22__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_22__1"


    // $ANTLR start "rule__Model__Group_22__1__Impl"
    // InternalPactDSL.g:2778:1: rule__Model__Group_22__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2782:1: ( ( '.' ) )
            // InternalPactDSL.g:2783:1: ( '.' )
            {
            // InternalPactDSL.g:2783:1: ( '.' )
            // InternalPactDSL.g:2784:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_22_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_22__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__0"
    // InternalPactDSL.g:2794:1: rule__EffectiveDate__Group__0 : rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 ;
    public final void rule__EffectiveDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2798:1: ( rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 )
            // InternalPactDSL.g:2799:2: rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectiveDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0"


    // $ANTLR start "rule__EffectiveDate__Group__0__Impl"
    // InternalPactDSL.g:2806:1: rule__EffectiveDate__Group__0__Impl : ( 'EffectiveDate:' ) ;
    public final void rule__EffectiveDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2810:1: ( ( 'EffectiveDate:' ) )
            // InternalPactDSL.g:2811:1: ( 'EffectiveDate:' )
            {
            // InternalPactDSL.g:2811:1: ( 'EffectiveDate:' )
            // InternalPactDSL.g:2812:2: 'EffectiveDate:'
            {
             before(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__1"
    // InternalPactDSL.g:2821:1: rule__EffectiveDate__Group__1 : rule__EffectiveDate__Group__1__Impl ;
    public final void rule__EffectiveDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2825:1: ( rule__EffectiveDate__Group__1__Impl )
            // InternalPactDSL.g:2826:2: rule__EffectiveDate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__1"


    // $ANTLR start "rule__EffectiveDate__Group__1__Impl"
    // InternalPactDSL.g:2832:1: rule__EffectiveDate__Group__1__Impl : ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) ;
    public final void rule__EffectiveDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2836:1: ( ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) )
            // InternalPactDSL.g:2837:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            {
            // InternalPactDSL.g:2837:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            // InternalPactDSL.g:2838:2: ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* )
            {
            // InternalPactDSL.g:2838:2: ( ( rule__EffectiveDate__Group_1__0 ) )
            // InternalPactDSL.g:2839:3: ( rule__EffectiveDate__Group_1__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2840:3: ( rule__EffectiveDate__Group_1__0 )
            // InternalPactDSL.g:2840:4: rule__EffectiveDate__Group_1__0
            {
            pushFollow(FOLLOW_21);
            rule__EffectiveDate__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }

            // InternalPactDSL.g:2843:2: ( ( rule__EffectiveDate__Group_1__0 )* )
            // InternalPactDSL.g:2844:3: ( rule__EffectiveDate__Group_1__0 )*
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2845:3: ( rule__EffectiveDate__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_INT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPactDSL.g:2845:4: rule__EffectiveDate__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EffectiveDate__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__0"
    // InternalPactDSL.g:2855:1: rule__EffectiveDate__Group_1__0 : rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 ;
    public final void rule__EffectiveDate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2859:1: ( rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 )
            // InternalPactDSL.g:2860:2: rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__EffectiveDate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0"


    // $ANTLR start "rule__EffectiveDate__Group_1__0__Impl"
    // InternalPactDSL.g:2867:1: rule__EffectiveDate__Group_1__0__Impl : ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) ;
    public final void rule__EffectiveDate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2871:1: ( ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) )
            // InternalPactDSL.g:2872:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            {
            // InternalPactDSL.g:2872:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            // InternalPactDSL.g:2873:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 
            // InternalPactDSL.g:2874:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            // InternalPactDSL.g:2874:3: rule__EffectiveDate__DayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__DayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__1"
    // InternalPactDSL.g:2882:1: rule__EffectiveDate__Group_1__1 : rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 ;
    public final void rule__EffectiveDate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2886:1: ( rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 )
            // InternalPactDSL.g:2887:2: rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__EffectiveDate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1"


    // $ANTLR start "rule__EffectiveDate__Group_1__1__Impl"
    // InternalPactDSL.g:2894:1: rule__EffectiveDate__Group_1__1__Impl : ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) ;
    public final void rule__EffectiveDate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2898:1: ( ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) )
            // InternalPactDSL.g:2899:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            {
            // InternalPactDSL.g:2899:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            // InternalPactDSL.g:2900:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 
            // InternalPactDSL.g:2901:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            // InternalPactDSL.g:2901:3: rule__EffectiveDate__MonthAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__MonthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__2"
    // InternalPactDSL.g:2909:1: rule__EffectiveDate__Group_1__2 : rule__EffectiveDate__Group_1__2__Impl ;
    public final void rule__EffectiveDate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2913:1: ( rule__EffectiveDate__Group_1__2__Impl )
            // InternalPactDSL.g:2914:2: rule__EffectiveDate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2"


    // $ANTLR start "rule__EffectiveDate__Group_1__2__Impl"
    // InternalPactDSL.g:2920:1: rule__EffectiveDate__Group_1__2__Impl : ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) ;
    public final void rule__EffectiveDate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2924:1: ( ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) )
            // InternalPactDSL.g:2925:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            {
            // InternalPactDSL.g:2925:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            // InternalPactDSL.g:2926:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            {
             before(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 
            // InternalPactDSL.g:2927:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            // InternalPactDSL.g:2927:3: rule__EffectiveDate__YearAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__YearAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2__Impl"


    // $ANTLR start "rule__Party__Group__0"
    // InternalPactDSL.g:2936:1: rule__Party__Group__0 : rule__Party__Group__0__Impl rule__Party__Group__1 ;
    public final void rule__Party__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2940:1: ( rule__Party__Group__0__Impl rule__Party__Group__1 )
            // InternalPactDSL.g:2941:2: rule__Party__Group__0__Impl rule__Party__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0"


    // $ANTLR start "rule__Party__Group__0__Impl"
    // InternalPactDSL.g:2948:1: rule__Party__Group__0__Impl : ( 'Party:' ) ;
    public final void rule__Party__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2952:1: ( ( 'Party:' ) )
            // InternalPactDSL.g:2953:1: ( 'Party:' )
            {
            // InternalPactDSL.g:2953:1: ( 'Party:' )
            // InternalPactDSL.g:2954:2: 'Party:'
            {
             before(grammarAccess.getPartyAccess().getPartyKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0__Impl"


    // $ANTLR start "rule__Party__Group__1"
    // InternalPactDSL.g:2963:1: rule__Party__Group__1 : rule__Party__Group__1__Impl rule__Party__Group__2 ;
    public final void rule__Party__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2967:1: ( rule__Party__Group__1__Impl rule__Party__Group__2 )
            // InternalPactDSL.g:2968:2: rule__Party__Group__1__Impl rule__Party__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Party__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1"


    // $ANTLR start "rule__Party__Group__1__Impl"
    // InternalPactDSL.g:2975:1: rule__Party__Group__1__Impl : ( ( rule__Party__NameAssignment_1 ) ) ;
    public final void rule__Party__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2979:1: ( ( ( rule__Party__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2980:1: ( ( rule__Party__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2980:1: ( ( rule__Party__NameAssignment_1 ) )
            // InternalPactDSL.g:2981:2: ( rule__Party__NameAssignment_1 )
            {
             before(grammarAccess.getPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2982:2: ( rule__Party__NameAssignment_1 )
            // InternalPactDSL.g:2982:3: rule__Party__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Party__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1__Impl"


    // $ANTLR start "rule__Party__Group__2"
    // InternalPactDSL.g:2990:1: rule__Party__Group__2 : rule__Party__Group__2__Impl rule__Party__Group__3 ;
    public final void rule__Party__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2994:1: ( rule__Party__Group__2__Impl rule__Party__Group__3 )
            // InternalPactDSL.g:2995:2: rule__Party__Group__2__Impl rule__Party__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Party__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2"


    // $ANTLR start "rule__Party__Group__2__Impl"
    // InternalPactDSL.g:3002:1: rule__Party__Group__2__Impl : ( ( rule__Party__FullnameAssignment_2 ) ) ;
    public final void rule__Party__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3006:1: ( ( ( rule__Party__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:3007:1: ( ( rule__Party__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:3007:1: ( ( rule__Party__FullnameAssignment_2 ) )
            // InternalPactDSL.g:3008:2: ( rule__Party__FullnameAssignment_2 )
            {
             before(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:3009:2: ( rule__Party__FullnameAssignment_2 )
            // InternalPactDSL.g:3009:3: rule__Party__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Party__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2__Impl"


    // $ANTLR start "rule__Party__Group__3"
    // InternalPactDSL.g:3017:1: rule__Party__Group__3 : rule__Party__Group__3__Impl ;
    public final void rule__Party__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3021:1: ( rule__Party__Group__3__Impl )
            // InternalPactDSL.g:3022:2: rule__Party__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3"


    // $ANTLR start "rule__Party__Group__3__Impl"
    // InternalPactDSL.g:3028:1: rule__Party__Group__3__Impl : ( ( rule__Party__FeatureAssignment_3 )* ) ;
    public final void rule__Party__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3032:1: ( ( ( rule__Party__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:3033:1: ( ( rule__Party__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:3033:1: ( ( rule__Party__FeatureAssignment_3 )* )
            // InternalPactDSL.g:3034:2: ( rule__Party__FeatureAssignment_3 )*
            {
             before(grammarAccess.getPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:3035:2: ( rule__Party__FeatureAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=33 && LA33_0<=36)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPactDSL.g:3035:3: rule__Party__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Party__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPartyAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3__Impl"


    // $ANTLR start "rule__ThirdParty__Group__0"
    // InternalPactDSL.g:3044:1: rule__ThirdParty__Group__0 : rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 ;
    public final void rule__ThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3048:1: ( rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 )
            // InternalPactDSL.g:3049:2: rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0"


    // $ANTLR start "rule__ThirdParty__Group__0__Impl"
    // InternalPactDSL.g:3056:1: rule__ThirdParty__Group__0__Impl : ( 'ThirdParty:' ) ;
    public final void rule__ThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3060:1: ( ( 'ThirdParty:' ) )
            // InternalPactDSL.g:3061:1: ( 'ThirdParty:' )
            {
            // InternalPactDSL.g:3061:1: ( 'ThirdParty:' )
            // InternalPactDSL.g:3062:2: 'ThirdParty:'
            {
             before(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ThirdParty__Group__1"
    // InternalPactDSL.g:3071:1: rule__ThirdParty__Group__1 : rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 ;
    public final void rule__ThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3075:1: ( rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 )
            // InternalPactDSL.g:3076:2: rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1"


    // $ANTLR start "rule__ThirdParty__Group__1__Impl"
    // InternalPactDSL.g:3083:1: rule__ThirdParty__Group__1__Impl : ( ( rule__ThirdParty__NameAssignment_1 ) ) ;
    public final void rule__ThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3087:1: ( ( ( rule__ThirdParty__NameAssignment_1 ) ) )
            // InternalPactDSL.g:3088:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:3088:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            // InternalPactDSL.g:3089:2: ( rule__ThirdParty__NameAssignment_1 )
            {
             before(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:3090:2: ( rule__ThirdParty__NameAssignment_1 )
            // InternalPactDSL.g:3090:3: rule__ThirdParty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ThirdParty__Group__2"
    // InternalPactDSL.g:3098:1: rule__ThirdParty__Group__2 : rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 ;
    public final void rule__ThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3102:1: ( rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 )
            // InternalPactDSL.g:3103:2: rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2"


    // $ANTLR start "rule__ThirdParty__Group__2__Impl"
    // InternalPactDSL.g:3110:1: rule__ThirdParty__Group__2__Impl : ( ( rule__ThirdParty__FullnameAssignment_2 ) ) ;
    public final void rule__ThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3114:1: ( ( ( rule__ThirdParty__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:3115:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:3115:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            // InternalPactDSL.g:3116:2: ( rule__ThirdParty__FullnameAssignment_2 )
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:3117:2: ( rule__ThirdParty__FullnameAssignment_2 )
            // InternalPactDSL.g:3117:3: rule__ThirdParty__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ThirdParty__Group__3"
    // InternalPactDSL.g:3125:1: rule__ThirdParty__Group__3 : rule__ThirdParty__Group__3__Impl ;
    public final void rule__ThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3129:1: ( rule__ThirdParty__Group__3__Impl )
            // InternalPactDSL.g:3130:2: rule__ThirdParty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3"


    // $ANTLR start "rule__ThirdParty__Group__3__Impl"
    // InternalPactDSL.g:3136:1: rule__ThirdParty__Group__3__Impl : ( ( rule__ThirdParty__FeatureAssignment_3 )* ) ;
    public final void rule__ThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3140:1: ( ( ( rule__ThirdParty__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:3141:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:3141:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            // InternalPactDSL.g:3142:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            {
             before(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:3143:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=33 && LA34_0<=36)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPactDSL.g:3143:3: rule__ThirdParty__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ThirdParty__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__0"
    // InternalPactDSL.g:3152:1: rule__SubjectMatter__Group__0 : rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 ;
    public final void rule__SubjectMatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3156:1: ( rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 )
            // InternalPactDSL.g:3157:2: rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0"


    // $ANTLR start "rule__SubjectMatter__Group__0__Impl"
    // InternalPactDSL.g:3164:1: rule__SubjectMatter__Group__0__Impl : ( 'SubjectMatter:' ) ;
    public final void rule__SubjectMatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3168:1: ( ( 'SubjectMatter:' ) )
            // InternalPactDSL.g:3169:1: ( 'SubjectMatter:' )
            {
            // InternalPactDSL.g:3169:1: ( 'SubjectMatter:' )
            // InternalPactDSL.g:3170:2: 'SubjectMatter:'
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__1"
    // InternalPactDSL.g:3179:1: rule__SubjectMatter__Group__1 : rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 ;
    public final void rule__SubjectMatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3183:1: ( rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 )
            // InternalPactDSL.g:3184:2: rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SubjectMatter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1"


    // $ANTLR start "rule__SubjectMatter__Group__1__Impl"
    // InternalPactDSL.g:3191:1: rule__SubjectMatter__Group__1__Impl : ( ( rule__SubjectMatter__NameAssignment_1 ) ) ;
    public final void rule__SubjectMatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3195:1: ( ( ( rule__SubjectMatter__NameAssignment_1 ) ) )
            // InternalPactDSL.g:3196:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:3196:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            // InternalPactDSL.g:3197:2: ( rule__SubjectMatter__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:3198:2: ( rule__SubjectMatter__NameAssignment_1 )
            // InternalPactDSL.g:3198:3: rule__SubjectMatter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__2"
    // InternalPactDSL.g:3206:1: rule__SubjectMatter__Group__2 : rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 ;
    public final void rule__SubjectMatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3210:1: ( rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 )
            // InternalPactDSL.g:3211:2: rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__SubjectMatter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2"


    // $ANTLR start "rule__SubjectMatter__Group__2__Impl"
    // InternalPactDSL.g:3218:1: rule__SubjectMatter__Group__2__Impl : ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) ;
    public final void rule__SubjectMatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3222:1: ( ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) )
            // InternalPactDSL.g:3223:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            {
            // InternalPactDSL.g:3223:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            // InternalPactDSL.g:3224:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 
            // InternalPactDSL.g:3225:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            // InternalPactDSL.g:3225:3: rule__SubjectMatter__SubjectMatterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__SubjectMatterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__3"
    // InternalPactDSL.g:3233:1: rule__SubjectMatter__Group__3 : rule__SubjectMatter__Group__3__Impl ;
    public final void rule__SubjectMatter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3237:1: ( rule__SubjectMatter__Group__3__Impl )
            // InternalPactDSL.g:3238:2: rule__SubjectMatter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3"


    // $ANTLR start "rule__SubjectMatter__Group__3__Impl"
    // InternalPactDSL.g:3244:1: rule__SubjectMatter__Group__3__Impl : ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) ;
    public final void rule__SubjectMatter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3248:1: ( ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:3249:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:3249:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            // InternalPactDSL.g:3250:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            {
             before(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:3251:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=33 && LA35_0<=36)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPactDSL.g:3251:3: rule__SubjectMatter__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SubjectMatter__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__0"
    // InternalPactDSL.g:3260:1: rule__DefinedTerm__Group__0 : rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 ;
    public final void rule__DefinedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3264:1: ( rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 )
            // InternalPactDSL.g:3265:2: rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DefinedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0"


    // $ANTLR start "rule__DefinedTerm__Group__0__Impl"
    // InternalPactDSL.g:3272:1: rule__DefinedTerm__Group__0__Impl : ( 'definedAs' ) ;
    public final void rule__DefinedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3276:1: ( ( 'definedAs' ) )
            // InternalPactDSL.g:3277:1: ( 'definedAs' )
            {
            // InternalPactDSL.g:3277:1: ( 'definedAs' )
            // InternalPactDSL.g:3278:2: 'definedAs'
            {
             before(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__1"
    // InternalPactDSL.g:3287:1: rule__DefinedTerm__Group__1 : rule__DefinedTerm__Group__1__Impl ;
    public final void rule__DefinedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3291:1: ( rule__DefinedTerm__Group__1__Impl )
            // InternalPactDSL.g:3292:2: rule__DefinedTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1"


    // $ANTLR start "rule__DefinedTerm__Group__1__Impl"
    // InternalPactDSL.g:3298:1: rule__DefinedTerm__Group__1__Impl : ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) ;
    public final void rule__DefinedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3302:1: ( ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3303:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3303:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3304:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3305:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            // InternalPactDSL.g:3305:3: rule__DefinedTerm__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalPactDSL.g:3314:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3318:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalPactDSL.g:3319:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalPactDSL.g:3326:1: rule__Address__Group__0__Impl : ( 'withAddress' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3330:1: ( ( 'withAddress' ) )
            // InternalPactDSL.g:3331:1: ( 'withAddress' )
            {
            // InternalPactDSL.g:3331:1: ( 'withAddress' )
            // InternalPactDSL.g:3332:2: 'withAddress'
            {
             before(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalPactDSL.g:3341:1: rule__Address__Group__1 : rule__Address__Group__1__Impl ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3345:1: ( rule__Address__Group__1__Impl )
            // InternalPactDSL.g:3346:2: rule__Address__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalPactDSL.g:3352:1: rule__Address__Group__1__Impl : ( ( rule__Address__AddressAssignment_1 ) ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3356:1: ( ( ( rule__Address__AddressAssignment_1 ) ) )
            // InternalPactDSL.g:3357:1: ( ( rule__Address__AddressAssignment_1 ) )
            {
            // InternalPactDSL.g:3357:1: ( ( rule__Address__AddressAssignment_1 ) )
            // InternalPactDSL.g:3358:2: ( rule__Address__AddressAssignment_1 )
            {
             before(grammarAccess.getAddressAccess().getAddressAssignment_1()); 
            // InternalPactDSL.g:3359:2: ( rule__Address__AddressAssignment_1 )
            // InternalPactDSL.g:3359:3: rule__Address__AddressAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__AddressAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getAddressAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__0"
    // InternalPactDSL.g:3368:1: rule__CompanyNumber__Group__0 : rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 ;
    public final void rule__CompanyNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3372:1: ( rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 )
            // InternalPactDSL.g:3373:2: rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CompanyNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0"


    // $ANTLR start "rule__CompanyNumber__Group__0__Impl"
    // InternalPactDSL.g:3380:1: rule__CompanyNumber__Group__0__Impl : ( 'withCompanyNumber' ) ;
    public final void rule__CompanyNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3384:1: ( ( 'withCompanyNumber' ) )
            // InternalPactDSL.g:3385:1: ( 'withCompanyNumber' )
            {
            // InternalPactDSL.g:3385:1: ( 'withCompanyNumber' )
            // InternalPactDSL.g:3386:2: 'withCompanyNumber'
            {
             before(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__1"
    // InternalPactDSL.g:3395:1: rule__CompanyNumber__Group__1 : rule__CompanyNumber__Group__1__Impl ;
    public final void rule__CompanyNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3399:1: ( rule__CompanyNumber__Group__1__Impl )
            // InternalPactDSL.g:3400:2: rule__CompanyNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1"


    // $ANTLR start "rule__CompanyNumber__Group__1__Impl"
    // InternalPactDSL.g:3406:1: rule__CompanyNumber__Group__1__Impl : ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) ) ;
    public final void rule__CompanyNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3410:1: ( ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) ) )
            // InternalPactDSL.g:3411:1: ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) )
            {
            // InternalPactDSL.g:3411:1: ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) )
            // InternalPactDSL.g:3412:2: ( rule__CompanyNumber__CompanyNumberAssignment_1 )
            {
             before(grammarAccess.getCompanyNumberAccess().getCompanyNumberAssignment_1()); 
            // InternalPactDSL.g:3413:2: ( rule__CompanyNumber__CompanyNumberAssignment_1 )
            // InternalPactDSL.g:3413:3: rule__CompanyNumber__CompanyNumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__CompanyNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getCompanyNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1__Impl"


    // $ANTLR start "rule__CustomFeature__Group__0"
    // InternalPactDSL.g:3422:1: rule__CustomFeature__Group__0 : rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 ;
    public final void rule__CustomFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3426:1: ( rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 )
            // InternalPactDSL.g:3427:2: rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__0"


    // $ANTLR start "rule__CustomFeature__Group__0__Impl"
    // InternalPactDSL.g:3434:1: rule__CustomFeature__Group__0__Impl : ( 'withFeature' ) ;
    public final void rule__CustomFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3438:1: ( ( 'withFeature' ) )
            // InternalPactDSL.g:3439:1: ( 'withFeature' )
            {
            // InternalPactDSL.g:3439:1: ( 'withFeature' )
            // InternalPactDSL.g:3440:2: 'withFeature'
            {
             before(grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__0__Impl"


    // $ANTLR start "rule__CustomFeature__Group__1"
    // InternalPactDSL.g:3449:1: rule__CustomFeature__Group__1 : rule__CustomFeature__Group__1__Impl ;
    public final void rule__CustomFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3453:1: ( rule__CustomFeature__Group__1__Impl )
            // InternalPactDSL.g:3454:2: rule__CustomFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__1"


    // $ANTLR start "rule__CustomFeature__Group__1__Impl"
    // InternalPactDSL.g:3460:1: rule__CustomFeature__Group__1__Impl : ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) ) ;
    public final void rule__CustomFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3464:1: ( ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) ) )
            // InternalPactDSL.g:3465:1: ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) )
            {
            // InternalPactDSL.g:3465:1: ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) )
            // InternalPactDSL.g:3466:2: ( rule__CustomFeature__CustomFeatureAssignment_1 )
            {
             before(grammarAccess.getCustomFeatureAccess().getCustomFeatureAssignment_1()); 
            // InternalPactDSL.g:3467:2: ( rule__CustomFeature__CustomFeatureAssignment_1 )
            // InternalPactDSL.g:3467:3: rule__CustomFeature__CustomFeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomFeature__CustomFeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomFeatureAccess().getCustomFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__Group__1__Impl"


    // $ANTLR start "rule__InWriting__Group__0"
    // InternalPactDSL.g:3476:1: rule__InWriting__Group__0 : rule__InWriting__Group__0__Impl rule__InWriting__Group__1 ;
    public final void rule__InWriting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3480:1: ( rule__InWriting__Group__0__Impl rule__InWriting__Group__1 )
            // InternalPactDSL.g:3481:2: rule__InWriting__Group__0__Impl rule__InWriting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InWriting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0"


    // $ANTLR start "rule__InWriting__Group__0__Impl"
    // InternalPactDSL.g:3488:1: rule__InWriting__Group__0__Impl : ( 'inWriting' ) ;
    public final void rule__InWriting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3492:1: ( ( 'inWriting' ) )
            // InternalPactDSL.g:3493:1: ( 'inWriting' )
            {
            // InternalPactDSL.g:3493:1: ( 'inWriting' )
            // InternalPactDSL.g:3494:2: 'inWriting'
            {
             before(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0__Impl"


    // $ANTLR start "rule__InWriting__Group__1"
    // InternalPactDSL.g:3503:1: rule__InWriting__Group__1 : rule__InWriting__Group__1__Impl ;
    public final void rule__InWriting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3507:1: ( rule__InWriting__Group__1__Impl )
            // InternalPactDSL.g:3508:2: rule__InWriting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1"


    // $ANTLR start "rule__InWriting__Group__1__Impl"
    // InternalPactDSL.g:3514:1: rule__InWriting__Group__1__Impl : ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) ;
    public final void rule__InWriting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3518:1: ( ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3519:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3519:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            // InternalPactDSL.g:3520:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 
            // InternalPactDSL.g:3521:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            // InternalPactDSL.g:3521:3: rule__InWriting__CustomWritingFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__CustomWritingFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__0"
    // InternalPactDSL.g:3530:1: rule__ByEmail__Group__0 : rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 ;
    public final void rule__ByEmail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3534:1: ( rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 )
            // InternalPactDSL.g:3535:2: rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ByEmail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0"


    // $ANTLR start "rule__ByEmail__Group__0__Impl"
    // InternalPactDSL.g:3542:1: rule__ByEmail__Group__0__Impl : ( 'byEmail' ) ;
    public final void rule__ByEmail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3546:1: ( ( 'byEmail' ) )
            // InternalPactDSL.g:3547:1: ( 'byEmail' )
            {
            // InternalPactDSL.g:3547:1: ( 'byEmail' )
            // InternalPactDSL.g:3548:2: 'byEmail'
            {
             before(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0__Impl"


    // $ANTLR start "rule__ByEmail__Group__1"
    // InternalPactDSL.g:3557:1: rule__ByEmail__Group__1 : rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 ;
    public final void rule__ByEmail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3561:1: ( rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 )
            // InternalPactDSL.g:3562:2: rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ByEmail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1"


    // $ANTLR start "rule__ByEmail__Group__1__Impl"
    // InternalPactDSL.g:3569:1: rule__ByEmail__Group__1__Impl : ( 'to' ) ;
    public final void rule__ByEmail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3573:1: ( ( 'to' ) )
            // InternalPactDSL.g:3574:1: ( 'to' )
            {
            // InternalPactDSL.g:3574:1: ( 'to' )
            // InternalPactDSL.g:3575:2: 'to'
            {
             before(grammarAccess.getByEmailAccess().getToKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__2"
    // InternalPactDSL.g:3584:1: rule__ByEmail__Group__2 : rule__ByEmail__Group__2__Impl ;
    public final void rule__ByEmail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3588:1: ( rule__ByEmail__Group__2__Impl )
            // InternalPactDSL.g:3589:2: rule__ByEmail__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2"


    // $ANTLR start "rule__ByEmail__Group__2__Impl"
    // InternalPactDSL.g:3595:1: rule__ByEmail__Group__2__Impl : ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) ;
    public final void rule__ByEmail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3599:1: ( ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) )
            // InternalPactDSL.g:3600:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            {
            // InternalPactDSL.g:3600:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            // InternalPactDSL.g:3601:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 
            // InternalPactDSL.g:3602:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            // InternalPactDSL.g:3602:3: rule__ByEmail__EmailAddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__EmailAddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group__0"
    // InternalPactDSL.g:3611:1: rule__GivingNotice__Group__0 : rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 ;
    public final void rule__GivingNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3615:1: ( rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 )
            // InternalPactDSL.g:3616:2: rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__GivingNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0"


    // $ANTLR start "rule__GivingNotice__Group__0__Impl"
    // InternalPactDSL.g:3623:1: rule__GivingNotice__Group__0__Impl : ( 'givingNoticeTo' ) ;
    public final void rule__GivingNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3627:1: ( ( 'givingNoticeTo' ) )
            // InternalPactDSL.g:3628:1: ( 'givingNoticeTo' )
            {
            // InternalPactDSL.g:3628:1: ( 'givingNoticeTo' )
            // InternalPactDSL.g:3629:2: 'givingNoticeTo'
            {
             before(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group__1"
    // InternalPactDSL.g:3638:1: rule__GivingNotice__Group__1 : rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 ;
    public final void rule__GivingNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3642:1: ( rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 )
            // InternalPactDSL.g:3643:2: rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__GivingNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1"


    // $ANTLR start "rule__GivingNotice__Group__1__Impl"
    // InternalPactDSL.g:3650:1: rule__GivingNotice__Group__1__Impl : ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) ;
    public final void rule__GivingNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3654:1: ( ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3655:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3655:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3656:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3657:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3657:3: rule__GivingNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group__2"
    // InternalPactDSL.g:3665:1: rule__GivingNotice__Group__2 : rule__GivingNotice__Group__2__Impl ;
    public final void rule__GivingNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3669:1: ( rule__GivingNotice__Group__2__Impl )
            // InternalPactDSL.g:3670:2: rule__GivingNotice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2"


    // $ANTLR start "rule__GivingNotice__Group__2__Impl"
    // InternalPactDSL.g:3676:1: rule__GivingNotice__Group__2__Impl : ( ( rule__GivingNotice__Group_2__0 )? ) ;
    public final void rule__GivingNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3680:1: ( ( ( rule__GivingNotice__Group_2__0 )? ) )
            // InternalPactDSL.g:3681:1: ( ( rule__GivingNotice__Group_2__0 )? )
            {
            // InternalPactDSL.g:3681:1: ( ( rule__GivingNotice__Group_2__0 )? )
            // InternalPactDSL.g:3682:2: ( rule__GivingNotice__Group_2__0 )?
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup_2()); 
            // InternalPactDSL.g:3683:2: ( rule__GivingNotice__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPactDSL.g:3683:3: rule__GivingNotice__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GivingNotice__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivingNoticeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__0"
    // InternalPactDSL.g:3692:1: rule__GivingNotice__Group_2__0 : rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 ;
    public final void rule__GivingNotice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3696:1: ( rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 )
            // InternalPactDSL.g:3697:2: rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__GivingNotice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0"


    // $ANTLR start "rule__GivingNotice__Group_2__0__Impl"
    // InternalPactDSL.g:3704:1: rule__GivingNotice__Group_2__0__Impl : ( 'withDuration' ) ;
    public final void rule__GivingNotice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3708:1: ( ( 'withDuration' ) )
            // InternalPactDSL.g:3709:1: ( 'withDuration' )
            {
            // InternalPactDSL.g:3709:1: ( 'withDuration' )
            // InternalPactDSL.g:3710:2: 'withDuration'
            {
             before(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__1"
    // InternalPactDSL.g:3719:1: rule__GivingNotice__Group_2__1 : rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 ;
    public final void rule__GivingNotice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3723:1: ( rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 )
            // InternalPactDSL.g:3724:2: rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__GivingNotice__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1"


    // $ANTLR start "rule__GivingNotice__Group_2__1__Impl"
    // InternalPactDSL.g:3731:1: rule__GivingNotice__Group_2__1__Impl : ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) ;
    public final void rule__GivingNotice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3735:1: ( ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) )
            // InternalPactDSL.g:3736:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            {
            // InternalPactDSL.g:3736:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            // InternalPactDSL.g:3737:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 
            // InternalPactDSL.g:3738:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            // InternalPactDSL.g:3738:3: rule__GivingNotice__NumDaysAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__NumDaysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__2"
    // InternalPactDSL.g:3746:1: rule__GivingNotice__Group_2__2 : rule__GivingNotice__Group_2__2__Impl ;
    public final void rule__GivingNotice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3750:1: ( rule__GivingNotice__Group_2__2__Impl )
            // InternalPactDSL.g:3751:2: rule__GivingNotice__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2"


    // $ANTLR start "rule__GivingNotice__Group_2__2__Impl"
    // InternalPactDSL.g:3757:1: rule__GivingNotice__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__GivingNotice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3761:1: ( ( 'days' ) )
            // InternalPactDSL.g:3762:1: ( 'days' )
            {
            // InternalPactDSL.g:3762:1: ( 'days' )
            // InternalPactDSL.g:3763:2: 'days'
            {
             before(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2__Impl"


    // $ANTLR start "rule__CustomFormality__Group__0"
    // InternalPactDSL.g:3773:1: rule__CustomFormality__Group__0 : rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 ;
    public final void rule__CustomFormality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3777:1: ( rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 )
            // InternalPactDSL.g:3778:2: rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomFormality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0"


    // $ANTLR start "rule__CustomFormality__Group__0__Impl"
    // InternalPactDSL.g:3785:1: rule__CustomFormality__Group__0__Impl : ( 'ContractFormality' ) ;
    public final void rule__CustomFormality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3789:1: ( ( 'ContractFormality' ) )
            // InternalPactDSL.g:3790:1: ( 'ContractFormality' )
            {
            // InternalPactDSL.g:3790:1: ( 'ContractFormality' )
            // InternalPactDSL.g:3791:2: 'ContractFormality'
            {
             before(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0__Impl"


    // $ANTLR start "rule__CustomFormality__Group__1"
    // InternalPactDSL.g:3800:1: rule__CustomFormality__Group__1 : rule__CustomFormality__Group__1__Impl ;
    public final void rule__CustomFormality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3804:1: ( rule__CustomFormality__Group__1__Impl )
            // InternalPactDSL.g:3805:2: rule__CustomFormality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1"


    // $ANTLR start "rule__CustomFormality__Group__1__Impl"
    // InternalPactDSL.g:3811:1: rule__CustomFormality__Group__1__Impl : ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) ;
    public final void rule__CustomFormality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3815:1: ( ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3816:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3816:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            // InternalPactDSL.g:3817:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 
            // InternalPactDSL.g:3818:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            // InternalPactDSL.g:3818:3: rule__CustomFormality__CustomFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__CustomFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1__Impl"


    // $ANTLR start "rule__GivenConsent__Group__0"
    // InternalPactDSL.g:3827:1: rule__GivenConsent__Group__0 : rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 ;
    public final void rule__GivenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3831:1: ( rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 )
            // InternalPactDSL.g:3832:2: rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GivenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0"


    // $ANTLR start "rule__GivenConsent__Group__0__Impl"
    // InternalPactDSL.g:3839:1: rule__GivenConsent__Group__0__Impl : ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3843:1: ( ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3844:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3844:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3845:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3846:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3846:3: rule__GivenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenConsent__Group__1"
    // InternalPactDSL.g:3854:1: rule__GivenConsent__Group__1 : rule__GivenConsent__Group__1__Impl ;
    public final void rule__GivenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3858:1: ( rule__GivenConsent__Group__1__Impl )
            // InternalPactDSL.g:3859:2: rule__GivenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1"


    // $ANTLR start "rule__GivenConsent__Group__1__Impl"
    // InternalPactDSL.g:3865:1: rule__GivenConsent__Group__1__Impl : ( 'gaveConsent' ) ;
    public final void rule__GivenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3869:1: ( ( 'gaveConsent' ) )
            // InternalPactDSL.g:3870:1: ( 'gaveConsent' )
            {
            // InternalPactDSL.g:3870:1: ( 'gaveConsent' )
            // InternalPactDSL.g:3871:2: 'gaveConsent'
            {
             before(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0"
    // InternalPactDSL.g:3881:1: rule__GivenWrittenConsent__Group__0 : rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 ;
    public final void rule__GivenWrittenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3885:1: ( rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 )
            // InternalPactDSL.g:3886:2: rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__GivenWrittenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0__Impl"
    // InternalPactDSL.g:3893:1: rule__GivenWrittenConsent__Group__0__Impl : ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenWrittenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3897:1: ( ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3898:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3898:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3899:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3900:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3900:3: rule__GivenWrittenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1"
    // InternalPactDSL.g:3908:1: rule__GivenWrittenConsent__Group__1 : rule__GivenWrittenConsent__Group__1__Impl ;
    public final void rule__GivenWrittenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3912:1: ( rule__GivenWrittenConsent__Group__1__Impl )
            // InternalPactDSL.g:3913:2: rule__GivenWrittenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1__Impl"
    // InternalPactDSL.g:3919:1: rule__GivenWrittenConsent__Group__1__Impl : ( 'gaveWrittenConsent' ) ;
    public final void rule__GivenWrittenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3923:1: ( ( 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:3924:1: ( 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:3924:1: ( 'gaveWrittenConsent' )
            // InternalPactDSL.g:3925:2: 'gaveWrittenConsent'
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1__Impl"


    // $ANTLR start "rule__CustomAction__Group__0"
    // InternalPactDSL.g:3935:1: rule__CustomAction__Group__0 : rule__CustomAction__Group__0__Impl rule__CustomAction__Group__1 ;
    public final void rule__CustomAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3939:1: ( rule__CustomAction__Group__0__Impl rule__CustomAction__Group__1 )
            // InternalPactDSL.g:3940:2: rule__CustomAction__Group__0__Impl rule__CustomAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__Group__0"


    // $ANTLR start "rule__CustomAction__Group__0__Impl"
    // InternalPactDSL.g:3947:1: rule__CustomAction__Group__0__Impl : ( ( rule__CustomAction__SuperTypeAssignment_0 ) ) ;
    public final void rule__CustomAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3951:1: ( ( ( rule__CustomAction__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3952:1: ( ( rule__CustomAction__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3952:1: ( ( rule__CustomAction__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3953:2: ( rule__CustomAction__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getCustomActionAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3954:2: ( rule__CustomAction__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3954:3: rule__CustomAction__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CustomAction__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomActionAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__Group__0__Impl"


    // $ANTLR start "rule__CustomAction__Group__1"
    // InternalPactDSL.g:3962:1: rule__CustomAction__Group__1 : rule__CustomAction__Group__1__Impl ;
    public final void rule__CustomAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3966:1: ( rule__CustomAction__Group__1__Impl )
            // InternalPactDSL.g:3967:2: rule__CustomAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__Group__1"


    // $ANTLR start "rule__CustomAction__Group__1__Impl"
    // InternalPactDSL.g:3973:1: rule__CustomAction__Group__1__Impl : ( ( rule__CustomAction__CustomActionAssignment_1 ) ) ;
    public final void rule__CustomAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3977:1: ( ( ( rule__CustomAction__CustomActionAssignment_1 ) ) )
            // InternalPactDSL.g:3978:1: ( ( rule__CustomAction__CustomActionAssignment_1 ) )
            {
            // InternalPactDSL.g:3978:1: ( ( rule__CustomAction__CustomActionAssignment_1 ) )
            // InternalPactDSL.g:3979:2: ( rule__CustomAction__CustomActionAssignment_1 )
            {
             before(grammarAccess.getCustomActionAccess().getCustomActionAssignment_1()); 
            // InternalPactDSL.g:3980:2: ( rule__CustomAction__CustomActionAssignment_1 )
            // InternalPactDSL.g:3980:3: rule__CustomAction__CustomActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomAction__CustomActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomActionAccess().getCustomActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__0"
    // InternalPactDSL.g:3989:1: rule__Ownership__Group__0 : rule__Ownership__Group__0__Impl rule__Ownership__Group__1 ;
    public final void rule__Ownership__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3993:1: ( rule__Ownership__Group__0__Impl rule__Ownership__Group__1 )
            // InternalPactDSL.g:3994:2: rule__Ownership__Group__0__Impl rule__Ownership__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Ownership__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0"


    // $ANTLR start "rule__Ownership__Group__0__Impl"
    // InternalPactDSL.g:4001:1: rule__Ownership__Group__0__Impl : ( 'Ownership:' ) ;
    public final void rule__Ownership__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4005:1: ( ( 'Ownership:' ) )
            // InternalPactDSL.g:4006:1: ( 'Ownership:' )
            {
            // InternalPactDSL.g:4006:1: ( 'Ownership:' )
            // InternalPactDSL.g:4007:2: 'Ownership:'
            {
             before(grammarAccess.getOwnershipAccess().getOwnershipKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getOwnershipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0__Impl"


    // $ANTLR start "rule__Ownership__Group__1"
    // InternalPactDSL.g:4016:1: rule__Ownership__Group__1 : rule__Ownership__Group__1__Impl rule__Ownership__Group__2 ;
    public final void rule__Ownership__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4020:1: ( rule__Ownership__Group__1__Impl rule__Ownership__Group__2 )
            // InternalPactDSL.g:4021:2: rule__Ownership__Group__1__Impl rule__Ownership__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Ownership__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1"


    // $ANTLR start "rule__Ownership__Group__1__Impl"
    // InternalPactDSL.g:4028:1: rule__Ownership__Group__1__Impl : ( ( rule__Ownership__SuperTypeAssignment_1 ) ) ;
    public final void rule__Ownership__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4032:1: ( ( ( rule__Ownership__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4033:1: ( ( rule__Ownership__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4033:1: ( ( rule__Ownership__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4034:2: ( rule__Ownership__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4035:2: ( rule__Ownership__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4035:3: rule__Ownership__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__2"
    // InternalPactDSL.g:4043:1: rule__Ownership__Group__2 : rule__Ownership__Group__2__Impl rule__Ownership__Group__3 ;
    public final void rule__Ownership__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4047:1: ( rule__Ownership__Group__2__Impl rule__Ownership__Group__3 )
            // InternalPactDSL.g:4048:2: rule__Ownership__Group__2__Impl rule__Ownership__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Ownership__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2"


    // $ANTLR start "rule__Ownership__Group__2__Impl"
    // InternalPactDSL.g:4055:1: rule__Ownership__Group__2__Impl : ( ( rule__Ownership__Alternatives_2 ) ) ;
    public final void rule__Ownership__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4059:1: ( ( ( rule__Ownership__Alternatives_2 ) ) )
            // InternalPactDSL.g:4060:1: ( ( rule__Ownership__Alternatives_2 ) )
            {
            // InternalPactDSL.g:4060:1: ( ( rule__Ownership__Alternatives_2 ) )
            // InternalPactDSL.g:4061:2: ( rule__Ownership__Alternatives_2 )
            {
             before(grammarAccess.getOwnershipAccess().getAlternatives_2()); 
            // InternalPactDSL.g:4062:2: ( rule__Ownership__Alternatives_2 )
            // InternalPactDSL.g:4062:3: rule__Ownership__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2__Impl"


    // $ANTLR start "rule__Ownership__Group__3"
    // InternalPactDSL.g:4070:1: rule__Ownership__Group__3 : rule__Ownership__Group__3__Impl rule__Ownership__Group__4 ;
    public final void rule__Ownership__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4074:1: ( rule__Ownership__Group__3__Impl rule__Ownership__Group__4 )
            // InternalPactDSL.g:4075:2: rule__Ownership__Group__3__Impl rule__Ownership__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Ownership__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3"


    // $ANTLR start "rule__Ownership__Group__3__Impl"
    // InternalPactDSL.g:4082:1: rule__Ownership__Group__3__Impl : ( ( rule__Ownership__SuperTypeAssignment_3 )? ) ;
    public final void rule__Ownership__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4086:1: ( ( ( rule__Ownership__SuperTypeAssignment_3 )? ) )
            // InternalPactDSL.g:4087:1: ( ( rule__Ownership__SuperTypeAssignment_3 )? )
            {
            // InternalPactDSL.g:4087:1: ( ( rule__Ownership__SuperTypeAssignment_3 )? )
            // InternalPactDSL.g:4088:2: ( rule__Ownership__SuperTypeAssignment_3 )?
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:4089:2: ( rule__Ownership__SuperTypeAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPactDSL.g:4089:3: rule__Ownership__SuperTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ownership__SuperTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3__Impl"


    // $ANTLR start "rule__Ownership__Group__4"
    // InternalPactDSL.g:4097:1: rule__Ownership__Group__4 : rule__Ownership__Group__4__Impl ;
    public final void rule__Ownership__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4101:1: ( rule__Ownership__Group__4__Impl )
            // InternalPactDSL.g:4102:2: rule__Ownership__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__4"


    // $ANTLR start "rule__Ownership__Group__4__Impl"
    // InternalPactDSL.g:4108:1: rule__Ownership__Group__4__Impl : ( ( rule__Ownership__CustomOwnershipAssignment_4 )? ) ;
    public final void rule__Ownership__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4112:1: ( ( ( rule__Ownership__CustomOwnershipAssignment_4 )? ) )
            // InternalPactDSL.g:4113:1: ( ( rule__Ownership__CustomOwnershipAssignment_4 )? )
            {
            // InternalPactDSL.g:4113:1: ( ( rule__Ownership__CustomOwnershipAssignment_4 )? )
            // InternalPactDSL.g:4114:2: ( rule__Ownership__CustomOwnershipAssignment_4 )?
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_4()); 
            // InternalPactDSL.g:4115:2: ( rule__Ownership__CustomOwnershipAssignment_4 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPactDSL.g:4115:3: rule__Ownership__CustomOwnershipAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ownership__CustomOwnershipAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__4__Impl"


    // $ANTLR start "rule__RightToUse__Group__0"
    // InternalPactDSL.g:4124:1: rule__RightToUse__Group__0 : rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 ;
    public final void rule__RightToUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4128:1: ( rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 )
            // InternalPactDSL.g:4129:2: rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__RightToUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0"


    // $ANTLR start "rule__RightToUse__Group__0__Impl"
    // InternalPactDSL.g:4136:1: rule__RightToUse__Group__0__Impl : ( 'RightToUse:' ) ;
    public final void rule__RightToUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4140:1: ( ( 'RightToUse:' ) )
            // InternalPactDSL.g:4141:1: ( 'RightToUse:' )
            {
            // InternalPactDSL.g:4141:1: ( 'RightToUse:' )
            // InternalPactDSL.g:4142:2: 'RightToUse:'
            {
             before(grammarAccess.getRightToUseAccess().getRightToUseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getRightToUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0__Impl"


    // $ANTLR start "rule__RightToUse__Group__1"
    // InternalPactDSL.g:4151:1: rule__RightToUse__Group__1 : rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 ;
    public final void rule__RightToUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4155:1: ( rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 )
            // InternalPactDSL.g:4156:2: rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__RightToUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1"


    // $ANTLR start "rule__RightToUse__Group__1__Impl"
    // InternalPactDSL.g:4163:1: rule__RightToUse__Group__1__Impl : ( ( rule__RightToUse__SuperTypeAssignment_1 ) ) ;
    public final void rule__RightToUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4167:1: ( ( ( rule__RightToUse__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4168:1: ( ( rule__RightToUse__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4168:1: ( ( rule__RightToUse__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4169:2: ( rule__RightToUse__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4170:2: ( rule__RightToUse__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4170:3: rule__RightToUse__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1__Impl"


    // $ANTLR start "rule__RightToUse__Group__2"
    // InternalPactDSL.g:4178:1: rule__RightToUse__Group__2 : rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 ;
    public final void rule__RightToUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4182:1: ( rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 )
            // InternalPactDSL.g:4183:2: rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__RightToUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2"


    // $ANTLR start "rule__RightToUse__Group__2__Impl"
    // InternalPactDSL.g:4190:1: rule__RightToUse__Group__2__Impl : ( ( rule__RightToUse__Alternatives_2 ) ) ;
    public final void rule__RightToUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4194:1: ( ( ( rule__RightToUse__Alternatives_2 ) ) )
            // InternalPactDSL.g:4195:1: ( ( rule__RightToUse__Alternatives_2 ) )
            {
            // InternalPactDSL.g:4195:1: ( ( rule__RightToUse__Alternatives_2 ) )
            // InternalPactDSL.g:4196:2: ( rule__RightToUse__Alternatives_2 )
            {
             before(grammarAccess.getRightToUseAccess().getAlternatives_2()); 
            // InternalPactDSL.g:4197:2: ( rule__RightToUse__Alternatives_2 )
            // InternalPactDSL.g:4197:3: rule__RightToUse__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2__Impl"


    // $ANTLR start "rule__RightToUse__Group__3"
    // InternalPactDSL.g:4205:1: rule__RightToUse__Group__3 : rule__RightToUse__Group__3__Impl rule__RightToUse__Group__4 ;
    public final void rule__RightToUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4209:1: ( rule__RightToUse__Group__3__Impl rule__RightToUse__Group__4 )
            // InternalPactDSL.g:4210:2: rule__RightToUse__Group__3__Impl rule__RightToUse__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__RightToUse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3"


    // $ANTLR start "rule__RightToUse__Group__3__Impl"
    // InternalPactDSL.g:4217:1: rule__RightToUse__Group__3__Impl : ( ( rule__RightToUse__SuperTypeAssignment_3 )? ) ;
    public final void rule__RightToUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4221:1: ( ( ( rule__RightToUse__SuperTypeAssignment_3 )? ) )
            // InternalPactDSL.g:4222:1: ( ( rule__RightToUse__SuperTypeAssignment_3 )? )
            {
            // InternalPactDSL.g:4222:1: ( ( rule__RightToUse__SuperTypeAssignment_3 )? )
            // InternalPactDSL.g:4223:2: ( rule__RightToUse__SuperTypeAssignment_3 )?
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:4224:2: ( rule__RightToUse__SuperTypeAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalPactDSL.g:4224:3: rule__RightToUse__SuperTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightToUse__SuperTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3__Impl"


    // $ANTLR start "rule__RightToUse__Group__4"
    // InternalPactDSL.g:4232:1: rule__RightToUse__Group__4 : rule__RightToUse__Group__4__Impl ;
    public final void rule__RightToUse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4236:1: ( rule__RightToUse__Group__4__Impl )
            // InternalPactDSL.g:4237:2: rule__RightToUse__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__4"


    // $ANTLR start "rule__RightToUse__Group__4__Impl"
    // InternalPactDSL.g:4243:1: rule__RightToUse__Group__4__Impl : ( ( rule__RightToUse__CustomUsageAssignment_4 )? ) ;
    public final void rule__RightToUse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4247:1: ( ( ( rule__RightToUse__CustomUsageAssignment_4 )? ) )
            // InternalPactDSL.g:4248:1: ( ( rule__RightToUse__CustomUsageAssignment_4 )? )
            {
            // InternalPactDSL.g:4248:1: ( ( rule__RightToUse__CustomUsageAssignment_4 )? )
            // InternalPactDSL.g:4249:2: ( rule__RightToUse__CustomUsageAssignment_4 )?
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_4()); 
            // InternalPactDSL.g:4250:2: ( rule__RightToUse__CustomUsageAssignment_4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPactDSL.g:4250:3: rule__RightToUse__CustomUsageAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__RightToUse__CustomUsageAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__4__Impl"


    // $ANTLR start "rule__CustomState__Group__0"
    // InternalPactDSL.g:4259:1: rule__CustomState__Group__0 : rule__CustomState__Group__0__Impl rule__CustomState__Group__1 ;
    public final void rule__CustomState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4263:1: ( rule__CustomState__Group__0__Impl rule__CustomState__Group__1 )
            // InternalPactDSL.g:4264:2: rule__CustomState__Group__0__Impl rule__CustomState__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CustomState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__0"


    // $ANTLR start "rule__CustomState__Group__0__Impl"
    // InternalPactDSL.g:4271:1: rule__CustomState__Group__0__Impl : ( 'State:' ) ;
    public final void rule__CustomState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4275:1: ( ( 'State:' ) )
            // InternalPactDSL.g:4276:1: ( 'State:' )
            {
            // InternalPactDSL.g:4276:1: ( 'State:' )
            // InternalPactDSL.g:4277:2: 'State:'
            {
             before(grammarAccess.getCustomStateAccess().getStateKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCustomStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__0__Impl"


    // $ANTLR start "rule__CustomState__Group__1"
    // InternalPactDSL.g:4286:1: rule__CustomState__Group__1 : rule__CustomState__Group__1__Impl rule__CustomState__Group__2 ;
    public final void rule__CustomState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4290:1: ( rule__CustomState__Group__1__Impl rule__CustomState__Group__2 )
            // InternalPactDSL.g:4291:2: rule__CustomState__Group__1__Impl rule__CustomState__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__CustomState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__1"


    // $ANTLR start "rule__CustomState__Group__1__Impl"
    // InternalPactDSL.g:4298:1: rule__CustomState__Group__1__Impl : ( ( rule__CustomState__SuperTypeAssignment_1 ) ) ;
    public final void rule__CustomState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4302:1: ( ( ( rule__CustomState__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4303:1: ( ( rule__CustomState__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4303:1: ( ( rule__CustomState__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4304:2: ( rule__CustomState__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4305:2: ( rule__CustomState__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4305:3: rule__CustomState__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomState__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomStateAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__1__Impl"


    // $ANTLR start "rule__CustomState__Group__2"
    // InternalPactDSL.g:4313:1: rule__CustomState__Group__2 : rule__CustomState__Group__2__Impl rule__CustomState__Group__3 ;
    public final void rule__CustomState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4317:1: ( rule__CustomState__Group__2__Impl rule__CustomState__Group__3 )
            // InternalPactDSL.g:4318:2: rule__CustomState__Group__2__Impl rule__CustomState__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__CustomState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__2"


    // $ANTLR start "rule__CustomState__Group__2__Impl"
    // InternalPactDSL.g:4325:1: rule__CustomState__Group__2__Impl : ( ( rule__CustomState__SuperTypeAssignment_2 )? ) ;
    public final void rule__CustomState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4329:1: ( ( ( rule__CustomState__SuperTypeAssignment_2 )? ) )
            // InternalPactDSL.g:4330:1: ( ( rule__CustomState__SuperTypeAssignment_2 )? )
            {
            // InternalPactDSL.g:4330:1: ( ( rule__CustomState__SuperTypeAssignment_2 )? )
            // InternalPactDSL.g:4331:2: ( rule__CustomState__SuperTypeAssignment_2 )?
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypeAssignment_2()); 
            // InternalPactDSL.g:4332:2: ( rule__CustomState__SuperTypeAssignment_2 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPactDSL.g:4332:3: rule__CustomState__SuperTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomState__SuperTypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomStateAccess().getSuperTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__2__Impl"


    // $ANTLR start "rule__CustomState__Group__3"
    // InternalPactDSL.g:4340:1: rule__CustomState__Group__3 : rule__CustomState__Group__3__Impl ;
    public final void rule__CustomState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4344:1: ( rule__CustomState__Group__3__Impl )
            // InternalPactDSL.g:4345:2: rule__CustomState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomState__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__3"


    // $ANTLR start "rule__CustomState__Group__3__Impl"
    // InternalPactDSL.g:4351:1: rule__CustomState__Group__3__Impl : ( ( rule__CustomState__CustomStateAssignment_3 )? ) ;
    public final void rule__CustomState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4355:1: ( ( ( rule__CustomState__CustomStateAssignment_3 )? ) )
            // InternalPactDSL.g:4356:1: ( ( rule__CustomState__CustomStateAssignment_3 )? )
            {
            // InternalPactDSL.g:4356:1: ( ( rule__CustomState__CustomStateAssignment_3 )? )
            // InternalPactDSL.g:4357:2: ( rule__CustomState__CustomStateAssignment_3 )?
            {
             before(grammarAccess.getCustomStateAccess().getCustomStateAssignment_3()); 
            // InternalPactDSL.g:4358:2: ( rule__CustomState__CustomStateAssignment_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPactDSL.g:4358:3: rule__CustomState__CustomStateAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomState__CustomStateAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomStateAccess().getCustomStateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__0"
    // InternalPactDSL.g:4367:1: rule__PaymentObligation__Group__0 : rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 ;
    public final void rule__PaymentObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4371:1: ( rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 )
            // InternalPactDSL.g:4372:2: rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PaymentObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0"


    // $ANTLR start "rule__PaymentObligation__Group__0__Impl"
    // InternalPactDSL.g:4379:1: rule__PaymentObligation__Group__0__Impl : ( 'PaymentObligation:' ) ;
    public final void rule__PaymentObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4383:1: ( ( 'PaymentObligation:' ) )
            // InternalPactDSL.g:4384:1: ( 'PaymentObligation:' )
            {
            // InternalPactDSL.g:4384:1: ( 'PaymentObligation:' )
            // InternalPactDSL.g:4385:2: 'PaymentObligation:'
            {
             before(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__1"
    // InternalPactDSL.g:4394:1: rule__PaymentObligation__Group__1 : rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 ;
    public final void rule__PaymentObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4398:1: ( rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 )
            // InternalPactDSL.g:4399:2: rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__PaymentObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1"


    // $ANTLR start "rule__PaymentObligation__Group__1__Impl"
    // InternalPactDSL.g:4406:1: rule__PaymentObligation__Group__1__Impl : ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__PaymentObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4410:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4411:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4411:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4412:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4413:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4413:3: rule__PaymentObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__2"
    // InternalPactDSL.g:4421:1: rule__PaymentObligation__Group__2 : rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 ;
    public final void rule__PaymentObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4425:1: ( rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 )
            // InternalPactDSL.g:4426:2: rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__PaymentObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2"


    // $ANTLR start "rule__PaymentObligation__Group__2__Impl"
    // InternalPactDSL.g:4433:1: rule__PaymentObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__PaymentObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4437:1: ( ( 'must' ) )
            // InternalPactDSL.g:4438:1: ( 'must' )
            {
            // InternalPactDSL.g:4438:1: ( 'must' )
            // InternalPactDSL.g:4439:2: 'must'
            {
             before(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__3"
    // InternalPactDSL.g:4448:1: rule__PaymentObligation__Group__3 : rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 ;
    public final void rule__PaymentObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4452:1: ( rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 )
            // InternalPactDSL.g:4453:2: rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3"


    // $ANTLR start "rule__PaymentObligation__Group__3__Impl"
    // InternalPactDSL.g:4460:1: rule__PaymentObligation__Group__3__Impl : ( 'pay' ) ;
    public final void rule__PaymentObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4464:1: ( ( 'pay' ) )
            // InternalPactDSL.g:4465:1: ( 'pay' )
            {
            // InternalPactDSL.g:4465:1: ( 'pay' )
            // InternalPactDSL.g:4466:2: 'pay'
            {
             before(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__4"
    // InternalPactDSL.g:4475:1: rule__PaymentObligation__Group__4 : rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 ;
    public final void rule__PaymentObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4479:1: ( rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 )
            // InternalPactDSL.g:4480:2: rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__PaymentObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__4"


    // $ANTLR start "rule__PaymentObligation__Group__4__Impl"
    // InternalPactDSL.g:4487:1: rule__PaymentObligation__Group__4__Impl : ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) ;
    public final void rule__PaymentObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4491:1: ( ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:4492:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4492:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            // InternalPactDSL.g:4493:2: ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:4493:2: ( ( rule__PaymentObligation__SumAssignment_4 ) )
            // InternalPactDSL.g:4494:3: ( rule__PaymentObligation__SumAssignment_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4495:3: ( rule__PaymentObligation__SumAssignment_4 )
            // InternalPactDSL.g:4495:4: rule__PaymentObligation__SumAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:4498:2: ( ( rule__PaymentObligation__SumAssignment_4 )* )
            // InternalPactDSL.g:4499:3: ( rule__PaymentObligation__SumAssignment_4 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4500:3: ( rule__PaymentObligation__SumAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_INT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPactDSL.g:4500:4: rule__PaymentObligation__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PaymentObligation__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__4__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__5"
    // InternalPactDSL.g:4509:1: rule__PaymentObligation__Group__5 : rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 ;
    public final void rule__PaymentObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4513:1: ( rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 )
            // InternalPactDSL.g:4514:2: rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__PaymentObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5"


    // $ANTLR start "rule__PaymentObligation__Group__5__Impl"
    // InternalPactDSL.g:4521:1: rule__PaymentObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__PaymentObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4525:1: ( ( 'to' ) )
            // InternalPactDSL.g:4526:1: ( 'to' )
            {
            // InternalPactDSL.g:4526:1: ( 'to' )
            // InternalPactDSL.g:4527:2: 'to'
            {
             before(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__6"
    // InternalPactDSL.g:4536:1: rule__PaymentObligation__Group__6 : rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 ;
    public final void rule__PaymentObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4540:1: ( rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 )
            // InternalPactDSL.g:4541:2: rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__PaymentObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__6"


    // $ANTLR start "rule__PaymentObligation__Group__6__Impl"
    // InternalPactDSL.g:4548:1: rule__PaymentObligation__Group__6__Impl : ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__PaymentObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4552:1: ( ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4553:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4553:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4554:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4554:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4555:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4556:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4556:4: rule__PaymentObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__PaymentObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4559:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4560:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4561:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPactDSL.g:4561:4: rule__PaymentObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PaymentObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__6__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__7"
    // InternalPactDSL.g:4570:1: rule__PaymentObligation__Group__7 : rule__PaymentObligation__Group__7__Impl ;
    public final void rule__PaymentObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4574:1: ( rule__PaymentObligation__Group__7__Impl )
            // InternalPactDSL.g:4575:2: rule__PaymentObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7"


    // $ANTLR start "rule__PaymentObligation__Group__7__Impl"
    // InternalPactDSL.g:4581:1: rule__PaymentObligation__Group__7__Impl : ( ( rule__PaymentObligation__Group_7__0 )? ) ;
    public final void rule__PaymentObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4585:1: ( ( ( rule__PaymentObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4586:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4586:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            // InternalPactDSL.g:4587:2: ( rule__PaymentObligation__Group_7__0 )?
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4588:2: ( rule__PaymentObligation__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPactDSL.g:4588:3: rule__PaymentObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaymentObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__0"
    // InternalPactDSL.g:4597:1: rule__PaymentObligation__Group_7__0 : rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 ;
    public final void rule__PaymentObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4601:1: ( rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 )
            // InternalPactDSL.g:4602:2: rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__PaymentObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0"


    // $ANTLR start "rule__PaymentObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4609:1: rule__PaymentObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__PaymentObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4613:1: ( ( 'by' ) )
            // InternalPactDSL.g:4614:1: ( 'by' )
            {
            // InternalPactDSL.g:4614:1: ( 'by' )
            // InternalPactDSL.g:4615:2: 'by'
            {
             before(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__1"
    // InternalPactDSL.g:4624:1: rule__PaymentObligation__Group_7__1 : rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 ;
    public final void rule__PaymentObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4628:1: ( rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 )
            // InternalPactDSL.g:4629:2: rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1"


    // $ANTLR start "rule__PaymentObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4636:1: rule__PaymentObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__PaymentObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4640:1: ( ( 'date' ) )
            // InternalPactDSL.g:4641:1: ( 'date' )
            {
            // InternalPactDSL.g:4641:1: ( 'date' )
            // InternalPactDSL.g:4642:2: 'date'
            {
             before(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__2"
    // InternalPactDSL.g:4651:1: rule__PaymentObligation__Group_7__2 : rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 ;
    public final void rule__PaymentObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4655:1: ( rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 )
            // InternalPactDSL.g:4656:2: rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2"


    // $ANTLR start "rule__PaymentObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4663:1: rule__PaymentObligation__Group_7__2__Impl : ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) ;
    public final void rule__PaymentObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4667:1: ( ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4668:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4668:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4669:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4670:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4670:3: rule__PaymentObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__3"
    // InternalPactDSL.g:4678:1: rule__PaymentObligation__Group_7__3 : rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 ;
    public final void rule__PaymentObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4682:1: ( rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 )
            // InternalPactDSL.g:4683:2: rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3"


    // $ANTLR start "rule__PaymentObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4690:1: rule__PaymentObligation__Group_7__3__Impl : ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__PaymentObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4694:1: ( ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4695:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4695:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4696:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4697:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4697:3: rule__PaymentObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__4"
    // InternalPactDSL.g:4705:1: rule__PaymentObligation__Group_7__4 : rule__PaymentObligation__Group_7__4__Impl ;
    public final void rule__PaymentObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4709:1: ( rule__PaymentObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4710:2: rule__PaymentObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4"


    // $ANTLR start "rule__PaymentObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4716:1: rule__PaymentObligation__Group_7__4__Impl : ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) ;
    public final void rule__PaymentObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4720:1: ( ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4721:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4721:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4722:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4723:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4723:3: rule__PaymentObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__0"
    // InternalPactDSL.g:4732:1: rule__DeliveryObligation__Group__0 : rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 ;
    public final void rule__DeliveryObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4736:1: ( rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 )
            // InternalPactDSL.g:4737:2: rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DeliveryObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0"


    // $ANTLR start "rule__DeliveryObligation__Group__0__Impl"
    // InternalPactDSL.g:4744:1: rule__DeliveryObligation__Group__0__Impl : ( 'DeliveryObligation:' ) ;
    public final void rule__DeliveryObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4748:1: ( ( 'DeliveryObligation:' ) )
            // InternalPactDSL.g:4749:1: ( 'DeliveryObligation:' )
            {
            // InternalPactDSL.g:4749:1: ( 'DeliveryObligation:' )
            // InternalPactDSL.g:4750:2: 'DeliveryObligation:'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__1"
    // InternalPactDSL.g:4759:1: rule__DeliveryObligation__Group__1 : rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 ;
    public final void rule__DeliveryObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4763:1: ( rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 )
            // InternalPactDSL.g:4764:2: rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DeliveryObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1"


    // $ANTLR start "rule__DeliveryObligation__Group__1__Impl"
    // InternalPactDSL.g:4771:1: rule__DeliveryObligation__Group__1__Impl : ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__DeliveryObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4775:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4776:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4776:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4777:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4778:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4778:3: rule__DeliveryObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__2"
    // InternalPactDSL.g:4786:1: rule__DeliveryObligation__Group__2 : rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 ;
    public final void rule__DeliveryObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4790:1: ( rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 )
            // InternalPactDSL.g:4791:2: rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DeliveryObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2"


    // $ANTLR start "rule__DeliveryObligation__Group__2__Impl"
    // InternalPactDSL.g:4798:1: rule__DeliveryObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__DeliveryObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4802:1: ( ( 'must' ) )
            // InternalPactDSL.g:4803:1: ( 'must' )
            {
            // InternalPactDSL.g:4803:1: ( 'must' )
            // InternalPactDSL.g:4804:2: 'must'
            {
             before(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__3"
    // InternalPactDSL.g:4813:1: rule__DeliveryObligation__Group__3 : rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 ;
    public final void rule__DeliveryObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4817:1: ( rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 )
            // InternalPactDSL.g:4818:2: rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__DeliveryObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3"


    // $ANTLR start "rule__DeliveryObligation__Group__3__Impl"
    // InternalPactDSL.g:4825:1: rule__DeliveryObligation__Group__3__Impl : ( 'deliver' ) ;
    public final void rule__DeliveryObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4829:1: ( ( 'deliver' ) )
            // InternalPactDSL.g:4830:1: ( 'deliver' )
            {
            // InternalPactDSL.g:4830:1: ( 'deliver' )
            // InternalPactDSL.g:4831:2: 'deliver'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__4"
    // InternalPactDSL.g:4840:1: rule__DeliveryObligation__Group__4 : rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 ;
    public final void rule__DeliveryObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4844:1: ( rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 )
            // InternalPactDSL.g:4845:2: rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__DeliveryObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__4"


    // $ANTLR start "rule__DeliveryObligation__Group__4__Impl"
    // InternalPactDSL.g:4852:1: rule__DeliveryObligation__Group__4__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__DeliveryObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4856:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4857:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4857:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4858:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4858:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4859:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4860:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4860:4: rule__DeliveryObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4863:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4864:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4865:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPactDSL.g:4865:4: rule__DeliveryObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__5"
    // InternalPactDSL.g:4874:1: rule__DeliveryObligation__Group__5 : rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 ;
    public final void rule__DeliveryObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4878:1: ( rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 )
            // InternalPactDSL.g:4879:2: rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__DeliveryObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5"


    // $ANTLR start "rule__DeliveryObligation__Group__5__Impl"
    // InternalPactDSL.g:4886:1: rule__DeliveryObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DeliveryObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4890:1: ( ( 'to' ) )
            // InternalPactDSL.g:4891:1: ( 'to' )
            {
            // InternalPactDSL.g:4891:1: ( 'to' )
            // InternalPactDSL.g:4892:2: 'to'
            {
             before(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__6"
    // InternalPactDSL.g:4901:1: rule__DeliveryObligation__Group__6 : rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 ;
    public final void rule__DeliveryObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4905:1: ( rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 )
            // InternalPactDSL.g:4906:2: rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__DeliveryObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__6"


    // $ANTLR start "rule__DeliveryObligation__Group__6__Impl"
    // InternalPactDSL.g:4913:1: rule__DeliveryObligation__Group__6__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__DeliveryObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4917:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4918:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4918:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4919:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4919:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4920:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4921:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4921:4: rule__DeliveryObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4924:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4925:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4926:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPactDSL.g:4926:4: rule__DeliveryObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__6__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__7"
    // InternalPactDSL.g:4935:1: rule__DeliveryObligation__Group__7 : rule__DeliveryObligation__Group__7__Impl ;
    public final void rule__DeliveryObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4939:1: ( rule__DeliveryObligation__Group__7__Impl )
            // InternalPactDSL.g:4940:2: rule__DeliveryObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7"


    // $ANTLR start "rule__DeliveryObligation__Group__7__Impl"
    // InternalPactDSL.g:4946:1: rule__DeliveryObligation__Group__7__Impl : ( ( rule__DeliveryObligation__Group_7__0 )? ) ;
    public final void rule__DeliveryObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4950:1: ( ( ( rule__DeliveryObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4951:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4951:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            // InternalPactDSL.g:4952:2: ( rule__DeliveryObligation__Group_7__0 )?
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4953:2: ( rule__DeliveryObligation__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPactDSL.g:4953:3: rule__DeliveryObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeliveryObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0"
    // InternalPactDSL.g:4962:1: rule__DeliveryObligation__Group_7__0 : rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 ;
    public final void rule__DeliveryObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4966:1: ( rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 )
            // InternalPactDSL.g:4967:2: rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__DeliveryObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4974:1: rule__DeliveryObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__DeliveryObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4978:1: ( ( 'by' ) )
            // InternalPactDSL.g:4979:1: ( 'by' )
            {
            // InternalPactDSL.g:4979:1: ( 'by' )
            // InternalPactDSL.g:4980:2: 'by'
            {
             before(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1"
    // InternalPactDSL.g:4989:1: rule__DeliveryObligation__Group_7__1 : rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 ;
    public final void rule__DeliveryObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4993:1: ( rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 )
            // InternalPactDSL.g:4994:2: rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__DeliveryObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1__Impl"
    // InternalPactDSL.g:5001:1: rule__DeliveryObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__DeliveryObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5005:1: ( ( 'date' ) )
            // InternalPactDSL.g:5006:1: ( 'date' )
            {
            // InternalPactDSL.g:5006:1: ( 'date' )
            // InternalPactDSL.g:5007:2: 'date'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2"
    // InternalPactDSL.g:5016:1: rule__DeliveryObligation__Group_7__2 : rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 ;
    public final void rule__DeliveryObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5020:1: ( rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 )
            // InternalPactDSL.g:5021:2: rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__DeliveryObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2__Impl"
    // InternalPactDSL.g:5028:1: rule__DeliveryObligation__Group_7__2__Impl : ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) ;
    public final void rule__DeliveryObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5032:1: ( ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:5033:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:5033:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:5034:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:5035:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:5035:3: rule__DeliveryObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3"
    // InternalPactDSL.g:5043:1: rule__DeliveryObligation__Group_7__3 : rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 ;
    public final void rule__DeliveryObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5047:1: ( rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 )
            // InternalPactDSL.g:5048:2: rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__DeliveryObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3__Impl"
    // InternalPactDSL.g:5055:1: rule__DeliveryObligation__Group_7__3__Impl : ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__DeliveryObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5059:1: ( ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:5060:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:5060:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:5061:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:5062:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:5062:3: rule__DeliveryObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4"
    // InternalPactDSL.g:5070:1: rule__DeliveryObligation__Group_7__4 : rule__DeliveryObligation__Group_7__4__Impl ;
    public final void rule__DeliveryObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5074:1: ( rule__DeliveryObligation__Group_7__4__Impl )
            // InternalPactDSL.g:5075:2: rule__DeliveryObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4__Impl"
    // InternalPactDSL.g:5081:1: rule__DeliveryObligation__Group_7__4__Impl : ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) ;
    public final void rule__DeliveryObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5085:1: ( ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:5086:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:5086:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:5087:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:5088:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:5088:3: rule__DeliveryObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__0"
    // InternalPactDSL.g:5097:1: rule__TransferObligation__Group__0 : rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 ;
    public final void rule__TransferObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5101:1: ( rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 )
            // InternalPactDSL.g:5102:2: rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TransferObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0"


    // $ANTLR start "rule__TransferObligation__Group__0__Impl"
    // InternalPactDSL.g:5109:1: rule__TransferObligation__Group__0__Impl : ( 'TransferObligation:' ) ;
    public final void rule__TransferObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5113:1: ( ( 'TransferObligation:' ) )
            // InternalPactDSL.g:5114:1: ( 'TransferObligation:' )
            {
            // InternalPactDSL.g:5114:1: ( 'TransferObligation:' )
            // InternalPactDSL.g:5115:2: 'TransferObligation:'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group__1"
    // InternalPactDSL.g:5124:1: rule__TransferObligation__Group__1 : rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 ;
    public final void rule__TransferObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5128:1: ( rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 )
            // InternalPactDSL.g:5129:2: rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TransferObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1"


    // $ANTLR start "rule__TransferObligation__Group__1__Impl"
    // InternalPactDSL.g:5136:1: rule__TransferObligation__Group__1__Impl : ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__TransferObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5140:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5141:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5141:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5142:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5143:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5143:3: rule__TransferObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group__2"
    // InternalPactDSL.g:5151:1: rule__TransferObligation__Group__2 : rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 ;
    public final void rule__TransferObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5155:1: ( rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 )
            // InternalPactDSL.g:5156:2: rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__TransferObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2"


    // $ANTLR start "rule__TransferObligation__Group__2__Impl"
    // InternalPactDSL.g:5163:1: rule__TransferObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__TransferObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5167:1: ( ( 'must' ) )
            // InternalPactDSL.g:5168:1: ( 'must' )
            {
            // InternalPactDSL.g:5168:1: ( 'must' )
            // InternalPactDSL.g:5169:2: 'must'
            {
             before(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group__3"
    // InternalPactDSL.g:5178:1: rule__TransferObligation__Group__3 : rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 ;
    public final void rule__TransferObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5182:1: ( rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 )
            // InternalPactDSL.g:5183:2: rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TransferObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3"


    // $ANTLR start "rule__TransferObligation__Group__3__Impl"
    // InternalPactDSL.g:5190:1: rule__TransferObligation__Group__3__Impl : ( 'transfer' ) ;
    public final void rule__TransferObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5194:1: ( ( 'transfer' ) )
            // InternalPactDSL.g:5195:1: ( 'transfer' )
            {
            // InternalPactDSL.g:5195:1: ( 'transfer' )
            // InternalPactDSL.g:5196:2: 'transfer'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group__4"
    // InternalPactDSL.g:5205:1: rule__TransferObligation__Group__4 : rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 ;
    public final void rule__TransferObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5209:1: ( rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 )
            // InternalPactDSL.g:5210:2: rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__TransferObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__4"


    // $ANTLR start "rule__TransferObligation__Group__4__Impl"
    // InternalPactDSL.g:5217:1: rule__TransferObligation__Group__4__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__TransferObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5221:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:5222:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:5222:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:5223:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:5223:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:5224:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5225:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:5225:4: rule__TransferObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:5228:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:5229:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5230:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPactDSL.g:5230:4: rule__TransferObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__5"
    // InternalPactDSL.g:5239:1: rule__TransferObligation__Group__5 : rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 ;
    public final void rule__TransferObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5243:1: ( rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 )
            // InternalPactDSL.g:5244:2: rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__TransferObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5"


    // $ANTLR start "rule__TransferObligation__Group__5__Impl"
    // InternalPactDSL.g:5251:1: rule__TransferObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__TransferObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5255:1: ( ( 'to' ) )
            // InternalPactDSL.g:5256:1: ( 'to' )
            {
            // InternalPactDSL.g:5256:1: ( 'to' )
            // InternalPactDSL.g:5257:2: 'to'
            {
             before(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5__Impl"


    // $ANTLR start "rule__TransferObligation__Group__6"
    // InternalPactDSL.g:5266:1: rule__TransferObligation__Group__6 : rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 ;
    public final void rule__TransferObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5270:1: ( rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 )
            // InternalPactDSL.g:5271:2: rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__TransferObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__6"


    // $ANTLR start "rule__TransferObligation__Group__6__Impl"
    // InternalPactDSL.g:5278:1: rule__TransferObligation__Group__6__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__TransferObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5282:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:5283:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:5283:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:5284:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:5284:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:5285:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5286:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:5286:4: rule__TransferObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:5289:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:5290:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5291:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPactDSL.g:5291:4: rule__TransferObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__6__Impl"


    // $ANTLR start "rule__TransferObligation__Group__7"
    // InternalPactDSL.g:5300:1: rule__TransferObligation__Group__7 : rule__TransferObligation__Group__7__Impl ;
    public final void rule__TransferObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5304:1: ( rule__TransferObligation__Group__7__Impl )
            // InternalPactDSL.g:5305:2: rule__TransferObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7"


    // $ANTLR start "rule__TransferObligation__Group__7__Impl"
    // InternalPactDSL.g:5311:1: rule__TransferObligation__Group__7__Impl : ( ( rule__TransferObligation__Group_7__0 )? ) ;
    public final void rule__TransferObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5315:1: ( ( ( rule__TransferObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:5316:1: ( ( rule__TransferObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:5316:1: ( ( rule__TransferObligation__Group_7__0 )? )
            // InternalPactDSL.g:5317:2: ( rule__TransferObligation__Group_7__0 )?
            {
             before(grammarAccess.getTransferObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:5318:2: ( rule__TransferObligation__Group_7__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==51) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPactDSL.g:5318:3: rule__TransferObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransferObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransferObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__0"
    // InternalPactDSL.g:5327:1: rule__TransferObligation__Group_7__0 : rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 ;
    public final void rule__TransferObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5331:1: ( rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 )
            // InternalPactDSL.g:5332:2: rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__TransferObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0"


    // $ANTLR start "rule__TransferObligation__Group_7__0__Impl"
    // InternalPactDSL.g:5339:1: rule__TransferObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__TransferObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5343:1: ( ( 'by' ) )
            // InternalPactDSL.g:5344:1: ( 'by' )
            {
            // InternalPactDSL.g:5344:1: ( 'by' )
            // InternalPactDSL.g:5345:2: 'by'
            {
             before(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__1"
    // InternalPactDSL.g:5354:1: rule__TransferObligation__Group_7__1 : rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 ;
    public final void rule__TransferObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5358:1: ( rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 )
            // InternalPactDSL.g:5359:2: rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__TransferObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1"


    // $ANTLR start "rule__TransferObligation__Group_7__1__Impl"
    // InternalPactDSL.g:5366:1: rule__TransferObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__TransferObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5370:1: ( ( 'date' ) )
            // InternalPactDSL.g:5371:1: ( 'date' )
            {
            // InternalPactDSL.g:5371:1: ( 'date' )
            // InternalPactDSL.g:5372:2: 'date'
            {
             before(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__2"
    // InternalPactDSL.g:5381:1: rule__TransferObligation__Group_7__2 : rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 ;
    public final void rule__TransferObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5385:1: ( rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 )
            // InternalPactDSL.g:5386:2: rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__TransferObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2"


    // $ANTLR start "rule__TransferObligation__Group_7__2__Impl"
    // InternalPactDSL.g:5393:1: rule__TransferObligation__Group_7__2__Impl : ( ( rule__TransferObligation__DayAssignment_7_2 ) ) ;
    public final void rule__TransferObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5397:1: ( ( ( rule__TransferObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:5398:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:5398:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:5399:2: ( rule__TransferObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:5400:2: ( rule__TransferObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:5400:3: rule__TransferObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__3"
    // InternalPactDSL.g:5408:1: rule__TransferObligation__Group_7__3 : rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 ;
    public final void rule__TransferObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5412:1: ( rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 )
            // InternalPactDSL.g:5413:2: rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__TransferObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3"


    // $ANTLR start "rule__TransferObligation__Group_7__3__Impl"
    // InternalPactDSL.g:5420:1: rule__TransferObligation__Group_7__3__Impl : ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__TransferObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5424:1: ( ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:5425:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:5425:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:5426:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:5427:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:5427:3: rule__TransferObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__4"
    // InternalPactDSL.g:5435:1: rule__TransferObligation__Group_7__4 : rule__TransferObligation__Group_7__4__Impl ;
    public final void rule__TransferObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5439:1: ( rule__TransferObligation__Group_7__4__Impl )
            // InternalPactDSL.g:5440:2: rule__TransferObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4"


    // $ANTLR start "rule__TransferObligation__Group_7__4__Impl"
    // InternalPactDSL.g:5446:1: rule__TransferObligation__Group_7__4__Impl : ( ( rule__TransferObligation__YearAssignment_7_4 ) ) ;
    public final void rule__TransferObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5450:1: ( ( ( rule__TransferObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:5451:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:5451:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:5452:2: ( rule__TransferObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:5453:2: ( rule__TransferObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:5453:3: rule__TransferObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__0"
    // InternalPactDSL.g:5462:1: rule__LicenceObligation__Group__0 : rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 ;
    public final void rule__LicenceObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5466:1: ( rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 )
            // InternalPactDSL.g:5467:2: rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LicenceObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0"


    // $ANTLR start "rule__LicenceObligation__Group__0__Impl"
    // InternalPactDSL.g:5474:1: rule__LicenceObligation__Group__0__Impl : ( 'LicenceObligation:' ) ;
    public final void rule__LicenceObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5478:1: ( ( 'LicenceObligation:' ) )
            // InternalPactDSL.g:5479:1: ( 'LicenceObligation:' )
            {
            // InternalPactDSL.g:5479:1: ( 'LicenceObligation:' )
            // InternalPactDSL.g:5480:2: 'LicenceObligation:'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__1"
    // InternalPactDSL.g:5489:1: rule__LicenceObligation__Group__1 : rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 ;
    public final void rule__LicenceObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5493:1: ( rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 )
            // InternalPactDSL.g:5494:2: rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__LicenceObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1"


    // $ANTLR start "rule__LicenceObligation__Group__1__Impl"
    // InternalPactDSL.g:5501:1: rule__LicenceObligation__Group__1__Impl : ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__LicenceObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5505:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5506:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5506:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5507:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5508:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5508:3: rule__LicenceObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__2"
    // InternalPactDSL.g:5516:1: rule__LicenceObligation__Group__2 : rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 ;
    public final void rule__LicenceObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5520:1: ( rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 )
            // InternalPactDSL.g:5521:2: rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__LicenceObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2"


    // $ANTLR start "rule__LicenceObligation__Group__2__Impl"
    // InternalPactDSL.g:5528:1: rule__LicenceObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__LicenceObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5532:1: ( ( 'must' ) )
            // InternalPactDSL.g:5533:1: ( 'must' )
            {
            // InternalPactDSL.g:5533:1: ( 'must' )
            // InternalPactDSL.g:5534:2: 'must'
            {
             before(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__3"
    // InternalPactDSL.g:5543:1: rule__LicenceObligation__Group__3 : rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 ;
    public final void rule__LicenceObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5547:1: ( rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 )
            // InternalPactDSL.g:5548:2: rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__LicenceObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3"


    // $ANTLR start "rule__LicenceObligation__Group__3__Impl"
    // InternalPactDSL.g:5555:1: rule__LicenceObligation__Group__3__Impl : ( 'grant' ) ;
    public final void rule__LicenceObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5559:1: ( ( 'grant' ) )
            // InternalPactDSL.g:5560:1: ( 'grant' )
            {
            // InternalPactDSL.g:5560:1: ( 'grant' )
            // InternalPactDSL.g:5561:2: 'grant'
            {
             before(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__4"
    // InternalPactDSL.g:5570:1: rule__LicenceObligation__Group__4 : rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 ;
    public final void rule__LicenceObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5574:1: ( rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 )
            // InternalPactDSL.g:5575:2: rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__LicenceObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4"


    // $ANTLR start "rule__LicenceObligation__Group__4__Impl"
    // InternalPactDSL.g:5582:1: rule__LicenceObligation__Group__4__Impl : ( 'Licence' ) ;
    public final void rule__LicenceObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5586:1: ( ( 'Licence' ) )
            // InternalPactDSL.g:5587:1: ( 'Licence' )
            {
            // InternalPactDSL.g:5587:1: ( 'Licence' )
            // InternalPactDSL.g:5588:2: 'Licence'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__5"
    // InternalPactDSL.g:5597:1: rule__LicenceObligation__Group__5 : rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 ;
    public final void rule__LicenceObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5601:1: ( rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 )
            // InternalPactDSL.g:5602:2: rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__LicenceObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5"


    // $ANTLR start "rule__LicenceObligation__Group__5__Impl"
    // InternalPactDSL.g:5609:1: rule__LicenceObligation__Group__5__Impl : ( 'in' ) ;
    public final void rule__LicenceObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5613:1: ( ( 'in' ) )
            // InternalPactDSL.g:5614:1: ( 'in' )
            {
            // InternalPactDSL.g:5614:1: ( 'in' )
            // InternalPactDSL.g:5615:2: 'in'
            {
             before(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__6"
    // InternalPactDSL.g:5624:1: rule__LicenceObligation__Group__6 : rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 ;
    public final void rule__LicenceObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5628:1: ( rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 )
            // InternalPactDSL.g:5629:2: rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__LicenceObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__6"


    // $ANTLR start "rule__LicenceObligation__Group__6__Impl"
    // InternalPactDSL.g:5636:1: rule__LicenceObligation__Group__6__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__LicenceObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5640:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:5641:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:5641:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:5642:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:5642:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:5643:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5644:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:5644:4: rule__LicenceObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:5647:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:5648:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5649:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPactDSL.g:5649:4: rule__LicenceObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__6__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__7"
    // InternalPactDSL.g:5658:1: rule__LicenceObligation__Group__7 : rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 ;
    public final void rule__LicenceObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5662:1: ( rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 )
            // InternalPactDSL.g:5663:2: rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__LicenceObligation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7"


    // $ANTLR start "rule__LicenceObligation__Group__7__Impl"
    // InternalPactDSL.g:5670:1: rule__LicenceObligation__Group__7__Impl : ( 'to' ) ;
    public final void rule__LicenceObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5674:1: ( ( 'to' ) )
            // InternalPactDSL.g:5675:1: ( 'to' )
            {
            // InternalPactDSL.g:5675:1: ( 'to' )
            // InternalPactDSL.g:5676:2: 'to'
            {
             before(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__8"
    // InternalPactDSL.g:5685:1: rule__LicenceObligation__Group__8 : rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 ;
    public final void rule__LicenceObligation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5689:1: ( rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 )
            // InternalPactDSL.g:5690:2: rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__LicenceObligation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__8"


    // $ANTLR start "rule__LicenceObligation__Group__8__Impl"
    // InternalPactDSL.g:5697:1: rule__LicenceObligation__Group__8__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) ;
    public final void rule__LicenceObligation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5701:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) )
            // InternalPactDSL.g:5702:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            {
            // InternalPactDSL.g:5702:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            // InternalPactDSL.g:5703:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            {
            // InternalPactDSL.g:5703:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) )
            // InternalPactDSL.g:5704:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5705:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            // InternalPactDSL.g:5705:4: rule__LicenceObligation__SuperTypeAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }

            // InternalPactDSL.g:5708:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            // InternalPactDSL.g:5709:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5710:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPactDSL.g:5710:4: rule__LicenceObligation__SuperTypeAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__8__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__9"
    // InternalPactDSL.g:5719:1: rule__LicenceObligation__Group__9 : rule__LicenceObligation__Group__9__Impl ;
    public final void rule__LicenceObligation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5723:1: ( rule__LicenceObligation__Group__9__Impl )
            // InternalPactDSL.g:5724:2: rule__LicenceObligation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9"


    // $ANTLR start "rule__LicenceObligation__Group__9__Impl"
    // InternalPactDSL.g:5730:1: rule__LicenceObligation__Group__9__Impl : ( ( rule__LicenceObligation__Group_9__0 )* ) ;
    public final void rule__LicenceObligation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5734:1: ( ( ( rule__LicenceObligation__Group_9__0 )* ) )
            // InternalPactDSL.g:5735:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            {
            // InternalPactDSL.g:5735:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            // InternalPactDSL.g:5736:2: ( rule__LicenceObligation__Group_9__0 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup_9()); 
            // InternalPactDSL.g:5737:2: ( rule__LicenceObligation__Group_9__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==51) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPactDSL.g:5737:3: rule__LicenceObligation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__LicenceObligation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__0"
    // InternalPactDSL.g:5746:1: rule__LicenceObligation__Group_9__0 : rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 ;
    public final void rule__LicenceObligation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5750:1: ( rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 )
            // InternalPactDSL.g:5751:2: rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1
            {
            pushFollow(FOLLOW_36);
            rule__LicenceObligation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0"


    // $ANTLR start "rule__LicenceObligation__Group_9__0__Impl"
    // InternalPactDSL.g:5758:1: rule__LicenceObligation__Group_9__0__Impl : ( 'by' ) ;
    public final void rule__LicenceObligation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5762:1: ( ( 'by' ) )
            // InternalPactDSL.g:5763:1: ( 'by' )
            {
            // InternalPactDSL.g:5763:1: ( 'by' )
            // InternalPactDSL.g:5764:2: 'by'
            {
             before(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__1"
    // InternalPactDSL.g:5773:1: rule__LicenceObligation__Group_9__1 : rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 ;
    public final void rule__LicenceObligation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5777:1: ( rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 )
            // InternalPactDSL.g:5778:2: rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2
            {
            pushFollow(FOLLOW_20);
            rule__LicenceObligation__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1"


    // $ANTLR start "rule__LicenceObligation__Group_9__1__Impl"
    // InternalPactDSL.g:5785:1: rule__LicenceObligation__Group_9__1__Impl : ( 'date' ) ;
    public final void rule__LicenceObligation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5789:1: ( ( 'date' ) )
            // InternalPactDSL.g:5790:1: ( 'date' )
            {
            // InternalPactDSL.g:5790:1: ( 'date' )
            // InternalPactDSL.g:5791:2: 'date'
            {
             before(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__2"
    // InternalPactDSL.g:5800:1: rule__LicenceObligation__Group_9__2 : rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 ;
    public final void rule__LicenceObligation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5804:1: ( rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 )
            // InternalPactDSL.g:5805:2: rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3
            {
            pushFollow(FOLLOW_20);
            rule__LicenceObligation__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2"


    // $ANTLR start "rule__LicenceObligation__Group_9__2__Impl"
    // InternalPactDSL.g:5812:1: rule__LicenceObligation__Group_9__2__Impl : ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) ;
    public final void rule__LicenceObligation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5816:1: ( ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) )
            // InternalPactDSL.g:5817:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            {
            // InternalPactDSL.g:5817:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            // InternalPactDSL.g:5818:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            {
             before(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 
            // InternalPactDSL.g:5819:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            // InternalPactDSL.g:5819:3: rule__LicenceObligation__DayAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__DayAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__3"
    // InternalPactDSL.g:5827:1: rule__LicenceObligation__Group_9__3 : rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 ;
    public final void rule__LicenceObligation__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5831:1: ( rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 )
            // InternalPactDSL.g:5832:2: rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4
            {
            pushFollow(FOLLOW_20);
            rule__LicenceObligation__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3"


    // $ANTLR start "rule__LicenceObligation__Group_9__3__Impl"
    // InternalPactDSL.g:5839:1: rule__LicenceObligation__Group_9__3__Impl : ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) ;
    public final void rule__LicenceObligation__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5843:1: ( ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) )
            // InternalPactDSL.g:5844:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            {
            // InternalPactDSL.g:5844:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            // InternalPactDSL.g:5845:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 
            // InternalPactDSL.g:5846:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            // InternalPactDSL.g:5846:3: rule__LicenceObligation__MonthAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__MonthAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__4"
    // InternalPactDSL.g:5854:1: rule__LicenceObligation__Group_9__4 : rule__LicenceObligation__Group_9__4__Impl ;
    public final void rule__LicenceObligation__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5858:1: ( rule__LicenceObligation__Group_9__4__Impl )
            // InternalPactDSL.g:5859:2: rule__LicenceObligation__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4"


    // $ANTLR start "rule__LicenceObligation__Group_9__4__Impl"
    // InternalPactDSL.g:5865:1: rule__LicenceObligation__Group_9__4__Impl : ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) ;
    public final void rule__LicenceObligation__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5869:1: ( ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) )
            // InternalPactDSL.g:5870:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            {
            // InternalPactDSL.g:5870:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            // InternalPactDSL.g:5871:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            {
             before(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 
            // InternalPactDSL.g:5872:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            // InternalPactDSL.g:5872:3: rule__LicenceObligation__YearAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__YearAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__0"
    // InternalPactDSL.g:5881:1: rule__ConstraintParty__Group__0 : rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 ;
    public final void rule__ConstraintParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5885:1: ( rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 )
            // InternalPactDSL.g:5886:2: rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0"


    // $ANTLR start "rule__ConstraintParty__Group__0__Impl"
    // InternalPactDSL.g:5893:1: rule__ConstraintParty__Group__0__Impl : ( 'ConstraintParty:' ) ;
    public final void rule__ConstraintParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5897:1: ( ( 'ConstraintParty:' ) )
            // InternalPactDSL.g:5898:1: ( 'ConstraintParty:' )
            {
            // InternalPactDSL.g:5898:1: ( 'ConstraintParty:' )
            // InternalPactDSL.g:5899:2: 'ConstraintParty:'
            {
             before(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__1"
    // InternalPactDSL.g:5908:1: rule__ConstraintParty__Group__1 : rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 ;
    public final void rule__ConstraintParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5912:1: ( rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 )
            // InternalPactDSL.g:5913:2: rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1"


    // $ANTLR start "rule__ConstraintParty__Group__1__Impl"
    // InternalPactDSL.g:5920:1: rule__ConstraintParty__Group__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5924:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5925:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5925:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5926:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5927:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5927:3: rule__ConstraintParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__2"
    // InternalPactDSL.g:5935:1: rule__ConstraintParty__Group__2 : rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 ;
    public final void rule__ConstraintParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5939:1: ( rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 )
            // InternalPactDSL.g:5940:2: rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2"


    // $ANTLR start "rule__ConstraintParty__Group__2__Impl"
    // InternalPactDSL.g:5947:1: rule__ConstraintParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5951:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5952:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5952:1: ( 'mustNot' )
            // InternalPactDSL.g:5953:2: 'mustNot'
            {
             before(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__3"
    // InternalPactDSL.g:5962:1: rule__ConstraintParty__Group__3 : rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 ;
    public final void rule__ConstraintParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5966:1: ( rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 )
            // InternalPactDSL.g:5967:2: rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3"


    // $ANTLR start "rule__ConstraintParty__Group__3__Impl"
    // InternalPactDSL.g:5974:1: rule__ConstraintParty__Group__3__Impl : ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5978:1: ( ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5979:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5979:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5980:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5981:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5981:3: rule__ConstraintParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__4"
    // InternalPactDSL.g:5989:1: rule__ConstraintParty__Group__4 : rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 ;
    public final void rule__ConstraintParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5993:1: ( rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 )
            // InternalPactDSL.g:5994:2: rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4"


    // $ANTLR start "rule__ConstraintParty__Group__4__Impl"
    // InternalPactDSL.g:6001:1: rule__ConstraintParty__Group__4__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6005:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:6006:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:6006:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:6007:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:6008:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPactDSL.g:6008:3: rule__ConstraintParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__5"
    // InternalPactDSL.g:6016:1: rule__ConstraintParty__Group__5 : rule__ConstraintParty__Group__5__Impl ;
    public final void rule__ConstraintParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6020:1: ( rule__ConstraintParty__Group__5__Impl )
            // InternalPactDSL.g:6021:2: rule__ConstraintParty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5"


    // $ANTLR start "rule__ConstraintParty__Group__5__Impl"
    // InternalPactDSL.g:6027:1: rule__ConstraintParty__Group__5__Impl : ( ( rule__ConstraintParty__Group_5__0 )? ) ;
    public final void rule__ConstraintParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6031:1: ( ( ( rule__ConstraintParty__Group_5__0 )? ) )
            // InternalPactDSL.g:6032:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            {
            // InternalPactDSL.g:6032:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            // InternalPactDSL.g:6033:2: ( rule__ConstraintParty__Group_5__0 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup_5()); 
            // InternalPactDSL.g:6034:2: ( rule__ConstraintParty__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==39) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPactDSL.g:6034:3: rule__ConstraintParty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__0"
    // InternalPactDSL.g:6043:1: rule__ConstraintParty__Group_5__0 : rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 ;
    public final void rule__ConstraintParty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6047:1: ( rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 )
            // InternalPactDSL.g:6048:2: rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintParty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0"


    // $ANTLR start "rule__ConstraintParty__Group_5__0__Impl"
    // InternalPactDSL.g:6055:1: rule__ConstraintParty__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintParty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6059:1: ( ( 'to' ) )
            // InternalPactDSL.g:6060:1: ( 'to' )
            {
            // InternalPactDSL.g:6060:1: ( 'to' )
            // InternalPactDSL.g:6061:2: 'to'
            {
             before(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__1"
    // InternalPactDSL.g:6070:1: rule__ConstraintParty__Group_5__1 : rule__ConstraintParty__Group_5__1__Impl ;
    public final void rule__ConstraintParty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6074:1: ( rule__ConstraintParty__Group_5__1__Impl )
            // InternalPactDSL.g:6075:2: rule__ConstraintParty__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1"


    // $ANTLR start "rule__ConstraintParty__Group_5__1__Impl"
    // InternalPactDSL.g:6081:1: rule__ConstraintParty__Group_5__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__ConstraintParty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6085:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:6086:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:6086:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:6087:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:6088:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:6088:3: rule__ConstraintParty__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0"
    // InternalPactDSL.g:6097:1: rule__ConstraintThirdParty__Group__0 : rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 ;
    public final void rule__ConstraintThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6101:1: ( rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 )
            // InternalPactDSL.g:6102:2: rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0__Impl"
    // InternalPactDSL.g:6109:1: rule__ConstraintThirdParty__Group__0__Impl : ( 'ConstraintThirdParty:' ) ;
    public final void rule__ConstraintThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6113:1: ( ( 'ConstraintThirdParty:' ) )
            // InternalPactDSL.g:6114:1: ( 'ConstraintThirdParty:' )
            {
            // InternalPactDSL.g:6114:1: ( 'ConstraintThirdParty:' )
            // InternalPactDSL.g:6115:2: 'ConstraintThirdParty:'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1"
    // InternalPactDSL.g:6124:1: rule__ConstraintThirdParty__Group__1 : rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 ;
    public final void rule__ConstraintThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6128:1: ( rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 )
            // InternalPactDSL.g:6129:2: rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1__Impl"
    // InternalPactDSL.g:6136:1: rule__ConstraintThirdParty__Group__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6140:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6141:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6141:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6142:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6143:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6143:3: rule__ConstraintThirdParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2"
    // InternalPactDSL.g:6151:1: rule__ConstraintThirdParty__Group__2 : rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 ;
    public final void rule__ConstraintThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6155:1: ( rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 )
            // InternalPactDSL.g:6156:2: rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2__Impl"
    // InternalPactDSL.g:6163:1: rule__ConstraintThirdParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6167:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:6168:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:6168:1: ( 'mustNot' )
            // InternalPactDSL.g:6169:2: 'mustNot'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3"
    // InternalPactDSL.g:6178:1: rule__ConstraintThirdParty__Group__3 : rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 ;
    public final void rule__ConstraintThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6182:1: ( rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 )
            // InternalPactDSL.g:6183:2: rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3__Impl"
    // InternalPactDSL.g:6190:1: rule__ConstraintThirdParty__Group__3__Impl : ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6194:1: ( ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:6195:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:6195:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:6196:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:6197:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:6197:3: rule__ConstraintThirdParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4"
    // InternalPactDSL.g:6205:1: rule__ConstraintThirdParty__Group__4 : rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 ;
    public final void rule__ConstraintThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6209:1: ( rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 )
            // InternalPactDSL.g:6210:2: rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4__Impl"
    // InternalPactDSL.g:6217:1: rule__ConstraintThirdParty__Group__4__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6221:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:6222:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:6222:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:6223:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:6224:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPactDSL.g:6224:3: rule__ConstraintThirdParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5"
    // InternalPactDSL.g:6232:1: rule__ConstraintThirdParty__Group__5 : rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 ;
    public final void rule__ConstraintThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6236:1: ( rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 )
            // InternalPactDSL.g:6237:2: rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5__Impl"
    // InternalPactDSL.g:6244:1: rule__ConstraintThirdParty__Group__5__Impl : ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) ;
    public final void rule__ConstraintThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6248:1: ( ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) )
            // InternalPactDSL.g:6249:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            {
            // InternalPactDSL.g:6249:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            // InternalPactDSL.g:6250:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 
            // InternalPactDSL.g:6251:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalPactDSL.g:6251:3: rule__ConstraintThirdParty__AdditionalInfoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__AdditionalInfoAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6"
    // InternalPactDSL.g:6259:1: rule__ConstraintThirdParty__Group__6 : rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 ;
    public final void rule__ConstraintThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6263:1: ( rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 )
            // InternalPactDSL.g:6264:2: rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6__Impl"
    // InternalPactDSL.g:6271:1: rule__ConstraintThirdParty__Group__6__Impl : ( ( rule__ConstraintThirdParty__Group_6__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6275:1: ( ( ( rule__ConstraintThirdParty__Group_6__0 )? ) )
            // InternalPactDSL.g:6276:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            {
            // InternalPactDSL.g:6276:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            // InternalPactDSL.g:6277:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 
            // InternalPactDSL.g:6278:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPactDSL.g:6278:3: rule__ConstraintThirdParty__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7"
    // InternalPactDSL.g:6286:1: rule__ConstraintThirdParty__Group__7 : rule__ConstraintThirdParty__Group__7__Impl ;
    public final void rule__ConstraintThirdParty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6290:1: ( rule__ConstraintThirdParty__Group__7__Impl )
            // InternalPactDSL.g:6291:2: rule__ConstraintThirdParty__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7__Impl"
    // InternalPactDSL.g:6297:1: rule__ConstraintThirdParty__Group__7__Impl : ( ( rule__ConstraintThirdParty__Group_7__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6301:1: ( ( ( rule__ConstraintThirdParty__Group_7__0 )? ) )
            // InternalPactDSL.g:6302:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            {
            // InternalPactDSL.g:6302:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            // InternalPactDSL.g:6303:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 
            // InternalPactDSL.g:6304:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==63) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalPactDSL.g:6304:3: rule__ConstraintThirdParty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0"
    // InternalPactDSL.g:6313:1: rule__ConstraintThirdParty__Group_6__0 : rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 ;
    public final void rule__ConstraintThirdParty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6317:1: ( rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 )
            // InternalPactDSL.g:6318:2: rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintThirdParty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0__Impl"
    // InternalPactDSL.g:6325:1: rule__ConstraintThirdParty__Group_6__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintThirdParty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6329:1: ( ( 'to' ) )
            // InternalPactDSL.g:6330:1: ( 'to' )
            {
            // InternalPactDSL.g:6330:1: ( 'to' )
            // InternalPactDSL.g:6331:2: 'to'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1"
    // InternalPactDSL.g:6340:1: rule__ConstraintThirdParty__Group_6__1 : rule__ConstraintThirdParty__Group_6__1__Impl ;
    public final void rule__ConstraintThirdParty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6344:1: ( rule__ConstraintThirdParty__Group_6__1__Impl )
            // InternalPactDSL.g:6345:2: rule__ConstraintThirdParty__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1__Impl"
    // InternalPactDSL.g:6351:1: rule__ConstraintThirdParty__Group_6__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6355:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) )
            // InternalPactDSL.g:6356:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            {
            // InternalPactDSL.g:6356:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            // InternalPactDSL.g:6357:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 
            // InternalPactDSL.g:6358:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            // InternalPactDSL.g:6358:3: rule__ConstraintThirdParty__SuperTypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0"
    // InternalPactDSL.g:6367:1: rule__ConstraintThirdParty__Group_7__0 : rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 ;
    public final void rule__ConstraintThirdParty__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6371:1: ( rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 )
            // InternalPactDSL.g:6372:2: rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1
            {
            pushFollow(FOLLOW_46);
            rule__ConstraintThirdParty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0__Impl"
    // InternalPactDSL.g:6379:1: rule__ConstraintThirdParty__Group_7__0__Impl : ( 'unless' ) ;
    public final void rule__ConstraintThirdParty__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6383:1: ( ( 'unless' ) )
            // InternalPactDSL.g:6384:1: ( 'unless' )
            {
            // InternalPactDSL.g:6384:1: ( 'unless' )
            // InternalPactDSL.g:6385:2: 'unless'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1"
    // InternalPactDSL.g:6394:1: rule__ConstraintThirdParty__Group_7__1 : rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 ;
    public final void rule__ConstraintThirdParty__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6398:1: ( rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 )
            // InternalPactDSL.g:6399:2: rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2
            {
            pushFollow(FOLLOW_47);
            rule__ConstraintThirdParty__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1__Impl"
    // InternalPactDSL.g:6406:1: rule__ConstraintThirdParty__Group_7__1__Impl : ( 'withWrittenConsent' ) ;
    public final void rule__ConstraintThirdParty__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6410:1: ( ( 'withWrittenConsent' ) )
            // InternalPactDSL.g:6411:1: ( 'withWrittenConsent' )
            {
            // InternalPactDSL.g:6411:1: ( 'withWrittenConsent' )
            // InternalPactDSL.g:6412:2: 'withWrittenConsent'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2"
    // InternalPactDSL.g:6421:1: rule__ConstraintThirdParty__Group_7__2 : rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 ;
    public final void rule__ConstraintThirdParty__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6425:1: ( rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 )
            // InternalPactDSL.g:6426:2: rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3
            {
            pushFollow(FOLLOW_22);
            rule__ConstraintThirdParty__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2__Impl"
    // InternalPactDSL.g:6433:1: rule__ConstraintThirdParty__Group_7__2__Impl : ( 'of' ) ;
    public final void rule__ConstraintThirdParty__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6437:1: ( ( 'of' ) )
            // InternalPactDSL.g:6438:1: ( 'of' )
            {
            // InternalPactDSL.g:6438:1: ( 'of' )
            // InternalPactDSL.g:6439:2: 'of'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3"
    // InternalPactDSL.g:6448:1: rule__ConstraintThirdParty__Group_7__3 : rule__ConstraintThirdParty__Group_7__3__Impl ;
    public final void rule__ConstraintThirdParty__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6452:1: ( rule__ConstraintThirdParty__Group_7__3__Impl )
            // InternalPactDSL.g:6453:2: rule__ConstraintThirdParty__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3__Impl"
    // InternalPactDSL.g:6459:1: rule__ConstraintThirdParty__Group_7__3__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6463:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) )
            // InternalPactDSL.g:6464:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            {
            // InternalPactDSL.g:6464:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            // InternalPactDSL.g:6465:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 
            // InternalPactDSL.g:6466:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            // InternalPactDSL.g:6466:3: rule__ConstraintThirdParty__SuperTypeAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3__Impl"


    // $ANTLR start "rule__CustomObligation__Group__0"
    // InternalPactDSL.g:6475:1: rule__CustomObligation__Group__0 : rule__CustomObligation__Group__0__Impl rule__CustomObligation__Group__1 ;
    public final void rule__CustomObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6479:1: ( rule__CustomObligation__Group__0__Impl rule__CustomObligation__Group__1 )
            // InternalPactDSL.g:6480:2: rule__CustomObligation__Group__0__Impl rule__CustomObligation__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CustomObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__0"


    // $ANTLR start "rule__CustomObligation__Group__0__Impl"
    // InternalPactDSL.g:6487:1: rule__CustomObligation__Group__0__Impl : ( 'CustomObligation:' ) ;
    public final void rule__CustomObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6491:1: ( ( 'CustomObligation:' ) )
            // InternalPactDSL.g:6492:1: ( 'CustomObligation:' )
            {
            // InternalPactDSL.g:6492:1: ( 'CustomObligation:' )
            // InternalPactDSL.g:6493:2: 'CustomObligation:'
            {
             before(grammarAccess.getCustomObligationAccess().getCustomObligationKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getCustomObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__0__Impl"


    // $ANTLR start "rule__CustomObligation__Group__1"
    // InternalPactDSL.g:6502:1: rule__CustomObligation__Group__1 : rule__CustomObligation__Group__1__Impl rule__CustomObligation__Group__2 ;
    public final void rule__CustomObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6506:1: ( rule__CustomObligation__Group__1__Impl rule__CustomObligation__Group__2 )
            // InternalPactDSL.g:6507:2: rule__CustomObligation__Group__1__Impl rule__CustomObligation__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__CustomObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__1"


    // $ANTLR start "rule__CustomObligation__Group__1__Impl"
    // InternalPactDSL.g:6514:1: rule__CustomObligation__Group__1__Impl : ( ( rule__CustomObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__CustomObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6518:1: ( ( ( rule__CustomObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6519:1: ( ( rule__CustomObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6519:1: ( ( rule__CustomObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6520:2: ( rule__CustomObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6521:2: ( rule__CustomObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6521:3: rule__CustomObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__1__Impl"


    // $ANTLR start "rule__CustomObligation__Group__2"
    // InternalPactDSL.g:6529:1: rule__CustomObligation__Group__2 : rule__CustomObligation__Group__2__Impl rule__CustomObligation__Group__3 ;
    public final void rule__CustomObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6533:1: ( rule__CustomObligation__Group__2__Impl rule__CustomObligation__Group__3 )
            // InternalPactDSL.g:6534:2: rule__CustomObligation__Group__2__Impl rule__CustomObligation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__CustomObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__2"


    // $ANTLR start "rule__CustomObligation__Group__2__Impl"
    // InternalPactDSL.g:6541:1: rule__CustomObligation__Group__2__Impl : ( ( rule__CustomObligation__Alternatives_2 ) ) ;
    public final void rule__CustomObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6545:1: ( ( ( rule__CustomObligation__Alternatives_2 ) ) )
            // InternalPactDSL.g:6546:1: ( ( rule__CustomObligation__Alternatives_2 ) )
            {
            // InternalPactDSL.g:6546:1: ( ( rule__CustomObligation__Alternatives_2 ) )
            // InternalPactDSL.g:6547:2: ( rule__CustomObligation__Alternatives_2 )
            {
             before(grammarAccess.getCustomObligationAccess().getAlternatives_2()); 
            // InternalPactDSL.g:6548:2: ( rule__CustomObligation__Alternatives_2 )
            // InternalPactDSL.g:6548:3: rule__CustomObligation__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__2__Impl"


    // $ANTLR start "rule__CustomObligation__Group__3"
    // InternalPactDSL.g:6556:1: rule__CustomObligation__Group__3 : rule__CustomObligation__Group__3__Impl rule__CustomObligation__Group__4 ;
    public final void rule__CustomObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6560:1: ( rule__CustomObligation__Group__3__Impl rule__CustomObligation__Group__4 )
            // InternalPactDSL.g:6561:2: rule__CustomObligation__Group__3__Impl rule__CustomObligation__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__CustomObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__3"


    // $ANTLR start "rule__CustomObligation__Group__3__Impl"
    // InternalPactDSL.g:6568:1: rule__CustomObligation__Group__3__Impl : ( ( rule__CustomObligation__CustomObligationAssignment_3 ) ) ;
    public final void rule__CustomObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6572:1: ( ( ( rule__CustomObligation__CustomObligationAssignment_3 ) ) )
            // InternalPactDSL.g:6573:1: ( ( rule__CustomObligation__CustomObligationAssignment_3 ) )
            {
            // InternalPactDSL.g:6573:1: ( ( rule__CustomObligation__CustomObligationAssignment_3 ) )
            // InternalPactDSL.g:6574:2: ( rule__CustomObligation__CustomObligationAssignment_3 )
            {
             before(grammarAccess.getCustomObligationAccess().getCustomObligationAssignment_3()); 
            // InternalPactDSL.g:6575:2: ( rule__CustomObligation__CustomObligationAssignment_3 )
            // InternalPactDSL.g:6575:3: rule__CustomObligation__CustomObligationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__CustomObligationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getCustomObligationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__3__Impl"


    // $ANTLR start "rule__CustomObligation__Group__4"
    // InternalPactDSL.g:6583:1: rule__CustomObligation__Group__4 : rule__CustomObligation__Group__4__Impl ;
    public final void rule__CustomObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6587:1: ( rule__CustomObligation__Group__4__Impl )
            // InternalPactDSL.g:6588:2: rule__CustomObligation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__4"


    // $ANTLR start "rule__CustomObligation__Group__4__Impl"
    // InternalPactDSL.g:6594:1: rule__CustomObligation__Group__4__Impl : ( ( rule__CustomObligation__Group_4__0 )? ) ;
    public final void rule__CustomObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6598:1: ( ( ( rule__CustomObligation__Group_4__0 )? ) )
            // InternalPactDSL.g:6599:1: ( ( rule__CustomObligation__Group_4__0 )? )
            {
            // InternalPactDSL.g:6599:1: ( ( rule__CustomObligation__Group_4__0 )? )
            // InternalPactDSL.g:6600:2: ( rule__CustomObligation__Group_4__0 )?
            {
             before(grammarAccess.getCustomObligationAccess().getGroup_4()); 
            // InternalPactDSL.g:6601:2: ( rule__CustomObligation__Group_4__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==51) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPactDSL.g:6601:3: rule__CustomObligation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomObligation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomObligationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group__4__Impl"


    // $ANTLR start "rule__CustomObligation__Group_4__0"
    // InternalPactDSL.g:6610:1: rule__CustomObligation__Group_4__0 : rule__CustomObligation__Group_4__0__Impl rule__CustomObligation__Group_4__1 ;
    public final void rule__CustomObligation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6614:1: ( rule__CustomObligation__Group_4__0__Impl rule__CustomObligation__Group_4__1 )
            // InternalPactDSL.g:6615:2: rule__CustomObligation__Group_4__0__Impl rule__CustomObligation__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__CustomObligation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__0"


    // $ANTLR start "rule__CustomObligation__Group_4__0__Impl"
    // InternalPactDSL.g:6622:1: rule__CustomObligation__Group_4__0__Impl : ( 'by' ) ;
    public final void rule__CustomObligation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6626:1: ( ( 'by' ) )
            // InternalPactDSL.g:6627:1: ( 'by' )
            {
            // InternalPactDSL.g:6627:1: ( 'by' )
            // InternalPactDSL.g:6628:2: 'by'
            {
             before(grammarAccess.getCustomObligationAccess().getByKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getByKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__0__Impl"


    // $ANTLR start "rule__CustomObligation__Group_4__1"
    // InternalPactDSL.g:6637:1: rule__CustomObligation__Group_4__1 : rule__CustomObligation__Group_4__1__Impl rule__CustomObligation__Group_4__2 ;
    public final void rule__CustomObligation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6641:1: ( rule__CustomObligation__Group_4__1__Impl rule__CustomObligation__Group_4__2 )
            // InternalPactDSL.g:6642:2: rule__CustomObligation__Group_4__1__Impl rule__CustomObligation__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__CustomObligation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__1"


    // $ANTLR start "rule__CustomObligation__Group_4__1__Impl"
    // InternalPactDSL.g:6649:1: rule__CustomObligation__Group_4__1__Impl : ( 'date' ) ;
    public final void rule__CustomObligation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6653:1: ( ( 'date' ) )
            // InternalPactDSL.g:6654:1: ( 'date' )
            {
            // InternalPactDSL.g:6654:1: ( 'date' )
            // InternalPactDSL.g:6655:2: 'date'
            {
             before(grammarAccess.getCustomObligationAccess().getDateKeyword_4_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getDateKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__1__Impl"


    // $ANTLR start "rule__CustomObligation__Group_4__2"
    // InternalPactDSL.g:6664:1: rule__CustomObligation__Group_4__2 : rule__CustomObligation__Group_4__2__Impl rule__CustomObligation__Group_4__3 ;
    public final void rule__CustomObligation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6668:1: ( rule__CustomObligation__Group_4__2__Impl rule__CustomObligation__Group_4__3 )
            // InternalPactDSL.g:6669:2: rule__CustomObligation__Group_4__2__Impl rule__CustomObligation__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__CustomObligation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__2"


    // $ANTLR start "rule__CustomObligation__Group_4__2__Impl"
    // InternalPactDSL.g:6676:1: rule__CustomObligation__Group_4__2__Impl : ( ( rule__CustomObligation__DayAssignment_4_2 ) ) ;
    public final void rule__CustomObligation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6680:1: ( ( ( rule__CustomObligation__DayAssignment_4_2 ) ) )
            // InternalPactDSL.g:6681:1: ( ( rule__CustomObligation__DayAssignment_4_2 ) )
            {
            // InternalPactDSL.g:6681:1: ( ( rule__CustomObligation__DayAssignment_4_2 ) )
            // InternalPactDSL.g:6682:2: ( rule__CustomObligation__DayAssignment_4_2 )
            {
             before(grammarAccess.getCustomObligationAccess().getDayAssignment_4_2()); 
            // InternalPactDSL.g:6683:2: ( rule__CustomObligation__DayAssignment_4_2 )
            // InternalPactDSL.g:6683:3: rule__CustomObligation__DayAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__DayAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getDayAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__2__Impl"


    // $ANTLR start "rule__CustomObligation__Group_4__3"
    // InternalPactDSL.g:6691:1: rule__CustomObligation__Group_4__3 : rule__CustomObligation__Group_4__3__Impl rule__CustomObligation__Group_4__4 ;
    public final void rule__CustomObligation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6695:1: ( rule__CustomObligation__Group_4__3__Impl rule__CustomObligation__Group_4__4 )
            // InternalPactDSL.g:6696:2: rule__CustomObligation__Group_4__3__Impl rule__CustomObligation__Group_4__4
            {
            pushFollow(FOLLOW_20);
            rule__CustomObligation__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__3"


    // $ANTLR start "rule__CustomObligation__Group_4__3__Impl"
    // InternalPactDSL.g:6703:1: rule__CustomObligation__Group_4__3__Impl : ( ( rule__CustomObligation__MonthAssignment_4_3 ) ) ;
    public final void rule__CustomObligation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6707:1: ( ( ( rule__CustomObligation__MonthAssignment_4_3 ) ) )
            // InternalPactDSL.g:6708:1: ( ( rule__CustomObligation__MonthAssignment_4_3 ) )
            {
            // InternalPactDSL.g:6708:1: ( ( rule__CustomObligation__MonthAssignment_4_3 ) )
            // InternalPactDSL.g:6709:2: ( rule__CustomObligation__MonthAssignment_4_3 )
            {
             before(grammarAccess.getCustomObligationAccess().getMonthAssignment_4_3()); 
            // InternalPactDSL.g:6710:2: ( rule__CustomObligation__MonthAssignment_4_3 )
            // InternalPactDSL.g:6710:3: rule__CustomObligation__MonthAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__MonthAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getMonthAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__3__Impl"


    // $ANTLR start "rule__CustomObligation__Group_4__4"
    // InternalPactDSL.g:6718:1: rule__CustomObligation__Group_4__4 : rule__CustomObligation__Group_4__4__Impl ;
    public final void rule__CustomObligation__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6722:1: ( rule__CustomObligation__Group_4__4__Impl )
            // InternalPactDSL.g:6723:2: rule__CustomObligation__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__4"


    // $ANTLR start "rule__CustomObligation__Group_4__4__Impl"
    // InternalPactDSL.g:6729:1: rule__CustomObligation__Group_4__4__Impl : ( ( rule__CustomObligation__YearAssignment_4_4 ) ) ;
    public final void rule__CustomObligation__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6733:1: ( ( ( rule__CustomObligation__YearAssignment_4_4 ) ) )
            // InternalPactDSL.g:6734:1: ( ( rule__CustomObligation__YearAssignment_4_4 ) )
            {
            // InternalPactDSL.g:6734:1: ( ( rule__CustomObligation__YearAssignment_4_4 ) )
            // InternalPactDSL.g:6735:2: ( rule__CustomObligation__YearAssignment_4_4 )
            {
             before(grammarAccess.getCustomObligationAccess().getYearAssignment_4_4()); 
            // InternalPactDSL.g:6736:2: ( rule__CustomObligation__YearAssignment_4_4 )
            // InternalPactDSL.g:6736:3: rule__CustomObligation__YearAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomObligation__YearAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomObligationAccess().getYearAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__Group_4__4__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__0"
    // InternalPactDSL.g:6745:1: rule__SecondaryObligationType__Group__0 : rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1 ;
    public final void rule__SecondaryObligationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6749:1: ( rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1 )
            // InternalPactDSL.g:6750:2: rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SecondaryObligationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__0"


    // $ANTLR start "rule__SecondaryObligationType__Group__0__Impl"
    // InternalPactDSL.g:6757:1: rule__SecondaryObligationType__Group__0__Impl : ( 'SecondaryObligation:' ) ;
    public final void rule__SecondaryObligationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6761:1: ( ( 'SecondaryObligation:' ) )
            // InternalPactDSL.g:6762:1: ( 'SecondaryObligation:' )
            {
            // InternalPactDSL.g:6762:1: ( 'SecondaryObligation:' )
            // InternalPactDSL.g:6763:2: 'SecondaryObligation:'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSecondaryObligationKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getSecondaryObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__0__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__1"
    // InternalPactDSL.g:6772:1: rule__SecondaryObligationType__Group__1 : rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2 ;
    public final void rule__SecondaryObligationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6776:1: ( rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2 )
            // InternalPactDSL.g:6777:2: rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__SecondaryObligationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__1"


    // $ANTLR start "rule__SecondaryObligationType__Group__1__Impl"
    // InternalPactDSL.g:6784:1: rule__SecondaryObligationType__Group__1__Impl : ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) ) ;
    public final void rule__SecondaryObligationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6788:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6789:1: ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6789:1: ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6790:2: ( rule__SecondaryObligationType__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6791:2: ( rule__SecondaryObligationType__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6791:3: rule__SecondaryObligationType__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__1__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__2"
    // InternalPactDSL.g:6799:1: rule__SecondaryObligationType__Group__2 : rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3 ;
    public final void rule__SecondaryObligationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6803:1: ( rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3 )
            // InternalPactDSL.g:6804:2: rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SecondaryObligationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__2"


    // $ANTLR start "rule__SecondaryObligationType__Group__2__Impl"
    // InternalPactDSL.g:6811:1: rule__SecondaryObligationType__Group__2__Impl : ( 'must' ) ;
    public final void rule__SecondaryObligationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6815:1: ( ( 'must' ) )
            // InternalPactDSL.g:6816:1: ( 'must' )
            {
            // InternalPactDSL.g:6816:1: ( 'must' )
            // InternalPactDSL.g:6817:2: 'must'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getMustKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__2__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__3"
    // InternalPactDSL.g:6826:1: rule__SecondaryObligationType__Group__3 : rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4 ;
    public final void rule__SecondaryObligationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6830:1: ( rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4 )
            // InternalPactDSL.g:6831:2: rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SecondaryObligationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__3"


    // $ANTLR start "rule__SecondaryObligationType__Group__3__Impl"
    // InternalPactDSL.g:6838:1: rule__SecondaryObligationType__Group__3__Impl : ( 'pay' ) ;
    public final void rule__SecondaryObligationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6842:1: ( ( 'pay' ) )
            // InternalPactDSL.g:6843:1: ( 'pay' )
            {
            // InternalPactDSL.g:6843:1: ( 'pay' )
            // InternalPactDSL.g:6844:2: 'pay'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getPayKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getPayKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__3__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__4"
    // InternalPactDSL.g:6853:1: rule__SecondaryObligationType__Group__4 : rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5 ;
    public final void rule__SecondaryObligationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6857:1: ( rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5 )
            // InternalPactDSL.g:6858:2: rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SecondaryObligationType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__4"


    // $ANTLR start "rule__SecondaryObligationType__Group__4__Impl"
    // InternalPactDSL.g:6865:1: rule__SecondaryObligationType__Group__4__Impl : ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) ) ;
    public final void rule__SecondaryObligationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6869:1: ( ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:6870:1: ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:6870:1: ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) )
            // InternalPactDSL.g:6871:2: ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:6871:2: ( ( rule__SecondaryObligationType__SumAssignment_4 ) )
            // InternalPactDSL.g:6872:3: ( rule__SecondaryObligationType__SumAssignment_4 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:6873:3: ( rule__SecondaryObligationType__SumAssignment_4 )
            // InternalPactDSL.g:6873:4: rule__SecondaryObligationType__SumAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__SecondaryObligationType__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:6876:2: ( ( rule__SecondaryObligationType__SumAssignment_4 )* )
            // InternalPactDSL.g:6877:3: ( rule__SecondaryObligationType__SumAssignment_4 )*
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:6878:3: ( rule__SecondaryObligationType__SumAssignment_4 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_INT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalPactDSL.g:6878:4: rule__SecondaryObligationType__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SecondaryObligationType__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__4__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__5"
    // InternalPactDSL.g:6887:1: rule__SecondaryObligationType__Group__5 : rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6 ;
    public final void rule__SecondaryObligationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6891:1: ( rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6 )
            // InternalPactDSL.g:6892:2: rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__SecondaryObligationType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__5"


    // $ANTLR start "rule__SecondaryObligationType__Group__5__Impl"
    // InternalPactDSL.g:6899:1: rule__SecondaryObligationType__Group__5__Impl : ( 'to' ) ;
    public final void rule__SecondaryObligationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6903:1: ( ( 'to' ) )
            // InternalPactDSL.g:6904:1: ( 'to' )
            {
            // InternalPactDSL.g:6904:1: ( 'to' )
            // InternalPactDSL.g:6905:2: 'to'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getToKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__5__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__6"
    // InternalPactDSL.g:6914:1: rule__SecondaryObligationType__Group__6 : rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7 ;
    public final void rule__SecondaryObligationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6918:1: ( rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7 )
            // InternalPactDSL.g:6919:2: rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7
            {
            pushFollow(FOLLOW_49);
            rule__SecondaryObligationType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__6"


    // $ANTLR start "rule__SecondaryObligationType__Group__6__Impl"
    // InternalPactDSL.g:6926:1: rule__SecondaryObligationType__Group__6__Impl : ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__SecondaryObligationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6930:1: ( ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:6931:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:6931:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:6932:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:6932:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:6933:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:6934:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )
            // InternalPactDSL.g:6934:4: rule__SecondaryObligationType__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__SecondaryObligationType__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:6937:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:6938:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:6939:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalPactDSL.g:6939:4: rule__SecondaryObligationType__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SecondaryObligationType__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__6__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__7"
    // InternalPactDSL.g:6948:1: rule__SecondaryObligationType__Group__7 : rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8 ;
    public final void rule__SecondaryObligationType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6952:1: ( rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8 )
            // InternalPactDSL.g:6953:2: rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__SecondaryObligationType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__7"


    // $ANTLR start "rule__SecondaryObligationType__Group__7__Impl"
    // InternalPactDSL.g:6960:1: rule__SecondaryObligationType__Group__7__Impl : ( 'uponBreachOf' ) ;
    public final void rule__SecondaryObligationType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6964:1: ( ( 'uponBreachOf' ) )
            // InternalPactDSL.g:6965:1: ( 'uponBreachOf' )
            {
            // InternalPactDSL.g:6965:1: ( 'uponBreachOf' )
            // InternalPactDSL.g:6966:2: 'uponBreachOf'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getUponBreachOfKeyword_7()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getUponBreachOfKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__7__Impl"


    // $ANTLR start "rule__SecondaryObligationType__Group__8"
    // InternalPactDSL.g:6975:1: rule__SecondaryObligationType__Group__8 : rule__SecondaryObligationType__Group__8__Impl ;
    public final void rule__SecondaryObligationType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6979:1: ( rule__SecondaryObligationType__Group__8__Impl )
            // InternalPactDSL.g:6980:2: rule__SecondaryObligationType__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__8"


    // $ANTLR start "rule__SecondaryObligationType__Group__8__Impl"
    // InternalPactDSL.g:6986:1: rule__SecondaryObligationType__Group__8__Impl : ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) ) ;
    public final void rule__SecondaryObligationType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6990:1: ( ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) ) )
            // InternalPactDSL.g:6991:1: ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) )
            {
            // InternalPactDSL.g:6991:1: ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) )
            // InternalPactDSL.g:6992:2: ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationAssignment_8()); 
            // InternalPactDSL.g:6993:2: ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 )
            // InternalPactDSL.g:6993:3: rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__Group__8__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__0"
    // InternalPactDSL.g:7002:1: rule__LiabilityToParty__Group__0 : rule__LiabilityToParty__Group__0__Impl rule__LiabilityToParty__Group__1 ;
    public final void rule__LiabilityToParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7006:1: ( rule__LiabilityToParty__Group__0__Impl rule__LiabilityToParty__Group__1 )
            // InternalPactDSL.g:7007:2: rule__LiabilityToParty__Group__0__Impl rule__LiabilityToParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityToParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__0"


    // $ANTLR start "rule__LiabilityToParty__Group__0__Impl"
    // InternalPactDSL.g:7014:1: rule__LiabilityToParty__Group__0__Impl : ( 'LiabilityToParty:' ) ;
    public final void rule__LiabilityToParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7018:1: ( ( 'LiabilityToParty:' ) )
            // InternalPactDSL.g:7019:1: ( 'LiabilityToParty:' )
            {
            // InternalPactDSL.g:7019:1: ( 'LiabilityToParty:' )
            // InternalPactDSL.g:7020:2: 'LiabilityToParty:'
            {
             before(grammarAccess.getLiabilityToPartyAccess().getLiabilityToPartyKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getLiabilityToPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__0__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__1"
    // InternalPactDSL.g:7029:1: rule__LiabilityToParty__Group__1 : rule__LiabilityToParty__Group__1__Impl rule__LiabilityToParty__Group__2 ;
    public final void rule__LiabilityToParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7033:1: ( rule__LiabilityToParty__Group__1__Impl rule__LiabilityToParty__Group__2 )
            // InternalPactDSL.g:7034:2: rule__LiabilityToParty__Group__1__Impl rule__LiabilityToParty__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__LiabilityToParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__1"


    // $ANTLR start "rule__LiabilityToParty__Group__1__Impl"
    // InternalPactDSL.g:7041:1: rule__LiabilityToParty__Group__1__Impl : ( ( rule__LiabilityToParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__LiabilityToParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7045:1: ( ( ( rule__LiabilityToParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:7046:1: ( ( rule__LiabilityToParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:7046:1: ( ( rule__LiabilityToParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7047:2: ( rule__LiabilityToParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7048:2: ( rule__LiabilityToParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7048:3: rule__LiabilityToParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__1__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__2"
    // InternalPactDSL.g:7056:1: rule__LiabilityToParty__Group__2 : rule__LiabilityToParty__Group__2__Impl rule__LiabilityToParty__Group__3 ;
    public final void rule__LiabilityToParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7060:1: ( rule__LiabilityToParty__Group__2__Impl rule__LiabilityToParty__Group__3 )
            // InternalPactDSL.g:7061:2: rule__LiabilityToParty__Group__2__Impl rule__LiabilityToParty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LiabilityToParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__2"


    // $ANTLR start "rule__LiabilityToParty__Group__2__Impl"
    // InternalPactDSL.g:7068:1: rule__LiabilityToParty__Group__2__Impl : ( 'shallNotBeLiable' ) ;
    public final void rule__LiabilityToParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7072:1: ( ( 'shallNotBeLiable' ) )
            // InternalPactDSL.g:7073:1: ( 'shallNotBeLiable' )
            {
            // InternalPactDSL.g:7073:1: ( 'shallNotBeLiable' )
            // InternalPactDSL.g:7074:2: 'shallNotBeLiable'
            {
             before(grammarAccess.getLiabilityToPartyAccess().getShallNotBeLiableKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getShallNotBeLiableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__2__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__3"
    // InternalPactDSL.g:7083:1: rule__LiabilityToParty__Group__3 : rule__LiabilityToParty__Group__3__Impl rule__LiabilityToParty__Group__4 ;
    public final void rule__LiabilityToParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7087:1: ( rule__LiabilityToParty__Group__3__Impl rule__LiabilityToParty__Group__4 )
            // InternalPactDSL.g:7088:2: rule__LiabilityToParty__Group__3__Impl rule__LiabilityToParty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityToParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__3"


    // $ANTLR start "rule__LiabilityToParty__Group__3__Impl"
    // InternalPactDSL.g:7095:1: rule__LiabilityToParty__Group__3__Impl : ( 'to' ) ;
    public final void rule__LiabilityToParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7099:1: ( ( 'to' ) )
            // InternalPactDSL.g:7100:1: ( 'to' )
            {
            // InternalPactDSL.g:7100:1: ( 'to' )
            // InternalPactDSL.g:7101:2: 'to'
            {
             before(grammarAccess.getLiabilityToPartyAccess().getToKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__3__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__4"
    // InternalPactDSL.g:7110:1: rule__LiabilityToParty__Group__4 : rule__LiabilityToParty__Group__4__Impl rule__LiabilityToParty__Group__5 ;
    public final void rule__LiabilityToParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7114:1: ( rule__LiabilityToParty__Group__4__Impl rule__LiabilityToParty__Group__5 )
            // InternalPactDSL.g:7115:2: rule__LiabilityToParty__Group__4__Impl rule__LiabilityToParty__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__LiabilityToParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__4"


    // $ANTLR start "rule__LiabilityToParty__Group__4__Impl"
    // InternalPactDSL.g:7122:1: rule__LiabilityToParty__Group__4__Impl : ( ( rule__LiabilityToParty__SuperTypeAssignment_4 ) ) ;
    public final void rule__LiabilityToParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7126:1: ( ( ( rule__LiabilityToParty__SuperTypeAssignment_4 ) ) )
            // InternalPactDSL.g:7127:1: ( ( rule__LiabilityToParty__SuperTypeAssignment_4 ) )
            {
            // InternalPactDSL.g:7127:1: ( ( rule__LiabilityToParty__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:7128:2: ( rule__LiabilityToParty__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:7129:2: ( rule__LiabilityToParty__SuperTypeAssignment_4 )
            // InternalPactDSL.g:7129:3: rule__LiabilityToParty__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__4__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__5"
    // InternalPactDSL.g:7137:1: rule__LiabilityToParty__Group__5 : rule__LiabilityToParty__Group__5__Impl rule__LiabilityToParty__Group__6 ;
    public final void rule__LiabilityToParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7141:1: ( rule__LiabilityToParty__Group__5__Impl rule__LiabilityToParty__Group__6 )
            // InternalPactDSL.g:7142:2: rule__LiabilityToParty__Group__5__Impl rule__LiabilityToParty__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__LiabilityToParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__5"


    // $ANTLR start "rule__LiabilityToParty__Group__5__Impl"
    // InternalPactDSL.g:7149:1: rule__LiabilityToParty__Group__5__Impl : ( 'for' ) ;
    public final void rule__LiabilityToParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7153:1: ( ( 'for' ) )
            // InternalPactDSL.g:7154:1: ( 'for' )
            {
            // InternalPactDSL.g:7154:1: ( 'for' )
            // InternalPactDSL.g:7155:2: 'for'
            {
             before(grammarAccess.getLiabilityToPartyAccess().getForKeyword_5()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__5__Impl"


    // $ANTLR start "rule__LiabilityToParty__Group__6"
    // InternalPactDSL.g:7164:1: rule__LiabilityToParty__Group__6 : rule__LiabilityToParty__Group__6__Impl ;
    public final void rule__LiabilityToParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7168:1: ( rule__LiabilityToParty__Group__6__Impl )
            // InternalPactDSL.g:7169:2: rule__LiabilityToParty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__6"


    // $ANTLR start "rule__LiabilityToParty__Group__6__Impl"
    // InternalPactDSL.g:7175:1: rule__LiabilityToParty__Group__6__Impl : ( ( rule__LiabilityToParty__CustomLossAssignment_6 ) ) ;
    public final void rule__LiabilityToParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7179:1: ( ( ( rule__LiabilityToParty__CustomLossAssignment_6 ) ) )
            // InternalPactDSL.g:7180:1: ( ( rule__LiabilityToParty__CustomLossAssignment_6 ) )
            {
            // InternalPactDSL.g:7180:1: ( ( rule__LiabilityToParty__CustomLossAssignment_6 ) )
            // InternalPactDSL.g:7181:2: ( rule__LiabilityToParty__CustomLossAssignment_6 )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getCustomLossAssignment_6()); 
            // InternalPactDSL.g:7182:2: ( rule__LiabilityToParty__CustomLossAssignment_6 )
            // InternalPactDSL.g:7182:3: rule__LiabilityToParty__CustomLossAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToParty__CustomLossAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToPartyAccess().getCustomLossAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__Group__6__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__0"
    // InternalPactDSL.g:7191:1: rule__LiabilityToThirdParty__Group__0 : rule__LiabilityToThirdParty__Group__0__Impl rule__LiabilityToThirdParty__Group__1 ;
    public final void rule__LiabilityToThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7195:1: ( rule__LiabilityToThirdParty__Group__0__Impl rule__LiabilityToThirdParty__Group__1 )
            // InternalPactDSL.g:7196:2: rule__LiabilityToThirdParty__Group__0__Impl rule__LiabilityToThirdParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityToThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__0"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__0__Impl"
    // InternalPactDSL.g:7203:1: rule__LiabilityToThirdParty__Group__0__Impl : ( 'LiabilityToThirdParty:' ) ;
    public final void rule__LiabilityToThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7207:1: ( ( 'LiabilityToThirdParty:' ) )
            // InternalPactDSL.g:7208:1: ( 'LiabilityToThirdParty:' )
            {
            // InternalPactDSL.g:7208:1: ( 'LiabilityToThirdParty:' )
            // InternalPactDSL.g:7209:2: 'LiabilityToThirdParty:'
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getLiabilityToThirdPartyKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getLiabilityToThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__0__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__1"
    // InternalPactDSL.g:7218:1: rule__LiabilityToThirdParty__Group__1 : rule__LiabilityToThirdParty__Group__1__Impl rule__LiabilityToThirdParty__Group__2 ;
    public final void rule__LiabilityToThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7222:1: ( rule__LiabilityToThirdParty__Group__1__Impl rule__LiabilityToThirdParty__Group__2 )
            // InternalPactDSL.g:7223:2: rule__LiabilityToThirdParty__Group__1__Impl rule__LiabilityToThirdParty__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__LiabilityToThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__1"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__1__Impl"
    // InternalPactDSL.g:7230:1: rule__LiabilityToThirdParty__Group__1__Impl : ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__LiabilityToThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7234:1: ( ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:7235:1: ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:7235:1: ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7236:2: ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7237:2: ( rule__LiabilityToThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7237:3: rule__LiabilityToThirdParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__1__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__2"
    // InternalPactDSL.g:7245:1: rule__LiabilityToThirdParty__Group__2 : rule__LiabilityToThirdParty__Group__2__Impl rule__LiabilityToThirdParty__Group__3 ;
    public final void rule__LiabilityToThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7249:1: ( rule__LiabilityToThirdParty__Group__2__Impl rule__LiabilityToThirdParty__Group__3 )
            // InternalPactDSL.g:7250:2: rule__LiabilityToThirdParty__Group__2__Impl rule__LiabilityToThirdParty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LiabilityToThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__2"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__2__Impl"
    // InternalPactDSL.g:7257:1: rule__LiabilityToThirdParty__Group__2__Impl : ( 'shallNotBeLiable' ) ;
    public final void rule__LiabilityToThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7261:1: ( ( 'shallNotBeLiable' ) )
            // InternalPactDSL.g:7262:1: ( 'shallNotBeLiable' )
            {
            // InternalPactDSL.g:7262:1: ( 'shallNotBeLiable' )
            // InternalPactDSL.g:7263:2: 'shallNotBeLiable'
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getShallNotBeLiableKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getShallNotBeLiableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__2__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__3"
    // InternalPactDSL.g:7272:1: rule__LiabilityToThirdParty__Group__3 : rule__LiabilityToThirdParty__Group__3__Impl rule__LiabilityToThirdParty__Group__4 ;
    public final void rule__LiabilityToThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7276:1: ( rule__LiabilityToThirdParty__Group__3__Impl rule__LiabilityToThirdParty__Group__4 )
            // InternalPactDSL.g:7277:2: rule__LiabilityToThirdParty__Group__3__Impl rule__LiabilityToThirdParty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityToThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__3"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__3__Impl"
    // InternalPactDSL.g:7284:1: rule__LiabilityToThirdParty__Group__3__Impl : ( 'to' ) ;
    public final void rule__LiabilityToThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7288:1: ( ( 'to' ) )
            // InternalPactDSL.g:7289:1: ( 'to' )
            {
            // InternalPactDSL.g:7289:1: ( 'to' )
            // InternalPactDSL.g:7290:2: 'to'
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getToKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__3__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__4"
    // InternalPactDSL.g:7299:1: rule__LiabilityToThirdParty__Group__4 : rule__LiabilityToThirdParty__Group__4__Impl rule__LiabilityToThirdParty__Group__5 ;
    public final void rule__LiabilityToThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7303:1: ( rule__LiabilityToThirdParty__Group__4__Impl rule__LiabilityToThirdParty__Group__5 )
            // InternalPactDSL.g:7304:2: rule__LiabilityToThirdParty__Group__4__Impl rule__LiabilityToThirdParty__Group__5
            {
            pushFollow(FOLLOW_51);
            rule__LiabilityToThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__4"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__4__Impl"
    // InternalPactDSL.g:7311:1: rule__LiabilityToThirdParty__Group__4__Impl : ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 ) ) ;
    public final void rule__LiabilityToThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7315:1: ( ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 ) ) )
            // InternalPactDSL.g:7316:1: ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 ) )
            {
            // InternalPactDSL.g:7316:1: ( ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:7317:2: ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:7318:2: ( rule__LiabilityToThirdParty__SuperTypeAssignment_4 )
            // InternalPactDSL.g:7318:3: rule__LiabilityToThirdParty__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__4__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__5"
    // InternalPactDSL.g:7326:1: rule__LiabilityToThirdParty__Group__5 : rule__LiabilityToThirdParty__Group__5__Impl rule__LiabilityToThirdParty__Group__6 ;
    public final void rule__LiabilityToThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7330:1: ( rule__LiabilityToThirdParty__Group__5__Impl rule__LiabilityToThirdParty__Group__6 )
            // InternalPactDSL.g:7331:2: rule__LiabilityToThirdParty__Group__5__Impl rule__LiabilityToThirdParty__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__LiabilityToThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__5"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__5__Impl"
    // InternalPactDSL.g:7338:1: rule__LiabilityToThirdParty__Group__5__Impl : ( 'for' ) ;
    public final void rule__LiabilityToThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7342:1: ( ( 'for' ) )
            // InternalPactDSL.g:7343:1: ( 'for' )
            {
            // InternalPactDSL.g:7343:1: ( 'for' )
            // InternalPactDSL.g:7344:2: 'for'
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getForKeyword_5()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__5__Impl"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__6"
    // InternalPactDSL.g:7353:1: rule__LiabilityToThirdParty__Group__6 : rule__LiabilityToThirdParty__Group__6__Impl ;
    public final void rule__LiabilityToThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7357:1: ( rule__LiabilityToThirdParty__Group__6__Impl )
            // InternalPactDSL.g:7358:2: rule__LiabilityToThirdParty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__6"


    // $ANTLR start "rule__LiabilityToThirdParty__Group__6__Impl"
    // InternalPactDSL.g:7364:1: rule__LiabilityToThirdParty__Group__6__Impl : ( ( rule__LiabilityToThirdParty__CustomLossAssignment_6 ) ) ;
    public final void rule__LiabilityToThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7368:1: ( ( ( rule__LiabilityToThirdParty__CustomLossAssignment_6 ) ) )
            // InternalPactDSL.g:7369:1: ( ( rule__LiabilityToThirdParty__CustomLossAssignment_6 ) )
            {
            // InternalPactDSL.g:7369:1: ( ( rule__LiabilityToThirdParty__CustomLossAssignment_6 ) )
            // InternalPactDSL.g:7370:2: ( rule__LiabilityToThirdParty__CustomLossAssignment_6 )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getCustomLossAssignment_6()); 
            // InternalPactDSL.g:7371:2: ( rule__LiabilityToThirdParty__CustomLossAssignment_6 )
            // InternalPactDSL.g:7371:3: rule__LiabilityToThirdParty__CustomLossAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityToThirdParty__CustomLossAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getCustomLossAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__Group__6__Impl"


    // $ANTLR start "rule__ForConvenience__Group__0"
    // InternalPactDSL.g:7380:1: rule__ForConvenience__Group__0 : rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 ;
    public final void rule__ForConvenience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7384:1: ( rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 )
            // InternalPactDSL.g:7385:2: rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ForConvenience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0"


    // $ANTLR start "rule__ForConvenience__Group__0__Impl"
    // InternalPactDSL.g:7392:1: rule__ForConvenience__Group__0__Impl : ( 'TerminationForConvenience:' ) ;
    public final void rule__ForConvenience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7396:1: ( ( 'TerminationForConvenience:' ) )
            // InternalPactDSL.g:7397:1: ( 'TerminationForConvenience:' )
            {
            // InternalPactDSL.g:7397:1: ( 'TerminationForConvenience:' )
            // InternalPactDSL.g:7398:2: 'TerminationForConvenience:'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0__Impl"


    // $ANTLR start "rule__ForConvenience__Group__1"
    // InternalPactDSL.g:7407:1: rule__ForConvenience__Group__1 : rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 ;
    public final void rule__ForConvenience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7411:1: ( rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 )
            // InternalPactDSL.g:7412:2: rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__ForConvenience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__1"


    // $ANTLR start "rule__ForConvenience__Group__1__Impl"
    // InternalPactDSL.g:7419:1: rule__ForConvenience__Group__1__Impl : ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForConvenience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7423:1: ( ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7424:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7424:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7425:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7425:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7426:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7427:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7427:4: rule__ForConvenience__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForConvenience__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7430:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7431:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7432:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalPactDSL.g:7432:4: rule__ForConvenience__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForConvenience__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__1__Impl"


    // $ANTLR start "rule__ForConvenience__Group__2"
    // InternalPactDSL.g:7441:1: rule__ForConvenience__Group__2 : rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 ;
    public final void rule__ForConvenience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7445:1: ( rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 )
            // InternalPactDSL.g:7446:2: rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__ForConvenience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2"


    // $ANTLR start "rule__ForConvenience__Group__2__Impl"
    // InternalPactDSL.g:7453:1: rule__ForConvenience__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForConvenience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7457:1: ( ( 'may' ) )
            // InternalPactDSL.g:7458:1: ( 'may' )
            {
            // InternalPactDSL.g:7458:1: ( 'may' )
            // InternalPactDSL.g:7459:2: 'may'
            {
             before(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2__Impl"


    // $ANTLR start "rule__ForConvenience__Group__3"
    // InternalPactDSL.g:7468:1: rule__ForConvenience__Group__3 : rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 ;
    public final void rule__ForConvenience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7472:1: ( rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 )
            // InternalPactDSL.g:7473:2: rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ForConvenience__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3"


    // $ANTLR start "rule__ForConvenience__Group__3__Impl"
    // InternalPactDSL.g:7480:1: rule__ForConvenience__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForConvenience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7484:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7485:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7485:1: ( 'terminate' )
            // InternalPactDSL.g:7486:2: 'terminate'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3__Impl"


    // $ANTLR start "rule__ForConvenience__Group__4"
    // InternalPactDSL.g:7495:1: rule__ForConvenience__Group__4 : rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 ;
    public final void rule__ForConvenience__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7499:1: ( rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 )
            // InternalPactDSL.g:7500:2: rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForConvenience__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4"


    // $ANTLR start "rule__ForConvenience__Group__4__Impl"
    // InternalPactDSL.g:7507:1: rule__ForConvenience__Group__4__Impl : ( 'by' ) ;
    public final void rule__ForConvenience__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7511:1: ( ( 'by' ) )
            // InternalPactDSL.g:7512:1: ( 'by' )
            {
            // InternalPactDSL.g:7512:1: ( 'by' )
            // InternalPactDSL.g:7513:2: 'by'
            {
             before(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4__Impl"


    // $ANTLR start "rule__ForConvenience__Group__5"
    // InternalPactDSL.g:7522:1: rule__ForConvenience__Group__5 : rule__ForConvenience__Group__5__Impl ;
    public final void rule__ForConvenience__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7526:1: ( rule__ForConvenience__Group__5__Impl )
            // InternalPactDSL.g:7527:2: rule__ForConvenience__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5"


    // $ANTLR start "rule__ForConvenience__Group__5__Impl"
    // InternalPactDSL.g:7533:1: rule__ForConvenience__Group__5__Impl : ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) ;
    public final void rule__ForConvenience__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7537:1: ( ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) )
            // InternalPactDSL.g:7538:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            {
            // InternalPactDSL.g:7538:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            // InternalPactDSL.g:7539:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 
            // InternalPactDSL.g:7540:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            // InternalPactDSL.g:7540:3: rule__ForConvenience__CustomTerminationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__CustomTerminationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__0"
    // InternalPactDSL.g:7549:1: rule__OnReasonableNotice__Group__0 : rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 ;
    public final void rule__OnReasonableNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7553:1: ( rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 )
            // InternalPactDSL.g:7554:2: rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OnReasonableNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0"


    // $ANTLR start "rule__OnReasonableNotice__Group__0__Impl"
    // InternalPactDSL.g:7561:1: rule__OnReasonableNotice__Group__0__Impl : ( 'TerminationOnReasonableNotice:' ) ;
    public final void rule__OnReasonableNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7565:1: ( ( 'TerminationOnReasonableNotice:' ) )
            // InternalPactDSL.g:7566:1: ( 'TerminationOnReasonableNotice:' )
            {
            // InternalPactDSL.g:7566:1: ( 'TerminationOnReasonableNotice:' )
            // InternalPactDSL.g:7567:2: 'TerminationOnReasonableNotice:'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__1"
    // InternalPactDSL.g:7576:1: rule__OnReasonableNotice__Group__1 : rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 ;
    public final void rule__OnReasonableNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7580:1: ( rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 )
            // InternalPactDSL.g:7581:2: rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__OnReasonableNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__1"


    // $ANTLR start "rule__OnReasonableNotice__Group__1__Impl"
    // InternalPactDSL.g:7588:1: rule__OnReasonableNotice__Group__1__Impl : ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnReasonableNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7592:1: ( ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7593:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7593:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7594:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7594:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7595:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7596:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7596:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnReasonableNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7599:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7600:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7601:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalPactDSL.g:7601:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnReasonableNotice__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__1__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__2"
    // InternalPactDSL.g:7610:1: rule__OnReasonableNotice__Group__2 : rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 ;
    public final void rule__OnReasonableNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7614:1: ( rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 )
            // InternalPactDSL.g:7615:2: rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__OnReasonableNotice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2"


    // $ANTLR start "rule__OnReasonableNotice__Group__2__Impl"
    // InternalPactDSL.g:7622:1: rule__OnReasonableNotice__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnReasonableNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7626:1: ( ( 'may' ) )
            // InternalPactDSL.g:7627:1: ( 'may' )
            {
            // InternalPactDSL.g:7627:1: ( 'may' )
            // InternalPactDSL.g:7628:2: 'may'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__3"
    // InternalPactDSL.g:7637:1: rule__OnReasonableNotice__Group__3 : rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 ;
    public final void rule__OnReasonableNotice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7641:1: ( rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 )
            // InternalPactDSL.g:7642:2: rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__OnReasonableNotice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3"


    // $ANTLR start "rule__OnReasonableNotice__Group__3__Impl"
    // InternalPactDSL.g:7649:1: rule__OnReasonableNotice__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnReasonableNotice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7653:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7654:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7654:1: ( 'terminate' )
            // InternalPactDSL.g:7655:2: 'terminate'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__4"
    // InternalPactDSL.g:7664:1: rule__OnReasonableNotice__Group__4 : rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 ;
    public final void rule__OnReasonableNotice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7668:1: ( rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 )
            // InternalPactDSL.g:7669:2: rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__OnReasonableNotice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4"


    // $ANTLR start "rule__OnReasonableNotice__Group__4__Impl"
    // InternalPactDSL.g:7676:1: rule__OnReasonableNotice__Group__4__Impl : ( 'by' ) ;
    public final void rule__OnReasonableNotice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7680:1: ( ( 'by' ) )
            // InternalPactDSL.g:7681:1: ( 'by' )
            {
            // InternalPactDSL.g:7681:1: ( 'by' )
            // InternalPactDSL.g:7682:2: 'by'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__5"
    // InternalPactDSL.g:7691:1: rule__OnReasonableNotice__Group__5 : rule__OnReasonableNotice__Group__5__Impl ;
    public final void rule__OnReasonableNotice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7695:1: ( rule__OnReasonableNotice__Group__5__Impl )
            // InternalPactDSL.g:7696:2: rule__OnReasonableNotice__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5"


    // $ANTLR start "rule__OnReasonableNotice__Group__5__Impl"
    // InternalPactDSL.g:7702:1: rule__OnReasonableNotice__Group__5__Impl : ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) ;
    public final void rule__OnReasonableNotice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7706:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) )
            // InternalPactDSL.g:7707:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            {
            // InternalPactDSL.g:7707:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            // InternalPactDSL.g:7708:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 
            // InternalPactDSL.g:7709:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            // InternalPactDSL.g:7709:3: rule__OnReasonableNotice__SuperTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__SuperTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__0"
    // InternalPactDSL.g:7718:1: rule__ForBreach__Group__0 : rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 ;
    public final void rule__ForBreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7722:1: ( rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 )
            // InternalPactDSL.g:7723:2: rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ForBreach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0"


    // $ANTLR start "rule__ForBreach__Group__0__Impl"
    // InternalPactDSL.g:7730:1: rule__ForBreach__Group__0__Impl : ( 'TerminationForBreach:' ) ;
    public final void rule__ForBreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7734:1: ( ( 'TerminationForBreach:' ) )
            // InternalPactDSL.g:7735:1: ( 'TerminationForBreach:' )
            {
            // InternalPactDSL.g:7735:1: ( 'TerminationForBreach:' )
            // InternalPactDSL.g:7736:2: 'TerminationForBreach:'
            {
             before(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0__Impl"


    // $ANTLR start "rule__ForBreach__Group__1"
    // InternalPactDSL.g:7745:1: rule__ForBreach__Group__1 : rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 ;
    public final void rule__ForBreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7749:1: ( rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 )
            // InternalPactDSL.g:7750:2: rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__ForBreach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__1"


    // $ANTLR start "rule__ForBreach__Group__1__Impl"
    // InternalPactDSL.g:7757:1: rule__ForBreach__Group__1__Impl : ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForBreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7761:1: ( ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7762:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7762:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7763:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7763:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7764:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7765:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7765:4: rule__ForBreach__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForBreach__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7768:2: ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7769:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7770:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalPactDSL.g:7770:4: rule__ForBreach__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForBreach__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__1__Impl"


    // $ANTLR start "rule__ForBreach__Group__2"
    // InternalPactDSL.g:7779:1: rule__ForBreach__Group__2 : rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 ;
    public final void rule__ForBreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7783:1: ( rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 )
            // InternalPactDSL.g:7784:2: rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__ForBreach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2"


    // $ANTLR start "rule__ForBreach__Group__2__Impl"
    // InternalPactDSL.g:7791:1: rule__ForBreach__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForBreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7795:1: ( ( 'may' ) )
            // InternalPactDSL.g:7796:1: ( 'may' )
            {
            // InternalPactDSL.g:7796:1: ( 'may' )
            // InternalPactDSL.g:7797:2: 'may'
            {
             before(grammarAccess.getForBreachAccess().getMayKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2__Impl"


    // $ANTLR start "rule__ForBreach__Group__3"
    // InternalPactDSL.g:7806:1: rule__ForBreach__Group__3 : rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 ;
    public final void rule__ForBreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7810:1: ( rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 )
            // InternalPactDSL.g:7811:2: rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__ForBreach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3"


    // $ANTLR start "rule__ForBreach__Group__3__Impl"
    // InternalPactDSL.g:7818:1: rule__ForBreach__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForBreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7822:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7823:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7823:1: ( 'terminate' )
            // InternalPactDSL.g:7824:2: 'terminate'
            {
             before(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3__Impl"


    // $ANTLR start "rule__ForBreach__Group__4"
    // InternalPactDSL.g:7833:1: rule__ForBreach__Group__4 : rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 ;
    public final void rule__ForBreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7837:1: ( rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 )
            // InternalPactDSL.g:7838:2: rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4"


    // $ANTLR start "rule__ForBreach__Group__4__Impl"
    // InternalPactDSL.g:7845:1: rule__ForBreach__Group__4__Impl : ( 'forBreachOf' ) ;
    public final void rule__ForBreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7849:1: ( ( 'forBreachOf' ) )
            // InternalPactDSL.g:7850:1: ( 'forBreachOf' )
            {
            // InternalPactDSL.g:7850:1: ( 'forBreachOf' )
            // InternalPactDSL.g:7851:2: 'forBreachOf'
            {
             before(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4__Impl"


    // $ANTLR start "rule__ForBreach__Group__5"
    // InternalPactDSL.g:7860:1: rule__ForBreach__Group__5 : rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 ;
    public final void rule__ForBreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7864:1: ( rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 )
            // InternalPactDSL.g:7865:2: rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__ForBreach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__5"


    // $ANTLR start "rule__ForBreach__Group__5__Impl"
    // InternalPactDSL.g:7872:1: rule__ForBreach__Group__5__Impl : ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) ;
    public final void rule__ForBreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7876:1: ( ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) )
            // InternalPactDSL.g:7877:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            {
            // InternalPactDSL.g:7877:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            // InternalPactDSL.g:7878:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            {
            // InternalPactDSL.g:7878:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) )
            // InternalPactDSL.g:7879:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:7880:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            // InternalPactDSL.g:7880:4: rule__ForBreach__ObligationBreachedAssignment_5
            {
            pushFollow(FOLLOW_55);
            rule__ForBreach__ObligationBreachedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }

            // InternalPactDSL.g:7883:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            // InternalPactDSL.g:7884:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:7885:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_STRING) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalPactDSL.g:7885:4: rule__ForBreach__ObligationBreachedAssignment_5
            	    {
            	    pushFollow(FOLLOW_55);
            	    rule__ForBreach__ObligationBreachedAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__6"
    // InternalPactDSL.g:7894:1: rule__ForBreach__Group__6 : rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 ;
    public final void rule__ForBreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7898:1: ( rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 )
            // InternalPactDSL.g:7899:2: rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__ForBreach__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6"


    // $ANTLR start "rule__ForBreach__Group__6__Impl"
    // InternalPactDSL.g:7906:1: rule__ForBreach__Group__6__Impl : ( 'by' ) ;
    public final void rule__ForBreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7910:1: ( ( 'by' ) )
            // InternalPactDSL.g:7911:1: ( 'by' )
            {
            // InternalPactDSL.g:7911:1: ( 'by' )
            // InternalPactDSL.g:7912:2: 'by'
            {
             before(grammarAccess.getForBreachAccess().getByKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getByKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6__Impl"


    // $ANTLR start "rule__ForBreach__Group__7"
    // InternalPactDSL.g:7921:1: rule__ForBreach__Group__7 : rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 ;
    public final void rule__ForBreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7925:1: ( rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 )
            // InternalPactDSL.g:7926:2: rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8
            {
            pushFollow(FOLLOW_56);
            rule__ForBreach__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7"


    // $ANTLR start "rule__ForBreach__Group__7__Impl"
    // InternalPactDSL.g:7933:1: rule__ForBreach__Group__7__Impl : ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) ;
    public final void rule__ForBreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7937:1: ( ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:7938:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:7938:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:7939:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:7940:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            // InternalPactDSL.g:7940:3: rule__ForBreach__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7__Impl"


    // $ANTLR start "rule__ForBreach__Group__8"
    // InternalPactDSL.g:7948:1: rule__ForBreach__Group__8 : rule__ForBreach__Group__8__Impl ;
    public final void rule__ForBreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7952:1: ( rule__ForBreach__Group__8__Impl )
            // InternalPactDSL.g:7953:2: rule__ForBreach__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8"


    // $ANTLR start "rule__ForBreach__Group__8__Impl"
    // InternalPactDSL.g:7959:1: rule__ForBreach__Group__8__Impl : ( ( rule__ForBreach__Group_8__0 )? ) ;
    public final void rule__ForBreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7963:1: ( ( ( rule__ForBreach__Group_8__0 )? ) )
            // InternalPactDSL.g:7964:1: ( ( rule__ForBreach__Group_8__0 )? )
            {
            // InternalPactDSL.g:7964:1: ( ( rule__ForBreach__Group_8__0 )? )
            // InternalPactDSL.g:7965:2: ( rule__ForBreach__Group_8__0 )?
            {
             before(grammarAccess.getForBreachAccess().getGroup_8()); 
            // InternalPactDSL.g:7966:2: ( rule__ForBreach__Group_8__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==63) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalPactDSL.g:7966:3: rule__ForBreach__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForBreach__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForBreachAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__0"
    // InternalPactDSL.g:7975:1: rule__ForBreach__Group_8__0 : rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 ;
    public final void rule__ForBreach__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7979:1: ( rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 )
            // InternalPactDSL.g:7980:2: rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0"


    // $ANTLR start "rule__ForBreach__Group_8__0__Impl"
    // InternalPactDSL.g:7987:1: rule__ForBreach__Group_8__0__Impl : ( 'unless' ) ;
    public final void rule__ForBreach__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7991:1: ( ( 'unless' ) )
            // InternalPactDSL.g:7992:1: ( 'unless' )
            {
            // InternalPactDSL.g:7992:1: ( 'unless' )
            // InternalPactDSL.g:7993:2: 'unless'
            {
             before(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__1"
    // InternalPactDSL.g:8002:1: rule__ForBreach__Group_8__1 : rule__ForBreach__Group_8__1__Impl ;
    public final void rule__ForBreach__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8006:1: ( rule__ForBreach__Group_8__1__Impl )
            // InternalPactDSL.g:8007:2: rule__ForBreach__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1"


    // $ANTLR start "rule__ForBreach__Group_8__1__Impl"
    // InternalPactDSL.g:8013:1: rule__ForBreach__Group_8__1__Impl : ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) ;
    public final void rule__ForBreach__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8017:1: ( ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) )
            // InternalPactDSL.g:8018:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            {
            // InternalPactDSL.g:8018:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            // InternalPactDSL.g:8019:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 
            // InternalPactDSL.g:8020:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            // InternalPactDSL.g:8020:3: rule__ForBreach__RemedialSchemeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__RemedialSchemeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0"
    // InternalPactDSL.g:8029:1: rule__OnInsolvencyEvent__Group__0 : rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 ;
    public final void rule__OnInsolvencyEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8033:1: ( rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 )
            // InternalPactDSL.g:8034:2: rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__OnInsolvencyEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0__Impl"
    // InternalPactDSL.g:8041:1: rule__OnInsolvencyEvent__Group__0__Impl : ( 'TerminationUponInsolvency:' ) ;
    public final void rule__OnInsolvencyEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8045:1: ( ( 'TerminationUponInsolvency:' ) )
            // InternalPactDSL.g:8046:1: ( 'TerminationUponInsolvency:' )
            {
            // InternalPactDSL.g:8046:1: ( 'TerminationUponInsolvency:' )
            // InternalPactDSL.g:8047:2: 'TerminationUponInsolvency:'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1"
    // InternalPactDSL.g:8056:1: rule__OnInsolvencyEvent__Group__1 : rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 ;
    public final void rule__OnInsolvencyEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8060:1: ( rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 )
            // InternalPactDSL.g:8061:2: rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__OnInsolvencyEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1__Impl"
    // InternalPactDSL.g:8068:1: rule__OnInsolvencyEvent__Group__1__Impl : ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnInsolvencyEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8072:1: ( ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:8073:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:8073:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:8074:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:8074:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:8075:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:8076:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            // InternalPactDSL.g:8076:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:8079:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:8080:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:8081:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalPactDSL.g:8081:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2"
    // InternalPactDSL.g:8090:1: rule__OnInsolvencyEvent__Group__2 : rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 ;
    public final void rule__OnInsolvencyEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8094:1: ( rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 )
            // InternalPactDSL.g:8095:2: rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__OnInsolvencyEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2__Impl"
    // InternalPactDSL.g:8102:1: rule__OnInsolvencyEvent__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnInsolvencyEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8106:1: ( ( 'may' ) )
            // InternalPactDSL.g:8107:1: ( 'may' )
            {
            // InternalPactDSL.g:8107:1: ( 'may' )
            // InternalPactDSL.g:8108:2: 'may'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3"
    // InternalPactDSL.g:8117:1: rule__OnInsolvencyEvent__Group__3 : rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 ;
    public final void rule__OnInsolvencyEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8121:1: ( rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 )
            // InternalPactDSL.g:8122:2: rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4
            {
            pushFollow(FOLLOW_57);
            rule__OnInsolvencyEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3__Impl"
    // InternalPactDSL.g:8129:1: rule__OnInsolvencyEvent__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnInsolvencyEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8133:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:8134:1: ( 'terminate' )
            {
            // InternalPactDSL.g:8134:1: ( 'terminate' )
            // InternalPactDSL.g:8135:2: 'terminate'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4"
    // InternalPactDSL.g:8144:1: rule__OnInsolvencyEvent__Group__4 : rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 ;
    public final void rule__OnInsolvencyEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8148:1: ( rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 )
            // InternalPactDSL.g:8149:2: rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__OnInsolvencyEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4__Impl"
    // InternalPactDSL.g:8156:1: rule__OnInsolvencyEvent__Group__4__Impl : ( 'upon' ) ;
    public final void rule__OnInsolvencyEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8160:1: ( ( 'upon' ) )
            // InternalPactDSL.g:8161:1: ( 'upon' )
            {
            // InternalPactDSL.g:8161:1: ( 'upon' )
            // InternalPactDSL.g:8162:2: 'upon'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5"
    // InternalPactDSL.g:8171:1: rule__OnInsolvencyEvent__Group__5 : rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 ;
    public final void rule__OnInsolvencyEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8175:1: ( rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 )
            // InternalPactDSL.g:8176:2: rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6
            {
            pushFollow(FOLLOW_47);
            rule__OnInsolvencyEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5__Impl"
    // InternalPactDSL.g:8183:1: rule__OnInsolvencyEvent__Group__5__Impl : ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8187:1: ( ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) )
            // InternalPactDSL.g:8188:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            {
            // InternalPactDSL.g:8188:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            // InternalPactDSL.g:8189:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 
            // InternalPactDSL.g:8190:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            // InternalPactDSL.g:8190:3: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__InsolvencyEventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6"
    // InternalPactDSL.g:8198:1: rule__OnInsolvencyEvent__Group__6 : rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 ;
    public final void rule__OnInsolvencyEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8202:1: ( rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 )
            // InternalPactDSL.g:8203:2: rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__OnInsolvencyEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6__Impl"
    // InternalPactDSL.g:8210:1: rule__OnInsolvencyEvent__Group__6__Impl : ( 'of' ) ;
    public final void rule__OnInsolvencyEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8214:1: ( ( 'of' ) )
            // InternalPactDSL.g:8215:1: ( 'of' )
            {
            // InternalPactDSL.g:8215:1: ( 'of' )
            // InternalPactDSL.g:8216:2: 'of'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7"
    // InternalPactDSL.g:8225:1: rule__OnInsolvencyEvent__Group__7 : rule__OnInsolvencyEvent__Group__7__Impl ;
    public final void rule__OnInsolvencyEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8229:1: ( rule__OnInsolvencyEvent__Group__7__Impl )
            // InternalPactDSL.g:8230:2: rule__OnInsolvencyEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7__Impl"
    // InternalPactDSL.g:8236:1: rule__OnInsolvencyEvent__Group__7__Impl : ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8240:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:8241:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:8241:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:8242:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:8243:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            // InternalPactDSL.g:8243:3: rule__OnInsolvencyEvent__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7__Impl"


    // $ANTLR start "rule__CustomTermination__Group__0"
    // InternalPactDSL.g:8252:1: rule__CustomTermination__Group__0 : rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 ;
    public final void rule__CustomTermination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8256:1: ( rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 )
            // InternalPactDSL.g:8257:2: rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__CustomTermination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0"


    // $ANTLR start "rule__CustomTermination__Group__0__Impl"
    // InternalPactDSL.g:8264:1: rule__CustomTermination__Group__0__Impl : ( 'Termination:' ) ;
    public final void rule__CustomTermination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8268:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:8269:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:8269:1: ( 'Termination:' )
            // InternalPactDSL.g:8270:2: 'Termination:'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group__1"
    // InternalPactDSL.g:8279:1: rule__CustomTermination__Group__1 : rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 ;
    public final void rule__CustomTermination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8283:1: ( rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 )
            // InternalPactDSL.g:8284:2: rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__CustomTermination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__1"


    // $ANTLR start "rule__CustomTermination__Group__1__Impl"
    // InternalPactDSL.g:8291:1: rule__CustomTermination__Group__1__Impl : ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__CustomTermination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8295:1: ( ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:8296:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:8296:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:8297:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:8297:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:8298:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:8299:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            // InternalPactDSL.g:8299:4: rule__CustomTermination__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__CustomTermination__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:8302:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:8303:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:8304:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalPactDSL.g:8304:4: rule__CustomTermination__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CustomTermination__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__1__Impl"


    // $ANTLR start "rule__CustomTermination__Group__2"
    // InternalPactDSL.g:8313:1: rule__CustomTermination__Group__2 : rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 ;
    public final void rule__CustomTermination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8317:1: ( rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 )
            // InternalPactDSL.g:8318:2: rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__CustomTermination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2"


    // $ANTLR start "rule__CustomTermination__Group__2__Impl"
    // InternalPactDSL.g:8325:1: rule__CustomTermination__Group__2__Impl : ( 'may' ) ;
    public final void rule__CustomTermination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8329:1: ( ( 'may' ) )
            // InternalPactDSL.g:8330:1: ( 'may' )
            {
            // InternalPactDSL.g:8330:1: ( 'may' )
            // InternalPactDSL.g:8331:2: 'may'
            {
             before(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2__Impl"


    // $ANTLR start "rule__CustomTermination__Group__3"
    // InternalPactDSL.g:8340:1: rule__CustomTermination__Group__3 : rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 ;
    public final void rule__CustomTermination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8344:1: ( rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 )
            // InternalPactDSL.g:8345:2: rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__CustomTermination__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3"


    // $ANTLR start "rule__CustomTermination__Group__3__Impl"
    // InternalPactDSL.g:8352:1: rule__CustomTermination__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__CustomTermination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8356:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:8357:1: ( 'terminate' )
            {
            // InternalPactDSL.g:8357:1: ( 'terminate' )
            // InternalPactDSL.g:8358:2: 'terminate'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3__Impl"


    // $ANTLR start "rule__CustomTermination__Group__4"
    // InternalPactDSL.g:8367:1: rule__CustomTermination__Group__4 : rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 ;
    public final void rule__CustomTermination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8371:1: ( rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 )
            // InternalPactDSL.g:8372:2: rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__CustomTermination__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4"


    // $ANTLR start "rule__CustomTermination__Group__4__Impl"
    // InternalPactDSL.g:8379:1: rule__CustomTermination__Group__4__Impl : ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) ;
    public final void rule__CustomTermination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8383:1: ( ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) )
            // InternalPactDSL.g:8384:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            {
            // InternalPactDSL.g:8384:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            // InternalPactDSL.g:8385:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 
            // InternalPactDSL.g:8386:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            // InternalPactDSL.g:8386:3: rule__CustomTermination__CustomTerminationClauseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__CustomTerminationClauseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4__Impl"


    // $ANTLR start "rule__CustomTermination__Group__5"
    // InternalPactDSL.g:8394:1: rule__CustomTermination__Group__5 : rule__CustomTermination__Group__5__Impl ;
    public final void rule__CustomTermination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8398:1: ( rule__CustomTermination__Group__5__Impl )
            // InternalPactDSL.g:8399:2: rule__CustomTermination__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5"


    // $ANTLR start "rule__CustomTermination__Group__5__Impl"
    // InternalPactDSL.g:8405:1: rule__CustomTermination__Group__5__Impl : ( ( rule__CustomTermination__Group_5__0 )? ) ;
    public final void rule__CustomTermination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8409:1: ( ( ( rule__CustomTermination__Group_5__0 )? ) )
            // InternalPactDSL.g:8410:1: ( ( rule__CustomTermination__Group_5__0 )? )
            {
            // InternalPactDSL.g:8410:1: ( ( rule__CustomTermination__Group_5__0 )? )
            // InternalPactDSL.g:8411:2: ( rule__CustomTermination__Group_5__0 )?
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup_5()); 
            // InternalPactDSL.g:8412:2: ( rule__CustomTermination__Group_5__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==51) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalPactDSL.g:8412:3: rule__CustomTermination__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTermination__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTerminationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__0"
    // InternalPactDSL.g:8421:1: rule__CustomTermination__Group_5__0 : rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 ;
    public final void rule__CustomTermination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8425:1: ( rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 )
            // InternalPactDSL.g:8426:2: rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__CustomTermination__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0"


    // $ANTLR start "rule__CustomTermination__Group_5__0__Impl"
    // InternalPactDSL.g:8433:1: rule__CustomTermination__Group_5__0__Impl : ( 'by' ) ;
    public final void rule__CustomTermination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8437:1: ( ( 'by' ) )
            // InternalPactDSL.g:8438:1: ( 'by' )
            {
            // InternalPactDSL.g:8438:1: ( 'by' )
            // InternalPactDSL.g:8439:2: 'by'
            {
             before(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__1"
    // InternalPactDSL.g:8448:1: rule__CustomTermination__Group_5__1 : rule__CustomTermination__Group_5__1__Impl ;
    public final void rule__CustomTermination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8452:1: ( rule__CustomTermination__Group_5__1__Impl )
            // InternalPactDSL.g:8453:2: rule__CustomTermination__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1"


    // $ANTLR start "rule__CustomTermination__Group_5__1__Impl"
    // InternalPactDSL.g:8459:1: rule__CustomTermination__Group_5__1__Impl : ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__CustomTermination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8463:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:8464:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:8464:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:8465:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:8466:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:8466:3: rule__CustomTermination__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__0"
    // InternalPactDSL.g:8475:1: rule__ApplicableLaw__Group__0 : rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 ;
    public final void rule__ApplicableLaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8479:1: ( rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 )
            // InternalPactDSL.g:8480:2: rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ApplicableLaw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0"


    // $ANTLR start "rule__ApplicableLaw__Group__0__Impl"
    // InternalPactDSL.g:8487:1: rule__ApplicableLaw__Group__0__Impl : ( 'ApplicableLaw:' ) ;
    public final void rule__ApplicableLaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8491:1: ( ( 'ApplicableLaw:' ) )
            // InternalPactDSL.g:8492:1: ( 'ApplicableLaw:' )
            {
            // InternalPactDSL.g:8492:1: ( 'ApplicableLaw:' )
            // InternalPactDSL.g:8493:2: 'ApplicableLaw:'
            {
             before(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__1"
    // InternalPactDSL.g:8502:1: rule__ApplicableLaw__Group__1 : rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 ;
    public final void rule__ApplicableLaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8506:1: ( rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 )
            // InternalPactDSL.g:8507:2: rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__ApplicableLaw__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1"


    // $ANTLR start "rule__ApplicableLaw__Group__1__Impl"
    // InternalPactDSL.g:8514:1: rule__ApplicableLaw__Group__1__Impl : ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) ;
    public final void rule__ApplicableLaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8518:1: ( ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) )
            // InternalPactDSL.g:8519:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            {
            // InternalPactDSL.g:8519:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            // InternalPactDSL.g:8520:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 
            // InternalPactDSL.g:8521:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            // InternalPactDSL.g:8521:3: rule__ApplicableLaw__CustomApplicableLawAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__CustomApplicableLawAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__2"
    // InternalPactDSL.g:8529:1: rule__ApplicableLaw__Group__2 : rule__ApplicableLaw__Group__2__Impl ;
    public final void rule__ApplicableLaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8533:1: ( rule__ApplicableLaw__Group__2__Impl )
            // InternalPactDSL.g:8534:2: rule__ApplicableLaw__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2"


    // $ANTLR start "rule__ApplicableLaw__Group__2__Impl"
    // InternalPactDSL.g:8540:1: rule__ApplicableLaw__Group__2__Impl : ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) ;
    public final void rule__ApplicableLaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8544:1: ( ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:8545:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:8545:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:8546:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:8547:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==33) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalPactDSL.g:8547:3: rule__ApplicableLaw__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicableLaw__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__0"
    // InternalPactDSL.g:8556:1: rule__Jurisdiction__Group__0 : rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 ;
    public final void rule__Jurisdiction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8560:1: ( rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 )
            // InternalPactDSL.g:8561:2: rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jurisdiction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0"


    // $ANTLR start "rule__Jurisdiction__Group__0__Impl"
    // InternalPactDSL.g:8568:1: rule__Jurisdiction__Group__0__Impl : ( 'Jurisdiction:' ) ;
    public final void rule__Jurisdiction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8572:1: ( ( 'Jurisdiction:' ) )
            // InternalPactDSL.g:8573:1: ( 'Jurisdiction:' )
            {
            // InternalPactDSL.g:8573:1: ( 'Jurisdiction:' )
            // InternalPactDSL.g:8574:2: 'Jurisdiction:'
            {
             before(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__1"
    // InternalPactDSL.g:8583:1: rule__Jurisdiction__Group__1 : rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 ;
    public final void rule__Jurisdiction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8587:1: ( rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 )
            // InternalPactDSL.g:8588:2: rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__Jurisdiction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1"


    // $ANTLR start "rule__Jurisdiction__Group__1__Impl"
    // InternalPactDSL.g:8595:1: rule__Jurisdiction__Group__1__Impl : ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) ;
    public final void rule__Jurisdiction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8599:1: ( ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) )
            // InternalPactDSL.g:8600:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            {
            // InternalPactDSL.g:8600:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            // InternalPactDSL.g:8601:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 
            // InternalPactDSL.g:8602:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            // InternalPactDSL.g:8602:3: rule__Jurisdiction__CustomJurisdictionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__CustomJurisdictionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__2"
    // InternalPactDSL.g:8610:1: rule__Jurisdiction__Group__2 : rule__Jurisdiction__Group__2__Impl ;
    public final void rule__Jurisdiction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8614:1: ( rule__Jurisdiction__Group__2__Impl )
            // InternalPactDSL.g:8615:2: rule__Jurisdiction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2"


    // $ANTLR start "rule__Jurisdiction__Group__2__Impl"
    // InternalPactDSL.g:8621:1: rule__Jurisdiction__Group__2__Impl : ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) ;
    public final void rule__Jurisdiction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8625:1: ( ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:8626:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:8626:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:8627:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:8628:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==33) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalPactDSL.g:8628:3: rule__Jurisdiction__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Jurisdiction__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2__Impl"


    // $ANTLR start "rule__Notices__Group__0"
    // InternalPactDSL.g:8637:1: rule__Notices__Group__0 : rule__Notices__Group__0__Impl rule__Notices__Group__1 ;
    public final void rule__Notices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8641:1: ( rule__Notices__Group__0__Impl rule__Notices__Group__1 )
            // InternalPactDSL.g:8642:2: rule__Notices__Group__0__Impl rule__Notices__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Notices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0"


    // $ANTLR start "rule__Notices__Group__0__Impl"
    // InternalPactDSL.g:8649:1: rule__Notices__Group__0__Impl : ( 'Notices:' ) ;
    public final void rule__Notices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8653:1: ( ( 'Notices:' ) )
            // InternalPactDSL.g:8654:1: ( 'Notices:' )
            {
            // InternalPactDSL.g:8654:1: ( 'Notices:' )
            // InternalPactDSL.g:8655:2: 'Notices:'
            {
             before(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0__Impl"


    // $ANTLR start "rule__Notices__Group__1"
    // InternalPactDSL.g:8664:1: rule__Notices__Group__1 : rule__Notices__Group__1__Impl ;
    public final void rule__Notices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8668:1: ( rule__Notices__Group__1__Impl )
            // InternalPactDSL.g:8669:2: rule__Notices__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1"


    // $ANTLR start "rule__Notices__Group__1__Impl"
    // InternalPactDSL.g:8675:1: rule__Notices__Group__1__Impl : ( ( rule__Notices__CustomNoticeAssignment_1 ) ) ;
    public final void rule__Notices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8679:1: ( ( ( rule__Notices__CustomNoticeAssignment_1 ) ) )
            // InternalPactDSL.g:8680:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            {
            // InternalPactDSL.g:8680:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            // InternalPactDSL.g:8681:2: ( rule__Notices__CustomNoticeAssignment_1 )
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 
            // InternalPactDSL.g:8682:2: ( rule__Notices__CustomNoticeAssignment_1 )
            // InternalPactDSL.g:8682:3: rule__Notices__CustomNoticeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Notices__CustomNoticeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1__Impl"


    // $ANTLR start "rule__CustomBoilerplate__Group__0"
    // InternalPactDSL.g:8691:1: rule__CustomBoilerplate__Group__0 : rule__CustomBoilerplate__Group__0__Impl rule__CustomBoilerplate__Group__1 ;
    public final void rule__CustomBoilerplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8695:1: ( rule__CustomBoilerplate__Group__0__Impl rule__CustomBoilerplate__Group__1 )
            // InternalPactDSL.g:8696:2: rule__CustomBoilerplate__Group__0__Impl rule__CustomBoilerplate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomBoilerplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomBoilerplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBoilerplate__Group__0"


    // $ANTLR start "rule__CustomBoilerplate__Group__0__Impl"
    // InternalPactDSL.g:8703:1: rule__CustomBoilerplate__Group__0__Impl : ( 'Boilerplate:' ) ;
    public final void rule__CustomBoilerplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8707:1: ( ( 'Boilerplate:' ) )
            // InternalPactDSL.g:8708:1: ( 'Boilerplate:' )
            {
            // InternalPactDSL.g:8708:1: ( 'Boilerplate:' )
            // InternalPactDSL.g:8709:2: 'Boilerplate:'
            {
             before(grammarAccess.getCustomBoilerplateAccess().getBoilerplateKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCustomBoilerplateAccess().getBoilerplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBoilerplate__Group__0__Impl"


    // $ANTLR start "rule__CustomBoilerplate__Group__1"
    // InternalPactDSL.g:8718:1: rule__CustomBoilerplate__Group__1 : rule__CustomBoilerplate__Group__1__Impl ;
    public final void rule__CustomBoilerplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8722:1: ( rule__CustomBoilerplate__Group__1__Impl )
            // InternalPactDSL.g:8723:2: rule__CustomBoilerplate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomBoilerplate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBoilerplate__Group__1"


    // $ANTLR start "rule__CustomBoilerplate__Group__1__Impl"
    // InternalPactDSL.g:8729:1: rule__CustomBoilerplate__Group__1__Impl : ( ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 ) ) ;
    public final void rule__CustomBoilerplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8733:1: ( ( ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 ) ) )
            // InternalPactDSL.g:8734:1: ( ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 ) )
            {
            // InternalPactDSL.g:8734:1: ( ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 ) )
            // InternalPactDSL.g:8735:2: ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 )
            {
             before(grammarAccess.getCustomBoilerplateAccess().getCustomBoilerplateAssignment_1()); 
            // InternalPactDSL.g:8736:2: ( rule__CustomBoilerplate__CustomBoilerplateAssignment_1 )
            // InternalPactDSL.g:8736:3: rule__CustomBoilerplate__CustomBoilerplateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomBoilerplate__CustomBoilerplateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomBoilerplateAccess().getCustomBoilerplateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBoilerplate__Group__1__Impl"


    // $ANTLR start "rule__Model__TitleAssignment_1"
    // InternalPactDSL.g:8745:1: rule__Model__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8749:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8750:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8750:2: ( RULE_STRING )
            // InternalPactDSL.g:8751:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TitleAssignment_1"


    // $ANTLR start "rule__Model__EntityTypesAssignment_4_0"
    // InternalPactDSL.g:8760:1: rule__Model__EntityTypesAssignment_4_0 : ( ruleEntityType ) ;
    public final void rule__Model__EntityTypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8764:1: ( ( ruleEntityType ) )
            // InternalPactDSL.g:8765:2: ( ruleEntityType )
            {
            // InternalPactDSL.g:8765:2: ( ruleEntityType )
            // InternalPactDSL.g:8766:3: ruleEntityType
            {
             before(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntityTypesAssignment_4_0"


    // $ANTLR start "rule__Model__FormalityTypesAssignment_6_0"
    // InternalPactDSL.g:8775:1: rule__Model__FormalityTypesAssignment_6_0 : ( ruleFormalityType ) ;
    public final void rule__Model__FormalityTypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8779:1: ( ( ruleFormalityType ) )
            // InternalPactDSL.g:8780:2: ( ruleFormalityType )
            {
            // InternalPactDSL.g:8780:2: ( ruleFormalityType )
            // InternalPactDSL.g:8781:3: ruleFormalityType
            {
             before(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormalityTypesAssignment_6_0"


    // $ANTLR start "rule__Model__ActionTypesAssignment_8_0"
    // InternalPactDSL.g:8790:1: rule__Model__ActionTypesAssignment_8_0 : ( ruleActionType ) ;
    public final void rule__Model__ActionTypesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8794:1: ( ( ruleActionType ) )
            // InternalPactDSL.g:8795:2: ( ruleActionType )
            {
            // InternalPactDSL.g:8795:2: ( ruleActionType )
            // InternalPactDSL.g:8796:3: ruleActionType
            {
             before(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActionTypesAssignment_8_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_10_0"
    // InternalPactDSL.g:8805:1: rule__Model__StateTypesAssignment_10_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8809:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:8810:2: ( ruleStateType )
            {
            // InternalPactDSL.g:8810:2: ( ruleStateType )
            // InternalPactDSL.g:8811:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_10_0"


    // $ANTLR start "rule__Model__PrimaryObligationTypesAssignment_12_0"
    // InternalPactDSL.g:8820:1: rule__Model__PrimaryObligationTypesAssignment_12_0 : ( rulePrimaryObligationType ) ;
    public final void rule__Model__PrimaryObligationTypesAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8824:1: ( ( rulePrimaryObligationType ) )
            // InternalPactDSL.g:8825:2: ( rulePrimaryObligationType )
            {
            // InternalPactDSL.g:8825:2: ( rulePrimaryObligationType )
            // InternalPactDSL.g:8826:3: rulePrimaryObligationType
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PrimaryObligationTypesAssignment_12_0"


    // $ANTLR start "rule__Model__SecondaryObligationTypesAssignment_14_0"
    // InternalPactDSL.g:8835:1: rule__Model__SecondaryObligationTypesAssignment_14_0 : ( ruleSecondaryObligationType ) ;
    public final void rule__Model__SecondaryObligationTypesAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8839:1: ( ( ruleSecondaryObligationType ) )
            // InternalPactDSL.g:8840:2: ( ruleSecondaryObligationType )
            {
            // InternalPactDSL.g:8840:2: ( ruleSecondaryObligationType )
            // InternalPactDSL.g:8841:3: ruleSecondaryObligationType
            {
             before(grammarAccess.getModelAccess().getSecondaryObligationTypesSecondaryObligationTypeParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSecondaryObligationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSecondaryObligationTypesSecondaryObligationTypeParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SecondaryObligationTypesAssignment_14_0"


    // $ANTLR start "rule__Model__LiabilityTypesAssignment_16_0"
    // InternalPactDSL.g:8850:1: rule__Model__LiabilityTypesAssignment_16_0 : ( ruleLiabilityType ) ;
    public final void rule__Model__LiabilityTypesAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8854:1: ( ( ruleLiabilityType ) )
            // InternalPactDSL.g:8855:2: ( ruleLiabilityType )
            {
            // InternalPactDSL.g:8855:2: ( ruleLiabilityType )
            // InternalPactDSL.g:8856:3: ruleLiabilityType
            {
             before(grammarAccess.getModelAccess().getLiabilityTypesLiabilityTypeParserRuleCall_16_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLiabilityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLiabilityTypesLiabilityTypeParserRuleCall_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__LiabilityTypesAssignment_16_0"


    // $ANTLR start "rule__Model__TerminationTypesAssignment_18_0"
    // InternalPactDSL.g:8865:1: rule__Model__TerminationTypesAssignment_18_0 : ( ruleTerminationType ) ;
    public final void rule__Model__TerminationTypesAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8869:1: ( ( ruleTerminationType ) )
            // InternalPactDSL.g:8870:2: ( ruleTerminationType )
            {
            // InternalPactDSL.g:8870:2: ( ruleTerminationType )
            // InternalPactDSL.g:8871:3: ruleTerminationType
            {
             before(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_18_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TerminationTypesAssignment_18_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_20_0"
    // InternalPactDSL.g:8880:1: rule__Model__StateTypesAssignment_20_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8884:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:8885:2: ( ruleStateType )
            {
            // InternalPactDSL.g:8885:2: ( ruleStateType )
            // InternalPactDSL.g:8886:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_20_0"


    // $ANTLR start "rule__Model__BoilerplateTypesAssignment_22_0"
    // InternalPactDSL.g:8895:1: rule__Model__BoilerplateTypesAssignment_22_0 : ( ruleBoilerplateType ) ;
    public final void rule__Model__BoilerplateTypesAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8899:1: ( ( ruleBoilerplateType ) )
            // InternalPactDSL.g:8900:2: ( ruleBoilerplateType )
            {
            // InternalPactDSL.g:8900:2: ( ruleBoilerplateType )
            // InternalPactDSL.g:8901:3: ruleBoilerplateType
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_22_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_22_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BoilerplateTypesAssignment_22_0"


    // $ANTLR start "rule__EffectiveDate__DayAssignment_1_0"
    // InternalPactDSL.g:8910:1: rule__EffectiveDate__DayAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__DayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8914:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8915:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8915:2: ( RULE_INT )
            // InternalPactDSL.g:8916:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__DayAssignment_1_0"


    // $ANTLR start "rule__EffectiveDate__MonthAssignment_1_1"
    // InternalPactDSL.g:8925:1: rule__EffectiveDate__MonthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__MonthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8929:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8930:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8930:2: ( RULE_INT )
            // InternalPactDSL.g:8931:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__MonthAssignment_1_1"


    // $ANTLR start "rule__EffectiveDate__YearAssignment_1_2"
    // InternalPactDSL.g:8940:1: rule__EffectiveDate__YearAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__YearAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8944:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8945:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8945:2: ( RULE_INT )
            // InternalPactDSL.g:8946:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__YearAssignment_1_2"


    // $ANTLR start "rule__Party__NameAssignment_1"
    // InternalPactDSL.g:8955:1: rule__Party__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Party__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8959:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:8960:2: ( RULE_ID )
            {
            // InternalPactDSL.g:8960:2: ( RULE_ID )
            // InternalPactDSL.g:8961:3: RULE_ID
            {
             before(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__NameAssignment_1"


    // $ANTLR start "rule__Party__FullnameAssignment_2"
    // InternalPactDSL.g:8970:1: rule__Party__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Party__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8974:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8975:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8975:2: ( RULE_STRING )
            // InternalPactDSL.g:8976:3: RULE_STRING
            {
             before(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FullnameAssignment_2"


    // $ANTLR start "rule__Party__FeatureAssignment_3"
    // InternalPactDSL.g:8985:1: rule__Party__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__Party__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8989:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:8990:2: ( ruleFeature )
            {
            // InternalPactDSL.g:8990:2: ( ruleFeature )
            // InternalPactDSL.g:8991:3: ruleFeature
            {
             before(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FeatureAssignment_3"


    // $ANTLR start "rule__ThirdParty__NameAssignment_1"
    // InternalPactDSL.g:9000:1: rule__ThirdParty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ThirdParty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9004:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:9005:2: ( RULE_ID )
            {
            // InternalPactDSL.g:9005:2: ( RULE_ID )
            // InternalPactDSL.g:9006:3: RULE_ID
            {
             before(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__NameAssignment_1"


    // $ANTLR start "rule__ThirdParty__FullnameAssignment_2"
    // InternalPactDSL.g:9015:1: rule__ThirdParty__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ThirdParty__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9019:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9020:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9020:2: ( RULE_STRING )
            // InternalPactDSL.g:9021:3: RULE_STRING
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FullnameAssignment_2"


    // $ANTLR start "rule__ThirdParty__FeatureAssignment_3"
    // InternalPactDSL.g:9030:1: rule__ThirdParty__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__ThirdParty__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9034:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:9035:2: ( ruleFeature )
            {
            // InternalPactDSL.g:9035:2: ( ruleFeature )
            // InternalPactDSL.g:9036:3: ruleFeature
            {
             before(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FeatureAssignment_3"


    // $ANTLR start "rule__SubjectMatter__NameAssignment_1"
    // InternalPactDSL.g:9045:1: rule__SubjectMatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubjectMatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9049:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:9050:2: ( RULE_ID )
            {
            // InternalPactDSL.g:9050:2: ( RULE_ID )
            // InternalPactDSL.g:9051:3: RULE_ID
            {
             before(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__NameAssignment_1"


    // $ANTLR start "rule__SubjectMatter__SubjectMatterAssignment_2"
    // InternalPactDSL.g:9060:1: rule__SubjectMatter__SubjectMatterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubjectMatter__SubjectMatterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9064:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9065:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9065:2: ( RULE_STRING )
            // InternalPactDSL.g:9066:3: RULE_STRING
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__SubjectMatterAssignment_2"


    // $ANTLR start "rule__SubjectMatter__FeatureAssignment_3"
    // InternalPactDSL.g:9075:1: rule__SubjectMatter__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__SubjectMatter__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9079:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:9080:2: ( ruleFeature )
            {
            // InternalPactDSL.g:9080:2: ( ruleFeature )
            // InternalPactDSL.g:9081:3: ruleFeature
            {
             before(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getFeatureFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__FeatureAssignment_3"


    // $ANTLR start "rule__Feature__FeaturetypeAssignment"
    // InternalPactDSL.g:9090:1: rule__Feature__FeaturetypeAssignment : ( ruleFeatureType ) ;
    public final void rule__Feature__FeaturetypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9094:1: ( ( ruleFeatureType ) )
            // InternalPactDSL.g:9095:2: ( ruleFeatureType )
            {
            // InternalPactDSL.g:9095:2: ( ruleFeatureType )
            // InternalPactDSL.g:9096:3: ruleFeatureType
            {
             before(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureType();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getFeaturetypeFeatureTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__FeaturetypeAssignment"


    // $ANTLR start "rule__DefinedTerm__DefinitionAssignment_1"
    // InternalPactDSL.g:9105:1: rule__DefinedTerm__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DefinedTerm__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9109:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9110:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9110:2: ( RULE_STRING )
            // InternalPactDSL.g:9111:3: RULE_STRING
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__DefinitionAssignment_1"


    // $ANTLR start "rule__Address__AddressAssignment_1"
    // InternalPactDSL.g:9120:1: rule__Address__AddressAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Address__AddressAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9124:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9125:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9125:2: ( RULE_STRING )
            // InternalPactDSL.g:9126:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getAddressSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__AddressAssignment_1"


    // $ANTLR start "rule__CompanyNumber__CompanyNumberAssignment_1"
    // InternalPactDSL.g:9135:1: rule__CompanyNumber__CompanyNumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__CompanyNumber__CompanyNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9139:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9140:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9140:2: ( RULE_INT )
            // InternalPactDSL.g:9141:3: RULE_INT
            {
             before(grammarAccess.getCompanyNumberAccess().getCompanyNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getCompanyNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__CompanyNumberAssignment_1"


    // $ANTLR start "rule__CustomFeature__CustomFeatureAssignment_1"
    // InternalPactDSL.g:9150:1: rule__CustomFeature__CustomFeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFeature__CustomFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9154:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9155:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9155:2: ( RULE_STRING )
            // InternalPactDSL.g:9156:3: RULE_STRING
            {
             before(grammarAccess.getCustomFeatureAccess().getCustomFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomFeatureAccess().getCustomFeatureSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFeature__CustomFeatureAssignment_1"


    // $ANTLR start "rule__InWriting__CustomWritingFormalityAssignment_1"
    // InternalPactDSL.g:9165:1: rule__InWriting__CustomWritingFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InWriting__CustomWritingFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9169:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9170:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9170:2: ( RULE_STRING )
            // InternalPactDSL.g:9171:3: RULE_STRING
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__CustomWritingFormalityAssignment_1"


    // $ANTLR start "rule__ByEmail__EmailAddressAssignment_2"
    // InternalPactDSL.g:9180:1: rule__ByEmail__EmailAddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ByEmail__EmailAddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9184:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9185:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9185:2: ( RULE_STRING )
            // InternalPactDSL.g:9186:3: RULE_STRING
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__EmailAddressAssignment_2"


    // $ANTLR start "rule__GivingNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:9195:1: rule__GivingNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__GivingNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9199:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9200:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9200:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9201:3: ( RULE_ID )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9202:3: ( RULE_ID )
            // InternalPactDSL.g:9203:4: RULE_ID
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__GivingNotice__NumDaysAssignment_2_1"
    // InternalPactDSL.g:9214:1: rule__GivingNotice__NumDaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GivingNotice__NumDaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9218:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9219:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9219:2: ( RULE_INT )
            // InternalPactDSL.g:9220:3: RULE_INT
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__NumDaysAssignment_2_1"


    // $ANTLR start "rule__CustomFormality__CustomFormalityAssignment_1"
    // InternalPactDSL.g:9229:1: rule__CustomFormality__CustomFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFormality__CustomFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9233:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9234:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9234:2: ( RULE_STRING )
            // InternalPactDSL.g:9235:3: RULE_STRING
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__CustomFormalityAssignment_1"


    // $ANTLR start "rule__GivenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:9244:1: rule__GivenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9248:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9249:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9249:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9250:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:9251:3: ( RULE_ID )
            // InternalPactDSL.g:9252:4: RULE_ID
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__GivenWrittenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:9263:1: rule__GivenWrittenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenWrittenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9267:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9268:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9268:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9269:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:9270:3: ( RULE_ID )
            // InternalPactDSL.g:9271:4: RULE_ID
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__CustomAction__SuperTypeAssignment_0"
    // InternalPactDSL.g:9282:1: rule__CustomAction__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CustomAction__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9286:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9287:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9287:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9288:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomActionAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:9289:3: ( RULE_ID )
            // InternalPactDSL.g:9290:4: RULE_ID
            {
             before(grammarAccess.getCustomActionAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomActionAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCustomActionAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__SuperTypeAssignment_0"


    // $ANTLR start "rule__CustomAction__CustomActionAssignment_1"
    // InternalPactDSL.g:9301:1: rule__CustomAction__CustomActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomAction__CustomActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9305:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9306:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9306:2: ( RULE_STRING )
            // InternalPactDSL.g:9307:3: RULE_STRING
            {
             before(grammarAccess.getCustomActionAccess().getCustomActionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomActionAccess().getCustomActionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAction__CustomActionAssignment_1"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_1"
    // InternalPactDSL.g:9316:1: rule__Ownership__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9320:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9321:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9321:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9322:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9323:3: ( RULE_ID )
            // InternalPactDSL.g:9324:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_1"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_3"
    // InternalPactDSL.g:9335:1: rule__Ownership__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9339:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9340:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9340:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9341:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:9342:3: ( RULE_ID )
            // InternalPactDSL.g:9343:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_3"


    // $ANTLR start "rule__Ownership__CustomOwnershipAssignment_4"
    // InternalPactDSL.g:9354:1: rule__Ownership__CustomOwnershipAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Ownership__CustomOwnershipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9358:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9359:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9359:2: ( RULE_STRING )
            // InternalPactDSL.g:9360:3: RULE_STRING
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__CustomOwnershipAssignment_4"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_1"
    // InternalPactDSL.g:9369:1: rule__RightToUse__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9373:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9374:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9374:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9375:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9376:3: ( RULE_ID )
            // InternalPactDSL.g:9377:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_1"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_3"
    // InternalPactDSL.g:9388:1: rule__RightToUse__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9392:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9393:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9393:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9394:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:9395:3: ( RULE_ID )
            // InternalPactDSL.g:9396:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_3"


    // $ANTLR start "rule__RightToUse__CustomUsageAssignment_4"
    // InternalPactDSL.g:9407:1: rule__RightToUse__CustomUsageAssignment_4 : ( RULE_STRING ) ;
    public final void rule__RightToUse__CustomUsageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9411:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9412:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9412:2: ( RULE_STRING )
            // InternalPactDSL.g:9413:3: RULE_STRING
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__CustomUsageAssignment_4"


    // $ANTLR start "rule__CustomState__SuperTypeAssignment_1"
    // InternalPactDSL.g:9422:1: rule__CustomState__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomState__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9426:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9427:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9427:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9428:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9429:3: ( RULE_ID )
            // InternalPactDSL.g:9430:4: RULE_ID
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomStateAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCustomStateAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__SuperTypeAssignment_1"


    // $ANTLR start "rule__CustomState__SuperTypeAssignment_2"
    // InternalPactDSL.g:9441:1: rule__CustomState__SuperTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__CustomState__SuperTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9445:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9446:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9446:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9447:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypeSubjectMatterCrossReference_2_0()); 
            // InternalPactDSL.g:9448:3: ( RULE_ID )
            // InternalPactDSL.g:9449:4: RULE_ID
            {
             before(grammarAccess.getCustomStateAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomStateAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCustomStateAccess().getSuperTypeSubjectMatterCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__SuperTypeAssignment_2"


    // $ANTLR start "rule__CustomState__CustomStateAssignment_3"
    // InternalPactDSL.g:9460:1: rule__CustomState__CustomStateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CustomState__CustomStateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9464:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9465:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9465:2: ( RULE_STRING )
            // InternalPactDSL.g:9466:3: RULE_STRING
            {
             before(grammarAccess.getCustomStateAccess().getCustomStateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomStateAccess().getCustomStateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomState__CustomStateAssignment_3"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:9475:1: rule__PaymentObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9479:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9480:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9480:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9481:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9482:3: ( RULE_ID )
            // InternalPactDSL.g:9483:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__PaymentObligation__SumAssignment_4"
    // InternalPactDSL.g:9494:1: rule__PaymentObligation__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9498:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9499:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9499:2: ( RULE_INT )
            // InternalPactDSL.g:9500:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SumAssignment_4"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:9509:1: rule__PaymentObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9513:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9514:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9514:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9515:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:9516:3: ( RULE_ID )
            // InternalPactDSL.g:9517:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__PaymentObligation__DayAssignment_7_2"
    // InternalPactDSL.g:9528:1: rule__PaymentObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9532:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9533:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9533:2: ( RULE_INT )
            // InternalPactDSL.g:9534:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__DayAssignment_7_2"


    // $ANTLR start "rule__PaymentObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:9543:1: rule__PaymentObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9547:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9548:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9548:2: ( RULE_INT )
            // InternalPactDSL.g:9549:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__PaymentObligation__YearAssignment_7_4"
    // InternalPactDSL.g:9558:1: rule__PaymentObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9562:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9563:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9563:2: ( RULE_INT )
            // InternalPactDSL.g:9564:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__YearAssignment_7_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:9573:1: rule__DeliveryObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9577:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9578:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9578:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9579:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9580:3: ( RULE_ID )
            // InternalPactDSL.g:9581:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:9592:1: rule__DeliveryObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9596:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9597:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9597:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9598:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9599:3: ( RULE_ID )
            // InternalPactDSL.g:9600:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:9611:1: rule__DeliveryObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9615:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9616:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9616:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9617:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:9618:3: ( RULE_ID )
            // InternalPactDSL.g:9619:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__DeliveryObligation__DayAssignment_7_2"
    // InternalPactDSL.g:9630:1: rule__DeliveryObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9634:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9635:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9635:2: ( RULE_INT )
            // InternalPactDSL.g:9636:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__DayAssignment_7_2"


    // $ANTLR start "rule__DeliveryObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:9645:1: rule__DeliveryObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9649:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9650:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9650:2: ( RULE_INT )
            // InternalPactDSL.g:9651:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__DeliveryObligation__YearAssignment_7_4"
    // InternalPactDSL.g:9660:1: rule__DeliveryObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9664:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9665:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9665:2: ( RULE_INT )
            // InternalPactDSL.g:9666:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__YearAssignment_7_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:9675:1: rule__TransferObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9679:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9680:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9680:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9681:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9682:3: ( RULE_ID )
            // InternalPactDSL.g:9683:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:9694:1: rule__TransferObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9698:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9699:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9699:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9700:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9701:3: ( RULE_ID )
            // InternalPactDSL.g:9702:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:9713:1: rule__TransferObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9717:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9718:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9718:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9719:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:9720:3: ( RULE_ID )
            // InternalPactDSL.g:9721:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__TransferObligation__DayAssignment_7_2"
    // InternalPactDSL.g:9732:1: rule__TransferObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__TransferObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9736:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9737:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9737:2: ( RULE_INT )
            // InternalPactDSL.g:9738:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__DayAssignment_7_2"


    // $ANTLR start "rule__TransferObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:9747:1: rule__TransferObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__TransferObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9751:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9752:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9752:2: ( RULE_INT )
            // InternalPactDSL.g:9753:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__TransferObligation__YearAssignment_7_4"
    // InternalPactDSL.g:9762:1: rule__TransferObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__TransferObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9766:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9767:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9767:2: ( RULE_INT )
            // InternalPactDSL.g:9768:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__YearAssignment_7_4"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:9777:1: rule__LicenceObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9781:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9782:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9782:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9783:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9784:3: ( RULE_ID )
            // InternalPactDSL.g:9785:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:9796:1: rule__LicenceObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9800:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9801:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9801:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9802:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 
            // InternalPactDSL.g:9803:3: ( RULE_ID )
            // InternalPactDSL.g:9804:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_8"
    // InternalPactDSL.g:9815:1: rule__LicenceObligation__SuperTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9819:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9820:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9820:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9821:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 
            // InternalPactDSL.g:9822:3: ( RULE_ID )
            // InternalPactDSL.g:9823:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_8"


    // $ANTLR start "rule__LicenceObligation__DayAssignment_9_2"
    // InternalPactDSL.g:9834:1: rule__LicenceObligation__DayAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__DayAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9838:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9839:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9839:2: ( RULE_INT )
            // InternalPactDSL.g:9840:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__DayAssignment_9_2"


    // $ANTLR start "rule__LicenceObligation__MonthAssignment_9_3"
    // InternalPactDSL.g:9849:1: rule__LicenceObligation__MonthAssignment_9_3 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__MonthAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9853:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9854:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9854:2: ( RULE_INT )
            // InternalPactDSL.g:9855:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__MonthAssignment_9_3"


    // $ANTLR start "rule__LicenceObligation__YearAssignment_9_4"
    // InternalPactDSL.g:9864:1: rule__LicenceObligation__YearAssignment_9_4 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__YearAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9868:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9869:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9869:2: ( RULE_INT )
            // InternalPactDSL.g:9870:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__YearAssignment_9_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:9879:1: rule__ConstraintParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9883:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9884:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9884:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9885:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9886:3: ( RULE_ID )
            // InternalPactDSL.g:9887:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:9898:1: rule__ConstraintParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9902:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9903:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9903:2: ( RULE_STRING )
            // InternalPactDSL.g:9904:3: RULE_STRING
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:9913:1: rule__ConstraintParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9917:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9918:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9918:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9919:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9920:3: ( RULE_ID )
            // InternalPactDSL.g:9921:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:9932:1: rule__ConstraintParty__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9936:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9937:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9937:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9938:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 
            // InternalPactDSL.g:9939:3: ( RULE_ID )
            // InternalPactDSL.g:9940:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:9951:1: rule__ConstraintThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9955:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9956:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9956:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9957:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9958:3: ( RULE_ID )
            // InternalPactDSL.g:9959:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:9970:1: rule__ConstraintThirdParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9974:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9975:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9975:2: ( RULE_STRING )
            // InternalPactDSL.g:9976:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:9985:1: rule__ConstraintThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9989:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9990:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9990:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9991:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9992:3: ( RULE_ID )
            // InternalPactDSL.g:9993:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"
    // InternalPactDSL.g:10004:1: rule__ConstraintThirdParty__AdditionalInfoAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__AdditionalInfoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10008:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10009:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10009:2: ( RULE_STRING )
            // InternalPactDSL.g:10010:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"
    // InternalPactDSL.g:10019:1: rule__ConstraintThirdParty__SuperTypeAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10023:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10024:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10024:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10025:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 
            // InternalPactDSL.g:10026:3: ( RULE_ID )
            // InternalPactDSL.g:10027:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"
    // InternalPactDSL.g:10038:1: rule__ConstraintThirdParty__SuperTypeAssignment_7_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10042:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10043:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10043:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10044:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 
            // InternalPactDSL.g:10045:3: ( RULE_ID )
            // InternalPactDSL.g:10046:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"


    // $ANTLR start "rule__CustomObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:10057:1: rule__CustomObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10061:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10062:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10062:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10063:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10064:3: ( RULE_ID )
            // InternalPactDSL.g:10065:4: RULE_ID
            {
             before(grammarAccess.getCustomObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCustomObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__CustomObligation__CustomObligationAssignment_3"
    // InternalPactDSL.g:10076:1: rule__CustomObligation__CustomObligationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__CustomObligation__CustomObligationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10080:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10081:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10081:2: ( RULE_STRING )
            // InternalPactDSL.g:10082:3: RULE_STRING
            {
             before(grammarAccess.getCustomObligationAccess().getCustomObligationSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getCustomObligationSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__CustomObligationAssignment_3"


    // $ANTLR start "rule__CustomObligation__DayAssignment_4_2"
    // InternalPactDSL.g:10091:1: rule__CustomObligation__DayAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__CustomObligation__DayAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10095:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:10096:2: ( RULE_INT )
            {
            // InternalPactDSL.g:10096:2: ( RULE_INT )
            // InternalPactDSL.g:10097:3: RULE_INT
            {
             before(grammarAccess.getCustomObligationAccess().getDayINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getDayINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__DayAssignment_4_2"


    // $ANTLR start "rule__CustomObligation__MonthAssignment_4_3"
    // InternalPactDSL.g:10106:1: rule__CustomObligation__MonthAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__CustomObligation__MonthAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10110:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:10111:2: ( RULE_INT )
            {
            // InternalPactDSL.g:10111:2: ( RULE_INT )
            // InternalPactDSL.g:10112:3: RULE_INT
            {
             before(grammarAccess.getCustomObligationAccess().getMonthINTTerminalRuleCall_4_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getMonthINTTerminalRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__MonthAssignment_4_3"


    // $ANTLR start "rule__CustomObligation__YearAssignment_4_4"
    // InternalPactDSL.g:10121:1: rule__CustomObligation__YearAssignment_4_4 : ( RULE_INT ) ;
    public final void rule__CustomObligation__YearAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10125:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:10126:2: ( RULE_INT )
            {
            // InternalPactDSL.g:10126:2: ( RULE_INT )
            // InternalPactDSL.g:10127:3: RULE_INT
            {
             before(grammarAccess.getCustomObligationAccess().getYearINTTerminalRuleCall_4_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCustomObligationAccess().getYearINTTerminalRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomObligation__YearAssignment_4_4"


    // $ANTLR start "rule__SecondaryObligationType__SuperTypeAssignment_1"
    // InternalPactDSL.g:10136:1: rule__SecondaryObligationType__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SecondaryObligationType__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10140:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10141:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10141:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10142:3: ( RULE_ID )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10143:3: ( RULE_ID )
            // InternalPactDSL.g:10144:4: RULE_ID
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__SuperTypeAssignment_1"


    // $ANTLR start "rule__SecondaryObligationType__SumAssignment_4"
    // InternalPactDSL.g:10155:1: rule__SecondaryObligationType__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__SecondaryObligationType__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10159:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:10160:2: ( RULE_INT )
            {
            // InternalPactDSL.g:10160:2: ( RULE_INT )
            // InternalPactDSL.g:10161:3: RULE_INT
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSumINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getSumINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__SumAssignment_4"


    // $ANTLR start "rule__SecondaryObligationType__SuperTypeAssignment_6"
    // InternalPactDSL.g:10170:1: rule__SecondaryObligationType__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SecondaryObligationType__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10174:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10175:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10175:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10176:3: ( RULE_ID )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:10177:3: ( RULE_ID )
            // InternalPactDSL.g:10178:4: RULE_ID
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__SuperTypeAssignment_6"


    // $ANTLR start "rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8"
    // InternalPactDSL.g:10189:1: rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10193:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10194:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10194:2: ( RULE_STRING )
            // InternalPactDSL.g:10195:3: RULE_STRING
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8"


    // $ANTLR start "rule__LiabilityToParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:10204:1: rule__LiabilityToParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityToParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10208:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10209:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10209:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10210:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10211:3: ( RULE_ID )
            // InternalPactDSL.g:10212:4: RULE_ID
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__LiabilityToParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:10223:1: rule__LiabilityToParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityToParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10227:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10228:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10228:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10229:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_4_0()); 
            // InternalPactDSL.g:10230:3: ( RULE_ID )
            // InternalPactDSL.g:10231:4: RULE_ID
            {
             before(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLiabilityToPartyAccess().getSuperTypePartyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__LiabilityToParty__CustomLossAssignment_6"
    // InternalPactDSL.g:10242:1: rule__LiabilityToParty__CustomLossAssignment_6 : ( RULE_STRING ) ;
    public final void rule__LiabilityToParty__CustomLossAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10246:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10247:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10247:2: ( RULE_STRING )
            // InternalPactDSL.g:10248:3: RULE_STRING
            {
             before(grammarAccess.getLiabilityToPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiabilityToPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToParty__CustomLossAssignment_6"


    // $ANTLR start "rule__LiabilityToThirdParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:10257:1: rule__LiabilityToThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityToThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10261:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10262:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10262:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10263:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10264:3: ( RULE_ID )
            // InternalPactDSL.g:10265:4: RULE_ID
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__LiabilityToThirdParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:10276:1: rule__LiabilityToThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityToThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10280:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10281:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10281:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10282:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeThirdPartyCrossReference_4_0()); 
            // InternalPactDSL.g:10283:3: ( RULE_ID )
            // InternalPactDSL.g:10284:4: RULE_ID
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLiabilityToThirdPartyAccess().getSuperTypeThirdPartyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__LiabilityToThirdParty__CustomLossAssignment_6"
    // InternalPactDSL.g:10295:1: rule__LiabilityToThirdParty__CustomLossAssignment_6 : ( RULE_STRING ) ;
    public final void rule__LiabilityToThirdParty__CustomLossAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10299:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10300:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10300:2: ( RULE_STRING )
            // InternalPactDSL.g:10301:3: RULE_STRING
            {
             before(grammarAccess.getLiabilityToThirdPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiabilityToThirdPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityToThirdParty__CustomLossAssignment_6"


    // $ANTLR start "rule__ForConvenience__SuperTypeAssignment_1"
    // InternalPactDSL.g:10310:1: rule__ForConvenience__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForConvenience__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10314:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10315:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10315:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10316:3: ( RULE_ID )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10317:3: ( RULE_ID )
            // InternalPactDSL.g:10318:4: RULE_ID
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForConvenience__CustomTerminationAssignment_5"
    // InternalPactDSL.g:10329:1: rule__ForConvenience__CustomTerminationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForConvenience__CustomTerminationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10333:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10334:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10334:2: ( RULE_STRING )
            // InternalPactDSL.g:10335:3: RULE_STRING
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__CustomTerminationAssignment_5"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:10344:1: rule__OnReasonableNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10348:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10349:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10349:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10350:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10351:3: ( RULE_ID )
            // InternalPactDSL.g:10352:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_5"
    // InternalPactDSL.g:10363:1: rule__OnReasonableNotice__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10367:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10368:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10368:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10369:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 
            // InternalPactDSL.g:10370:3: ( RULE_ID )
            // InternalPactDSL.g:10371:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_1"
    // InternalPactDSL.g:10382:1: rule__ForBreach__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10386:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10387:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10387:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10388:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10389:3: ( RULE_ID )
            // InternalPactDSL.g:10390:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForBreach__ObligationBreachedAssignment_5"
    // InternalPactDSL.g:10401:1: rule__ForBreach__ObligationBreachedAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForBreach__ObligationBreachedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10405:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10406:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10406:2: ( RULE_STRING )
            // InternalPactDSL.g:10407:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__ObligationBreachedAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_7"
    // InternalPactDSL.g:10416:1: rule__ForBreach__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10420:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10421:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10421:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10422:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:10423:3: ( RULE_ID )
            // InternalPactDSL.g:10424:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_7"


    // $ANTLR start "rule__ForBreach__RemedialSchemeAssignment_8_1"
    // InternalPactDSL.g:10435:1: rule__ForBreach__RemedialSchemeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ForBreach__RemedialSchemeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10439:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10440:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10440:2: ( RULE_STRING )
            // InternalPactDSL.g:10441:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__RemedialSchemeAssignment_8_1"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_1"
    // InternalPactDSL.g:10450:1: rule__OnInsolvencyEvent__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10454:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10455:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10455:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10456:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10457:3: ( RULE_ID )
            // InternalPactDSL.g:10458:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"
    // InternalPactDSL.g:10469:1: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 : ( RULE_STRING ) ;
    public final void rule__OnInsolvencyEvent__InsolvencyEventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10473:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10474:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10474:2: ( RULE_STRING )
            // InternalPactDSL.g:10475:3: RULE_STRING
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_7"
    // InternalPactDSL.g:10484:1: rule__OnInsolvencyEvent__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10488:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10489:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10489:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10490:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:10491:3: ( RULE_ID )
            // InternalPactDSL.g:10492:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_7"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_1"
    // InternalPactDSL.g:10503:1: rule__CustomTermination__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10507:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10508:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10508:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10509:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:10510:3: ( RULE_ID )
            // InternalPactDSL.g:10511:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_1"


    // $ANTLR start "rule__CustomTermination__CustomTerminationClauseAssignment_4"
    // InternalPactDSL.g:10522:1: rule__CustomTermination__CustomTerminationClauseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomTermination__CustomTerminationClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10526:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10527:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10527:2: ( RULE_STRING )
            // InternalPactDSL.g:10528:3: RULE_STRING
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__CustomTerminationClauseAssignment_4"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:10537:1: rule__CustomTermination__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10541:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:10542:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:10542:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:10543:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 
            // InternalPactDSL.g:10544:3: ( RULE_ID )
            // InternalPactDSL.g:10545:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ApplicableLaw__CustomApplicableLawAssignment_1"
    // InternalPactDSL.g:10556:1: rule__ApplicableLaw__CustomApplicableLawAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicableLaw__CustomApplicableLawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10560:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10561:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10561:2: ( RULE_STRING )
            // InternalPactDSL.g:10562:3: RULE_STRING
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__CustomApplicableLawAssignment_1"


    // $ANTLR start "rule__ApplicableLaw__DefinitionAssignment_2"
    // InternalPactDSL.g:10571:1: rule__ApplicableLaw__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__ApplicableLaw__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10575:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:10576:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:10576:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:10577:3: ruleDefinedTerm
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__DefinitionAssignment_2"


    // $ANTLR start "rule__Jurisdiction__CustomJurisdictionAssignment_1"
    // InternalPactDSL.g:10586:1: rule__Jurisdiction__CustomJurisdictionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Jurisdiction__CustomJurisdictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10590:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10591:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10591:2: ( RULE_STRING )
            // InternalPactDSL.g:10592:3: RULE_STRING
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__CustomJurisdictionAssignment_1"


    // $ANTLR start "rule__Jurisdiction__DefinitionAssignment_2"
    // InternalPactDSL.g:10601:1: rule__Jurisdiction__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__Jurisdiction__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10605:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:10606:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:10606:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:10607:3: ruleDefinedTerm
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__DefinitionAssignment_2"


    // $ANTLR start "rule__Notices__CustomNoticeAssignment_1"
    // InternalPactDSL.g:10616:1: rule__Notices__CustomNoticeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notices__CustomNoticeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10620:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10621:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10621:2: ( RULE_STRING )
            // InternalPactDSL.g:10622:3: RULE_STRING
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__CustomNoticeAssignment_1"


    // $ANTLR start "rule__CustomBoilerplate__CustomBoilerplateAssignment_1"
    // InternalPactDSL.g:10631:1: rule__CustomBoilerplate__CustomBoilerplateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomBoilerplate__CustomBoilerplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:10635:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:10636:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:10636:2: ( RULE_STRING )
            // InternalPactDSL.g:10637:3: RULE_STRING
            {
             before(grammarAccess.getCustomBoilerplateAccess().getCustomBoilerplateSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomBoilerplateAccess().getCustomBoilerplateSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomBoilerplate__CustomBoilerplateAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001C96000F00040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001E0000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000096000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x62A2000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0001C0001F000000L,0x00000000000EB328L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x62A2000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000120L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L,0x000000000000B200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000008000000050L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000200000000L});

}