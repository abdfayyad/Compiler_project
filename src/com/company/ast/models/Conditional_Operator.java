package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Conditional_Operator extends Node {

    String conditional_Operator;

    public Conditional_Operator(){}

    public String getConditional_Operator() {
        return this.conditional_Operator;
    }

    public void setConditional_Operator(String conditional_Operator) {
        this.conditional_Operator = conditional_Operator;
    }

    public String toString() {
        return this.conditional_Operator;
    }
}
