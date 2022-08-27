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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'owns'", "'mustReturn'", "'mayUse'", "'mayNotUse'", "'ContractTitle:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'SecondaryObligations:'", "'Liability'", "'Termination:'", "'StateAfterContractDischarged:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'Ownership:'", "'RightToUse:'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'SecondaryObligation:'", "'uponBreachOf'", "'LiabilityParty:'", "'shallNotBeLiable'", "'for'", "'LiabilityThirdParty:'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
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


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:553:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:554:1: ( ruleStateType EOF )
            // InternalPactDSL.g:555:1: ruleStateType EOF
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
    // InternalPactDSL.g:562:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:566:2: ( ( ( rule__StateType__Alternatives ) ) )
            // InternalPactDSL.g:567:2: ( ( rule__StateType__Alternatives ) )
            {
            // InternalPactDSL.g:567:2: ( ( rule__StateType__Alternatives ) )
            // InternalPactDSL.g:568:3: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:569:3: ( rule__StateType__Alternatives )
            // InternalPactDSL.g:569:4: rule__StateType__Alternatives
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
    // InternalPactDSL.g:578:1: entryRuleOwnership : ruleOwnership EOF ;
    public final void entryRuleOwnership() throws RecognitionException {
        try {
            // InternalPactDSL.g:579:1: ( ruleOwnership EOF )
            // InternalPactDSL.g:580:1: ruleOwnership EOF
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
    // InternalPactDSL.g:587:1: ruleOwnership : ( ( rule__Ownership__Group__0 ) ) ;
    public final void ruleOwnership() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:591:2: ( ( ( rule__Ownership__Group__0 ) ) )
            // InternalPactDSL.g:592:2: ( ( rule__Ownership__Group__0 ) )
            {
            // InternalPactDSL.g:592:2: ( ( rule__Ownership__Group__0 ) )
            // InternalPactDSL.g:593:3: ( rule__Ownership__Group__0 )
            {
             before(grammarAccess.getOwnershipAccess().getGroup()); 
            // InternalPactDSL.g:594:3: ( rule__Ownership__Group__0 )
            // InternalPactDSL.g:594:4: rule__Ownership__Group__0
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
    // InternalPactDSL.g:603:1: entryRuleRightToUse : ruleRightToUse EOF ;
    public final void entryRuleRightToUse() throws RecognitionException {
        try {
            // InternalPactDSL.g:604:1: ( ruleRightToUse EOF )
            // InternalPactDSL.g:605:1: ruleRightToUse EOF
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
    // InternalPactDSL.g:612:1: ruleRightToUse : ( ( rule__RightToUse__Group__0 ) ) ;
    public final void ruleRightToUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:616:2: ( ( ( rule__RightToUse__Group__0 ) ) )
            // InternalPactDSL.g:617:2: ( ( rule__RightToUse__Group__0 ) )
            {
            // InternalPactDSL.g:617:2: ( ( rule__RightToUse__Group__0 ) )
            // InternalPactDSL.g:618:3: ( rule__RightToUse__Group__0 )
            {
             before(grammarAccess.getRightToUseAccess().getGroup()); 
            // InternalPactDSL.g:619:3: ( rule__RightToUse__Group__0 )
            // InternalPactDSL.g:619:4: rule__RightToUse__Group__0
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


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:628:1: entryRulePrimaryObligationType : rulePrimaryObligationType EOF ;
    public final void entryRulePrimaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:629:1: ( rulePrimaryObligationType EOF )
            // InternalPactDSL.g:630:1: rulePrimaryObligationType EOF
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
    // InternalPactDSL.g:637:1: rulePrimaryObligationType : ( ( rule__PrimaryObligationType__Alternatives ) ) ;
    public final void rulePrimaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:641:2: ( ( ( rule__PrimaryObligationType__Alternatives ) ) )
            // InternalPactDSL.g:642:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            {
            // InternalPactDSL.g:642:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            // InternalPactDSL.g:643:3: ( rule__PrimaryObligationType__Alternatives )
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:644:3: ( rule__PrimaryObligationType__Alternatives )
            // InternalPactDSL.g:644:4: rule__PrimaryObligationType__Alternatives
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
    // InternalPactDSL.g:653:1: entryRulePaymentObligation : rulePaymentObligation EOF ;
    public final void entryRulePaymentObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:654:1: ( rulePaymentObligation EOF )
            // InternalPactDSL.g:655:1: rulePaymentObligation EOF
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
    // InternalPactDSL.g:662:1: rulePaymentObligation : ( ( rule__PaymentObligation__Group__0 ) ) ;
    public final void rulePaymentObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:666:2: ( ( ( rule__PaymentObligation__Group__0 ) ) )
            // InternalPactDSL.g:667:2: ( ( rule__PaymentObligation__Group__0 ) )
            {
            // InternalPactDSL.g:667:2: ( ( rule__PaymentObligation__Group__0 ) )
            // InternalPactDSL.g:668:3: ( rule__PaymentObligation__Group__0 )
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup()); 
            // InternalPactDSL.g:669:3: ( rule__PaymentObligation__Group__0 )
            // InternalPactDSL.g:669:4: rule__PaymentObligation__Group__0
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
    // InternalPactDSL.g:678:1: entryRuleDeliveryObligation : ruleDeliveryObligation EOF ;
    public final void entryRuleDeliveryObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:679:1: ( ruleDeliveryObligation EOF )
            // InternalPactDSL.g:680:1: ruleDeliveryObligation EOF
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
    // InternalPactDSL.g:687:1: ruleDeliveryObligation : ( ( rule__DeliveryObligation__Group__0 ) ) ;
    public final void ruleDeliveryObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:691:2: ( ( ( rule__DeliveryObligation__Group__0 ) ) )
            // InternalPactDSL.g:692:2: ( ( rule__DeliveryObligation__Group__0 ) )
            {
            // InternalPactDSL.g:692:2: ( ( rule__DeliveryObligation__Group__0 ) )
            // InternalPactDSL.g:693:3: ( rule__DeliveryObligation__Group__0 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup()); 
            // InternalPactDSL.g:694:3: ( rule__DeliveryObligation__Group__0 )
            // InternalPactDSL.g:694:4: rule__DeliveryObligation__Group__0
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
    // InternalPactDSL.g:703:1: entryRuleTransferObligation : ruleTransferObligation EOF ;
    public final void entryRuleTransferObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:704:1: ( ruleTransferObligation EOF )
            // InternalPactDSL.g:705:1: ruleTransferObligation EOF
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
    // InternalPactDSL.g:712:1: ruleTransferObligation : ( ( rule__TransferObligation__Group__0 ) ) ;
    public final void ruleTransferObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:716:2: ( ( ( rule__TransferObligation__Group__0 ) ) )
            // InternalPactDSL.g:717:2: ( ( rule__TransferObligation__Group__0 ) )
            {
            // InternalPactDSL.g:717:2: ( ( rule__TransferObligation__Group__0 ) )
            // InternalPactDSL.g:718:3: ( rule__TransferObligation__Group__0 )
            {
             before(grammarAccess.getTransferObligationAccess().getGroup()); 
            // InternalPactDSL.g:719:3: ( rule__TransferObligation__Group__0 )
            // InternalPactDSL.g:719:4: rule__TransferObligation__Group__0
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
    // InternalPactDSL.g:728:1: entryRuleLicenceObligation : ruleLicenceObligation EOF ;
    public final void entryRuleLicenceObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:729:1: ( ruleLicenceObligation EOF )
            // InternalPactDSL.g:730:1: ruleLicenceObligation EOF
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
    // InternalPactDSL.g:737:1: ruleLicenceObligation : ( ( rule__LicenceObligation__Group__0 ) ) ;
    public final void ruleLicenceObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:741:2: ( ( ( rule__LicenceObligation__Group__0 ) ) )
            // InternalPactDSL.g:742:2: ( ( rule__LicenceObligation__Group__0 ) )
            {
            // InternalPactDSL.g:742:2: ( ( rule__LicenceObligation__Group__0 ) )
            // InternalPactDSL.g:743:3: ( rule__LicenceObligation__Group__0 )
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup()); 
            // InternalPactDSL.g:744:3: ( rule__LicenceObligation__Group__0 )
            // InternalPactDSL.g:744:4: rule__LicenceObligation__Group__0
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
    // InternalPactDSL.g:753:1: entryRuleConstraintParty : ruleConstraintParty EOF ;
    public final void entryRuleConstraintParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:754:1: ( ruleConstraintParty EOF )
            // InternalPactDSL.g:755:1: ruleConstraintParty EOF
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
    // InternalPactDSL.g:762:1: ruleConstraintParty : ( ( rule__ConstraintParty__Group__0 ) ) ;
    public final void ruleConstraintParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:766:2: ( ( ( rule__ConstraintParty__Group__0 ) ) )
            // InternalPactDSL.g:767:2: ( ( rule__ConstraintParty__Group__0 ) )
            {
            // InternalPactDSL.g:767:2: ( ( rule__ConstraintParty__Group__0 ) )
            // InternalPactDSL.g:768:3: ( rule__ConstraintParty__Group__0 )
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup()); 
            // InternalPactDSL.g:769:3: ( rule__ConstraintParty__Group__0 )
            // InternalPactDSL.g:769:4: rule__ConstraintParty__Group__0
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
    // InternalPactDSL.g:778:1: entryRuleConstraintThirdParty : ruleConstraintThirdParty EOF ;
    public final void entryRuleConstraintThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:779:1: ( ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:780:1: ruleConstraintThirdParty EOF
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
    // InternalPactDSL.g:787:1: ruleConstraintThirdParty : ( ( rule__ConstraintThirdParty__Group__0 ) ) ;
    public final void ruleConstraintThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:791:2: ( ( ( rule__ConstraintThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:792:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:792:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            // InternalPactDSL.g:793:3: ( rule__ConstraintThirdParty__Group__0 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:794:3: ( rule__ConstraintThirdParty__Group__0 )
            // InternalPactDSL.g:794:4: rule__ConstraintThirdParty__Group__0
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


    // $ANTLR start "entryRuleSecondaryObligationType"
    // InternalPactDSL.g:803:1: entryRuleSecondaryObligationType : ruleSecondaryObligationType EOF ;
    public final void entryRuleSecondaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:804:1: ( ruleSecondaryObligationType EOF )
            // InternalPactDSL.g:805:1: ruleSecondaryObligationType EOF
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
    // InternalPactDSL.g:812:1: ruleSecondaryObligationType : ( ( rule__SecondaryObligationType__Group__0 ) ) ;
    public final void ruleSecondaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:816:2: ( ( ( rule__SecondaryObligationType__Group__0 ) ) )
            // InternalPactDSL.g:817:2: ( ( rule__SecondaryObligationType__Group__0 ) )
            {
            // InternalPactDSL.g:817:2: ( ( rule__SecondaryObligationType__Group__0 ) )
            // InternalPactDSL.g:818:3: ( rule__SecondaryObligationType__Group__0 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getGroup()); 
            // InternalPactDSL.g:819:3: ( rule__SecondaryObligationType__Group__0 )
            // InternalPactDSL.g:819:4: rule__SecondaryObligationType__Group__0
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
    // InternalPactDSL.g:828:1: entryRuleLiabilityType : ruleLiabilityType EOF ;
    public final void entryRuleLiabilityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:829:1: ( ruleLiabilityType EOF )
            // InternalPactDSL.g:830:1: ruleLiabilityType EOF
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
    // InternalPactDSL.g:837:1: ruleLiabilityType : ( ( rule__LiabilityType__Alternatives ) ) ;
    public final void ruleLiabilityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:841:2: ( ( ( rule__LiabilityType__Alternatives ) ) )
            // InternalPactDSL.g:842:2: ( ( rule__LiabilityType__Alternatives ) )
            {
            // InternalPactDSL.g:842:2: ( ( rule__LiabilityType__Alternatives ) )
            // InternalPactDSL.g:843:3: ( rule__LiabilityType__Alternatives )
            {
             before(grammarAccess.getLiabilityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:844:3: ( rule__LiabilityType__Alternatives )
            // InternalPactDSL.g:844:4: rule__LiabilityType__Alternatives
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


    // $ANTLR start "entryRuleLiabilityParty"
    // InternalPactDSL.g:853:1: entryRuleLiabilityParty : ruleLiabilityParty EOF ;
    public final void entryRuleLiabilityParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:854:1: ( ruleLiabilityParty EOF )
            // InternalPactDSL.g:855:1: ruleLiabilityParty EOF
            {
             before(grammarAccess.getLiabilityPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleLiabilityParty();

            state._fsp--;

             after(grammarAccess.getLiabilityPartyRule()); 
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
    // $ANTLR end "entryRuleLiabilityParty"


    // $ANTLR start "ruleLiabilityParty"
    // InternalPactDSL.g:862:1: ruleLiabilityParty : ( ( rule__LiabilityParty__Group__0 ) ) ;
    public final void ruleLiabilityParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:866:2: ( ( ( rule__LiabilityParty__Group__0 ) ) )
            // InternalPactDSL.g:867:2: ( ( rule__LiabilityParty__Group__0 ) )
            {
            // InternalPactDSL.g:867:2: ( ( rule__LiabilityParty__Group__0 ) )
            // InternalPactDSL.g:868:3: ( rule__LiabilityParty__Group__0 )
            {
             before(grammarAccess.getLiabilityPartyAccess().getGroup()); 
            // InternalPactDSL.g:869:3: ( rule__LiabilityParty__Group__0 )
            // InternalPactDSL.g:869:4: rule__LiabilityParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiabilityParty"


    // $ANTLR start "entryRuleLiabilityThirdParty"
    // InternalPactDSL.g:878:1: entryRuleLiabilityThirdParty : ruleLiabilityThirdParty EOF ;
    public final void entryRuleLiabilityThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:879:1: ( ruleLiabilityThirdParty EOF )
            // InternalPactDSL.g:880:1: ruleLiabilityThirdParty EOF
            {
             before(grammarAccess.getLiabilityThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleLiabilityThirdParty();

            state._fsp--;

             after(grammarAccess.getLiabilityThirdPartyRule()); 
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
    // $ANTLR end "entryRuleLiabilityThirdParty"


    // $ANTLR start "ruleLiabilityThirdParty"
    // InternalPactDSL.g:887:1: ruleLiabilityThirdParty : ( ( rule__LiabilityThirdParty__Group__0 ) ) ;
    public final void ruleLiabilityThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:891:2: ( ( ( rule__LiabilityThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:892:2: ( ( rule__LiabilityThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:892:2: ( ( rule__LiabilityThirdParty__Group__0 ) )
            // InternalPactDSL.g:893:3: ( rule__LiabilityThirdParty__Group__0 )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:894:3: ( rule__LiabilityThirdParty__Group__0 )
            // InternalPactDSL.g:894:4: rule__LiabilityThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiabilityThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:903:1: entryRuleTerminationType : ruleTerminationType EOF ;
    public final void entryRuleTerminationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:904:1: ( ruleTerminationType EOF )
            // InternalPactDSL.g:905:1: ruleTerminationType EOF
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
    // InternalPactDSL.g:912:1: ruleTerminationType : ( ( rule__TerminationType__Alternatives ) ) ;
    public final void ruleTerminationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:916:2: ( ( ( rule__TerminationType__Alternatives ) ) )
            // InternalPactDSL.g:917:2: ( ( rule__TerminationType__Alternatives ) )
            {
            // InternalPactDSL.g:917:2: ( ( rule__TerminationType__Alternatives ) )
            // InternalPactDSL.g:918:3: ( rule__TerminationType__Alternatives )
            {
             before(grammarAccess.getTerminationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:919:3: ( rule__TerminationType__Alternatives )
            // InternalPactDSL.g:919:4: rule__TerminationType__Alternatives
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
    // InternalPactDSL.g:928:1: entryRuleForConvenience : ruleForConvenience EOF ;
    public final void entryRuleForConvenience() throws RecognitionException {
        try {
            // InternalPactDSL.g:929:1: ( ruleForConvenience EOF )
            // InternalPactDSL.g:930:1: ruleForConvenience EOF
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
    // InternalPactDSL.g:937:1: ruleForConvenience : ( ( rule__ForConvenience__Group__0 ) ) ;
    public final void ruleForConvenience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:941:2: ( ( ( rule__ForConvenience__Group__0 ) ) )
            // InternalPactDSL.g:942:2: ( ( rule__ForConvenience__Group__0 ) )
            {
            // InternalPactDSL.g:942:2: ( ( rule__ForConvenience__Group__0 ) )
            // InternalPactDSL.g:943:3: ( rule__ForConvenience__Group__0 )
            {
             before(grammarAccess.getForConvenienceAccess().getGroup()); 
            // InternalPactDSL.g:944:3: ( rule__ForConvenience__Group__0 )
            // InternalPactDSL.g:944:4: rule__ForConvenience__Group__0
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
    // InternalPactDSL.g:953:1: entryRuleOnReasonableNotice : ruleOnReasonableNotice EOF ;
    public final void entryRuleOnReasonableNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:954:1: ( ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:955:1: ruleOnReasonableNotice EOF
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
    // InternalPactDSL.g:962:1: ruleOnReasonableNotice : ( ( rule__OnReasonableNotice__Group__0 ) ) ;
    public final void ruleOnReasonableNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:966:2: ( ( ( rule__OnReasonableNotice__Group__0 ) ) )
            // InternalPactDSL.g:967:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            {
            // InternalPactDSL.g:967:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            // InternalPactDSL.g:968:3: ( rule__OnReasonableNotice__Group__0 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 
            // InternalPactDSL.g:969:3: ( rule__OnReasonableNotice__Group__0 )
            // InternalPactDSL.g:969:4: rule__OnReasonableNotice__Group__0
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
    // InternalPactDSL.g:978:1: entryRuleForBreach : ruleForBreach EOF ;
    public final void entryRuleForBreach() throws RecognitionException {
        try {
            // InternalPactDSL.g:979:1: ( ruleForBreach EOF )
            // InternalPactDSL.g:980:1: ruleForBreach EOF
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
    // InternalPactDSL.g:987:1: ruleForBreach : ( ( rule__ForBreach__Group__0 ) ) ;
    public final void ruleForBreach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:991:2: ( ( ( rule__ForBreach__Group__0 ) ) )
            // InternalPactDSL.g:992:2: ( ( rule__ForBreach__Group__0 ) )
            {
            // InternalPactDSL.g:992:2: ( ( rule__ForBreach__Group__0 ) )
            // InternalPactDSL.g:993:3: ( rule__ForBreach__Group__0 )
            {
             before(grammarAccess.getForBreachAccess().getGroup()); 
            // InternalPactDSL.g:994:3: ( rule__ForBreach__Group__0 )
            // InternalPactDSL.g:994:4: rule__ForBreach__Group__0
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
    // InternalPactDSL.g:1003:1: entryRuleOnInsolvencyEvent : ruleOnInsolvencyEvent EOF ;
    public final void entryRuleOnInsolvencyEvent() throws RecognitionException {
        try {
            // InternalPactDSL.g:1004:1: ( ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:1005:1: ruleOnInsolvencyEvent EOF
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
    // InternalPactDSL.g:1012:1: ruleOnInsolvencyEvent : ( ( rule__OnInsolvencyEvent__Group__0 ) ) ;
    public final void ruleOnInsolvencyEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1016:2: ( ( ( rule__OnInsolvencyEvent__Group__0 ) ) )
            // InternalPactDSL.g:1017:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            {
            // InternalPactDSL.g:1017:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            // InternalPactDSL.g:1018:3: ( rule__OnInsolvencyEvent__Group__0 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 
            // InternalPactDSL.g:1019:3: ( rule__OnInsolvencyEvent__Group__0 )
            // InternalPactDSL.g:1019:4: rule__OnInsolvencyEvent__Group__0
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
    // InternalPactDSL.g:1028:1: entryRuleCustomTermination : ruleCustomTermination EOF ;
    public final void entryRuleCustomTermination() throws RecognitionException {
        try {
            // InternalPactDSL.g:1029:1: ( ruleCustomTermination EOF )
            // InternalPactDSL.g:1030:1: ruleCustomTermination EOF
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
    // InternalPactDSL.g:1037:1: ruleCustomTermination : ( ( rule__CustomTermination__Group__0 ) ) ;
    public final void ruleCustomTermination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1041:2: ( ( ( rule__CustomTermination__Group__0 ) ) )
            // InternalPactDSL.g:1042:2: ( ( rule__CustomTermination__Group__0 ) )
            {
            // InternalPactDSL.g:1042:2: ( ( rule__CustomTermination__Group__0 ) )
            // InternalPactDSL.g:1043:3: ( rule__CustomTermination__Group__0 )
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup()); 
            // InternalPactDSL.g:1044:3: ( rule__CustomTermination__Group__0 )
            // InternalPactDSL.g:1044:4: rule__CustomTermination__Group__0
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
    // InternalPactDSL.g:1053:1: entryRuleBoilerplateType : ruleBoilerplateType EOF ;
    public final void entryRuleBoilerplateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:1054:1: ( ruleBoilerplateType EOF )
            // InternalPactDSL.g:1055:1: ruleBoilerplateType EOF
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
    // InternalPactDSL.g:1062:1: ruleBoilerplateType : ( ( rule__BoilerplateType__Alternatives ) ) ;
    public final void ruleBoilerplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1066:2: ( ( ( rule__BoilerplateType__Alternatives ) ) )
            // InternalPactDSL.g:1067:2: ( ( rule__BoilerplateType__Alternatives ) )
            {
            // InternalPactDSL.g:1067:2: ( ( rule__BoilerplateType__Alternatives ) )
            // InternalPactDSL.g:1068:3: ( rule__BoilerplateType__Alternatives )
            {
             before(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:1069:3: ( rule__BoilerplateType__Alternatives )
            // InternalPactDSL.g:1069:4: rule__BoilerplateType__Alternatives
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
    // InternalPactDSL.g:1078:1: entryRuleApplicableLaw : ruleApplicableLaw EOF ;
    public final void entryRuleApplicableLaw() throws RecognitionException {
        try {
            // InternalPactDSL.g:1079:1: ( ruleApplicableLaw EOF )
            // InternalPactDSL.g:1080:1: ruleApplicableLaw EOF
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
    // InternalPactDSL.g:1087:1: ruleApplicableLaw : ( ( rule__ApplicableLaw__Group__0 ) ) ;
    public final void ruleApplicableLaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1091:2: ( ( ( rule__ApplicableLaw__Group__0 ) ) )
            // InternalPactDSL.g:1092:2: ( ( rule__ApplicableLaw__Group__0 ) )
            {
            // InternalPactDSL.g:1092:2: ( ( rule__ApplicableLaw__Group__0 ) )
            // InternalPactDSL.g:1093:3: ( rule__ApplicableLaw__Group__0 )
            {
             before(grammarAccess.getApplicableLawAccess().getGroup()); 
            // InternalPactDSL.g:1094:3: ( rule__ApplicableLaw__Group__0 )
            // InternalPactDSL.g:1094:4: rule__ApplicableLaw__Group__0
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
    // InternalPactDSL.g:1103:1: entryRuleJurisdiction : ruleJurisdiction EOF ;
    public final void entryRuleJurisdiction() throws RecognitionException {
        try {
            // InternalPactDSL.g:1104:1: ( ruleJurisdiction EOF )
            // InternalPactDSL.g:1105:1: ruleJurisdiction EOF
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
    // InternalPactDSL.g:1112:1: ruleJurisdiction : ( ( rule__Jurisdiction__Group__0 ) ) ;
    public final void ruleJurisdiction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1116:2: ( ( ( rule__Jurisdiction__Group__0 ) ) )
            // InternalPactDSL.g:1117:2: ( ( rule__Jurisdiction__Group__0 ) )
            {
            // InternalPactDSL.g:1117:2: ( ( rule__Jurisdiction__Group__0 ) )
            // InternalPactDSL.g:1118:3: ( rule__Jurisdiction__Group__0 )
            {
             before(grammarAccess.getJurisdictionAccess().getGroup()); 
            // InternalPactDSL.g:1119:3: ( rule__Jurisdiction__Group__0 )
            // InternalPactDSL.g:1119:4: rule__Jurisdiction__Group__0
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
    // InternalPactDSL.g:1128:1: entryRuleNotices : ruleNotices EOF ;
    public final void entryRuleNotices() throws RecognitionException {
        try {
            // InternalPactDSL.g:1129:1: ( ruleNotices EOF )
            // InternalPactDSL.g:1130:1: ruleNotices EOF
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
    // InternalPactDSL.g:1137:1: ruleNotices : ( ( rule__Notices__Group__0 ) ) ;
    public final void ruleNotices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1141:2: ( ( ( rule__Notices__Group__0 ) ) )
            // InternalPactDSL.g:1142:2: ( ( rule__Notices__Group__0 ) )
            {
            // InternalPactDSL.g:1142:2: ( ( rule__Notices__Group__0 ) )
            // InternalPactDSL.g:1143:3: ( rule__Notices__Group__0 )
            {
             before(grammarAccess.getNoticesAccess().getGroup()); 
            // InternalPactDSL.g:1144:3: ( rule__Notices__Group__0 )
            // InternalPactDSL.g:1144:4: rule__Notices__Group__0
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


    // $ANTLR start "rule__EntityType__Alternatives"
    // InternalPactDSL.g:1152:1: rule__EntityType__Alternatives : ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1156:1: ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
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
                    // InternalPactDSL.g:1157:2: ( ruleEffectiveDate )
                    {
                    // InternalPactDSL.g:1157:2: ( ruleEffectiveDate )
                    // InternalPactDSL.g:1158:3: ruleEffectiveDate
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
                    // InternalPactDSL.g:1163:2: ( ruleParty )
                    {
                    // InternalPactDSL.g:1163:2: ( ruleParty )
                    // InternalPactDSL.g:1164:3: ruleParty
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
                    // InternalPactDSL.g:1169:2: ( ruleThirdParty )
                    {
                    // InternalPactDSL.g:1169:2: ( ruleThirdParty )
                    // InternalPactDSL.g:1170:3: ruleThirdParty
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
                    // InternalPactDSL.g:1175:2: ( ruleSubjectMatter )
                    {
                    // InternalPactDSL.g:1175:2: ( ruleSubjectMatter )
                    // InternalPactDSL.g:1176:3: ruleSubjectMatter
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
    // InternalPactDSL.g:1185:1: rule__FeatureType__Alternatives : ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) );
    public final void rule__FeatureType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1189:1: ( ( ruleDefinedTerm ) | ( ruleAddress ) | ( ruleCompanyNumber ) | ( ruleCustomFeature ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 33:
                {
                alt2=3;
                }
                break;
            case 34:
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
                    // InternalPactDSL.g:1190:2: ( ruleDefinedTerm )
                    {
                    // InternalPactDSL.g:1190:2: ( ruleDefinedTerm )
                    // InternalPactDSL.g:1191:3: ruleDefinedTerm
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
                    // InternalPactDSL.g:1196:2: ( ruleAddress )
                    {
                    // InternalPactDSL.g:1196:2: ( ruleAddress )
                    // InternalPactDSL.g:1197:3: ruleAddress
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
                    // InternalPactDSL.g:1202:2: ( ruleCompanyNumber )
                    {
                    // InternalPactDSL.g:1202:2: ( ruleCompanyNumber )
                    // InternalPactDSL.g:1203:3: ruleCompanyNumber
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
                    // InternalPactDSL.g:1208:2: ( ruleCustomFeature )
                    {
                    // InternalPactDSL.g:1208:2: ( ruleCustomFeature )
                    // InternalPactDSL.g:1209:3: ruleCustomFeature
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
    // InternalPactDSL.g:1218:1: rule__FormalityType__Alternatives : ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) );
    public final void rule__FormalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1222:1: ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 38:
                {
                alt3=3;
                }
                break;
            case 41:
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
                    // InternalPactDSL.g:1223:2: ( ruleInWriting )
                    {
                    // InternalPactDSL.g:1223:2: ( ruleInWriting )
                    // InternalPactDSL.g:1224:3: ruleInWriting
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
                    // InternalPactDSL.g:1229:2: ( ruleByEmail )
                    {
                    // InternalPactDSL.g:1229:2: ( ruleByEmail )
                    // InternalPactDSL.g:1230:3: ruleByEmail
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
                    // InternalPactDSL.g:1235:2: ( ruleGivingNotice )
                    {
                    // InternalPactDSL.g:1235:2: ( ruleGivingNotice )
                    // InternalPactDSL.g:1236:3: ruleGivingNotice
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
                    // InternalPactDSL.g:1241:2: ( ruleCustomFormality )
                    {
                    // InternalPactDSL.g:1241:2: ( ruleCustomFormality )
                    // InternalPactDSL.g:1242:3: ruleCustomFormality
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
    // InternalPactDSL.g:1251:1: rule__ActionType__Alternatives : ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1255:1: ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==42) ) {
                    alt4=1;
                }
                else if ( (LA4_1==43) ) {
                    alt4=2;
                }
                else {
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
                    // InternalPactDSL.g:1256:2: ( ruleGivenConsent )
                    {
                    // InternalPactDSL.g:1256:2: ( ruleGivenConsent )
                    // InternalPactDSL.g:1257:3: ruleGivenConsent
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
                    // InternalPactDSL.g:1262:2: ( ruleGivenWrittenConsent )
                    {
                    // InternalPactDSL.g:1262:2: ( ruleGivenWrittenConsent )
                    // InternalPactDSL.g:1263:3: ruleGivenWrittenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenWrittenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 

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
    // InternalPactDSL.g:1272:1: rule__StateType__Alternatives : ( ( ruleOwnership ) | ( ruleRightToUse ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1276:1: ( ( ruleOwnership ) | ( ruleRightToUse ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==44) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:1277:2: ( ruleOwnership )
                    {
                    // InternalPactDSL.g:1277:2: ( ruleOwnership )
                    // InternalPactDSL.g:1278:3: ruleOwnership
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
                    // InternalPactDSL.g:1283:2: ( ruleRightToUse )
                    {
                    // InternalPactDSL.g:1283:2: ( ruleRightToUse )
                    // InternalPactDSL.g:1284:3: ruleRightToUse
                    {
                     before(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightToUse();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 

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
    // InternalPactDSL.g:1293:1: rule__Ownership__Alternatives_2 : ( ( 'owns' ) | ( 'mustReturn' ) );
    public final void rule__Ownership__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1297:1: ( ( 'owns' ) | ( 'mustReturn' ) )
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
                    // InternalPactDSL.g:1298:2: ( 'owns' )
                    {
                    // InternalPactDSL.g:1298:2: ( 'owns' )
                    // InternalPactDSL.g:1299:3: 'owns'
                    {
                     before(grammarAccess.getOwnershipAccess().getOwnsKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getOwnsKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1304:2: ( 'mustReturn' )
                    {
                    // InternalPactDSL.g:1304:2: ( 'mustReturn' )
                    // InternalPactDSL.g:1305:3: 'mustReturn'
                    {
                     before(grammarAccess.getOwnershipAccess().getMustReturnKeyword_2_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getMustReturnKeyword_2_1()); 

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
    // InternalPactDSL.g:1314:1: rule__RightToUse__Alternatives_2 : ( ( 'mayUse' ) | ( 'mayNotUse' ) );
    public final void rule__RightToUse__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1318:1: ( ( 'mayUse' ) | ( 'mayNotUse' ) )
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
                    // InternalPactDSL.g:1319:2: ( 'mayUse' )
                    {
                    // InternalPactDSL.g:1319:2: ( 'mayUse' )
                    // InternalPactDSL.g:1320:3: 'mayUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayUseKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayUseKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1325:2: ( 'mayNotUse' )
                    {
                    // InternalPactDSL.g:1325:2: ( 'mayNotUse' )
                    // InternalPactDSL.g:1326:3: 'mayNotUse'
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
    // InternalPactDSL.g:1335:1: rule__PrimaryObligationType__Alternatives : ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) );
    public final void rule__PrimaryObligationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1339:1: ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt8=1;
                }
                break;
            case 51:
                {
                alt8=2;
                }
                break;
            case 53:
                {
                alt8=3;
                }
                break;
            case 55:
                {
                alt8=4;
                }
                break;
            case 59:
                {
                alt8=5;
                }
                break;
            case 61:
                {
                alt8=6;
                }
                break;
            case RULE_STRING:
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
                    // InternalPactDSL.g:1340:2: ( rulePaymentObligation )
                    {
                    // InternalPactDSL.g:1340:2: ( rulePaymentObligation )
                    // InternalPactDSL.g:1341:3: rulePaymentObligation
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
                    // InternalPactDSL.g:1346:2: ( ruleDeliveryObligation )
                    {
                    // InternalPactDSL.g:1346:2: ( ruleDeliveryObligation )
                    // InternalPactDSL.g:1347:3: ruleDeliveryObligation
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
                    // InternalPactDSL.g:1352:2: ( ruleTransferObligation )
                    {
                    // InternalPactDSL.g:1352:2: ( ruleTransferObligation )
                    // InternalPactDSL.g:1353:3: ruleTransferObligation
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
                    // InternalPactDSL.g:1358:2: ( ruleLicenceObligation )
                    {
                    // InternalPactDSL.g:1358:2: ( ruleLicenceObligation )
                    // InternalPactDSL.g:1359:3: ruleLicenceObligation
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
                    // InternalPactDSL.g:1364:2: ( ruleConstraintParty )
                    {
                    // InternalPactDSL.g:1364:2: ( ruleConstraintParty )
                    // InternalPactDSL.g:1365:3: ruleConstraintParty
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
                    // InternalPactDSL.g:1370:2: ( ruleConstraintThirdParty )
                    {
                    // InternalPactDSL.g:1370:2: ( ruleConstraintThirdParty )
                    // InternalPactDSL.g:1371:3: ruleConstraintThirdParty
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
                    // InternalPactDSL.g:1376:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    {
                    // InternalPactDSL.g:1376:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    // InternalPactDSL.g:1377:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 
                    // InternalPactDSL.g:1378:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    // InternalPactDSL.g:1378:4: rule__PrimaryObligationType__CustomObligationAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryObligationType__CustomObligationAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 

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


    // $ANTLR start "rule__LiabilityType__Alternatives"
    // InternalPactDSL.g:1386:1: rule__LiabilityType__Alternatives : ( ( ruleLiabilityParty ) | ( ruleLiabilityThirdParty ) );
    public final void rule__LiabilityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1390:1: ( ( ruleLiabilityParty ) | ( ruleLiabilityThirdParty ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==67) ) {
                alt9=1;
            }
            else if ( (LA9_0==70) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPactDSL.g:1391:2: ( ruleLiabilityParty )
                    {
                    // InternalPactDSL.g:1391:2: ( ruleLiabilityParty )
                    // InternalPactDSL.g:1392:3: ruleLiabilityParty
                    {
                     before(grammarAccess.getLiabilityTypeAccess().getLiabilityPartyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiabilityParty();

                    state._fsp--;

                     after(grammarAccess.getLiabilityTypeAccess().getLiabilityPartyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1397:2: ( ruleLiabilityThirdParty )
                    {
                    // InternalPactDSL.g:1397:2: ( ruleLiabilityThirdParty )
                    // InternalPactDSL.g:1398:3: ruleLiabilityThirdParty
                    {
                     before(grammarAccess.getLiabilityTypeAccess().getLiabilityThirdPartyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiabilityThirdParty();

                    state._fsp--;

                     after(grammarAccess.getLiabilityTypeAccess().getLiabilityThirdPartyParserRuleCall_1()); 

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
    // InternalPactDSL.g:1407:1: rule__TerminationType__Alternatives : ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) );
    public final void rule__TerminationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1411:1: ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt10=1;
                }
                break;
            case 74:
                {
                alt10=2;
                }
                break;
            case 75:
                {
                alt10=3;
                }
                break;
            case 77:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPactDSL.g:1412:2: ( ruleForConvenience )
                    {
                    // InternalPactDSL.g:1412:2: ( ruleForConvenience )
                    // InternalPactDSL.g:1413:3: ruleForConvenience
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
                    // InternalPactDSL.g:1418:2: ( ruleOnReasonableNotice )
                    {
                    // InternalPactDSL.g:1418:2: ( ruleOnReasonableNotice )
                    // InternalPactDSL.g:1419:3: ruleOnReasonableNotice
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
                    // InternalPactDSL.g:1424:2: ( ruleForBreach )
                    {
                    // InternalPactDSL.g:1424:2: ( ruleForBreach )
                    // InternalPactDSL.g:1425:3: ruleForBreach
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
                    // InternalPactDSL.g:1430:2: ( ruleOnInsolvencyEvent )
                    {
                    // InternalPactDSL.g:1430:2: ( ruleOnInsolvencyEvent )
                    // InternalPactDSL.g:1431:3: ruleOnInsolvencyEvent
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
                    // InternalPactDSL.g:1436:2: ( ruleCustomTermination )
                    {
                    // InternalPactDSL.g:1436:2: ( ruleCustomTermination )
                    // InternalPactDSL.g:1437:3: ruleCustomTermination
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
    // InternalPactDSL.g:1446:1: rule__BoilerplateType__Alternatives : ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) );
    public final void rule__BoilerplateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1450:1: ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt11=1;
                }
                break;
            case 80:
                {
                alt11=2;
                }
                break;
            case 81:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPactDSL.g:1451:2: ( ruleApplicableLaw )
                    {
                    // InternalPactDSL.g:1451:2: ( ruleApplicableLaw )
                    // InternalPactDSL.g:1452:3: ruleApplicableLaw
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
                    // InternalPactDSL.g:1457:2: ( ruleJurisdiction )
                    {
                    // InternalPactDSL.g:1457:2: ( ruleJurisdiction )
                    // InternalPactDSL.g:1458:3: ruleJurisdiction
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
                    // InternalPactDSL.g:1463:2: ( ruleNotices )
                    {
                    // InternalPactDSL.g:1463:2: ( ruleNotices )
                    // InternalPactDSL.g:1464:3: ruleNotices
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNotices();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 

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
    // InternalPactDSL.g:1473:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1477:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPactDSL.g:1478:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalPactDSL.g:1485:1: rule__Model__Group__0__Impl : ( 'ContractTitle:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1489:1: ( ( 'ContractTitle:' ) )
            // InternalPactDSL.g:1490:1: ( 'ContractTitle:' )
            {
            // InternalPactDSL.g:1490:1: ( 'ContractTitle:' )
            // InternalPactDSL.g:1491:2: 'ContractTitle:'
            {
             before(grammarAccess.getModelAccess().getContractTitleKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalPactDSL.g:1500:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1504:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPactDSL.g:1505:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalPactDSL.g:1512:1: rule__Model__Group__1__Impl : ( ( rule__Model__TitleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1516:1: ( ( ( rule__Model__TitleAssignment_1 ) ) )
            // InternalPactDSL.g:1517:1: ( ( rule__Model__TitleAssignment_1 ) )
            {
            // InternalPactDSL.g:1517:1: ( ( rule__Model__TitleAssignment_1 ) )
            // InternalPactDSL.g:1518:2: ( rule__Model__TitleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTitleAssignment_1()); 
            // InternalPactDSL.g:1519:2: ( rule__Model__TitleAssignment_1 )
            // InternalPactDSL.g:1519:3: rule__Model__TitleAssignment_1
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
    // InternalPactDSL.g:1527:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1531:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPactDSL.g:1532:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalPactDSL.g:1539:1: rule__Model__Group__2__Impl : ( ( ( '.' ) ) ( ( '.' )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1543:1: ( ( ( ( '.' ) ) ( ( '.' )* ) ) )
            // InternalPactDSL.g:1544:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            {
            // InternalPactDSL.g:1544:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            // InternalPactDSL.g:1545:2: ( ( '.' ) ) ( ( '.' )* )
            {
            // InternalPactDSL.g:1545:2: ( ( '.' ) )
            // InternalPactDSL.g:1546:3: ( '.' )
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1547:3: ( '.' )
            // InternalPactDSL.g:1547:4: '.'
            {
            match(input,16,FOLLOW_6); 

            }

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }

            // InternalPactDSL.g:1550:2: ( ( '.' )* )
            // InternalPactDSL.g:1551:3: ( '.' )*
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1552:3: ( '.' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPactDSL.g:1552:4: '.'
            	    {
            	    match(input,16,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalPactDSL.g:1561:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1565:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPactDSL.g:1566:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalPactDSL.g:1573:1: rule__Model__Group__3__Impl : ( 'Entities:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1577:1: ( ( 'Entities:' ) )
            // InternalPactDSL.g:1578:1: ( 'Entities:' )
            {
            // InternalPactDSL.g:1578:1: ( 'Entities:' )
            // InternalPactDSL.g:1579:2: 'Entities:'
            {
             before(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalPactDSL.g:1588:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1592:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPactDSL.g:1593:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalPactDSL.g:1600:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1604:1: ( ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) )
            // InternalPactDSL.g:1605:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            {
            // InternalPactDSL.g:1605:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            // InternalPactDSL.g:1606:2: ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* )
            {
            // InternalPactDSL.g:1606:2: ( ( rule__Model__Group_4__0 ) )
            // InternalPactDSL.g:1607:3: ( rule__Model__Group_4__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1608:3: ( rule__Model__Group_4__0 )
            // InternalPactDSL.g:1608:4: rule__Model__Group_4__0
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }

            // InternalPactDSL.g:1611:2: ( ( rule__Model__Group_4__0 )* )
            // InternalPactDSL.g:1612:3: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1613:3: ( rule__Model__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPactDSL.g:1613:4: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalPactDSL.g:1622:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1626:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalPactDSL.g:1627:2: rule__Model__Group__5__Impl rule__Model__Group__6
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
    // InternalPactDSL.g:1634:1: rule__Model__Group__5__Impl : ( ( 'Formalities:' )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1638:1: ( ( ( 'Formalities:' )? ) )
            // InternalPactDSL.g:1639:1: ( ( 'Formalities:' )? )
            {
            // InternalPactDSL.g:1639:1: ( ( 'Formalities:' )? )
            // InternalPactDSL.g:1640:2: ( 'Formalities:' )?
            {
             before(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 
            // InternalPactDSL.g:1641:2: ( 'Formalities:' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPactDSL.g:1641:3: 'Formalities:'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalPactDSL.g:1649:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1653:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalPactDSL.g:1654:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalPactDSL.g:1661:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1665:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // InternalPactDSL.g:1666:1: ( ( rule__Model__Group_6__0 )* )
            {
            // InternalPactDSL.g:1666:1: ( ( rule__Model__Group_6__0 )* )
            // InternalPactDSL.g:1667:2: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalPactDSL.g:1668:2: ( rule__Model__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=36)||LA15_0==38||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPactDSL.g:1668:3: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalPactDSL.g:1676:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1680:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalPactDSL.g:1681:2: rule__Model__Group__7__Impl rule__Model__Group__8
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
    // InternalPactDSL.g:1688:1: rule__Model__Group__7__Impl : ( ( 'Actions:' )? ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1692:1: ( ( ( 'Actions:' )? ) )
            // InternalPactDSL.g:1693:1: ( ( 'Actions:' )? )
            {
            // InternalPactDSL.g:1693:1: ( ( 'Actions:' )? )
            // InternalPactDSL.g:1694:2: ( 'Actions:' )?
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_7()); 
            // InternalPactDSL.g:1695:2: ( 'Actions:' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPactDSL.g:1695:3: 'Actions:'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalPactDSL.g:1703:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1707:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalPactDSL.g:1708:2: rule__Model__Group__8__Impl rule__Model__Group__9
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
    // InternalPactDSL.g:1715:1: rule__Model__Group__8__Impl : ( ( rule__Model__Group_8__0 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1719:1: ( ( ( rule__Model__Group_8__0 )* ) )
            // InternalPactDSL.g:1720:1: ( ( rule__Model__Group_8__0 )* )
            {
            // InternalPactDSL.g:1720:1: ( ( rule__Model__Group_8__0 )* )
            // InternalPactDSL.g:1721:2: ( rule__Model__Group_8__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_8()); 
            // InternalPactDSL.g:1722:2: ( rule__Model__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPactDSL.g:1722:3: rule__Model__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalPactDSL.g:1730:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1734:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalPactDSL.g:1735:2: rule__Model__Group__9__Impl rule__Model__Group__10
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
    // InternalPactDSL.g:1742:1: rule__Model__Group__9__Impl : ( ( 'StateOnSignature:' )? ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1746:1: ( ( ( 'StateOnSignature:' )? ) )
            // InternalPactDSL.g:1747:1: ( ( 'StateOnSignature:' )? )
            {
            // InternalPactDSL.g:1747:1: ( ( 'StateOnSignature:' )? )
            // InternalPactDSL.g:1748:2: ( 'StateOnSignature:' )?
            {
             before(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 
            // InternalPactDSL.g:1749:2: ( 'StateOnSignature:' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPactDSL.g:1749:3: 'StateOnSignature:'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalPactDSL.g:1757:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1761:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalPactDSL.g:1762:2: rule__Model__Group__10__Impl rule__Model__Group__11
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
    // InternalPactDSL.g:1769:1: rule__Model__Group__10__Impl : ( ( rule__Model__Group_10__0 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1773:1: ( ( ( rule__Model__Group_10__0 )* ) )
            // InternalPactDSL.g:1774:1: ( ( rule__Model__Group_10__0 )* )
            {
            // InternalPactDSL.g:1774:1: ( ( rule__Model__Group_10__0 )* )
            // InternalPactDSL.g:1775:2: ( rule__Model__Group_10__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_10()); 
            // InternalPactDSL.g:1776:2: ( rule__Model__Group_10__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=44 && LA19_0<=45)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPactDSL.g:1776:3: rule__Model__Group_10__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalPactDSL.g:1784:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1788:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalPactDSL.g:1789:2: rule__Model__Group__11__Impl rule__Model__Group__12
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
    // InternalPactDSL.g:1796:1: rule__Model__Group__11__Impl : ( 'PrimaryObligations:' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1800:1: ( ( 'PrimaryObligations:' ) )
            // InternalPactDSL.g:1801:1: ( 'PrimaryObligations:' )
            {
            // InternalPactDSL.g:1801:1: ( 'PrimaryObligations:' )
            // InternalPactDSL.g:1802:2: 'PrimaryObligations:'
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 
            match(input,21,FOLLOW_2); 
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
    // InternalPactDSL.g:1811:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1815:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalPactDSL.g:1816:2: rule__Model__Group__12__Impl rule__Model__Group__13
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
    // InternalPactDSL.g:1823:1: rule__Model__Group__12__Impl : ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1827:1: ( ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) )
            // InternalPactDSL.g:1828:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            {
            // InternalPactDSL.g:1828:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            // InternalPactDSL.g:1829:2: ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* )
            {
            // InternalPactDSL.g:1829:2: ( ( rule__Model__Group_12__0 ) )
            // InternalPactDSL.g:1830:3: ( rule__Model__Group_12__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1831:3: ( rule__Model__Group_12__0 )
            // InternalPactDSL.g:1831:4: rule__Model__Group_12__0
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }

            // InternalPactDSL.g:1834:2: ( ( rule__Model__Group_12__0 )* )
            // InternalPactDSL.g:1835:3: ( rule__Model__Group_12__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1836:3: ( rule__Model__Group_12__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING||LA20_0==46||LA20_0==51||LA20_0==53||LA20_0==55||LA20_0==59||LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPactDSL.g:1836:4: rule__Model__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Model__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalPactDSL.g:1845:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1849:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalPactDSL.g:1850:2: rule__Model__Group__13__Impl rule__Model__Group__14
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
    // InternalPactDSL.g:1857:1: rule__Model__Group__13__Impl : ( ( 'SecondaryObligations:' )? ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1861:1: ( ( ( 'SecondaryObligations:' )? ) )
            // InternalPactDSL.g:1862:1: ( ( 'SecondaryObligations:' )? )
            {
            // InternalPactDSL.g:1862:1: ( ( 'SecondaryObligations:' )? )
            // InternalPactDSL.g:1863:2: ( 'SecondaryObligations:' )?
            {
             before(grammarAccess.getModelAccess().getSecondaryObligationsKeyword_13()); 
            // InternalPactDSL.g:1864:2: ( 'SecondaryObligations:' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPactDSL.g:1864:3: 'SecondaryObligations:'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalPactDSL.g:1872:1: rule__Model__Group__14 : rule__Model__Group__14__Impl rule__Model__Group__15 ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1876:1: ( rule__Model__Group__14__Impl rule__Model__Group__15 )
            // InternalPactDSL.g:1877:2: rule__Model__Group__14__Impl rule__Model__Group__15
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
    // InternalPactDSL.g:1884:1: rule__Model__Group__14__Impl : ( ( rule__Model__Group_14__0 )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1888:1: ( ( ( rule__Model__Group_14__0 )* ) )
            // InternalPactDSL.g:1889:1: ( ( rule__Model__Group_14__0 )* )
            {
            // InternalPactDSL.g:1889:1: ( ( rule__Model__Group_14__0 )* )
            // InternalPactDSL.g:1890:2: ( rule__Model__Group_14__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_14()); 
            // InternalPactDSL.g:1891:2: ( rule__Model__Group_14__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==65) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPactDSL.g:1891:3: rule__Model__Group_14__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Model__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalPactDSL.g:1899:1: rule__Model__Group__15 : rule__Model__Group__15__Impl rule__Model__Group__16 ;
    public final void rule__Model__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1903:1: ( rule__Model__Group__15__Impl rule__Model__Group__16 )
            // InternalPactDSL.g:1904:2: rule__Model__Group__15__Impl rule__Model__Group__16
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
    // InternalPactDSL.g:1911:1: rule__Model__Group__15__Impl : ( ( 'Liability' )? ) ;
    public final void rule__Model__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1915:1: ( ( ( 'Liability' )? ) )
            // InternalPactDSL.g:1916:1: ( ( 'Liability' )? )
            {
            // InternalPactDSL.g:1916:1: ( ( 'Liability' )? )
            // InternalPactDSL.g:1917:2: ( 'Liability' )?
            {
             before(grammarAccess.getModelAccess().getLiabilityKeyword_15()); 
            // InternalPactDSL.g:1918:2: ( 'Liability' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPactDSL.g:1918:3: 'Liability'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalPactDSL.g:1926:1: rule__Model__Group__16 : rule__Model__Group__16__Impl rule__Model__Group__17 ;
    public final void rule__Model__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1930:1: ( rule__Model__Group__16__Impl rule__Model__Group__17 )
            // InternalPactDSL.g:1931:2: rule__Model__Group__16__Impl rule__Model__Group__17
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
    // InternalPactDSL.g:1938:1: rule__Model__Group__16__Impl : ( ( rule__Model__Group_16__0 )* ) ;
    public final void rule__Model__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1942:1: ( ( ( rule__Model__Group_16__0 )* ) )
            // InternalPactDSL.g:1943:1: ( ( rule__Model__Group_16__0 )* )
            {
            // InternalPactDSL.g:1943:1: ( ( rule__Model__Group_16__0 )* )
            // InternalPactDSL.g:1944:2: ( rule__Model__Group_16__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_16()); 
            // InternalPactDSL.g:1945:2: ( rule__Model__Group_16__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==67||LA24_0==70) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPactDSL.g:1945:3: rule__Model__Group_16__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Model__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalPactDSL.g:1953:1: rule__Model__Group__17 : rule__Model__Group__17__Impl rule__Model__Group__18 ;
    public final void rule__Model__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1957:1: ( rule__Model__Group__17__Impl rule__Model__Group__18 )
            // InternalPactDSL.g:1958:2: rule__Model__Group__17__Impl rule__Model__Group__18
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
    // InternalPactDSL.g:1965:1: rule__Model__Group__17__Impl : ( ( 'Termination:' )? ) ;
    public final void rule__Model__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1969:1: ( ( ( 'Termination:' )? ) )
            // InternalPactDSL.g:1970:1: ( ( 'Termination:' )? )
            {
            // InternalPactDSL.g:1970:1: ( ( 'Termination:' )? )
            // InternalPactDSL.g:1971:2: ( 'Termination:' )?
            {
             before(grammarAccess.getModelAccess().getTerminationKeyword_17()); 
            // InternalPactDSL.g:1972:2: ( 'Termination:' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||(LA25_1>=24 && LA25_1<=26)||(LA25_1>=44 && LA25_1<=45)||LA25_1==71||(LA25_1>=74 && LA25_1<=75)||LA25_1==77||(LA25_1>=79 && LA25_1<=81)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalPactDSL.g:1972:3: 'Termination:'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalPactDSL.g:1980:1: rule__Model__Group__18 : rule__Model__Group__18__Impl rule__Model__Group__19 ;
    public final void rule__Model__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1984:1: ( rule__Model__Group__18__Impl rule__Model__Group__19 )
            // InternalPactDSL.g:1985:2: rule__Model__Group__18__Impl rule__Model__Group__19
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
    // InternalPactDSL.g:1992:1: rule__Model__Group__18__Impl : ( ( rule__Model__Group_18__0 )* ) ;
    public final void rule__Model__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1996:1: ( ( ( rule__Model__Group_18__0 )* ) )
            // InternalPactDSL.g:1997:1: ( ( rule__Model__Group_18__0 )* )
            {
            // InternalPactDSL.g:1997:1: ( ( rule__Model__Group_18__0 )* )
            // InternalPactDSL.g:1998:2: ( rule__Model__Group_18__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_18()); 
            // InternalPactDSL.g:1999:2: ( rule__Model__Group_18__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24||LA26_0==71||(LA26_0>=74 && LA26_0<=75)||LA26_0==77) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPactDSL.g:1999:3: rule__Model__Group_18__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Model__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalPactDSL.g:2007:1: rule__Model__Group__19 : rule__Model__Group__19__Impl rule__Model__Group__20 ;
    public final void rule__Model__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2011:1: ( rule__Model__Group__19__Impl rule__Model__Group__20 )
            // InternalPactDSL.g:2012:2: rule__Model__Group__19__Impl rule__Model__Group__20
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
    // InternalPactDSL.g:2019:1: rule__Model__Group__19__Impl : ( ( 'StateAfterContractDischarged:' )? ) ;
    public final void rule__Model__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2023:1: ( ( ( 'StateAfterContractDischarged:' )? ) )
            // InternalPactDSL.g:2024:1: ( ( 'StateAfterContractDischarged:' )? )
            {
            // InternalPactDSL.g:2024:1: ( ( 'StateAfterContractDischarged:' )? )
            // InternalPactDSL.g:2025:2: ( 'StateAfterContractDischarged:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterContractDischargedKeyword_19()); 
            // InternalPactDSL.g:2026:2: ( 'StateAfterContractDischarged:' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPactDSL.g:2026:3: 'StateAfterContractDischarged:'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalPactDSL.g:2034:1: rule__Model__Group__20 : rule__Model__Group__20__Impl rule__Model__Group__21 ;
    public final void rule__Model__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2038:1: ( rule__Model__Group__20__Impl rule__Model__Group__21 )
            // InternalPactDSL.g:2039:2: rule__Model__Group__20__Impl rule__Model__Group__21
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
    // InternalPactDSL.g:2046:1: rule__Model__Group__20__Impl : ( ( rule__Model__Group_20__0 )* ) ;
    public final void rule__Model__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2050:1: ( ( ( rule__Model__Group_20__0 )* ) )
            // InternalPactDSL.g:2051:1: ( ( rule__Model__Group_20__0 )* )
            {
            // InternalPactDSL.g:2051:1: ( ( rule__Model__Group_20__0 )* )
            // InternalPactDSL.g:2052:2: ( rule__Model__Group_20__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_20()); 
            // InternalPactDSL.g:2053:2: ( rule__Model__Group_20__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=44 && LA28_0<=45)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPactDSL.g:2053:3: rule__Model__Group_20__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalPactDSL.g:2061:1: rule__Model__Group__21 : rule__Model__Group__21__Impl rule__Model__Group__22 ;
    public final void rule__Model__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2065:1: ( rule__Model__Group__21__Impl rule__Model__Group__22 )
            // InternalPactDSL.g:2066:2: rule__Model__Group__21__Impl rule__Model__Group__22
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
    // InternalPactDSL.g:2073:1: rule__Model__Group__21__Impl : ( ( 'Boilerplate:' )? ) ;
    public final void rule__Model__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2077:1: ( ( ( 'Boilerplate:' )? ) )
            // InternalPactDSL.g:2078:1: ( ( 'Boilerplate:' )? )
            {
            // InternalPactDSL.g:2078:1: ( ( 'Boilerplate:' )? )
            // InternalPactDSL.g:2079:2: ( 'Boilerplate:' )?
            {
             before(grammarAccess.getModelAccess().getBoilerplateKeyword_21()); 
            // InternalPactDSL.g:2080:2: ( 'Boilerplate:' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPactDSL.g:2080:3: 'Boilerplate:'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalPactDSL.g:2088:1: rule__Model__Group__22 : rule__Model__Group__22__Impl ;
    public final void rule__Model__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2092:1: ( rule__Model__Group__22__Impl )
            // InternalPactDSL.g:2093:2: rule__Model__Group__22__Impl
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
    // InternalPactDSL.g:2099:1: rule__Model__Group__22__Impl : ( ( rule__Model__Group_22__0 )* ) ;
    public final void rule__Model__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2103:1: ( ( ( rule__Model__Group_22__0 )* ) )
            // InternalPactDSL.g:2104:1: ( ( rule__Model__Group_22__0 )* )
            {
            // InternalPactDSL.g:2104:1: ( ( rule__Model__Group_22__0 )* )
            // InternalPactDSL.g:2105:2: ( rule__Model__Group_22__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_22()); 
            // InternalPactDSL.g:2106:2: ( rule__Model__Group_22__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=79 && LA30_0<=81)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPactDSL.g:2106:3: rule__Model__Group_22__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Model__Group_22__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalPactDSL.g:2115:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2119:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalPactDSL.g:2120:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
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
    // InternalPactDSL.g:2127:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__EntityTypesAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2131:1: ( ( ( rule__Model__EntityTypesAssignment_4_0 ) ) )
            // InternalPactDSL.g:2132:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            {
            // InternalPactDSL.g:2132:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            // InternalPactDSL.g:2133:2: ( rule__Model__EntityTypesAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 
            // InternalPactDSL.g:2134:2: ( rule__Model__EntityTypesAssignment_4_0 )
            // InternalPactDSL.g:2134:3: rule__Model__EntityTypesAssignment_4_0
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
    // InternalPactDSL.g:2142:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2146:1: ( rule__Model__Group_4__1__Impl )
            // InternalPactDSL.g:2147:2: rule__Model__Group_4__1__Impl
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
    // InternalPactDSL.g:2153:1: rule__Model__Group_4__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2157:1: ( ( '.' ) )
            // InternalPactDSL.g:2158:1: ( '.' )
            {
            // InternalPactDSL.g:2158:1: ( '.' )
            // InternalPactDSL.g:2159:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2169:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2173:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalPactDSL.g:2174:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
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
    // InternalPactDSL.g:2181:1: rule__Model__Group_6__0__Impl : ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2185:1: ( ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) )
            // InternalPactDSL.g:2186:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            {
            // InternalPactDSL.g:2186:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            // InternalPactDSL.g:2187:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            {
             before(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 
            // InternalPactDSL.g:2188:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            // InternalPactDSL.g:2188:3: rule__Model__FormalityTypesAssignment_6_0
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
    // InternalPactDSL.g:2196:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2200:1: ( rule__Model__Group_6__1__Impl )
            // InternalPactDSL.g:2201:2: rule__Model__Group_6__1__Impl
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
    // InternalPactDSL.g:2207:1: rule__Model__Group_6__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2211:1: ( ( '.' ) )
            // InternalPactDSL.g:2212:1: ( '.' )
            {
            // InternalPactDSL.g:2212:1: ( '.' )
            // InternalPactDSL.g:2213:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2223:1: rule__Model__Group_8__0 : rule__Model__Group_8__0__Impl rule__Model__Group_8__1 ;
    public final void rule__Model__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2227:1: ( rule__Model__Group_8__0__Impl rule__Model__Group_8__1 )
            // InternalPactDSL.g:2228:2: rule__Model__Group_8__0__Impl rule__Model__Group_8__1
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
    // InternalPactDSL.g:2235:1: rule__Model__Group_8__0__Impl : ( ( rule__Model__ActionTypesAssignment_8_0 ) ) ;
    public final void rule__Model__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2239:1: ( ( ( rule__Model__ActionTypesAssignment_8_0 ) ) )
            // InternalPactDSL.g:2240:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            {
            // InternalPactDSL.g:2240:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            // InternalPactDSL.g:2241:2: ( rule__Model__ActionTypesAssignment_8_0 )
            {
             before(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 
            // InternalPactDSL.g:2242:2: ( rule__Model__ActionTypesAssignment_8_0 )
            // InternalPactDSL.g:2242:3: rule__Model__ActionTypesAssignment_8_0
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
    // InternalPactDSL.g:2250:1: rule__Model__Group_8__1 : rule__Model__Group_8__1__Impl ;
    public final void rule__Model__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2254:1: ( rule__Model__Group_8__1__Impl )
            // InternalPactDSL.g:2255:2: rule__Model__Group_8__1__Impl
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
    // InternalPactDSL.g:2261:1: rule__Model__Group_8__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2265:1: ( ( '.' ) )
            // InternalPactDSL.g:2266:1: ( '.' )
            {
            // InternalPactDSL.g:2266:1: ( '.' )
            // InternalPactDSL.g:2267:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2277:1: rule__Model__Group_10__0 : rule__Model__Group_10__0__Impl rule__Model__Group_10__1 ;
    public final void rule__Model__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2281:1: ( rule__Model__Group_10__0__Impl rule__Model__Group_10__1 )
            // InternalPactDSL.g:2282:2: rule__Model__Group_10__0__Impl rule__Model__Group_10__1
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
    // InternalPactDSL.g:2289:1: rule__Model__Group_10__0__Impl : ( ( rule__Model__StateTypesAssignment_10_0 ) ) ;
    public final void rule__Model__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2293:1: ( ( ( rule__Model__StateTypesAssignment_10_0 ) ) )
            // InternalPactDSL.g:2294:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            {
            // InternalPactDSL.g:2294:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            // InternalPactDSL.g:2295:2: ( rule__Model__StateTypesAssignment_10_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 
            // InternalPactDSL.g:2296:2: ( rule__Model__StateTypesAssignment_10_0 )
            // InternalPactDSL.g:2296:3: rule__Model__StateTypesAssignment_10_0
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
    // InternalPactDSL.g:2304:1: rule__Model__Group_10__1 : rule__Model__Group_10__1__Impl ;
    public final void rule__Model__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2308:1: ( rule__Model__Group_10__1__Impl )
            // InternalPactDSL.g:2309:2: rule__Model__Group_10__1__Impl
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
    // InternalPactDSL.g:2315:1: rule__Model__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2319:1: ( ( '.' ) )
            // InternalPactDSL.g:2320:1: ( '.' )
            {
            // InternalPactDSL.g:2320:1: ( '.' )
            // InternalPactDSL.g:2321:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2331:1: rule__Model__Group_12__0 : rule__Model__Group_12__0__Impl rule__Model__Group_12__1 ;
    public final void rule__Model__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2335:1: ( rule__Model__Group_12__0__Impl rule__Model__Group_12__1 )
            // InternalPactDSL.g:2336:2: rule__Model__Group_12__0__Impl rule__Model__Group_12__1
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
    // InternalPactDSL.g:2343:1: rule__Model__Group_12__0__Impl : ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) ;
    public final void rule__Model__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2347:1: ( ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) )
            // InternalPactDSL.g:2348:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            {
            // InternalPactDSL.g:2348:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            // InternalPactDSL.g:2349:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 
            // InternalPactDSL.g:2350:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            // InternalPactDSL.g:2350:3: rule__Model__PrimaryObligationTypesAssignment_12_0
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
    // InternalPactDSL.g:2358:1: rule__Model__Group_12__1 : rule__Model__Group_12__1__Impl ;
    public final void rule__Model__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2362:1: ( rule__Model__Group_12__1__Impl )
            // InternalPactDSL.g:2363:2: rule__Model__Group_12__1__Impl
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
    // InternalPactDSL.g:2369:1: rule__Model__Group_12__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2373:1: ( ( '.' ) )
            // InternalPactDSL.g:2374:1: ( '.' )
            {
            // InternalPactDSL.g:2374:1: ( '.' )
            // InternalPactDSL.g:2375:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2385:1: rule__Model__Group_14__0 : rule__Model__Group_14__0__Impl rule__Model__Group_14__1 ;
    public final void rule__Model__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2389:1: ( rule__Model__Group_14__0__Impl rule__Model__Group_14__1 )
            // InternalPactDSL.g:2390:2: rule__Model__Group_14__0__Impl rule__Model__Group_14__1
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
    // InternalPactDSL.g:2397:1: rule__Model__Group_14__0__Impl : ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) ) ;
    public final void rule__Model__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2401:1: ( ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) ) )
            // InternalPactDSL.g:2402:1: ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) )
            {
            // InternalPactDSL.g:2402:1: ( ( rule__Model__SecondaryObligationTypesAssignment_14_0 ) )
            // InternalPactDSL.g:2403:2: ( rule__Model__SecondaryObligationTypesAssignment_14_0 )
            {
             before(grammarAccess.getModelAccess().getSecondaryObligationTypesAssignment_14_0()); 
            // InternalPactDSL.g:2404:2: ( rule__Model__SecondaryObligationTypesAssignment_14_0 )
            // InternalPactDSL.g:2404:3: rule__Model__SecondaryObligationTypesAssignment_14_0
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
    // InternalPactDSL.g:2412:1: rule__Model__Group_14__1 : rule__Model__Group_14__1__Impl ;
    public final void rule__Model__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2416:1: ( rule__Model__Group_14__1__Impl )
            // InternalPactDSL.g:2417:2: rule__Model__Group_14__1__Impl
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
    // InternalPactDSL.g:2423:1: rule__Model__Group_14__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2427:1: ( ( '.' ) )
            // InternalPactDSL.g:2428:1: ( '.' )
            {
            // InternalPactDSL.g:2428:1: ( '.' )
            // InternalPactDSL.g:2429:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2439:1: rule__Model__Group_16__0 : rule__Model__Group_16__0__Impl rule__Model__Group_16__1 ;
    public final void rule__Model__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2443:1: ( rule__Model__Group_16__0__Impl rule__Model__Group_16__1 )
            // InternalPactDSL.g:2444:2: rule__Model__Group_16__0__Impl rule__Model__Group_16__1
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
    // InternalPactDSL.g:2451:1: rule__Model__Group_16__0__Impl : ( ( rule__Model__LiabilityTypesAssignment_16_0 ) ) ;
    public final void rule__Model__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2455:1: ( ( ( rule__Model__LiabilityTypesAssignment_16_0 ) ) )
            // InternalPactDSL.g:2456:1: ( ( rule__Model__LiabilityTypesAssignment_16_0 ) )
            {
            // InternalPactDSL.g:2456:1: ( ( rule__Model__LiabilityTypesAssignment_16_0 ) )
            // InternalPactDSL.g:2457:2: ( rule__Model__LiabilityTypesAssignment_16_0 )
            {
             before(grammarAccess.getModelAccess().getLiabilityTypesAssignment_16_0()); 
            // InternalPactDSL.g:2458:2: ( rule__Model__LiabilityTypesAssignment_16_0 )
            // InternalPactDSL.g:2458:3: rule__Model__LiabilityTypesAssignment_16_0
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
    // InternalPactDSL.g:2466:1: rule__Model__Group_16__1 : rule__Model__Group_16__1__Impl ;
    public final void rule__Model__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2470:1: ( rule__Model__Group_16__1__Impl )
            // InternalPactDSL.g:2471:2: rule__Model__Group_16__1__Impl
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
    // InternalPactDSL.g:2477:1: rule__Model__Group_16__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2481:1: ( ( '.' ) )
            // InternalPactDSL.g:2482:1: ( '.' )
            {
            // InternalPactDSL.g:2482:1: ( '.' )
            // InternalPactDSL.g:2483:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2493:1: rule__Model__Group_18__0 : rule__Model__Group_18__0__Impl rule__Model__Group_18__1 ;
    public final void rule__Model__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2497:1: ( rule__Model__Group_18__0__Impl rule__Model__Group_18__1 )
            // InternalPactDSL.g:2498:2: rule__Model__Group_18__0__Impl rule__Model__Group_18__1
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
    // InternalPactDSL.g:2505:1: rule__Model__Group_18__0__Impl : ( ( rule__Model__TerminationTypesAssignment_18_0 ) ) ;
    public final void rule__Model__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2509:1: ( ( ( rule__Model__TerminationTypesAssignment_18_0 ) ) )
            // InternalPactDSL.g:2510:1: ( ( rule__Model__TerminationTypesAssignment_18_0 ) )
            {
            // InternalPactDSL.g:2510:1: ( ( rule__Model__TerminationTypesAssignment_18_0 ) )
            // InternalPactDSL.g:2511:2: ( rule__Model__TerminationTypesAssignment_18_0 )
            {
             before(grammarAccess.getModelAccess().getTerminationTypesAssignment_18_0()); 
            // InternalPactDSL.g:2512:2: ( rule__Model__TerminationTypesAssignment_18_0 )
            // InternalPactDSL.g:2512:3: rule__Model__TerminationTypesAssignment_18_0
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
    // InternalPactDSL.g:2520:1: rule__Model__Group_18__1 : rule__Model__Group_18__1__Impl ;
    public final void rule__Model__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2524:1: ( rule__Model__Group_18__1__Impl )
            // InternalPactDSL.g:2525:2: rule__Model__Group_18__1__Impl
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
    // InternalPactDSL.g:2531:1: rule__Model__Group_18__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2535:1: ( ( '.' ) )
            // InternalPactDSL.g:2536:1: ( '.' )
            {
            // InternalPactDSL.g:2536:1: ( '.' )
            // InternalPactDSL.g:2537:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2547:1: rule__Model__Group_20__0 : rule__Model__Group_20__0__Impl rule__Model__Group_20__1 ;
    public final void rule__Model__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2551:1: ( rule__Model__Group_20__0__Impl rule__Model__Group_20__1 )
            // InternalPactDSL.g:2552:2: rule__Model__Group_20__0__Impl rule__Model__Group_20__1
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
    // InternalPactDSL.g:2559:1: rule__Model__Group_20__0__Impl : ( ( rule__Model__StateTypesAssignment_20_0 ) ) ;
    public final void rule__Model__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2563:1: ( ( ( rule__Model__StateTypesAssignment_20_0 ) ) )
            // InternalPactDSL.g:2564:1: ( ( rule__Model__StateTypesAssignment_20_0 ) )
            {
            // InternalPactDSL.g:2564:1: ( ( rule__Model__StateTypesAssignment_20_0 ) )
            // InternalPactDSL.g:2565:2: ( rule__Model__StateTypesAssignment_20_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_20_0()); 
            // InternalPactDSL.g:2566:2: ( rule__Model__StateTypesAssignment_20_0 )
            // InternalPactDSL.g:2566:3: rule__Model__StateTypesAssignment_20_0
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
    // InternalPactDSL.g:2574:1: rule__Model__Group_20__1 : rule__Model__Group_20__1__Impl ;
    public final void rule__Model__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2578:1: ( rule__Model__Group_20__1__Impl )
            // InternalPactDSL.g:2579:2: rule__Model__Group_20__1__Impl
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
    // InternalPactDSL.g:2585:1: rule__Model__Group_20__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2589:1: ( ( '.' ) )
            // InternalPactDSL.g:2590:1: ( '.' )
            {
            // InternalPactDSL.g:2590:1: ( '.' )
            // InternalPactDSL.g:2591:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2601:1: rule__Model__Group_22__0 : rule__Model__Group_22__0__Impl rule__Model__Group_22__1 ;
    public final void rule__Model__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2605:1: ( rule__Model__Group_22__0__Impl rule__Model__Group_22__1 )
            // InternalPactDSL.g:2606:2: rule__Model__Group_22__0__Impl rule__Model__Group_22__1
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
    // InternalPactDSL.g:2613:1: rule__Model__Group_22__0__Impl : ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) ) ;
    public final void rule__Model__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2617:1: ( ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) ) )
            // InternalPactDSL.g:2618:1: ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) )
            {
            // InternalPactDSL.g:2618:1: ( ( rule__Model__BoilerplateTypesAssignment_22_0 ) )
            // InternalPactDSL.g:2619:2: ( rule__Model__BoilerplateTypesAssignment_22_0 )
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_22_0()); 
            // InternalPactDSL.g:2620:2: ( rule__Model__BoilerplateTypesAssignment_22_0 )
            // InternalPactDSL.g:2620:3: rule__Model__BoilerplateTypesAssignment_22_0
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
    // InternalPactDSL.g:2628:1: rule__Model__Group_22__1 : rule__Model__Group_22__1__Impl ;
    public final void rule__Model__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2632:1: ( rule__Model__Group_22__1__Impl )
            // InternalPactDSL.g:2633:2: rule__Model__Group_22__1__Impl
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
    // InternalPactDSL.g:2639:1: rule__Model__Group_22__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2643:1: ( ( '.' ) )
            // InternalPactDSL.g:2644:1: ( '.' )
            {
            // InternalPactDSL.g:2644:1: ( '.' )
            // InternalPactDSL.g:2645:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_22_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPactDSL.g:2655:1: rule__EffectiveDate__Group__0 : rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 ;
    public final void rule__EffectiveDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2659:1: ( rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 )
            // InternalPactDSL.g:2660:2: rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1
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
    // InternalPactDSL.g:2667:1: rule__EffectiveDate__Group__0__Impl : ( 'EffectiveDate:' ) ;
    public final void rule__EffectiveDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2671:1: ( ( 'EffectiveDate:' ) )
            // InternalPactDSL.g:2672:1: ( 'EffectiveDate:' )
            {
            // InternalPactDSL.g:2672:1: ( 'EffectiveDate:' )
            // InternalPactDSL.g:2673:2: 'EffectiveDate:'
            {
             before(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPactDSL.g:2682:1: rule__EffectiveDate__Group__1 : rule__EffectiveDate__Group__1__Impl ;
    public final void rule__EffectiveDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2686:1: ( rule__EffectiveDate__Group__1__Impl )
            // InternalPactDSL.g:2687:2: rule__EffectiveDate__Group__1__Impl
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
    // InternalPactDSL.g:2693:1: rule__EffectiveDate__Group__1__Impl : ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) ;
    public final void rule__EffectiveDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2697:1: ( ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) )
            // InternalPactDSL.g:2698:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            {
            // InternalPactDSL.g:2698:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            // InternalPactDSL.g:2699:2: ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* )
            {
            // InternalPactDSL.g:2699:2: ( ( rule__EffectiveDate__Group_1__0 ) )
            // InternalPactDSL.g:2700:3: ( rule__EffectiveDate__Group_1__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2701:3: ( rule__EffectiveDate__Group_1__0 )
            // InternalPactDSL.g:2701:4: rule__EffectiveDate__Group_1__0
            {
            pushFollow(FOLLOW_21);
            rule__EffectiveDate__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }

            // InternalPactDSL.g:2704:2: ( ( rule__EffectiveDate__Group_1__0 )* )
            // InternalPactDSL.g:2705:3: ( rule__EffectiveDate__Group_1__0 )*
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2706:3: ( rule__EffectiveDate__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_INT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPactDSL.g:2706:4: rule__EffectiveDate__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__EffectiveDate__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalPactDSL.g:2716:1: rule__EffectiveDate__Group_1__0 : rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 ;
    public final void rule__EffectiveDate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2720:1: ( rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 )
            // InternalPactDSL.g:2721:2: rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1
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
    // InternalPactDSL.g:2728:1: rule__EffectiveDate__Group_1__0__Impl : ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) ;
    public final void rule__EffectiveDate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2732:1: ( ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) )
            // InternalPactDSL.g:2733:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            {
            // InternalPactDSL.g:2733:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            // InternalPactDSL.g:2734:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 
            // InternalPactDSL.g:2735:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            // InternalPactDSL.g:2735:3: rule__EffectiveDate__DayAssignment_1_0
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
    // InternalPactDSL.g:2743:1: rule__EffectiveDate__Group_1__1 : rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 ;
    public final void rule__EffectiveDate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2747:1: ( rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 )
            // InternalPactDSL.g:2748:2: rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2
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
    // InternalPactDSL.g:2755:1: rule__EffectiveDate__Group_1__1__Impl : ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) ;
    public final void rule__EffectiveDate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2759:1: ( ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) )
            // InternalPactDSL.g:2760:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            {
            // InternalPactDSL.g:2760:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            // InternalPactDSL.g:2761:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 
            // InternalPactDSL.g:2762:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            // InternalPactDSL.g:2762:3: rule__EffectiveDate__MonthAssignment_1_1
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
    // InternalPactDSL.g:2770:1: rule__EffectiveDate__Group_1__2 : rule__EffectiveDate__Group_1__2__Impl ;
    public final void rule__EffectiveDate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2774:1: ( rule__EffectiveDate__Group_1__2__Impl )
            // InternalPactDSL.g:2775:2: rule__EffectiveDate__Group_1__2__Impl
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
    // InternalPactDSL.g:2781:1: rule__EffectiveDate__Group_1__2__Impl : ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) ;
    public final void rule__EffectiveDate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2785:1: ( ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) )
            // InternalPactDSL.g:2786:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            {
            // InternalPactDSL.g:2786:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            // InternalPactDSL.g:2787:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            {
             before(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 
            // InternalPactDSL.g:2788:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            // InternalPactDSL.g:2788:3: rule__EffectiveDate__YearAssignment_1_2
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
    // InternalPactDSL.g:2797:1: rule__Party__Group__0 : rule__Party__Group__0__Impl rule__Party__Group__1 ;
    public final void rule__Party__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2801:1: ( rule__Party__Group__0__Impl rule__Party__Group__1 )
            // InternalPactDSL.g:2802:2: rule__Party__Group__0__Impl rule__Party__Group__1
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
    // InternalPactDSL.g:2809:1: rule__Party__Group__0__Impl : ( 'Party:' ) ;
    public final void rule__Party__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2813:1: ( ( 'Party:' ) )
            // InternalPactDSL.g:2814:1: ( 'Party:' )
            {
            // InternalPactDSL.g:2814:1: ( 'Party:' )
            // InternalPactDSL.g:2815:2: 'Party:'
            {
             before(grammarAccess.getPartyAccess().getPartyKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPactDSL.g:2824:1: rule__Party__Group__1 : rule__Party__Group__1__Impl rule__Party__Group__2 ;
    public final void rule__Party__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2828:1: ( rule__Party__Group__1__Impl rule__Party__Group__2 )
            // InternalPactDSL.g:2829:2: rule__Party__Group__1__Impl rule__Party__Group__2
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
    // InternalPactDSL.g:2836:1: rule__Party__Group__1__Impl : ( ( rule__Party__NameAssignment_1 ) ) ;
    public final void rule__Party__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2840:1: ( ( ( rule__Party__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2841:1: ( ( rule__Party__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2841:1: ( ( rule__Party__NameAssignment_1 ) )
            // InternalPactDSL.g:2842:2: ( rule__Party__NameAssignment_1 )
            {
             before(grammarAccess.getPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2843:2: ( rule__Party__NameAssignment_1 )
            // InternalPactDSL.g:2843:3: rule__Party__NameAssignment_1
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
    // InternalPactDSL.g:2851:1: rule__Party__Group__2 : rule__Party__Group__2__Impl rule__Party__Group__3 ;
    public final void rule__Party__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2855:1: ( rule__Party__Group__2__Impl rule__Party__Group__3 )
            // InternalPactDSL.g:2856:2: rule__Party__Group__2__Impl rule__Party__Group__3
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
    // InternalPactDSL.g:2863:1: rule__Party__Group__2__Impl : ( ( rule__Party__FullnameAssignment_2 ) ) ;
    public final void rule__Party__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2867:1: ( ( ( rule__Party__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2868:1: ( ( rule__Party__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2868:1: ( ( rule__Party__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2869:2: ( rule__Party__FullnameAssignment_2 )
            {
             before(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2870:2: ( rule__Party__FullnameAssignment_2 )
            // InternalPactDSL.g:2870:3: rule__Party__FullnameAssignment_2
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
    // InternalPactDSL.g:2878:1: rule__Party__Group__3 : rule__Party__Group__3__Impl ;
    public final void rule__Party__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2882:1: ( rule__Party__Group__3__Impl )
            // InternalPactDSL.g:2883:2: rule__Party__Group__3__Impl
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
    // InternalPactDSL.g:2889:1: rule__Party__Group__3__Impl : ( ( rule__Party__FeatureAssignment_3 )* ) ;
    public final void rule__Party__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2893:1: ( ( ( rule__Party__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:2894:1: ( ( rule__Party__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:2894:1: ( ( rule__Party__FeatureAssignment_3 )* )
            // InternalPactDSL.g:2895:2: ( rule__Party__FeatureAssignment_3 )*
            {
             before(grammarAccess.getPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:2896:2: ( rule__Party__FeatureAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=31 && LA32_0<=34)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPactDSL.g:2896:3: rule__Party__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Party__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalPactDSL.g:2905:1: rule__ThirdParty__Group__0 : rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 ;
    public final void rule__ThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2909:1: ( rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 )
            // InternalPactDSL.g:2910:2: rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1
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
    // InternalPactDSL.g:2917:1: rule__ThirdParty__Group__0__Impl : ( 'ThirdParty:' ) ;
    public final void rule__ThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2921:1: ( ( 'ThirdParty:' ) )
            // InternalPactDSL.g:2922:1: ( 'ThirdParty:' )
            {
            // InternalPactDSL.g:2922:1: ( 'ThirdParty:' )
            // InternalPactDSL.g:2923:2: 'ThirdParty:'
            {
             before(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPactDSL.g:2932:1: rule__ThirdParty__Group__1 : rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 ;
    public final void rule__ThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2936:1: ( rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 )
            // InternalPactDSL.g:2937:2: rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2
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
    // InternalPactDSL.g:2944:1: rule__ThirdParty__Group__1__Impl : ( ( rule__ThirdParty__NameAssignment_1 ) ) ;
    public final void rule__ThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2948:1: ( ( ( rule__ThirdParty__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2949:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2949:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            // InternalPactDSL.g:2950:2: ( rule__ThirdParty__NameAssignment_1 )
            {
             before(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2951:2: ( rule__ThirdParty__NameAssignment_1 )
            // InternalPactDSL.g:2951:3: rule__ThirdParty__NameAssignment_1
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
    // InternalPactDSL.g:2959:1: rule__ThirdParty__Group__2 : rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 ;
    public final void rule__ThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2963:1: ( rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 )
            // InternalPactDSL.g:2964:2: rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3
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
    // InternalPactDSL.g:2971:1: rule__ThirdParty__Group__2__Impl : ( ( rule__ThirdParty__FullnameAssignment_2 ) ) ;
    public final void rule__ThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2975:1: ( ( ( rule__ThirdParty__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2976:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2976:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2977:2: ( rule__ThirdParty__FullnameAssignment_2 )
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2978:2: ( rule__ThirdParty__FullnameAssignment_2 )
            // InternalPactDSL.g:2978:3: rule__ThirdParty__FullnameAssignment_2
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
    // InternalPactDSL.g:2986:1: rule__ThirdParty__Group__3 : rule__ThirdParty__Group__3__Impl ;
    public final void rule__ThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2990:1: ( rule__ThirdParty__Group__3__Impl )
            // InternalPactDSL.g:2991:2: rule__ThirdParty__Group__3__Impl
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
    // InternalPactDSL.g:2997:1: rule__ThirdParty__Group__3__Impl : ( ( rule__ThirdParty__FeatureAssignment_3 )* ) ;
    public final void rule__ThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3001:1: ( ( ( rule__ThirdParty__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:3002:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:3002:1: ( ( rule__ThirdParty__FeatureAssignment_3 )* )
            // InternalPactDSL.g:3003:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            {
             before(grammarAccess.getThirdPartyAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:3004:2: ( rule__ThirdParty__FeatureAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=31 && LA33_0<=34)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPactDSL.g:3004:3: rule__ThirdParty__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ThirdParty__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalPactDSL.g:3013:1: rule__SubjectMatter__Group__0 : rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 ;
    public final void rule__SubjectMatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3017:1: ( rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 )
            // InternalPactDSL.g:3018:2: rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1
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
    // InternalPactDSL.g:3025:1: rule__SubjectMatter__Group__0__Impl : ( 'SubjectMatter:' ) ;
    public final void rule__SubjectMatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3029:1: ( ( 'SubjectMatter:' ) )
            // InternalPactDSL.g:3030:1: ( 'SubjectMatter:' )
            {
            // InternalPactDSL.g:3030:1: ( 'SubjectMatter:' )
            // InternalPactDSL.g:3031:2: 'SubjectMatter:'
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPactDSL.g:3040:1: rule__SubjectMatter__Group__1 : rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 ;
    public final void rule__SubjectMatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3044:1: ( rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 )
            // InternalPactDSL.g:3045:2: rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2
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
    // InternalPactDSL.g:3052:1: rule__SubjectMatter__Group__1__Impl : ( ( rule__SubjectMatter__NameAssignment_1 ) ) ;
    public final void rule__SubjectMatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3056:1: ( ( ( rule__SubjectMatter__NameAssignment_1 ) ) )
            // InternalPactDSL.g:3057:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:3057:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            // InternalPactDSL.g:3058:2: ( rule__SubjectMatter__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:3059:2: ( rule__SubjectMatter__NameAssignment_1 )
            // InternalPactDSL.g:3059:3: rule__SubjectMatter__NameAssignment_1
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
    // InternalPactDSL.g:3067:1: rule__SubjectMatter__Group__2 : rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 ;
    public final void rule__SubjectMatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3071:1: ( rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 )
            // InternalPactDSL.g:3072:2: rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3
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
    // InternalPactDSL.g:3079:1: rule__SubjectMatter__Group__2__Impl : ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) ;
    public final void rule__SubjectMatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3083:1: ( ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) )
            // InternalPactDSL.g:3084:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            {
            // InternalPactDSL.g:3084:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            // InternalPactDSL.g:3085:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 
            // InternalPactDSL.g:3086:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            // InternalPactDSL.g:3086:3: rule__SubjectMatter__SubjectMatterAssignment_2
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
    // InternalPactDSL.g:3094:1: rule__SubjectMatter__Group__3 : rule__SubjectMatter__Group__3__Impl ;
    public final void rule__SubjectMatter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3098:1: ( rule__SubjectMatter__Group__3__Impl )
            // InternalPactDSL.g:3099:2: rule__SubjectMatter__Group__3__Impl
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
    // InternalPactDSL.g:3105:1: rule__SubjectMatter__Group__3__Impl : ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) ;
    public final void rule__SubjectMatter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3109:1: ( ( ( rule__SubjectMatter__FeatureAssignment_3 )* ) )
            // InternalPactDSL.g:3110:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            {
            // InternalPactDSL.g:3110:1: ( ( rule__SubjectMatter__FeatureAssignment_3 )* )
            // InternalPactDSL.g:3111:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            {
             before(grammarAccess.getSubjectMatterAccess().getFeatureAssignment_3()); 
            // InternalPactDSL.g:3112:2: ( rule__SubjectMatter__FeatureAssignment_3 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=31 && LA34_0<=34)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPactDSL.g:3112:3: rule__SubjectMatter__FeatureAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SubjectMatter__FeatureAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalPactDSL.g:3121:1: rule__DefinedTerm__Group__0 : rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 ;
    public final void rule__DefinedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3125:1: ( rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 )
            // InternalPactDSL.g:3126:2: rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1
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
    // InternalPactDSL.g:3133:1: rule__DefinedTerm__Group__0__Impl : ( 'definedAs' ) ;
    public final void rule__DefinedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3137:1: ( ( 'definedAs' ) )
            // InternalPactDSL.g:3138:1: ( 'definedAs' )
            {
            // InternalPactDSL.g:3138:1: ( 'definedAs' )
            // InternalPactDSL.g:3139:2: 'definedAs'
            {
             before(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPactDSL.g:3148:1: rule__DefinedTerm__Group__1 : rule__DefinedTerm__Group__1__Impl ;
    public final void rule__DefinedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3152:1: ( rule__DefinedTerm__Group__1__Impl )
            // InternalPactDSL.g:3153:2: rule__DefinedTerm__Group__1__Impl
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
    // InternalPactDSL.g:3159:1: rule__DefinedTerm__Group__1__Impl : ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) ;
    public final void rule__DefinedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3163:1: ( ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3164:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3164:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3165:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3166:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            // InternalPactDSL.g:3166:3: rule__DefinedTerm__DefinitionAssignment_1
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
    // InternalPactDSL.g:3175:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3179:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalPactDSL.g:3180:2: rule__Address__Group__0__Impl rule__Address__Group__1
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
    // InternalPactDSL.g:3187:1: rule__Address__Group__0__Impl : ( 'withAddress' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3191:1: ( ( 'withAddress' ) )
            // InternalPactDSL.g:3192:1: ( 'withAddress' )
            {
            // InternalPactDSL.g:3192:1: ( 'withAddress' )
            // InternalPactDSL.g:3193:2: 'withAddress'
            {
             before(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPactDSL.g:3202:1: rule__Address__Group__1 : rule__Address__Group__1__Impl ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3206:1: ( rule__Address__Group__1__Impl )
            // InternalPactDSL.g:3207:2: rule__Address__Group__1__Impl
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
    // InternalPactDSL.g:3213:1: rule__Address__Group__1__Impl : ( ( rule__Address__AddressAssignment_1 ) ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3217:1: ( ( ( rule__Address__AddressAssignment_1 ) ) )
            // InternalPactDSL.g:3218:1: ( ( rule__Address__AddressAssignment_1 ) )
            {
            // InternalPactDSL.g:3218:1: ( ( rule__Address__AddressAssignment_1 ) )
            // InternalPactDSL.g:3219:2: ( rule__Address__AddressAssignment_1 )
            {
             before(grammarAccess.getAddressAccess().getAddressAssignment_1()); 
            // InternalPactDSL.g:3220:2: ( rule__Address__AddressAssignment_1 )
            // InternalPactDSL.g:3220:3: rule__Address__AddressAssignment_1
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
    // InternalPactDSL.g:3229:1: rule__CompanyNumber__Group__0 : rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 ;
    public final void rule__CompanyNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3233:1: ( rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 )
            // InternalPactDSL.g:3234:2: rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalPactDSL.g:3241:1: rule__CompanyNumber__Group__0__Impl : ( 'withCompanyNumber' ) ;
    public final void rule__CompanyNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3245:1: ( ( 'withCompanyNumber' ) )
            // InternalPactDSL.g:3246:1: ( 'withCompanyNumber' )
            {
            // InternalPactDSL.g:3246:1: ( 'withCompanyNumber' )
            // InternalPactDSL.g:3247:2: 'withCompanyNumber'
            {
             before(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalPactDSL.g:3256:1: rule__CompanyNumber__Group__1 : rule__CompanyNumber__Group__1__Impl ;
    public final void rule__CompanyNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3260:1: ( rule__CompanyNumber__Group__1__Impl )
            // InternalPactDSL.g:3261:2: rule__CompanyNumber__Group__1__Impl
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
    // InternalPactDSL.g:3267:1: rule__CompanyNumber__Group__1__Impl : ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) ) ;
    public final void rule__CompanyNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3271:1: ( ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) ) )
            // InternalPactDSL.g:3272:1: ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) )
            {
            // InternalPactDSL.g:3272:1: ( ( rule__CompanyNumber__CompanyNumberAssignment_1 ) )
            // InternalPactDSL.g:3273:2: ( rule__CompanyNumber__CompanyNumberAssignment_1 )
            {
             before(grammarAccess.getCompanyNumberAccess().getCompanyNumberAssignment_1()); 
            // InternalPactDSL.g:3274:2: ( rule__CompanyNumber__CompanyNumberAssignment_1 )
            // InternalPactDSL.g:3274:3: rule__CompanyNumber__CompanyNumberAssignment_1
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
    // InternalPactDSL.g:3283:1: rule__CustomFeature__Group__0 : rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 ;
    public final void rule__CustomFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3287:1: ( rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1 )
            // InternalPactDSL.g:3288:2: rule__CustomFeature__Group__0__Impl rule__CustomFeature__Group__1
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
    // InternalPactDSL.g:3295:1: rule__CustomFeature__Group__0__Impl : ( 'withFeature' ) ;
    public final void rule__CustomFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3299:1: ( ( 'withFeature' ) )
            // InternalPactDSL.g:3300:1: ( 'withFeature' )
            {
            // InternalPactDSL.g:3300:1: ( 'withFeature' )
            // InternalPactDSL.g:3301:2: 'withFeature'
            {
             before(grammarAccess.getCustomFeatureAccess().getWithFeatureKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalPactDSL.g:3310:1: rule__CustomFeature__Group__1 : rule__CustomFeature__Group__1__Impl ;
    public final void rule__CustomFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3314:1: ( rule__CustomFeature__Group__1__Impl )
            // InternalPactDSL.g:3315:2: rule__CustomFeature__Group__1__Impl
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
    // InternalPactDSL.g:3321:1: rule__CustomFeature__Group__1__Impl : ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) ) ;
    public final void rule__CustomFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3325:1: ( ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) ) )
            // InternalPactDSL.g:3326:1: ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) )
            {
            // InternalPactDSL.g:3326:1: ( ( rule__CustomFeature__CustomFeatureAssignment_1 ) )
            // InternalPactDSL.g:3327:2: ( rule__CustomFeature__CustomFeatureAssignment_1 )
            {
             before(grammarAccess.getCustomFeatureAccess().getCustomFeatureAssignment_1()); 
            // InternalPactDSL.g:3328:2: ( rule__CustomFeature__CustomFeatureAssignment_1 )
            // InternalPactDSL.g:3328:3: rule__CustomFeature__CustomFeatureAssignment_1
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
    // InternalPactDSL.g:3337:1: rule__InWriting__Group__0 : rule__InWriting__Group__0__Impl rule__InWriting__Group__1 ;
    public final void rule__InWriting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3341:1: ( rule__InWriting__Group__0__Impl rule__InWriting__Group__1 )
            // InternalPactDSL.g:3342:2: rule__InWriting__Group__0__Impl rule__InWriting__Group__1
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
    // InternalPactDSL.g:3349:1: rule__InWriting__Group__0__Impl : ( 'inWriting' ) ;
    public final void rule__InWriting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3353:1: ( ( 'inWriting' ) )
            // InternalPactDSL.g:3354:1: ( 'inWriting' )
            {
            // InternalPactDSL.g:3354:1: ( 'inWriting' )
            // InternalPactDSL.g:3355:2: 'inWriting'
            {
             before(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalPactDSL.g:3364:1: rule__InWriting__Group__1 : rule__InWriting__Group__1__Impl ;
    public final void rule__InWriting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3368:1: ( rule__InWriting__Group__1__Impl )
            // InternalPactDSL.g:3369:2: rule__InWriting__Group__1__Impl
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
    // InternalPactDSL.g:3375:1: rule__InWriting__Group__1__Impl : ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) ;
    public final void rule__InWriting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3379:1: ( ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3380:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3380:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            // InternalPactDSL.g:3381:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 
            // InternalPactDSL.g:3382:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            // InternalPactDSL.g:3382:3: rule__InWriting__CustomWritingFormalityAssignment_1
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
    // InternalPactDSL.g:3391:1: rule__ByEmail__Group__0 : rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 ;
    public final void rule__ByEmail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3395:1: ( rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 )
            // InternalPactDSL.g:3396:2: rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1
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
    // InternalPactDSL.g:3403:1: rule__ByEmail__Group__0__Impl : ( 'byEmail' ) ;
    public final void rule__ByEmail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3407:1: ( ( 'byEmail' ) )
            // InternalPactDSL.g:3408:1: ( 'byEmail' )
            {
            // InternalPactDSL.g:3408:1: ( 'byEmail' )
            // InternalPactDSL.g:3409:2: 'byEmail'
            {
             before(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalPactDSL.g:3418:1: rule__ByEmail__Group__1 : rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 ;
    public final void rule__ByEmail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3422:1: ( rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 )
            // InternalPactDSL.g:3423:2: rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2
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
    // InternalPactDSL.g:3430:1: rule__ByEmail__Group__1__Impl : ( 'to' ) ;
    public final void rule__ByEmail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3434:1: ( ( 'to' ) )
            // InternalPactDSL.g:3435:1: ( 'to' )
            {
            // InternalPactDSL.g:3435:1: ( 'to' )
            // InternalPactDSL.g:3436:2: 'to'
            {
             before(grammarAccess.getByEmailAccess().getToKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:3445:1: rule__ByEmail__Group__2 : rule__ByEmail__Group__2__Impl ;
    public final void rule__ByEmail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3449:1: ( rule__ByEmail__Group__2__Impl )
            // InternalPactDSL.g:3450:2: rule__ByEmail__Group__2__Impl
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
    // InternalPactDSL.g:3456:1: rule__ByEmail__Group__2__Impl : ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) ;
    public final void rule__ByEmail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3460:1: ( ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) )
            // InternalPactDSL.g:3461:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            {
            // InternalPactDSL.g:3461:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            // InternalPactDSL.g:3462:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 
            // InternalPactDSL.g:3463:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            // InternalPactDSL.g:3463:3: rule__ByEmail__EmailAddressAssignment_2
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
    // InternalPactDSL.g:3472:1: rule__GivingNotice__Group__0 : rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 ;
    public final void rule__GivingNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3476:1: ( rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 )
            // InternalPactDSL.g:3477:2: rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1
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
    // InternalPactDSL.g:3484:1: rule__GivingNotice__Group__0__Impl : ( 'givingNoticeTo' ) ;
    public final void rule__GivingNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3488:1: ( ( 'givingNoticeTo' ) )
            // InternalPactDSL.g:3489:1: ( 'givingNoticeTo' )
            {
            // InternalPactDSL.g:3489:1: ( 'givingNoticeTo' )
            // InternalPactDSL.g:3490:2: 'givingNoticeTo'
            {
             before(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalPactDSL.g:3499:1: rule__GivingNotice__Group__1 : rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 ;
    public final void rule__GivingNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3503:1: ( rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 )
            // InternalPactDSL.g:3504:2: rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2
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
    // InternalPactDSL.g:3511:1: rule__GivingNotice__Group__1__Impl : ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) ;
    public final void rule__GivingNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3515:1: ( ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3516:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3516:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3517:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3518:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3518:3: rule__GivingNotice__SuperTypeAssignment_1
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
    // InternalPactDSL.g:3526:1: rule__GivingNotice__Group__2 : rule__GivingNotice__Group__2__Impl ;
    public final void rule__GivingNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3530:1: ( rule__GivingNotice__Group__2__Impl )
            // InternalPactDSL.g:3531:2: rule__GivingNotice__Group__2__Impl
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
    // InternalPactDSL.g:3537:1: rule__GivingNotice__Group__2__Impl : ( ( rule__GivingNotice__Group_2__0 ) ) ;
    public final void rule__GivingNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3541:1: ( ( ( rule__GivingNotice__Group_2__0 ) ) )
            // InternalPactDSL.g:3542:1: ( ( rule__GivingNotice__Group_2__0 ) )
            {
            // InternalPactDSL.g:3542:1: ( ( rule__GivingNotice__Group_2__0 ) )
            // InternalPactDSL.g:3543:2: ( rule__GivingNotice__Group_2__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup_2()); 
            // InternalPactDSL.g:3544:2: ( rule__GivingNotice__Group_2__0 )
            // InternalPactDSL.g:3544:3: rule__GivingNotice__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__0();

            state._fsp--;


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
    // InternalPactDSL.g:3553:1: rule__GivingNotice__Group_2__0 : rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 ;
    public final void rule__GivingNotice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3557:1: ( rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 )
            // InternalPactDSL.g:3558:2: rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1
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
    // InternalPactDSL.g:3565:1: rule__GivingNotice__Group_2__0__Impl : ( 'withDuration' ) ;
    public final void rule__GivingNotice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3569:1: ( ( 'withDuration' ) )
            // InternalPactDSL.g:3570:1: ( 'withDuration' )
            {
            // InternalPactDSL.g:3570:1: ( 'withDuration' )
            // InternalPactDSL.g:3571:2: 'withDuration'
            {
             before(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalPactDSL.g:3580:1: rule__GivingNotice__Group_2__1 : rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 ;
    public final void rule__GivingNotice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3584:1: ( rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 )
            // InternalPactDSL.g:3585:2: rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2
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
    // InternalPactDSL.g:3592:1: rule__GivingNotice__Group_2__1__Impl : ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) ;
    public final void rule__GivingNotice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3596:1: ( ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) )
            // InternalPactDSL.g:3597:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            {
            // InternalPactDSL.g:3597:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            // InternalPactDSL.g:3598:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 
            // InternalPactDSL.g:3599:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            // InternalPactDSL.g:3599:3: rule__GivingNotice__NumDaysAssignment_2_1
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
    // InternalPactDSL.g:3607:1: rule__GivingNotice__Group_2__2 : rule__GivingNotice__Group_2__2__Impl ;
    public final void rule__GivingNotice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3611:1: ( rule__GivingNotice__Group_2__2__Impl )
            // InternalPactDSL.g:3612:2: rule__GivingNotice__Group_2__2__Impl
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
    // InternalPactDSL.g:3618:1: rule__GivingNotice__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__GivingNotice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3622:1: ( ( 'days' ) )
            // InternalPactDSL.g:3623:1: ( 'days' )
            {
            // InternalPactDSL.g:3623:1: ( 'days' )
            // InternalPactDSL.g:3624:2: 'days'
            {
             before(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalPactDSL.g:3634:1: rule__CustomFormality__Group__0 : rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 ;
    public final void rule__CustomFormality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3638:1: ( rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 )
            // InternalPactDSL.g:3639:2: rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1
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
    // InternalPactDSL.g:3646:1: rule__CustomFormality__Group__0__Impl : ( 'ContractFormality' ) ;
    public final void rule__CustomFormality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3650:1: ( ( 'ContractFormality' ) )
            // InternalPactDSL.g:3651:1: ( 'ContractFormality' )
            {
            // InternalPactDSL.g:3651:1: ( 'ContractFormality' )
            // InternalPactDSL.g:3652:2: 'ContractFormality'
            {
             before(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalPactDSL.g:3661:1: rule__CustomFormality__Group__1 : rule__CustomFormality__Group__1__Impl ;
    public final void rule__CustomFormality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3665:1: ( rule__CustomFormality__Group__1__Impl )
            // InternalPactDSL.g:3666:2: rule__CustomFormality__Group__1__Impl
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
    // InternalPactDSL.g:3672:1: rule__CustomFormality__Group__1__Impl : ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) ;
    public final void rule__CustomFormality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3676:1: ( ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3677:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3677:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            // InternalPactDSL.g:3678:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 
            // InternalPactDSL.g:3679:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            // InternalPactDSL.g:3679:3: rule__CustomFormality__CustomFormalityAssignment_1
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
    // InternalPactDSL.g:3688:1: rule__GivenConsent__Group__0 : rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 ;
    public final void rule__GivenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3692:1: ( rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 )
            // InternalPactDSL.g:3693:2: rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1
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
    // InternalPactDSL.g:3700:1: rule__GivenConsent__Group__0__Impl : ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3704:1: ( ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3705:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3705:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3706:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3707:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3707:3: rule__GivenConsent__SuperTypeAssignment_0
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
    // InternalPactDSL.g:3715:1: rule__GivenConsent__Group__1 : rule__GivenConsent__Group__1__Impl ;
    public final void rule__GivenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3719:1: ( rule__GivenConsent__Group__1__Impl )
            // InternalPactDSL.g:3720:2: rule__GivenConsent__Group__1__Impl
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
    // InternalPactDSL.g:3726:1: rule__GivenConsent__Group__1__Impl : ( 'gaveConsent' ) ;
    public final void rule__GivenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3730:1: ( ( 'gaveConsent' ) )
            // InternalPactDSL.g:3731:1: ( 'gaveConsent' )
            {
            // InternalPactDSL.g:3731:1: ( 'gaveConsent' )
            // InternalPactDSL.g:3732:2: 'gaveConsent'
            {
             before(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalPactDSL.g:3742:1: rule__GivenWrittenConsent__Group__0 : rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 ;
    public final void rule__GivenWrittenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3746:1: ( rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 )
            // InternalPactDSL.g:3747:2: rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1
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
    // InternalPactDSL.g:3754:1: rule__GivenWrittenConsent__Group__0__Impl : ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenWrittenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3758:1: ( ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3759:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3759:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3760:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3761:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3761:3: rule__GivenWrittenConsent__SuperTypeAssignment_0
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
    // InternalPactDSL.g:3769:1: rule__GivenWrittenConsent__Group__1 : rule__GivenWrittenConsent__Group__1__Impl ;
    public final void rule__GivenWrittenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3773:1: ( rule__GivenWrittenConsent__Group__1__Impl )
            // InternalPactDSL.g:3774:2: rule__GivenWrittenConsent__Group__1__Impl
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
    // InternalPactDSL.g:3780:1: rule__GivenWrittenConsent__Group__1__Impl : ( 'gaveWrittenConsent' ) ;
    public final void rule__GivenWrittenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3784:1: ( ( 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:3785:1: ( 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:3785:1: ( 'gaveWrittenConsent' )
            // InternalPactDSL.g:3786:2: 'gaveWrittenConsent'
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 
            match(input,43,FOLLOW_2); 
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


    // $ANTLR start "rule__Ownership__Group__0"
    // InternalPactDSL.g:3796:1: rule__Ownership__Group__0 : rule__Ownership__Group__0__Impl rule__Ownership__Group__1 ;
    public final void rule__Ownership__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3800:1: ( rule__Ownership__Group__0__Impl rule__Ownership__Group__1 )
            // InternalPactDSL.g:3801:2: rule__Ownership__Group__0__Impl rule__Ownership__Group__1
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
    // InternalPactDSL.g:3808:1: rule__Ownership__Group__0__Impl : ( 'Ownership:' ) ;
    public final void rule__Ownership__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3812:1: ( ( 'Ownership:' ) )
            // InternalPactDSL.g:3813:1: ( 'Ownership:' )
            {
            // InternalPactDSL.g:3813:1: ( 'Ownership:' )
            // InternalPactDSL.g:3814:2: 'Ownership:'
            {
             before(grammarAccess.getOwnershipAccess().getOwnershipKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalPactDSL.g:3823:1: rule__Ownership__Group__1 : rule__Ownership__Group__1__Impl rule__Ownership__Group__2 ;
    public final void rule__Ownership__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3827:1: ( rule__Ownership__Group__1__Impl rule__Ownership__Group__2 )
            // InternalPactDSL.g:3828:2: rule__Ownership__Group__1__Impl rule__Ownership__Group__2
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
    // InternalPactDSL.g:3835:1: rule__Ownership__Group__1__Impl : ( ( rule__Ownership__SuperTypeAssignment_1 ) ) ;
    public final void rule__Ownership__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3839:1: ( ( ( rule__Ownership__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3840:1: ( ( rule__Ownership__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3840:1: ( ( rule__Ownership__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3841:2: ( rule__Ownership__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3842:2: ( rule__Ownership__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3842:3: rule__Ownership__SuperTypeAssignment_1
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
    // InternalPactDSL.g:3850:1: rule__Ownership__Group__2 : rule__Ownership__Group__2__Impl rule__Ownership__Group__3 ;
    public final void rule__Ownership__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3854:1: ( rule__Ownership__Group__2__Impl rule__Ownership__Group__3 )
            // InternalPactDSL.g:3855:2: rule__Ownership__Group__2__Impl rule__Ownership__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalPactDSL.g:3862:1: rule__Ownership__Group__2__Impl : ( ( rule__Ownership__Alternatives_2 ) ) ;
    public final void rule__Ownership__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3866:1: ( ( ( rule__Ownership__Alternatives_2 ) ) )
            // InternalPactDSL.g:3867:1: ( ( rule__Ownership__Alternatives_2 ) )
            {
            // InternalPactDSL.g:3867:1: ( ( rule__Ownership__Alternatives_2 ) )
            // InternalPactDSL.g:3868:2: ( rule__Ownership__Alternatives_2 )
            {
             before(grammarAccess.getOwnershipAccess().getAlternatives_2()); 
            // InternalPactDSL.g:3869:2: ( rule__Ownership__Alternatives_2 )
            // InternalPactDSL.g:3869:3: rule__Ownership__Alternatives_2
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
    // InternalPactDSL.g:3877:1: rule__Ownership__Group__3 : rule__Ownership__Group__3__Impl ;
    public final void rule__Ownership__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3881:1: ( rule__Ownership__Group__3__Impl )
            // InternalPactDSL.g:3882:2: rule__Ownership__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalPactDSL.g:3888:1: rule__Ownership__Group__3__Impl : ( ( rule__Ownership__CustomOwnershipAssignment_3 ) ) ;
    public final void rule__Ownership__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3892:1: ( ( ( rule__Ownership__CustomOwnershipAssignment_3 ) ) )
            // InternalPactDSL.g:3893:1: ( ( rule__Ownership__CustomOwnershipAssignment_3 ) )
            {
            // InternalPactDSL.g:3893:1: ( ( rule__Ownership__CustomOwnershipAssignment_3 ) )
            // InternalPactDSL.g:3894:2: ( rule__Ownership__CustomOwnershipAssignment_3 )
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_3()); 
            // InternalPactDSL.g:3895:2: ( rule__Ownership__CustomOwnershipAssignment_3 )
            // InternalPactDSL.g:3895:3: rule__Ownership__CustomOwnershipAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__CustomOwnershipAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__RightToUse__Group__0"
    // InternalPactDSL.g:3904:1: rule__RightToUse__Group__0 : rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 ;
    public final void rule__RightToUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3908:1: ( rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 )
            // InternalPactDSL.g:3909:2: rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1
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
    // InternalPactDSL.g:3916:1: rule__RightToUse__Group__0__Impl : ( 'RightToUse:' ) ;
    public final void rule__RightToUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3920:1: ( ( 'RightToUse:' ) )
            // InternalPactDSL.g:3921:1: ( 'RightToUse:' )
            {
            // InternalPactDSL.g:3921:1: ( 'RightToUse:' )
            // InternalPactDSL.g:3922:2: 'RightToUse:'
            {
             before(grammarAccess.getRightToUseAccess().getRightToUseKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalPactDSL.g:3931:1: rule__RightToUse__Group__1 : rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 ;
    public final void rule__RightToUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3935:1: ( rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 )
            // InternalPactDSL.g:3936:2: rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalPactDSL.g:3943:1: rule__RightToUse__Group__1__Impl : ( ( rule__RightToUse__SuperTypeAssignment_1 ) ) ;
    public final void rule__RightToUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3947:1: ( ( ( rule__RightToUse__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3948:1: ( ( rule__RightToUse__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3948:1: ( ( rule__RightToUse__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3949:2: ( rule__RightToUse__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3950:2: ( rule__RightToUse__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3950:3: rule__RightToUse__SuperTypeAssignment_1
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
    // InternalPactDSL.g:3958:1: rule__RightToUse__Group__2 : rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 ;
    public final void rule__RightToUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3962:1: ( rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 )
            // InternalPactDSL.g:3963:2: rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalPactDSL.g:3970:1: rule__RightToUse__Group__2__Impl : ( ( rule__RightToUse__Alternatives_2 ) ) ;
    public final void rule__RightToUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3974:1: ( ( ( rule__RightToUse__Alternatives_2 ) ) )
            // InternalPactDSL.g:3975:1: ( ( rule__RightToUse__Alternatives_2 ) )
            {
            // InternalPactDSL.g:3975:1: ( ( rule__RightToUse__Alternatives_2 ) )
            // InternalPactDSL.g:3976:2: ( rule__RightToUse__Alternatives_2 )
            {
             before(grammarAccess.getRightToUseAccess().getAlternatives_2()); 
            // InternalPactDSL.g:3977:2: ( rule__RightToUse__Alternatives_2 )
            // InternalPactDSL.g:3977:3: rule__RightToUse__Alternatives_2
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
    // InternalPactDSL.g:3985:1: rule__RightToUse__Group__3 : rule__RightToUse__Group__3__Impl ;
    public final void rule__RightToUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3989:1: ( rule__RightToUse__Group__3__Impl )
            // InternalPactDSL.g:3990:2: rule__RightToUse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalPactDSL.g:3996:1: rule__RightToUse__Group__3__Impl : ( ( rule__RightToUse__CustomUsageAssignment_3 ) ) ;
    public final void rule__RightToUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4000:1: ( ( ( rule__RightToUse__CustomUsageAssignment_3 ) ) )
            // InternalPactDSL.g:4001:1: ( ( rule__RightToUse__CustomUsageAssignment_3 ) )
            {
            // InternalPactDSL.g:4001:1: ( ( rule__RightToUse__CustomUsageAssignment_3 ) )
            // InternalPactDSL.g:4002:2: ( rule__RightToUse__CustomUsageAssignment_3 )
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_3()); 
            // InternalPactDSL.g:4003:2: ( rule__RightToUse__CustomUsageAssignment_3 )
            // InternalPactDSL.g:4003:3: rule__RightToUse__CustomUsageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__CustomUsageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__PaymentObligation__Group__0"
    // InternalPactDSL.g:4012:1: rule__PaymentObligation__Group__0 : rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 ;
    public final void rule__PaymentObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4016:1: ( rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 )
            // InternalPactDSL.g:4017:2: rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1
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
    // InternalPactDSL.g:4024:1: rule__PaymentObligation__Group__0__Impl : ( 'PaymentObligation:' ) ;
    public final void rule__PaymentObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4028:1: ( ( 'PaymentObligation:' ) )
            // InternalPactDSL.g:4029:1: ( 'PaymentObligation:' )
            {
            // InternalPactDSL.g:4029:1: ( 'PaymentObligation:' )
            // InternalPactDSL.g:4030:2: 'PaymentObligation:'
            {
             before(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalPactDSL.g:4039:1: rule__PaymentObligation__Group__1 : rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 ;
    public final void rule__PaymentObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4043:1: ( rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 )
            // InternalPactDSL.g:4044:2: rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPactDSL.g:4051:1: rule__PaymentObligation__Group__1__Impl : ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__PaymentObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4055:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4056:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4056:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4057:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4058:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4058:3: rule__PaymentObligation__SuperTypeAssignment_1
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
    // InternalPactDSL.g:4066:1: rule__PaymentObligation__Group__2 : rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 ;
    public final void rule__PaymentObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4070:1: ( rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 )
            // InternalPactDSL.g:4071:2: rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalPactDSL.g:4078:1: rule__PaymentObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__PaymentObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4082:1: ( ( 'must' ) )
            // InternalPactDSL.g:4083:1: ( 'must' )
            {
            // InternalPactDSL.g:4083:1: ( 'must' )
            // InternalPactDSL.g:4084:2: 'must'
            {
             before(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPactDSL.g:4093:1: rule__PaymentObligation__Group__3 : rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 ;
    public final void rule__PaymentObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4097:1: ( rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 )
            // InternalPactDSL.g:4098:2: rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4
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
    // InternalPactDSL.g:4105:1: rule__PaymentObligation__Group__3__Impl : ( 'pay' ) ;
    public final void rule__PaymentObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4109:1: ( ( 'pay' ) )
            // InternalPactDSL.g:4110:1: ( 'pay' )
            {
            // InternalPactDSL.g:4110:1: ( 'pay' )
            // InternalPactDSL.g:4111:2: 'pay'
            {
             before(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPactDSL.g:4120:1: rule__PaymentObligation__Group__4 : rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 ;
    public final void rule__PaymentObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4124:1: ( rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 )
            // InternalPactDSL.g:4125:2: rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5
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
    // InternalPactDSL.g:4132:1: rule__PaymentObligation__Group__4__Impl : ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) ;
    public final void rule__PaymentObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4136:1: ( ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:4137:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4137:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            // InternalPactDSL.g:4138:2: ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:4138:2: ( ( rule__PaymentObligation__SumAssignment_4 ) )
            // InternalPactDSL.g:4139:3: ( rule__PaymentObligation__SumAssignment_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4140:3: ( rule__PaymentObligation__SumAssignment_4 )
            // InternalPactDSL.g:4140:4: rule__PaymentObligation__SumAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:4143:2: ( ( rule__PaymentObligation__SumAssignment_4 )* )
            // InternalPactDSL.g:4144:3: ( rule__PaymentObligation__SumAssignment_4 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4145:3: ( rule__PaymentObligation__SumAssignment_4 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_INT) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalPactDSL.g:4145:4: rule__PaymentObligation__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PaymentObligation__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalPactDSL.g:4154:1: rule__PaymentObligation__Group__5 : rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 ;
    public final void rule__PaymentObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4158:1: ( rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 )
            // InternalPactDSL.g:4159:2: rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6
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
    // InternalPactDSL.g:4166:1: rule__PaymentObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__PaymentObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4170:1: ( ( 'to' ) )
            // InternalPactDSL.g:4171:1: ( 'to' )
            {
            // InternalPactDSL.g:4171:1: ( 'to' )
            // InternalPactDSL.g:4172:2: 'to'
            {
             before(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:4181:1: rule__PaymentObligation__Group__6 : rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 ;
    public final void rule__PaymentObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4185:1: ( rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 )
            // InternalPactDSL.g:4186:2: rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:4193:1: rule__PaymentObligation__Group__6__Impl : ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__PaymentObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4197:1: ( ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4198:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4198:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4199:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4199:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4200:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4201:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4201:4: rule__PaymentObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__PaymentObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4204:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4205:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4206:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPactDSL.g:4206:4: rule__PaymentObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PaymentObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalPactDSL.g:4215:1: rule__PaymentObligation__Group__7 : rule__PaymentObligation__Group__7__Impl ;
    public final void rule__PaymentObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4219:1: ( rule__PaymentObligation__Group__7__Impl )
            // InternalPactDSL.g:4220:2: rule__PaymentObligation__Group__7__Impl
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
    // InternalPactDSL.g:4226:1: rule__PaymentObligation__Group__7__Impl : ( ( rule__PaymentObligation__Group_7__0 )? ) ;
    public final void rule__PaymentObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4230:1: ( ( ( rule__PaymentObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4231:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4231:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            // InternalPactDSL.g:4232:2: ( rule__PaymentObligation__Group_7__0 )?
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4233:2: ( rule__PaymentObligation__Group_7__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPactDSL.g:4233:3: rule__PaymentObligation__Group_7__0
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
    // InternalPactDSL.g:4242:1: rule__PaymentObligation__Group_7__0 : rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 ;
    public final void rule__PaymentObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4246:1: ( rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 )
            // InternalPactDSL.g:4247:2: rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPactDSL.g:4254:1: rule__PaymentObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__PaymentObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4258:1: ( ( 'by' ) )
            // InternalPactDSL.g:4259:1: ( 'by' )
            {
            // InternalPactDSL.g:4259:1: ( 'by' )
            // InternalPactDSL.g:4260:2: 'by'
            {
             before(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:4269:1: rule__PaymentObligation__Group_7__1 : rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 ;
    public final void rule__PaymentObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4273:1: ( rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 )
            // InternalPactDSL.g:4274:2: rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2
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
    // InternalPactDSL.g:4281:1: rule__PaymentObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__PaymentObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4285:1: ( ( 'date' ) )
            // InternalPactDSL.g:4286:1: ( 'date' )
            {
            // InternalPactDSL.g:4286:1: ( 'date' )
            // InternalPactDSL.g:4287:2: 'date'
            {
             before(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPactDSL.g:4296:1: rule__PaymentObligation__Group_7__2 : rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 ;
    public final void rule__PaymentObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4300:1: ( rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 )
            // InternalPactDSL.g:4301:2: rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3
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
    // InternalPactDSL.g:4308:1: rule__PaymentObligation__Group_7__2__Impl : ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) ;
    public final void rule__PaymentObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4312:1: ( ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4313:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4313:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4314:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4315:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4315:3: rule__PaymentObligation__DayAssignment_7_2
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
    // InternalPactDSL.g:4323:1: rule__PaymentObligation__Group_7__3 : rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 ;
    public final void rule__PaymentObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4327:1: ( rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 )
            // InternalPactDSL.g:4328:2: rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4
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
    // InternalPactDSL.g:4335:1: rule__PaymentObligation__Group_7__3__Impl : ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__PaymentObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4339:1: ( ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4340:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4340:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4341:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4342:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4342:3: rule__PaymentObligation__MonthAssignment_7_3
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
    // InternalPactDSL.g:4350:1: rule__PaymentObligation__Group_7__4 : rule__PaymentObligation__Group_7__4__Impl ;
    public final void rule__PaymentObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4354:1: ( rule__PaymentObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4355:2: rule__PaymentObligation__Group_7__4__Impl
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
    // InternalPactDSL.g:4361:1: rule__PaymentObligation__Group_7__4__Impl : ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) ;
    public final void rule__PaymentObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4365:1: ( ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4366:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4366:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4367:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4368:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4368:3: rule__PaymentObligation__YearAssignment_7_4
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
    // InternalPactDSL.g:4377:1: rule__DeliveryObligation__Group__0 : rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 ;
    public final void rule__DeliveryObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4381:1: ( rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 )
            // InternalPactDSL.g:4382:2: rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1
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
    // InternalPactDSL.g:4389:1: rule__DeliveryObligation__Group__0__Impl : ( 'DeliveryObligation:' ) ;
    public final void rule__DeliveryObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4393:1: ( ( 'DeliveryObligation:' ) )
            // InternalPactDSL.g:4394:1: ( 'DeliveryObligation:' )
            {
            // InternalPactDSL.g:4394:1: ( 'DeliveryObligation:' )
            // InternalPactDSL.g:4395:2: 'DeliveryObligation:'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalPactDSL.g:4404:1: rule__DeliveryObligation__Group__1 : rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 ;
    public final void rule__DeliveryObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4408:1: ( rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 )
            // InternalPactDSL.g:4409:2: rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPactDSL.g:4416:1: rule__DeliveryObligation__Group__1__Impl : ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__DeliveryObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4420:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4421:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4421:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4422:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4423:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4423:3: rule__DeliveryObligation__SuperTypeAssignment_1
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
    // InternalPactDSL.g:4431:1: rule__DeliveryObligation__Group__2 : rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 ;
    public final void rule__DeliveryObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4435:1: ( rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 )
            // InternalPactDSL.g:4436:2: rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalPactDSL.g:4443:1: rule__DeliveryObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__DeliveryObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4447:1: ( ( 'must' ) )
            // InternalPactDSL.g:4448:1: ( 'must' )
            {
            // InternalPactDSL.g:4448:1: ( 'must' )
            // InternalPactDSL.g:4449:2: 'must'
            {
             before(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPactDSL.g:4458:1: rule__DeliveryObligation__Group__3 : rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 ;
    public final void rule__DeliveryObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4462:1: ( rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 )
            // InternalPactDSL.g:4463:2: rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4
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
    // InternalPactDSL.g:4470:1: rule__DeliveryObligation__Group__3__Impl : ( 'deliver' ) ;
    public final void rule__DeliveryObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4474:1: ( ( 'deliver' ) )
            // InternalPactDSL.g:4475:1: ( 'deliver' )
            {
            // InternalPactDSL.g:4475:1: ( 'deliver' )
            // InternalPactDSL.g:4476:2: 'deliver'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalPactDSL.g:4485:1: rule__DeliveryObligation__Group__4 : rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 ;
    public final void rule__DeliveryObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4489:1: ( rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 )
            // InternalPactDSL.g:4490:2: rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5
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
    // InternalPactDSL.g:4497:1: rule__DeliveryObligation__Group__4__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__DeliveryObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4501:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4502:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4502:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4503:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4503:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4504:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4505:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4505:4: rule__DeliveryObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4508:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4509:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4510:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPactDSL.g:4510:4: rule__DeliveryObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalPactDSL.g:4519:1: rule__DeliveryObligation__Group__5 : rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 ;
    public final void rule__DeliveryObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4523:1: ( rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 )
            // InternalPactDSL.g:4524:2: rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6
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
    // InternalPactDSL.g:4531:1: rule__DeliveryObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DeliveryObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4535:1: ( ( 'to' ) )
            // InternalPactDSL.g:4536:1: ( 'to' )
            {
            // InternalPactDSL.g:4536:1: ( 'to' )
            // InternalPactDSL.g:4537:2: 'to'
            {
             before(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:4546:1: rule__DeliveryObligation__Group__6 : rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 ;
    public final void rule__DeliveryObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4550:1: ( rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 )
            // InternalPactDSL.g:4551:2: rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:4558:1: rule__DeliveryObligation__Group__6__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__DeliveryObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4562:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4563:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4563:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4564:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4564:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4565:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4566:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4566:4: rule__DeliveryObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4569:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4570:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4571:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPactDSL.g:4571:4: rule__DeliveryObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalPactDSL.g:4580:1: rule__DeliveryObligation__Group__7 : rule__DeliveryObligation__Group__7__Impl ;
    public final void rule__DeliveryObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4584:1: ( rule__DeliveryObligation__Group__7__Impl )
            // InternalPactDSL.g:4585:2: rule__DeliveryObligation__Group__7__Impl
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
    // InternalPactDSL.g:4591:1: rule__DeliveryObligation__Group__7__Impl : ( ( rule__DeliveryObligation__Group_7__0 )? ) ;
    public final void rule__DeliveryObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4595:1: ( ( ( rule__DeliveryObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4596:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4596:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            // InternalPactDSL.g:4597:2: ( rule__DeliveryObligation__Group_7__0 )?
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4598:2: ( rule__DeliveryObligation__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPactDSL.g:4598:3: rule__DeliveryObligation__Group_7__0
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
    // InternalPactDSL.g:4607:1: rule__DeliveryObligation__Group_7__0 : rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 ;
    public final void rule__DeliveryObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4611:1: ( rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 )
            // InternalPactDSL.g:4612:2: rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPactDSL.g:4619:1: rule__DeliveryObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__DeliveryObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4623:1: ( ( 'by' ) )
            // InternalPactDSL.g:4624:1: ( 'by' )
            {
            // InternalPactDSL.g:4624:1: ( 'by' )
            // InternalPactDSL.g:4625:2: 'by'
            {
             before(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:4634:1: rule__DeliveryObligation__Group_7__1 : rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 ;
    public final void rule__DeliveryObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4638:1: ( rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 )
            // InternalPactDSL.g:4639:2: rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2
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
    // InternalPactDSL.g:4646:1: rule__DeliveryObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__DeliveryObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4650:1: ( ( 'date' ) )
            // InternalPactDSL.g:4651:1: ( 'date' )
            {
            // InternalPactDSL.g:4651:1: ( 'date' )
            // InternalPactDSL.g:4652:2: 'date'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPactDSL.g:4661:1: rule__DeliveryObligation__Group_7__2 : rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 ;
    public final void rule__DeliveryObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4665:1: ( rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 )
            // InternalPactDSL.g:4666:2: rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3
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
    // InternalPactDSL.g:4673:1: rule__DeliveryObligation__Group_7__2__Impl : ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) ;
    public final void rule__DeliveryObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4677:1: ( ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4678:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4678:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4679:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4680:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4680:3: rule__DeliveryObligation__DayAssignment_7_2
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
    // InternalPactDSL.g:4688:1: rule__DeliveryObligation__Group_7__3 : rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 ;
    public final void rule__DeliveryObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4692:1: ( rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 )
            // InternalPactDSL.g:4693:2: rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4
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
    // InternalPactDSL.g:4700:1: rule__DeliveryObligation__Group_7__3__Impl : ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__DeliveryObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4704:1: ( ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4705:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4705:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4706:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4707:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4707:3: rule__DeliveryObligation__MonthAssignment_7_3
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
    // InternalPactDSL.g:4715:1: rule__DeliveryObligation__Group_7__4 : rule__DeliveryObligation__Group_7__4__Impl ;
    public final void rule__DeliveryObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4719:1: ( rule__DeliveryObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4720:2: rule__DeliveryObligation__Group_7__4__Impl
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
    // InternalPactDSL.g:4726:1: rule__DeliveryObligation__Group_7__4__Impl : ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) ;
    public final void rule__DeliveryObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4730:1: ( ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4731:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4731:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4732:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4733:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4733:3: rule__DeliveryObligation__YearAssignment_7_4
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
    // InternalPactDSL.g:4742:1: rule__TransferObligation__Group__0 : rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 ;
    public final void rule__TransferObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4746:1: ( rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 )
            // InternalPactDSL.g:4747:2: rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1
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
    // InternalPactDSL.g:4754:1: rule__TransferObligation__Group__0__Impl : ( 'TransferObligation:' ) ;
    public final void rule__TransferObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4758:1: ( ( 'TransferObligation:' ) )
            // InternalPactDSL.g:4759:1: ( 'TransferObligation:' )
            {
            // InternalPactDSL.g:4759:1: ( 'TransferObligation:' )
            // InternalPactDSL.g:4760:2: 'TransferObligation:'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalPactDSL.g:4769:1: rule__TransferObligation__Group__1 : rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 ;
    public final void rule__TransferObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4773:1: ( rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 )
            // InternalPactDSL.g:4774:2: rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPactDSL.g:4781:1: rule__TransferObligation__Group__1__Impl : ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__TransferObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4785:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4786:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4786:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4787:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4788:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4788:3: rule__TransferObligation__SuperTypeAssignment_1
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
    // InternalPactDSL.g:4796:1: rule__TransferObligation__Group__2 : rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 ;
    public final void rule__TransferObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4800:1: ( rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 )
            // InternalPactDSL.g:4801:2: rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalPactDSL.g:4808:1: rule__TransferObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__TransferObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4812:1: ( ( 'must' ) )
            // InternalPactDSL.g:4813:1: ( 'must' )
            {
            // InternalPactDSL.g:4813:1: ( 'must' )
            // InternalPactDSL.g:4814:2: 'must'
            {
             before(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPactDSL.g:4823:1: rule__TransferObligation__Group__3 : rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 ;
    public final void rule__TransferObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4827:1: ( rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 )
            // InternalPactDSL.g:4828:2: rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4
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
    // InternalPactDSL.g:4835:1: rule__TransferObligation__Group__3__Impl : ( 'transfer' ) ;
    public final void rule__TransferObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4839:1: ( ( 'transfer' ) )
            // InternalPactDSL.g:4840:1: ( 'transfer' )
            {
            // InternalPactDSL.g:4840:1: ( 'transfer' )
            // InternalPactDSL.g:4841:2: 'transfer'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 
            match(input,54,FOLLOW_2); 
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
    // InternalPactDSL.g:4850:1: rule__TransferObligation__Group__4 : rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 ;
    public final void rule__TransferObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4854:1: ( rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 )
            // InternalPactDSL.g:4855:2: rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5
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
    // InternalPactDSL.g:4862:1: rule__TransferObligation__Group__4__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__TransferObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4866:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4867:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4867:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4868:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4868:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4869:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4870:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4870:4: rule__TransferObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4873:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4874:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4875:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPactDSL.g:4875:4: rule__TransferObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalPactDSL.g:4884:1: rule__TransferObligation__Group__5 : rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 ;
    public final void rule__TransferObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4888:1: ( rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 )
            // InternalPactDSL.g:4889:2: rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6
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
    // InternalPactDSL.g:4896:1: rule__TransferObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__TransferObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4900:1: ( ( 'to' ) )
            // InternalPactDSL.g:4901:1: ( 'to' )
            {
            // InternalPactDSL.g:4901:1: ( 'to' )
            // InternalPactDSL.g:4902:2: 'to'
            {
             before(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:4911:1: rule__TransferObligation__Group__6 : rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 ;
    public final void rule__TransferObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4915:1: ( rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 )
            // InternalPactDSL.g:4916:2: rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:4923:1: rule__TransferObligation__Group__6__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__TransferObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4927:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4928:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4928:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4929:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4929:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4930:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4931:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4931:4: rule__TransferObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4934:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4935:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4936:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPactDSL.g:4936:4: rule__TransferObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalPactDSL.g:4945:1: rule__TransferObligation__Group__7 : rule__TransferObligation__Group__7__Impl ;
    public final void rule__TransferObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4949:1: ( rule__TransferObligation__Group__7__Impl )
            // InternalPactDSL.g:4950:2: rule__TransferObligation__Group__7__Impl
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
    // InternalPactDSL.g:4956:1: rule__TransferObligation__Group__7__Impl : ( ( rule__TransferObligation__Group_7__0 )? ) ;
    public final void rule__TransferObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4960:1: ( ( ( rule__TransferObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4961:1: ( ( rule__TransferObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4961:1: ( ( rule__TransferObligation__Group_7__0 )? )
            // InternalPactDSL.g:4962:2: ( rule__TransferObligation__Group_7__0 )?
            {
             before(grammarAccess.getTransferObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4963:2: ( rule__TransferObligation__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPactDSL.g:4963:3: rule__TransferObligation__Group_7__0
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
    // InternalPactDSL.g:4972:1: rule__TransferObligation__Group_7__0 : rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 ;
    public final void rule__TransferObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4976:1: ( rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 )
            // InternalPactDSL.g:4977:2: rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPactDSL.g:4984:1: rule__TransferObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__TransferObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4988:1: ( ( 'by' ) )
            // InternalPactDSL.g:4989:1: ( 'by' )
            {
            // InternalPactDSL.g:4989:1: ( 'by' )
            // InternalPactDSL.g:4990:2: 'by'
            {
             before(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:4999:1: rule__TransferObligation__Group_7__1 : rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 ;
    public final void rule__TransferObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5003:1: ( rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 )
            // InternalPactDSL.g:5004:2: rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2
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
    // InternalPactDSL.g:5011:1: rule__TransferObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__TransferObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5015:1: ( ( 'date' ) )
            // InternalPactDSL.g:5016:1: ( 'date' )
            {
            // InternalPactDSL.g:5016:1: ( 'date' )
            // InternalPactDSL.g:5017:2: 'date'
            {
             before(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPactDSL.g:5026:1: rule__TransferObligation__Group_7__2 : rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 ;
    public final void rule__TransferObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5030:1: ( rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 )
            // InternalPactDSL.g:5031:2: rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3
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
    // InternalPactDSL.g:5038:1: rule__TransferObligation__Group_7__2__Impl : ( ( rule__TransferObligation__DayAssignment_7_2 ) ) ;
    public final void rule__TransferObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5042:1: ( ( ( rule__TransferObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:5043:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:5043:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:5044:2: ( rule__TransferObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:5045:2: ( rule__TransferObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:5045:3: rule__TransferObligation__DayAssignment_7_2
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
    // InternalPactDSL.g:5053:1: rule__TransferObligation__Group_7__3 : rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 ;
    public final void rule__TransferObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5057:1: ( rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 )
            // InternalPactDSL.g:5058:2: rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4
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
    // InternalPactDSL.g:5065:1: rule__TransferObligation__Group_7__3__Impl : ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__TransferObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5069:1: ( ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:5070:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:5070:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:5071:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:5072:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:5072:3: rule__TransferObligation__MonthAssignment_7_3
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
    // InternalPactDSL.g:5080:1: rule__TransferObligation__Group_7__4 : rule__TransferObligation__Group_7__4__Impl ;
    public final void rule__TransferObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5084:1: ( rule__TransferObligation__Group_7__4__Impl )
            // InternalPactDSL.g:5085:2: rule__TransferObligation__Group_7__4__Impl
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
    // InternalPactDSL.g:5091:1: rule__TransferObligation__Group_7__4__Impl : ( ( rule__TransferObligation__YearAssignment_7_4 ) ) ;
    public final void rule__TransferObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5095:1: ( ( ( rule__TransferObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:5096:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:5096:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:5097:2: ( rule__TransferObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:5098:2: ( rule__TransferObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:5098:3: rule__TransferObligation__YearAssignment_7_4
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
    // InternalPactDSL.g:5107:1: rule__LicenceObligation__Group__0 : rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 ;
    public final void rule__LicenceObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5111:1: ( rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 )
            // InternalPactDSL.g:5112:2: rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1
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
    // InternalPactDSL.g:5119:1: rule__LicenceObligation__Group__0__Impl : ( 'LicenceObligation:' ) ;
    public final void rule__LicenceObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5123:1: ( ( 'LicenceObligation:' ) )
            // InternalPactDSL.g:5124:1: ( 'LicenceObligation:' )
            {
            // InternalPactDSL.g:5124:1: ( 'LicenceObligation:' )
            // InternalPactDSL.g:5125:2: 'LicenceObligation:'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalPactDSL.g:5134:1: rule__LicenceObligation__Group__1 : rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 ;
    public final void rule__LicenceObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5138:1: ( rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 )
            // InternalPactDSL.g:5139:2: rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPactDSL.g:5146:1: rule__LicenceObligation__Group__1__Impl : ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__LicenceObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5150:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5151:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5151:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5152:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5153:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5153:3: rule__LicenceObligation__SuperTypeAssignment_1
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
    // InternalPactDSL.g:5161:1: rule__LicenceObligation__Group__2 : rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 ;
    public final void rule__LicenceObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5165:1: ( rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 )
            // InternalPactDSL.g:5166:2: rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalPactDSL.g:5173:1: rule__LicenceObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__LicenceObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5177:1: ( ( 'must' ) )
            // InternalPactDSL.g:5178:1: ( 'must' )
            {
            // InternalPactDSL.g:5178:1: ( 'must' )
            // InternalPactDSL.g:5179:2: 'must'
            {
             before(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPactDSL.g:5188:1: rule__LicenceObligation__Group__3 : rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 ;
    public final void rule__LicenceObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5192:1: ( rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 )
            // InternalPactDSL.g:5193:2: rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalPactDSL.g:5200:1: rule__LicenceObligation__Group__3__Impl : ( 'grant' ) ;
    public final void rule__LicenceObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5204:1: ( ( 'grant' ) )
            // InternalPactDSL.g:5205:1: ( 'grant' )
            {
            // InternalPactDSL.g:5205:1: ( 'grant' )
            // InternalPactDSL.g:5206:2: 'grant'
            {
             before(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalPactDSL.g:5215:1: rule__LicenceObligation__Group__4 : rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 ;
    public final void rule__LicenceObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5219:1: ( rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 )
            // InternalPactDSL.g:5220:2: rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalPactDSL.g:5227:1: rule__LicenceObligation__Group__4__Impl : ( 'Licence' ) ;
    public final void rule__LicenceObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5231:1: ( ( 'Licence' ) )
            // InternalPactDSL.g:5232:1: ( 'Licence' )
            {
            // InternalPactDSL.g:5232:1: ( 'Licence' )
            // InternalPactDSL.g:5233:2: 'Licence'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalPactDSL.g:5242:1: rule__LicenceObligation__Group__5 : rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 ;
    public final void rule__LicenceObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5246:1: ( rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 )
            // InternalPactDSL.g:5247:2: rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6
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
    // InternalPactDSL.g:5254:1: rule__LicenceObligation__Group__5__Impl : ( 'in' ) ;
    public final void rule__LicenceObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5258:1: ( ( 'in' ) )
            // InternalPactDSL.g:5259:1: ( 'in' )
            {
            // InternalPactDSL.g:5259:1: ( 'in' )
            // InternalPactDSL.g:5260:2: 'in'
            {
             before(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 
            match(input,58,FOLLOW_2); 
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
    // InternalPactDSL.g:5269:1: rule__LicenceObligation__Group__6 : rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 ;
    public final void rule__LicenceObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5273:1: ( rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 )
            // InternalPactDSL.g:5274:2: rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7
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
    // InternalPactDSL.g:5281:1: rule__LicenceObligation__Group__6__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__LicenceObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5285:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:5286:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:5286:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:5287:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:5287:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:5288:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5289:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:5289:4: rule__LicenceObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:5292:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:5293:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5294:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPactDSL.g:5294:4: rule__LicenceObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalPactDSL.g:5303:1: rule__LicenceObligation__Group__7 : rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 ;
    public final void rule__LicenceObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5307:1: ( rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 )
            // InternalPactDSL.g:5308:2: rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8
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
    // InternalPactDSL.g:5315:1: rule__LicenceObligation__Group__7__Impl : ( 'to' ) ;
    public final void rule__LicenceObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5319:1: ( ( 'to' ) )
            // InternalPactDSL.g:5320:1: ( 'to' )
            {
            // InternalPactDSL.g:5320:1: ( 'to' )
            // InternalPactDSL.g:5321:2: 'to'
            {
             before(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:5330:1: rule__LicenceObligation__Group__8 : rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 ;
    public final void rule__LicenceObligation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5334:1: ( rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 )
            // InternalPactDSL.g:5335:2: rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:5342:1: rule__LicenceObligation__Group__8__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) ;
    public final void rule__LicenceObligation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5346:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) )
            // InternalPactDSL.g:5347:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            {
            // InternalPactDSL.g:5347:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            // InternalPactDSL.g:5348:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            {
            // InternalPactDSL.g:5348:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) )
            // InternalPactDSL.g:5349:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5350:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            // InternalPactDSL.g:5350:4: rule__LicenceObligation__SuperTypeAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }

            // InternalPactDSL.g:5353:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            // InternalPactDSL.g:5354:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5355:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPactDSL.g:5355:4: rule__LicenceObligation__SuperTypeAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalPactDSL.g:5364:1: rule__LicenceObligation__Group__9 : rule__LicenceObligation__Group__9__Impl ;
    public final void rule__LicenceObligation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5368:1: ( rule__LicenceObligation__Group__9__Impl )
            // InternalPactDSL.g:5369:2: rule__LicenceObligation__Group__9__Impl
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
    // InternalPactDSL.g:5375:1: rule__LicenceObligation__Group__9__Impl : ( ( rule__LicenceObligation__Group_9__0 )* ) ;
    public final void rule__LicenceObligation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5379:1: ( ( ( rule__LicenceObligation__Group_9__0 )* ) )
            // InternalPactDSL.g:5380:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            {
            // InternalPactDSL.g:5380:1: ( ( rule__LicenceObligation__Group_9__0 )* )
            // InternalPactDSL.g:5381:2: ( rule__LicenceObligation__Group_9__0 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup_9()); 
            // InternalPactDSL.g:5382:2: ( rule__LicenceObligation__Group_9__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==49) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPactDSL.g:5382:3: rule__LicenceObligation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__LicenceObligation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalPactDSL.g:5391:1: rule__LicenceObligation__Group_9__0 : rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 ;
    public final void rule__LicenceObligation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5395:1: ( rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 )
            // InternalPactDSL.g:5396:2: rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalPactDSL.g:5403:1: rule__LicenceObligation__Group_9__0__Impl : ( 'by' ) ;
    public final void rule__LicenceObligation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5407:1: ( ( 'by' ) )
            // InternalPactDSL.g:5408:1: ( 'by' )
            {
            // InternalPactDSL.g:5408:1: ( 'by' )
            // InternalPactDSL.g:5409:2: 'by'
            {
             before(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:5418:1: rule__LicenceObligation__Group_9__1 : rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 ;
    public final void rule__LicenceObligation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5422:1: ( rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 )
            // InternalPactDSL.g:5423:2: rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2
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
    // InternalPactDSL.g:5430:1: rule__LicenceObligation__Group_9__1__Impl : ( 'date' ) ;
    public final void rule__LicenceObligation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5434:1: ( ( 'date' ) )
            // InternalPactDSL.g:5435:1: ( 'date' )
            {
            // InternalPactDSL.g:5435:1: ( 'date' )
            // InternalPactDSL.g:5436:2: 'date'
            {
             before(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalPactDSL.g:5445:1: rule__LicenceObligation__Group_9__2 : rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 ;
    public final void rule__LicenceObligation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5449:1: ( rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 )
            // InternalPactDSL.g:5450:2: rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3
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
    // InternalPactDSL.g:5457:1: rule__LicenceObligation__Group_9__2__Impl : ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) ;
    public final void rule__LicenceObligation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5461:1: ( ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) )
            // InternalPactDSL.g:5462:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            {
            // InternalPactDSL.g:5462:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            // InternalPactDSL.g:5463:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            {
             before(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 
            // InternalPactDSL.g:5464:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            // InternalPactDSL.g:5464:3: rule__LicenceObligation__DayAssignment_9_2
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
    // InternalPactDSL.g:5472:1: rule__LicenceObligation__Group_9__3 : rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 ;
    public final void rule__LicenceObligation__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5476:1: ( rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 )
            // InternalPactDSL.g:5477:2: rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4
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
    // InternalPactDSL.g:5484:1: rule__LicenceObligation__Group_9__3__Impl : ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) ;
    public final void rule__LicenceObligation__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5488:1: ( ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) )
            // InternalPactDSL.g:5489:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            {
            // InternalPactDSL.g:5489:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            // InternalPactDSL.g:5490:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 
            // InternalPactDSL.g:5491:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            // InternalPactDSL.g:5491:3: rule__LicenceObligation__MonthAssignment_9_3
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
    // InternalPactDSL.g:5499:1: rule__LicenceObligation__Group_9__4 : rule__LicenceObligation__Group_9__4__Impl ;
    public final void rule__LicenceObligation__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5503:1: ( rule__LicenceObligation__Group_9__4__Impl )
            // InternalPactDSL.g:5504:2: rule__LicenceObligation__Group_9__4__Impl
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
    // InternalPactDSL.g:5510:1: rule__LicenceObligation__Group_9__4__Impl : ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) ;
    public final void rule__LicenceObligation__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5514:1: ( ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) )
            // InternalPactDSL.g:5515:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            {
            // InternalPactDSL.g:5515:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            // InternalPactDSL.g:5516:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            {
             before(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 
            // InternalPactDSL.g:5517:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            // InternalPactDSL.g:5517:3: rule__LicenceObligation__YearAssignment_9_4
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
    // InternalPactDSL.g:5526:1: rule__ConstraintParty__Group__0 : rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 ;
    public final void rule__ConstraintParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5530:1: ( rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 )
            // InternalPactDSL.g:5531:2: rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1
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
    // InternalPactDSL.g:5538:1: rule__ConstraintParty__Group__0__Impl : ( 'ConstraintParty:' ) ;
    public final void rule__ConstraintParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5542:1: ( ( 'ConstraintParty:' ) )
            // InternalPactDSL.g:5543:1: ( 'ConstraintParty:' )
            {
            // InternalPactDSL.g:5543:1: ( 'ConstraintParty:' )
            // InternalPactDSL.g:5544:2: 'ConstraintParty:'
            {
             before(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalPactDSL.g:5553:1: rule__ConstraintParty__Group__1 : rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 ;
    public final void rule__ConstraintParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5557:1: ( rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 )
            // InternalPactDSL.g:5558:2: rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalPactDSL.g:5565:1: rule__ConstraintParty__Group__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5569:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5570:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5570:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5571:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5572:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5572:3: rule__ConstraintParty__SuperTypeAssignment_1
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
    // InternalPactDSL.g:5580:1: rule__ConstraintParty__Group__2 : rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 ;
    public final void rule__ConstraintParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5584:1: ( rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 )
            // InternalPactDSL.g:5585:2: rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3
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
    // InternalPactDSL.g:5592:1: rule__ConstraintParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5596:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5597:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5597:1: ( 'mustNot' )
            // InternalPactDSL.g:5598:2: 'mustNot'
            {
             before(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalPactDSL.g:5607:1: rule__ConstraintParty__Group__3 : rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 ;
    public final void rule__ConstraintParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5611:1: ( rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 )
            // InternalPactDSL.g:5612:2: rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalPactDSL.g:5619:1: rule__ConstraintParty__Group__3__Impl : ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5623:1: ( ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5624:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5624:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5625:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5626:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5626:3: rule__ConstraintParty__ForbiddenActionAssignment_3
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
    // InternalPactDSL.g:5634:1: rule__ConstraintParty__Group__4 : rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 ;
    public final void rule__ConstraintParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5638:1: ( rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 )
            // InternalPactDSL.g:5639:2: rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalPactDSL.g:5646:1: rule__ConstraintParty__Group__4__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5650:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5651:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5651:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5652:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5653:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPactDSL.g:5653:3: rule__ConstraintParty__SuperTypeAssignment_4
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
    // InternalPactDSL.g:5661:1: rule__ConstraintParty__Group__5 : rule__ConstraintParty__Group__5__Impl ;
    public final void rule__ConstraintParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5665:1: ( rule__ConstraintParty__Group__5__Impl )
            // InternalPactDSL.g:5666:2: rule__ConstraintParty__Group__5__Impl
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
    // InternalPactDSL.g:5672:1: rule__ConstraintParty__Group__5__Impl : ( ( rule__ConstraintParty__Group_5__0 )? ) ;
    public final void rule__ConstraintParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5676:1: ( ( ( rule__ConstraintParty__Group_5__0 )? ) )
            // InternalPactDSL.g:5677:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            {
            // InternalPactDSL.g:5677:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            // InternalPactDSL.g:5678:2: ( rule__ConstraintParty__Group_5__0 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup_5()); 
            // InternalPactDSL.g:5679:2: ( rule__ConstraintParty__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPactDSL.g:5679:3: rule__ConstraintParty__Group_5__0
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
    // InternalPactDSL.g:5688:1: rule__ConstraintParty__Group_5__0 : rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 ;
    public final void rule__ConstraintParty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5692:1: ( rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 )
            // InternalPactDSL.g:5693:2: rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1
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
    // InternalPactDSL.g:5700:1: rule__ConstraintParty__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintParty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5704:1: ( ( 'to' ) )
            // InternalPactDSL.g:5705:1: ( 'to' )
            {
            // InternalPactDSL.g:5705:1: ( 'to' )
            // InternalPactDSL.g:5706:2: 'to'
            {
             before(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:5715:1: rule__ConstraintParty__Group_5__1 : rule__ConstraintParty__Group_5__1__Impl ;
    public final void rule__ConstraintParty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5719:1: ( rule__ConstraintParty__Group_5__1__Impl )
            // InternalPactDSL.g:5720:2: rule__ConstraintParty__Group_5__1__Impl
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
    // InternalPactDSL.g:5726:1: rule__ConstraintParty__Group_5__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__ConstraintParty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5730:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:5731:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:5731:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:5732:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:5733:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:5733:3: rule__ConstraintParty__SuperTypeAssignment_5_1
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
    // InternalPactDSL.g:5742:1: rule__ConstraintThirdParty__Group__0 : rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 ;
    public final void rule__ConstraintThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5746:1: ( rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 )
            // InternalPactDSL.g:5747:2: rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1
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
    // InternalPactDSL.g:5754:1: rule__ConstraintThirdParty__Group__0__Impl : ( 'ConstraintThirdParty:' ) ;
    public final void rule__ConstraintThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5758:1: ( ( 'ConstraintThirdParty:' ) )
            // InternalPactDSL.g:5759:1: ( 'ConstraintThirdParty:' )
            {
            // InternalPactDSL.g:5759:1: ( 'ConstraintThirdParty:' )
            // InternalPactDSL.g:5760:2: 'ConstraintThirdParty:'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalPactDSL.g:5769:1: rule__ConstraintThirdParty__Group__1 : rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 ;
    public final void rule__ConstraintThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5773:1: ( rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 )
            // InternalPactDSL.g:5774:2: rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalPactDSL.g:5781:1: rule__ConstraintThirdParty__Group__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5785:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5786:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5786:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5787:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5788:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5788:3: rule__ConstraintThirdParty__SuperTypeAssignment_1
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
    // InternalPactDSL.g:5796:1: rule__ConstraintThirdParty__Group__2 : rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 ;
    public final void rule__ConstraintThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5800:1: ( rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 )
            // InternalPactDSL.g:5801:2: rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3
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
    // InternalPactDSL.g:5808:1: rule__ConstraintThirdParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5812:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5813:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5813:1: ( 'mustNot' )
            // InternalPactDSL.g:5814:2: 'mustNot'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalPactDSL.g:5823:1: rule__ConstraintThirdParty__Group__3 : rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 ;
    public final void rule__ConstraintThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5827:1: ( rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 )
            // InternalPactDSL.g:5828:2: rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalPactDSL.g:5835:1: rule__ConstraintThirdParty__Group__3__Impl : ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5839:1: ( ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5840:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5840:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5841:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5842:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5842:3: rule__ConstraintThirdParty__ForbiddenActionAssignment_3
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
    // InternalPactDSL.g:5850:1: rule__ConstraintThirdParty__Group__4 : rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 ;
    public final void rule__ConstraintThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5854:1: ( rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 )
            // InternalPactDSL.g:5855:2: rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5
            {
            pushFollow(FOLLOW_44);
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
    // InternalPactDSL.g:5862:1: rule__ConstraintThirdParty__Group__4__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5866:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5867:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5867:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5868:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5869:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalPactDSL.g:5869:3: rule__ConstraintThirdParty__SuperTypeAssignment_4
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
    // InternalPactDSL.g:5877:1: rule__ConstraintThirdParty__Group__5 : rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 ;
    public final void rule__ConstraintThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5881:1: ( rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 )
            // InternalPactDSL.g:5882:2: rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6
            {
            pushFollow(FOLLOW_44);
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
    // InternalPactDSL.g:5889:1: rule__ConstraintThirdParty__Group__5__Impl : ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) ;
    public final void rule__ConstraintThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5893:1: ( ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) )
            // InternalPactDSL.g:5894:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            {
            // InternalPactDSL.g:5894:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            // InternalPactDSL.g:5895:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 
            // InternalPactDSL.g:5896:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_STRING) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalPactDSL.g:5896:3: rule__ConstraintThirdParty__AdditionalInfoAssignment_5
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
    // InternalPactDSL.g:5904:1: rule__ConstraintThirdParty__Group__6 : rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 ;
    public final void rule__ConstraintThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5908:1: ( rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 )
            // InternalPactDSL.g:5909:2: rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7
            {
            pushFollow(FOLLOW_44);
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
    // InternalPactDSL.g:5916:1: rule__ConstraintThirdParty__Group__6__Impl : ( ( rule__ConstraintThirdParty__Group_6__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5920:1: ( ( ( rule__ConstraintThirdParty__Group_6__0 )? ) )
            // InternalPactDSL.g:5921:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            {
            // InternalPactDSL.g:5921:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            // InternalPactDSL.g:5922:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 
            // InternalPactDSL.g:5923:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPactDSL.g:5923:3: rule__ConstraintThirdParty__Group_6__0
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
    // InternalPactDSL.g:5931:1: rule__ConstraintThirdParty__Group__7 : rule__ConstraintThirdParty__Group__7__Impl ;
    public final void rule__ConstraintThirdParty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5935:1: ( rule__ConstraintThirdParty__Group__7__Impl )
            // InternalPactDSL.g:5936:2: rule__ConstraintThirdParty__Group__7__Impl
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
    // InternalPactDSL.g:5942:1: rule__ConstraintThirdParty__Group__7__Impl : ( ( rule__ConstraintThirdParty__Group_7__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5946:1: ( ( ( rule__ConstraintThirdParty__Group_7__0 )? ) )
            // InternalPactDSL.g:5947:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            {
            // InternalPactDSL.g:5947:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            // InternalPactDSL.g:5948:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 
            // InternalPactDSL.g:5949:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPactDSL.g:5949:3: rule__ConstraintThirdParty__Group_7__0
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
    // InternalPactDSL.g:5958:1: rule__ConstraintThirdParty__Group_6__0 : rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 ;
    public final void rule__ConstraintThirdParty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5962:1: ( rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 )
            // InternalPactDSL.g:5963:2: rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1
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
    // InternalPactDSL.g:5970:1: rule__ConstraintThirdParty__Group_6__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintThirdParty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5974:1: ( ( 'to' ) )
            // InternalPactDSL.g:5975:1: ( 'to' )
            {
            // InternalPactDSL.g:5975:1: ( 'to' )
            // InternalPactDSL.g:5976:2: 'to'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:5985:1: rule__ConstraintThirdParty__Group_6__1 : rule__ConstraintThirdParty__Group_6__1__Impl ;
    public final void rule__ConstraintThirdParty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5989:1: ( rule__ConstraintThirdParty__Group_6__1__Impl )
            // InternalPactDSL.g:5990:2: rule__ConstraintThirdParty__Group_6__1__Impl
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
    // InternalPactDSL.g:5996:1: rule__ConstraintThirdParty__Group_6__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6000:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) )
            // InternalPactDSL.g:6001:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            {
            // InternalPactDSL.g:6001:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            // InternalPactDSL.g:6002:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 
            // InternalPactDSL.g:6003:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            // InternalPactDSL.g:6003:3: rule__ConstraintThirdParty__SuperTypeAssignment_6_1
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
    // InternalPactDSL.g:6012:1: rule__ConstraintThirdParty__Group_7__0 : rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 ;
    public final void rule__ConstraintThirdParty__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6016:1: ( rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 )
            // InternalPactDSL.g:6017:2: rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalPactDSL.g:6024:1: rule__ConstraintThirdParty__Group_7__0__Impl : ( 'unless' ) ;
    public final void rule__ConstraintThirdParty__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6028:1: ( ( 'unless' ) )
            // InternalPactDSL.g:6029:1: ( 'unless' )
            {
            // InternalPactDSL.g:6029:1: ( 'unless' )
            // InternalPactDSL.g:6030:2: 'unless'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalPactDSL.g:6039:1: rule__ConstraintThirdParty__Group_7__1 : rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 ;
    public final void rule__ConstraintThirdParty__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6043:1: ( rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 )
            // InternalPactDSL.g:6044:2: rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalPactDSL.g:6051:1: rule__ConstraintThirdParty__Group_7__1__Impl : ( 'withWrittenConsent' ) ;
    public final void rule__ConstraintThirdParty__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6055:1: ( ( 'withWrittenConsent' ) )
            // InternalPactDSL.g:6056:1: ( 'withWrittenConsent' )
            {
            // InternalPactDSL.g:6056:1: ( 'withWrittenConsent' )
            // InternalPactDSL.g:6057:2: 'withWrittenConsent'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalPactDSL.g:6066:1: rule__ConstraintThirdParty__Group_7__2 : rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 ;
    public final void rule__ConstraintThirdParty__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6070:1: ( rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 )
            // InternalPactDSL.g:6071:2: rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3
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
    // InternalPactDSL.g:6078:1: rule__ConstraintThirdParty__Group_7__2__Impl : ( 'of' ) ;
    public final void rule__ConstraintThirdParty__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6082:1: ( ( 'of' ) )
            // InternalPactDSL.g:6083:1: ( 'of' )
            {
            // InternalPactDSL.g:6083:1: ( 'of' )
            // InternalPactDSL.g:6084:2: 'of'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalPactDSL.g:6093:1: rule__ConstraintThirdParty__Group_7__3 : rule__ConstraintThirdParty__Group_7__3__Impl ;
    public final void rule__ConstraintThirdParty__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6097:1: ( rule__ConstraintThirdParty__Group_7__3__Impl )
            // InternalPactDSL.g:6098:2: rule__ConstraintThirdParty__Group_7__3__Impl
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
    // InternalPactDSL.g:6104:1: rule__ConstraintThirdParty__Group_7__3__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6108:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) )
            // InternalPactDSL.g:6109:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            {
            // InternalPactDSL.g:6109:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            // InternalPactDSL.g:6110:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 
            // InternalPactDSL.g:6111:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            // InternalPactDSL.g:6111:3: rule__ConstraintThirdParty__SuperTypeAssignment_7_3
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


    // $ANTLR start "rule__SecondaryObligationType__Group__0"
    // InternalPactDSL.g:6120:1: rule__SecondaryObligationType__Group__0 : rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1 ;
    public final void rule__SecondaryObligationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6124:1: ( rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1 )
            // InternalPactDSL.g:6125:2: rule__SecondaryObligationType__Group__0__Impl rule__SecondaryObligationType__Group__1
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
    // InternalPactDSL.g:6132:1: rule__SecondaryObligationType__Group__0__Impl : ( 'SecondaryObligation:' ) ;
    public final void rule__SecondaryObligationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6136:1: ( ( 'SecondaryObligation:' ) )
            // InternalPactDSL.g:6137:1: ( 'SecondaryObligation:' )
            {
            // InternalPactDSL.g:6137:1: ( 'SecondaryObligation:' )
            // InternalPactDSL.g:6138:2: 'SecondaryObligation:'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSecondaryObligationKeyword_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalPactDSL.g:6147:1: rule__SecondaryObligationType__Group__1 : rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2 ;
    public final void rule__SecondaryObligationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6151:1: ( rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2 )
            // InternalPactDSL.g:6152:2: rule__SecondaryObligationType__Group__1__Impl rule__SecondaryObligationType__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalPactDSL.g:6159:1: rule__SecondaryObligationType__Group__1__Impl : ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) ) ;
    public final void rule__SecondaryObligationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6163:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6164:1: ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6164:1: ( ( rule__SecondaryObligationType__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6165:2: ( rule__SecondaryObligationType__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6166:2: ( rule__SecondaryObligationType__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6166:3: rule__SecondaryObligationType__SuperTypeAssignment_1
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
    // InternalPactDSL.g:6174:1: rule__SecondaryObligationType__Group__2 : rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3 ;
    public final void rule__SecondaryObligationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6178:1: ( rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3 )
            // InternalPactDSL.g:6179:2: rule__SecondaryObligationType__Group__2__Impl rule__SecondaryObligationType__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalPactDSL.g:6186:1: rule__SecondaryObligationType__Group__2__Impl : ( 'must' ) ;
    public final void rule__SecondaryObligationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6190:1: ( ( 'must' ) )
            // InternalPactDSL.g:6191:1: ( 'must' )
            {
            // InternalPactDSL.g:6191:1: ( 'must' )
            // InternalPactDSL.g:6192:2: 'must'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getMustKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalPactDSL.g:6201:1: rule__SecondaryObligationType__Group__3 : rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4 ;
    public final void rule__SecondaryObligationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6205:1: ( rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4 )
            // InternalPactDSL.g:6206:2: rule__SecondaryObligationType__Group__3__Impl rule__SecondaryObligationType__Group__4
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
    // InternalPactDSL.g:6213:1: rule__SecondaryObligationType__Group__3__Impl : ( 'pay' ) ;
    public final void rule__SecondaryObligationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6217:1: ( ( 'pay' ) )
            // InternalPactDSL.g:6218:1: ( 'pay' )
            {
            // InternalPactDSL.g:6218:1: ( 'pay' )
            // InternalPactDSL.g:6219:2: 'pay'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getPayKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalPactDSL.g:6228:1: rule__SecondaryObligationType__Group__4 : rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5 ;
    public final void rule__SecondaryObligationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6232:1: ( rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5 )
            // InternalPactDSL.g:6233:2: rule__SecondaryObligationType__Group__4__Impl rule__SecondaryObligationType__Group__5
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
    // InternalPactDSL.g:6240:1: rule__SecondaryObligationType__Group__4__Impl : ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) ) ;
    public final void rule__SecondaryObligationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6244:1: ( ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:6245:1: ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:6245:1: ( ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* ) )
            // InternalPactDSL.g:6246:2: ( ( rule__SecondaryObligationType__SumAssignment_4 ) ) ( ( rule__SecondaryObligationType__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:6246:2: ( ( rule__SecondaryObligationType__SumAssignment_4 ) )
            // InternalPactDSL.g:6247:3: ( rule__SecondaryObligationType__SumAssignment_4 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:6248:3: ( rule__SecondaryObligationType__SumAssignment_4 )
            // InternalPactDSL.g:6248:4: rule__SecondaryObligationType__SumAssignment_4
            {
            pushFollow(FOLLOW_21);
            rule__SecondaryObligationType__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:6251:2: ( ( rule__SecondaryObligationType__SumAssignment_4 )* )
            // InternalPactDSL.g:6252:3: ( rule__SecondaryObligationType__SumAssignment_4 )*
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:6253:3: ( rule__SecondaryObligationType__SumAssignment_4 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_INT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPactDSL.g:6253:4: rule__SecondaryObligationType__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SecondaryObligationType__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalPactDSL.g:6262:1: rule__SecondaryObligationType__Group__5 : rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6 ;
    public final void rule__SecondaryObligationType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6266:1: ( rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6 )
            // InternalPactDSL.g:6267:2: rule__SecondaryObligationType__Group__5__Impl rule__SecondaryObligationType__Group__6
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
    // InternalPactDSL.g:6274:1: rule__SecondaryObligationType__Group__5__Impl : ( 'to' ) ;
    public final void rule__SecondaryObligationType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6278:1: ( ( 'to' ) )
            // InternalPactDSL.g:6279:1: ( 'to' )
            {
            // InternalPactDSL.g:6279:1: ( 'to' )
            // InternalPactDSL.g:6280:2: 'to'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getToKeyword_5()); 
            match(input,37,FOLLOW_2); 
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
    // InternalPactDSL.g:6289:1: rule__SecondaryObligationType__Group__6 : rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7 ;
    public final void rule__SecondaryObligationType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6293:1: ( rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7 )
            // InternalPactDSL.g:6294:2: rule__SecondaryObligationType__Group__6__Impl rule__SecondaryObligationType__Group__7
            {
            pushFollow(FOLLOW_47);
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
    // InternalPactDSL.g:6301:1: rule__SecondaryObligationType__Group__6__Impl : ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__SecondaryObligationType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6305:1: ( ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:6306:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:6306:1: ( ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:6307:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) ) ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:6307:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:6308:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:6309:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )
            // InternalPactDSL.g:6309:4: rule__SecondaryObligationType__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__SecondaryObligationType__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:6312:2: ( ( rule__SecondaryObligationType__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:6313:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:6314:3: ( rule__SecondaryObligationType__SuperTypeAssignment_6 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ID) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalPactDSL.g:6314:4: rule__SecondaryObligationType__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SecondaryObligationType__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalPactDSL.g:6323:1: rule__SecondaryObligationType__Group__7 : rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8 ;
    public final void rule__SecondaryObligationType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6327:1: ( rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8 )
            // InternalPactDSL.g:6328:2: rule__SecondaryObligationType__Group__7__Impl rule__SecondaryObligationType__Group__8
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
    // InternalPactDSL.g:6335:1: rule__SecondaryObligationType__Group__7__Impl : ( 'uponBreachOf' ) ;
    public final void rule__SecondaryObligationType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6339:1: ( ( 'uponBreachOf' ) )
            // InternalPactDSL.g:6340:1: ( 'uponBreachOf' )
            {
            // InternalPactDSL.g:6340:1: ( 'uponBreachOf' )
            // InternalPactDSL.g:6341:2: 'uponBreachOf'
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getUponBreachOfKeyword_7()); 
            match(input,66,FOLLOW_2); 
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
    // InternalPactDSL.g:6350:1: rule__SecondaryObligationType__Group__8 : rule__SecondaryObligationType__Group__8__Impl ;
    public final void rule__SecondaryObligationType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6354:1: ( rule__SecondaryObligationType__Group__8__Impl )
            // InternalPactDSL.g:6355:2: rule__SecondaryObligationType__Group__8__Impl
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
    // InternalPactDSL.g:6361:1: rule__SecondaryObligationType__Group__8__Impl : ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) ) ;
    public final void rule__SecondaryObligationType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6365:1: ( ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) ) )
            // InternalPactDSL.g:6366:1: ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) )
            {
            // InternalPactDSL.g:6366:1: ( ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 ) )
            // InternalPactDSL.g:6367:2: ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getCustomPrimaryObligationAssignment_8()); 
            // InternalPactDSL.g:6368:2: ( rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 )
            // InternalPactDSL.g:6368:3: rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8
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


    // $ANTLR start "rule__LiabilityParty__Group__0"
    // InternalPactDSL.g:6377:1: rule__LiabilityParty__Group__0 : rule__LiabilityParty__Group__0__Impl rule__LiabilityParty__Group__1 ;
    public final void rule__LiabilityParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6381:1: ( rule__LiabilityParty__Group__0__Impl rule__LiabilityParty__Group__1 )
            // InternalPactDSL.g:6382:2: rule__LiabilityParty__Group__0__Impl rule__LiabilityParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__0"


    // $ANTLR start "rule__LiabilityParty__Group__0__Impl"
    // InternalPactDSL.g:6389:1: rule__LiabilityParty__Group__0__Impl : ( 'LiabilityParty:' ) ;
    public final void rule__LiabilityParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6393:1: ( ( 'LiabilityParty:' ) )
            // InternalPactDSL.g:6394:1: ( 'LiabilityParty:' )
            {
            // InternalPactDSL.g:6394:1: ( 'LiabilityParty:' )
            // InternalPactDSL.g:6395:2: 'LiabilityParty:'
            {
             before(grammarAccess.getLiabilityPartyAccess().getLiabilityPartyKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getLiabilityPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__0__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__1"
    // InternalPactDSL.g:6404:1: rule__LiabilityParty__Group__1 : rule__LiabilityParty__Group__1__Impl rule__LiabilityParty__Group__2 ;
    public final void rule__LiabilityParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6408:1: ( rule__LiabilityParty__Group__1__Impl rule__LiabilityParty__Group__2 )
            // InternalPactDSL.g:6409:2: rule__LiabilityParty__Group__1__Impl rule__LiabilityParty__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__LiabilityParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__1"


    // $ANTLR start "rule__LiabilityParty__Group__1__Impl"
    // InternalPactDSL.g:6416:1: rule__LiabilityParty__Group__1__Impl : ( ( rule__LiabilityParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__LiabilityParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6420:1: ( ( ( rule__LiabilityParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6421:1: ( ( rule__LiabilityParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6421:1: ( ( rule__LiabilityParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6422:2: ( rule__LiabilityParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6423:2: ( rule__LiabilityParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6423:3: rule__LiabilityParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__1__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__2"
    // InternalPactDSL.g:6431:1: rule__LiabilityParty__Group__2 : rule__LiabilityParty__Group__2__Impl rule__LiabilityParty__Group__3 ;
    public final void rule__LiabilityParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6435:1: ( rule__LiabilityParty__Group__2__Impl rule__LiabilityParty__Group__3 )
            // InternalPactDSL.g:6436:2: rule__LiabilityParty__Group__2__Impl rule__LiabilityParty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LiabilityParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__2"


    // $ANTLR start "rule__LiabilityParty__Group__2__Impl"
    // InternalPactDSL.g:6443:1: rule__LiabilityParty__Group__2__Impl : ( 'shallNotBeLiable' ) ;
    public final void rule__LiabilityParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6447:1: ( ( 'shallNotBeLiable' ) )
            // InternalPactDSL.g:6448:1: ( 'shallNotBeLiable' )
            {
            // InternalPactDSL.g:6448:1: ( 'shallNotBeLiable' )
            // InternalPactDSL.g:6449:2: 'shallNotBeLiable'
            {
             before(grammarAccess.getLiabilityPartyAccess().getShallNotBeLiableKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getShallNotBeLiableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__2__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__3"
    // InternalPactDSL.g:6458:1: rule__LiabilityParty__Group__3 : rule__LiabilityParty__Group__3__Impl rule__LiabilityParty__Group__4 ;
    public final void rule__LiabilityParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6462:1: ( rule__LiabilityParty__Group__3__Impl rule__LiabilityParty__Group__4 )
            // InternalPactDSL.g:6463:2: rule__LiabilityParty__Group__3__Impl rule__LiabilityParty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__3"


    // $ANTLR start "rule__LiabilityParty__Group__3__Impl"
    // InternalPactDSL.g:6470:1: rule__LiabilityParty__Group__3__Impl : ( 'to' ) ;
    public final void rule__LiabilityParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6474:1: ( ( 'to' ) )
            // InternalPactDSL.g:6475:1: ( 'to' )
            {
            // InternalPactDSL.g:6475:1: ( 'to' )
            // InternalPactDSL.g:6476:2: 'to'
            {
             before(grammarAccess.getLiabilityPartyAccess().getToKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__3__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__4"
    // InternalPactDSL.g:6485:1: rule__LiabilityParty__Group__4 : rule__LiabilityParty__Group__4__Impl rule__LiabilityParty__Group__5 ;
    public final void rule__LiabilityParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6489:1: ( rule__LiabilityParty__Group__4__Impl rule__LiabilityParty__Group__5 )
            // InternalPactDSL.g:6490:2: rule__LiabilityParty__Group__4__Impl rule__LiabilityParty__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__LiabilityParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__4"


    // $ANTLR start "rule__LiabilityParty__Group__4__Impl"
    // InternalPactDSL.g:6497:1: rule__LiabilityParty__Group__4__Impl : ( ( rule__LiabilityParty__SuperTypeAssignment_4 ) ) ;
    public final void rule__LiabilityParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6501:1: ( ( ( rule__LiabilityParty__SuperTypeAssignment_4 ) ) )
            // InternalPactDSL.g:6502:1: ( ( rule__LiabilityParty__SuperTypeAssignment_4 ) )
            {
            // InternalPactDSL.g:6502:1: ( ( rule__LiabilityParty__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:6503:2: ( rule__LiabilityParty__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:6504:2: ( rule__LiabilityParty__SuperTypeAssignment_4 )
            // InternalPactDSL.g:6504:3: rule__LiabilityParty__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityParty__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__4__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__5"
    // InternalPactDSL.g:6512:1: rule__LiabilityParty__Group__5 : rule__LiabilityParty__Group__5__Impl rule__LiabilityParty__Group__6 ;
    public final void rule__LiabilityParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6516:1: ( rule__LiabilityParty__Group__5__Impl rule__LiabilityParty__Group__6 )
            // InternalPactDSL.g:6517:2: rule__LiabilityParty__Group__5__Impl rule__LiabilityParty__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__LiabilityParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__5"


    // $ANTLR start "rule__LiabilityParty__Group__5__Impl"
    // InternalPactDSL.g:6524:1: rule__LiabilityParty__Group__5__Impl : ( 'for' ) ;
    public final void rule__LiabilityParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6528:1: ( ( 'for' ) )
            // InternalPactDSL.g:6529:1: ( 'for' )
            {
            // InternalPactDSL.g:6529:1: ( 'for' )
            // InternalPactDSL.g:6530:2: 'for'
            {
             before(grammarAccess.getLiabilityPartyAccess().getForKeyword_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__5__Impl"


    // $ANTLR start "rule__LiabilityParty__Group__6"
    // InternalPactDSL.g:6539:1: rule__LiabilityParty__Group__6 : rule__LiabilityParty__Group__6__Impl ;
    public final void rule__LiabilityParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6543:1: ( rule__LiabilityParty__Group__6__Impl )
            // InternalPactDSL.g:6544:2: rule__LiabilityParty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityParty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__6"


    // $ANTLR start "rule__LiabilityParty__Group__6__Impl"
    // InternalPactDSL.g:6550:1: rule__LiabilityParty__Group__6__Impl : ( ( rule__LiabilityParty__CustomLossAssignment_6 ) ) ;
    public final void rule__LiabilityParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6554:1: ( ( ( rule__LiabilityParty__CustomLossAssignment_6 ) ) )
            // InternalPactDSL.g:6555:1: ( ( rule__LiabilityParty__CustomLossAssignment_6 ) )
            {
            // InternalPactDSL.g:6555:1: ( ( rule__LiabilityParty__CustomLossAssignment_6 ) )
            // InternalPactDSL.g:6556:2: ( rule__LiabilityParty__CustomLossAssignment_6 )
            {
             before(grammarAccess.getLiabilityPartyAccess().getCustomLossAssignment_6()); 
            // InternalPactDSL.g:6557:2: ( rule__LiabilityParty__CustomLossAssignment_6 )
            // InternalPactDSL.g:6557:3: rule__LiabilityParty__CustomLossAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityParty__CustomLossAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityPartyAccess().getCustomLossAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__Group__6__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__0"
    // InternalPactDSL.g:6566:1: rule__LiabilityThirdParty__Group__0 : rule__LiabilityThirdParty__Group__0__Impl rule__LiabilityThirdParty__Group__1 ;
    public final void rule__LiabilityThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6570:1: ( rule__LiabilityThirdParty__Group__0__Impl rule__LiabilityThirdParty__Group__1 )
            // InternalPactDSL.g:6571:2: rule__LiabilityThirdParty__Group__0__Impl rule__LiabilityThirdParty__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__0"


    // $ANTLR start "rule__LiabilityThirdParty__Group__0__Impl"
    // InternalPactDSL.g:6578:1: rule__LiabilityThirdParty__Group__0__Impl : ( 'LiabilityThirdParty:' ) ;
    public final void rule__LiabilityThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6582:1: ( ( 'LiabilityThirdParty:' ) )
            // InternalPactDSL.g:6583:1: ( 'LiabilityThirdParty:' )
            {
            // InternalPactDSL.g:6583:1: ( 'LiabilityThirdParty:' )
            // InternalPactDSL.g:6584:2: 'LiabilityThirdParty:'
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getLiabilityThirdPartyKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getLiabilityThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__0__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__1"
    // InternalPactDSL.g:6593:1: rule__LiabilityThirdParty__Group__1 : rule__LiabilityThirdParty__Group__1__Impl rule__LiabilityThirdParty__Group__2 ;
    public final void rule__LiabilityThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6597:1: ( rule__LiabilityThirdParty__Group__1__Impl rule__LiabilityThirdParty__Group__2 )
            // InternalPactDSL.g:6598:2: rule__LiabilityThirdParty__Group__1__Impl rule__LiabilityThirdParty__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__LiabilityThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__1"


    // $ANTLR start "rule__LiabilityThirdParty__Group__1__Impl"
    // InternalPactDSL.g:6605:1: rule__LiabilityThirdParty__Group__1__Impl : ( ( rule__LiabilityThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__LiabilityThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6609:1: ( ( ( rule__LiabilityThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:6610:1: ( ( rule__LiabilityThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:6610:1: ( ( rule__LiabilityThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6611:2: ( rule__LiabilityThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6612:2: ( rule__LiabilityThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6612:3: rule__LiabilityThirdParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__1__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__2"
    // InternalPactDSL.g:6620:1: rule__LiabilityThirdParty__Group__2 : rule__LiabilityThirdParty__Group__2__Impl rule__LiabilityThirdParty__Group__3 ;
    public final void rule__LiabilityThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6624:1: ( rule__LiabilityThirdParty__Group__2__Impl rule__LiabilityThirdParty__Group__3 )
            // InternalPactDSL.g:6625:2: rule__LiabilityThirdParty__Group__2__Impl rule__LiabilityThirdParty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__LiabilityThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__2"


    // $ANTLR start "rule__LiabilityThirdParty__Group__2__Impl"
    // InternalPactDSL.g:6632:1: rule__LiabilityThirdParty__Group__2__Impl : ( 'shallNotBeLiable' ) ;
    public final void rule__LiabilityThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6636:1: ( ( 'shallNotBeLiable' ) )
            // InternalPactDSL.g:6637:1: ( 'shallNotBeLiable' )
            {
            // InternalPactDSL.g:6637:1: ( 'shallNotBeLiable' )
            // InternalPactDSL.g:6638:2: 'shallNotBeLiable'
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getShallNotBeLiableKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getShallNotBeLiableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__2__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__3"
    // InternalPactDSL.g:6647:1: rule__LiabilityThirdParty__Group__3 : rule__LiabilityThirdParty__Group__3__Impl rule__LiabilityThirdParty__Group__4 ;
    public final void rule__LiabilityThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6651:1: ( rule__LiabilityThirdParty__Group__3__Impl rule__LiabilityThirdParty__Group__4 )
            // InternalPactDSL.g:6652:2: rule__LiabilityThirdParty__Group__3__Impl rule__LiabilityThirdParty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LiabilityThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__3"


    // $ANTLR start "rule__LiabilityThirdParty__Group__3__Impl"
    // InternalPactDSL.g:6659:1: rule__LiabilityThirdParty__Group__3__Impl : ( 'to' ) ;
    public final void rule__LiabilityThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6663:1: ( ( 'to' ) )
            // InternalPactDSL.g:6664:1: ( 'to' )
            {
            // InternalPactDSL.g:6664:1: ( 'to' )
            // InternalPactDSL.g:6665:2: 'to'
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getToKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__3__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__4"
    // InternalPactDSL.g:6674:1: rule__LiabilityThirdParty__Group__4 : rule__LiabilityThirdParty__Group__4__Impl rule__LiabilityThirdParty__Group__5 ;
    public final void rule__LiabilityThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6678:1: ( rule__LiabilityThirdParty__Group__4__Impl rule__LiabilityThirdParty__Group__5 )
            // InternalPactDSL.g:6679:2: rule__LiabilityThirdParty__Group__4__Impl rule__LiabilityThirdParty__Group__5
            {
            pushFollow(FOLLOW_49);
            rule__LiabilityThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__4"


    // $ANTLR start "rule__LiabilityThirdParty__Group__4__Impl"
    // InternalPactDSL.g:6686:1: rule__LiabilityThirdParty__Group__4__Impl : ( ( rule__LiabilityThirdParty__SuperTypeAssignment_4 ) ) ;
    public final void rule__LiabilityThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6690:1: ( ( ( rule__LiabilityThirdParty__SuperTypeAssignment_4 ) ) )
            // InternalPactDSL.g:6691:1: ( ( rule__LiabilityThirdParty__SuperTypeAssignment_4 ) )
            {
            // InternalPactDSL.g:6691:1: ( ( rule__LiabilityThirdParty__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:6692:2: ( rule__LiabilityThirdParty__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:6693:2: ( rule__LiabilityThirdParty__SuperTypeAssignment_4 )
            // InternalPactDSL.g:6693:3: rule__LiabilityThirdParty__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__4__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__5"
    // InternalPactDSL.g:6701:1: rule__LiabilityThirdParty__Group__5 : rule__LiabilityThirdParty__Group__5__Impl rule__LiabilityThirdParty__Group__6 ;
    public final void rule__LiabilityThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6705:1: ( rule__LiabilityThirdParty__Group__5__Impl rule__LiabilityThirdParty__Group__6 )
            // InternalPactDSL.g:6706:2: rule__LiabilityThirdParty__Group__5__Impl rule__LiabilityThirdParty__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__LiabilityThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__5"


    // $ANTLR start "rule__LiabilityThirdParty__Group__5__Impl"
    // InternalPactDSL.g:6713:1: rule__LiabilityThirdParty__Group__5__Impl : ( 'for' ) ;
    public final void rule__LiabilityThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6717:1: ( ( 'for' ) )
            // InternalPactDSL.g:6718:1: ( 'for' )
            {
            // InternalPactDSL.g:6718:1: ( 'for' )
            // InternalPactDSL.g:6719:2: 'for'
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getForKeyword_5()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__5__Impl"


    // $ANTLR start "rule__LiabilityThirdParty__Group__6"
    // InternalPactDSL.g:6728:1: rule__LiabilityThirdParty__Group__6 : rule__LiabilityThirdParty__Group__6__Impl ;
    public final void rule__LiabilityThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6732:1: ( rule__LiabilityThirdParty__Group__6__Impl )
            // InternalPactDSL.g:6733:2: rule__LiabilityThirdParty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__6"


    // $ANTLR start "rule__LiabilityThirdParty__Group__6__Impl"
    // InternalPactDSL.g:6739:1: rule__LiabilityThirdParty__Group__6__Impl : ( ( rule__LiabilityThirdParty__CustomLossAssignment_6 ) ) ;
    public final void rule__LiabilityThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6743:1: ( ( ( rule__LiabilityThirdParty__CustomLossAssignment_6 ) ) )
            // InternalPactDSL.g:6744:1: ( ( rule__LiabilityThirdParty__CustomLossAssignment_6 ) )
            {
            // InternalPactDSL.g:6744:1: ( ( rule__LiabilityThirdParty__CustomLossAssignment_6 ) )
            // InternalPactDSL.g:6745:2: ( rule__LiabilityThirdParty__CustomLossAssignment_6 )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getCustomLossAssignment_6()); 
            // InternalPactDSL.g:6746:2: ( rule__LiabilityThirdParty__CustomLossAssignment_6 )
            // InternalPactDSL.g:6746:3: rule__LiabilityThirdParty__CustomLossAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LiabilityThirdParty__CustomLossAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getCustomLossAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__Group__6__Impl"


    // $ANTLR start "rule__ForConvenience__Group__0"
    // InternalPactDSL.g:6755:1: rule__ForConvenience__Group__0 : rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 ;
    public final void rule__ForConvenience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6759:1: ( rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 )
            // InternalPactDSL.g:6760:2: rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1
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
    // InternalPactDSL.g:6767:1: rule__ForConvenience__Group__0__Impl : ( 'TerminationForConvenience:' ) ;
    public final void rule__ForConvenience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6771:1: ( ( 'TerminationForConvenience:' ) )
            // InternalPactDSL.g:6772:1: ( 'TerminationForConvenience:' )
            {
            // InternalPactDSL.g:6772:1: ( 'TerminationForConvenience:' )
            // InternalPactDSL.g:6773:2: 'TerminationForConvenience:'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalPactDSL.g:6782:1: rule__ForConvenience__Group__1 : rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 ;
    public final void rule__ForConvenience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6786:1: ( rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 )
            // InternalPactDSL.g:6787:2: rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalPactDSL.g:6794:1: rule__ForConvenience__Group__1__Impl : ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForConvenience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6798:1: ( ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6799:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6799:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6800:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6800:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6801:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6802:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6802:4: rule__ForConvenience__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForConvenience__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6805:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6806:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6807:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalPactDSL.g:6807:4: rule__ForConvenience__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForConvenience__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalPactDSL.g:6816:1: rule__ForConvenience__Group__2 : rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 ;
    public final void rule__ForConvenience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6820:1: ( rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 )
            // InternalPactDSL.g:6821:2: rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalPactDSL.g:6828:1: rule__ForConvenience__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForConvenience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6832:1: ( ( 'may' ) )
            // InternalPactDSL.g:6833:1: ( 'may' )
            {
            // InternalPactDSL.g:6833:1: ( 'may' )
            // InternalPactDSL.g:6834:2: 'may'
            {
             before(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalPactDSL.g:6843:1: rule__ForConvenience__Group__3 : rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 ;
    public final void rule__ForConvenience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6847:1: ( rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 )
            // InternalPactDSL.g:6848:2: rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:6855:1: rule__ForConvenience__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForConvenience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6859:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6860:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6860:1: ( 'terminate' )
            // InternalPactDSL.g:6861:2: 'terminate'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalPactDSL.g:6870:1: rule__ForConvenience__Group__4 : rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 ;
    public final void rule__ForConvenience__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6874:1: ( rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 )
            // InternalPactDSL.g:6875:2: rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5
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
    // InternalPactDSL.g:6882:1: rule__ForConvenience__Group__4__Impl : ( 'by' ) ;
    public final void rule__ForConvenience__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6886:1: ( ( 'by' ) )
            // InternalPactDSL.g:6887:1: ( 'by' )
            {
            // InternalPactDSL.g:6887:1: ( 'by' )
            // InternalPactDSL.g:6888:2: 'by'
            {
             before(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:6897:1: rule__ForConvenience__Group__5 : rule__ForConvenience__Group__5__Impl ;
    public final void rule__ForConvenience__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6901:1: ( rule__ForConvenience__Group__5__Impl )
            // InternalPactDSL.g:6902:2: rule__ForConvenience__Group__5__Impl
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
    // InternalPactDSL.g:6908:1: rule__ForConvenience__Group__5__Impl : ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) ;
    public final void rule__ForConvenience__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6912:1: ( ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) )
            // InternalPactDSL.g:6913:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            {
            // InternalPactDSL.g:6913:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            // InternalPactDSL.g:6914:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 
            // InternalPactDSL.g:6915:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            // InternalPactDSL.g:6915:3: rule__ForConvenience__CustomTerminationAssignment_5
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
    // InternalPactDSL.g:6924:1: rule__OnReasonableNotice__Group__0 : rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 ;
    public final void rule__OnReasonableNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6928:1: ( rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 )
            // InternalPactDSL.g:6929:2: rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1
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
    // InternalPactDSL.g:6936:1: rule__OnReasonableNotice__Group__0__Impl : ( 'TerminationOnReasonableNotice:' ) ;
    public final void rule__OnReasonableNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6940:1: ( ( 'TerminationOnReasonableNotice:' ) )
            // InternalPactDSL.g:6941:1: ( 'TerminationOnReasonableNotice:' )
            {
            // InternalPactDSL.g:6941:1: ( 'TerminationOnReasonableNotice:' )
            // InternalPactDSL.g:6942:2: 'TerminationOnReasonableNotice:'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalPactDSL.g:6951:1: rule__OnReasonableNotice__Group__1 : rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 ;
    public final void rule__OnReasonableNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6955:1: ( rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 )
            // InternalPactDSL.g:6956:2: rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalPactDSL.g:6963:1: rule__OnReasonableNotice__Group__1__Impl : ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnReasonableNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6967:1: ( ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6968:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6968:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6969:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6969:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6970:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6971:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6971:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnReasonableNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6974:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6975:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6976:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==RULE_ID) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalPactDSL.g:6976:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnReasonableNotice__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalPactDSL.g:6985:1: rule__OnReasonableNotice__Group__2 : rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 ;
    public final void rule__OnReasonableNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6989:1: ( rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 )
            // InternalPactDSL.g:6990:2: rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalPactDSL.g:6997:1: rule__OnReasonableNotice__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnReasonableNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7001:1: ( ( 'may' ) )
            // InternalPactDSL.g:7002:1: ( 'may' )
            {
            // InternalPactDSL.g:7002:1: ( 'may' )
            // InternalPactDSL.g:7003:2: 'may'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalPactDSL.g:7012:1: rule__OnReasonableNotice__Group__3 : rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 ;
    public final void rule__OnReasonableNotice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7016:1: ( rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 )
            // InternalPactDSL.g:7017:2: rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:7024:1: rule__OnReasonableNotice__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnReasonableNotice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7028:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7029:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7029:1: ( 'terminate' )
            // InternalPactDSL.g:7030:2: 'terminate'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalPactDSL.g:7039:1: rule__OnReasonableNotice__Group__4 : rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 ;
    public final void rule__OnReasonableNotice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7043:1: ( rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 )
            // InternalPactDSL.g:7044:2: rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5
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
    // InternalPactDSL.g:7051:1: rule__OnReasonableNotice__Group__4__Impl : ( 'by' ) ;
    public final void rule__OnReasonableNotice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7055:1: ( ( 'by' ) )
            // InternalPactDSL.g:7056:1: ( 'by' )
            {
            // InternalPactDSL.g:7056:1: ( 'by' )
            // InternalPactDSL.g:7057:2: 'by'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:7066:1: rule__OnReasonableNotice__Group__5 : rule__OnReasonableNotice__Group__5__Impl ;
    public final void rule__OnReasonableNotice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7070:1: ( rule__OnReasonableNotice__Group__5__Impl )
            // InternalPactDSL.g:7071:2: rule__OnReasonableNotice__Group__5__Impl
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
    // InternalPactDSL.g:7077:1: rule__OnReasonableNotice__Group__5__Impl : ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) ;
    public final void rule__OnReasonableNotice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7081:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) )
            // InternalPactDSL.g:7082:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            {
            // InternalPactDSL.g:7082:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            // InternalPactDSL.g:7083:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 
            // InternalPactDSL.g:7084:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            // InternalPactDSL.g:7084:3: rule__OnReasonableNotice__SuperTypeAssignment_5
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
    // InternalPactDSL.g:7093:1: rule__ForBreach__Group__0 : rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 ;
    public final void rule__ForBreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7097:1: ( rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 )
            // InternalPactDSL.g:7098:2: rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1
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
    // InternalPactDSL.g:7105:1: rule__ForBreach__Group__0__Impl : ( 'TerminationForBreach:' ) ;
    public final void rule__ForBreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7109:1: ( ( 'TerminationForBreach:' ) )
            // InternalPactDSL.g:7110:1: ( 'TerminationForBreach:' )
            {
            // InternalPactDSL.g:7110:1: ( 'TerminationForBreach:' )
            // InternalPactDSL.g:7111:2: 'TerminationForBreach:'
            {
             before(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalPactDSL.g:7120:1: rule__ForBreach__Group__1 : rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 ;
    public final void rule__ForBreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7124:1: ( rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 )
            // InternalPactDSL.g:7125:2: rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalPactDSL.g:7132:1: rule__ForBreach__Group__1__Impl : ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForBreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7136:1: ( ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7137:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7137:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7138:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7138:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7139:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7140:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7140:4: rule__ForBreach__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForBreach__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7143:2: ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7144:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7145:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalPactDSL.g:7145:4: rule__ForBreach__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForBreach__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalPactDSL.g:7154:1: rule__ForBreach__Group__2 : rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 ;
    public final void rule__ForBreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7158:1: ( rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 )
            // InternalPactDSL.g:7159:2: rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalPactDSL.g:7166:1: rule__ForBreach__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForBreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7170:1: ( ( 'may' ) )
            // InternalPactDSL.g:7171:1: ( 'may' )
            {
            // InternalPactDSL.g:7171:1: ( 'may' )
            // InternalPactDSL.g:7172:2: 'may'
            {
             before(grammarAccess.getForBreachAccess().getMayKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalPactDSL.g:7181:1: rule__ForBreach__Group__3 : rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 ;
    public final void rule__ForBreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7185:1: ( rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 )
            // InternalPactDSL.g:7186:2: rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalPactDSL.g:7193:1: rule__ForBreach__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForBreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7197:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7198:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7198:1: ( 'terminate' )
            // InternalPactDSL.g:7199:2: 'terminate'
            {
             before(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalPactDSL.g:7208:1: rule__ForBreach__Group__4 : rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 ;
    public final void rule__ForBreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7212:1: ( rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 )
            // InternalPactDSL.g:7213:2: rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5
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
    // InternalPactDSL.g:7220:1: rule__ForBreach__Group__4__Impl : ( 'forBreachOf' ) ;
    public final void rule__ForBreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7224:1: ( ( 'forBreachOf' ) )
            // InternalPactDSL.g:7225:1: ( 'forBreachOf' )
            {
            // InternalPactDSL.g:7225:1: ( 'forBreachOf' )
            // InternalPactDSL.g:7226:2: 'forBreachOf'
            {
             before(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 
            match(input,76,FOLLOW_2); 
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
    // InternalPactDSL.g:7235:1: rule__ForBreach__Group__5 : rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 ;
    public final void rule__ForBreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7239:1: ( rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 )
            // InternalPactDSL.g:7240:2: rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:7247:1: rule__ForBreach__Group__5__Impl : ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) ;
    public final void rule__ForBreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7251:1: ( ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) )
            // InternalPactDSL.g:7252:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            {
            // InternalPactDSL.g:7252:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            // InternalPactDSL.g:7253:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            {
            // InternalPactDSL.g:7253:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) )
            // InternalPactDSL.g:7254:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:7255:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            // InternalPactDSL.g:7255:4: rule__ForBreach__ObligationBreachedAssignment_5
            {
            pushFollow(FOLLOW_53);
            rule__ForBreach__ObligationBreachedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }

            // InternalPactDSL.g:7258:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            // InternalPactDSL.g:7259:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:7260:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_STRING) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPactDSL.g:7260:4: rule__ForBreach__ObligationBreachedAssignment_5
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__ForBreach__ObligationBreachedAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // InternalPactDSL.g:7269:1: rule__ForBreach__Group__6 : rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 ;
    public final void rule__ForBreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7273:1: ( rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 )
            // InternalPactDSL.g:7274:2: rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7
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
    // InternalPactDSL.g:7281:1: rule__ForBreach__Group__6__Impl : ( 'by' ) ;
    public final void rule__ForBreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7285:1: ( ( 'by' ) )
            // InternalPactDSL.g:7286:1: ( 'by' )
            {
            // InternalPactDSL.g:7286:1: ( 'by' )
            // InternalPactDSL.g:7287:2: 'by'
            {
             before(grammarAccess.getForBreachAccess().getByKeyword_6()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:7296:1: rule__ForBreach__Group__7 : rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 ;
    public final void rule__ForBreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7300:1: ( rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 )
            // InternalPactDSL.g:7301:2: rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8
            {
            pushFollow(FOLLOW_54);
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
    // InternalPactDSL.g:7308:1: rule__ForBreach__Group__7__Impl : ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) ;
    public final void rule__ForBreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7312:1: ( ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:7313:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:7313:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:7314:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:7315:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            // InternalPactDSL.g:7315:3: rule__ForBreach__SuperTypeAssignment_7
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
    // InternalPactDSL.g:7323:1: rule__ForBreach__Group__8 : rule__ForBreach__Group__8__Impl ;
    public final void rule__ForBreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7327:1: ( rule__ForBreach__Group__8__Impl )
            // InternalPactDSL.g:7328:2: rule__ForBreach__Group__8__Impl
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
    // InternalPactDSL.g:7334:1: rule__ForBreach__Group__8__Impl : ( ( rule__ForBreach__Group_8__0 )? ) ;
    public final void rule__ForBreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7338:1: ( ( ( rule__ForBreach__Group_8__0 )? ) )
            // InternalPactDSL.g:7339:1: ( ( rule__ForBreach__Group_8__0 )? )
            {
            // InternalPactDSL.g:7339:1: ( ( rule__ForBreach__Group_8__0 )? )
            // InternalPactDSL.g:7340:2: ( rule__ForBreach__Group_8__0 )?
            {
             before(grammarAccess.getForBreachAccess().getGroup_8()); 
            // InternalPactDSL.g:7341:2: ( rule__ForBreach__Group_8__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==62) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPactDSL.g:7341:3: rule__ForBreach__Group_8__0
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
    // InternalPactDSL.g:7350:1: rule__ForBreach__Group_8__0 : rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 ;
    public final void rule__ForBreach__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7354:1: ( rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 )
            // InternalPactDSL.g:7355:2: rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1
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
    // InternalPactDSL.g:7362:1: rule__ForBreach__Group_8__0__Impl : ( 'unless' ) ;
    public final void rule__ForBreach__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7366:1: ( ( 'unless' ) )
            // InternalPactDSL.g:7367:1: ( 'unless' )
            {
            // InternalPactDSL.g:7367:1: ( 'unless' )
            // InternalPactDSL.g:7368:2: 'unless'
            {
             before(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalPactDSL.g:7377:1: rule__ForBreach__Group_8__1 : rule__ForBreach__Group_8__1__Impl ;
    public final void rule__ForBreach__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7381:1: ( rule__ForBreach__Group_8__1__Impl )
            // InternalPactDSL.g:7382:2: rule__ForBreach__Group_8__1__Impl
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
    // InternalPactDSL.g:7388:1: rule__ForBreach__Group_8__1__Impl : ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) ;
    public final void rule__ForBreach__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7392:1: ( ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) )
            // InternalPactDSL.g:7393:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            {
            // InternalPactDSL.g:7393:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            // InternalPactDSL.g:7394:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 
            // InternalPactDSL.g:7395:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            // InternalPactDSL.g:7395:3: rule__ForBreach__RemedialSchemeAssignment_8_1
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
    // InternalPactDSL.g:7404:1: rule__OnInsolvencyEvent__Group__0 : rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 ;
    public final void rule__OnInsolvencyEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7408:1: ( rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 )
            // InternalPactDSL.g:7409:2: rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1
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
    // InternalPactDSL.g:7416:1: rule__OnInsolvencyEvent__Group__0__Impl : ( 'TerminationUponInsolvency:' ) ;
    public final void rule__OnInsolvencyEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7420:1: ( ( 'TerminationUponInsolvency:' ) )
            // InternalPactDSL.g:7421:1: ( 'TerminationUponInsolvency:' )
            {
            // InternalPactDSL.g:7421:1: ( 'TerminationUponInsolvency:' )
            // InternalPactDSL.g:7422:2: 'TerminationUponInsolvency:'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalPactDSL.g:7431:1: rule__OnInsolvencyEvent__Group__1 : rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 ;
    public final void rule__OnInsolvencyEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7435:1: ( rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 )
            // InternalPactDSL.g:7436:2: rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalPactDSL.g:7443:1: rule__OnInsolvencyEvent__Group__1__Impl : ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnInsolvencyEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7447:1: ( ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7448:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7448:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7449:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7449:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7450:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7451:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7451:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7454:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7455:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7456:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPactDSL.g:7456:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // InternalPactDSL.g:7465:1: rule__OnInsolvencyEvent__Group__2 : rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 ;
    public final void rule__OnInsolvencyEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7469:1: ( rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 )
            // InternalPactDSL.g:7470:2: rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalPactDSL.g:7477:1: rule__OnInsolvencyEvent__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnInsolvencyEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7481:1: ( ( 'may' ) )
            // InternalPactDSL.g:7482:1: ( 'may' )
            {
            // InternalPactDSL.g:7482:1: ( 'may' )
            // InternalPactDSL.g:7483:2: 'may'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalPactDSL.g:7492:1: rule__OnInsolvencyEvent__Group__3 : rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 ;
    public final void rule__OnInsolvencyEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7496:1: ( rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 )
            // InternalPactDSL.g:7497:2: rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4
            {
            pushFollow(FOLLOW_55);
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
    // InternalPactDSL.g:7504:1: rule__OnInsolvencyEvent__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnInsolvencyEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7508:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7509:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7509:1: ( 'terminate' )
            // InternalPactDSL.g:7510:2: 'terminate'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalPactDSL.g:7519:1: rule__OnInsolvencyEvent__Group__4 : rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 ;
    public final void rule__OnInsolvencyEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7523:1: ( rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 )
            // InternalPactDSL.g:7524:2: rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5
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
    // InternalPactDSL.g:7531:1: rule__OnInsolvencyEvent__Group__4__Impl : ( 'upon' ) ;
    public final void rule__OnInsolvencyEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7535:1: ( ( 'upon' ) )
            // InternalPactDSL.g:7536:1: ( 'upon' )
            {
            // InternalPactDSL.g:7536:1: ( 'upon' )
            // InternalPactDSL.g:7537:2: 'upon'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 
            match(input,78,FOLLOW_2); 
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
    // InternalPactDSL.g:7546:1: rule__OnInsolvencyEvent__Group__5 : rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 ;
    public final void rule__OnInsolvencyEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7550:1: ( rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 )
            // InternalPactDSL.g:7551:2: rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6
            {
            pushFollow(FOLLOW_46);
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
    // InternalPactDSL.g:7558:1: rule__OnInsolvencyEvent__Group__5__Impl : ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7562:1: ( ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) )
            // InternalPactDSL.g:7563:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            {
            // InternalPactDSL.g:7563:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            // InternalPactDSL.g:7564:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 
            // InternalPactDSL.g:7565:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            // InternalPactDSL.g:7565:3: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5
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
    // InternalPactDSL.g:7573:1: rule__OnInsolvencyEvent__Group__6 : rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 ;
    public final void rule__OnInsolvencyEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7577:1: ( rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 )
            // InternalPactDSL.g:7578:2: rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7
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
    // InternalPactDSL.g:7585:1: rule__OnInsolvencyEvent__Group__6__Impl : ( 'of' ) ;
    public final void rule__OnInsolvencyEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7589:1: ( ( 'of' ) )
            // InternalPactDSL.g:7590:1: ( 'of' )
            {
            // InternalPactDSL.g:7590:1: ( 'of' )
            // InternalPactDSL.g:7591:2: 'of'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 
            match(input,64,FOLLOW_2); 
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
    // InternalPactDSL.g:7600:1: rule__OnInsolvencyEvent__Group__7 : rule__OnInsolvencyEvent__Group__7__Impl ;
    public final void rule__OnInsolvencyEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7604:1: ( rule__OnInsolvencyEvent__Group__7__Impl )
            // InternalPactDSL.g:7605:2: rule__OnInsolvencyEvent__Group__7__Impl
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
    // InternalPactDSL.g:7611:1: rule__OnInsolvencyEvent__Group__7__Impl : ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7615:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:7616:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:7616:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:7617:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:7618:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            // InternalPactDSL.g:7618:3: rule__OnInsolvencyEvent__SuperTypeAssignment_7
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
    // InternalPactDSL.g:7627:1: rule__CustomTermination__Group__0 : rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 ;
    public final void rule__CustomTermination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7631:1: ( rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 )
            // InternalPactDSL.g:7632:2: rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1
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
    // InternalPactDSL.g:7639:1: rule__CustomTermination__Group__0__Impl : ( 'Termination:' ) ;
    public final void rule__CustomTermination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7643:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:7644:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:7644:1: ( 'Termination:' )
            // InternalPactDSL.g:7645:2: 'Termination:'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPactDSL.g:7654:1: rule__CustomTermination__Group__1 : rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 ;
    public final void rule__CustomTermination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7658:1: ( rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 )
            // InternalPactDSL.g:7659:2: rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalPactDSL.g:7666:1: rule__CustomTermination__Group__1__Impl : ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__CustomTermination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7670:1: ( ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:7671:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:7671:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:7672:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:7672:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:7673:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7674:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            // InternalPactDSL.g:7674:4: rule__CustomTermination__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__CustomTermination__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:7677:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:7678:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:7679:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalPactDSL.g:7679:4: rule__CustomTermination__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CustomTermination__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalPactDSL.g:7688:1: rule__CustomTermination__Group__2 : rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 ;
    public final void rule__CustomTermination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7692:1: ( rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 )
            // InternalPactDSL.g:7693:2: rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3
            {
            pushFollow(FOLLOW_51);
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
    // InternalPactDSL.g:7700:1: rule__CustomTermination__Group__2__Impl : ( 'may' ) ;
    public final void rule__CustomTermination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7704:1: ( ( 'may' ) )
            // InternalPactDSL.g:7705:1: ( 'may' )
            {
            // InternalPactDSL.g:7705:1: ( 'may' )
            // InternalPactDSL.g:7706:2: 'may'
            {
             before(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 
            match(input,72,FOLLOW_2); 
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
    // InternalPactDSL.g:7715:1: rule__CustomTermination__Group__3 : rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 ;
    public final void rule__CustomTermination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7719:1: ( rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 )
            // InternalPactDSL.g:7720:2: rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4
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
    // InternalPactDSL.g:7727:1: rule__CustomTermination__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__CustomTermination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7731:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7732:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7732:1: ( 'terminate' )
            // InternalPactDSL.g:7733:2: 'terminate'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 
            match(input,73,FOLLOW_2); 
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
    // InternalPactDSL.g:7742:1: rule__CustomTermination__Group__4 : rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 ;
    public final void rule__CustomTermination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7746:1: ( rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 )
            // InternalPactDSL.g:7747:2: rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalPactDSL.g:7754:1: rule__CustomTermination__Group__4__Impl : ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) ;
    public final void rule__CustomTermination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7758:1: ( ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) )
            // InternalPactDSL.g:7759:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            {
            // InternalPactDSL.g:7759:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            // InternalPactDSL.g:7760:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 
            // InternalPactDSL.g:7761:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            // InternalPactDSL.g:7761:3: rule__CustomTermination__CustomTerminationClauseAssignment_4
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
    // InternalPactDSL.g:7769:1: rule__CustomTermination__Group__5 : rule__CustomTermination__Group__5__Impl ;
    public final void rule__CustomTermination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7773:1: ( rule__CustomTermination__Group__5__Impl )
            // InternalPactDSL.g:7774:2: rule__CustomTermination__Group__5__Impl
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
    // InternalPactDSL.g:7780:1: rule__CustomTermination__Group__5__Impl : ( ( rule__CustomTermination__Group_5__0 )? ) ;
    public final void rule__CustomTermination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7784:1: ( ( ( rule__CustomTermination__Group_5__0 )? ) )
            // InternalPactDSL.g:7785:1: ( ( rule__CustomTermination__Group_5__0 )? )
            {
            // InternalPactDSL.g:7785:1: ( ( rule__CustomTermination__Group_5__0 )? )
            // InternalPactDSL.g:7786:2: ( rule__CustomTermination__Group_5__0 )?
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup_5()); 
            // InternalPactDSL.g:7787:2: ( rule__CustomTermination__Group_5__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==49) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPactDSL.g:7787:3: rule__CustomTermination__Group_5__0
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
    // InternalPactDSL.g:7796:1: rule__CustomTermination__Group_5__0 : rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 ;
    public final void rule__CustomTermination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7800:1: ( rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 )
            // InternalPactDSL.g:7801:2: rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1
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
    // InternalPactDSL.g:7808:1: rule__CustomTermination__Group_5__0__Impl : ( 'by' ) ;
    public final void rule__CustomTermination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7812:1: ( ( 'by' ) )
            // InternalPactDSL.g:7813:1: ( 'by' )
            {
            // InternalPactDSL.g:7813:1: ( 'by' )
            // InternalPactDSL.g:7814:2: 'by'
            {
             before(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalPactDSL.g:7823:1: rule__CustomTermination__Group_5__1 : rule__CustomTermination__Group_5__1__Impl ;
    public final void rule__CustomTermination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7827:1: ( rule__CustomTermination__Group_5__1__Impl )
            // InternalPactDSL.g:7828:2: rule__CustomTermination__Group_5__1__Impl
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
    // InternalPactDSL.g:7834:1: rule__CustomTermination__Group_5__1__Impl : ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__CustomTermination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7838:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:7839:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:7839:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:7840:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:7841:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:7841:3: rule__CustomTermination__SuperTypeAssignment_5_1
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
    // InternalPactDSL.g:7850:1: rule__ApplicableLaw__Group__0 : rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 ;
    public final void rule__ApplicableLaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7854:1: ( rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 )
            // InternalPactDSL.g:7855:2: rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1
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
    // InternalPactDSL.g:7862:1: rule__ApplicableLaw__Group__0__Impl : ( 'ApplicableLaw:' ) ;
    public final void rule__ApplicableLaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7866:1: ( ( 'ApplicableLaw:' ) )
            // InternalPactDSL.g:7867:1: ( 'ApplicableLaw:' )
            {
            // InternalPactDSL.g:7867:1: ( 'ApplicableLaw:' )
            // InternalPactDSL.g:7868:2: 'ApplicableLaw:'
            {
             before(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 
            match(input,79,FOLLOW_2); 
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
    // InternalPactDSL.g:7877:1: rule__ApplicableLaw__Group__1 : rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 ;
    public final void rule__ApplicableLaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7881:1: ( rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 )
            // InternalPactDSL.g:7882:2: rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalPactDSL.g:7889:1: rule__ApplicableLaw__Group__1__Impl : ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) ;
    public final void rule__ApplicableLaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7893:1: ( ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) )
            // InternalPactDSL.g:7894:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            {
            // InternalPactDSL.g:7894:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            // InternalPactDSL.g:7895:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 
            // InternalPactDSL.g:7896:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            // InternalPactDSL.g:7896:3: rule__ApplicableLaw__CustomApplicableLawAssignment_1
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
    // InternalPactDSL.g:7904:1: rule__ApplicableLaw__Group__2 : rule__ApplicableLaw__Group__2__Impl ;
    public final void rule__ApplicableLaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7908:1: ( rule__ApplicableLaw__Group__2__Impl )
            // InternalPactDSL.g:7909:2: rule__ApplicableLaw__Group__2__Impl
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
    // InternalPactDSL.g:7915:1: rule__ApplicableLaw__Group__2__Impl : ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) ;
    public final void rule__ApplicableLaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7919:1: ( ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:7920:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:7920:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:7921:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:7922:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPactDSL.g:7922:3: rule__ApplicableLaw__DefinitionAssignment_2
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
    // InternalPactDSL.g:7931:1: rule__Jurisdiction__Group__0 : rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 ;
    public final void rule__Jurisdiction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7935:1: ( rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 )
            // InternalPactDSL.g:7936:2: rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1
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
    // InternalPactDSL.g:7943:1: rule__Jurisdiction__Group__0__Impl : ( 'Jurisdiction:' ) ;
    public final void rule__Jurisdiction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7947:1: ( ( 'Jurisdiction:' ) )
            // InternalPactDSL.g:7948:1: ( 'Jurisdiction:' )
            {
            // InternalPactDSL.g:7948:1: ( 'Jurisdiction:' )
            // InternalPactDSL.g:7949:2: 'Jurisdiction:'
            {
             before(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 
            match(input,80,FOLLOW_2); 
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
    // InternalPactDSL.g:7958:1: rule__Jurisdiction__Group__1 : rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 ;
    public final void rule__Jurisdiction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7962:1: ( rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 )
            // InternalPactDSL.g:7963:2: rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalPactDSL.g:7970:1: rule__Jurisdiction__Group__1__Impl : ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) ;
    public final void rule__Jurisdiction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7974:1: ( ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) )
            // InternalPactDSL.g:7975:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            {
            // InternalPactDSL.g:7975:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            // InternalPactDSL.g:7976:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 
            // InternalPactDSL.g:7977:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            // InternalPactDSL.g:7977:3: rule__Jurisdiction__CustomJurisdictionAssignment_1
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
    // InternalPactDSL.g:7985:1: rule__Jurisdiction__Group__2 : rule__Jurisdiction__Group__2__Impl ;
    public final void rule__Jurisdiction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7989:1: ( rule__Jurisdiction__Group__2__Impl )
            // InternalPactDSL.g:7990:2: rule__Jurisdiction__Group__2__Impl
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
    // InternalPactDSL.g:7996:1: rule__Jurisdiction__Group__2__Impl : ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) ;
    public final void rule__Jurisdiction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8000:1: ( ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:8001:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:8001:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:8002:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:8003:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==31) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPactDSL.g:8003:3: rule__Jurisdiction__DefinitionAssignment_2
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
    // InternalPactDSL.g:8012:1: rule__Notices__Group__0 : rule__Notices__Group__0__Impl rule__Notices__Group__1 ;
    public final void rule__Notices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8016:1: ( rule__Notices__Group__0__Impl rule__Notices__Group__1 )
            // InternalPactDSL.g:8017:2: rule__Notices__Group__0__Impl rule__Notices__Group__1
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
    // InternalPactDSL.g:8024:1: rule__Notices__Group__0__Impl : ( 'Notices:' ) ;
    public final void rule__Notices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8028:1: ( ( 'Notices:' ) )
            // InternalPactDSL.g:8029:1: ( 'Notices:' )
            {
            // InternalPactDSL.g:8029:1: ( 'Notices:' )
            // InternalPactDSL.g:8030:2: 'Notices:'
            {
             before(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalPactDSL.g:8039:1: rule__Notices__Group__1 : rule__Notices__Group__1__Impl ;
    public final void rule__Notices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8043:1: ( rule__Notices__Group__1__Impl )
            // InternalPactDSL.g:8044:2: rule__Notices__Group__1__Impl
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
    // InternalPactDSL.g:8050:1: rule__Notices__Group__1__Impl : ( ( rule__Notices__CustomNoticeAssignment_1 ) ) ;
    public final void rule__Notices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8054:1: ( ( ( rule__Notices__CustomNoticeAssignment_1 ) ) )
            // InternalPactDSL.g:8055:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            {
            // InternalPactDSL.g:8055:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            // InternalPactDSL.g:8056:2: ( rule__Notices__CustomNoticeAssignment_1 )
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 
            // InternalPactDSL.g:8057:2: ( rule__Notices__CustomNoticeAssignment_1 )
            // InternalPactDSL.g:8057:3: rule__Notices__CustomNoticeAssignment_1
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


    // $ANTLR start "rule__Model__TitleAssignment_1"
    // InternalPactDSL.g:8066:1: rule__Model__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8070:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8071:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8071:2: ( RULE_STRING )
            // InternalPactDSL.g:8072:3: RULE_STRING
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
    // InternalPactDSL.g:8081:1: rule__Model__EntityTypesAssignment_4_0 : ( ruleEntityType ) ;
    public final void rule__Model__EntityTypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8085:1: ( ( ruleEntityType ) )
            // InternalPactDSL.g:8086:2: ( ruleEntityType )
            {
            // InternalPactDSL.g:8086:2: ( ruleEntityType )
            // InternalPactDSL.g:8087:3: ruleEntityType
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
    // InternalPactDSL.g:8096:1: rule__Model__FormalityTypesAssignment_6_0 : ( ruleFormalityType ) ;
    public final void rule__Model__FormalityTypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8100:1: ( ( ruleFormalityType ) )
            // InternalPactDSL.g:8101:2: ( ruleFormalityType )
            {
            // InternalPactDSL.g:8101:2: ( ruleFormalityType )
            // InternalPactDSL.g:8102:3: ruleFormalityType
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
    // InternalPactDSL.g:8111:1: rule__Model__ActionTypesAssignment_8_0 : ( ruleActionType ) ;
    public final void rule__Model__ActionTypesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8115:1: ( ( ruleActionType ) )
            // InternalPactDSL.g:8116:2: ( ruleActionType )
            {
            // InternalPactDSL.g:8116:2: ( ruleActionType )
            // InternalPactDSL.g:8117:3: ruleActionType
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
    // InternalPactDSL.g:8126:1: rule__Model__StateTypesAssignment_10_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8130:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:8131:2: ( ruleStateType )
            {
            // InternalPactDSL.g:8131:2: ( ruleStateType )
            // InternalPactDSL.g:8132:3: ruleStateType
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
    // InternalPactDSL.g:8141:1: rule__Model__PrimaryObligationTypesAssignment_12_0 : ( rulePrimaryObligationType ) ;
    public final void rule__Model__PrimaryObligationTypesAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8145:1: ( ( rulePrimaryObligationType ) )
            // InternalPactDSL.g:8146:2: ( rulePrimaryObligationType )
            {
            // InternalPactDSL.g:8146:2: ( rulePrimaryObligationType )
            // InternalPactDSL.g:8147:3: rulePrimaryObligationType
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
    // InternalPactDSL.g:8156:1: rule__Model__SecondaryObligationTypesAssignment_14_0 : ( ruleSecondaryObligationType ) ;
    public final void rule__Model__SecondaryObligationTypesAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8160:1: ( ( ruleSecondaryObligationType ) )
            // InternalPactDSL.g:8161:2: ( ruleSecondaryObligationType )
            {
            // InternalPactDSL.g:8161:2: ( ruleSecondaryObligationType )
            // InternalPactDSL.g:8162:3: ruleSecondaryObligationType
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
    // InternalPactDSL.g:8171:1: rule__Model__LiabilityTypesAssignment_16_0 : ( ruleLiabilityType ) ;
    public final void rule__Model__LiabilityTypesAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8175:1: ( ( ruleLiabilityType ) )
            // InternalPactDSL.g:8176:2: ( ruleLiabilityType )
            {
            // InternalPactDSL.g:8176:2: ( ruleLiabilityType )
            // InternalPactDSL.g:8177:3: ruleLiabilityType
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
    // InternalPactDSL.g:8186:1: rule__Model__TerminationTypesAssignment_18_0 : ( ruleTerminationType ) ;
    public final void rule__Model__TerminationTypesAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8190:1: ( ( ruleTerminationType ) )
            // InternalPactDSL.g:8191:2: ( ruleTerminationType )
            {
            // InternalPactDSL.g:8191:2: ( ruleTerminationType )
            // InternalPactDSL.g:8192:3: ruleTerminationType
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
    // InternalPactDSL.g:8201:1: rule__Model__StateTypesAssignment_20_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8205:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:8206:2: ( ruleStateType )
            {
            // InternalPactDSL.g:8206:2: ( ruleStateType )
            // InternalPactDSL.g:8207:3: ruleStateType
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
    // InternalPactDSL.g:8216:1: rule__Model__BoilerplateTypesAssignment_22_0 : ( ruleBoilerplateType ) ;
    public final void rule__Model__BoilerplateTypesAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8220:1: ( ( ruleBoilerplateType ) )
            // InternalPactDSL.g:8221:2: ( ruleBoilerplateType )
            {
            // InternalPactDSL.g:8221:2: ( ruleBoilerplateType )
            // InternalPactDSL.g:8222:3: ruleBoilerplateType
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
    // InternalPactDSL.g:8231:1: rule__EffectiveDate__DayAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__DayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8235:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8236:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8236:2: ( RULE_INT )
            // InternalPactDSL.g:8237:3: RULE_INT
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
    // InternalPactDSL.g:8246:1: rule__EffectiveDate__MonthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__MonthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8250:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8251:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8251:2: ( RULE_INT )
            // InternalPactDSL.g:8252:3: RULE_INT
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
    // InternalPactDSL.g:8261:1: rule__EffectiveDate__YearAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__YearAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8265:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8266:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8266:2: ( RULE_INT )
            // InternalPactDSL.g:8267:3: RULE_INT
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
    // InternalPactDSL.g:8276:1: rule__Party__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Party__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8280:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:8281:2: ( RULE_ID )
            {
            // InternalPactDSL.g:8281:2: ( RULE_ID )
            // InternalPactDSL.g:8282:3: RULE_ID
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
    // InternalPactDSL.g:8291:1: rule__Party__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Party__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8295:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8296:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8296:2: ( RULE_STRING )
            // InternalPactDSL.g:8297:3: RULE_STRING
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
    // InternalPactDSL.g:8306:1: rule__Party__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__Party__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8310:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:8311:2: ( ruleFeature )
            {
            // InternalPactDSL.g:8311:2: ( ruleFeature )
            // InternalPactDSL.g:8312:3: ruleFeature
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
    // InternalPactDSL.g:8321:1: rule__ThirdParty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ThirdParty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8325:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:8326:2: ( RULE_ID )
            {
            // InternalPactDSL.g:8326:2: ( RULE_ID )
            // InternalPactDSL.g:8327:3: RULE_ID
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
    // InternalPactDSL.g:8336:1: rule__ThirdParty__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ThirdParty__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8340:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8341:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8341:2: ( RULE_STRING )
            // InternalPactDSL.g:8342:3: RULE_STRING
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
    // InternalPactDSL.g:8351:1: rule__ThirdParty__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__ThirdParty__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8355:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:8356:2: ( ruleFeature )
            {
            // InternalPactDSL.g:8356:2: ( ruleFeature )
            // InternalPactDSL.g:8357:3: ruleFeature
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
    // InternalPactDSL.g:8366:1: rule__SubjectMatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubjectMatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8370:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:8371:2: ( RULE_ID )
            {
            // InternalPactDSL.g:8371:2: ( RULE_ID )
            // InternalPactDSL.g:8372:3: RULE_ID
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
    // InternalPactDSL.g:8381:1: rule__SubjectMatter__SubjectMatterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubjectMatter__SubjectMatterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8385:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8386:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8386:2: ( RULE_STRING )
            // InternalPactDSL.g:8387:3: RULE_STRING
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
    // InternalPactDSL.g:8396:1: rule__SubjectMatter__FeatureAssignment_3 : ( ruleFeature ) ;
    public final void rule__SubjectMatter__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8400:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:8401:2: ( ruleFeature )
            {
            // InternalPactDSL.g:8401:2: ( ruleFeature )
            // InternalPactDSL.g:8402:3: ruleFeature
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
    // InternalPactDSL.g:8411:1: rule__Feature__FeaturetypeAssignment : ( ruleFeatureType ) ;
    public final void rule__Feature__FeaturetypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8415:1: ( ( ruleFeatureType ) )
            // InternalPactDSL.g:8416:2: ( ruleFeatureType )
            {
            // InternalPactDSL.g:8416:2: ( ruleFeatureType )
            // InternalPactDSL.g:8417:3: ruleFeatureType
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
    // InternalPactDSL.g:8426:1: rule__DefinedTerm__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DefinedTerm__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8430:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8431:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8431:2: ( RULE_STRING )
            // InternalPactDSL.g:8432:3: RULE_STRING
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
    // InternalPactDSL.g:8441:1: rule__Address__AddressAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Address__AddressAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8445:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8446:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8446:2: ( RULE_STRING )
            // InternalPactDSL.g:8447:3: RULE_STRING
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
    // InternalPactDSL.g:8456:1: rule__CompanyNumber__CompanyNumberAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CompanyNumber__CompanyNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8460:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8461:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8461:2: ( RULE_STRING )
            // InternalPactDSL.g:8462:3: RULE_STRING
            {
             before(grammarAccess.getCompanyNumberAccess().getCompanyNumberSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getCompanyNumberSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalPactDSL.g:8471:1: rule__CustomFeature__CustomFeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFeature__CustomFeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8475:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8476:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8476:2: ( RULE_STRING )
            // InternalPactDSL.g:8477:3: RULE_STRING
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
    // InternalPactDSL.g:8486:1: rule__InWriting__CustomWritingFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InWriting__CustomWritingFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8490:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8491:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8491:2: ( RULE_STRING )
            // InternalPactDSL.g:8492:3: RULE_STRING
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
    // InternalPactDSL.g:8501:1: rule__ByEmail__EmailAddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ByEmail__EmailAddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8505:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8506:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8506:2: ( RULE_STRING )
            // InternalPactDSL.g:8507:3: RULE_STRING
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
    // InternalPactDSL.g:8516:1: rule__GivingNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__GivingNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8520:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8521:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8521:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8522:3: ( RULE_ID )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8523:3: ( RULE_ID )
            // InternalPactDSL.g:8524:4: RULE_ID
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
    // InternalPactDSL.g:8535:1: rule__GivingNotice__NumDaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GivingNotice__NumDaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8539:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8540:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8540:2: ( RULE_INT )
            // InternalPactDSL.g:8541:3: RULE_INT
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
    // InternalPactDSL.g:8550:1: rule__CustomFormality__CustomFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFormality__CustomFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8554:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8555:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8555:2: ( RULE_STRING )
            // InternalPactDSL.g:8556:3: RULE_STRING
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
    // InternalPactDSL.g:8565:1: rule__GivenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8569:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8570:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8570:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8571:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:8572:3: ( RULE_ID )
            // InternalPactDSL.g:8573:4: RULE_ID
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
    // InternalPactDSL.g:8584:1: rule__GivenWrittenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenWrittenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8588:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8589:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8589:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8590:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:8591:3: ( RULE_ID )
            // InternalPactDSL.g:8592:4: RULE_ID
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


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_1"
    // InternalPactDSL.g:8603:1: rule__Ownership__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8607:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8608:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8608:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8609:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8610:3: ( RULE_ID )
            // InternalPactDSL.g:8611:4: RULE_ID
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


    // $ANTLR start "rule__Ownership__CustomOwnershipAssignment_3"
    // InternalPactDSL.g:8622:1: rule__Ownership__CustomOwnershipAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Ownership__CustomOwnershipAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8626:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8627:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8627:2: ( RULE_STRING )
            // InternalPactDSL.g:8628:3: RULE_STRING
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__CustomOwnershipAssignment_3"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_1"
    // InternalPactDSL.g:8637:1: rule__RightToUse__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8641:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8642:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8642:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8643:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8644:3: ( RULE_ID )
            // InternalPactDSL.g:8645:4: RULE_ID
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


    // $ANTLR start "rule__RightToUse__CustomUsageAssignment_3"
    // InternalPactDSL.g:8656:1: rule__RightToUse__CustomUsageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__RightToUse__CustomUsageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8660:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8661:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8661:2: ( RULE_STRING )
            // InternalPactDSL.g:8662:3: RULE_STRING
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__CustomUsageAssignment_3"


    // $ANTLR start "rule__PrimaryObligationType__CustomObligationAssignment_6"
    // InternalPactDSL.g:8671:1: rule__PrimaryObligationType__CustomObligationAssignment_6 : ( RULE_STRING ) ;
    public final void rule__PrimaryObligationType__CustomObligationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8675:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8676:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8676:2: ( RULE_STRING )
            // InternalPactDSL.g:8677:3: RULE_STRING
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryObligationType__CustomObligationAssignment_6"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8686:1: rule__PaymentObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8690:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8691:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8691:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8692:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8693:3: ( RULE_ID )
            // InternalPactDSL.g:8694:4: RULE_ID
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
    // InternalPactDSL.g:8705:1: rule__PaymentObligation__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8709:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8710:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8710:2: ( RULE_INT )
            // InternalPactDSL.g:8711:3: RULE_INT
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
    // InternalPactDSL.g:8720:1: rule__PaymentObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8724:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8725:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8725:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8726:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8727:3: ( RULE_ID )
            // InternalPactDSL.g:8728:4: RULE_ID
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
    // InternalPactDSL.g:8739:1: rule__PaymentObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8743:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8744:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8744:2: ( RULE_INT )
            // InternalPactDSL.g:8745:3: RULE_INT
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
    // InternalPactDSL.g:8754:1: rule__PaymentObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8758:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8759:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8759:2: ( RULE_INT )
            // InternalPactDSL.g:8760:3: RULE_INT
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
    // InternalPactDSL.g:8769:1: rule__PaymentObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8773:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8774:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8774:2: ( RULE_INT )
            // InternalPactDSL.g:8775:3: RULE_INT
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
    // InternalPactDSL.g:8784:1: rule__DeliveryObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8788:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8789:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8789:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8790:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8791:3: ( RULE_ID )
            // InternalPactDSL.g:8792:4: RULE_ID
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
    // InternalPactDSL.g:8803:1: rule__DeliveryObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8807:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8808:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8808:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8809:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8810:3: ( RULE_ID )
            // InternalPactDSL.g:8811:4: RULE_ID
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
    // InternalPactDSL.g:8822:1: rule__DeliveryObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8826:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8827:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8827:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8828:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8829:3: ( RULE_ID )
            // InternalPactDSL.g:8830:4: RULE_ID
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
    // InternalPactDSL.g:8841:1: rule__DeliveryObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8845:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8846:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8846:2: ( RULE_INT )
            // InternalPactDSL.g:8847:3: RULE_INT
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
    // InternalPactDSL.g:8856:1: rule__DeliveryObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8860:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8861:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8861:2: ( RULE_INT )
            // InternalPactDSL.g:8862:3: RULE_INT
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
    // InternalPactDSL.g:8871:1: rule__DeliveryObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8875:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8876:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8876:2: ( RULE_INT )
            // InternalPactDSL.g:8877:3: RULE_INT
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
    // InternalPactDSL.g:8886:1: rule__TransferObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8890:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8891:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8891:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8892:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8893:3: ( RULE_ID )
            // InternalPactDSL.g:8894:4: RULE_ID
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
    // InternalPactDSL.g:8905:1: rule__TransferObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8909:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8910:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8910:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8911:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8912:3: ( RULE_ID )
            // InternalPactDSL.g:8913:4: RULE_ID
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
    // InternalPactDSL.g:8924:1: rule__TransferObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8928:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8929:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8929:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8930:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8931:3: ( RULE_ID )
            // InternalPactDSL.g:8932:4: RULE_ID
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
    // InternalPactDSL.g:8943:1: rule__TransferObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__TransferObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8947:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8948:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8948:2: ( RULE_INT )
            // InternalPactDSL.g:8949:3: RULE_INT
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
    // InternalPactDSL.g:8958:1: rule__TransferObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__TransferObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8962:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8963:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8963:2: ( RULE_INT )
            // InternalPactDSL.g:8964:3: RULE_INT
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
    // InternalPactDSL.g:8973:1: rule__TransferObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__TransferObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8977:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8978:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8978:2: ( RULE_INT )
            // InternalPactDSL.g:8979:3: RULE_INT
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
    // InternalPactDSL.g:8988:1: rule__LicenceObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8992:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8993:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8993:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8994:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8995:3: ( RULE_ID )
            // InternalPactDSL.g:8996:4: RULE_ID
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
    // InternalPactDSL.g:9007:1: rule__LicenceObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9011:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9012:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9012:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9013:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 
            // InternalPactDSL.g:9014:3: ( RULE_ID )
            // InternalPactDSL.g:9015:4: RULE_ID
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
    // InternalPactDSL.g:9026:1: rule__LicenceObligation__SuperTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9030:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9031:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9031:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9032:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 
            // InternalPactDSL.g:9033:3: ( RULE_ID )
            // InternalPactDSL.g:9034:4: RULE_ID
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
    // InternalPactDSL.g:9045:1: rule__LicenceObligation__DayAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__DayAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9049:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9050:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9050:2: ( RULE_INT )
            // InternalPactDSL.g:9051:3: RULE_INT
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
    // InternalPactDSL.g:9060:1: rule__LicenceObligation__MonthAssignment_9_3 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__MonthAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9064:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9065:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9065:2: ( RULE_INT )
            // InternalPactDSL.g:9066:3: RULE_INT
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
    // InternalPactDSL.g:9075:1: rule__LicenceObligation__YearAssignment_9_4 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__YearAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9079:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9080:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9080:2: ( RULE_INT )
            // InternalPactDSL.g:9081:3: RULE_INT
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
    // InternalPactDSL.g:9090:1: rule__ConstraintParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9094:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9095:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9095:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9096:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9097:3: ( RULE_ID )
            // InternalPactDSL.g:9098:4: RULE_ID
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
    // InternalPactDSL.g:9109:1: rule__ConstraintParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9113:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9114:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9114:2: ( RULE_STRING )
            // InternalPactDSL.g:9115:3: RULE_STRING
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
    // InternalPactDSL.g:9124:1: rule__ConstraintParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9128:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9129:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9129:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9130:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9131:3: ( RULE_ID )
            // InternalPactDSL.g:9132:4: RULE_ID
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
    // InternalPactDSL.g:9143:1: rule__ConstraintParty__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9147:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9148:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9148:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9149:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 
            // InternalPactDSL.g:9150:3: ( RULE_ID )
            // InternalPactDSL.g:9151:4: RULE_ID
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
    // InternalPactDSL.g:9162:1: rule__ConstraintThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9166:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9167:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9167:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9168:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9169:3: ( RULE_ID )
            // InternalPactDSL.g:9170:4: RULE_ID
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
    // InternalPactDSL.g:9181:1: rule__ConstraintThirdParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9185:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9186:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9186:2: ( RULE_STRING )
            // InternalPactDSL.g:9187:3: RULE_STRING
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
    // InternalPactDSL.g:9196:1: rule__ConstraintThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9200:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9201:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9201:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9202:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:9203:3: ( RULE_ID )
            // InternalPactDSL.g:9204:4: RULE_ID
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
    // InternalPactDSL.g:9215:1: rule__ConstraintThirdParty__AdditionalInfoAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__AdditionalInfoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9219:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9220:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9220:2: ( RULE_STRING )
            // InternalPactDSL.g:9221:3: RULE_STRING
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
    // InternalPactDSL.g:9230:1: rule__ConstraintThirdParty__SuperTypeAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9234:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9235:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9235:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9236:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 
            // InternalPactDSL.g:9237:3: ( RULE_ID )
            // InternalPactDSL.g:9238:4: RULE_ID
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
    // InternalPactDSL.g:9249:1: rule__ConstraintThirdParty__SuperTypeAssignment_7_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9253:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9254:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9254:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9255:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 
            // InternalPactDSL.g:9256:3: ( RULE_ID )
            // InternalPactDSL.g:9257:4: RULE_ID
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


    // $ANTLR start "rule__SecondaryObligationType__SuperTypeAssignment_1"
    // InternalPactDSL.g:9268:1: rule__SecondaryObligationType__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SecondaryObligationType__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9272:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9273:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9273:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9274:3: ( RULE_ID )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9275:3: ( RULE_ID )
            // InternalPactDSL.g:9276:4: RULE_ID
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
    // InternalPactDSL.g:9287:1: rule__SecondaryObligationType__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__SecondaryObligationType__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9291:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:9292:2: ( RULE_INT )
            {
            // InternalPactDSL.g:9292:2: ( RULE_INT )
            // InternalPactDSL.g:9293:3: RULE_INT
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
    // InternalPactDSL.g:9302:1: rule__SecondaryObligationType__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__SecondaryObligationType__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9306:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9307:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9307:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9308:3: ( RULE_ID )
            {
             before(grammarAccess.getSecondaryObligationTypeAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:9309:3: ( RULE_ID )
            // InternalPactDSL.g:9310:4: RULE_ID
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
    // InternalPactDSL.g:9321:1: rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SecondaryObligationType__CustomPrimaryObligationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9325:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9326:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9326:2: ( RULE_STRING )
            // InternalPactDSL.g:9327:3: RULE_STRING
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


    // $ANTLR start "rule__LiabilityParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:9336:1: rule__LiabilityParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9340:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9341:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9341:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9342:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9343:3: ( RULE_ID )
            // InternalPactDSL.g:9344:4: RULE_ID
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__LiabilityParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:9355:1: rule__LiabilityParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9359:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9360:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9360:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9361:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyCrossReference_4_0()); 
            // InternalPactDSL.g:9362:3: ( RULE_ID )
            // InternalPactDSL.g:9363:4: RULE_ID
            {
             before(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLiabilityPartyAccess().getSuperTypePartyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__LiabilityParty__CustomLossAssignment_6"
    // InternalPactDSL.g:9374:1: rule__LiabilityParty__CustomLossAssignment_6 : ( RULE_STRING ) ;
    public final void rule__LiabilityParty__CustomLossAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9378:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9379:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9379:2: ( RULE_STRING )
            // InternalPactDSL.g:9380:3: RULE_STRING
            {
             before(grammarAccess.getLiabilityPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiabilityPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityParty__CustomLossAssignment_6"


    // $ANTLR start "rule__LiabilityThirdParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:9389:1: rule__LiabilityThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9393:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9394:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9394:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9395:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9396:3: ( RULE_ID )
            // InternalPactDSL.g:9397:4: RULE_ID
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__LiabilityThirdParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:9408:1: rule__LiabilityThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LiabilityThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9412:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9413:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9413:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9414:3: ( RULE_ID )
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeThirdPartyCrossReference_4_0()); 
            // InternalPactDSL.g:9415:3: ( RULE_ID )
            // InternalPactDSL.g:9416:4: RULE_ID
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLiabilityThirdPartyAccess().getSuperTypeThirdPartyCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__LiabilityThirdParty__CustomLossAssignment_6"
    // InternalPactDSL.g:9427:1: rule__LiabilityThirdParty__CustomLossAssignment_6 : ( RULE_STRING ) ;
    public final void rule__LiabilityThirdParty__CustomLossAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9431:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9432:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9432:2: ( RULE_STRING )
            // InternalPactDSL.g:9433:3: RULE_STRING
            {
             before(grammarAccess.getLiabilityThirdPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiabilityThirdPartyAccess().getCustomLossSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiabilityThirdParty__CustomLossAssignment_6"


    // $ANTLR start "rule__ForConvenience__SuperTypeAssignment_1"
    // InternalPactDSL.g:9442:1: rule__ForConvenience__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForConvenience__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9446:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9447:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9447:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9448:3: ( RULE_ID )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9449:3: ( RULE_ID )
            // InternalPactDSL.g:9450:4: RULE_ID
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
    // InternalPactDSL.g:9461:1: rule__ForConvenience__CustomTerminationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForConvenience__CustomTerminationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9465:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9466:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9466:2: ( RULE_STRING )
            // InternalPactDSL.g:9467:3: RULE_STRING
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
    // InternalPactDSL.g:9476:1: rule__OnReasonableNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9480:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9481:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9481:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9482:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9483:3: ( RULE_ID )
            // InternalPactDSL.g:9484:4: RULE_ID
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
    // InternalPactDSL.g:9495:1: rule__OnReasonableNotice__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9499:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9500:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9500:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9501:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 
            // InternalPactDSL.g:9502:3: ( RULE_ID )
            // InternalPactDSL.g:9503:4: RULE_ID
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
    // InternalPactDSL.g:9514:1: rule__ForBreach__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9518:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9519:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9519:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9520:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9521:3: ( RULE_ID )
            // InternalPactDSL.g:9522:4: RULE_ID
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
    // InternalPactDSL.g:9533:1: rule__ForBreach__ObligationBreachedAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForBreach__ObligationBreachedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9537:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9538:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9538:2: ( RULE_STRING )
            // InternalPactDSL.g:9539:3: RULE_STRING
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
    // InternalPactDSL.g:9548:1: rule__ForBreach__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9552:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9553:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9553:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9554:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:9555:3: ( RULE_ID )
            // InternalPactDSL.g:9556:4: RULE_ID
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
    // InternalPactDSL.g:9567:1: rule__ForBreach__RemedialSchemeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ForBreach__RemedialSchemeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9571:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9572:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9572:2: ( RULE_STRING )
            // InternalPactDSL.g:9573:3: RULE_STRING
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
    // InternalPactDSL.g:9582:1: rule__OnInsolvencyEvent__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9586:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9587:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9587:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9588:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9589:3: ( RULE_ID )
            // InternalPactDSL.g:9590:4: RULE_ID
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
    // InternalPactDSL.g:9601:1: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 : ( RULE_STRING ) ;
    public final void rule__OnInsolvencyEvent__InsolvencyEventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9605:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9606:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9606:2: ( RULE_STRING )
            // InternalPactDSL.g:9607:3: RULE_STRING
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
    // InternalPactDSL.g:9616:1: rule__OnInsolvencyEvent__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9620:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9621:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9621:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9622:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:9623:3: ( RULE_ID )
            // InternalPactDSL.g:9624:4: RULE_ID
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
    // InternalPactDSL.g:9635:1: rule__CustomTermination__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9639:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9640:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9640:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9641:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:9642:3: ( RULE_ID )
            // InternalPactDSL.g:9643:4: RULE_ID
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
    // InternalPactDSL.g:9654:1: rule__CustomTermination__CustomTerminationClauseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomTermination__CustomTerminationClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9658:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9659:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9659:2: ( RULE_STRING )
            // InternalPactDSL.g:9660:3: RULE_STRING
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
    // InternalPactDSL.g:9669:1: rule__CustomTermination__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9673:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:9674:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:9674:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:9675:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 
            // InternalPactDSL.g:9676:3: ( RULE_ID )
            // InternalPactDSL.g:9677:4: RULE_ID
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
    // InternalPactDSL.g:9688:1: rule__ApplicableLaw__CustomApplicableLawAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicableLaw__CustomApplicableLawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9692:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9693:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9693:2: ( RULE_STRING )
            // InternalPactDSL.g:9694:3: RULE_STRING
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
    // InternalPactDSL.g:9703:1: rule__ApplicableLaw__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__ApplicableLaw__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9707:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:9708:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:9708:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:9709:3: ruleDefinedTerm
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
    // InternalPactDSL.g:9718:1: rule__Jurisdiction__CustomJurisdictionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Jurisdiction__CustomJurisdictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9722:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9723:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9723:2: ( RULE_STRING )
            // InternalPactDSL.g:9724:3: RULE_STRING
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
    // InternalPactDSL.g:9733:1: rule__Jurisdiction__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__Jurisdiction__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9737:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:9738:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:9738:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:9739:3: ruleDefinedTerm
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
    // InternalPactDSL.g:9748:1: rule__Notices__CustomNoticeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notices__CustomNoticeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9752:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9753:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9753:2: ( RULE_STRING )
            // InternalPactDSL.g:9754:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00003258003C0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000025800000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x28A8400000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000300007C00000L,0x000000000003ACCAL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x28A8400000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000048L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L,0x0000000000002C80L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000002000000050L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000080000000L});

}