package com.sqlcompiler.java;

import com.sqlcompiler.kotlin.Condition;
import com.sqlcompiler.kotlin.Join;
import com.sqlcompiler.kotlin.DesiredColumn;
import javaslang.Tuple;
import javaslang.Tuple2;

import java.util.ArrayList;

class SelectStatus implements Status {
    String joinConditionString;
    String key;
    String tableSelectStmt;
    ArrayList<String> columnsSelectStmt;
    ArrayList<DesiredColumn> desiredColumns;
    ArrayList<Join> joins;
    String whereSelectStmt;
    ArrayList<Condition> columnsWhereClause;
    ArrayList<String> columnsGroupBy;
    ArrayList<String> columnsOrderBy;
    ArrayList<Tuple2<String, String>> whereInKeys;

    String combineType;
    String combineSource;
    Boolean distinct;
    Boolean AllColumns;
    Boolean isExistGroupBy;
    Boolean isExistAggregationFun;
    Boolean isColWithoutFun;
    Integer purpose;

    DataType dataType = null;
    Status parent;

    private SelectStatus(Status parent, String statementKey) {
        this.parent = parent;
        this.AllColumns = false;
        this.isExistGroupBy = false;
        this.isExistAggregationFun = false;
        this.isColWithoutFun = false;
        this.columnsGroupBy = new ArrayList<>();
        this.columnsOrderBy = new ArrayList<>();
        this.desiredColumns = new ArrayList<>();
        this.columnsSelectStmt = new ArrayList<>();
        this.columnsWhereClause = new ArrayList<>();
        this.key = statementKey;
        this.tableSelectStmt = "";
        this.joinConditionString = "";
        this.whereSelectStmt = "";
        this.whereInKeys = new ArrayList<>();
        this.purpose = 1;
        this.distinct = false;
        this.joins = new ArrayList<>();
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

    String columnsNamesToString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < this.desiredColumns.size(); i++) {
            builder.append(this.desiredColumns.get(i).getColumnName());
            if (i < this.desiredColumns.size() - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
