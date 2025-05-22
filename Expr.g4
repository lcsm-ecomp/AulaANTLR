grammar Expr;

expr: expr ('*'|'/') expr    
    | expr ('+'|'-') expr    
    | INT                        
    | '(' expr ')'              
    ;

PLUS  : '+' ;
MINUS : '-' ;
MUL   : '*' ;
DIV   : '/' ;
INT   : [0-9]+ ;
WS    : [ \t\r\n]+ -> skip ;
