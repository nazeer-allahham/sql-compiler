package com.sqlcompiler.java;

import java.util.Hashtable;
import java.util.LinkedList;

public class SymbolTable {

    Scope currentScope = null;
    Hashtable<Integer, Scope> scopes = new Hashtable<>();

    void allocate() {
        currentScope = new Scope();
        scopes.put(scopes.size(), currentScope);
    }

    void free() {
        scopes.clear();
    }

    Scope lookup(String name) {
        return
    }

    void insert(Symbol symbol) {
        currentScope = currentScope.parent;
    }

    void setAttribute() {

    }

    class Scope {
        int id;
        Hashtable<String, Symbol> attributes;
        Scope parent;
    }

    class Symbol {
        private String name;
    }
}
