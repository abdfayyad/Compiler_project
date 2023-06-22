package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Operator extends Node {
    String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return operator;
    }
}
