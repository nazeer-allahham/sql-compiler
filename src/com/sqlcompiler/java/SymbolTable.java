package com.sqlcompiler.java;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

class SymbolTable {
    private Scope currentScope;
    private boolean state;
    public HashMap<String, Symbol> AllSymbol=new HashMap<>();
    public ArrayList<String> nameSymbols=new ArrayList<>();

    SymbolTable() {
        currentScope = new Scope(null);
    }

    void allocate() {
        currentScope = new Scope(currentScope);
        if (state) {
            currentScope.parent.scopeChildren.put(currentScope.parent.lastChildName, currentScope);
        }
    }

    boolean CheckTypeCompatible(String type, String stmt) {
        try {
            switch (type) {
                case "int":
                    Integer.parseInt(stmt);
                    break;
            }
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    void isUnassignedVariable(){
        for (String sname : nameSymbols)
            if (!AllSymbol.get(sname).isAssigned)
                System.err.println("Warring unassigned variable "+sname);

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
        if (symbol.attribute.equals("variable") && DataTypes.get(symbol.type) == null) {
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
        AllSymbol.put(symbol.name, symbol);
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
        private boolean isAssigned=false;

        Symbol(String name, String type, @NotNull String attribute) {
            this.name = name;
            this.type = type;
            if (attribute.compareTo("") == 0)
                this.attribute = "variable";
            else
                this.attribute = attribute;
        }

        public Symbol(Symbol symbol){
            this.name=symbol.name;
            this.type=symbol.type;
            this.attribute=symbol.attribute;
            this.isAssigned=symbol.isAssigned;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public void setAssigned(boolean assigned) {
            isAssigned = assigned;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public String getAttribute() {
            return attribute;
        }

        public boolean isAssigned() {
            return isAssigned;
        }

        public Symbol(String name, String type, String attribute, boolean isAssigned) {
            this.name = name;
            this.type = type;
            this.attribute = attribute;
            this.isAssigned = isAssigned;
        }

        @Override
        public String toString() {
            return String.format("Symbol { name => %s, type => %s, attribute => %s }", this.name, this.type, this.attribute);
        }
    }
}
