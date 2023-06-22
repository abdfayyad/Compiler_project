package com.company.ast.models;

import com.company.ast.models.Value;
import com.company.ast.nodes.Node;

public class ReturnFunction extends Node {
    String returnn;
    String id;
    Value value;
    String semicolon;

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
       if(value!=null)return returnn+value.toString()+semicolon;
       else return returnn+id+semicolon;
    }
}
