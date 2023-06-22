package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Row extends Node {
    String row;
    String openList;
    MainAxisAlignment mainAxisAlignment;
    String children;
    String constt;
    String colon;

    public String getConstt() {
        return constt;
    }

    public void setConstt(String constt) {
        this.constt = constt;
    }

    String listOpen;
    ArrayList<Widget> widgets=new ArrayList<Widget>();
    String comma;
    String listClose;
    String closeList;

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }



    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
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

    public String getListClose() {
        return listClose;
    }

    public void setListClose(String listClose) {
        this.listClose = listClose;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        String s=new String();
        if(widgets.size()>0) {
            s += widgets.get(0).toString();
            for (int i = 1; i < widgets.size(); i++) {
                s += ",";
                s+="\n                ";
//                if(this.constt!=null)s+=this.constt;
                s += widgets.get(i).toString();
            }
        }

      if(mainAxisAlignment!=null)  return  row + openList +"\n                "+ mainAxisAlignment.toString() +"\n                "+ children + colon + listOpen +"\n                "+ s +"\n                "+ listClose + closeList ;
      else return  row + openList +"\n                "+  children + colon + listOpen +"\n                "+ s +"\n                "+ listClose + closeList ;
    }

    @Override
    public String codeGenerationHTML() {
        StringBuilder s= new StringBuilder(new String());
        if(widgets.size()>0) {
            s.append(widgets.get(0).codeGenerationHTML()).append("\n");
            for (int i = 1; i < widgets.size(); i++) {

//
                s.append(widgets.get(i).codeGenerationHTML()).append("\n");
            }
        }
        return "<div style=\"display: flex;\">\n"+s+"</div>";
    }
}
/**<div style="display: flex;">
 <div>Child 1</div>
 <div>Child 2</div>
 <div>Child 3</div>
 </div>
 */