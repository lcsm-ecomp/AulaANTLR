grammar Expr;

expr: expr op=('*'|'/') expr     # MulDiv
    | expr op=('+'|'-') expr     # AddSub
    | INT                        # Int
    | '(' expr ')'               # Parens
    ;

PLUS  : '+' ;
MINUS : '-' ;
MUL   : '*' ;
DIV   : '/' ;
INT   : [0-9]+ ;
WS    : [ \t\r\n]+ -> skip ;
