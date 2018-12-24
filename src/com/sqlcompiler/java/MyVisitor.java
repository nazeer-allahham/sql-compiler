package com.sqlcompiler.java;

import org.antlr.v4.runtime.tree.ParseTree;

public class MyVisitor extends HplsqlBaseVisitor<String> {
    @Override
    public String visitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        return String.format("create table %s", visit(ctx));
    }

    @Override
    public String visitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx) {
        return String.format("create type %s", visit(ctx));
    }

    @Override
    public String visit(ParseTree tree) {
        return "";
    }
}