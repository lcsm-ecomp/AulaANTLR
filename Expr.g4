grammar Expr;

programa : com EOF ;

com : PRINT expr ';' 
    | VAR '=' expr ';'
    | '{' com* '}'
    | 'while' '(' expr ')' com
    | 'if' '(' expr ')' com 'else' com ;

expr: expr POT expr
    | INT expr
    | expr ('*'|'/') expr     
    | expr ('+'|'-') expr    
    | INT | STRING | VAR                        
    | '(' expr ')'              
    ;

PRINT : 'print';
IF    : 'if';
WHILE : 'while' ;
VAR   : [a-z]+ ;
EQ    : '=' ;
POT   : '^' ;
ACHA  : '{' ;
FCHA  : '}' ;
APAR  : '(' ;
FPAR  : ')' ;
PLUS  : '+' ;
MINUS : '-' ;
MUL   : '*' ;
DIV   : '/' ;
INT   : [0-9]+ ;
STRING : ["](~'"'|'\\"')*["]; 
WS    : [ \t\r\n]+ -> skip ;
