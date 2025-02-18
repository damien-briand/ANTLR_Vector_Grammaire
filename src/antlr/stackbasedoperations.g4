grammar stackbasedoperations;

/** Simple grammar on vector operations */
/* GRAMMAR RULES, annotated; lowercase letters */
program : (instruction)+ EOF;

instruction : simpleop      #simpleopinstruction
            | vardecl       #vardeclinstruction
            | affectation   #affectationinstruction
            | varout        #varoutinstruction // print variable
;

simpleop : SUM array ';'    #sum
        | PROD array ';'    #prod
        | MAX array ';'     #max
        | MIN array ';'     #min
        | SORT array ';'    #sort
;

vardecl : ARRAY_TYPE ID ';'             #vararray
        | ARRAY_TYPE ID '=' array ';'   #initvararray
        | INT_TYPE ID ';'               #varint
        | INT_TYPE ID '=' INT ';'       #initvarint
;

affectation : ID '=' simpleop   #affectsimpleop
            | ID '=' array ';'  #affectarray
            | ID '=' INT ';'    #affectint
;

varout : ID ';'
;

array : '[' INT (',' INT)* ']';
/** LEXER RULES, they use UPPERCASE letters */
INT : '0' | [1-9][0-9]* ;
// Define token INT as 0 or [1-9] followed by digits
SUM : 'sum';
PROD : 'prod';
MAX : 'max';
MIN : 'min';
SORT : 'sort';

ARRAY_TYPE : 'array';
INT_TYPE : 'int'; // IDENTIFIERS, after the keywords
ID : [a-z][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ;
// Define whitespace rule, toss it out