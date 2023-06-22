package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class ItemConstructorClass extends Node {
    String thiss;
    String dot;
    String id;
    public String getThiss() {
        return thiss;
    }

    public void setThiss(String thiss) {
        this.thiss = thiss;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
         return " " + thiss  +
                dot  +
                id+" " ;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        return id;
    }
}