package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ItemCountView extends Node{
String intt;
String id;
    String dot;
    String lengthh;
    public String getIntt() {
        return intt;
    }

    public void setIntt(String intt) {
        this.intt = intt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getLengthh() {
        return lengthh;
    }

    public void setLengthh(String lengthh) {
        this.lengthh = lengthh;
    }

    @Override
    public String toString() {
        if(intt!=null)return null;
        else return id +
                 dot +
                lengthh  ;
    }
}