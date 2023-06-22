package com.company.ast.models;

import com.company.ast.models.MultiplicativeOperator;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class MultiplicativeExpression extends Node {
ArrayList<UnaryExpression>unaryExpressions=new ArrayList<UnaryExpression>();
ArrayList<MultiplicativeOperator> multiplicativeOperator=new ArrayList<MultiplicativeOperator>();

    public ArrayList<UnaryExpression> getUnaryExpressions() {
        return unaryExpressions;
    }

    public void setUnaryExpressions(ArrayList<UnaryExpression> unaryExpressions) {
        this.unaryExpressions = unaryExpressions;
    }

    public ArrayList<MultiplicativeOperator> getMultiplicativeOperator() {
        return multiplicativeOperator;
    }

    public void setMultiplicativeOperator(ArrayList<MultiplicativeOperator> multiplicativeOperator) {
        this.multiplicativeOperator = multiplicativeOperator;
    }

    @Override
    public String toString() {
        String s=new String();
        if(unaryExpressions.size()>0) {
            s += unaryExpressions.get(0).toString();
            for (int i = 1; i < unaryExpressions.size(); i++) {
                s+=multiplicativeOperator.get(i).toString();
                s += unaryExpressions.get(i).toString();
            }
        }
        return s;
    }
}
