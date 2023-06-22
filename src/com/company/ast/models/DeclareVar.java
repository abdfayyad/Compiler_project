package com.company.ast.models;

import com.company.ast.models.Value;
import com.company.ast.nodes.Node;

public class DeclareVar extends Node {
String typeVar;
String id;
String equal;
Value value;
String semicolon;

    public String getTypeVar() {
        return typeVar;
    }

    public void setTypeVar(String typeVar) {
        this.typeVar = typeVar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
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
        if(value!=null)return typeVar+id +equal+value+semicolon;
        else return typeVar +id+semicolon;
    }
}
