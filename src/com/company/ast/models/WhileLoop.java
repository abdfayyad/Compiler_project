package com.company.ast.models;

import com.company.ast.models.BodyForIfWhile;
import com.company.ast.models.Condition;
import com.company.ast.nodes.Node;

public class WhileLoop extends Node {
    String whilee;
    String openList;
    Condition condition;
    String closeList;
    BodyForIfWhile bodyForIfWhile;

    public String getWhilee() {
        return whilee;
    }

    public void setWhilee(String whilee) {
        this.whilee = whilee;
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
       return   whilee+openList+condition.toString()+closeList+bodyForIfWhile.toString();
    }
}
