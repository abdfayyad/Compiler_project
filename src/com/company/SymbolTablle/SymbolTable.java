package com.company.SymbolTablle;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    int mainCont = 0 ;

    ArrayList<Scope> scopes = new ArrayList<>() ;
    Stack<Scope> scopesStack = new Stack<>() ;
    public int getMainCont() {
        return mainCont;
    }

    public void setMainCont() {
        this.mainCont++;
    }



    public Scope getScopeByID(int id) {
        for (Scope scope : scopes) {
            if (scope.getId() == id) {
                return scope;
            }
        }
        return null;
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public Stack<Scope> getScopesStack() {
        return scopesStack;
    }

    public void setScopesStack(Stack<Scope> scopesStack) {
        this.scopesStack = scopesStack;
    }

    public void print (){
        for (Scope scope : scopes){
            scope.print();
        }
    }
    public void printfather (Scope scope){
        scope.print();
        System.out.println("father ");
        scope.getParent().print();
        System.out.println("his father  ");
        scope.getParent().getParent().print();
    }
}
