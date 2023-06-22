package com.company.ast.models;

import com.company.ast.models.Call_Constructor;
import com.company.ast.nodes.Node;

public  class NewObject  extends Node {
String Id1;
String Id2;
String equal;
    String neww;
    Call_Constructor call_constructor;
    String semi;
    public String getId1() {
        return Id1;
    }

    public void setId1(String id1) {
        Id1 = id1;
    }

    public void setId2(String id2) {
        Id2 = id2;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public void setNeww(String neww) {
        this.neww = neww;
    }

    public void setCall_constructor(Call_Constructor call_constructor) {
        this.call_constructor = call_constructor;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String getId2() {
        return Id2;
    }

    @Override
    public String toString() {
        return
                 Id1  +
                " " + Id2 +
                " " + equal +
                " " + neww +
                " " + call_constructor +
                " " + semi +
                '\n';
    }

    public String getEqual() {
        return equal;
    }

    public String getNeww() {
        return neww;
    }

    public Call_Constructor getCall_constructor() {
        return call_constructor;
    }

    public String getSemi() {
        return semi;
    }



}