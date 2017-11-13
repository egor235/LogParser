// Generated from C:/Documents and Settings/eg/Рабочий стол/LogParser/src/main/java\LogRead.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogReadParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IP=7, USER=8, DATE=9, 
		STRING=10, Enum=11, LSQUARE=12, RSQUARE=13, Whitespace=14;
	public static final int
		RULE_proc = 0, RULE_date = 1, RULE_unaryOperator = 2;
	public static final String[] ruleNames = {
		"proc", "date", "unaryOperator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'*'", "'+'", "'-'", "'~'", "'!'", null, null, null, null, 
		null, "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "IP", "USER", "DATE", "STRING", 
		"Enum", "LSQUARE", "RSQUARE", "Whitespace"
	};
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
	public String getGrammarFileName() { return "LogRead.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogReadParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProcContext extends ParserRuleContext {
		public List<TerminalNode> IP() { return getTokens(LogReadParser.IP); }
		public TerminalNode IP(int i) {
			return getToken(LogReadParser.IP, i);
		}
		public List<TerminalNode> Whitespace() { return getTokens(LogReadParser.Whitespace); }
		public TerminalNode Whitespace(int i) {
			return getToken(LogReadParser.Whitespace, i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode USER() { return getToken(LogReadParser.USER, 0); }
		public TerminalNode LSQUARE() { return getToken(LogReadParser.LSQUARE, 0); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(LogReadParser.RSQUARE, 0); }
		public TerminalNode STRING() { return getToken(LogReadParser.STRING, 0); }
		public TerminalNode EOF() { return getToken(LogReadParser.EOF, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogReadVisitor ) return ((LogReadVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(IP);
			setState(7);
			match(Whitespace);
			setState(8);
			unaryOperator();
			setState(9);
			match(Whitespace);
			setState(10);
			match(USER);
			setState(11);
			match(Whitespace);
			setState(12);
			match(LSQUARE);
			setState(13);
			date();
			setState(14);
			match(RSQUARE);
			setState(15);
			match(Whitespace);
			setState(16);
			match(STRING);
			setState(17);
			match(Whitespace);
			setState(18);
			match(IP);
			setState(19);
			match(Whitespace);
			setState(20);
			match(IP);
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Whitespace) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DATE() { return getTokens(LogReadParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(LogReadParser.DATE, i);
		}
		public TerminalNode Whitespace() { return getToken(LogReadParser.Whitespace, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogReadVisitor ) return ((LogReadVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(DATE);
			setState(24);
			match(Whitespace);
			setState(25);
			match(DATE);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogReadListener ) ((LogReadListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogReadVisitor ) return ((LogReadVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\2\2\5\2\4\6\2\4\3\3\20\20\3\2\3\b"+
		"\2\34\2\b\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\t\7\t\2\2\t\n\7\20\2\2\n"+
		"\13\5\6\4\2\13\f\7\20\2\2\f\r\7\n\2\2\r\16\7\20\2\2\16\17\7\16\2\2\17"+
		"\20\5\4\3\2\20\21\7\17\2\2\21\22\7\20\2\2\22\23\7\f\2\2\23\24\7\20\2\2"+
		"\24\25\7\t\2\2\25\26\7\20\2\2\26\27\7\t\2\2\27\30\t\2\2\2\30\3\3\2\2\2"+
		"\31\32\7\13\2\2\32\33\7\20\2\2\33\34\7\13\2\2\34\5\3\2\2\2\35\36\t\3\2"+
		"\2\36\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}