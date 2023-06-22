package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ConditionalOperator extends Node {
    String condOperator;

    public String getCondOperator() {
        return condOperator;
    }

    public void setCondOperator(String condOperator) {
        this.condOperator = condOperator;
    }

    @Override
    public String toString() {
        return condOperator;
    }
}
