// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PRINT=3, IF=4, WHILE=5, VAR=6, EQ=7, POT=8, ACHA=9, FCHA=10, 
		APAR=11, FPAR=12, PLUS=13, MINUS=14, MUL=15, DIV=16, INT=17, STRING=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PRINT", "IF", "WHILE", "VAR", "EQ", "POT", "ACHA", "FCHA", 
			"APAR", "FPAR", "PLUS", "MINUS", "MUL", "DIV", "INT", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'else'", "'print'", "'if'", "'while'", null, "'='", "'^'", 
			"'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINT", "IF", "WHILE", "VAR", "EQ", "POT", "ACHA", 
			"FCHA", "APAR", "FPAR", "PLUS", "MINUS", "MUL", "DIV", "INT", "STRING", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013m\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u0005?\b\u0005\u000b\u0005\f\u0005@\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010X\b\u0010"+
		"\u000b\u0010\f\u0010Y\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011`\b\u0011\n\u0011\f\u0011c\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0004\u0012h\b\u0012\u000b\u0012\f\u0012i\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001"+
		"\u0000\u0004\u0001\u0000az\u0001\u000009\u0001\u0000\"\"\u0003\u0000\t"+
		"\n\r\r  q\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000"+
		"\u0000\t7\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rB\u0001"+
		"\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000"+
		"\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017"+
		"L\u0001\u0000\u0000\u0000\u0019N\u0001\u0000\u0000\u0000\u001bP\u0001"+
		"\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000\u001fT\u0001\u0000\u0000"+
		"\u0000!W\u0001\u0000\u0000\u0000#[\u0001\u0000\u0000\u0000%g\u0001\u0000"+
		"\u0000\u0000\'(\u0005;\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005"+
		"e\u0000\u0000*+\u0005l\u0000\u0000+,\u0005s\u0000\u0000,-\u0005e\u0000"+
		"\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005p\u0000\u0000/0\u0005r\u0000"+
		"\u000001\u0005i\u0000\u000012\u0005n\u0000\u000023\u0005t\u0000\u0000"+
		"3\u0006\u0001\u0000\u0000\u000045\u0005i\u0000\u000056\u0005f\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000078\u0005w\u0000\u000089\u0005h\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<\n\u0001"+
		"\u0000\u0000\u0000=?\u0007\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\f\u0001\u0000\u0000\u0000BC\u0005=\u0000\u0000C\u000e\u0001\u0000"+
		"\u0000\u0000DE\u0005^\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005"+
		"{\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005}\u0000\u0000I\u0014"+
		"\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000K\u0016\u0001\u0000\u0000"+
		"\u0000LM\u0005)\u0000\u0000M\u0018\u0001\u0000\u0000\u0000NO\u0005+\u0000"+
		"\u0000O\u001a\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000Q\u001c\u0001"+
		"\u0000\u0000\u0000RS\u0005*\u0000\u0000S\u001e\u0001\u0000\u0000\u0000"+
		"TU\u0005/\u0000\u0000U \u0001\u0000\u0000\u0000VX\u0007\u0001\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\"\u0001\u0000\u0000\u0000[a\u0007\u0002"+
		"\u0000\u0000\\`\b\u0002\u0000\u0000]^\u0005\\\u0000\u0000^`\u0005\"\u0000"+
		"\u0000_\\\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0007\u0002\u0000\u0000"+
		"e$\u0001\u0000\u0000\u0000fh\u0007\u0003\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0006\u0012\u0000\u0000l&\u0001"+
		"\u0000\u0000\u0000\u0006\u0000@Y_ai\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}