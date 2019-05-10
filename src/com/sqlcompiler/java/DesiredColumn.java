package com.sqlcompiler.java;

public class DesiredColumn {
    private String columnName;
    private String functionName;
    private String nameTable;
    private String nameAlias;

    public DesiredColumn(String columnName, String functionName, String nameTable, String nameAlias) {
        this.columnName = columnName;
        this.functionName = functionName;
        this.nameTable = nameTable;
        this.nameAlias = nameAlias;
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
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    @Override
    public String toString() {
        return columnName;
    }
}
