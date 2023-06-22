package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ElevatedButton extends Node {
    String elevatedButton;
    String openList;
    String onPressed;
    String colon;
    String closeList;
    String blockOpen;
    Functionn function;
    String blockClose;
    String comma;
    Child child;

    public Functionn getFunction() {
        return function;
    }

    public void setFunction(Functionn function) {
        this.function = function;
    }

    public String getElevatedButton() {
        return elevatedButton;
    }

    public void setElevatedButton(String elevatedButton) {
        this.elevatedButton = elevatedButton;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getOnPressed() {
        return onPressed;
    }

    public void setOnPressed(String onPressed) {
        this.onPressed = onPressed;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        if (function != null)
            return elevatedButton + openList + onPressed + colon + openList + closeList + blockOpen + function.toString()+ blockClose + comma + child.toString() + closeList;
        else
            return elevatedButton + openList + onPressed + colon + openList + closeList + blockOpen + blockClose + comma + child.toString() + closeList;

    }

    @Override
    public String codeGenerationHTML() {
        return "<form>\n"+"<div>"+"\n"+" <button >"+child.widget.text.getValueConstructor().toString()+"</button>"+"\n"+
                "</div>\n"+"</form>";
    }
    /*
    * <form>
      <div >
        <button >Login</button>
      </div>
    </form>
    *
    * */
}
