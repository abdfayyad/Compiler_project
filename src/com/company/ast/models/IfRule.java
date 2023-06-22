package com.company.ast.models;

import com.company.ast.models.BodyForIfWhile;
import com.company.ast.models.Condition;
import com.company.ast.nodes.Node;

public class IfRule extends Node {
    String iff;
    String openList;
    Condition condition;
    String closeList;
    BodyForIfWhile bodyForIfWhile;
    Elsee elsee;

    public void setElsee(Elsee elsee) {
        this.elsee = elsee;
    }

    public Elsee getElsee() {
        return elsee;
    }

    public String getIff() {
        return iff;
    }

    public void setIff(String iff) {
        this.iff = iff;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
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
      if(this.elsee!=null)return  iff+openList+condition.toString()+closeList+bodyForIfWhile.toString()+elsee.toString();
      else return  iff+openList+condition.toString()+closeList+bodyForIfWhile.toString();
    }
}
