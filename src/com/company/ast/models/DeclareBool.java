package com.company.ast.models;

import com.company.ast.nodes.Node;

public class DeclareBool extends Node {
    String finall;
    String typeBool;
    String id ;
    String equal;
    String booleann;
    String semicolon;

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getTypeBool() {
        return typeBool;
    }

    public void setTypeBool(String typeBool) {
        this.typeBool = typeBool;
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

    public String getBooleann() {
        return booleann;
    }

    public void setBooleann(String booleann) {
        this.booleann = booleann;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        if(finall!=null&&booleann!=null)  return  finall + typeBool +  id +  equal +  booleann + semicolon ;
        else if(finall!=null )  return  finall + typeBool +  id + semicolon ;
        if(booleann!=null)  return   typeBool +  id +  equal +  booleann + semicolon ;
        else return typeBool +id +semicolon;

    }
}
