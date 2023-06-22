package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Expanded extends Node {
    String expanded;
    String openList;
    Child child;
    String closeList;

    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
      if(child!=null)  return expanded+ "\n                   "+openList+ "\n                   "+child.toString()+ "\n                   "+closeList;
        else return expanded+ "\n                   "+openList+closeList;
    }

    @Override
    public String codeGenerationHTML() {
        if(child!=null)  return "<div style=\"display: flex;\">\n" +child.codeGenerationHTML()+"</div>";
        else return null;

    }
}
/**
 * <div style="display: flex;">
 *   <div style="flex: 1;">Child 1</div>
 *   <div style="flex: 2;">Child 2</div>
 *   <div style="flex: 1;">Child 3</div>
 * </div>*/