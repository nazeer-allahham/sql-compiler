package com.sqlcompiler.java;

public class QueryStatus implements Status {
    private Status parent;
    private String key;
    private String variableName;
    private String query;
    private String mode;
    private String type;

    QueryStatus(Status parent, String key, String variableName, String mode, String type) {
        this.parent = parent;
        this.key = key;
        this.variableName = variableName;
        this.mode = mode;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    String getVariableName() {
        return variableName;
    }

    String getQuery() {
        return query;
    }

    String getMode() {
        return mode;
    }

    String getType() {
        return type;
    }

    @Override
    public Status parent() {
        return this.parent;
    }

    public void setQueryKey(String query) {
        this.query = query;
    }
}
