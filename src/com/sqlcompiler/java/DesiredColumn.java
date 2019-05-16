package com.sqlcompiler.java;

import java.util.ArrayList;

public class DesiredColumn {
    String columnName;
    String functionName;
    String nameTable;
    String nameAlias;
    Boolean distinct;
    ArrayList<String> transforms;

    public DesiredColumn() {
        this.columnName = "";
        this.functionName = "";
        this.nameTable = "";
        this.nameAlias = "";
        this.distinct = false;
        this.transforms = new ArrayList<>();
    }

    public DesiredColumn(String columnName, String functionName, String nameTable, String nameAlias, Boolean distinct, ArrayList<String> transforms) {
        this.columnName = columnName;
        this.functionName = functionName;
        this.nameTable = nameTable;
        this.nameAlias = nameAlias;
        this.distinct = distinct;
        this.transforms = transforms;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public String getNameAlias() {
        return DataType.toUnquotedString(nameAlias);
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    void addTransform(String transform) {
        System.out.println(transform);
        this.transforms.add(transform);
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\"").append(this.columnName).append("\"")
                .append(", \"")
                .append(this.functionName)
                .append("\", \"")
                .append(this.nameAlias)
                .append("\", ")
                .append(this.distinct)
                .append(", arrayListOf(");
        for (int i = 0; i < this.transforms.size(); i++) {
            builder.append("\"").append(this.transforms.get(i)).append("\"");
            if (i < this.transforms.size() - 1) {
                builder.append(", ");
            }
        }

        builder.append(")");
        return builder.toString();
    }
}