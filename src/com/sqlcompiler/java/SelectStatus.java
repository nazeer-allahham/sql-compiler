package com.sqlcompiler.java;

import com.sqlcompiler.kotlin.Condition;
import com.sqlcompiler.kotlin.DesiredColumn;
import com.sqlcompiler.kotlin.Join;
import com.sqlcompiler.kotlin.Where;
import javaslang.Tuple;
import javaslang.Tuple3;

import java.util.ArrayList;
import java.util.Stack;

class SelectStatus implements Status {
    String key;
    String tableSelectStmt;
    String sourceKey;
    ArrayList<DesiredColumn> desiredColumns;
    ArrayList<Where> wheres;
    Stack<Join> joins;
    String whereSelectStmt;
    ArrayList<Condition> columnsWhereClause;
    ArrayList<String> columnsGroupBy;
    ArrayList<String> columnsOrderBy;
    ArrayList<Tuple3<String, String, String>> whereInKeys;

    String combineType;
    String combineSource;
    Boolean distinct;
    Boolean AllColumns;
    Boolean isExistGroupBy;
    Boolean isExistAggregationFun;
    Boolean isColWithoutFun;
    Integer purpose;

    ArrayList<DataType> dataTypes;
    private Status parent;

    private SelectStatus(Status parent, String statementKey) {
        this.parent = parent;
        this.AllColumns = false;
        this.isExistGroupBy = false;
        this.isExistAggregationFun = false;
        this.isColWithoutFun = false;
        this.columnsGroupBy = new ArrayList<>();
        this.columnsOrderBy = new ArrayList<>();
        this.desiredColumns = new ArrayList<>();
        this.columnsWhereClause = new ArrayList<>();
        this.key = statementKey;
        this.tableSelectStmt = "";
        this.whereSelectStmt = "";
        this.whereInKeys = new ArrayList<>();
        this.purpose = 1;
        this.distinct = false;
        this.joins = new Stack<>();
        this.wheres = new ArrayList<>();
        this.dataTypes = new ArrayList<>();
    }

    SelectStatus(Status parent, String statementKey, Integer purpose, String columnName, String columnType, String combineType) {
        this(parent, statementKey);

        if (parent != null) {
            if (columnName != null) {
                ((SelectStatus) this.parent).addWhereInKey(columnName, columnType, statementKey);
            }

            if (purpose == 2) {
                ((SelectStatus) this.parent).sourceKey = statementKey;
                ((SelectStatus) this.parent).tableSelectStmt = null;
            } else if (purpose == 32) {
                ((QueryStatus) this.parent).setQueryKey(statementKey);
            }
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


    private void addWhereInKey(String columnName, String columnType, String statementKey) {
        this.whereInKeys.add(Tuple.of(columnName, columnType, statementKey));
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

    DataType getDataType(String typeName) {
        for (DataType type :
                this.dataTypes) {
            if (type.getName().compareTo(typeName) == 0) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "String" + key +
                "\nString" + tableSelectStmt +
                "\nString" + sourceKey +
                "\nArrayList<DesiredColumn>" + desiredColumns +
                "\nArrayList<Pair<String, ArrayList<Condition>>>" + wheres +
                "\nArrayList<Join> " + joins +
                "\nString" + whereSelectStmt +
                "\nArrayList<Condition> " + columnsWhereClause +
                "\nArrayList<String>" + columnsGroupBy +
                "\nArrayList<String>" + columnsOrderBy +
                "\nArrayList<Tuple3<String, String, String>>" + whereInKeys +
                "\nString" + combineType +
                "\nString" + combineSource +
                "\nBoolean" + distinct +
                "\nBoolean" + AllColumns +
                "\nBoolean" + isExistGroupBy +
                "\nBoolean" + isExistAggregationFun +
                "\nBoolean" + isColWithoutFun +
                "\nInteger" + purpose +
                "\nArrayList<DataType>" + dataTypes +
                "\nStatus" + parent;
    }
}
