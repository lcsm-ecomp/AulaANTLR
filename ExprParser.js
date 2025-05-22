// Generated from Expr.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import ExprListener from './ExprListener.js';
const serializedATN = [4,1,8,22,2,0,7,0,1,0,1,0,1,0,1,0,1,0,1,0,3,0,9,8,
0,1,0,1,0,1,0,1,0,1,0,1,0,5,0,17,8,0,10,0,12,0,20,9,0,1,0,0,1,0,1,0,0,2,
1,0,5,6,1,0,3,4,23,0,8,1,0,0,0,2,3,6,0,-1,0,3,9,5,7,0,0,4,5,5,1,0,0,5,6,
3,0,0,0,6,7,5,2,0,0,7,9,1,0,0,0,8,2,1,0,0,0,8,4,1,0,0,0,9,18,1,0,0,0,10,
11,10,4,0,0,11,12,7,0,0,0,12,17,3,0,0,5,13,14,10,3,0,0,14,15,7,1,0,0,15,
17,3,0,0,4,16,10,1,0,0,0,16,13,1,0,0,0,17,20,1,0,0,0,18,16,1,0,0,0,18,19,
1,0,0,0,19,1,1,0,0,0,20,18,1,0,0,0,3,8,16,18];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class ExprParser extends antlr4.Parser {

    static grammarFileName = "Expr.g4";
    static literalNames = [ null, "'('", "')'", "'+'", "'-'", "'*'", "'/'" ];
    static symbolicNames = [ null, null, null, "PLUS", "MINUS", "MUL", "DIV", 
                             "INT", "WS" ];
    static ruleNames = [ "expr" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = ExprParser.ruleNames;
        this.literalNames = ExprParser.literalNames;
        this.symbolicNames = ExprParser.symbolicNames;
    }

    sempred(localctx, ruleIndex, predIndex) {
    	switch(ruleIndex) {
    	case 0:
    	    		return this.expr_sempred(localctx, predIndex);
        default:
            throw "No predicate with index:" + ruleIndex;
       }
    }

    expr_sempred(localctx, predIndex) {
    	switch(predIndex) {
    		case 0:
    			return this.precpred(this._ctx, 4);
    		case 1:
    			return this.precpred(this._ctx, 3);
    		default:
    			throw "No predicate with index:" + predIndex;
    	}
    };



	expr(_p) {
		if(_p===undefined) {
		    _p = 0;
		}
	    const _parentctx = this._ctx;
	    const _parentState = this.state;
	    let localctx = new ExprContext(this, this._ctx, _parentState);
	    let _prevctx = localctx;
	    const _startState = 0;
	    this.enterRecursionRule(localctx, 0, ExprParser.RULE_expr, _p);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 8;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 7:
	            this.state = 3;
	            this.match(ExprParser.INT);
	            break;
	        case 1:
	            this.state = 4;
	            this.match(ExprParser.T__0);
	            this.state = 5;
	            this.expr(0);
	            this.state = 6;
	            this.match(ExprParser.T__1);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	        this._ctx.stop = this._input.LT(-1);
	        this.state = 18;
	        this._errHandler.sync(this);
	        var _alt = this._interp.adaptivePredict(this._input,2,this._ctx)
	        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
	            if(_alt===1) {
	                if(this._parseListeners!==null) {
	                    this.triggerExitRuleEvent();
	                }
	                _prevctx = localctx;
	                this.state = 16;
	                this._errHandler.sync(this);
	                var la_ = this._interp.adaptivePredict(this._input,1,this._ctx);
	                switch(la_) {
	                case 1:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, ExprParser.RULE_expr);
	                    this.state = 10;
	                    if (!( this.precpred(this._ctx, 4))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
	                    }
	                    this.state = 11;
	                    _la = this._input.LA(1);
	                    if(!(_la===5 || _la===6)) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 12;
	                    this.expr(5);
	                    break;

	                case 2:
	                    localctx = new ExprContext(this, _parentctx, _parentState);
	                    this.pushNewRecursionContext(localctx, _startState, ExprParser.RULE_expr);
	                    this.state = 13;
	                    if (!( this.precpred(this._ctx, 3))) {
	                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
	                    }
	                    this.state = 14;
	                    _la = this._input.LA(1);
	                    if(!(_la===3 || _la===4)) {
	                    this._errHandler.recoverInline(this);
	                    }
	                    else {
	                    	this._errHandler.reportMatch(this);
	                        this.consume();
	                    }
	                    this.state = 15;
	                    this.expr(4);
	                    break;

	                } 
	            }
	            this.state = 20;
	            this._errHandler.sync(this);
	            _alt = this._interp.adaptivePredict(this._input,2,this._ctx);
	        }

	    } catch( error) {
	        if(error instanceof antlr4.error.RecognitionException) {
		        localctx.exception = error;
		        this._errHandler.reportError(this, error);
		        this._errHandler.recover(this, error);
		    } else {
		    	throw error;
		    }
	    } finally {
	        this.unrollRecursionContexts(_parentctx)
	    }
	    return localctx;
	}


}

ExprParser.EOF = antlr4.Token.EOF;
ExprParser.T__0 = 1;
ExprParser.T__1 = 2;
ExprParser.PLUS = 3;
ExprParser.MINUS = 4;
ExprParser.MUL = 5;
ExprParser.DIV = 6;
ExprParser.INT = 7;
ExprParser.WS = 8;

ExprParser.RULE_expr = 0;

class ExprContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = ExprParser.RULE_expr;
    }

	INT() {
	    return this.getToken(ExprParser.INT, 0);
	};

	expr = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ExprContext);
	    } else {
	        return this.getTypedRuleContext(ExprContext,i);
	    }
	};

	MUL() {
	    return this.getToken(ExprParser.MUL, 0);
	};

	DIV() {
	    return this.getToken(ExprParser.DIV, 0);
	};

	PLUS() {
	    return this.getToken(ExprParser.PLUS, 0);
	};

	MINUS() {
	    return this.getToken(ExprParser.MINUS, 0);
	};

	enterRule(listener) {
	    if(listener instanceof ExprListener ) {
	        listener.enterExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof ExprListener ) {
	        listener.exitExpr(this);
		}
	}


}




ExprParser.ExprContext = ExprContext; 
