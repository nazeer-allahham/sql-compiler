package com.sqlcompiler.java;

public class DesiredColumn {
    private String columnName;
    private String functionName;
    private String nameTable;
    private String nameAlias;
    private Boolean distinct;

    public DesiredColumn() {
        this.columnName = "";
        this.functionName = "";
        this.nameTable = "";
        this.nameAlias = "";
        this.distinct = false;
    }

    public DesiredColumn(String columnName, String functionName, String nameTable, String nameAlias, Boolean distinct) {
        this.columnName = columnName;
        this.functionName = functionName;
        this.nameTable = nameTable;
        this.nameAlias = nameAlias;
        this.distinct = distinct;
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

    @Override
    public String toString() {
        return columnName;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
}