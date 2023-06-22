package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ClassObject extends Node {
    String id1;
    String id2;
    String equal;
    String neww;
    Call_Constructor callConstructor=new Call_Constructor();
    String semicolon;

    public Call_Constructor getCallConstructor() {
        return callConstructor;
    }

    public void setCallConstructor(Call_Constructor callConstructor) {
        this.callConstructor = callConstructor;
    }

    public String getId1() {
        return id1;
    }

    public String getId2() {
        return id2;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }



    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getNeww() {
        return neww;
    }

    public void setNeww(String neww) {
        this.neww = neww;
    }

    @Override
    public String toString() {
     if(neww!=null) return  id1 + id2+equal + neww + callConstructor.toString() +semicolon;
else    return  id1 +id2+ equal  +callConstructor.toString()+semicolon;

    }
}
