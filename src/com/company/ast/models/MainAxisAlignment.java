package com.company.ast.models;

import com.company.ast.nodes.Node;

public class MainAxisAlignment extends Node {
    String mainAAxisAlignment;
    String colon;
    String mainAAxisAlignmentWidget;
    String dot;
    String center;
    String comma;

    public String getMainAAxisAlignment() {
        return mainAAxisAlignment;
    }

    public void setMainAAxisAlignment(String mainAAxisAlignment) {
        this.mainAAxisAlignment = mainAAxisAlignment;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getMainAAxisAlignmentWidget() {
        return mainAAxisAlignmentWidget;
    }

    public void setMainAAxisAlignmentWidget(String mainAAxisAlignmentWidget) {
        this.mainAAxisAlignmentWidget = mainAAxisAlignmentWidget;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        return  mainAAxisAlignment +
                colon + mainAAxisAlignmentWidget +  dot +center +  comma ;
    }
}
