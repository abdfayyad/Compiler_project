package com.company.ast.models;

import com.company.ast.models.For_Condition;
import com.company.ast.models.For_Increment;
import com.company.ast.models.For_Initializer_Statement_Terminator;
import com.company.ast.nodes.Node;

public class For_loop_parts extends Node {
    public For_loop_parts(){}
    For_Initializer_Statement_Terminator intial=new For_Initializer_Statement_Terminator();
     For_Condition condition =new For_Condition();
    For_Increment increment=new For_Increment();
    public void setIntial(For_Initializer_Statement_Terminator intial ){this.intial=intial;}
    public For_Initializer_Statement_Terminator getIntial(){return this.intial;}
    public void setCondition(For_Condition condition){this.condition=condition;}
    public For_Condition getCondition(){return this.condition;}
    public void setIncrement(For_Increment increment){this.increment=increment;}
    public For_Increment getIncrement(){return this.increment;}

    @Override
    public String toString() {
        return intial.toString()+condition.toString()+increment.toString();
    }
}
