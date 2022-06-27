grammar Jalc;

prog:
      stmt+
    ;

stmt:
      expr ';'
    ;

expr:
      '(' expr ')'
    | expr '*' expr
    | expr '/' expr
    | expr '+' expr
    | expr '-' expr
    | NUM
    ;

NUM: [1-9][0-9]*;
WS: [ \t\r\n]+ -> skip;