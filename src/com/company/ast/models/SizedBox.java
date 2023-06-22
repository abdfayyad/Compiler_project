package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class SizedBox extends Node {
    String constt;
    String sizedBox;
    String openList;
    ArrayList<ContainerPropreties> containerPropreties=new ArrayList<ContainerPropreties>();
    String closeList;

    public String getConstt() {
        return constt;
    }

    public void setConstt(String constt) {
        this.constt = constt;
    }

    public String getSizedBox() {
        return sizedBox;
    }

    public void setSizedBox(String sizedBox) {
        this.sizedBox = sizedBox;
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
            s+=containerPropreties.get(i).toString();
        }
        if(constt!=null )return constt+sizedBox+openList+s+closeList;
        else return sizedBox+openList+s+closeList;
      }

    @Override
    public String codeGenerationHTML() {
        String s=new String();
        for(int i=0;i<containerPropreties.size();i++){
            s+=containerPropreties.get(i).codeGenerationHTML();
        }
         return "<div "+s+">"+"</div>";
    }
}/**<div style="height: 200px; width: 300px;">
 <!-- Content here -->
 </div>*/
