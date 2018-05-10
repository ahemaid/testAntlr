grammar Turtle;


start 		    : (directive)* (errors)* ( triples*)? (errors)*;  // leading CODE
directive       : baseDecl
				| prefixDecl 
				| unkonwnDecl
				;
baseDecl 		: baseSparql | base  ;	
unkonwnDecl 	: '@keywords' (CHAR)* '.' {notifyErrorListeners("@keywords is unkown directive in Turtle");}
				;		
baseSparql 		: KW_BASE  IRIREF 
				| '@BASE'   IRIREF '.'  {notifyErrorListeners("Uncorrect form of Base directive");}
				| '@BASE'  IRIREF   {notifyErrorListeners("Uncorrect form of Base  directive");}
				| KW_BASE   IRIREF  '.' {notifyErrorListeners("SPARQL BASE directive should not followed by '.'");}
				;
base 		    : BASE  IRIREF '.' 
				| BASE  IRIREF {notifyErrorListeners("Missing '.' at the end of Base directive");}
				| BASE {notifyErrorListeners("Missing IRI after '@base'");}
				;
prefixDecl		: prefixSparql | prefix ;
prefix		    : PREFIX PNAME_NS IRIREF '.' 
				| PREFIX PNAME_NS IRIREF {notifyErrorListeners("Missing '.' at the end of Prefix directive");}
				| PREFIX PNAME_NS  {notifyErrorListeners("Missing IRI in Prefix directive");}
				| PREFIX   IRIREF '.' {notifyErrorListeners("Missing NameSpace in Prefix directive");}
				;
prefixSparql	: KW_PREFIX PNAME_NS IRIREF {System.out.println("\nNS "+$PNAME_NS.text+"IRI "+$IRIREF.text);}
				| KW_PREFIX PNAME_NS IRIREF '.' {notifyErrorListeners(" extraneous input'.' at the end of Prefix directive");}
				| KW_PREFIX PNAME_NS  '.' {notifyErrorListeners("Missing IRI in Prefix directive");}
				| KW_PREFIX   IRIREF  {notifyErrorListeners("Missing NameSpace in Prefix directive");}
				;
errors			: iri '=' iri '.' {notifyErrorListeners("Turtle is not N3");}
				| '{' subject predicateObjectList '}' {notifyErrorListeners("{ } pattern is not in Turtle");}
				| '{' triples '}' {notifyErrorListeners("{ } pattern is not in Turtle");}
				|  (subject '.')  {notifyErrorListeners("N3 paths cannot be used in Turtle");}
				;
triples 		:  	subject predicateObjectList '.'
		 		|  	subject predicateObjectList ('.')+ ('.')+ {notifyErrorListeners("Too many DOT ");}
		 		|  	subject predicateObjectList  {notifyErrorListeners("Missing '.' at the end of the triple");}		 		
		 		;
subject         :  	iri | blank 
				| booleanLiteral  {notifyErrorListeners("Subject cannot be a boolean value");}
				| rdfLiteral   {notifyErrorListeners("Subject cannot be a string");}
				| numericLiteral  {notifyErrorListeners("Subject cannot be a number");}
				;
blank	        : 	blankNode | blankNodePropertyList | collection 
				| blankNode '.' {notifyErrorListeners("Blank Node cannot be followed by '.'");}
				;
blankNodePropertyList	   :   	'[' (predicateObjectList)* ']' ;
predicateObjectList	   :   	predicate objectList ( ';' predicate objectList )* (';')? 
				| predicate {notifyErrorListeners("Object is missing in the triple");}
				|	'<=' objectList ( ';' predicate objectList )* (';')?  {notifyErrorListeners("'<=' is not in Turtle");}
				;
objectList	   :   	object ( ',' object )* ;
object	   :   	iri | blank | literal 
				;
collection	   :   	'(' object* ')' ;

literal         : rdfLiteral
				| numericLiteral
				| booleanLiteral
				;
// BNF: predicate ::= iri | RDF_TYPE
predicate       : iri
				| rdfType
				| literal {notifyErrorListeners("Predicate cannot be a literal");}
				| blank {notifyErrorListeners("Predicate cannot be a blank node");}
				;
rdfType			: RDF_TYPE ;
datatype        : iri ;

numericLiteral  : INTEGER
				| DECIMAL
				| DOUBLE
				|   INTEGER (CHAR)+ {notifyErrorListeners("Numeric literal cannot have string characters");}
				|   INTEGER '.' (CHAR)+ {notifyErrorListeners("Uncorrect form of a literal");}
				;
rdfLiteral      : string (LANGTAG | '^^' datatype)?
				| string (LANGTAG | '^' datatype)? {notifyErrorListeners("Missing '^' Character");}
				| string (LANGTAG '^^' datatype)? {notifyErrorListeners("Uncorrect form of a Literal");}
				| string ( '^^' datatype LANGTAG)? {notifyErrorListeners("Uncorrect form of a Literal");}
				
			   ;
booleanLiteral  : KW_TRUE
				| KW_FALSE
				;
