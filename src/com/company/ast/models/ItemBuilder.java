package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ItemBuilder extends Node {
String itemBuilder;
String colon;
String openList;
String buildContext;
String context;
String comma;
String typeInt;
String id ;
String closeList;

    public String getItemBuilder() {
        return itemBuilder;
    }

    public void setItemBuilder(String itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
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

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getTypeInt() {
        return typeInt;
    }

    public void setTypeInt(String typeInt) {
        this.typeInt = typeInt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return itemBuilder + colon + openList + buildContext + context + comma + typeInt + id +closeList ;
    }
}
