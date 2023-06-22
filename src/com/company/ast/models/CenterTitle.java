package com.company.ast.models;

import com.company.ast.nodes.Node;

public class CenterTitle extends Node {
String centerTitle;
String colon;
String booleann;

    public String getCenterTitle() {
        return centerTitle;
    }

    public void setCenterTitle(String centerTitle) {
        this.centerTitle = centerTitle;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getBooleann() {
        return booleann;
    }

    public void setBooleann(String booleann) {
        this.booleann = booleann;
    }

    @Override
    public String toString() {
        return centerTitle+colon+booleann;
    }
}
