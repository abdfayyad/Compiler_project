package com.company.ast.models;

import com.company.ast.nodes.Node;

public class CallFunction extends Node {
    String id;
    String dot;
    Call_Constructor callConstructor;
    String semicolon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public Call_Constructor getCallConstructor() {
        return callConstructor;
    }

    public void setCallConstructor(Call_Constructor callConstructor) {
        this.callConstructor = callConstructor;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return  id + dot + callConstructor.toString() + semicolon ;
    }
}
