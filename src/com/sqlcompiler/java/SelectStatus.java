package com.sqlcompiler.java;

import javaslang.Tuple;
import javaslang.Tuple2;

import java.util.ArrayList;

class SelectStatus implements Status {
    String key;
    ArrayList<String> tablesSelectStmt;
    ArrayList<String> columnsSelectStmt;
    String whereSelectStmt;
    ArrayList<String> columnsWhereClause;
    ArrayList<String> columnsGroupBy;
    ArrayList<String> columnsOrderBy;
    ArrayList<Tuple2<String, String>> whereInKeys;

    Status parent;

    SelectStatus(Status parent, String statementKey, String columnName) {
        this.parent = parent;
        if (parent != null) {
            ((SelectStatus) this.parent).addWhereInKey(columnName, statementKey);
        }

//        this.columnsGroupBy = new ArrayList<>();
        this.columnsOrderBy = new ArrayList<>();
        this.columnsSelectStmt = new ArrayList<>();
        this.columnsWhereClause = new ArrayList<>();
        this.key = statementKey;
        this.tablesSelectStmt = new ArrayList<>();
        this.whereSelectStmt = "";
        this.whereInKeys = new ArrayList<>();
    }

    private void addWhereInKey(String columnName, String statementKey) {
        System.err.println("XSXSXSXSXSXSXSXSXSXSXSXSXSXSXSXSSXSXSXSXSXSX" + this.key + " " + columnName + "  " + statementKey);
        this.whereInKeys.add(Tuple.of(columnName, statementKey));
    }

    @Override
    public Status parent() {
        return this.parent;
    }
}
