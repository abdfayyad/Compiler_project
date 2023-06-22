package com.company.ast.models;

import com.company.ast.models.Text;
import com.company.ast.nodes.Node;

public class Title extends Node {
String title;
String colon;
Text text;
String comma;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        return  title + colon + text.toString() + comma ;
    }
}
