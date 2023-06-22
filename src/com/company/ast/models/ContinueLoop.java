package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ContinueLoop extends Node {
    String continuee;
    String semicolon;

    public String getContinuee() {
        return continuee;
    }

    public void setContinuee(String continuee) {
        this.continuee = continuee;
    }


    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return continuee+semicolon;
    }
}
