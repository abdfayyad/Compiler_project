package com.company.ast.models;

import com.company.ast.models.CenterTitle;
import com.company.ast.models.Title;
import com.company.ast.nodes.Node;

public class AppBar extends Node {
    String appBar;
    String colon;
    String appBarWidget;
    String openList;
    Title title;
    CenterTitle centerTitle;
    String closeList;

    public String getAppBar() {
        return appBar;
    }

    public void setAppBar(String appBar) {
        this.appBar = appBar;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getAppBarWidget() {
        return appBarWidget;
    }

    public void setAppBarWidget(String appBarWidget) {
        this.appBarWidget = appBarWidget;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public CenterTitle getCenterTitle() {
        return centerTitle;
    }

    public void setCenterTitle(CenterTitle centerTitle) {
        this.centerTitle = centerTitle;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }



    @Override
    public String toString() {
if(this.centerTitle.toString()!=null)  return  this.appBar + this.colon + this.appBarWidget + this.openList + this.title.toString() +this.centerTitle.toString() + this.closeList;
else return this.appBar + this.colon + this.appBarWidget + this.openList + this.title.toString() + this.closeList;
    }

    @Override
    public String codeGenerationHTML() {
        return title.text.text;
    }
}
/*<head>
  <title>Compiler Login</title>
</head>
*
* */