package no.hib.dpf.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDPFTextLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=4;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=9;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalDPFTextLexer() {;} 
    public InternalDPFTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDPFTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:11:7: ( 'OCL' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:11:9: 'OCL'
            {
            match("OCL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:12:7: ( 'Boolean' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:12:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:13:7: ( 'Char' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:13:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:14:7: ( 'Byte' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:14:9: 'Byte'
            {
            match("Byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:15:7: ( 'Short' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:15:9: 'Short'
            {
            match("Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:16:7: ( 'Int' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:16:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:17:7: ( 'Long' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:17:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:18:7: ( 'Float' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:18:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:19:7: ( 'Double' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:19:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:20:7: ( 'String' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:20:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:21:7: ( 'jpg' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:21:9: 'jpg'
            {
            match("jpg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:22:7: ( 'bmp' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:22:9: 'bmp'
            {
            match("bmp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:23:7: ( 'canon' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:23:9: 'canon'
            {
            match("canon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:24:7: ( 'dot' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:24:9: 'dot'
            {
            match("dot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:25:7: ( 'xdot' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:25:9: 'xdot'
            {
            match("xdot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:26:7: ( 'cmap' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:26:9: 'cmap'
            {
            match("cmap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:27:7: ( 'eps' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:27:9: 'eps'
            {
            match("eps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:28:7: ( 'fig' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:28:9: 'fig'
            {
            match("fig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:29:7: ( 'gd' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:29:9: 'gd'
            {
            match("gd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:30:7: ( 'gd2' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:30:9: 'gd2'
            {
            match("gd2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:31:7: ( 'gif' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:31:9: 'gif'
            {
            match("gif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:32:7: ( 'gtk' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:32:9: 'gtk'
            {
            match("gtk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:33:7: ( 'ico' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:33:9: 'ico'
            {
            match("ico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:34:7: ( 'imap' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:34:9: 'imap'
            {
            match("imap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:35:7: ( 'cmapx' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:35:9: 'cmapx'
            {
            match("cmapx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:36:7: ( 'imap_np' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:36:9: 'imap_np'
            {
            match("imap_np"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:37:7: ( 'cmapx_np' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:37:9: 'cmapx_np'
            {
            match("cmapx_np"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:38:7: ( 'ismap' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:38:9: 'ismap'
            {
            match("ismap"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:39:7: ( 'jpeg' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:39:9: 'jpeg'
            {
            match("jpeg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:40:7: ( 'jpe' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:40:9: 'jpe'
            {
            match("jpe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:41:7: ( 'pdf' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:41:9: 'pdf'
            {
            match("pdf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:42:7: ( 'plain' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:42:9: 'plain'
            {
            match("plain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:43:7: ( 'plain-ext' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:43:9: 'plain-ext'
            {
            match("plain-ext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:44:7: ( 'png' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:44:9: 'png'
            {
            match("png"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:45:7: ( 'ps' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:45:9: 'ps'
            {
            match("ps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:46:7: ( 'ps2' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:46:9: 'ps2'
            {
            match("ps2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:47:7: ( 'svg' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:47:9: 'svg'
            {
            match("svg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:48:7: ( 'svgz' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:48:9: 'svgz'
            {
            match("svgz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:49:7: ( 'tif' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:49:9: 'tif'
            {
            match("tif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:50:7: ( 'tiff' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:50:9: 'tiff'
            {
            match("tiff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:51:7: ( 'vml' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:51:9: 'vml'
            {
            match("vml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:52:7: ( 'vmlz' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:52:9: 'vmlz'
            {
            match("vmlz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:53:7: ( 'vrml' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:53:9: 'vrml'
            {
            match("vrml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:54:7: ( 'wbmp' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:54:9: 'wbmp'
            {
            match("wbmp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:55:7: ( 'webp' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:55:9: 'webp'
            {
            match("webp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:56:7: ( 'xlib' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:56:9: 'xlib'
            {
            match("xlib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:57:7: ( 'Batch' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:57:9: 'Batch'
            {
            match("Batch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:58:7: ( '{' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:58:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:59:7: ( '}' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:59:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:60:7: ( ',' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:60:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:61:7: ( 'emf' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:61:9: 'emf'
            {
            match("emf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:62:7: ( '(' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:62:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:63:7: ( ')' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:63:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:64:7: ( 'ecore' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:64:9: 'ecore'
            {
            match("ecore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:65:7: ( 'image' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:65:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:66:7: ( 'diagram' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:66:9: 'diagram'
            {
            match("diagram"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:67:7: ( 'testMatch' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:67:9: 'testMatch'
            {
            match("testMatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:68:7: ( 'Specification' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:68:9: 'Specification'
            {
            match("Specification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:69:7: ( ':' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:69:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:70:7: ( 'Constraints' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:70:9: 'Constraints'
            {
            match("Constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:71:7: ( '!' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:71:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:72:7: ( '<version=' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:72:9: '<version='
            {
            match("<version="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:73:7: ( '>' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:73:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:74:7: ( 'Signature' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:74:9: 'Signature'
            {
            match("Signature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:75:7: ( '<' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:75:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:76:7: ( '=' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:76:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:77:7: ( 'errorMsg=' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:77:9: 'errorMsg='
            {
            match("errorMsg="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:78:7: ( 'Graph' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:78:9: 'Graph'
            {
            match("Graph"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:79:7: ( '-' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:79:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:80:7: ( ':*->' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:80:9: ':*->'
            {
            match(":*->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:81:7: ( '->' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:81:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:82:7: ( '-|>' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:82:9: '-|>'
            {
            match("-|>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:83:7: ( 'extends' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:83:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:84:7: ( 'and' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:84:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:85:7: ( '@' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:85:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:86:7: ( '<PLAIN>' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:86:9: '<PLAIN>'
            {
            match("<PLAIN>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8519:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8519:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8519:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8519:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8519:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8521:10: ( ( '0' .. '9' )+ )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8521:12: ( '0' .. '9' )+
            {
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8521:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8521:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8523:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8525:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8525:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8525:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8525:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:41: ( '\\r' )? '\\n'
                    {
                    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8527:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8529:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8529:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8529:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8531:16: ( . )
            // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:8531:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=83;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:466: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:474: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 79 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:483: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 80 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:495: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:511: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:527: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // ../no.hib.dpf.text.ui/src-gen/no/hib/dpf/text/ui/contentassist/antlr/internal/InternalDPFText.g:1:535: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\26\56\5\uffff\1\141\1\uffff\1\145\2\uffff\1\56\1\153\1\56\1\uffff\1\54\2\uffff\3\54\2\uffff\1\56\1\uffff\33\56\1\u0091\10\56\1\u009b\7\56\15\uffff\1\56\3\uffff\1\56\6\uffff\1\u00a5\11\56\1\u00af\3\56\1\u00b3\1\u00b5\1\u00b6\2\56\1\u00b9\3\56\1\u00bd\1\u00be\3\56\1\u00c2\1\u00c3\1\uffff\1\u00c4\1\u00c5\1\u00c6\2\56\1\u00ca\1\56\1\u00cc\1\u00cd\1\uffff\1\u00cf\1\u00d1\1\56\1\u00d4\4\56\1\u00d9\1\uffff\1\56\1\u00db\1\56\1\u00dd\5\56\1\uffff\1\u00e3\2\56\1\uffff\1\u00e6\2\uffff\1\56\1\u00e9\1\uffff\1\56\1\u00eb\1\u00ec\2\uffff\3\56\5\uffff\1\u00f1\2\56\1\uffff\1\56\2\uffff\1\u00f5\1\uffff\1\u00f6\1\uffff\1\56\1\u00f8\1\uffff\1\u00f9\1\u00fa\1\u00fb\1\56\1\uffff\1\56\1\uffff\1\u00fe\1\uffff\1\56\1\u0100\3\56\1\uffff\1\u0104\1\56\1\uffff\1\u0106\1\u0108\1\uffff\1\56\2\uffff\1\u010a\3\56\1\uffff\1\u010e\1\u010f\1\u0111\2\uffff\1\56\4\uffff\1\u0113\1\56\1\uffff\1\56\1\uffff\1\u0116\2\56\1\uffff\1\u0119\1\uffff\1\56\1\uffff\1\56\1\uffff\3\56\4\uffff\1\56\1\uffff\1\u0120\1\56\1\uffff\2\56\1\uffff\1\56\1\u0125\1\56\1\u0127\1\u0128\1\56\1\uffff\3\56\1\u012d\1\uffff\1\56\2\uffff\3\56\1\u0132\2\uffff\1\u0133\2\56\2\uffff\1\u0136\1\56\1\uffff\1\56\1\u0139\1\uffff";
    static final String DFA12_eofS =
        "\u013a\uffff";
    static final String DFA12_minS =
        "\1\0\1\103\1\141\2\150\1\156\1\157\1\154\1\157\1\160\1\155\1\141\1\151\1\144\1\143\1\151\1\144\1\143\1\144\1\166\1\145\1\155\1\142\5\uffff\1\52\1\uffff\1\120\2\uffff\1\162\1\76\1\156\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\114\1\uffff\1\157\2\164\1\141\1\156\1\157\1\162\1\145\1\147\1\164\1\156\1\157\1\165\1\145\1\160\1\156\1\141\1\164\1\141\1\157\1\151\1\163\1\146\1\157\1\162\1\164\1\147\1\60\1\146\1\153\1\157\1\141\1\155\1\146\1\141\1\147\1\60\1\147\1\146\1\163\1\154\2\155\1\142\15\uffff\1\141\3\uffff\1\144\6\uffff\1\60\1\154\1\145\1\143\1\162\1\163\1\162\1\151\1\143\1\156\1\60\1\147\1\141\1\142\3\60\1\157\1\160\1\60\1\147\1\164\1\142\2\60\1\162\1\157\1\145\2\60\1\uffff\3\60\1\147\1\141\1\60\1\151\2\60\1\uffff\2\60\1\164\1\60\1\154\3\160\1\60\1\uffff\1\145\1\60\1\150\1\60\2\164\1\156\1\151\1\141\1\uffff\1\60\1\164\1\154\1\uffff\1\60\2\uffff\1\156\1\60\1\uffff\1\162\2\60\2\uffff\1\145\1\162\1\156\5\uffff\1\60\1\145\1\160\1\uffff\1\156\2\uffff\1\60\1\uffff\1\60\1\uffff\1\115\1\60\1\uffff\3\60\1\150\1\uffff\1\141\1\uffff\1\60\1\uffff\1\162\1\60\1\147\1\146\1\164\1\uffff\1\60\1\145\1\uffff\2\60\1\uffff\1\141\2\uffff\1\60\1\115\1\144\1\156\1\uffff\2\60\1\55\2\uffff\1\141\4\uffff\1\60\1\156\1\uffff\1\141\1\uffff\1\60\1\151\1\165\1\uffff\1\60\1\uffff\1\156\1\uffff\1\155\1\uffff\2\163\1\160\4\uffff\1\164\1\uffff\1\60\1\151\1\uffff\1\143\1\162\1\uffff\1\160\1\60\1\147\2\60\1\143\1\uffff\1\156\1\141\1\145\1\60\1\uffff\1\75\2\uffff\1\150\2\164\1\60\2\uffff\1\60\1\163\1\151\2\uffff\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\103\1\171\1\157\1\164\1\156\1\157\1\154\1\157\1\160\2\155\1\157\1\154\1\170\1\151\1\164\2\163\1\166\1\151\1\162\1\145\5\uffff\1\52\1\uffff\1\166\2\uffff\1\162\1\174\1\156\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\114\1\uffff\1\157\2\164\1\141\1\156\1\157\1\162\1\145\1\147\1\164\1\156\1\157\1\165\1\147\1\160\1\156\1\141\1\164\1\141\1\157\1\151\1\163\1\146\1\157\1\162\1\164\1\147\1\172\1\146\1\153\1\157\1\141\1\155\1\146\1\141\1\147\1\172\1\147\1\146\1\163\1\154\2\155\1\142\15\uffff\1\141\3\uffff\1\144\6\uffff\1\172\1\154\1\145\1\143\1\162\1\163\1\162\1\151\1\143\1\156\1\172\1\147\1\141\1\142\3\172\1\157\1\160\1\172\1\147\1\164\1\142\2\172\1\162\1\157\1\145\2\172\1\uffff\3\172\1\160\1\141\1\172\1\151\2\172\1\uffff\2\172\1\164\1\172\1\154\3\160\1\172\1\uffff\1\145\1\172\1\150\1\172\2\164\1\156\1\151\1\141\1\uffff\1\172\1\164\1\154\1\uffff\1\172\2\uffff\1\156\1\172\1\uffff\1\162\2\172\2\uffff\1\145\1\162\1\156\5\uffff\1\172\1\145\1\160\1\uffff\1\156\2\uffff\1\172\1\uffff\1\172\1\uffff\1\115\1\172\1\uffff\3\172\1\150\1\uffff\1\141\1\uffff\1\172\1\uffff\1\162\1\172\1\147\1\146\1\164\1\uffff\1\172\1\145\1\uffff\2\172\1\uffff\1\141\2\uffff\1\172\1\115\1\144\1\156\1\uffff\3\172\2\uffff\1\141\4\uffff\1\172\1\156\1\uffff\1\141\1\uffff\1\172\1\151\1\165\1\uffff\1\172\1\uffff\1\156\1\uffff\1\155\1\uffff\2\163\1\160\4\uffff\1\164\1\uffff\1\172\1\151\1\uffff\1\143\1\162\1\uffff\1\160\1\172\1\147\2\172\1\143\1\uffff\1\156\1\141\1\145\1\172\1\uffff\1\75\2\uffff\1\150\2\164\1\172\2\uffff\1\172\1\163\1\151\2\uffff\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\27\uffff\1\60\1\61\1\62\1\64\1\65\1\uffff\1\75\1\uffff\1\77\1\102\3\uffff\1\113\1\uffff\1\115\1\116\3\uffff\1\122\1\123\1\uffff\1\115\54\uffff\1\60\1\61\1\62\1\64\1\65\1\106\1\73\1\75\1\76\1\114\1\101\1\77\1\102\1\uffff\1\107\1\110\1\105\1\uffff\1\113\1\116\1\117\1\120\1\121\1\122\36\uffff\1\23\11\uffff\1\43\11\uffff\1\1\11\uffff\1\6\3\uffff\1\13\1\uffff\1\36\1\14\2\uffff\1\16\3\uffff\1\21\1\63\3\uffff\1\22\1\24\1\25\1\26\1\27\3\uffff\1\37\1\uffff\1\42\1\44\1\uffff\1\45\1\uffff\1\47\2\uffff\1\51\4\uffff\1\112\1\uffff\1\4\1\uffff\1\3\5\uffff\1\7\2\uffff\1\35\2\uffff\1\20\1\uffff\1\17\1\56\4\uffff\1\30\3\uffff\1\46\1\50\1\uffff\1\52\1\53\1\54\1\55\2\uffff\1\57\1\uffff\1\5\3\uffff\1\10\1\uffff\1\15\1\uffff\1\31\1\uffff\1\66\3\uffff\1\67\1\34\1\41\1\40\1\uffff\1\104\2\uffff\1\12\2\uffff\1\11\6\uffff\1\2\4\uffff\1\70\1\uffff\1\111\1\32\4\uffff\1\33\1\103\3\uffff\1\100\1\71\2\uffff\1\74\2\uffff\1\72";
    static final String DFA12_specialS =
        "\1\0\47\uffff\1\1\1\2\u0110\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\35\1\50\4\54\1\51\1\32\1\33\2\54\1\31\1\42\1\54\1\52\12\47\1\34\1\54\1\36\1\40\1\37\1\54\1\44\1\46\1\2\1\3\1\10\1\46\1\7\1\41\1\46\1\5\2\46\1\6\2\46\1\1\3\46\1\4\7\46\3\54\1\45\1\46\1\54\1\43\1\12\1\13\1\14\1\16\1\17\1\20\1\46\1\21\1\11\5\46\1\22\2\46\1\23\1\24\1\46\1\25\1\26\1\15\2\46\1\27\1\54\1\30\uff82\54",
            "\1\55",
            "\1\61\15\uffff\1\57\11\uffff\1\60",
            "\1\62\6\uffff\1\63",
            "\1\64\1\67\6\uffff\1\66\3\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\13\uffff\1\77",
            "\1\101\5\uffff\1\100",
            "\1\102\7\uffff\1\103",
            "\1\106\11\uffff\1\105\2\uffff\1\104\1\uffff\1\107\5\uffff\1\110",
            "\1\111",
            "\1\112\4\uffff\1\113\12\uffff\1\114",
            "\1\115\11\uffff\1\116\5\uffff\1\117",
            "\1\120\7\uffff\1\121\1\uffff\1\122\4\uffff\1\123",
            "\1\124",
            "\1\126\3\uffff\1\125",
            "\1\127\4\uffff\1\130",
            "\1\131\2\uffff\1\132",
            "",
            "",
            "",
            "",
            "",
            "\1\140",
            "",
            "\1\144\45\uffff\1\143",
            "",
            "",
            "\1\150",
            "\1\151\75\uffff\1\152",
            "\1\154",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\157",
            "\0\157",
            "\1\160\4\uffff\1\161",
            "",
            "",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0082\1\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\2\56\1\u0090\7\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\2\56\1\u009a\7\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "",
            "",
            "\1\u00a4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00b4\23\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b7",
            "\1\u00b8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c8\10\uffff\1\u00c7",
            "\1\u00c9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00cb",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\31\56\1\u00ce",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u00d0\24\56",
            "\1\u00d2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\31\56\1\u00d3",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00da",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00dc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00e7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\u00e8\2\56",
            "",
            "\1\u00ea",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\u00f0\1\uffff\32\56",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00f7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00ff",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0105",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\u0107\1\uffff\32\56",
            "",
            "\1\u0109",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0110\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0112",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0114",
            "",
            "\1\u0115",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0117",
            "\1\u0118",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "",
            "",
            "\1\u011f",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0126",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0129",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u012e",
            "",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0134",
            "\1\u0135",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0137",
            "",
            "\1\u0138",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='O') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='S') ) {s = 4;}

                        else if ( (LA12_0=='I') ) {s = 5;}

                        else if ( (LA12_0=='L') ) {s = 6;}

                        else if ( (LA12_0=='F') ) {s = 7;}

                        else if ( (LA12_0=='D') ) {s = 8;}

                        else if ( (LA12_0=='j') ) {s = 9;}

                        else if ( (LA12_0=='b') ) {s = 10;}

                        else if ( (LA12_0=='c') ) {s = 11;}

                        else if ( (LA12_0=='d') ) {s = 12;}

                        else if ( (LA12_0=='x') ) {s = 13;}

                        else if ( (LA12_0=='e') ) {s = 14;}

                        else if ( (LA12_0=='f') ) {s = 15;}

                        else if ( (LA12_0=='g') ) {s = 16;}

                        else if ( (LA12_0=='i') ) {s = 17;}

                        else if ( (LA12_0=='p') ) {s = 18;}

                        else if ( (LA12_0=='s') ) {s = 19;}

                        else if ( (LA12_0=='t') ) {s = 20;}

                        else if ( (LA12_0=='v') ) {s = 21;}

                        else if ( (LA12_0=='w') ) {s = 22;}

                        else if ( (LA12_0=='{') ) {s = 23;}

                        else if ( (LA12_0=='}') ) {s = 24;}

                        else if ( (LA12_0==',') ) {s = 25;}

                        else if ( (LA12_0=='(') ) {s = 26;}

                        else if ( (LA12_0==')') ) {s = 27;}

                        else if ( (LA12_0==':') ) {s = 28;}

                        else if ( (LA12_0=='!') ) {s = 29;}

                        else if ( (LA12_0=='<') ) {s = 30;}

                        else if ( (LA12_0=='>') ) {s = 31;}

                        else if ( (LA12_0=='=') ) {s = 32;}

                        else if ( (LA12_0=='G') ) {s = 33;}

                        else if ( (LA12_0=='-') ) {s = 34;}

                        else if ( (LA12_0=='a') ) {s = 35;}

                        else if ( (LA12_0=='@') ) {s = 36;}

                        else if ( (LA12_0=='^') ) {s = 37;}

                        else if ( (LA12_0=='A'||LA12_0=='E'||LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||(LA12_0>='P' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='h'||(LA12_0>='k' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='u'||(LA12_0>='y' && LA12_0<='z')) ) {s = 38;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 39;}

                        else if ( (LA12_0=='\"') ) {s = 40;}

                        else if ( (LA12_0=='\'') ) {s = 41;}

                        else if ( (LA12_0=='/') ) {s = 42;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 43;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||LA12_0==';'||LA12_0=='?'||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( ((LA12_40>='\u0000' && LA12_40<='\uFFFF')) ) {s = 111;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( ((LA12_41>='\u0000' && LA12_41<='\uFFFF')) ) {s = 111;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}