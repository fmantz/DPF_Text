package no.hib.dpf.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import no.hib.dpf.text.services.DPFTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDPFTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Batch'", "'{'", "','", "'}'", "'emf'", "'('", "')'", "'ecore'", "'image'", "'diagram'", "'testMatch'", "'Specification'", "':'", "'<PLAIN>'", "'Constraints'", "'!'", "'<version='", "'>'", "'Signature'", "'<'", "'='", "'errorMsg='", "'Graph'", "'-'", "':*->'", "'->'", "'-|>'", "'extends'", "'and'", "'@'", "'Boolean'", "'Char'", "'Byte'", "'Short'", "'Int'", "'Long'", "'Float'", "'Double'", "'String'", "'jpg'", "'bmp'", "'canon'", "'dot'", "'xdot'", "'cmap'", "'eps'", "'fig'", "'gd'", "'gd2'", "'gif'", "'gtk'", "'ico'", "'imap'", "'cmapx'", "'imap_np'", "'cmapx_np'", "'ismap'", "'jpeg'", "'jpe'", "'pdf'", "'plain'", "'plain-ext'", "'png'", "'ps'", "'ps2'", "'svg'", "'svgz'", "'tif'", "'tiff'", "'vml'", "'vmlz'", "'vrml'", "'wbmp'", "'webp'", "'xlib'", "'OCL'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__84=84;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalDPFTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDPFTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDPFTextParser.tokenNames; }
    public String getGrammarFileName() { return "../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g"; }



     	private DPFTextGrammarAccess grammarAccess;
     	
        public InternalDPFTextParser(TokenStream input, DPFTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DPFTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:77:1: ruleModel returns [EObject current=null] : (this_Specification_0= ruleSpecification | this_Signature_1= ruleSignature | this_Batch_2= ruleBatch ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Specification_0 = null;

        EObject this_Signature_1 = null;

        EObject this_Batch_2 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:80:28: ( (this_Specification_0= ruleSpecification | this_Signature_1= ruleSignature | this_Batch_2= ruleBatch ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:81:1: (this_Specification_0= ruleSpecification | this_Signature_1= ruleSignature | this_Batch_2= ruleBatch )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:81:1: (this_Specification_0= ruleSpecification | this_Signature_1= ruleSignature | this_Batch_2= ruleBatch )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 11:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:82:5: this_Specification_0= ruleSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSpecification_in_ruleModel132);
                    this_Specification_0=ruleSpecification();

                    state._fsp--;

                     
                            current = this_Specification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:92:5: this_Signature_1= ruleSignature
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getSignatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSignature_in_ruleModel159);
                    this_Signature_1=ruleSignature();

                    state._fsp--;

                     
                            current = this_Signature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:102:5: this_Batch_2= ruleBatch
                    {
                     
                            newCompositeNode(grammarAccess.getModelAccess().getBatchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBatch_in_ruleModel186);
                    this_Batch_2=ruleBatch();

                    state._fsp--;

                     
                            current = this_Batch_2; 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBatch"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:118:1: entryRuleBatch returns [EObject current=null] : iv_ruleBatch= ruleBatch EOF ;
    public final EObject entryRuleBatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatch = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:119:2: (iv_ruleBatch= ruleBatch EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:120:2: iv_ruleBatch= ruleBatch EOF
            {
             newCompositeNode(grammarAccess.getBatchRule()); 
            pushFollow(FOLLOW_ruleBatch_in_entryRuleBatch221);
            iv_ruleBatch=ruleBatch();

            state._fsp--;

             current =iv_ruleBatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatch231); 

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
    // $ANTLR end "entryRuleBatch"


    // $ANTLR start "ruleBatch"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:127:1: ruleBatch returns [EObject current=null] : (otherlv_0= 'Batch' otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleBatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_commands_2_0 = null;

        EObject lv_commands_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:130:28: ( (otherlv_0= 'Batch' otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:131:1: (otherlv_0= 'Batch' otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:131:1: (otherlv_0= 'Batch' otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:131:3: otherlv_0= 'Batch' otherlv_1= '{' ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleBatch268); 

                	newLeafNode(otherlv_0, grammarAccess.getBatchAccess().getBatchKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleBatch280); 

                	newLeafNode(otherlv_1, grammarAccess.getBatchAccess().getLeftCurlyBracketKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:139:1: ( ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15||(LA3_0>=18 && LA3_0<=21)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:139:2: ( (lv_commands_2_0= ruleCommand ) ) (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )*
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:139:2: ( (lv_commands_2_0= ruleCommand ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:140:1: (lv_commands_2_0= ruleCommand )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:140:1: (lv_commands_2_0= ruleCommand )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:141:3: lv_commands_2_0= ruleCommand
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchAccess().getCommandsCommandParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCommand_in_ruleBatch302);
                    lv_commands_2_0=ruleCommand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBatchRule());
                    	        }
                           		add(
                           			current, 
                           			"commands",
                            		lv_commands_2_0, 
                            		"Command");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:157:2: (otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:157:4: otherlv_3= ',' ( (lv_commands_4_0= ruleCommand ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBatch315); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getBatchAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:161:1: ( (lv_commands_4_0= ruleCommand ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:162:1: (lv_commands_4_0= ruleCommand )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:162:1: (lv_commands_4_0= ruleCommand )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:163:3: lv_commands_4_0= ruleCommand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBatchAccess().getCommandsCommandParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCommand_in_ruleBatch336);
                    	    lv_commands_4_0=ruleCommand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBatchRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_4_0, 
                    	            		"Command");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleBatch352); 

                	newLeafNode(otherlv_5, grammarAccess.getBatchAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBatch"


    // $ANTLR start "entryRuleCommand"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:191:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:192:2: (iv_ruleCommand= ruleCommand EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:193:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand388);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand398); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:200:1: ruleCommand returns [EObject current=null] : (this_MakeEmf_0= ruleMakeEmf | this_MakeEcore_1= ruleMakeEcore | this_MakeImage_2= ruleMakeImage | this_MakeDiagram_3= ruleMakeDiagram | this_TestMatch_4= ruleTestMatch ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_MakeEmf_0 = null;

        EObject this_MakeEcore_1 = null;

        EObject this_MakeImage_2 = null;

        EObject this_MakeDiagram_3 = null;

        EObject this_TestMatch_4 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:203:28: ( (this_MakeEmf_0= ruleMakeEmf | this_MakeEcore_1= ruleMakeEcore | this_MakeImage_2= ruleMakeImage | this_MakeDiagram_3= ruleMakeDiagram | this_TestMatch_4= ruleTestMatch ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:204:1: (this_MakeEmf_0= ruleMakeEmf | this_MakeEcore_1= ruleMakeEcore | this_MakeImage_2= ruleMakeImage | this_MakeDiagram_3= ruleMakeDiagram | this_TestMatch_4= ruleTestMatch )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:204:1: (this_MakeEmf_0= ruleMakeEmf | this_MakeEcore_1= ruleMakeEcore | this_MakeImage_2= ruleMakeImage | this_MakeDiagram_3= ruleMakeDiagram | this_TestMatch_4= ruleTestMatch )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            case 21:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:205:5: this_MakeEmf_0= ruleMakeEmf
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMakeEmfParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMakeEmf_in_ruleCommand445);
                    this_MakeEmf_0=ruleMakeEmf();

                    state._fsp--;

                     
                            current = this_MakeEmf_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:215:5: this_MakeEcore_1= ruleMakeEcore
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMakeEcoreParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMakeEcore_in_ruleCommand472);
                    this_MakeEcore_1=ruleMakeEcore();

                    state._fsp--;

                     
                            current = this_MakeEcore_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:225:5: this_MakeImage_2= ruleMakeImage
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMakeImageParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMakeImage_in_ruleCommand499);
                    this_MakeImage_2=ruleMakeImage();

                    state._fsp--;

                     
                            current = this_MakeImage_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:235:5: this_MakeDiagram_3= ruleMakeDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getMakeDiagramParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMakeDiagram_in_ruleCommand526);
                    this_MakeDiagram_3=ruleMakeDiagram();

                    state._fsp--;

                     
                            current = this_MakeDiagram_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:245:5: this_TestMatch_4= ruleTestMatch
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getTestMatchParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTestMatch_in_ruleCommand553);
                    this_TestMatch_4=ruleTestMatch();

                    state._fsp--;

                     
                            current = this_TestMatch_4; 
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleMakeEmf"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:261:1: entryRuleMakeEmf returns [EObject current=null] : iv_ruleMakeEmf= ruleMakeEmf EOF ;
    public final EObject entryRuleMakeEmf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeEmf = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:262:2: (iv_ruleMakeEmf= ruleMakeEmf EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:263:2: iv_ruleMakeEmf= ruleMakeEmf EOF
            {
             newCompositeNode(grammarAccess.getMakeEmfRule()); 
            pushFollow(FOLLOW_ruleMakeEmf_in_entryRuleMakeEmf588);
            iv_ruleMakeEmf=ruleMakeEmf();

            state._fsp--;

             current =iv_ruleMakeEmf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeEmf598); 

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
    // $ANTLR end "entryRuleMakeEmf"


    // $ANTLR start "ruleMakeEmf"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:270:1: ruleMakeEmf returns [EObject current=null] : (otherlv_0= 'emf' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleMakeEmf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:273:28: ( (otherlv_0= 'emf' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:274:1: (otherlv_0= 'emf' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:274:1: (otherlv_0= 'emf' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:274:3: otherlv_0= 'emf' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMakeEmf635); 

                	newLeafNode(otherlv_0, grammarAccess.getMakeEmfAccess().getEmfKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMakeEmf647); 

                	newLeafNode(otherlv_1, grammarAccess.getMakeEmfAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:282:1: ( (lv_id_2_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:283:1: (lv_id_2_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:283:1: (lv_id_2_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:284:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeEmf664); 

            			newLeafNode(lv_id_2_0, grammarAccess.getMakeEmfAccess().getIdIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMakeEmfRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMakeEmf681); 

                	newLeafNode(otherlv_3, grammarAccess.getMakeEmfAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMakeEmf"


    // $ANTLR start "entryRuleMakeEcore"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:312:1: entryRuleMakeEcore returns [EObject current=null] : iv_ruleMakeEcore= ruleMakeEcore EOF ;
    public final EObject entryRuleMakeEcore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeEcore = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:313:2: (iv_ruleMakeEcore= ruleMakeEcore EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:314:2: iv_ruleMakeEcore= ruleMakeEcore EOF
            {
             newCompositeNode(grammarAccess.getMakeEcoreRule()); 
            pushFollow(FOLLOW_ruleMakeEcore_in_entryRuleMakeEcore717);
            iv_ruleMakeEcore=ruleMakeEcore();

            state._fsp--;

             current =iv_ruleMakeEcore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeEcore727); 

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
    // $ANTLR end "entryRuleMakeEcore"


    // $ANTLR start "ruleMakeEcore"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:321:1: ruleMakeEcore returns [EObject current=null] : (otherlv_0= 'ecore' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleMakeEcore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:324:28: ( (otherlv_0= 'ecore' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:325:1: (otherlv_0= 'ecore' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:325:1: (otherlv_0= 'ecore' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:325:3: otherlv_0= 'ecore' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMakeEcore764); 

                	newLeafNode(otherlv_0, grammarAccess.getMakeEcoreAccess().getEcoreKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMakeEcore776); 

                	newLeafNode(otherlv_1, grammarAccess.getMakeEcoreAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:333:1: ( (lv_id_2_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:334:1: (lv_id_2_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:334:1: (lv_id_2_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:335:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeEcore793); 

            			newLeafNode(lv_id_2_0, grammarAccess.getMakeEcoreAccess().getIdIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMakeEcoreRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMakeEcore810); 

                	newLeafNode(otherlv_3, grammarAccess.getMakeEcoreAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleMakeEcore"


    // $ANTLR start "entryRuleMakeImage"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:363:1: entryRuleMakeImage returns [EObject current=null] : iv_ruleMakeImage= ruleMakeImage EOF ;
    public final EObject entryRuleMakeImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeImage = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:364:2: (iv_ruleMakeImage= ruleMakeImage EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:365:2: iv_ruleMakeImage= ruleMakeImage EOF
            {
             newCompositeNode(grammarAccess.getMakeImageRule()); 
            pushFollow(FOLLOW_ruleMakeImage_in_entryRuleMakeImage846);
            iv_ruleMakeImage=ruleMakeImage();

            state._fsp--;

             current =iv_ruleMakeImage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeImage856); 

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
    // $ANTLR end "entryRuleMakeImage"


    // $ANTLR start "ruleMakeImage"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:372:1: ruleMakeImage returns [EObject current=null] : (otherlv_0= 'image' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleMakeImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:375:28: ( (otherlv_0= 'image' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:376:1: (otherlv_0= 'image' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:376:1: (otherlv_0= 'image' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:376:3: otherlv_0= 'image' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMakeImage893); 

                	newLeafNode(otherlv_0, grammarAccess.getMakeImageAccess().getImageKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMakeImage905); 

                	newLeafNode(otherlv_1, grammarAccess.getMakeImageAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:384:1: ( (lv_id_2_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:385:1: (lv_id_2_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:385:1: (lv_id_2_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:386:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeImage922); 

            			newLeafNode(lv_id_2_0, grammarAccess.getMakeImageAccess().getIdIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMakeImageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:402:2: (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:402:4: otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMakeImage940); 

                        	newLeafNode(otherlv_3, grammarAccess.getMakeImageAccess().getCommaKeyword_3_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:406:1: ( (lv_type_4_0= ruleGraphvizOutput ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:407:1: (lv_type_4_0= ruleGraphvizOutput )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:407:1: (lv_type_4_0= ruleGraphvizOutput )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:408:3: lv_type_4_0= ruleGraphvizOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getMakeImageAccess().getTypeGraphvizOutputEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGraphvizOutput_in_ruleMakeImage961);
                    lv_type_4_0=ruleGraphvizOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMakeImageRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"GraphvizOutput");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleMakeImage975); 

                	newLeafNode(otherlv_5, grammarAccess.getMakeImageAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMakeImage"


    // $ANTLR start "entryRuleMakeDiagram"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:436:1: entryRuleMakeDiagram returns [EObject current=null] : iv_ruleMakeDiagram= ruleMakeDiagram EOF ;
    public final EObject entryRuleMakeDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMakeDiagram = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:437:2: (iv_ruleMakeDiagram= ruleMakeDiagram EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:438:2: iv_ruleMakeDiagram= ruleMakeDiagram EOF
            {
             newCompositeNode(grammarAccess.getMakeDiagramRule()); 
            pushFollow(FOLLOW_ruleMakeDiagram_in_entryRuleMakeDiagram1011);
            iv_ruleMakeDiagram=ruleMakeDiagram();

            state._fsp--;

             current =iv_ruleMakeDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeDiagram1021); 

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
    // $ANTLR end "entryRuleMakeDiagram"


    // $ANTLR start "ruleMakeDiagram"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:445:1: ruleMakeDiagram returns [EObject current=null] : (otherlv_0= 'diagram' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleMakeDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:448:28: ( (otherlv_0= 'diagram' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:449:1: (otherlv_0= 'diagram' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:449:1: (otherlv_0= 'diagram' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:449:3: otherlv_0= 'diagram' otherlv_1= '(' ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleMakeDiagram1058); 

                	newLeafNode(otherlv_0, grammarAccess.getMakeDiagramAccess().getDiagramKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMakeDiagram1070); 

                	newLeafNode(otherlv_1, grammarAccess.getMakeDiagramAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:457:1: ( (lv_id_2_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:458:1: (lv_id_2_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:458:1: (lv_id_2_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:459:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMakeDiagram1087); 

            			newLeafNode(lv_id_2_0, grammarAccess.getMakeDiagramAccess().getIdIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMakeDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:475:2: (otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:475:4: otherlv_3= ',' ( (lv_type_4_0= ruleGraphvizOutput ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMakeDiagram1105); 

                        	newLeafNode(otherlv_3, grammarAccess.getMakeDiagramAccess().getCommaKeyword_3_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:479:1: ( (lv_type_4_0= ruleGraphvizOutput ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:480:1: (lv_type_4_0= ruleGraphvizOutput )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:480:1: (lv_type_4_0= ruleGraphvizOutput )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:481:3: lv_type_4_0= ruleGraphvizOutput
                    {
                     
                    	        newCompositeNode(grammarAccess.getMakeDiagramAccess().getTypeGraphvizOutputEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGraphvizOutput_in_ruleMakeDiagram1126);
                    lv_type_4_0=ruleGraphvizOutput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMakeDiagramRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"GraphvizOutput");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleMakeDiagram1140); 

                	newLeafNode(otherlv_5, grammarAccess.getMakeDiagramAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleMakeDiagram"


    // $ANTLR start "entryRuleTestMatch"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:509:1: entryRuleTestMatch returns [EObject current=null] : iv_ruleTestMatch= ruleTestMatch EOF ;
    public final EObject entryRuleTestMatch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestMatch = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:510:2: (iv_ruleTestMatch= ruleTestMatch EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:511:2: iv_ruleTestMatch= ruleTestMatch EOF
            {
             newCompositeNode(grammarAccess.getTestMatchRule()); 
            pushFollow(FOLLOW_ruleTestMatch_in_entryRuleTestMatch1176);
            iv_ruleTestMatch=ruleTestMatch();

            state._fsp--;

             current =iv_ruleTestMatch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMatch1186); 

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
    // $ANTLR end "entryRuleTestMatch"


    // $ANTLR start "ruleTestMatch"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:518:1: ruleTestMatch returns [EObject current=null] : (otherlv_0= 'testMatch' otherlv_1= '(' ( (lv_search_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_into_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleTestMatch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_search_2_0=null;
        Token otherlv_3=null;
        Token lv_into_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:521:28: ( (otherlv_0= 'testMatch' otherlv_1= '(' ( (lv_search_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_into_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:522:1: (otherlv_0= 'testMatch' otherlv_1= '(' ( (lv_search_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_into_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:522:1: (otherlv_0= 'testMatch' otherlv_1= '(' ( (lv_search_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_into_4_0= RULE_ID ) ) otherlv_5= ')' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:522:3: otherlv_0= 'testMatch' otherlv_1= '(' ( (lv_search_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_into_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTestMatch1223); 

                	newLeafNode(otherlv_0, grammarAccess.getTestMatchAccess().getTestMatchKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTestMatch1235); 

                	newLeafNode(otherlv_1, grammarAccess.getTestMatchAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:530:1: ( (lv_search_2_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:531:1: (lv_search_2_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:531:1: (lv_search_2_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:532:3: lv_search_2_0= RULE_ID
            {
            lv_search_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestMatch1252); 

            			newLeafNode(lv_search_2_0, grammarAccess.getTestMatchAccess().getSearchIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestMatchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"search",
                    		lv_search_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTestMatch1269); 

                	newLeafNode(otherlv_3, grammarAccess.getTestMatchAccess().getCommaKeyword_3());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:552:1: ( (lv_into_4_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:553:1: (lv_into_4_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:553:1: (lv_into_4_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:554:3: lv_into_4_0= RULE_ID
            {
            lv_into_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestMatch1286); 

            			newLeafNode(lv_into_4_0, grammarAccess.getTestMatchAccess().getIntoIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestMatchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"into",
                    		lv_into_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTestMatch1303); 

                	newLeafNode(otherlv_5, grammarAccess.getTestMatchAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleTestMatch"


    // $ANTLR start "entryRuleSpecification"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:582:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:583:2: (iv_ruleSpecification= ruleSpecification EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:584:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_ruleSpecification_in_entryRuleSpecification1339);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecification1349); 

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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:591:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'Specification' ( (lv_version_1_0= ruleVersion ) ) otherlv_2= ':' ( (lv_type_3_0= ruleChoosenSpecification ) ) ( (lv_output_4_0= '<PLAIN>' ) )? otherlv_5= '{' ( (lv_graph_6_0= ruleGraph ) ) ( (lv_atomicConstraints_7_0= ruleConstraintList ) )* otherlv_8= '}' ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_output_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_version_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_graph_6_0 = null;

        EObject lv_atomicConstraints_7_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:594:28: ( (otherlv_0= 'Specification' ( (lv_version_1_0= ruleVersion ) ) otherlv_2= ':' ( (lv_type_3_0= ruleChoosenSpecification ) ) ( (lv_output_4_0= '<PLAIN>' ) )? otherlv_5= '{' ( (lv_graph_6_0= ruleGraph ) ) ( (lv_atomicConstraints_7_0= ruleConstraintList ) )* otherlv_8= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:595:1: (otherlv_0= 'Specification' ( (lv_version_1_0= ruleVersion ) ) otherlv_2= ':' ( (lv_type_3_0= ruleChoosenSpecification ) ) ( (lv_output_4_0= '<PLAIN>' ) )? otherlv_5= '{' ( (lv_graph_6_0= ruleGraph ) ) ( (lv_atomicConstraints_7_0= ruleConstraintList ) )* otherlv_8= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:595:1: (otherlv_0= 'Specification' ( (lv_version_1_0= ruleVersion ) ) otherlv_2= ':' ( (lv_type_3_0= ruleChoosenSpecification ) ) ( (lv_output_4_0= '<PLAIN>' ) )? otherlv_5= '{' ( (lv_graph_6_0= ruleGraph ) ) ( (lv_atomicConstraints_7_0= ruleConstraintList ) )* otherlv_8= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:595:3: otherlv_0= 'Specification' ( (lv_version_1_0= ruleVersion ) ) otherlv_2= ':' ( (lv_type_3_0= ruleChoosenSpecification ) ) ( (lv_output_4_0= '<PLAIN>' ) )? otherlv_5= '{' ( (lv_graph_6_0= ruleGraph ) ) ( (lv_atomicConstraints_7_0= ruleConstraintList ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSpecification1386); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:599:1: ( (lv_version_1_0= ruleVersion ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:600:1: (lv_version_1_0= ruleVersion )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:600:1: (lv_version_1_0= ruleVersion )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:601:3: lv_version_1_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getSpecificationAccess().getVersionVersionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleSpecification1407);
            lv_version_1_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_1_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSpecification1419); 

                	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getColonKeyword_2());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:621:1: ( (lv_type_3_0= ruleChoosenSpecification ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:622:1: (lv_type_3_0= ruleChoosenSpecification )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:622:1: (lv_type_3_0= ruleChoosenSpecification )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:623:3: lv_type_3_0= ruleChoosenSpecification
            {
             
            	        newCompositeNode(grammarAccess.getSpecificationAccess().getTypeChoosenSpecificationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleChoosenSpecification_in_ruleSpecification1440);
            lv_type_3_0=ruleChoosenSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ChoosenSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:639:2: ( (lv_output_4_0= '<PLAIN>' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:640:1: (lv_output_4_0= '<PLAIN>' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:640:1: (lv_output_4_0= '<PLAIN>' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:641:3: lv_output_4_0= '<PLAIN>'
                    {
                    lv_output_4_0=(Token)match(input,24,FOLLOW_24_in_ruleSpecification1458); 

                            newLeafNode(lv_output_4_0, grammarAccess.getSpecificationAccess().getOutputPLAINKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSpecificationRule());
                    	        }
                           		setWithLastConsumed(current, "output", lv_output_4_0, "<PLAIN>");
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSpecification1484); 

                	newLeafNode(otherlv_5, grammarAccess.getSpecificationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:658:1: ( (lv_graph_6_0= ruleGraph ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:659:1: (lv_graph_6_0= ruleGraph )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:659:1: (lv_graph_6_0= ruleGraph )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:660:3: lv_graph_6_0= ruleGraph
            {
             
            	        newCompositeNode(grammarAccess.getSpecificationAccess().getGraphGraphParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleGraph_in_ruleSpecification1505);
            lv_graph_6_0=ruleGraph();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"graph",
                    		lv_graph_6_0, 
                    		"Graph");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:676:2: ( (lv_atomicConstraints_7_0= ruleConstraintList ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:677:1: (lv_atomicConstraints_7_0= ruleConstraintList )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:677:1: (lv_atomicConstraints_7_0= ruleConstraintList )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:678:3: lv_atomicConstraints_7_0= ruleConstraintList
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getAtomicConstraintsConstraintListParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstraintList_in_ruleSpecification1526);
            	    lv_atomicConstraints_7_0=ruleConstraintList();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"atomicConstraints",
            	            		lv_atomicConstraints_7_0, 
            	            		"ConstraintList");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleSpecification1539); 

                	newLeafNode(otherlv_8, grammarAccess.getSpecificationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleConstraintList"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:706:1: entryRuleConstraintList returns [EObject current=null] : iv_ruleConstraintList= ruleConstraintList EOF ;
    public final EObject entryRuleConstraintList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintList = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:707:2: (iv_ruleConstraintList= ruleConstraintList EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:708:2: iv_ruleConstraintList= ruleConstraintList EOF
            {
             newCompositeNode(grammarAccess.getConstraintListRule()); 
            pushFollow(FOLLOW_ruleConstraintList_in_entryRuleConstraintList1575);
            iv_ruleConstraintList=ruleConstraintList();

            state._fsp--;

             current =iv_ruleConstraintList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintList1585); 

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
    // $ANTLR end "entryRuleConstraintList"


    // $ANTLR start "ruleConstraintList"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:715:1: ruleConstraintList returns [EObject current=null] : (otherlv_0= 'Constraints' otherlv_1= '!' ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) ) otherlv_3= '{' ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleConstraintList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_constraintSemantic_2_0 = null;

        EObject lv_constraints_4_0 = null;

        EObject lv_constraints_6_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:718:28: ( (otherlv_0= 'Constraints' otherlv_1= '!' ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) ) otherlv_3= '{' ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )? otherlv_7= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:719:1: (otherlv_0= 'Constraints' otherlv_1= '!' ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) ) otherlv_3= '{' ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )? otherlv_7= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:719:1: (otherlv_0= 'Constraints' otherlv_1= '!' ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) ) otherlv_3= '{' ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )? otherlv_7= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:719:3: otherlv_0= 'Constraints' otherlv_1= '!' ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) ) otherlv_3= '{' ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleConstraintList1622); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintListAccess().getConstraintsKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleConstraintList1634); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintListAccess().getExclamationMarkKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:727:1: ( (lv_constraintSemantic_2_0= ruleChoosenSignature ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:728:1: (lv_constraintSemantic_2_0= ruleChoosenSignature )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:728:1: (lv_constraintSemantic_2_0= ruleChoosenSignature )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:729:3: lv_constraintSemantic_2_0= ruleChoosenSignature
            {
             
            	        newCompositeNode(grammarAccess.getConstraintListAccess().getConstraintSemanticChoosenSignatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleChoosenSignature_in_ruleConstraintList1655);
            lv_constraintSemantic_2_0=ruleChoosenSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintListRule());
            	        }
                   		set(
                   			current, 
                   			"constraintSemantic",
                    		lv_constraintSemantic_2_0, 
                    		"ChoosenSignature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConstraintList1667); 

                	newLeafNode(otherlv_3, grammarAccess.getConstraintListAccess().getLeftCurlyBracketKeyword_3());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:749:1: ( ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:749:2: ( (lv_constraints_4_0= ruleConstraint ) ) (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )*
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:749:2: ( (lv_constraints_4_0= ruleConstraint ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:750:1: (lv_constraints_4_0= ruleConstraint )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:750:1: (lv_constraints_4_0= ruleConstraint )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:751:3: lv_constraints_4_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintListAccess().getConstraintsConstraintParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraint_in_ruleConstraintList1689);
                    lv_constraints_4_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintListRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_4_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:767:2: (otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:767:4: otherlv_5= ',' ( (lv_constraints_6_0= ruleConstraint ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleConstraintList1702); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getConstraintListAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:771:1: ( (lv_constraints_6_0= ruleConstraint ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:772:1: (lv_constraints_6_0= ruleConstraint )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:772:1: (lv_constraints_6_0= ruleConstraint )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:773:3: lv_constraints_6_0= ruleConstraint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstraintListAccess().getConstraintsConstraintParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstraint_in_ruleConstraintList1723);
                    	    lv_constraints_6_0=ruleConstraint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstraintListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constraints",
                    	            		lv_constraints_6_0, 
                    	            		"Constraint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleConstraintList1739); 

                	newLeafNode(otherlv_7, grammarAccess.getConstraintListAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleConstraintList"


    // $ANTLR start "entryRuleChoosenSpecification"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:801:1: entryRuleChoosenSpecification returns [EObject current=null] : iv_ruleChoosenSpecification= ruleChoosenSpecification EOF ;
    public final EObject entryRuleChoosenSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoosenSpecification = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:802:2: (iv_ruleChoosenSpecification= ruleChoosenSpecification EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:803:2: iv_ruleChoosenSpecification= ruleChoosenSpecification EOF
            {
             newCompositeNode(grammarAccess.getChoosenSpecificationRule()); 
            pushFollow(FOLLOW_ruleChoosenSpecification_in_entryRuleChoosenSpecification1775);
            iv_ruleChoosenSpecification=ruleChoosenSpecification();

            state._fsp--;

             current =iv_ruleChoosenSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoosenSpecification1785); 

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
    // $ANTLR end "entryRuleChoosenSpecification"


    // $ANTLR start "ruleChoosenSpecification"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:810:1: ruleChoosenSpecification returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleChoosenSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_versionName_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:813:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:814:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:814:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:814:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:814:2: ( (lv_id_0_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:815:1: (lv_id_0_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:815:1: (lv_id_0_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:816:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoosenSpecification1827); 

            			newLeafNode(lv_id_0_0, grammarAccess.getChoosenSpecificationAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoosenSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleChoosenSpecification1844); 

                	newLeafNode(otherlv_1, grammarAccess.getChoosenSpecificationAccess().getVersionKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:836:1: ( (lv_versionName_2_0= RULE_STRING ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:837:1: (lv_versionName_2_0= RULE_STRING )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:837:1: (lv_versionName_2_0= RULE_STRING )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:838:3: lv_versionName_2_0= RULE_STRING
            {
            lv_versionName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoosenSpecification1861); 

            			newLeafNode(lv_versionName_2_0, grammarAccess.getChoosenSpecificationAccess().getVersionNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoosenSpecificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"versionName",
                    		lv_versionName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleChoosenSpecification1878); 

                	newLeafNode(otherlv_3, grammarAccess.getChoosenSpecificationAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleChoosenSpecification"


    // $ANTLR start "entryRuleVersion"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:866:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:867:2: (iv_ruleVersion= ruleVersion EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:868:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_ruleVersion_in_entryRuleVersion1914);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVersion1924); 

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:875:1: ruleVersion returns [EObject current=null] : (otherlv_0= '<version=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_nextNumber_5_0= RULE_INT ) ) otherlv_6= '>' ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_number_3_0=null;
        Token otherlv_4=null;
        Token lv_nextNumber_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:878:28: ( (otherlv_0= '<version=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_nextNumber_5_0= RULE_INT ) ) otherlv_6= '>' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:879:1: (otherlv_0= '<version=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_nextNumber_5_0= RULE_INT ) ) otherlv_6= '>' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:879:1: (otherlv_0= '<version=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_nextNumber_5_0= RULE_INT ) ) otherlv_6= '>' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:879:3: otherlv_0= '<version=' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_number_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_nextNumber_5_0= RULE_INT ) ) otherlv_6= '>'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleVersion1961); 

                	newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:883:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:884:1: (lv_name_1_0= RULE_STRING )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:884:1: (lv_name_1_0= RULE_STRING )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:885:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVersion1978); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVersionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleVersion1995); 

                	newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getCommaKeyword_2());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:905:1: ( (lv_number_3_0= RULE_INT ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:906:1: (lv_number_3_0= RULE_INT )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:906:1: (lv_number_3_0= RULE_INT )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:907:3: lv_number_3_0= RULE_INT
            {
            lv_number_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2012); 

            			newLeafNode(lv_number_3_0, grammarAccess.getVersionAccess().getNumberINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleVersion2029); 

                	newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getCommaKeyword_4());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:927:1: ( (lv_nextNumber_5_0= RULE_INT ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:928:1: (lv_nextNumber_5_0= RULE_INT )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:928:1: (lv_nextNumber_5_0= RULE_INT )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:929:3: lv_nextNumber_5_0= RULE_INT
            {
            lv_nextNumber_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVersion2046); 

            			newLeafNode(lv_nextNumber_5_0, grammarAccess.getVersionAccess().getNextNumberINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nextNumber",
                    		lv_nextNumber_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleVersion2063); 

                	newLeafNode(otherlv_6, grammarAccess.getVersionAccess().getGreaterThanSignKeyword_6());
                

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleChoosenSignature"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:957:1: entryRuleChoosenSignature returns [EObject current=null] : iv_ruleChoosenSignature= ruleChoosenSignature EOF ;
    public final EObject entryRuleChoosenSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoosenSignature = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:958:2: (iv_ruleChoosenSignature= ruleChoosenSignature EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:959:2: iv_ruleChoosenSignature= ruleChoosenSignature EOF
            {
             newCompositeNode(grammarAccess.getChoosenSignatureRule()); 
            pushFollow(FOLLOW_ruleChoosenSignature_in_entryRuleChoosenSignature2099);
            iv_ruleChoosenSignature=ruleChoosenSignature();

            state._fsp--;

             current =iv_ruleChoosenSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoosenSignature2109); 

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
    // $ANTLR end "entryRuleChoosenSignature"


    // $ANTLR start "ruleChoosenSignature"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:966:1: ruleChoosenSignature returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' ) ;
    public final EObject ruleChoosenSignature() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token lv_versionName_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:969:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:970:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:970:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:970:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '<version=' ( (lv_versionName_2_0= RULE_STRING ) ) otherlv_3= '>'
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:970:2: ( (lv_id_0_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:971:1: (lv_id_0_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:971:1: (lv_id_0_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:972:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoosenSignature2151); 

            			newLeafNode(lv_id_0_0, grammarAccess.getChoosenSignatureAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoosenSignatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleChoosenSignature2168); 

                	newLeafNode(otherlv_1, grammarAccess.getChoosenSignatureAccess().getVersionKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:992:1: ( (lv_versionName_2_0= RULE_STRING ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:993:1: (lv_versionName_2_0= RULE_STRING )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:993:1: (lv_versionName_2_0= RULE_STRING )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:994:3: lv_versionName_2_0= RULE_STRING
            {
            lv_versionName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoosenSignature2185); 

            			newLeafNode(lv_versionName_2_0, grammarAccess.getChoosenSignatureAccess().getVersionNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoosenSignatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"versionName",
                    		lv_versionName_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleChoosenSignature2202); 

                	newLeafNode(otherlv_3, grammarAccess.getChoosenSignatureAccess().getGreaterThanSignKeyword_3());
                

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
    // $ANTLR end "ruleChoosenSignature"


    // $ANTLR start "entryRuleConstraint"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1022:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1023:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1024:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_ruleConstraint_in_entryRuleConstraint2238);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraint2248); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1031:1: ruleConstraint returns [EObject current=null] : ( ( (lv_type_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_parameter_2_0=null;
        Token otherlv_3=null;
        Token lv_parameter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_type_0_0 = null;

        EObject lv_arity_d_7_1 = null;

        EObject lv_arity_d_7_2 = null;

        EObject lv_arity_d_9_1 = null;

        EObject lv_arity_d_9_2 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1034:28: ( ( ( (lv_type_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1035:1: ( ( (lv_type_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1035:1: ( ( (lv_type_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1035:2: ( (lv_type_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}'
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1035:2: ( (lv_type_0_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1036:1: (lv_type_0_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1036:1: (lv_type_0_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1037:3: lv_type_0_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getTypeDpfIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleConstraint2294);
            lv_type_0_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleConstraint2306); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1057:1: ( ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1057:2: ( (lv_parameter_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )*
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1057:2: ( (lv_parameter_2_0= RULE_STRING ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1058:1: (lv_parameter_2_0= RULE_STRING )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1058:1: (lv_parameter_2_0= RULE_STRING )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1059:3: lv_parameter_2_0= RULE_STRING
                    {
                    lv_parameter_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint2324); 

                    			newLeafNode(lv_parameter_2_0, grammarAccess.getConstraintAccess().getParameterSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameter",
                            		lv_parameter_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1075:2: (otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==13) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1075:4: otherlv_3= ',' ( (lv_parameter_4_0= RULE_STRING ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleConstraint2342); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1079:1: ( (lv_parameter_4_0= RULE_STRING ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1080:1: (lv_parameter_4_0= RULE_STRING )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1080:1: (lv_parameter_4_0= RULE_STRING )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1081:3: lv_parameter_4_0= RULE_STRING
                    	    {
                    	    lv_parameter_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstraint2359); 

                    	    			newLeafNode(lv_parameter_4_0, grammarAccess.getConstraintAccess().getParameterSTRINGTerminalRuleCall_2_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConstraintRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameter",
                    	            		lv_parameter_4_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleConstraint2380); 

                	newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleConstraint2392); 

                	newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_4());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1105:1: ( ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )* )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1105:2: ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )*
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1105:2: ( ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1106:1: ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1106:1: ( (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1107:1: (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1107:1: (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1108:3: lv_arity_d_7_1= ruleArrow
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getArity_dArrowParserRuleCall_5_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrow_in_ruleConstraint2416);
                    lv_arity_d_7_1=ruleArrow();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	        }
                           		add(
                           			current, 
                           			"arity_d",
                            		lv_arity_d_7_1, 
                            		"Arrow");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1123:8: lv_arity_d_7_2= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstraintAccess().getArity_dNodeSimpleParserRuleCall_5_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleConstraint2435);
                    lv_arity_d_7_2=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstraintRule());
                    	        }
                           		add(
                           			current, 
                           			"arity_d",
                            		lv_arity_d_7_2, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1141:2: (otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1141:4: otherlv_8= ',' ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleConstraint2451); 

            	        	newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getCommaKeyword_5_1_0());
            	        
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1145:1: ( ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1146:1: ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1146:1: ( (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1147:1: (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1147:1: (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple )
            	    int alt14=2;
            	    alt14 = dfa14.predict(input);
            	    switch (alt14) {
            	        case 1 :
            	            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1148:3: lv_arity_d_9_1= ruleArrow
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getConstraintAccess().getArity_dArrowParserRuleCall_5_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleArrow_in_ruleConstraint2474);
            	            lv_arity_d_9_1=ruleArrow();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"arity_d",
            	                    		lv_arity_d_9_1, 
            	                    		"Arrow");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1163:8: lv_arity_d_9_2= ruleNodeSimple
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getConstraintAccess().getArity_dNodeSimpleParserRuleCall_5_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNodeSimple_in_ruleConstraint2493);
            	            lv_arity_d_9_2=ruleNodeSimple();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"arity_d",
            	                    		lv_arity_d_9_2, 
            	                    		"NodeSimple");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleConstraint2511); 

                	newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleSignature"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1193:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1194:2: (iv_ruleSignature= ruleSignature EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1195:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_ruleSignature_in_entryRuleSignature2547);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignature2557); 

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1202:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Signature' ( (lv_version_1_0= ruleVersion ) ) (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )? otherlv_5= '{' ( (lv_validators_6_0= ruleValidator ) ) (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_version_1_0 = null;

        Enumerator lv_input_3_0 = null;

        EObject lv_validators_6_0 = null;

        EObject lv_validators_8_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1205:28: ( (otherlv_0= 'Signature' ( (lv_version_1_0= ruleVersion ) ) (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )? otherlv_5= '{' ( (lv_validators_6_0= ruleValidator ) ) (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )* otherlv_9= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1206:1: (otherlv_0= 'Signature' ( (lv_version_1_0= ruleVersion ) ) (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )? otherlv_5= '{' ( (lv_validators_6_0= ruleValidator ) ) (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )* otherlv_9= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1206:1: (otherlv_0= 'Signature' ( (lv_version_1_0= ruleVersion ) ) (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )? otherlv_5= '{' ( (lv_validators_6_0= ruleValidator ) ) (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )* otherlv_9= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1206:3: otherlv_0= 'Signature' ( (lv_version_1_0= ruleVersion ) ) (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )? otherlv_5= '{' ( (lv_validators_6_0= ruleValidator ) ) (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSignature2594); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1210:1: ( (lv_version_1_0= ruleVersion ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1211:1: (lv_version_1_0= ruleVersion )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1211:1: (lv_version_1_0= ruleVersion )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1212:3: lv_version_1_0= ruleVersion
            {
             
            	        newCompositeNode(grammarAccess.getSignatureAccess().getVersionVersionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVersion_in_ruleSignature2615);
            lv_version_1_0=ruleVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_1_0, 
                    		"Version");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1228:2: (otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1228:4: otherlv_2= '<' ( (lv_input_3_0= ruleConstraintLanguage ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSignature2628); 

                        	newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getLessThanSignKeyword_2_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1232:1: ( (lv_input_3_0= ruleConstraintLanguage ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1233:1: (lv_input_3_0= ruleConstraintLanguage )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1233:1: (lv_input_3_0= ruleConstraintLanguage )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1234:3: lv_input_3_0= ruleConstraintLanguage
                    {
                     
                    	        newCompositeNode(grammarAccess.getSignatureAccess().getInputConstraintLanguageEnumRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstraintLanguage_in_ruleSignature2649);
                    lv_input_3_0=ruleConstraintLanguage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	        }
                           		set(
                           			current, 
                           			"input",
                            		lv_input_3_0, 
                            		"ConstraintLanguage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleSignature2661); 

                        	newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleSignature2675); 

                	newLeafNode(otherlv_5, grammarAccess.getSignatureAccess().getLeftCurlyBracketKeyword_3());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1258:1: ( (lv_validators_6_0= ruleValidator ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1259:1: (lv_validators_6_0= ruleValidator )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1259:1: (lv_validators_6_0= ruleValidator )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1260:3: lv_validators_6_0= ruleValidator
            {
             
            	        newCompositeNode(grammarAccess.getSignatureAccess().getValidatorsValidatorParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValidator_in_ruleSignature2696);
            lv_validators_6_0=ruleValidator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	        }
                   		add(
                   			current, 
                   			"validators",
                    		lv_validators_6_0, 
                    		"Validator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1276:2: (otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1276:4: otherlv_7= ',' ( (lv_validators_8_0= ruleValidator ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleSignature2709); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getCommaKeyword_5_0());
            	        
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1280:1: ( (lv_validators_8_0= ruleValidator ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1281:1: (lv_validators_8_0= ruleValidator )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1281:1: (lv_validators_8_0= ruleValidator )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1282:3: lv_validators_8_0= ruleValidator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSignatureAccess().getValidatorsValidatorParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValidator_in_ruleSignature2730);
            	    lv_validators_8_0=ruleValidator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"validators",
            	            		lv_validators_8_0, 
            	            		"Validator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleSignature2744); 

                	newLeafNode(otherlv_9, grammarAccess.getSignatureAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleValidator"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1310:1: entryRuleValidator returns [EObject current=null] : iv_ruleValidator= ruleValidator EOF ;
    public final EObject entryRuleValidator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidator = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1311:2: (iv_ruleValidator= ruleValidator EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1312:2: iv_ruleValidator= ruleValidator EOF
            {
             newCompositeNode(grammarAccess.getValidatorRule()); 
            pushFollow(FOLLOW_ruleValidator_in_entryRuleValidator2780);
            iv_ruleValidator=ruleValidator();

            state._fsp--;

             current =iv_ruleValidator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidator2790); 

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
    // $ANTLR end "entryRuleValidator"


    // $ANTLR start "ruleValidator"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1319:1: ruleValidator returns [EObject current=null] : ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' otherlv_11= '=' ( (lv_ocl_12_0= RULE_STRING ) ) otherlv_13= 'errorMsg=' ( (lv_errorMsg_14_0= RULE_STRING ) ) ) ;
    public final EObject ruleValidator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_parameter_vars_2_0=null;
        Token otherlv_3=null;
        Token lv_parameter_vars_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_ocl_12_0=null;
        Token otherlv_13=null;
        Token lv_errorMsg_14_0=null;
        EObject lv_id_0_0 = null;

        EObject lv_arity_7_1 = null;

        EObject lv_arity_7_2 = null;

        EObject lv_arity_9_1 = null;

        EObject lv_arity_9_2 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1322:28: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' otherlv_11= '=' ( (lv_ocl_12_0= RULE_STRING ) ) otherlv_13= 'errorMsg=' ( (lv_errorMsg_14_0= RULE_STRING ) ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1323:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' otherlv_11= '=' ( (lv_ocl_12_0= RULE_STRING ) ) otherlv_13= 'errorMsg=' ( (lv_errorMsg_14_0= RULE_STRING ) ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1323:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' otherlv_11= '=' ( (lv_ocl_12_0= RULE_STRING ) ) otherlv_13= 'errorMsg=' ( (lv_errorMsg_14_0= RULE_STRING ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1323:2: ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= '(' ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )? otherlv_5= ')' otherlv_6= '{' ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* ) otherlv_10= '}' otherlv_11= '=' ( (lv_ocl_12_0= RULE_STRING ) ) otherlv_13= 'errorMsg=' ( (lv_errorMsg_14_0= RULE_STRING ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1323:2: ( (lv_id_0_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1324:1: (lv_id_0_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1324:1: (lv_id_0_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1325:3: lv_id_0_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getValidatorAccess().getIdDpfIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleValidator2836);
            lv_id_0_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidatorRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleValidator2848); 

                	newLeafNode(otherlv_1, grammarAccess.getValidatorAccess().getLeftParenthesisKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1345:1: ( ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1345:2: ( (lv_parameter_vars_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )*
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1345:2: ( (lv_parameter_vars_2_0= RULE_ID ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1346:1: (lv_parameter_vars_2_0= RULE_ID )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1346:1: (lv_parameter_vars_2_0= RULE_ID )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1347:3: lv_parameter_vars_2_0= RULE_ID
                    {
                    lv_parameter_vars_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidator2866); 

                    			newLeafNode(lv_parameter_vars_2_0, grammarAccess.getValidatorAccess().getParameter_varsIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidatorRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameter_vars",
                            		lv_parameter_vars_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1363:2: (otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==13) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1363:4: otherlv_3= ',' ( (lv_parameter_vars_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleValidator2884); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getValidatorAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1367:1: ( (lv_parameter_vars_4_0= RULE_ID ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1368:1: (lv_parameter_vars_4_0= RULE_ID )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1368:1: (lv_parameter_vars_4_0= RULE_ID )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1369:3: lv_parameter_vars_4_0= RULE_ID
                    	    {
                    	    lv_parameter_vars_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidator2901); 

                    	    			newLeafNode(lv_parameter_vars_4_0, grammarAccess.getValidatorAccess().getParameter_varsIDTerminalRuleCall_2_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getValidatorRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameter_vars",
                    	            		lv_parameter_vars_4_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleValidator2922); 

                	newLeafNode(otherlv_5, grammarAccess.getValidatorAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleValidator2934); 

                	newLeafNode(otherlv_6, grammarAccess.getValidatorAccess().getLeftCurlyBracketKeyword_4());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1393:1: ( ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )* )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1393:2: ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) ) (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )*
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1393:2: ( ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1394:1: ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1394:1: ( (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1395:1: (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1395:1: (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1396:3: lv_arity_7_1= ruleArrow
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidatorAccess().getArityArrowParserRuleCall_5_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrow_in_ruleValidator2958);
                    lv_arity_7_1=ruleArrow();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidatorRule());
                    	        }
                           		add(
                           			current, 
                           			"arity",
                            		lv_arity_7_1, 
                            		"Arrow");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1411:8: lv_arity_7_2= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getValidatorAccess().getArityNodeSimpleParserRuleCall_5_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleValidator2977);
                    lv_arity_7_2=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValidatorRule());
                    	        }
                           		add(
                           			current, 
                           			"arity",
                            		lv_arity_7_2, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1429:2: (otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1429:4: otherlv_8= ',' ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleValidator2993); 

            	        	newLeafNode(otherlv_8, grammarAccess.getValidatorAccess().getCommaKeyword_5_1_0());
            	        
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1433:1: ( ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1434:1: ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1434:1: ( (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1435:1: (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1435:1: (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple )
            	    int alt21=2;
            	    alt21 = dfa21.predict(input);
            	    switch (alt21) {
            	        case 1 :
            	            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1436:3: lv_arity_9_1= ruleArrow
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidatorAccess().getArityArrowParserRuleCall_5_1_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleArrow_in_ruleValidator3016);
            	            lv_arity_9_1=ruleArrow();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getValidatorRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"arity",
            	                    		lv_arity_9_1, 
            	                    		"Arrow");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1451:8: lv_arity_9_2= ruleNodeSimple
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getValidatorAccess().getArityNodeSimpleParserRuleCall_5_1_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNodeSimple_in_ruleValidator3035);
            	            lv_arity_9_2=ruleNodeSimple();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getValidatorRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"arity",
            	                    		lv_arity_9_2, 
            	                    		"NodeSimple");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleValidator3053); 

                	newLeafNode(otherlv_10, grammarAccess.getValidatorAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_11=(Token)match(input,31,FOLLOW_31_in_ruleValidator3065); 

                	newLeafNode(otherlv_11, grammarAccess.getValidatorAccess().getEqualsSignKeyword_7());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1477:1: ( (lv_ocl_12_0= RULE_STRING ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1478:1: (lv_ocl_12_0= RULE_STRING )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1478:1: (lv_ocl_12_0= RULE_STRING )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1479:3: lv_ocl_12_0= RULE_STRING
            {
            lv_ocl_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValidator3082); 

            			newLeafNode(lv_ocl_12_0, grammarAccess.getValidatorAccess().getOclSTRINGTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValidatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ocl",
                    		lv_ocl_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,32,FOLLOW_32_in_ruleValidator3099); 

                	newLeafNode(otherlv_13, grammarAccess.getValidatorAccess().getErrorMsgKeyword_9());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1499:1: ( (lv_errorMsg_14_0= RULE_STRING ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1500:1: (lv_errorMsg_14_0= RULE_STRING )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1500:1: (lv_errorMsg_14_0= RULE_STRING )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1501:3: lv_errorMsg_14_0= RULE_STRING
            {
            lv_errorMsg_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValidator3116); 

            			newLeafNode(lv_errorMsg_14_0, grammarAccess.getValidatorAccess().getErrorMsgSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValidatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"errorMsg",
                    		lv_errorMsg_14_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleValidator"


    // $ANTLR start "entryRuleGraph"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1525:1: entryRuleGraph returns [EObject current=null] : iv_ruleGraph= ruleGraph EOF ;
    public final EObject entryRuleGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGraph = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1526:2: (iv_ruleGraph= ruleGraph EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1527:2: iv_ruleGraph= ruleGraph EOF
            {
             newCompositeNode(grammarAccess.getGraphRule()); 
            pushFollow(FOLLOW_ruleGraph_in_entryRuleGraph3157);
            iv_ruleGraph=ruleGraph();

            state._fsp--;

             current =iv_ruleGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGraph3167); 

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
    // $ANTLR end "entryRuleGraph"


    // $ANTLR start "ruleGraph"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1534:1: ruleGraph returns [EObject current=null] : (otherlv_0= 'Graph' otherlv_1= '{' ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1537:28: ( (otherlv_0= 'Graph' otherlv_1= '{' ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )? otherlv_5= '}' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1538:1: (otherlv_0= 'Graph' otherlv_1= '{' ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )? otherlv_5= '}' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1538:1: (otherlv_0= 'Graph' otherlv_1= '{' ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )? otherlv_5= '}' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1538:3: otherlv_0= 'Graph' otherlv_1= '{' ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleGraph3204); 

                	newLeafNode(otherlv_0, grammarAccess.getGraphAccess().getGraphKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleGraph3216); 

                	newLeafNode(otherlv_1, grammarAccess.getGraphAccess().getLeftCurlyBracketKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1546:1: ( ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1546:2: ( (lv_elements_2_0= ruleElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )*
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1546:2: ( (lv_elements_2_0= ruleElement ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1547:1: (lv_elements_2_0= ruleElement )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1547:1: (lv_elements_2_0= ruleElement )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1548:3: lv_elements_2_0= ruleElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getGraphAccess().getElementsElementParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElement_in_ruleGraph3238);
                    lv_elements_2_0=ruleElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGraphRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_2_0, 
                            		"Element");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1564:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==13) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1564:4: otherlv_3= ',' ( (lv_elements_4_0= ruleElement ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleGraph3251); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getGraphAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1568:1: ( (lv_elements_4_0= ruleElement ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1569:1: (lv_elements_4_0= ruleElement )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1569:1: (lv_elements_4_0= ruleElement )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1570:3: lv_elements_4_0= ruleElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGraphAccess().getElementsElementParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleElement_in_ruleGraph3272);
                    	    lv_elements_4_0=ruleElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGraphRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_4_0, 
                    	            		"Element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleGraph3288); 

                	newLeafNode(otherlv_5, grammarAccess.getGraphAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleGraph"


    // $ANTLR start "entryRuleElement"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1598:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1599:2: (iv_ruleElement= ruleElement EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1600:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement3324);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement3334); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1607:1: ruleElement returns [EObject current=null] : (this_Node_0= ruleNode | this_Arrow_1= ruleArrow ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_Arrow_1 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1610:28: ( (this_Node_0= ruleNode | this_Arrow_1= ruleArrow ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1611:1: (this_Node_0= ruleNode | this_Arrow_1= ruleArrow )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1611:1: (this_Node_0= ruleNode | this_Arrow_1= ruleArrow )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1612:5: this_Node_0= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleElement3381);
                    this_Node_0=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1622:5: this_Arrow_1= ruleArrow
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getArrowParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrow_in_ruleElement3408);
                    this_Arrow_1=ruleArrow();

                    state._fsp--;

                     
                            current = this_Arrow_1; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleArrow"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1638:1: entryRuleArrow returns [EObject current=null] : iv_ruleArrow= ruleArrow EOF ;
    public final EObject entryRuleArrow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrow = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1639:2: (iv_ruleArrow= ruleArrow EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1640:2: iv_ruleArrow= ruleArrow EOF
            {
             newCompositeNode(grammarAccess.getArrowRule()); 
            pushFollow(FOLLOW_ruleArrow_in_entryRuleArrow3443);
            iv_ruleArrow=ruleArrow();

            state._fsp--;

             current =iv_ruleArrow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrow3453); 

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
    // $ANTLR end "entryRuleArrow"


    // $ANTLR start "ruleArrow"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1647:1: ruleArrow returns [EObject current=null] : ( ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) ) | ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) ) | ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) ) | ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) ) ) ;
    public final EObject ruleArrow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_sr_0_0 = null;

        EObject lv_id_2_0 = null;

        Enumerator lv_tgDataType_4_0 = null;

        EObject lv_sr_5_0 = null;

        EObject lv_id_7_0 = null;

        EObject lv_type_9_0 = null;

        EObject lv_tgValue_11_0 = null;

        EObject lv_sr_12_0 = null;

        EObject lv_id_14_0 = null;

        EObject lv_type_16_0 = null;

        EObject lv_tgNode_18_0 = null;

        EObject lv_sr_19_0 = null;

        EObject lv_tgNode_21_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1650:28: ( ( ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) ) | ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) ) | ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) ) | ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:1: ( ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) ) | ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) ) | ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) ) | ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:1: ( ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) ) | ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) ) | ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) ) | ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) ) )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:2: ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:2: ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:3: ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1651:3: ( (lv_sr_0_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1652:1: (lv_sr_0_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1652:1: (lv_sr_0_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1653:3: lv_sr_0_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getSrNodeSimpleParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3500);
                    lv_sr_0_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"sr",
                            		lv_sr_0_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleArrow3512); 

                        	newLeafNode(otherlv_1, grammarAccess.getArrowAccess().getHyphenMinusKeyword_0_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1673:1: ( (lv_id_2_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1674:1: (lv_id_2_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1674:1: (lv_id_2_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1675:3: lv_id_2_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getIdDpfIdParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleArrow3533);
                    lv_id_2_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleArrow3545); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrowAccess().getColonAsteriskHyphenMinusGreaterThanSignKeyword_0_3());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1695:1: ( (lv_tgDataType_4_0= ruleDataType ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1696:1: (lv_tgDataType_4_0= ruleDataType )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1696:1: (lv_tgDataType_4_0= ruleDataType )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1697:3: lv_tgDataType_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTgDataTypeDataTypeEnumRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleArrow3566);
                    lv_tgDataType_4_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"tgDataType",
                            		lv_tgDataType_4_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1714:6: ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1714:6: ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1714:7: ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1714:7: ( (lv_sr_5_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1715:1: (lv_sr_5_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1715:1: (lv_sr_5_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1716:3: lv_sr_5_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getSrNodeSimpleParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3595);
                    lv_sr_5_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"sr",
                            		lv_sr_5_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleArrow3607); 

                        	newLeafNode(otherlv_6, grammarAccess.getArrowAccess().getHyphenMinusKeyword_1_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1736:1: ( (lv_id_7_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1737:1: (lv_id_7_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1737:1: (lv_id_7_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1738:3: lv_id_7_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getIdDpfIdParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleArrow3628);
                    lv_id_7_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_7_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleArrow3640); 

                        	newLeafNode(otherlv_8, grammarAccess.getArrowAccess().getColonKeyword_1_3());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1758:1: ( (lv_type_9_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1759:1: (lv_type_9_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1759:1: (lv_type_9_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1760:3: lv_type_9_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTypeDpfIdParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleArrow3661);
                    lv_type_9_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_9_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleArrow3673); 

                        	newLeafNode(otherlv_10, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_1_5());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1780:1: ( (lv_tgValue_11_0= ruleAttributeValue ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1781:1: (lv_tgValue_11_0= ruleAttributeValue )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1781:1: (lv_tgValue_11_0= ruleAttributeValue )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1782:3: lv_tgValue_11_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTgValueAttributeValueParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleArrow3694);
                    lv_tgValue_11_0=ruleAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"tgValue",
                            		lv_tgValue_11_0, 
                            		"AttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1799:6: ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1799:6: ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1799:7: ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1799:7: ( (lv_sr_12_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1800:1: (lv_sr_12_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1800:1: (lv_sr_12_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1801:3: lv_sr_12_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getSrNodeSimpleParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3723);
                    lv_sr_12_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"sr",
                            		lv_sr_12_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,34,FOLLOW_34_in_ruleArrow3735); 

                        	newLeafNode(otherlv_13, grammarAccess.getArrowAccess().getHyphenMinusKeyword_2_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1821:1: ( (lv_id_14_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1822:1: (lv_id_14_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1822:1: (lv_id_14_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1823:3: lv_id_14_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getIdDpfIdParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleArrow3756);
                    lv_id_14_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_14_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleArrow3768); 

                        	newLeafNode(otherlv_15, grammarAccess.getArrowAccess().getColonKeyword_2_3());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1843:1: ( (lv_type_16_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1844:1: (lv_type_16_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1844:1: (lv_type_16_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1845:3: lv_type_16_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTypeDpfIdParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleArrow3789);
                    lv_type_16_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_16_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,36,FOLLOW_36_in_ruleArrow3801); 

                        	newLeafNode(otherlv_17, grammarAccess.getArrowAccess().getHyphenMinusGreaterThanSignKeyword_2_5());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1865:1: ( (lv_tgNode_18_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1866:1: (lv_tgNode_18_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1866:1: (lv_tgNode_18_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1867:3: lv_tgNode_18_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTgNodeNodeSimpleParserRuleCall_2_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3822);
                    lv_tgNode_18_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"tgNode",
                            		lv_tgNode_18_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1884:6: ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1884:6: ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1884:7: ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1884:7: ( (lv_sr_19_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1885:1: (lv_sr_19_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1885:1: (lv_sr_19_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1886:3: lv_sr_19_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getSrNodeSimpleParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3851);
                    lv_sr_19_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"sr",
                            		lv_sr_19_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_20=(Token)match(input,37,FOLLOW_37_in_ruleArrow3863); 

                        	newLeafNode(otherlv_20, grammarAccess.getArrowAccess().getHyphenMinusVerticalLineGreaterThanSignKeyword_3_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1906:1: ( (lv_tgNode_21_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1907:1: (lv_tgNode_21_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1907:1: (lv_tgNode_21_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1908:3: lv_tgNode_21_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrowAccess().getTgNodeNodeSimpleParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleArrow3884);
                    lv_tgNode_21_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrowRule());
                    	        }
                           		set(
                           			current, 
                           			"tgNode",
                            		lv_tgNode_21_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleArrow"


    // $ANTLR start "entryRuleNode"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1932:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1933:2: (iv_ruleNode= ruleNode EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1934:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode3921);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode3931); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1941:1: ruleNode returns [EObject current=null] : ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )? (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_id_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_inh_4_0 = null;

        EObject lv_inh_6_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1944:28: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )? (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )? ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1945:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )? (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )? )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1945:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )? (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )? )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1945:2: ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )? (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )?
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1945:2: ( (lv_id_0_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1946:1: (lv_id_0_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1946:1: (lv_id_0_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1947:3: lv_id_0_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getIdDpfIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleNode3977);
            lv_id_0_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNode3989); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getColonKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1967:1: ( (lv_type_2_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1968:1: (lv_type_2_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1968:1: (lv_type_2_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1969:3: lv_type_2_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getNodeAccess().getTypeDpfIdParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleNode4010);
            lv_type_2_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1985:2: (otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1985:4: otherlv_3= 'extends' ( (lv_inh_4_0= ruleNodeSimple ) ) (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleNode4023); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getExtendsKeyword_3_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1989:1: ( (lv_inh_4_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1990:1: (lv_inh_4_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1990:1: (lv_inh_4_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:1991:3: lv_inh_4_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeAccess().getInhNodeSimpleParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleNode4044);
                    lv_inh_4_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	        }
                           		add(
                           			current, 
                           			"inh",
                            		lv_inh_4_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2007:2: (otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==39) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2007:4: otherlv_5= 'and' ( (lv_inh_6_0= ruleNodeSimple ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleNode4057); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getAndKeyword_3_2_0());
                    	        
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2011:1: ( (lv_inh_6_0= ruleNodeSimple ) )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2012:1: (lv_inh_6_0= ruleNodeSimple )
                    	    {
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2012:1: (lv_inh_6_0= ruleNodeSimple )
                    	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2013:3: lv_inh_6_0= ruleNodeSimple
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeAccess().getInhNodeSimpleParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleNodeSimple_in_ruleNode4078);
                    	    lv_inh_6_0=ruleNodeSimple();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inh",
                    	            		lv_inh_6_0, 
                    	            		"NodeSimple");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2029:6: (otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2029:8: otherlv_7= '{' ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )? otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleNode4095); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2033:1: ( ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )* )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2033:2: ( (lv_properties_8_0= ruleProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                            {
                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2033:2: ( (lv_properties_8_0= ruleProperty ) )
                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2034:1: (lv_properties_8_0= ruleProperty )
                            {
                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2034:1: (lv_properties_8_0= ruleProperty )
                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2035:3: lv_properties_8_0= ruleProperty
                            {
                             
                            	        newCompositeNode(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleProperty_in_ruleNode4117);
                            lv_properties_8_0=ruleProperty();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"properties",
                                    		lv_properties_8_0, 
                                    		"Property");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2051:2: (otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==13) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2051:4: otherlv_9= ',' ( (lv_properties_10_0= ruleProperty ) )
                            	    {
                            	    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleNode4130); 

                            	        	newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getCommaKeyword_4_1_1_0());
                            	        
                            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2055:1: ( (lv_properties_10_0= ruleProperty ) )
                            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2056:1: (lv_properties_10_0= ruleProperty )
                            	    {
                            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2056:1: (lv_properties_10_0= ruleProperty )
                            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2057:3: lv_properties_10_0= ruleProperty
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getNodeAccess().getPropertiesPropertyParserRuleCall_4_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleProperty_in_ruleNode4151);
                            	    lv_properties_10_0=ruleProperty();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"properties",
                            	            		lv_properties_10_0, 
                            	            		"Property");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleNode4167); 

                        	newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_2());
                        

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNodeSimple"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2085:1: entryRuleNodeSimple returns [EObject current=null] : iv_ruleNodeSimple= ruleNodeSimple EOF ;
    public final EObject entryRuleNodeSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSimple = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2086:2: (iv_ruleNodeSimple= ruleNodeSimple EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2087:2: iv_ruleNodeSimple= ruleNodeSimple EOF
            {
             newCompositeNode(grammarAccess.getNodeSimpleRule()); 
            pushFollow(FOLLOW_ruleNodeSimple_in_entryRuleNodeSimple4205);
            iv_ruleNodeSimple=ruleNodeSimple();

            state._fsp--;

             current =iv_ruleNodeSimple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSimple4215); 

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
    // $ANTLR end "entryRuleNodeSimple"


    // $ANTLR start "ruleNodeSimple"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2094:1: ruleNodeSimple returns [EObject current=null] : ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) ) ;
    public final EObject ruleNodeSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_id_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2097:28: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2098:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2098:1: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2098:2: ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDpfId ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2098:2: ( (lv_id_0_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2099:1: (lv_id_0_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2099:1: (lv_id_0_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2100:3: lv_id_0_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getNodeSimpleAccess().getIdDpfIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleNodeSimple4261);
            lv_id_0_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeSimpleRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleNodeSimple4273); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeSimpleAccess().getColonKeyword_1());
                
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2120:1: ( (lv_type_2_0= ruleDpfId ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2121:1: (lv_type_2_0= ruleDpfId )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2121:1: (lv_type_2_0= ruleDpfId )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2122:3: lv_type_2_0= ruleDpfId
            {
             
            	        newCompositeNode(grammarAccess.getNodeSimpleAccess().getTypeDpfIdParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDpfId_in_ruleNodeSimple4294);
            lv_type_2_0=ruleDpfId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeSimpleRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"DpfId");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNodeSimple"


    // $ANTLR start "entryRuleProperty"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2146:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2147:2: (iv_ruleProperty= ruleProperty EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2148:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty4330);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty4340); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2155:1: ruleProperty returns [EObject current=null] : ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) ) | ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) ) | ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_id_0_0 = null;

        Enumerator lv_tgDataType_2_0 = null;

        EObject lv_id_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_tgValue_7_0 = null;

        EObject lv_id_8_0 = null;

        EObject lv_type_10_0 = null;

        EObject lv_tgNode_12_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2158:28: ( ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) ) | ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) ) | ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:1: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) ) | ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) ) | ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:1: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) ) | ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) ) | ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) ) )
            int alt32=3;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:2: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:2: ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:3: ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2159:3: ( (lv_id_0_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2160:1: (lv_id_0_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2160:1: (lv_id_0_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2161:3: lv_id_0_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getIdDpfIdParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleProperty4387);
                    lv_id_0_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleProperty4399); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonAsteriskHyphenMinusGreaterThanSignKeyword_0_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2181:1: ( (lv_tgDataType_2_0= ruleDataType ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2182:1: (lv_tgDataType_2_0= ruleDataType )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2182:1: (lv_tgDataType_2_0= ruleDataType )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2183:3: lv_tgDataType_2_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTgDataTypeDataTypeEnumRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleProperty4420);
                    lv_tgDataType_2_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"tgDataType",
                            		lv_tgDataType_2_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2200:6: ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2200:6: ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2200:7: ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2200:7: ( (lv_id_3_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2201:1: (lv_id_3_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2201:1: (lv_id_3_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2202:3: lv_id_3_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getIdDpfIdParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleProperty4449);
                    lv_id_3_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProperty4461); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getColonKeyword_1_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2222:1: ( (lv_type_5_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2223:1: (lv_type_5_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2223:1: (lv_type_5_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2224:3: lv_type_5_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDpfIdParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleProperty4482);
                    lv_type_5_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleProperty4494); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1_3());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2244:1: ( (lv_tgValue_7_0= ruleAttributeValue ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2245:1: (lv_tgValue_7_0= ruleAttributeValue )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2245:1: (lv_tgValue_7_0= ruleAttributeValue )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2246:3: lv_tgValue_7_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTgValueAttributeValueParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleProperty4515);
                    lv_tgValue_7_0=ruleAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"tgValue",
                            		lv_tgValue_7_0, 
                            		"AttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2263:6: ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2263:6: ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2263:7: ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2263:7: ( (lv_id_8_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2264:1: (lv_id_8_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2264:1: (lv_id_8_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2265:3: lv_id_8_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getIdDpfIdParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleProperty4544);
                    lv_id_8_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_8_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleProperty4556); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getColonKeyword_2_1());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2285:1: ( (lv_type_10_0= ruleDpfId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2286:1: (lv_type_10_0= ruleDpfId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2286:1: (lv_type_10_0= ruleDpfId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2287:3: lv_type_10_0= ruleDpfId
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTypeDpfIdParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDpfId_in_ruleProperty4577);
                    lv_type_10_0=ruleDpfId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_10_0, 
                            		"DpfId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleProperty4589); 

                        	newLeafNode(otherlv_11, grammarAccess.getPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2_3());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2307:1: ( (lv_tgNode_12_0= ruleNodeSimple ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2308:1: (lv_tgNode_12_0= ruleNodeSimple )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2308:1: (lv_tgNode_12_0= ruleNodeSimple )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2309:3: lv_tgNode_12_0= ruleNodeSimple
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getTgNodeNodeSimpleParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeSimple_in_ruleProperty4610);
                    lv_tgNode_12_0=ruleNodeSimple();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"tgNode",
                            		lv_tgNode_12_0, 
                            		"NodeSimple");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAttributeValue"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2333:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2334:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2335:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue4647);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue4657); 

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2342:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_variableId_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_variableId_1_0=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2345:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_variableId_1_0= RULE_ID ) ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2346:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_variableId_1_0= RULE_ID ) ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2346:1: ( ( (lv_value_0_0= RULE_STRING ) ) | ( (lv_variableId_1_0= RULE_ID ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2346:2: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2346:2: ( (lv_value_0_0= RULE_STRING ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2347:1: (lv_value_0_0= RULE_STRING )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2347:1: (lv_value_0_0= RULE_STRING )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2348:3: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeValue4699); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getAttributeValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2365:6: ( (lv_variableId_1_0= RULE_ID ) )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2365:6: ( (lv_variableId_1_0= RULE_ID ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2366:1: (lv_variableId_1_0= RULE_ID )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2366:1: (lv_variableId_1_0= RULE_ID )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2367:3: lv_variableId_1_0= RULE_ID
                    {
                    lv_variableId_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeValue4727); 

                    			newLeafNode(lv_variableId_1_0, grammarAccess.getAttributeValueAccess().getVariableIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variableId",
                            		lv_variableId_1_0, 
                            		"ID");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleDpfId"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2391:1: entryRuleDpfId returns [EObject current=null] : iv_ruleDpfId= ruleDpfId EOF ;
    public final EObject entryRuleDpfId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDpfId = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2392:2: (iv_ruleDpfId= ruleDpfId EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2393:2: iv_ruleDpfId= ruleDpfId EOF
            {
             newCompositeNode(grammarAccess.getDpfIdRule()); 
            pushFollow(FOLLOW_ruleDpfId_in_entryRuleDpfId4768);
            iv_ruleDpfId=ruleDpfId();

            state._fsp--;

             current =iv_ruleDpfId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDpfId4778); 

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
    // $ANTLR end "entryRuleDpfId"


    // $ANTLR start "ruleDpfId"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2400:1: ruleDpfId returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )? ) ;
    public final EObject ruleDpfId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_id_2_0 = null;


         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2403:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )? ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2404:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )? )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2404:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )? )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2404:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )?
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2404:2: ( (lv_name_0_0= RULE_ID ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2405:1: (lv_name_0_0= RULE_ID )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2405:1: (lv_name_0_0= RULE_ID )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2406:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDpfId4820); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDpfIdAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDpfIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2422:2: (otherlv_1= '@' ( (lv_id_2_0= ruleRId ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2422:4: otherlv_1= '@' ( (lv_id_2_0= ruleRId ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleDpfId4838); 

                        	newLeafNode(otherlv_1, grammarAccess.getDpfIdAccess().getCommercialAtKeyword_1_0());
                        
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2426:1: ( (lv_id_2_0= ruleRId ) )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2427:1: (lv_id_2_0= ruleRId )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2427:1: (lv_id_2_0= ruleRId )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2428:3: lv_id_2_0= ruleRId
                    {
                     
                    	        newCompositeNode(grammarAccess.getDpfIdAccess().getIdRIdParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRId_in_ruleDpfId4859);
                    lv_id_2_0=ruleRId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDpfIdRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_2_0, 
                            		"RId");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDpfId"


    // $ANTLR start "entryRuleRId"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2452:1: entryRuleRId returns [EObject current=null] : iv_ruleRId= ruleRId EOF ;
    public final EObject entryRuleRId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRId = null;


        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2453:2: (iv_ruleRId= ruleRId EOF )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2454:2: iv_ruleRId= ruleRId EOF
            {
             newCompositeNode(grammarAccess.getRIdRule()); 
            pushFollow(FOLLOW_ruleRId_in_entryRuleRId4897);
            iv_ruleRId=ruleRId();

            state._fsp--;

             current =iv_ruleRId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRId4907); 

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
    // $ANTLR end "entryRuleRId"


    // $ANTLR start "ruleRId"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2461:1: ruleRId returns [EObject current=null] : ( ( (lv_nums_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )* ) ;
    public final EObject ruleRId() throws RecognitionException {
        EObject current = null;

        Token lv_nums_0_0=null;
        Token otherlv_1=null;
        Token lv_nums_2_0=null;

         enterRule(); 
            
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2464:28: ( ( ( (lv_nums_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )* ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2465:1: ( ( (lv_nums_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )* )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2465:1: ( ( (lv_nums_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )* )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2465:2: ( (lv_nums_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )*
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2465:2: ( (lv_nums_0_0= RULE_INT ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2466:1: (lv_nums_0_0= RULE_INT )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2466:1: (lv_nums_0_0= RULE_INT )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2467:3: lv_nums_0_0= RULE_INT
            {
            lv_nums_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRId4949); 

            			newLeafNode(lv_nums_0_0, grammarAccess.getRIdAccess().getNumsINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRIdRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"nums",
                    		lv_nums_0_0, 
                    		"INT");
            	    

            }


            }

            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2483:2: (otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==RULE_INT) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2483:4: otherlv_1= ',' ( (lv_nums_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleRId4967); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRIdAccess().getCommaKeyword_1_0());
            	        
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2487:1: ( (lv_nums_2_0= RULE_INT ) )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2488:1: (lv_nums_2_0= RULE_INT )
            	    {
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2488:1: (lv_nums_2_0= RULE_INT )
            	    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2489:3: lv_nums_2_0= RULE_INT
            	    {
            	    lv_nums_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRId4984); 

            	    			newLeafNode(lv_nums_2_0, grammarAccess.getRIdAccess().getNumsINTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRIdRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"nums",
            	            		lv_nums_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleRId"


    // $ANTLR start "ruleDataType"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2513:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Byte' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'Long' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Double' ) | (enumLiteral_8= 'String' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2515:28: ( ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Byte' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'Long' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Double' ) | (enumLiteral_8= 'String' ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2516:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Byte' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'Long' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Double' ) | (enumLiteral_8= 'String' ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2516:1: ( (enumLiteral_0= 'Boolean' ) | (enumLiteral_1= 'Char' ) | (enumLiteral_2= 'Byte' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Int' ) | (enumLiteral_5= 'Long' ) | (enumLiteral_6= 'Float' ) | (enumLiteral_7= 'Double' ) | (enumLiteral_8= 'String' ) )
            int alt36=9;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt36=1;
                }
                break;
            case 42:
                {
                alt36=2;
                }
                break;
            case 43:
                {
                alt36=3;
                }
                break;
            case 44:
                {
                alt36=4;
                }
                break;
            case 45:
                {
                alt36=5;
                }
                break;
            case 46:
                {
                alt36=6;
                }
                break;
            case 47:
                {
                alt36=7;
                }
                break;
            case 48:
                {
                alt36=8;
                }
                break;
            case 49:
                {
                alt36=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2516:2: (enumLiteral_0= 'Boolean' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2516:2: (enumLiteral_0= 'Boolean' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2516:4: enumLiteral_0= 'Boolean'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleDataType5041); 

                            current = grammarAccess.getDataTypeAccess().getTBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getTBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2522:6: (enumLiteral_1= 'Char' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2522:6: (enumLiteral_1= 'Char' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2522:8: enumLiteral_1= 'Char'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_42_in_ruleDataType5058); 

                            current = grammarAccess.getDataTypeAccess().getTCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getTCHAREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2528:6: (enumLiteral_2= 'Byte' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2528:6: (enumLiteral_2= 'Byte' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2528:8: enumLiteral_2= 'Byte'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_43_in_ruleDataType5075); 

                            current = grammarAccess.getDataTypeAccess().getTBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getTBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2534:6: (enumLiteral_3= 'Short' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2534:6: (enumLiteral_3= 'Short' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2534:8: enumLiteral_3= 'Short'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_44_in_ruleDataType5092); 

                            current = grammarAccess.getDataTypeAccess().getTSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getTSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2540:6: (enumLiteral_4= 'Int' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2540:6: (enumLiteral_4= 'Int' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2540:8: enumLiteral_4= 'Int'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_45_in_ruleDataType5109); 

                            current = grammarAccess.getDataTypeAccess().getTINTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getTINTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2546:6: (enumLiteral_5= 'Long' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2546:6: (enumLiteral_5= 'Long' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2546:8: enumLiteral_5= 'Long'
                    {
                    enumLiteral_5=(Token)match(input,46,FOLLOW_46_in_ruleDataType5126); 

                            current = grammarAccess.getDataTypeAccess().getTLONGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getTLONGEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2552:6: (enumLiteral_6= 'Float' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2552:6: (enumLiteral_6= 'Float' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2552:8: enumLiteral_6= 'Float'
                    {
                    enumLiteral_6=(Token)match(input,47,FOLLOW_47_in_ruleDataType5143); 

                            current = grammarAccess.getDataTypeAccess().getTFLOATEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getTFLOATEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2558:6: (enumLiteral_7= 'Double' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2558:6: (enumLiteral_7= 'Double' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2558:8: enumLiteral_7= 'Double'
                    {
                    enumLiteral_7=(Token)match(input,48,FOLLOW_48_in_ruleDataType5160); 

                            current = grammarAccess.getDataTypeAccess().getTDOUBLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getTDOUBLEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2564:6: (enumLiteral_8= 'String' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2564:6: (enumLiteral_8= 'String' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2564:8: enumLiteral_8= 'String'
                    {
                    enumLiteral_8=(Token)match(input,49,FOLLOW_49_in_ruleDataType5177); 

                            current = grammarAccess.getDataTypeAccess().getTSTRINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getTSTRINGEnumLiteralDeclaration_8()); 
                        

                    }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleGraphvizOutput"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2574:1: ruleGraphvizOutput returns [Enumerator current=null] : ( (enumLiteral_0= 'jpg' ) | (enumLiteral_1= 'bmp' ) | (enumLiteral_2= 'canon' ) | (enumLiteral_3= 'dot' ) | (enumLiteral_4= 'xdot' ) | (enumLiteral_5= 'cmap' ) | (enumLiteral_6= 'eps' ) | (enumLiteral_7= 'fig' ) | (enumLiteral_8= 'gd' ) | (enumLiteral_9= 'gd2' ) | (enumLiteral_10= 'gif' ) | (enumLiteral_11= 'gtk' ) | (enumLiteral_12= 'ico' ) | (enumLiteral_13= 'imap' ) | (enumLiteral_14= 'cmapx' ) | (enumLiteral_15= 'imap_np' ) | (enumLiteral_16= 'cmapx_np' ) | (enumLiteral_17= 'ismap' ) | (enumLiteral_18= 'jpeg' ) | (enumLiteral_19= 'jpe' ) | (enumLiteral_20= 'pdf' ) | (enumLiteral_21= 'plain' ) | (enumLiteral_22= 'plain-ext' ) | (enumLiteral_23= 'png' ) | (enumLiteral_24= 'ps' ) | (enumLiteral_25= 'ps2' ) | (enumLiteral_26= 'svg' ) | (enumLiteral_27= 'svgz' ) | (enumLiteral_28= 'tif' ) | (enumLiteral_29= 'tiff' ) | (enumLiteral_30= 'vml' ) | (enumLiteral_31= 'vmlz' ) | (enumLiteral_32= 'vrml' ) | (enumLiteral_33= 'wbmp' ) | (enumLiteral_34= 'webp' ) | (enumLiteral_35= 'xlib' ) ) ;
    public final Enumerator ruleGraphvizOutput() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;

         enterRule(); 
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2576:28: ( ( (enumLiteral_0= 'jpg' ) | (enumLiteral_1= 'bmp' ) | (enumLiteral_2= 'canon' ) | (enumLiteral_3= 'dot' ) | (enumLiteral_4= 'xdot' ) | (enumLiteral_5= 'cmap' ) | (enumLiteral_6= 'eps' ) | (enumLiteral_7= 'fig' ) | (enumLiteral_8= 'gd' ) | (enumLiteral_9= 'gd2' ) | (enumLiteral_10= 'gif' ) | (enumLiteral_11= 'gtk' ) | (enumLiteral_12= 'ico' ) | (enumLiteral_13= 'imap' ) | (enumLiteral_14= 'cmapx' ) | (enumLiteral_15= 'imap_np' ) | (enumLiteral_16= 'cmapx_np' ) | (enumLiteral_17= 'ismap' ) | (enumLiteral_18= 'jpeg' ) | (enumLiteral_19= 'jpe' ) | (enumLiteral_20= 'pdf' ) | (enumLiteral_21= 'plain' ) | (enumLiteral_22= 'plain-ext' ) | (enumLiteral_23= 'png' ) | (enumLiteral_24= 'ps' ) | (enumLiteral_25= 'ps2' ) | (enumLiteral_26= 'svg' ) | (enumLiteral_27= 'svgz' ) | (enumLiteral_28= 'tif' ) | (enumLiteral_29= 'tiff' ) | (enumLiteral_30= 'vml' ) | (enumLiteral_31= 'vmlz' ) | (enumLiteral_32= 'vrml' ) | (enumLiteral_33= 'wbmp' ) | (enumLiteral_34= 'webp' ) | (enumLiteral_35= 'xlib' ) ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2577:1: ( (enumLiteral_0= 'jpg' ) | (enumLiteral_1= 'bmp' ) | (enumLiteral_2= 'canon' ) | (enumLiteral_3= 'dot' ) | (enumLiteral_4= 'xdot' ) | (enumLiteral_5= 'cmap' ) | (enumLiteral_6= 'eps' ) | (enumLiteral_7= 'fig' ) | (enumLiteral_8= 'gd' ) | (enumLiteral_9= 'gd2' ) | (enumLiteral_10= 'gif' ) | (enumLiteral_11= 'gtk' ) | (enumLiteral_12= 'ico' ) | (enumLiteral_13= 'imap' ) | (enumLiteral_14= 'cmapx' ) | (enumLiteral_15= 'imap_np' ) | (enumLiteral_16= 'cmapx_np' ) | (enumLiteral_17= 'ismap' ) | (enumLiteral_18= 'jpeg' ) | (enumLiteral_19= 'jpe' ) | (enumLiteral_20= 'pdf' ) | (enumLiteral_21= 'plain' ) | (enumLiteral_22= 'plain-ext' ) | (enumLiteral_23= 'png' ) | (enumLiteral_24= 'ps' ) | (enumLiteral_25= 'ps2' ) | (enumLiteral_26= 'svg' ) | (enumLiteral_27= 'svgz' ) | (enumLiteral_28= 'tif' ) | (enumLiteral_29= 'tiff' ) | (enumLiteral_30= 'vml' ) | (enumLiteral_31= 'vmlz' ) | (enumLiteral_32= 'vrml' ) | (enumLiteral_33= 'wbmp' ) | (enumLiteral_34= 'webp' ) | (enumLiteral_35= 'xlib' ) )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2577:1: ( (enumLiteral_0= 'jpg' ) | (enumLiteral_1= 'bmp' ) | (enumLiteral_2= 'canon' ) | (enumLiteral_3= 'dot' ) | (enumLiteral_4= 'xdot' ) | (enumLiteral_5= 'cmap' ) | (enumLiteral_6= 'eps' ) | (enumLiteral_7= 'fig' ) | (enumLiteral_8= 'gd' ) | (enumLiteral_9= 'gd2' ) | (enumLiteral_10= 'gif' ) | (enumLiteral_11= 'gtk' ) | (enumLiteral_12= 'ico' ) | (enumLiteral_13= 'imap' ) | (enumLiteral_14= 'cmapx' ) | (enumLiteral_15= 'imap_np' ) | (enumLiteral_16= 'cmapx_np' ) | (enumLiteral_17= 'ismap' ) | (enumLiteral_18= 'jpeg' ) | (enumLiteral_19= 'jpe' ) | (enumLiteral_20= 'pdf' ) | (enumLiteral_21= 'plain' ) | (enumLiteral_22= 'plain-ext' ) | (enumLiteral_23= 'png' ) | (enumLiteral_24= 'ps' ) | (enumLiteral_25= 'ps2' ) | (enumLiteral_26= 'svg' ) | (enumLiteral_27= 'svgz' ) | (enumLiteral_28= 'tif' ) | (enumLiteral_29= 'tiff' ) | (enumLiteral_30= 'vml' ) | (enumLiteral_31= 'vmlz' ) | (enumLiteral_32= 'vrml' ) | (enumLiteral_33= 'wbmp' ) | (enumLiteral_34= 'webp' ) | (enumLiteral_35= 'xlib' ) )
            int alt37=36;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt37=1;
                }
                break;
            case 51:
                {
                alt37=2;
                }
                break;
            case 52:
                {
                alt37=3;
                }
                break;
            case 53:
                {
                alt37=4;
                }
                break;
            case 54:
                {
                alt37=5;
                }
                break;
            case 55:
                {
                alt37=6;
                }
                break;
            case 56:
                {
                alt37=7;
                }
                break;
            case 57:
                {
                alt37=8;
                }
                break;
            case 58:
                {
                alt37=9;
                }
                break;
            case 59:
                {
                alt37=10;
                }
                break;
            case 60:
                {
                alt37=11;
                }
                break;
            case 61:
                {
                alt37=12;
                }
                break;
            case 62:
                {
                alt37=13;
                }
                break;
            case 63:
                {
                alt37=14;
                }
                break;
            case 64:
                {
                alt37=15;
                }
                break;
            case 65:
                {
                alt37=16;
                }
                break;
            case 66:
                {
                alt37=17;
                }
                break;
            case 67:
                {
                alt37=18;
                }
                break;
            case 68:
                {
                alt37=19;
                }
                break;
            case 69:
                {
                alt37=20;
                }
                break;
            case 70:
                {
                alt37=21;
                }
                break;
            case 71:
                {
                alt37=22;
                }
                break;
            case 72:
                {
                alt37=23;
                }
                break;
            case 73:
                {
                alt37=24;
                }
                break;
            case 74:
                {
                alt37=25;
                }
                break;
            case 75:
                {
                alt37=26;
                }
                break;
            case 76:
                {
                alt37=27;
                }
                break;
            case 77:
                {
                alt37=28;
                }
                break;
            case 78:
                {
                alt37=29;
                }
                break;
            case 79:
                {
                alt37=30;
                }
                break;
            case 80:
                {
                alt37=31;
                }
                break;
            case 81:
                {
                alt37=32;
                }
                break;
            case 82:
                {
                alt37=33;
                }
                break;
            case 83:
                {
                alt37=34;
                }
                break;
            case 84:
                {
                alt37=35;
                }
                break;
            case 85:
                {
                alt37=36;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2577:2: (enumLiteral_0= 'jpg' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2577:2: (enumLiteral_0= 'jpg' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2577:4: enumLiteral_0= 'jpg'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleGraphvizOutput5222); 

                            current = grammarAccess.getGraphvizOutputAccess().getJPGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getGraphvizOutputAccess().getJPGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2583:6: (enumLiteral_1= 'bmp' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2583:6: (enumLiteral_1= 'bmp' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2583:8: enumLiteral_1= 'bmp'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleGraphvizOutput5239); 

                            current = grammarAccess.getGraphvizOutputAccess().getBMPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getGraphvizOutputAccess().getBMPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2589:6: (enumLiteral_2= 'canon' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2589:6: (enumLiteral_2= 'canon' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2589:8: enumLiteral_2= 'canon'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleGraphvizOutput5256); 

                            current = grammarAccess.getGraphvizOutputAccess().getCANONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getGraphvizOutputAccess().getCANONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2595:6: (enumLiteral_3= 'dot' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2595:6: (enumLiteral_3= 'dot' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2595:8: enumLiteral_3= 'dot'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleGraphvizOutput5273); 

                            current = grammarAccess.getGraphvizOutputAccess().getDOTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getGraphvizOutputAccess().getDOTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2601:6: (enumLiteral_4= 'xdot' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2601:6: (enumLiteral_4= 'xdot' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2601:8: enumLiteral_4= 'xdot'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_54_in_ruleGraphvizOutput5290); 

                            current = grammarAccess.getGraphvizOutputAccess().getXDOTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getGraphvizOutputAccess().getXDOTEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2607:6: (enumLiteral_5= 'cmap' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2607:6: (enumLiteral_5= 'cmap' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2607:8: enumLiteral_5= 'cmap'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_55_in_ruleGraphvizOutput5307); 

                            current = grammarAccess.getGraphvizOutputAccess().getCMAPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getGraphvizOutputAccess().getCMAPEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2613:6: (enumLiteral_6= 'eps' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2613:6: (enumLiteral_6= 'eps' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2613:8: enumLiteral_6= 'eps'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_56_in_ruleGraphvizOutput5324); 

                            current = grammarAccess.getGraphvizOutputAccess().getEPSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getGraphvizOutputAccess().getEPSEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2619:6: (enumLiteral_7= 'fig' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2619:6: (enumLiteral_7= 'fig' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2619:8: enumLiteral_7= 'fig'
                    {
                    enumLiteral_7=(Token)match(input,57,FOLLOW_57_in_ruleGraphvizOutput5341); 

                            current = grammarAccess.getGraphvizOutputAccess().getFIGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getGraphvizOutputAccess().getFIGEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2625:6: (enumLiteral_8= 'gd' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2625:6: (enumLiteral_8= 'gd' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2625:8: enumLiteral_8= 'gd'
                    {
                    enumLiteral_8=(Token)match(input,58,FOLLOW_58_in_ruleGraphvizOutput5358); 

                            current = grammarAccess.getGraphvizOutputAccess().getGDEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getGraphvizOutputAccess().getGDEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2631:6: (enumLiteral_9= 'gd2' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2631:6: (enumLiteral_9= 'gd2' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2631:8: enumLiteral_9= 'gd2'
                    {
                    enumLiteral_9=(Token)match(input,59,FOLLOW_59_in_ruleGraphvizOutput5375); 

                            current = grammarAccess.getGraphvizOutputAccess().getGD2EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getGraphvizOutputAccess().getGD2EnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2637:6: (enumLiteral_10= 'gif' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2637:6: (enumLiteral_10= 'gif' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2637:8: enumLiteral_10= 'gif'
                    {
                    enumLiteral_10=(Token)match(input,60,FOLLOW_60_in_ruleGraphvizOutput5392); 

                            current = grammarAccess.getGraphvizOutputAccess().getGIFEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getGraphvizOutputAccess().getGIFEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2643:6: (enumLiteral_11= 'gtk' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2643:6: (enumLiteral_11= 'gtk' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2643:8: enumLiteral_11= 'gtk'
                    {
                    enumLiteral_11=(Token)match(input,61,FOLLOW_61_in_ruleGraphvizOutput5409); 

                            current = grammarAccess.getGraphvizOutputAccess().getGTKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getGraphvizOutputAccess().getGTKEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2649:6: (enumLiteral_12= 'ico' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2649:6: (enumLiteral_12= 'ico' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2649:8: enumLiteral_12= 'ico'
                    {
                    enumLiteral_12=(Token)match(input,62,FOLLOW_62_in_ruleGraphvizOutput5426); 

                            current = grammarAccess.getGraphvizOutputAccess().getICOEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getGraphvizOutputAccess().getICOEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2655:6: (enumLiteral_13= 'imap' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2655:6: (enumLiteral_13= 'imap' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2655:8: enumLiteral_13= 'imap'
                    {
                    enumLiteral_13=(Token)match(input,63,FOLLOW_63_in_ruleGraphvizOutput5443); 

                            current = grammarAccess.getGraphvizOutputAccess().getIMAPEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getGraphvizOutputAccess().getIMAPEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2661:6: (enumLiteral_14= 'cmapx' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2661:6: (enumLiteral_14= 'cmapx' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2661:8: enumLiteral_14= 'cmapx'
                    {
                    enumLiteral_14=(Token)match(input,64,FOLLOW_64_in_ruleGraphvizOutput5460); 

                            current = grammarAccess.getGraphvizOutputAccess().getCMAPXEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getGraphvizOutputAccess().getCMAPXEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2667:6: (enumLiteral_15= 'imap_np' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2667:6: (enumLiteral_15= 'imap_np' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2667:8: enumLiteral_15= 'imap_np'
                    {
                    enumLiteral_15=(Token)match(input,65,FOLLOW_65_in_ruleGraphvizOutput5477); 

                            current = grammarAccess.getGraphvizOutputAccess().getIMAP_NPEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getGraphvizOutputAccess().getIMAP_NPEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2673:6: (enumLiteral_16= 'cmapx_np' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2673:6: (enumLiteral_16= 'cmapx_np' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2673:8: enumLiteral_16= 'cmapx_np'
                    {
                    enumLiteral_16=(Token)match(input,66,FOLLOW_66_in_ruleGraphvizOutput5494); 

                            current = grammarAccess.getGraphvizOutputAccess().getCMAP_NPEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_16, grammarAccess.getGraphvizOutputAccess().getCMAP_NPEnumLiteralDeclaration_16()); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2679:6: (enumLiteral_17= 'ismap' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2679:6: (enumLiteral_17= 'ismap' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2679:8: enumLiteral_17= 'ismap'
                    {
                    enumLiteral_17=(Token)match(input,67,FOLLOW_67_in_ruleGraphvizOutput5511); 

                            current = grammarAccess.getGraphvizOutputAccess().getISMAPEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_17, grammarAccess.getGraphvizOutputAccess().getISMAPEnumLiteralDeclaration_17()); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2685:6: (enumLiteral_18= 'jpeg' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2685:6: (enumLiteral_18= 'jpeg' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2685:8: enumLiteral_18= 'jpeg'
                    {
                    enumLiteral_18=(Token)match(input,68,FOLLOW_68_in_ruleGraphvizOutput5528); 

                            current = grammarAccess.getGraphvizOutputAccess().getJPEGEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_18, grammarAccess.getGraphvizOutputAccess().getJPEGEnumLiteralDeclaration_18()); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2691:6: (enumLiteral_19= 'jpe' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2691:6: (enumLiteral_19= 'jpe' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2691:8: enumLiteral_19= 'jpe'
                    {
                    enumLiteral_19=(Token)match(input,69,FOLLOW_69_in_ruleGraphvizOutput5545); 

                            current = grammarAccess.getGraphvizOutputAccess().getJPEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_19, grammarAccess.getGraphvizOutputAccess().getJPEEnumLiteralDeclaration_19()); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2697:6: (enumLiteral_20= 'pdf' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2697:6: (enumLiteral_20= 'pdf' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2697:8: enumLiteral_20= 'pdf'
                    {
                    enumLiteral_20=(Token)match(input,70,FOLLOW_70_in_ruleGraphvizOutput5562); 

                            current = grammarAccess.getGraphvizOutputAccess().getPDFEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_20, grammarAccess.getGraphvizOutputAccess().getPDFEnumLiteralDeclaration_20()); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2703:6: (enumLiteral_21= 'plain' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2703:6: (enumLiteral_21= 'plain' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2703:8: enumLiteral_21= 'plain'
                    {
                    enumLiteral_21=(Token)match(input,71,FOLLOW_71_in_ruleGraphvizOutput5579); 

                            current = grammarAccess.getGraphvizOutputAccess().getPLAINEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_21, grammarAccess.getGraphvizOutputAccess().getPLAINEnumLiteralDeclaration_21()); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2709:6: (enumLiteral_22= 'plain-ext' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2709:6: (enumLiteral_22= 'plain-ext' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2709:8: enumLiteral_22= 'plain-ext'
                    {
                    enumLiteral_22=(Token)match(input,72,FOLLOW_72_in_ruleGraphvizOutput5596); 

                            current = grammarAccess.getGraphvizOutputAccess().getPLAIN_EXTEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_22, grammarAccess.getGraphvizOutputAccess().getPLAIN_EXTEnumLiteralDeclaration_22()); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2715:6: (enumLiteral_23= 'png' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2715:6: (enumLiteral_23= 'png' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2715:8: enumLiteral_23= 'png'
                    {
                    enumLiteral_23=(Token)match(input,73,FOLLOW_73_in_ruleGraphvizOutput5613); 

                            current = grammarAccess.getGraphvizOutputAccess().getPNGEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_23, grammarAccess.getGraphvizOutputAccess().getPNGEnumLiteralDeclaration_23()); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2721:6: (enumLiteral_24= 'ps' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2721:6: (enumLiteral_24= 'ps' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2721:8: enumLiteral_24= 'ps'
                    {
                    enumLiteral_24=(Token)match(input,74,FOLLOW_74_in_ruleGraphvizOutput5630); 

                            current = grammarAccess.getGraphvizOutputAccess().getPSEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_24, grammarAccess.getGraphvizOutputAccess().getPSEnumLiteralDeclaration_24()); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2727:6: (enumLiteral_25= 'ps2' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2727:6: (enumLiteral_25= 'ps2' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2727:8: enumLiteral_25= 'ps2'
                    {
                    enumLiteral_25=(Token)match(input,75,FOLLOW_75_in_ruleGraphvizOutput5647); 

                            current = grammarAccess.getGraphvizOutputAccess().getPS2EnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_25, grammarAccess.getGraphvizOutputAccess().getPS2EnumLiteralDeclaration_25()); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2733:6: (enumLiteral_26= 'svg' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2733:6: (enumLiteral_26= 'svg' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2733:8: enumLiteral_26= 'svg'
                    {
                    enumLiteral_26=(Token)match(input,76,FOLLOW_76_in_ruleGraphvizOutput5664); 

                            current = grammarAccess.getGraphvizOutputAccess().getSVGEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_26, grammarAccess.getGraphvizOutputAccess().getSVGEnumLiteralDeclaration_26()); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2739:6: (enumLiteral_27= 'svgz' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2739:6: (enumLiteral_27= 'svgz' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2739:8: enumLiteral_27= 'svgz'
                    {
                    enumLiteral_27=(Token)match(input,77,FOLLOW_77_in_ruleGraphvizOutput5681); 

                            current = grammarAccess.getGraphvizOutputAccess().getSVGZEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_27, grammarAccess.getGraphvizOutputAccess().getSVGZEnumLiteralDeclaration_27()); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2745:6: (enumLiteral_28= 'tif' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2745:6: (enumLiteral_28= 'tif' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2745:8: enumLiteral_28= 'tif'
                    {
                    enumLiteral_28=(Token)match(input,78,FOLLOW_78_in_ruleGraphvizOutput5698); 

                            current = grammarAccess.getGraphvizOutputAccess().getTIFEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_28, grammarAccess.getGraphvizOutputAccess().getTIFEnumLiteralDeclaration_28()); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2751:6: (enumLiteral_29= 'tiff' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2751:6: (enumLiteral_29= 'tiff' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2751:8: enumLiteral_29= 'tiff'
                    {
                    enumLiteral_29=(Token)match(input,79,FOLLOW_79_in_ruleGraphvizOutput5715); 

                            current = grammarAccess.getGraphvizOutputAccess().getTIFFEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_29, grammarAccess.getGraphvizOutputAccess().getTIFFEnumLiteralDeclaration_29()); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2757:6: (enumLiteral_30= 'vml' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2757:6: (enumLiteral_30= 'vml' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2757:8: enumLiteral_30= 'vml'
                    {
                    enumLiteral_30=(Token)match(input,80,FOLLOW_80_in_ruleGraphvizOutput5732); 

                            current = grammarAccess.getGraphvizOutputAccess().getVMLEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_30, grammarAccess.getGraphvizOutputAccess().getVMLEnumLiteralDeclaration_30()); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2763:6: (enumLiteral_31= 'vmlz' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2763:6: (enumLiteral_31= 'vmlz' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2763:8: enumLiteral_31= 'vmlz'
                    {
                    enumLiteral_31=(Token)match(input,81,FOLLOW_81_in_ruleGraphvizOutput5749); 

                            current = grammarAccess.getGraphvizOutputAccess().getVMLZEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_31, grammarAccess.getGraphvizOutputAccess().getVMLZEnumLiteralDeclaration_31()); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2769:6: (enumLiteral_32= 'vrml' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2769:6: (enumLiteral_32= 'vrml' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2769:8: enumLiteral_32= 'vrml'
                    {
                    enumLiteral_32=(Token)match(input,82,FOLLOW_82_in_ruleGraphvizOutput5766); 

                            current = grammarAccess.getGraphvizOutputAccess().getVRMLEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_32, grammarAccess.getGraphvizOutputAccess().getVRMLEnumLiteralDeclaration_32()); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2775:6: (enumLiteral_33= 'wbmp' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2775:6: (enumLiteral_33= 'wbmp' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2775:8: enumLiteral_33= 'wbmp'
                    {
                    enumLiteral_33=(Token)match(input,83,FOLLOW_83_in_ruleGraphvizOutput5783); 

                            current = grammarAccess.getGraphvizOutputAccess().getWBMPEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_33, grammarAccess.getGraphvizOutputAccess().getWBMPEnumLiteralDeclaration_33()); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2781:6: (enumLiteral_34= 'webp' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2781:6: (enumLiteral_34= 'webp' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2781:8: enumLiteral_34= 'webp'
                    {
                    enumLiteral_34=(Token)match(input,84,FOLLOW_84_in_ruleGraphvizOutput5800); 

                            current = grammarAccess.getGraphvizOutputAccess().getWEBPEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_34, grammarAccess.getGraphvizOutputAccess().getWEBPEnumLiteralDeclaration_34()); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2787:6: (enumLiteral_35= 'xlib' )
                    {
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2787:6: (enumLiteral_35= 'xlib' )
                    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2787:8: enumLiteral_35= 'xlib'
                    {
                    enumLiteral_35=(Token)match(input,85,FOLLOW_85_in_ruleGraphvizOutput5817); 

                            current = grammarAccess.getGraphvizOutputAccess().getXLIBEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_35, grammarAccess.getGraphvizOutputAccess().getXLIBEnumLiteralDeclaration_35()); 
                        

                    }


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
    // $ANTLR end "ruleGraphvizOutput"


    // $ANTLR start "ruleConstraintLanguage"
    // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2797:1: ruleConstraintLanguage returns [Enumerator current=null] : (enumLiteral_0= 'OCL' ) ;
    public final Enumerator ruleConstraintLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2799:28: ( (enumLiteral_0= 'OCL' ) )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2800:1: (enumLiteral_0= 'OCL' )
            {
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2800:1: (enumLiteral_0= 'OCL' )
            // ../no.hib.dpf.text/src-gen/no/hib/dpf/text/parser/antlr/internal/InternalDPFText.g:2800:3: enumLiteral_0= 'OCL'
            {
            enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleConstraintLanguage5861); 

                    current = grammarAccess.getConstraintLanguageAccess().getOCLEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getConstraintLanguageAccess().getOCLEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleConstraintLanguage"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\16\uffff";
    static final String DFA13_minS =
        "\1\4\1\27\1\6\1\4\2\15\2\6\2\uffff\2\15\1\4\1\15";
    static final String DFA13_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\2\uffff\1\27\1\45\1\6\1\45";
    static final String DFA13_acceptS =
        "\10\uffff\1\1\1\2\4\uffff";
    static final String DFA13_specialS =
        "\16\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\2\11\23\uffff\1\10\2\uffff\1\10\2\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\6\11\uffff\1\3",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10",
            "\1\11\1\uffff\1\15",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1107:1: (lv_arity_d_7_1= ruleArrow | lv_arity_d_7_2= ruleNodeSimple )";
        }
    }
    static final String DFA14_eotS =
        "\16\uffff";
    static final String DFA14_eofS =
        "\16\uffff";
    static final String DFA14_minS =
        "\1\4\1\27\1\6\1\4\2\15\2\6\2\uffff\2\15\1\4\1\15";
    static final String DFA14_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\2\uffff\1\27\1\45\1\6\1\45";
    static final String DFA14_acceptS =
        "\10\uffff\1\1\1\2\4\uffff";
    static final String DFA14_specialS =
        "\16\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\2\11\23\uffff\1\10\2\uffff\1\10\2\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\6\11\uffff\1\3",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10",
            "\1\11\1\uffff\1\15",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1147:1: (lv_arity_d_9_1= ruleArrow | lv_arity_d_9_2= ruleNodeSimple )";
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\16\uffff";
    static final String DFA20_minS =
        "\1\4\1\27\1\6\1\4\2\15\2\6\2\uffff\2\15\1\4\1\15";
    static final String DFA20_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\2\uffff\1\27\1\45\1\6\1\45";
    static final String DFA20_acceptS =
        "\10\uffff\1\1\1\2\4\uffff";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\2\11\23\uffff\1\10\2\uffff\1\10\2\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\6\11\uffff\1\3",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10",
            "\1\11\1\uffff\1\15",
            "\1\14\1\11\23\uffff\1\10\2\uffff\1\10"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1395:1: (lv_arity_7_1= ruleArrow | lv_arity_7_2= ruleNodeSimple )";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\16\uffff";
    static final String DFA21_minS =
        "\1\4\1\27\1\6\1\4\2\15\2\6\2\uffff\2\15\1\4\1\15";
    static final String DFA21_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\2\uffff\1\27\1\45\1\6\1\45";
    static final String DFA21_acceptS =
        "\10\uffff\1\2\1\1\4\uffff";
    static final String DFA21_specialS =
        "\16\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\2\10\23\uffff\1\11\2\uffff\1\11\2\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\6\11\uffff\1\3",
            "\1\14\1\10\23\uffff\1\11\2\uffff\1\11",
            "\1\10\1\uffff\1\15",
            "\1\14\1\10\23\uffff\1\11\2\uffff\1\11"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1435:1: (lv_arity_9_1= ruleArrow | lv_arity_9_2= ruleNodeSimple )";
        }
    }
    static final String DFA25_eotS =
        "\16\uffff";
    static final String DFA25_eofS =
        "\5\uffff\1\11\5\uffff\1\11\1\uffff\1\11";
    static final String DFA25_minS =
        "\1\4\1\27\1\6\1\4\1\15\1\14\2\6\2\uffff\1\15\1\14\1\4\1\14";
    static final String DFA25_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\2\uffff\1\27\1\46\1\6\1\46";
    static final String DFA25_acceptS =
        "\10\uffff\1\2\1\1\4\uffff";
    static final String DFA25_specialS =
        "\16\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\3\11\23\uffff\1\10\2\uffff\1\10\1\11\1\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\6\11\uffff\1\3",
            "\1\11\1\14\1\11\23\uffff\1\10\2\uffff\1\10\1\11",
            "\1\11\1\uffff\1\15",
            "\1\11\1\14\1\11\23\uffff\1\10\2\uffff\1\10\1\11"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1611:1: (this_Node_0= ruleNode | this_Arrow_1= ruleArrow )";
        }
    }
    static final String DFA26_eotS =
        "\36\uffff";
    static final String DFA26_eofS =
        "\31\uffff\1\32\4\uffff";
    static final String DFA26_minS =
        "\1\4\1\27\1\6\1\4\1\15\1\42\2\6\1\uffff\1\4\2\15\1\27\2\6\1\uffff\1\4\2\15\1\44\2\6\1\4\3\15\1\uffff\1\6\1\uffff\1\15";
    static final String DFA26_maxS =
        "\1\4\1\50\1\6\1\4\1\27\1\50\2\6\1\uffff\1\4\1\27\1\45\1\50\2\6\1\uffff\1\4\1\45\1\43\1\50\2\6\1\5\1\43\1\44\1\50\1\uffff\1\6\1\uffff\1\44";
    static final String DFA26_acceptS =
        "\10\uffff\1\4\6\uffff\1\1\12\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String DFA26_specialS =
        "\36\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\1",
            "\1\3\20\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\6\11\uffff\1\3",
            "\1\11\2\uffff\1\10\2\uffff\1\7",
            "\1\12",
            "\1\13",
            "",
            "\1\14",
            "\1\6\11\uffff\1\3",
            "\1\15\24\uffff\1\11\2\uffff\1\10",
            "\1\20\13\uffff\1\17\4\uffff\1\16",
            "\1\21",
            "\1\22",
            "",
            "\1\23",
            "\1\15\24\uffff\1\11\2\uffff\1\10",
            "\1\24\11\uffff\1\20\13\uffff\1\17",
            "\1\26\3\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\31\1\32",
            "\1\24\11\uffff\1\20\13\uffff\1\17",
            "\1\33\26\uffff\1\26",
            "\2\32\10\uffff\1\34\20\uffff\1\34",
            "",
            "\1\35",
            "",
            "\1\33\26\uffff\1\26"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1651:1: ( ( ( (lv_sr_0_0= ruleNodeSimple ) ) otherlv_1= '-' ( (lv_id_2_0= ruleDpfId ) ) otherlv_3= ':*->' ( (lv_tgDataType_4_0= ruleDataType ) ) ) | ( ( (lv_sr_5_0= ruleNodeSimple ) ) otherlv_6= '-' ( (lv_id_7_0= ruleDpfId ) ) otherlv_8= ':' ( (lv_type_9_0= ruleDpfId ) ) otherlv_10= '->' ( (lv_tgValue_11_0= ruleAttributeValue ) ) ) | ( ( (lv_sr_12_0= ruleNodeSimple ) ) otherlv_13= '-' ( (lv_id_14_0= ruleDpfId ) ) otherlv_15= ':' ( (lv_type_16_0= ruleDpfId ) ) otherlv_17= '->' ( (lv_tgNode_18_0= ruleNodeSimple ) ) ) | ( ( (lv_sr_19_0= ruleNodeSimple ) ) otherlv_20= '-|>' ( (lv_tgNode_21_0= ruleNodeSimple ) ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\21\uffff";
    static final String DFA32_eofS =
        "\14\uffff\1\15\4\uffff";
    static final String DFA32_minS =
        "\1\4\1\27\1\6\1\uffff\1\4\1\15\1\44\2\6\1\4\3\15\1\uffff\1\6\1\uffff\1\15";
    static final String DFA32_maxS =
        "\1\4\1\50\1\6\1\uffff\1\4\1\43\1\50\2\6\1\5\1\43\1\44\1\50\1\uffff\1\6\1\uffff\1\44";
    static final String DFA32_acceptS =
        "\3\uffff\1\1\11\uffff\1\2\1\uffff\1\3\1\uffff";
    static final String DFA32_specialS =
        "\21\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1",
            "\1\4\13\uffff\1\3\4\uffff\1\2",
            "\1\5",
            "",
            "\1\6",
            "\1\7\11\uffff\1\4\13\uffff\1\3",
            "\1\11\3\uffff\1\10",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\7\11\uffff\1\4\13\uffff\1\3",
            "\1\16\26\uffff\1\11",
            "\2\15\10\uffff\1\17\20\uffff\1\17",
            "",
            "\1\20",
            "",
            "\1\16\26\uffff\1\11"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "2159:1: ( ( ( (lv_id_0_0= ruleDpfId ) ) otherlv_1= ':*->' ( (lv_tgDataType_2_0= ruleDataType ) ) ) | ( ( (lv_id_3_0= ruleDpfId ) ) otherlv_4= ':' ( (lv_type_5_0= ruleDpfId ) ) otherlv_6= '->' ( (lv_tgValue_7_0= ruleAttributeValue ) ) ) | ( ( (lv_id_8_0= ruleDpfId ) ) otherlv_9= ':' ( (lv_type_10_0= ruleDpfId ) ) otherlv_11= '->' ( (lv_tgNode_12_0= ruleNodeSimple ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecification_in_ruleModel132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatch_in_ruleModel186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatch_in_entryRuleBatch221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatch231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBatch268 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBatch280 = new BitSet(new long[]{0x00000000003CC000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleBatch302 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleBatch315 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleBatch336 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleBatch352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeEmf_in_ruleCommand445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeEcore_in_ruleCommand472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeImage_in_ruleCommand499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeDiagram_in_ruleCommand526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMatch_in_ruleCommand553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeEmf_in_entryRuleMakeEmf588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeEmf598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMakeEmf635 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMakeEmf647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeEmf664 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMakeEmf681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeEcore_in_entryRuleMakeEcore717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeEcore727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMakeEcore764 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMakeEcore776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeEcore793 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMakeEcore810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeImage_in_entryRuleMakeImage846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeImage856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMakeImage893 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMakeImage905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeImage922 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleMakeImage940 = new BitSet(new long[]{0xFFFC000000000000L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_ruleGraphvizOutput_in_ruleMakeImage961 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMakeImage975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeDiagram_in_entryRuleMakeDiagram1011 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeDiagram1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleMakeDiagram1058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMakeDiagram1070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMakeDiagram1087 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleMakeDiagram1105 = new BitSet(new long[]{0xFFFC000000000000L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_ruleGraphvizOutput_in_ruleMakeDiagram1126 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMakeDiagram1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMatch_in_entryRuleTestMatch1176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMatch1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTestMatch1223 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTestMatch1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestMatch1252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTestMatch1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestMatch1286 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTestMatch1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecification_in_entryRuleSpecification1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecification1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSpecification1386 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSpecification1407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSpecification1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleChoosenSpecification_in_ruleSpecification1440 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_24_in_ruleSpecification1458 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSpecification1484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleGraph_in_ruleSpecification1505 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_ruleConstraintList_in_ruleSpecification1526 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_ruleSpecification1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintList_in_entryRuleConstraintList1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintList1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConstraintList1622 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConstraintList1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleChoosenSignature_in_ruleConstraintList1655 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraintList1667 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleConstraintList1689 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleConstraintList1702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstraint_in_ruleConstraintList1723 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleConstraintList1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoosenSpecification_in_entryRuleChoosenSpecification1775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoosenSpecification1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoosenSpecification1827 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleChoosenSpecification1844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoosenSpecification1861 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChoosenSpecification1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_entryRuleVersion1914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVersion1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVersion1961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVersion1978 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVersion1995 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2012 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVersion2029 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVersion2046 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVersion2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoosenSignature_in_entryRuleChoosenSignature2099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoosenSignature2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoosenSignature2151 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleChoosenSignature2168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoosenSignature2185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleChoosenSignature2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraint2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleConstraint2294 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstraint2306 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint2324 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint2342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstraint2359 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleConstraint2380 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstraint2392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleConstraint2416 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleConstraint2435 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleConstraint2451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleConstraint2474 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleConstraint2493 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleConstraint2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignature2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSignature2594 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleVersion_in_ruleSignature2615 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_30_in_ruleSignature2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConstraintLanguage_in_ruleSignature2649 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSignature2661 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSignature2675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidator_in_ruleSignature2696 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSignature2709 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidator_in_ruleSignature2730 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleSignature2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidator_in_entryRuleValidator2780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidator2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleValidator2836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleValidator2848 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidator2866 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleValidator2884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidator2901 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleValidator2922 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValidator2934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleValidator2958 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleValidator2977 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleValidator2993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleValidator3016 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleValidator3035 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleValidator3053 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleValidator3065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValidator3082 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleValidator3099 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValidator3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGraph_in_entryRuleGraph3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGraph3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleGraph3204 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGraph3216 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleGraph3238 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleGraph3251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleElement_in_ruleGraph3272 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleGraph3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement3324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleElement3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrow_in_ruleElement3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrow_in_entryRuleArrow3443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrow3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3500 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArrow3512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleArrow3533 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleArrow3545 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleArrow3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3595 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArrow3607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleArrow3628 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleArrow3640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleArrow3661 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleArrow3673 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleArrow3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3723 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleArrow3735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleArrow3756 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleArrow3768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleArrow3789 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleArrow3801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3851 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleArrow3863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleArrow3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleNode3977 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNode3989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleNode4010 = new BitSet(new long[]{0x0000004000001002L});
    public static final BitSet FOLLOW_38_in_ruleNode4023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleNode4044 = new BitSet(new long[]{0x0000008000001002L});
    public static final BitSet FOLLOW_39_in_ruleNode4057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleNode4078 = new BitSet(new long[]{0x0000008000001002L});
    public static final BitSet FOLLOW_12_in_ruleNode4095 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode4117 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleNode4130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleNode4151 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleNode4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_entryRuleNodeSimple4205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSimple4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleNodeSimple4261 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNodeSimple4273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleNodeSimple4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty4330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleProperty4387 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleProperty4399 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleProperty4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleProperty4449 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProperty4461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleProperty4482 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProperty4494 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleProperty4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleProperty4544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProperty4556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDpfId_in_ruleProperty4577 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleProperty4589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeSimple_in_ruleProperty4610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue4647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeValue4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValue4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDpfId_in_entryRuleDpfId4768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDpfId4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDpfId4820 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleDpfId4838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleRId_in_ruleDpfId4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRId_in_entryRuleRId4897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRId4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRId4949 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRId4967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRId4984 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_41_in_ruleDataType5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataType5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataType5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataType5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDataType5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDataType5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGraphvizOutput5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGraphvizOutput5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGraphvizOutput5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGraphvizOutput5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGraphvizOutput5290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleGraphvizOutput5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleGraphvizOutput5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleGraphvizOutput5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleGraphvizOutput5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleGraphvizOutput5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGraphvizOutput5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGraphvizOutput5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGraphvizOutput5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleGraphvizOutput5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleGraphvizOutput5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleGraphvizOutput5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleGraphvizOutput5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleGraphvizOutput5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleGraphvizOutput5528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleGraphvizOutput5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleGraphvizOutput5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleGraphvizOutput5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleGraphvizOutput5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleGraphvizOutput5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleGraphvizOutput5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleGraphvizOutput5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleGraphvizOutput5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleGraphvizOutput5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleGraphvizOutput5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGraphvizOutput5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGraphvizOutput5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGraphvizOutput5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleGraphvizOutput5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleGraphvizOutput5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleGraphvizOutput5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleGraphvizOutput5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleConstraintLanguage5861 = new BitSet(new long[]{0x0000000000000002L});

}