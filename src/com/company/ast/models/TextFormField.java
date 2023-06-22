package com.company.ast.models;

import com.company.ast.nodes.Node;

public class TextFormField extends Node {
    String textFormField;
    String openList;
    String Controller;
    String colon;
    String id;
    String comma;
    String decoration;
    String inputDecoration;
    String hintText;
    String string;
    String mapelement;
    String border;
    String outLineInputBorder;
    String borderRadius;
    String borderRadiusWidget;
    String dot;
    String circular;
    Numberr numberr;
    String closeList;

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getTextFormField() {
        return textFormField;
    }

    public void setTextFormField(String textFormField) {
        this.textFormField = textFormField;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getController() {
        return Controller;
    }

    public void setController(String controller) {
        Controller = controller;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getInputDecoration() {
        return inputDecoration;
    }

    public void setInputDecoration(String inputDecoration) {
        this.inputDecoration = inputDecoration;
    }

    public String getHintText() {
        return hintText;
    }

    public void setHintText(String hintText) {
        this.hintText = hintText;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getMapelement() {
        return mapelement;
    }

    public void setMapelement(String mapelement) {
        this.mapelement = mapelement;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getOutLineInputBorder() {
        return outLineInputBorder;
    }

    public void setOutLineInputBorder(String outLineInputBorder) {
        this.outLineInputBorder = outLineInputBorder;
    }

    public String getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(String borderRadius) {
        this.borderRadius = borderRadius;
    }

    public String getBorderRadiusWidget() {
        return borderRadiusWidget;
    }

    public void setBorderRadiusWidget(String borderRadiusWidget) {
        this.borderRadiusWidget = borderRadiusWidget;
    }

    public String getCircular() {
        return circular;
    }

    public void setCircular(String circular) {
        this.circular = circular;
    }

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = numberr;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return textFormField +
                openList + "\n                   "+
                Controller +
                colon +
                id + "\n                   "+
                comma +
                decoration +
                inputDecoration +
                openList+ "\n                   "+
                hintText +
                colon+
                string +
                comma+ "\n                   "+
                border +
                colon+
                outLineInputBorder +
                openList+ "\n                   "+
                borderRadius +
                colon+
                borderRadiusWidget +
                dot+
                circular +
                openList+
                numberr.toString() +
                closeList+closeList+ "\n                   "+
                closeList+closeList ;
    }

    @Override
    public String codeGenerationHTML() {
        return " <form>"+"\n"+"<div>"+"\n"+
                "<input"+" "+"placeholder="+string+">"+"\n"+"</div>"+"\n"+"</form>"
                ;
    }
    /*
     <form>
      <div >
        <input   placeholder="Name">
      </div>
    </form>
    * */
}