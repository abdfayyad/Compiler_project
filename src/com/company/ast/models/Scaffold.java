package com.company.ast.models;

import com.company.ast.models.AppBar;
import com.company.ast.nodes.Node;

public class Scaffold extends Node {
    String scaffold;
    String openList;
    String comma;
    AppBar appBar;
    Body body;
    String closeList;

    public String getScaffold() {
        return scaffold;
    }

    public void setScaffold(String scaffold) {
        this.scaffold = scaffold;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public AppBar getAppBar() {
        return appBar;
    }

    public void setAppBar(AppBar appBar) {
        this.appBar = appBar;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
       if(appBar!=null&&body!=null)return scaffold+openList+"\n"+"\t"+appBar.toString()+comma+"\n"+"\t"+body.toString()+"\n      "+closeList;
        else if(appBar!=null)return scaffold+openList+"\n"+"\t"+appBar.toString()+comma+"\n      "+closeList;
       else if (body!=null)return scaffold+openList+"\n"+"\t"+body.toString()+"\n      "+closeList;
       else return scaffold+openList+"\n      "+closeList;
    }

    @Override
    public String codeGenerationHTML() {
        String s=new String();

        if(appBar!=null){
            s+=" <h1>"+appBar.title.text.getValueConstructor().toString()+"</h1>\n";
        }
        if(body!=null){
            s+=body.codeGenerationHTML();
        }


        return s;
    }
}
