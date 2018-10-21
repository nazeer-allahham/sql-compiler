#include <stdio.h>
#include <cstdlib>
#include "scanner.h"

extern int	 yylex();
extern int	 yylineno;
extern char* yytext;

const char* names[] = { "", "db_type", "db_name", "db_table_prefix", "db_port"};

int main(void) {
	
	int ntoken, vtoken;

	ntoken = yylex();
	while (ntoken != 0)
	{
		if (yylex() != COLON) {
			printf("Synatx error at line %d, expected a ':' but found %s\n", yylineno, yytext);
			return 1;
		}

		vtoken = yylex();

		switch (ntoken)
		{
		case TYPE:
		case NAME:
		case TABLE_PREFIX:
			if (vtoken != IDENTIFIER) {
				printf("Synatx error at line %d, expected an identifier but found %s\n", yylineno, yytext);
				return 1;
			}
			printf("%s is set to %s\n", names[ntoken], yytext);
			break;
		case PORT:
			if (vtoken != INTEGER) {
				printf("Syntax errot at line %d, expected an integer but found %d\n", yylineno, yytext);
				return 1;
			}
			printf("%s is set to %s\n", names[ntoken], yytext);
			break;
		default:
			printf("Syntax error at line %d", yylineno);
		}

		ntoken = yylex();
	}

	system("pause");
	return 0;
}