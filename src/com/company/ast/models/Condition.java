package com.company.ast.models;

import com.company.ast.models.ConditionObject;
import com.company.ast.models.Operator;
import com.company.ast.nodes.Node;

public class Condition extends Node {
    ConditionObject conditionObject1;
    Operator operator;
    ConditionObject conditionObject2 ;

    public ConditionObject getConditionObject2() {
        return conditionObject2;
    }

    public void setConditionObject2(ConditionObject conditionObject2) {
        this.conditionObject2 = conditionObject2;
    }

    public ConditionObject getConditionObject() {
        return conditionObject1;
    }

    public void setConditionObject(ConditionObject conditionObject) {
        this.conditionObject1 = conditionObject;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return conditionObject1.toString()+operator.toString()+conditionObject2.toString();
    }
}
