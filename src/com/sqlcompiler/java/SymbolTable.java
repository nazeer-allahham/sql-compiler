package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

class SymbolTable {
    private Scope currentScope;
    private boolean state;

    SymbolTable() {
        currentScope = new Scope(null);
    }

    void allocate() {
        currentScope = new Scope(currentScope);
        if (state)
        {
            currentScope.parent.scopeChildren.put(currentScope.parent.lastChildName, currentScope);
        }
    }
    boolean CheckTypeCompatible(String type,String stmt){
        try {
            switch (type) {
                case "int":
                    Integer.parseInt(stmt);
                    break;
            }
        }
        catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    void free() {
        currentScope = currentScope.parent;
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

    void insert(Symbol symbol, boolean state) {
        if (symbol.attribute.equals("variable") && DataTypes.get(symbol.type) == null ) {
            System.err.println(String.format("Type already undefined: %s", symbol.type));
            System.exit(1);
        }
        if (currentScope.children.containsKey(symbol.name)) {
            System.err.println(String.format("Variable already declared: %s", symbol.name));
            System.exit(1);
        }

        this.state = state;
        currentScope.lastChildName = symbol.name;
        currentScope.children.put(symbol.name, symbol);
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
        HashMap<String, Scope> scopeChildren;
        Scope parent;
        String lastChildName;

        Scope(Scope parent) {
            if (parent != null) {
                this.parent = parent;
            }
            this.id = ++ID;
            this.children = new HashMap<>();
            this.scopeChildren = new HashMap<>();
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

        Symbol(String name, String type, @NotNull String attribute) {
            this.name = name;
            this.type = type;
            if (attribute.compareTo("") == 0)
                this.attribute = "variable";
            else
                this.attribute = attribute;
        }

        @Override
        public String toString() {
            return String.format("Symbol { name => %s, type => %s, attribute => %s }", this.name, this.type, this.attribute);
        }
    }
}
