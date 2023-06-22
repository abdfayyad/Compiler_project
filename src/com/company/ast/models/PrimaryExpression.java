package com.company.ast.models;

import com.company.ast.models.RelationalExpression;
import com.company.ast.nodes.Node;

public class PrimaryExpression extends Node {
Numberr numberr;
String id;
String openList;
RelationalExpression relationalExpression;
String closeList;

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = numberr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public RelationalExpression getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(RelationalExpression relationalExpression) {
        this.relationalExpression = relationalExpression;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
      if(numberr!=null)return numberr.toString();
      else if(id!=null)return id;
      else return openList+relationalExpression.toString()+closeList+"\n";
    }
}
