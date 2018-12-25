package com.sqlcompiler.java;

public class MyVisitor extends HplsqlBaseVisitor<String> {
    @Override
    public String visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx) {
        System.out.println("create type statement");
        return visitChildren(ctx);
    }
}