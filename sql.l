%{
    int yylex();
    void yyerror (char *msg);

    #include <iostream>
    #include <cstdlib>
%}

%token select
