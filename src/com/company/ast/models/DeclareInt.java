package com.company.ast.models;

import com.company.ast.nodes.Node;

public class DeclareInt extends Node {
    String finall;
    String typeInt;
    String id;
    String equal;
    String intt;
    String semicolon;

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getTypeInt() {
        return typeInt;
    }

    public void setTypeInt(String typeInt) {
        this.typeInt = typeInt;
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

    public String getIntt() {
        return intt;
    }

    public void setIntt(String intt) {
        this.intt = intt;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        if(finall!=null&&intt!=null)return  finall +  typeInt + id +  equal +  intt +  semicolon;
        else if (finall!=null)return  finall +  typeInt + id +  semicolon;
       else if(intt!=null)return  typeInt + id +  equal +  intt +  semicolon;
       else return  typeInt + id +  semicolon;
    }
}
