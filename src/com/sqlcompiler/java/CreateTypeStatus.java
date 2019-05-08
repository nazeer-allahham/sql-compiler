package com.sqlcompiler.java;

class CreateTypeStatus extends DataType implements Status {
    Status parent;
    String key;

    CreateTypeStatus(Status parent, String key, int rank, String name) {
        super(rank, name);
        this.parent = parent;
        this.key = key;
        System.out.println(this.key);
    }

    @Override
    public Status parent() {
        return this.parent;
    }
}
