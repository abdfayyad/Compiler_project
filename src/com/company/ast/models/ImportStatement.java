package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ImportStatement extends Node {
    String importt;
    String stringg;
    String semicolon;

    public String getImportt() {
        return importt;
    }

    public void setImportt(String importt) {
        this.importt = importt;
    }

    public String getStringg() {
        return stringg;
    }

    public void setStringg(String stringg) {
        this.stringg = stringg;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return  importt+" " + stringg +  semicolon+"\n";
    }
}
