// Generated from Turtle.g4 by ANTLR 4.4
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, KW_BASE=15, KW_PREFIX=16, 
		KW_TRUE=17, KW_FALSE=18, PASS=19, COMMENT=20, BASE=21, PREFIX=22, CODE=23, 
		RDF_TYPE=24, IRIREF=25, PNAME_NS=26, PNAME_LN=27, REGEXP=28, REGEXP_FLAGS=29, 
		BLANK_NODE_LABEL=30, LANGTAG=31, INTEGER=32, DECIMAL=33, DOUBLE=34, CHAR=35, 
		STRING_LITERAL1=36, STRING_LITERAL2=37, STRING_LITERAL_LONG1=38, STRING_LITERAL_LONG2=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "KW_BASE", "KW_PREFIX", "KW_TRUE", 
		"KW_FALSE", "PASS", "COMMENT", "BASE", "PREFIX", "CODE", "RDF_TYPE", "IRIREF", 
		"PNAME_NS", "PNAME_LN", "REGEXP", "REGEXP_FLAGS", "BLANK_NODE_LABEL", 
		"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "CHAR", "EXPONENT", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "UCHAR", 
		"ECHAR", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", 
		"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z"
	};


	public TurtleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Turtle.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u024f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\6\24\u00d7\n\24\r\24\16\24\u00d8\3\24\3\24\3\25\3\25\7\25"+
		"\u00df\n\25\f\25\16\25\u00e2\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u00f9\n\30\f\30\16\30\u00fc\13\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u0106\n\32\f\32\16\32\u0109\13\32\3\32\3\32\3\33\5\33"+
		"\u010e\n\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\6\35\u011a"+
		"\n\35\r\35\16\35\u011b\3\35\3\35\3\36\6\36\u0121\n\36\r\36\16\36\u0122"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u012a\n\37\3\37\3\37\7\37\u012e\n\37\f"+
		"\37\16\37\u0131\13\37\3\37\5\37\u0134\n\37\3 \3 \6 \u0138\n \r \16 \u0139"+
		"\3 \3 \6 \u013e\n \r \16 \u013f\7 \u0142\n \f \16 \u0145\13 \3!\5!\u0148"+
		"\n!\3!\6!\u014b\n!\r!\16!\u014c\3\"\5\"\u0150\n\"\3\"\7\"\u0153\n\"\f"+
		"\"\16\"\u0156\13\"\3\"\3\"\6\"\u015a\n\"\r\"\16\"\u015b\3#\5#\u015f\n"+
		"#\3#\6#\u0162\n#\r#\16#\u0163\3#\3#\7#\u0168\n#\f#\16#\u016b\13#\3#\3"+
		"#\5#\u016f\n#\3#\6#\u0172\n#\r#\16#\u0173\3#\5#\u0177\n#\3$\6$\u017a\n"+
		"$\r$\16$\u017b\3%\3%\5%\u0180\n%\3%\6%\u0183\n%\r%\16%\u0184\3&\3&\3&"+
		"\3&\7&\u018b\n&\f&\16&\u018e\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0196\n\'\f"+
		"\'\16\'\u0199\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u01a4\n(\3(\3(\3(\5"+
		"(\u01a9\n(\7(\u01ab\n(\f(\16(\u01ae\13(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\5)\u01bb\n)\3)\3)\3)\5)\u01c0\n)\7)\u01c2\n)\f)\16)\u01c5\13)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u01df\n*\3+\3+\3+\3,\5,\u01e5\n,\3-\3-\5-\u01e9\n-\3.\3.\5.\u01ed\n"+
		".\3/\3/\3/\7/\u01f2\n/\f/\16/\u01f5\13/\3/\5/\u01f8\n/\3\60\3\60\3\60"+
		"\5\60\u01fd\n\60\3\60\3\60\3\60\7\60\u0202\n\60\f\60\16\60\u0205\13\60"+
		"\3\60\3\60\3\60\5\60\u020a\n\60\5\60\u020c\n\60\3\61\3\61\5\61\u0210\n"+
		"\61\3\62\3\62\3\62\3\62\3\63\5\63\u0217\n\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\3N\3N\2\2O\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K&M\'O(Q)S\2U\2W\2Y\2[\2]\2_\2"+
		"a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\u009b\2\3\2\61\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2\'\'^^\t"+
		"\2\2\"$$>@^^``bb}\177\6\2\f\f\17\17\61\61^^\13\2&&*-/\61AA]`ppttvv}\177"+
		"\6\2kkoouuzz\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2GGgg\6\2\f\f\17"+
		"\17))^^\6\2\f\f\17\17$$^^\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\17\2C\\"+
		"c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f"+
		"\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\7\2//\62"+
		";\u00b9\u00b9\u0302\u0371\u2041\u2042\4\2\60\60<<\5\2\62;CHch\t\2##%\61"+
		"==??ABaa\u0080\u0080\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2IIii\4"+
		"\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2"+
		"[[{{\4\2\\\\||\u0268\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3\u009d"+
		"\3\2\2\2\5\u00a3\3\2\2\2\7\u00a6\3\2\2\2\t\u00a8\3\2\2\2\13\u00aa\3\2"+
		"\2\2\r\u00ac\3\2\2\2\17\u00ae\3\2\2\2\21\u00b0\3\2\2\2\23\u00b2\3\2\2"+
		"\2\25\u00b4\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3\2\2\2"+
		"\35\u00bc\3\2\2\2\37\u00be\3\2\2\2!\u00c3\3\2\2\2#\u00ca\3\2\2\2%\u00cf"+
		"\3\2\2\2\'\u00d6\3\2\2\2)\u00dc\3\2\2\2+\u00e5\3\2\2\2-\u00eb\3\2\2\2"+
		"/\u00f3\3\2\2\2\61\u0100\3\2\2\2\63\u0102\3\2\2\2\65\u010d\3\2\2\2\67"+
		"\u0111\3\2\2\29\u0114\3\2\2\2;\u0120\3\2\2\2=\u0124\3\2\2\2?\u0135\3\2"+
		"\2\2A\u0147\3\2\2\2C\u014f\3\2\2\2E\u015e\3\2\2\2G\u0179\3\2\2\2I\u017d"+
		"\3\2\2\2K\u0186\3\2\2\2M\u0191\3\2\2\2O\u019c\3\2\2\2Q\u01b3\3\2\2\2S"+
		"\u01de\3\2\2\2U\u01e0\3\2\2\2W\u01e4\3\2\2\2Y\u01e8\3\2\2\2[\u01ec\3\2"+
		"\2\2]\u01ee\3\2\2\2_\u01fc\3\2\2\2a\u020f\3\2\2\2c\u0211\3\2\2\2e\u0216"+
		"\3\2\2\2g\u0218\3\2\2\2i\u021b\3\2\2\2k\u021d\3\2\2\2m\u021f\3\2\2\2o"+
		"\u0221\3\2\2\2q\u0223\3\2\2\2s\u0225\3\2\2\2u\u0227\3\2\2\2w\u0229\3\2"+
		"\2\2y\u022b\3\2\2\2{\u022d\3\2\2\2}\u022f\3\2\2\2\177\u0231\3\2\2\2\u0081"+
		"\u0233\3\2\2\2\u0083\u0235\3\2\2\2\u0085\u0237\3\2\2\2\u0087\u0239\3\2"+
		"\2\2\u0089\u023b\3\2\2\2\u008b\u023d\3\2\2\2\u008d\u023f\3\2\2\2\u008f"+
		"\u0241\3\2\2\2\u0091\u0243\3\2\2\2\u0093\u0245\3\2\2\2\u0095\u0247\3\2"+
		"\2\2\u0097\u0249\3\2\2\2\u0099\u024b\3\2\2\2\u009b\u024d\3\2\2\2\u009d"+
		"\u009e\7B\2\2\u009e\u009f\7D\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7U\2\2"+
		"\u00a1\u00a2\7G\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7`\2\2\u00a4\u00a5\7`"+
		"\2\2\u00a5\6\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7\b\3\2\2\2\u00a8\u00a9\7"+
		"]\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7}\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7"+
		"_\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7\177\2\2\u00af\20\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7`\2\2\u00b3\24\3\2\2\2\u00b4\u00b5"+
		"\7$\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7*\2\2\u00b7\30\3\2\2\2\u00b8\u00b9"+
		"\7+\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\34\3\2\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd\36\3\2\2\2\u00be\u00bf\5k\66\2\u00bf\u00c0\5i\65\2\u00c0"+
		"\u00c1\5\u008dG\2\u00c1\u00c2\5q9\2\u00c2 \3\2\2\2\u00c3\u00c4\5\u0087"+
		"D\2\u00c4\u00c5\5\u008bF\2\u00c5\u00c6\5q9\2\u00c6\u00c7\5s:\2\u00c7\u00c8"+
		"\5y=\2\u00c8\u00c9\5\u0097L\2\u00c9\"\3\2\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7g\2\2\u00ce$\3\2\2\2\u00cf"+
		"\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4&\3\2\2\2\u00d5\u00d7\t\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\b\24\2\2\u00db(\3\2\2\2\u00dc\u00e0\7%\2\2"+
		"\u00dd\u00df\n\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\b\25\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7B\2\2\u00e6\u00e7\7d\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7g\2\2\u00ea,\3\2\2\2\u00eb"+
		"\u00ec\7B\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2"+
		"\u00ef\u00f0\7h\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7z\2\2\u00f2.\3\2\2"+
		"\2\u00f3\u00fa\7}\2\2\u00f4\u00f9\n\4\2\2\u00f5\u00f6\7^\2\2\u00f6\u00f9"+
		"\t\4\2\2\u00f7\u00f9\5S*\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\'\2\2\u00fe"+
		"\u00ff\7\177\2\2\u00ff\60\3\2\2\2\u0100\u0101\7c\2\2\u0101\62\3\2\2\2"+
		"\u0102\u0107\7>\2\2\u0103\u0106\n\5\2\2\u0104\u0106\5S*\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7@"+
		"\2\2\u010b\64\3\2\2\2\u010c\u010e\5]/\2\u010d\u010c\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7<\2\2\u0110\66\3\2\2\2\u0111"+
		"\u0112\5\65\33\2\u0112\u0113\5_\60\2\u01138\3\2\2\2\u0114\u0119\7\61\2"+
		"\2\u0115\u011a\n\6\2\2\u0116\u0117\7^\2\2\u0117\u011a\t\7\2\2\u0118\u011a"+
		"\5S*\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\7\61\2\2\u011e:\3\2\2\2\u011f\u0121\t\b\2\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"<\3\2\2\2\u0124\u0125\7a\2\2\u0125\u0126\7<\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u012a\5Y-\2\u0128\u012a\t\t\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2"+
		"\2\u012a\u0133\3\2\2\2\u012b\u012e\5[.\2\u012c\u012e\7\60\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\5["+
		".\2\u0133\u012f\3\2\2\2\u0133\u0134\3\2\2\2\u0134>\3\2\2\2\u0135\u0137"+
		"\7B\2\2\u0136\u0138\t\n\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0143\3\2\2\2\u013b\u013d\7/"+
		"\2\2\u013c\u013e\t\13\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"@\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\t\f\2\2\u0147\u0146\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\t\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"B\3\2\2\2\u014e\u0150\t\f\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0154\3\2\2\2\u0151\u0153\t\t\2\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\7\60\2\2\u0158\u015a\t\t\2\2\u0159\u0158\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"D\3\2\2\2\u015d\u015f\t\f\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2"+
		"\u015f\u0176\3\2\2\2\u0160\u0162\t\t\2\2\u0161\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0169\7\60\2\2\u0166\u0168\t\t\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3"+
		"\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0177\5I%\2\u016d\u016f\7\60\2\2\u016e\u016d\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\t\t\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0177\5I%\2\u0176\u0161\3\2\2\2\u0176\u016e"+
		"\3\2\2\2\u0177F\3\2\2\2\u0178\u017a\t\n\2\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cH\3\2\2\2"+
		"\u017d\u017f\t\r\2\2\u017e\u0180\t\f\2\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\t\t\2\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185J\3\2\2\2"+
		"\u0186\u018c\7)\2\2\u0187\u018b\n\16\2\2\u0188\u018b\5U+\2\u0189\u018b"+
		"\5S*\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7)\2\2\u0190L\3\2\2\2\u0191\u0197"+
		"\7$\2\2\u0192\u0196\n\17\2\2\u0193\u0196\5U+\2\u0194\u0196\5S*\2\u0195"+
		"\u0192\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019b\7$\2\2\u019bN\3\2\2\2\u019c\u019d\7)\2\2\u019d"+
		"\u019e\7)\2\2\u019e\u019f\7)\2\2\u019f\u01ac\3\2\2\2\u01a0\u01a4\7)\2"+
		"\2\u01a1\u01a2\7)\2\2\u01a2\u01a4\7)\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\3\2\2\2\u01a5\u01a9\n\20\2\2"+
		"\u01a6\u01a9\5U+\2\u01a7\u01a9\5S*\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3"+
		"\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a3\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7)\2\2\u01b0\u01b1\7)\2\2\u01b1\u01b2"+
		"\7)\2\2\u01b2P\3\2\2\2\u01b3\u01b4\7$\2\2\u01b4\u01b5\7$\2\2\u01b5\u01b6"+
		"\7$\2\2\u01b6\u01c3\3\2\2\2\u01b7\u01bb\7$\2\2\u01b8\u01b9\7$\2\2\u01b9"+
		"\u01bb\7$\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01c0\n\21\2\2\u01bd\u01c0\5U+\2\u01be"+
		"\u01c0\5S*\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2"+
		"\2\u01c0\u01c2\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\7$\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\7$\2\2\u01c9R\3\2\2\2\u01ca"+
		"\u01cb\7^\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\5e\63"+
		"\2\u01ce\u01cf\5e\63\2\u01cf\u01d0\5e\63\2\u01d0\u01d1\5e\63\2\u01d1\u01df"+
		"\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\7W\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\5e\63\2\u01d6\u01d7\5e\63\2\u01d7\u01d8\5e\63\2\u01d8\u01d9\5e"+
		"\63\2\u01d9\u01da\5e\63\2\u01da\u01db\5e\63\2\u01db\u01dc\5e\63\2\u01dc"+
		"\u01dd\5e\63\2\u01dd\u01df\3\2\2\2\u01de\u01ca\3\2\2\2\u01de\u01d2\3\2"+
		"\2\2\u01dfT\3\2\2\2\u01e0\u01e1\7^\2\2\u01e1\u01e2\t\22\2\2\u01e2V\3\2"+
		"\2\2\u01e3\u01e5\t\23\2\2\u01e4\u01e3\3\2\2\2\u01e5X\3\2\2\2\u01e6\u01e9"+
		"\5W,\2\u01e7\u01e9\7a\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"Z\3\2\2\2\u01ea\u01ed\5Y-\2\u01eb\u01ed\t\24\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01eb\3\2\2\2\u01ed\\\3\2\2\2\u01ee\u01f7\5W,\2\u01ef\u01f2\5[.\2\u01f0"+
		"\u01f2\7\60\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3"+
		"\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f8\5[.\2\u01f7\u01f3\3\2\2\2\u01f7\u01f8\3\2\2"+
		"\2\u01f8^\3\2\2\2\u01f9\u01fd\5Y-\2\u01fa\u01fd\4\62<\2\u01fb\u01fd\5"+
		"a\61\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u020b\3\2\2\2\u01fe\u0202\5[.\2\u01ff\u0202\t\25\2\2\u0200\u0202\5a\61"+
		"\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0205"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0209\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u020a\5[.\2\u0207\u020a\7<\2\2\u0208\u020a\5a\61"+
		"\2\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020c"+
		"\3\2\2\2\u020b\u0203\3\2\2\2\u020b\u020c\3\2\2\2\u020c`\3\2\2\2\u020d"+
		"\u0210\5c\62\2\u020e\u0210\5g\64\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210b\3\2\2\2\u0211\u0212\7\'\2\2\u0212\u0213\5e\63\2\u0213\u0214"+
		"\5e\63\2\u0214d\3\2\2\2\u0215\u0217\t\26\2\2\u0216\u0215\3\2\2\2\u0217"+
		"f\3\2\2\2\u0218\u0219\7^\2\2\u0219\u021a\t\27\2\2\u021ah\3\2\2\2\u021b"+
		"\u021c\t\30\2\2\u021cj\3\2\2\2\u021d\u021e\t\31\2\2\u021el\3\2\2\2\u021f"+
		"\u0220\t\32\2\2\u0220n\3\2\2\2\u0221\u0222\t\33\2\2\u0222p\3\2\2\2\u0223"+
		"\u0224\t\r\2\2\u0224r\3\2\2\2\u0225\u0226\t\34\2\2\u0226t\3\2\2\2\u0227"+
		"\u0228\t\35\2\2\u0228v\3\2\2\2\u0229\u022a\t\36\2\2\u022ax\3\2\2\2\u022b"+
		"\u022c\t\37\2\2\u022cz\3\2\2\2\u022d\u022e\t \2\2\u022e|\3\2\2\2\u022f"+
		"\u0230\t!\2\2\u0230~\3\2\2\2\u0231\u0232\t\"\2\2\u0232\u0080\3\2\2\2\u0233"+
		"\u0234\t#\2\2\u0234\u0082\3\2\2\2\u0235\u0236\t$\2\2\u0236\u0084\3\2\2"+
		"\2\u0237\u0238\t%\2\2\u0238\u0086\3\2\2\2\u0239\u023a\t&\2\2\u023a\u0088"+
		"\3\2\2\2\u023b\u023c\t\'\2\2\u023c\u008a\3\2\2\2\u023d\u023e\t(\2\2\u023e"+
		"\u008c\3\2\2\2\u023f\u0240\t)\2\2\u0240\u008e\3\2\2\2\u0241\u0242\t*\2"+
		"\2\u0242\u0090\3\2\2\2\u0243\u0244\t+\2\2\u0244\u0092\3\2\2\2\u0245\u0246"+
		"\t,\2\2\u0246\u0094\3\2\2\2\u0247\u0248\t-\2\2\u0248\u0096\3\2\2\2\u0249"+
		"\u024a\t.\2\2\u024a\u0098\3\2\2\2\u024b\u024c\t/\2\2\u024c\u009a\3\2\2"+
		"\2\u024d\u024e\t\60\2\2\u024e\u009c\3\2\2\2:\2\u00d8\u00e0\u00f8\u00fa"+
		"\u0105\u0107\u010d\u0119\u011b\u0122\u0129\u012d\u012f\u0133\u0139\u013f"+
		"\u0143\u0147\u014c\u014f\u0154\u015b\u015e\u0163\u0169\u016e\u0173\u0176"+
		"\u017b\u017f\u0184\u018a\u018c\u0195\u0197\u01a3\u01a8\u01ac\u01ba\u01bf"+
		"\u01c3\u01de\u01e4\u01e8\u01ec\u01f1\u01f3\u01f7\u01fc\u0201\u0203\u0209"+
		"\u020b\u020f\u0216\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}