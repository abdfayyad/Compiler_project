package com.company.ast.models;

import com.company.ast.nodes.Node;

public class  WidgetBuild extends Node {
    String override;
    String typeWidget;
    String build;
    String openList;
    String buildContext;
    String context;
    String closeList;
    String blockOpen;
    String returnn;
    Widget widget;
    String semicolon;
    String blockClose;

    public String getOverride() {
        return override;
    }

    public void setOverride(String override) {
        this.override = override;
    }

    public String getTypeWidget() {
        return typeWidget;
    }

    public void setTypeWidget(String typeWidget) {
        this.typeWidget = typeWidget;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getBuildContext() {
        return buildContext;
    }

    public void setBuildContext(String buildContext) {
        this.buildContext = buildContext;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {
        this.returnn = returnn;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    @Override
    public String toString() {
        return  "\n"+ override +"\n"+ typeWidget +" "+ build + openList + buildContext+" " + context + closeList +blockOpen+"\n" + returnn +" "+ widget +semicolon + blockClose+"\n"  ;
    }
}
