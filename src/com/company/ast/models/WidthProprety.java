package com.company.ast.models;

import com.company.ast.nodes.Node;

public class WidthProprety extends Node {
    String width;
    String colon;
    Numberr numberr;
    String comma;

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getColon() {
        return colon;
    }

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = numberr;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }



    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        return width+colon+numberr.toString()+comma;
    }

    @Override
    public String codeGenerationHTML() {
        return "\"width:"+numberr.toString()+"px\"";
    }
}
