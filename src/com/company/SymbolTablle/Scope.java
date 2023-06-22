package com.company.SymbolTablle;

import java.util.ArrayList;

public class Scope {

    int id  ;
    String name ;

    ArrayList<Symbol> symbols = new ArrayList<>() ;
    Scope parent ;
    String type ;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Scope(Scope parent){
        if (parent != null) {
            this.parent = parent;
            this.id = parent.id + 1;
        }
        else this.id = 0 ;
    }
    public void addSymbol(Symbol symbol) {
        this.symbols.add(symbol);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(ArrayList<Symbol> symbols) {
        this.symbols = symbols;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }
    public void print(){
        System.out.println("scope id is : "+  id );
        System.out.println("name : " +this.name + "     type : " +this.type);
        System.out.println("type       name        value ");
        for (Symbol symbol : symbols){
            symbol.print();
        }
    }
}
