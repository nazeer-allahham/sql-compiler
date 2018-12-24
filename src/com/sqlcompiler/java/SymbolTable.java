package com.sqlcompiler.java;

import java.util.Hashtable;

public class SymbolTable {

    Scope currentScope = null;
    Hashtable<Integer, Scope> scopes = new Hashtable<>();

    void allocate() {
        Scope temp = new Scope();
        temp.parent=currentScope;       //initial parent _ start with null
        temp.id=scopes.size();          //initial id  _  start from 0
        temp.attributes=new Hashtable<>();
        currentScope=temp;
        scopes.put(scopes.size(), temp);
    }

    void free() {
        scopes.clear();
    }

    Scope lookup(String name) {
        //TODO create methods or data Structure for this comments
        int res=0;
        // if the symbol exist in the table (1)
        Scope temp=currentScope;
        while (temp.parent!=null){
            if(temp.attributes.containsKey(name)){
                res=1;
                break;
            }
            temp=temp.parent;
        }

        //if it is declared before it is being used (2)
        temp=currentScope;
        while (temp.parent!=null){
            if(temp.attributes.containsKey(name)){
                res=2;
                break;
            }
            temp=temp.parent;
        }

        //if the name is used in the scope (3)
        if(currentScope.attributes.containsKey(name))res=3;

        // if the symbol is initialized (4)

        //if the symbol declared multiple times (5)
        int count=0;
        temp=currentScope;
        while (temp.parent!=null){
            if(temp.attributes.containsKey(name)){
                count++;
            }
            temp=temp.parent;
        }

        return null;
    }

    void insert(Symbol symbol) {

        symbol.scope_id=currentScope.id;
        currentScope.attributes.put(symbol.name,symbol);
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
        private DataType dataType;
        private int scope_id;
        //private value TODO Checking if we need the value

        public Symbol(String name, DataType dataType, int scope_id) {
            this.name = name;
            this.dataType = dataType;
            this.scope_id = scope_id;
        }
    }


}
