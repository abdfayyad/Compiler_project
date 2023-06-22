package com.company.ast.models;

import com.company.ast.models.PrimaryExpression;
import com.company.ast.nodes.Node;

public class UnaryExpression extends Node {
    String minus;
    UnaryExpression unaryExpression;
    PrimaryExpression primaryExpression;

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public UnaryExpression getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(UnaryExpression unaryExpression) {
        this.unaryExpression = unaryExpression;
    }

    public PrimaryExpression getPrimaryExpression() {
        return primaryExpression;
    }

    public void setPrimaryExpression(PrimaryExpression primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    @Override
    public String toString() {
       if(unaryExpression!=null)return minus+ unaryExpression.toString();
       else return primaryExpression.toString();
    }
}
