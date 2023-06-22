package com.company.ast.models;

import com.company.ast.models.RelationalOperator;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class RelationalExpression extends Node {
ArrayList<AdditiveExpression>additiveExpressions=new ArrayList<AdditiveExpression>();
ArrayList<RelationalOperator> relationalOperators=new ArrayList<RelationalOperator>();

    public ArrayList<AdditiveExpression> getAdditiveExpressions() {
        return additiveExpressions;
    }

    public void setAdditiveExpressions(ArrayList<AdditiveExpression> additiveExpressions) {
        this.additiveExpressions = additiveExpressions;
    }

    public ArrayList<RelationalOperator> getRelationalOperators() {
        return relationalOperators;
    }

    public void setRelationalOperators(ArrayList<RelationalOperator> relationalOperators) {
        this.relationalOperators = relationalOperators;
    }

    @Override
    public String toString() {
        String s=new String();
        if(additiveExpressions.size()>0) {
            s += additiveExpressions.get(0).toString();
            for (int i = 1; i < additiveExpressions.size(); i++) {
                s+=relationalOperators.get(i).toString();
                s += additiveExpressions.get(i).toString();
            }
        }
        return s;
    }
}
