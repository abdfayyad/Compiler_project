package com.company.SymbolTablle;

import java.util.ArrayList;

public class Symbol {

    String name;
    String type;
    String value;
    Scope scope;
    boolean isVar = false;
    String isNewVar = "false";
    boolean isFinal = false;


    ArrayList<String> listPar = new ArrayList<String>() ;




    public ArrayList<String> getListPar() {
        return listPar;
    }

    public void setListPar(ArrayList<String> listPar) {
        this.listPar = listPar;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }


    public Symbol(String name){
        this.name = name ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String tybe) {
        this.type = tybe;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isVar() {
        return isVar;
    }

    public void setVar(boolean var) {
        isVar = var;
    }

    public String isNewVar() {
        return isNewVar;
    }

    public void setNewVar(String newVar) {
        isNewVar = newVar;
    }

    public void print(){
        if (this.type == "list") {
            System.out.println(this.type + "    " + this.name + "    value is : ");
            for (String arg : this.getListPar()) System.out.print(arg + " - ");
            System.out.println();
        }
        System.out.println(this.type + "    " + "    " + name + "   " + value + "   ");
    }
}
