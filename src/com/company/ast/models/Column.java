package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Column extends Node {
    String column;
    String openList;
    MainAxisAlignment mainAxisAlignment;
    String children;
    String constt;
    String colon;
    String listOpen;
    ArrayList<Widget> widgets=new ArrayList<Widget>();
    String comma;
    String listClose;
    String closeList;
    public String getConstt() {
        return constt;
    }

    public void setConstt(String constt) {
        this.constt = constt;
    }
    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public MainAxisAlignment getMainAxisAlignment() {
        return mainAxisAlignment;
    }

    public void setMainAxisAlignment(MainAxisAlignment mainAxisAlignment) {
        this.mainAxisAlignment = mainAxisAlignment;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getListOpen() {
        return listOpen;
    }

    public void setListOpen(String listOpen) {
        this.listOpen = listOpen;
    }

    public ArrayList<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets(ArrayList<Widget> widgets) {
        this.widgets = widgets;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getListClose() {
        return listClose;
    }

    public void setListClose(String listClose) {
        this.listClose = listClose;
    }
    @Override
    public String toString() {
        String s=new String();
        if(widgets.size()>0) {
            s += widgets.get(0).toString();
            for (int i = 1; i < widgets.size(); i++) {
                s += ",";
                s+="\n                ";
                s += widgets.get(i).toString();
            }
        }

        if(mainAxisAlignment!=null)  return  column + openList +"\n                "+ mainAxisAlignment.toString() +"\n                "+ children + colon + listOpen+"\n                " + s +"\n                "+ listClose + closeList ;
        else return  column + openList +  children + colon + listOpen + s + listClose + closeList ;
    }
    @Override
    public String codeGenerationHTML() {
        String s=new String();
        if(widgets.size()>0) {
            s += widgets.get(0).codeGenerationHTML()+"\n";
            for (int i = 1; i < widgets.size(); i++) {


//                if(this.constt!=null)s+=this.constt;
                s += widgets.get(i).codeGenerationHTML()+"\n";
            }
        }
        return "<div>\n"+s+"</div>";
    }
}
