package com.sqlcompiler.java;

import java.util.LinkedList;

public class MyListener extends HplsqlBaseListener {

    private LinkedList<DataType.Attribute> details;

    MyListener()
    {
        try {
            DataType.createPrimaryDataType("int", "int");
            DataType.createPrimaryDataType("real", "float");
            DataType.createPrimaryDataType("string", "char[]");
            DataType.createPrimaryDataType("bool", "boolean");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
    public void exitCreate_type_stmt(HplsqlParser.Create_type_stmtContext ctx) {
        super.exitCreate_type_stmt(ctx);

        DataType.createSecondaryDataType(ctx.table_name().getText(), this.details);
        this.details = null;
    }

    @Override
    public void enterCreate_type_items_item(HplsqlParser.Create_type_items_itemContext ctx) {
        super.enterCreate_type_items_item(ctx);

        if(this.details == null) {
            details = new LinkedList<>();
        }
        details.add(new DataType.Attribute(ctx.getChild(0).getText(), ctx.getChild(2).getText()));
    }
}
