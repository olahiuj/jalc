grammar Jalc;

@header {
    package antlr;
}

prog: stmt+;

stmt: expr ';'                                      # EvalStmt
    | asgn ';'                                      # AssignStmt
    ;

asgn: lhs=ID '=' rhs=expr
    ;

expr: NUM                                           # Number
    | ID                                            # Identifier
    | '(' inner=expr ')'                            # BracketExpr
    | left=expr operator=(MUL|DIV) right=expr       # MulOrDivExpr
    | left=expr operator=(ADD|SUB) right=expr       # AddOrSubExpr
    ;

NUM : [1-9][0-9]* | '0';
ID  : [a-zA-Z][a-zA-Z_0-9]*;
MUL : '*';
DIV : '/';
ADD : '+';
SUB : '-';

WS  : [ \n\r\t] -> skip;
