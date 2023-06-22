package com.company.ast.models;

import com.company.ast.nodes.Node;

public class AdditiveOperator extends Node {
    String additiveOperator;

    public String getAdditiveOperator() {
        return additiveOperator;
    }

    public void setAdditiveOperator(String additiveOperator) {
        this.additiveOperator = additiveOperator;
    }

    @Override
    public String toString() {
        return additiveOperator;
    }
}
