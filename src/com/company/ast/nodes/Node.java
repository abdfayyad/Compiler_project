package com.company.ast.nodes;

public class Node {

    private int scopeID = -1;
    private int line;
    private int col;

    public Node() {
    }

    public int getScopeID() {
        return this.scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return this.line;
    }

    public int getCol() {
        return this.col;
    }
    public  String codeGenerationHTML(){
        return "" ;
    }
    public  String codeGenerationJAVASCRIPT(){return  "";}
}
