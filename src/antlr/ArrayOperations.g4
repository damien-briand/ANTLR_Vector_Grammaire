grammar ArrayOperations;

/** Simple grammar on vector operations */
/* GRAMMAR RULES, annotated; lowercase letters */
program : (instruction)+ EOF;

instruction : simpleop      #simpleopinstruction
            | vardecl       #vardeclinstruction
            | affectation   #affectationinstruction
            | varout        #varoutinstruction // print variable
            | varin         #varininstruction // read variable
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
        | INT_TYPE ID '=' ID ';'        #initvarvar
        | ARRAY_TYPE ID '=' ID ';'      #initvararrayvar
        | INT_TYPE ID '=' simpleop      #initvarop
        | ARRAY_TYPE ID '=' simpleop    #initvararrayop
;

affectation : ID '=' simpleop   #affectsimpleop
            | ID '=' array ';'  #affectarray
            | ID '=' INT ';'    #affectint
            | ID '=' ID ';'     #affectvar
;

varout : PRINT ID ';'
;

varin : READ ID ';' // read variable
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
PRINT : 'print';
READ : 'read';
ID : [a-z][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip ;
// Define whitespace rule, toss it out