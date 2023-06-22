package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ExtendsType extends Node {
String extendsType;

    public String getExtendsType() {
        return extendsType;
    }

    public void setExtendsType(String extendsType) {
        this.extendsType = extendsType;
    }

    @Override
    public String toString() {
        return extendsType;
    }
}
