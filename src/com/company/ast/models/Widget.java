package com.company.ast.models;

import com.company.ast.models.*;
import com.company.ast.nodes.Node;


public class Widget extends Node {
Container container;//
Image image;//
Text text;//
Row row;//
Column column;//
Scaffold scaffold;//
Expanded expanded;//
SizedBox sizedBox;//
InkWell inkWell;//
ListView listView;//
MaterialApp materialApp;//
TextFormField textFormField;//
ElevatedButton elevatedButton;//

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Scaffold getScaffold() {
        return scaffold;
    }

    public void setScaffold(Scaffold scaffold) {
        this.scaffold = scaffold;
    }

    public Expanded getExpanded() {
        return expanded;
    }

    public void setExpanded(Expanded expanded) {
        this.expanded = expanded;
    }

    public SizedBox getSizedBox() {
        return sizedBox;
    }

    public void setSizedBox(SizedBox sizedBox) {
        this.sizedBox = sizedBox;
    }

    public InkWell getInkWell() {
        return inkWell;
    }

    public void setInkWell(InkWell inkWell) {
        this.inkWell = inkWell;
    }

    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    public MaterialApp getMaterialApp() {
        return materialApp;
    }

    public void setMaterialApp(MaterialApp materialApp) {
        this.materialApp = materialApp;
    }

    public TextFormField getTextFormField() {
        return textFormField;
    }

    public void setTextFormField(TextFormField textFormField) {
        this.textFormField = textFormField;
    }

    public ElevatedButton getElevatedButton() {
        return elevatedButton;
    }

    public void setElevatedButton(ElevatedButton elevatedButton) {
        this.elevatedButton = elevatedButton;
    }

    @Override
    public String toString() {
     if(container!=null)return container.toString();
     else if(image!=null)return image.toString();
     else if(text!=null)return text.toString();
     else if(row!=null)return row.toString();
     else if(column!=null)return column.toString();
     else if(scaffold!=null)return scaffold.toString();
     else if(expanded!=null)return expanded.toString();
     else if(sizedBox!=null)return sizedBox.toString();
     else if(inkWell!=null)return inkWell.toString();
     else if(listView!=null)return  listView.toString();
     else if(materialApp!=null)return materialApp.toString();
     else if(textFormField!=null)return textFormField.toString();
     else return elevatedButton.toString();

    }

    @Override
    public String codeGenerationHTML() {
        if(container!=null)return container.codeGenerationHTML();
        else if(image!=null)return image.codeGenerationHTML();
        else if(text!=null)return text.codeGenerationHTML();
        else if(row!=null)return row.codeGenerationHTML();
        else if(column!=null)return column.codeGenerationHTML();
        else if(scaffold!=null)return scaffold.codeGenerationHTML();
        else if(expanded!=null)return expanded.codeGenerationHTML();
        else if(sizedBox!=null)return sizedBox.codeGenerationHTML();
        else if(inkWell!=null)return inkWell.codeGenerationHTML();
        else if(listView!=null)return  listView.codeGenerationHTML();
        else if(materialApp!=null)return materialApp.codeGenerationHTML();
        else if(textFormField!=null)return textFormField.codeGenerationHTML();
        else if(elevatedButton!=null) return  elevatedButton.codeGenerationHTML();
        return  "loujain ibrahim";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        if(container!=null)return "";
        else if(image!=null)return "";
        else if(text!=null)return "";
        else if(row!=null)return "";
        else if(column!=null)return "";
        else if(scaffold!=null)return "";
        else if(expanded!=null)return "";
        else if(sizedBox!=null)return "";
        else if(inkWell!=null)return inkWell.codeGenerationJAVASCRIPT();
        else if(listView!=null)return  "";
        else if(materialApp!=null)return "";
        else if(textFormField!=null)return "";
        else if(elevatedButton!=null) return  "";
        return  "";
    }
}
