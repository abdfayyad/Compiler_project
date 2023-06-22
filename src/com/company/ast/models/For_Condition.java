package com.company.ast.models;

import com.company.ast.models.ConditionalOperator;
import com.company.ast.models.ValueConstructor;
import com.company.ast.nodes.Node;

public class For_Condition extends Node {
    public For_Condition(){}
    String id;
    ConditionalOperator cond_op =new ConditionalOperator();
    ValueConstructor value_construct =new ValueConstructor();
    String semi;
    public void setId(String id){this.id=id;}
    public String getId(){return this.id;}
    public void setCond_op(ConditionalOperator cond_op){this.cond_op=cond_op;}
    public ConditionalOperator getCond_op(){return this.cond_op;}
    public ValueConstructor getValue_construct(){return this.value_construct;}
    public void setValue_construct(ValueConstructor value_construct ){this.value_construct=value_construct;}
    public void setSemi(String semi){this.semi=semi;}
    public String getSemi(){return this.semi;}

    @Override
    public String toString() {
       return  id+cond_op.toString()+value_construct.toString()+semi;
    }
}
