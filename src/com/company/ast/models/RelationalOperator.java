package com.company.ast.models;

import com.company.ast.nodes.Node;

public class RelationalOperator extends Node {
String relaOperator;

    public String getRelaOperator() {
        return relaOperator;
    }

    public void setRelaOperator(String relaOperator) {
        this.relaOperator = relaOperator;
    }

    @Override
    public String toString() {
        return relaOperator;
    }
}
