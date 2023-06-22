package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ObjectCall extends Node{
    String id2;
    String id1;
    String dot;

    public String getId1() {
        return id1;
    }

    @Override
    public String toString() {
        return
                "" + id1  +
                        dot +
                        id2 + ' ' ;

    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }





}