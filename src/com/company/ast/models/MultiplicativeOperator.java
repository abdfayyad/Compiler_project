package com.company.ast.models;

import com.company.ast.nodes.Node;

public class MultiplicativeOperator extends Node {
String multi;

    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    @Override
    public String toString() {
        return multi;
    }
}
