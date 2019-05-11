package com.sqlcompiler.java;

import javaslang.Tuple;
import javaslang.Tuple2;

import java.util.ArrayList;

class SelectStatus implements Status {
    String key;
    ArrayList<String> tablesSelectStmt;
    ArrayList<String> columnsSelectStmt;
    ArrayList<DesiredColumn> desiredColumns;
    String whereSelectStmt;
    String nameTable;// change when we use alias name table
    ArrayList<String> columnsWhereClause;
    ArrayList<String> columnsGroupBy;
    ArrayList<String> columnsOrderBy;
    ArrayList<Tuple2<String, String>> whereInKeys;

    String combineType;
    String combineSource;
    Integer purpose;

    Status parent;

    SelectStatus(Status parent, String statementKey) {
        this.parent = parent;

//        this.columnsGroupBy = new ArrayList<>();
        this.columnsOrderBy = new ArrayList<>();
        this.desiredColumns = new ArrayList<>();
        this.columnsSelectStmt = new ArrayList<>();
        this.columnsWhereClause = new ArrayList<>();
        this.key = statementKey;
        this.tablesSelectStmt = new ArrayList<>();
        this.whereSelectStmt = "";
        this.whereInKeys = new ArrayList<>();
        this.purpose = 1;
    }

    SelectStatus(Status parent, String statementKey, Integer purpose, String columnName, String combineType) {
        this(parent, statementKey);

        if (parent != null && columnName != null) {
            ((SelectStatus) this.parent).addWhereInKey(columnName, statementKey);
        }

        if (parent != null && combineType != null) {
            ((SelectStatus) this.parent).setCombineData(combineType, statementKey);
        }

        if (purpose != null) {
            this.purpose = purpose;
        }
    }

    private void setCombineData(String combineType, String statementKey) {
        System.out.println(combineType + "\t" + statementKey);
        this.combineType = combineType;
        this.combineSource = statementKey;
    }


    private void addWhereInKey(String columnName, String statementKey) {
        this.whereInKeys.add(Tuple.of(columnName, statementKey));
    }

    @Override
    public Status parent() {
        return this.parent;
    }
}
