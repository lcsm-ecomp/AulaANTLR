// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PRINT=3, IF=4, X=5, EQ=6, WHILE=7, POT=8, ACHA=9, FCHA=10, 
		APAR=11, FPAR=12, PLUS=13, MINUS=14, MUL=15, DIV=16, INT=17, WS=18;
	public static final int
		RULE_programa = 0, RULE_com = 1, RULE_expr = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "com", "expr"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			com();
			setState(7);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ExprParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode X() { return getToken(ExprParser.X, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode ACHA() { return getToken(ExprParser.ACHA, 0); }
		public TerminalNode FCHA() { return getToken(ExprParser.FCHA, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public TerminalNode APAR() { return getToken(ExprParser.APAR, 0); }
		public TerminalNode FPAR() { return getToken(ExprParser.FPAR, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCom(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(PRINT);
				setState(10);
				expr(0);
				setState(11);
				match(T__0);
				}
				break;
			case X:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(X);
				setState(14);
				match(EQ);
				setState(15);
				expr(0);
				setState(16);
				match(T__0);
				}
				break;
			case ACHA:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(ACHA);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 696L) != 0)) {
					{
					{
					setState(19);
					com();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25);
				match(FCHA);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				match(WHILE);
				setState(27);
				match(APAR);
				setState(28);
				expr(0);
				setState(29);
				match(FPAR);
				setState(30);
				com();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(IF);
				setState(33);
				match(APAR);
				setState(34);
				expr(0);
				setState(35);
				match(FPAR);
				setState(36);
				com();
				setState(37);
				match(T__1);
				setState(38);
				com();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode X() { return getToken(ExprParser.X, 0); }
		public TerminalNode APAR() { return getToken(ExprParser.APAR, 0); }
		public TerminalNode FPAR() { return getToken(ExprParser.FPAR, 0); }
		public TerminalNode POT() { return getToken(ExprParser.POT, 0); }
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExprParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43);
				match(INT);
				setState(44);
				expr(6);
				}
				break;
			case 2:
				{
				setState(45);
				match(INT);
				}
				break;
			case 3:
				{
				setState(46);
				match(X);
				}
				break;
			case 4:
				{
				setState(47);
				match(APAR);
				setState(48);
				expr(0);
				setState(49);
				match(FPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(54);
						match(POT);
						setState(55);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012D\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001\n"+
		"\u0001\f\u0001\u0018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001)\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002"+
		"\f\u0002B\t\u0002\u0001\u0002\u0000\u0001\u0004\u0003\u0000\u0002\u0004"+
		"\u0000\u0002\u0001\u0000\u000f\u0010\u0001\u0000\r\u000eK\u0000\u0006"+
		"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u00043\u0001\u0000"+
		"\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000\u0007\b\u0005\u0000\u0000"+
		"\u0001\b\u0001\u0001\u0000\u0000\u0000\t\n\u0005\u0003\u0000\u0000\n\u000b"+
		"\u0003\u0004\u0002\u0000\u000b\f\u0005\u0001\u0000\u0000\f)\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u000f\u0005\u0006\u0000"+
		"\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0001\u0000"+
		"\u0000\u0011)\u0001\u0000\u0000\u0000\u0012\u0016\u0005\t\u0000\u0000"+
		"\u0013\u0015\u0003\u0002\u0001\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0019)\u0005\n\u0000\u0000\u001a"+
		"\u001b\u0005\u0007\u0000\u0000\u001b\u001c\u0005\u000b\u0000\u0000\u001c"+
		"\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\f\u0000\u0000\u001e\u001f"+
		"\u0003\u0002\u0001\u0000\u001f)\u0001\u0000\u0000\u0000 !\u0005\u0004"+
		"\u0000\u0000!\"\u0005\u000b\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0005"+
		"\f\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0002\u0000\u0000&\'"+
		"\u0003\u0002\u0001\u0000\')\u0001\u0000\u0000\u0000(\t\u0001\u0000\u0000"+
		"\u0000(\r\u0001\u0000\u0000\u0000(\u0012\u0001\u0000\u0000\u0000(\u001a"+
		"\u0001\u0000\u0000\u0000( \u0001\u0000\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*+\u0006\u0002\uffff\uffff\u0000+,\u0005\u0011\u0000\u0000"+
		",4\u0003\u0004\u0002\u0006-4\u0005\u0011\u0000\u0000.4\u0005\u0005\u0000"+
		"\u0000/0\u0005\u000b\u0000\u000001\u0003\u0004\u0002\u000012\u0005\f\u0000"+
		"\u000024\u0001\u0000\u0000\u00003*\u0001\u0000\u0000\u00003-\u0001\u0000"+
		"\u0000\u00003.\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u00004@\u0001"+
		"\u0000\u0000\u000056\n\u0007\u0000\u000067\u0005\b\u0000\u00007?\u0003"+
		"\u0004\u0002\b89\n\u0005\u0000\u00009:\u0007\u0000\u0000\u0000:?\u0003"+
		"\u0004\u0002\u0006;<\n\u0004\u0000\u0000<=\u0007\u0001\u0000\u0000=?\u0003"+
		"\u0004\u0002\u0005>5\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000"+
		">;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000\u0005\u0016(3>@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}