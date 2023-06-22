package com.company.ast.models;

import com.company.ast.models.ExtendsType;
import com.company.ast.nodes.Node;

public class Extend extends Node {
String extendss;
ExtendsType extendsType;

    public String getExtendss() {
        return extendss;
    }

    public void setExtendss(String extendss) {
        this.extendss = extendss;
    }

    public ExtendsType getExtendsType() {
        return extendsType;
    }

    public void setExtendsType(ExtendsType extendsType) {
        this.extendsType = extendsType;
    }

    @Override
    public String toString() {
        return extendss+" "+extendsType;
    }
}
