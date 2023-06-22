package com.company.ast.models;

import com.company.ast.nodes.Node;

public class  TypeMaterialApp extends Node{
String materialAppp;

    public String getMaterialAppp() {
        return materialAppp;
    }

    public void setMaterialAppp(String materialApp) {
        this.materialAppp = materialApp;
    }

    @Override
    public String toString() {
        return materialAppp + '\'' ;

    }
}