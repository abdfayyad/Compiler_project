package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Child extends Node {
    String child;
    String colon;
    Widget widget;
    String comma;

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        return child+colon+widget.toString()+comma;
    }

    @Override
    public String codeGenerationHTML() {
        return widget.codeGenerationHTML();
    }
}
