package com.company.ast.models;

import com.company.ast.nodes.Node;

public class HeightProprety extends Node {
String height;
String colon;
Numberr numberr;
String comma;

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = numberr;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColon() {
        return colon;
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
        return height+colon+numberr.toString()+comma;
    }

    @Override
    public String codeGenerationHTML() {
        return "\"height: "+numberr.toString()+"px\"";
    }
    /**
     * style="height: 200px; width: 300px;*/
}
