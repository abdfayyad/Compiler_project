package com.company.ast.models;

import com.company.ast.nodes.Node;

public class NoArguments extends Node {
    String openList;
    String closeList;

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return  openList +closeList ;
    }
}
