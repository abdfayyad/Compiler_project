package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Type extends Node {
    String typeint;
    String typedouble;
    String typestring;
    String bool;

    public String getTypeint() {
        return typeint;
    }

    public String getTypedouble() {
        return typedouble;
    }

    public String getTypestring() {
        return typestring;
    }

    public String getBool() {
        return bool;
    }

    public void setTypeint(String typeint) {
        this.typeint = typeint;
    }

    public void setTypedouble(String typedouble) {
        this.typedouble = typedouble;
    }

    public void setTypestring(String typestring) {
        this.typestring = typestring;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        if(this.typeint!=null)return this.typeint;
        else if(this.typedouble!=null)return this.typedouble;
        else if(this.typestring!=null)return this.typestring;
        else return this.bool;
    }
}
