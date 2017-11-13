// Generated from C:/Documents and Settings/eg/Рабочий стол/LogParser/src\LogRead.g4 by ANTLR 4.7
package com.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogReadLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IP=7, USER=8, DATE=9, 
		STRING=10, Enum=11, LSQUARE=12, RSQUARE=13, Whitespace=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IP", "USER", "DATE", 
		"STRING", "Enum", "LSQUARE", "RSQUARE", "Whitespace"
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


	public LogReadLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogRead.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\6\b-\n\b\r\b\16\b.\3\t\6\t\62\n\t\r\t\16\t\63\3"+
		"\n\6\n\67\n\n\r\n\16\n8\3\13\3\13\3\13\7\13>\n\13\f\13\16\13A\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fL\n\f\3\r\3\r\3\16\3\16\3\17\6"+
		"\17S\n\17\r\17\16\17T\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\3\2\7\4\2\60\60\62;\4\2C\\c|\6\2//\61<C\\"+
		"c|\4\2$$^^\5\2\13\f\16\17\"\"\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2"+
		"\2\17,\3\2\2\2\21\61\3\2\2\2\23\66\3\2\2\2\25:\3\2\2\2\27K\3\2\2\2\31"+
		"M\3\2\2\2\33O\3\2\2\2\35R\3\2\2\2\37 \7(\2\2 \4\3\2\2\2!\"\7,\2\2\"\6"+
		"\3\2\2\2#$\7-\2\2$\b\3\2\2\2%&\7/\2\2&\n\3\2\2\2\'(\7\u0080\2\2(\f\3\2"+
		"\2\2)*\7#\2\2*\16\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\20\3\2\2\2\60\62\t\3\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\22\3\2\2\2\65\67\t\4\2\2\66\65\3\2\2\2\678\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29\24\3\2\2\2:?\7$\2\2;>\5\27\f\2<>\n\5\2\2=;\3"+
		"\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7"+
		"$\2\2C\26\3\2\2\2DE\7I\2\2EF\7G\2\2FL\7V\2\2GH\7R\2\2HI\7Q\2\2IJ\7U\2"+
		"\2JL\7V\2\2KD\3\2\2\2KG\3\2\2\2L\30\3\2\2\2MN\7]\2\2N\32\3\2\2\2OP\7_"+
		"\2\2P\34\3\2\2\2QS\t\6\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\36"+
		"\3\2\2\2\n\2.\638=?KT\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}