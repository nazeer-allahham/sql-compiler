package com.sqlcompiler.java;

public class MyListener extends HplsqlBaseListener {

    private int numberOfLines = 1;

    @Override
    public void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        super.enterSelect_stmt(ctx);

        System.out.println("Select statement entered");
    }

    @Override
    public void exitSelect_stmt(HplsqlParser.Select_stmtContext ctx) {
        super.exitSelect_stmt(ctx);

        System.out.println("Select statement exited");
    }

    @Override
    public void enterNon_balanced_bool_expr(HplsqlParser.Non_balanced_bool_exprContext ctx) {
        super.enterNon_balanced_bool_expr(ctx);

        System.out.printf("Syntax error at line %d: non balanced parenthesis", numberOfLines);
    }

    @Override
    public void enterNew_line(HplsqlParser.New_lineContext ctx) {
        super.enterNew_line(ctx);

        this.numberOfLines ++;
    }

    @Override
    public void enterInvalid_variable_name(HplsqlParser.Invalid_variable_nameContext ctx) {
        super.enterInvalid_variable_name(ctx);

        System.out.printf("syntax error at line %d: invalid variable name.", numberOfLines);
    }
}
