package com.company.ast.models;

import com.company.ast.nodes.Node;

public class DeclarDouble extends Node {
    String finall;
    String typeDouble;
    String id;
    String equal;
    String doublee;
    String semicolon;

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getTypeDouble() {
        return typeDouble;
    }

    public void setTypeDouble(String typeDouble) {
        this.typeDouble = typeDouble;
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

    public String getDoublee() {
        return doublee;
    }

    public void setDoublee(String doublee) {
        this.doublee = doublee;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        if(finall!=null&&doublee!=null)return  finall +  typeDouble + id +  equal +  doublee +  semicolon;
        else if (finall!=null)return  finall +  typeDouble + id +  semicolon;
        else if(doublee!=null)return  typeDouble + id +  equal +  doublee +  semicolon;
        else return  typeDouble + id +  semicolon;
    }
}
