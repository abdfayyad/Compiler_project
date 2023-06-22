package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Assignment_type extends Node {
    RelationalExpression relationalExpression;
    String id;
    Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setRelationalExpression(RelationalExpression relationalExpression) {
        this.relationalExpression = relationalExpression;
    }



    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        if(this.id!=null) return this.id;
        else if(this.value!=null)return this.value.toString();
        else return this.relationalExpression.toString();
    }

    public RelationalExpression getRelationalExpression() {
        return relationalExpression;
    }
}
