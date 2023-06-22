package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ContainerPropreties extends Node {
    HeightProprety heightProprety;
    WidthProprety widthProprety;

    public HeightProprety getHeightProprety() {
        return heightProprety;
    }

    public void setHeightProprety(HeightProprety heightProprety) {
        this.heightProprety = heightProprety;
    }

    public WidthProprety getWidthProprety() {
        return widthProprety;
    }

    public void setWidthProprety(WidthProprety widthProprety) {
        this.widthProprety = widthProprety;
    }

    @Override
    public String toString() {
        if(heightProprety!=null)return heightProprety.toString();
        else return widthProprety.toString();
    }

    @Override
    public String codeGenerationHTML() {
        if(heightProprety!=null)return "style="+heightProprety.codeGenerationHTML()+";";
        else return "style="+ widthProprety.codeGenerationHTML()+";";

    }
}/**style="height: 200px; width: 300px;"*/
