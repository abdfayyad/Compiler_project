package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Container extends Node {
    String container;
    String openList;
    ArrayList<ContainerPropreties> containerPropreties=new ArrayList<ContainerPropreties>();
    Child child;
    String closeList;
//Widget widget;
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public ArrayList<ContainerPropreties> getContainerPropreties() {
        return containerPropreties;
    }

    public void setContainerPropreties(ArrayList<ContainerPropreties> containerPropreties) {
        this.containerPropreties = containerPropreties;
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
        String s=new String();
        for(int i=0;i<containerPropreties.size();i++){
            s+=containerPropreties.get(i).toString()+" ";
        }
       if(child!=null) return container+openList +s+child+closeList;
       else return container+openList +s+closeList;
    }

    @Override
    public String codeGenerationHTML() {
if (child.widget!=null)
        return "<div>\n"+child.codeGenerationHTML()+"<div>\n";
return null;
    }
}
/**
 * <div">
 * </div>
 *
 * */