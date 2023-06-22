package com.company.ast.models;

import com.company.ast.models.HomeInMaterialApp;
import com.company.ast.nodes.Node;

public class MaterialApp extends Node {
TypeMaterialApp typeMaterialApp=new TypeMaterialApp();
String openList;
HomeInMaterialApp homeInMaterialApp=new HomeInMaterialApp();
String comma;
String closeList;

    public TypeMaterialApp getTypeMaterialApp() {
        return typeMaterialApp;
    }

    public void setTypeMaterialApp(TypeMaterialApp typeMaterialApp) {
        this.typeMaterialApp = typeMaterialApp;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public HomeInMaterialApp getHomeInMaterialApp() {
        return homeInMaterialApp;
    }

    public void setHomeInMaterialApp(HomeInMaterialApp homeInMaterialApp) {
        this.homeInMaterialApp = homeInMaterialApp;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return  typeMaterialApp.toString() +openList + homeInMaterialApp.toString() + comma + closeList ;
    }

    @Override
    public String codeGenerationHTML() {
        return " ";
    }
}




/*
 <div id="app">
 <!-- Your product page content goes here -->
 </div>*/
