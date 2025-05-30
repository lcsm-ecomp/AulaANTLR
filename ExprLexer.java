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
		T__0=1, T__1=2, PRINT=3, IF=4, X=5, EQ=6, WHILE=7, POT=8, ACHA=9, FCHA=10, 
		APAR=11, FPAR=12, PLUS=13, MINUS=14, MUL=15, DIV=16, INT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "PRINT", "IF", "X", "EQ", "WHILE", "POT", "ACHA", "FCHA", 
			"APAR", "FPAR", "PLUS", "MINUS", "MUL", "DIV", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'else'", "'print'", "'if'", null, "'='", "'while'", "'^'", 
			"'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PRINT", "IF", "X", "EQ", "WHILE", "POT", "ACHA", "FCHA", 
			"APAR", "FPAR", "PLUS", "MINUS", "MUL", "DIV", "INT", "WS"
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
		"\u0004\u0000\u0012]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"S\b\u0010\u000b\u0010\f\u0010T\u0001\u0011\u0004\u0011X\b\u0011\u000b"+
		"\u0011\f\u0011Y\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0003\u0002\u0000XXxx\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  ^\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005"+
		",\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000\t5\u0001\u0000"+
		"\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f?\u0001\u0000\u0000\u0000\u0011A\u0001\u0000\u0000\u0000\u0013C"+
		"\u0001\u0000\u0000\u0000\u0015E\u0001\u0000\u0000\u0000\u0017G\u0001\u0000"+
		"\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bK\u0001\u0000\u0000\u0000"+
		"\u001dM\u0001\u0000\u0000\u0000\u001fO\u0001\u0000\u0000\u0000!R\u0001"+
		"\u0000\u0000\u0000#W\u0001\u0000\u0000\u0000%&\u0005;\u0000\u0000&\u0002"+
		"\u0001\u0000\u0000\u0000\'(\u0005e\u0000\u0000()\u0005l\u0000\u0000)*"+
		"\u0005s\u0000\u0000*+\u0005e\u0000\u0000+\u0004\u0001\u0000\u0000\u0000"+
		",-\u0005p\u0000\u0000-.\u0005r\u0000\u0000./\u0005i\u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005t\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005"+
		"i\u0000\u000034\u0005f\u0000\u00004\b\u0001\u0000\u0000\u000056\u0007"+
		"\u0000\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\f"+
		"\u0001\u0000\u0000\u00009:\u0005w\u0000\u0000:;\u0005h\u0000\u0000;<\u0005"+
		"i\u0000\u0000<=\u0005l\u0000\u0000=>\u0005e\u0000\u0000>\u000e\u0001\u0000"+
		"\u0000\u0000?@\u0005^\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005"+
		"{\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0005}\u0000\u0000D\u0014"+
		"\u0001\u0000\u0000\u0000EF\u0005(\u0000\u0000F\u0016\u0001\u0000\u0000"+
		"\u0000GH\u0005)\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IJ\u0005+\u0000"+
		"\u0000J\u001a\u0001\u0000\u0000\u0000KL\u0005-\u0000\u0000L\u001c\u0001"+
		"\u0000\u0000\u0000MN\u0005*\u0000\u0000N\u001e\u0001\u0000\u0000\u0000"+
		"OP\u0005/\u0000\u0000P \u0001\u0000\u0000\u0000QS\u0007\u0001\u0000\u0000"+
		"RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\"\u0001\u0000\u0000\u0000VX\u0007\u0002"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0006\u0011\u0000\u0000\\$\u0001\u0000\u0000\u0000\u0003\u0000TY\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}