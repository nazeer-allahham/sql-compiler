package com.sqlcompiler.java;

import com.sqlcompiler.antlr.HplsqlBaseListener;
import com.sqlcompiler.antlr.HplsqlParser;

import java.util.LinkedList;

public class MyListener extends HplsqlBaseListener {

    private LinkedList<Field> details;

    MyListener()
    {
        try {
            DataTypes.createPrimaryDataType("int", "int");
            DataTypes.createPrimaryDataType("real", "float");
            DataTypes.createPrimaryDataType("string", "char[]");
            DataTypes.createPrimaryDataType("bool", "boolean");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx) {
        super.exitCreate_type_stmt(ctx);

        DataTypes.createSecondaryDataType(ctx.table_name().getText(), this.details);
        this.details = null;
    }

    @Override
    public void enterCreate_type_items_item(HplsqlParser.Create_type_items_itemContext ctx) {
        super.enterCreate_type_items_item(ctx);

        if(this.details == null) {
            details = new LinkedList<>();
        }
        details.add(new Field(ctx.getChild(0).getText(), ctx.getChild(2).getText()));
    }

    @Override
    public void exitCreate_table_stmt(HplsqlParser.Create_table_stmtContext ctx) {
        super.exitCreate_table_stmt(ctx);

        DataTypes.createSecondaryDataType(ctx.table_name().getText(), this.details);
        this.details = null;
    }

    @Override
    public void enterCreate_table_columns_item(HplsqlParser.Create_table_columns_itemContext ctx) {
        super.enterCreate_table_columns_item(ctx);

        if (this.details == null) {
            details = new LinkedList<>();
        }
        details.add(new Field(ctx.getChild(0).getText(), ctx.getChild(1).getText()));
    }
}