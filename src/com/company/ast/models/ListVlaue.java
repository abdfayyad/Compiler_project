package com.company.ast.models;

import com.company.ast.models.Value;
import com.company.ast.nodes.Node;

public class ListVlaue extends Node {
    Value value = new Value();
    Call_Constructor call_constructor = new Call_Constructor();

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Call_Constructor getCall_constructor() {
        return call_constructor;
    }

    public void setCall_constructor(Call_Constructor call_constructor) {
        this.call_constructor = call_constructor;
    }


    @Override
    public String toString() {

        if (value.toString() != "") {

            return value.toString();
        } else return call_constructor.toString();

//      else return "";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {

        if (value.toString() != "") {

            return value.toString();
        } else return "new "+ call_constructor.toString();

    }
}