string          : STRING_LITERAL_LONG1
                | STRING_LITERAL_LONG2
                | STRING_LITERAL_LONG2 '"' {notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");}
                | '"' STRING_LITERAL_LONG2  {notifyErrorListeners("Uncorrect form of long literal with 4 qoutes");}
                | WRONG_STRING_LITERAL_LONG2 {notifyErrorListeners("Missing qoutes of long literal");}
                | STRING_LITERAL1
				| STRING_LITERAL2
				;
iri             : WRONGIRIREF {notifyErrorListeners("Uncorrect form of URI, it should not contain newline");} 
				| IRIREF
				| prefixedName
				;
prefixedName    : PNAME_LN
				| PNAME_NS
				;
blankNode       : BLANK_NODE_LABEL 
				;

// Reserved for future use


// Keywords
KW_BASE 			: B A S E ;
KW_PREFIX       	: P R E F I X  ;
KW_TRUE         	: 'true' ;
KW_FALSE        	: 'false' ;

// terminals
PASS				  : [ \t\r\n]+ -> skip;
COMMENT				  : '#' ~[\r\n]* -> skip;

BASE				  : '@base' ;
PREFIX				  : '@prefix' ;
CODE                  : '{' (~[%\\] | '\\' [%\\] | UCHAR)* '%' '}' ;
RDF_TYPE              : 'a' ;
IRIREF                : '<' (~[\u0000-\u0020=<>"{}|^`\\] | UCHAR)* '>' /* #x00=NULL #01-#x1F=control codes #x20=space */
					  ;
WRONGIRIREF 		  : '<' (~[\u0000-\u0020=<>"{}|^`\\] | UCHAR)* '\\n>'
				      ;
PNAME_NS			  : PN_PREFIX? ':' ;
PNAME_LN			  : PNAME_NS PN_LOCAL
// this is not working since it is related to Lexer not to the parser 
//					  | PNAME_NS PN_LOCAL '^' PN_LOCAL {notifyErrorListeners("Wrong form of a local name");}
					  ;
REGEXP                : '/' (~[/\n\r\\] | '\\' [/nrt\\|.?*+(){}[\]$^-] | UCHAR)+ '/' ;
REGEXP_FLAGS		  : [smix]+ ;
BLANK_NODE_LABEL      : '_:' (PN_CHARS_U | [0-9]) ((PN_CHARS | '.')* PN_CHARS)? ;
LANGTAG               : '@' [a-zA-Z]+ ('-' [a-zA-Z0-9]+)* ;
INTEGER               : [+-]? [0-9]+ ;
DECIMAL               : [+-]? [0-9]* '.' [0-9]+ ;
DOUBLE                : [+-]? ([0-9]+ '.' [0-9]* EXPONENT | '.'? [0-9]+ EXPONENT) ;
CHAR 				  : [a-zA-Z]
					  ;


fragment EXPONENT     : [eE] [+-]? [0-9]+ ;

STRING_LITERAL1       : '\'' (~[\u0027\u005C\u000A\u000D] | ECHAR | UCHAR)* '\'' ; /* #x27=' #x5C=\ #xA=new line #xD=carriage return */
STRING_LITERAL2       : '"' (~[\u0022\u005C\u000A\u000D] | ECHAR | UCHAR)* '"' ;   /* #x22=" #x5C=\ #xA=new line #xD=carriage return */
STRING_LITERAL_LONG1  : '\'\'\'' (('\'' | '\'\'')? (~['\\] | ECHAR | UCHAR))* '\'\'\'' ;
STRING_LITERAL_LONG2  : '"""' (('"' | '""')? (~["\\] | ECHAR | UCHAR))* '"""' ;
WRONG_STRING_LITERAL_LONG2 : '"""' (('"' | '""')? (~["\\] | ECHAR | UCHAR))*  ;
fragment UCHAR                 : '\\u' HEX HEX HEX HEX | '\\U' HEX HEX HEX HEX HEX HEX HEX HEX ;
fragment ECHAR                 : '\\' [tbnrf\\"'] ;

fragment PN_CHARS_BASE 		   : [A-Z] | [a-z] | [\u00C0-\u00D6] | [\u00D8-\u00F6] | [\u00F8-\u02FF] | [\u0370-\u037D]
					   		   | [\u037F-\u1FFF] | [\u200C-\u200D] | [\u2070-\u218F] | [\u2C00-\u2FEF] | [\u3001-\uD7FF]
					           | [\uF900-\uFDCF] | [\uFDF0-\uFFFD]
					   		   ;
fragment PN_CHARS_U            : PN_CHARS_BASE | '_' ;
fragment PN_CHARS              : PN_CHARS_U | '-' | [0-9] | [\u00B7] | [\u0300-\u036F] | [\u203F-\u2040] ;
fragment PN_PREFIX             : PN_CHARS_BASE ((PN_CHARS | '.')* PN_CHARS)? ;
fragment PN_LOCAL              : (PN_CHARS_U | ':' | [0-9] | PLX) ((PN_CHARS | '.' | ':' | PLX)* (PN_CHARS | ':' | PLX))? ;
fragment PLX                   : PERCENT | PN_LOCAL_ESC ;
fragment PERCENT               : '%' HEX HEX ;
fragment HEX                   : [0-9] | [A-F] | [a-f] ;
fragment PN_LOCAL_ESC          : '\\' ('_' | '~' | '.' | '-' | '!' | '$' | '&' | '\'' | '(' | ')' | '*' | '+' | ','
					  		   | ';' | '=' | '/' | '?' | '#' | '@' | '%') ;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');