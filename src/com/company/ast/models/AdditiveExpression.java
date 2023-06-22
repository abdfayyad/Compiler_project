package com.company.ast.models;

import com.company.ast.models.AdditiveOperator;
import com.company.ast.models.MultiplicativeExpression;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class AdditiveExpression extends Node {
ArrayList<MultiplicativeExpression>multiplicativeExpressions=new ArrayList<MultiplicativeExpression>();
        ArrayList<AdditiveOperator> additiveOperators=new ArrayList<AdditiveOperator>();

    public ArrayList<MultiplicativeExpression> getMultiplicativeExpressions() {
        return multiplicativeExpressions;
    }

    public void setMultiplicativeExpressions(ArrayList<MultiplicativeExpression> multiplicativeExpressions) {
        this.multiplicativeExpressions = multiplicativeExpressions;
    }

    public ArrayList<AdditiveOperator> getAdditiveOperators() {
        return additiveOperators;
    }

    public void setAdditiveOperators(ArrayList<AdditiveOperator> additiveOperators) {
        this.additiveOperators = additiveOperators;
    }

    @Override
    public String toString() {
        String s=new String();
        if(multiplicativeExpressions.size()>0) {
            s += multiplicativeExpressions.get(0).toString();
            for (int i = 1; i < multiplicativeExpressions.size(); i++) {
                s+=additiveOperators.get(i).toString();
                s += multiplicativeExpressions.get(i).toString();
            }
        }
        return s;
    }
}
