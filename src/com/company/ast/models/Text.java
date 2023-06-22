package com.company.ast.models;

import com.company.ast.models.ValueConstructor;
import com.company.ast.nodes.Node;

public class Text extends Node {
String text;
String openList;
ValueConstructor valueConstructor;
String closeList;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public ValueConstructor getValueConstructor() {
        return valueConstructor;
    }

    public void setValueConstructor(ValueConstructor valueConstructor) {
        this.valueConstructor = valueConstructor;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return  text +openList + valueConstructor.toString()+closeList ;
    }

    @Override
    public String codeGenerationHTML() {
        return "<p>"+
                "</p>";
    }/**<p>hello every one</p>*/
}
