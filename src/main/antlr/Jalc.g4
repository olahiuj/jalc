grammar Jalc;

prog:
      stmt+
    ;

stmt:
      expr NEWLINE
    ;

expr:
      expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | NUM
    ;

NEWLINE: '\n';
NUM: [1-9][0-9]+;
WS: [ \t\n\r]+ -> skip;