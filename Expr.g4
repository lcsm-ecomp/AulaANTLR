grammar Expr;

programa : com EOF ;

com : PRINT expr ';' 
    | X '=' expr ';'
    | '{' com* '}'
    | 'while' '(' expr ')' com
    | 'if' '(' expr ')' com 'else' com ;

expr: expr POT expr
    | INT expr
    | expr ('*'|'/') expr     
    | expr ('+'|'-') expr    
    | INT | X                        
    | '(' expr ')'              
    ;

PRINT : 'print';
IF    : 'if';
X     : 'x'|'X' ;
EQ    : '=' ;
WHILE : 'while' ;
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
WS    : [ \t\r\n]+ -> skip ;
