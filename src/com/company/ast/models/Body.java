package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Body extends Node {
    String body;
    String colon;
    Widget widget;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    @Override
    public String toString() {
        return  body + colon + widget.toString();
    }

    @Override
    public String codeGenerationHTML() {
return widget.codeGenerationHTML()

        ;
    }
}
