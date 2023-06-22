package com.company.ast.models;

import com.company.ast.models.BodyForIfWhile;
import com.company.ast.nodes.Node;

public class ForIn extends Node {
    String forr;

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    String openList;
    String typeVar;
    String id1 ;
    String id2 ;
    String in;
    String closeList;
    BodyForIfWhile bodyForIfWhile;

    public String getForr() {
        return forr;
    }

    public void setForr(String forr) {
        this.forr = forr;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getTypeVar() {
        return typeVar;
    }

    public void setTypeVar(String typeVar) {
        this.typeVar = typeVar;
    }


    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    public BodyForIfWhile getBodyForIfWhile() {
        return bodyForIfWhile;
    }

    public void setBodyForIfWhile(BodyForIfWhile bodyForIfWhile) {
        this.bodyForIfWhile = bodyForIfWhile;
    }

    @Override
    public String toString() {
        return forr+openList+typeVar+id1+in+id2+closeList+bodyForIfWhile.toString();
    }
}
