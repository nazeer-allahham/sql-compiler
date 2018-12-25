package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class SymbolTable {


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
        try {
            if (currentScope.children.containsKey(symbol.name)) {
                throw new Exception(String.format("IllegalStateSymbol <%s>", symbol.name));
            }
            currentScope.children.put(symbol.name, symbol);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setAttribute() {

    }

    void getAttribute() {

    }

    class Scope {
        int id;
        HashMap<String, Symbol> children;
        Scope parent;

        Scope(@NotNull Scope parent) {
            this.parent = parent;
            this.id = parent.children.size() + parent.id + 1;
            this.children = new HashMap<>();
        }
    }

    class Symbol {
        private String name;
        private String type;
        private String attribute;

        Symbol() {

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
    }
}
