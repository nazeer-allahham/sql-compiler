package com.sqlcompiler.java;

import java.util.HashMap;

class SymbolTable {

    private Scope currentScope = null;

    void allocate() {
        currentScope = new Scope(currentScope);
    }

    void free() {
        while (currentScope != null) {
            currentScope = currentScope.parent;
        }
    }

    Symbol lookup(String name) {
        Scope temp = currentScope;
        do {
            if (temp.children.containsKey(name))
                return temp.children.get(name);
            temp = temp.parent;
        } while (temp != null);
        return null;
    }

    void insert(Symbol symbol) {
        if (currentScope.children.containsKey(symbol.name)) {
            System.err.println(String.format("Variable already declared : %s", symbol));
            System.exit(1);
        }
        currentScope.children.put(symbol.name, symbol);
    }

    void setAttribute() {

    }

    void getAttribute() {

    }

    void print() {
        Scope temp = currentScope;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.parent;
        }
    }

    static class Scope {
        private static int ID = 0;
        int id;
        HashMap<String, Symbol> children;
        Scope parent;

        Scope(Scope parent) {
            if (parent != null) {
                this.parent = parent;
            }
            this.id = ++ID;
            this.children = new HashMap<>();
        }

        @Override
        public String toString() {
            StringBuilder mString = new StringBuilder("Scope").append(id).append('{');
            for (Symbol sym : children.values())
                mString.append(sym).append('\n');
            mString.append('}');
            return mString.toString();
        }
    }

    public static class Symbol {
        private String name;
        private String type;
        private String attribute;

        Symbol(String name, String type, String attribute) {
            this.name = name;
            this.type = type;
            this.attribute = attribute;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        @Override
        public String toString() {
            return String.format("symbol { name => %s, type => %s, attribute => %s }", this.name, this.type, this.attribute);
        }
    }
}
