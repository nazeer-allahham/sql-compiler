package com.sqlcompiler.java;

public class QueryResultStatus implements Status {
    private String key;
    private Status parent;
    private String variable;
    private String query;
    private String type;

    QueryResultStatus(Status parent, String key, String variable, String query, String type) {
        this.parent = parent;
        this.key = key;
        this.variable = variable;
        this.query = query;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public String getVariable() {
        return variable;
    }

    public String getQuery() {
        return query;
    }

    public String getType() {
        return type;
    }

    @Override
    public Status parent() {
        return this.parent;
    }
}
