package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ListView extends Node {
    String listView;
    String dot;
    String builder;
    String openList;
    String itemCount;
    String colon;
  ItemCountView itemCountView;
    String comma;

    public ItemCountView getItemCountView() {
        return itemCountView;
    }

    public void setItemCountView(ItemCountView itemCountView) {
        this.itemCountView = itemCountView;
    }

    ItemBuilder itemBuilder;
    String blockOpen;
    String returnn;
    MapElement mapElement;
    Widget widget;
    //String nameList=widget.listView.widget.inkWell.onTap.navigationBetweenPages.call_constructor.call_constructor_with_param.toString();
    String semicolon;
    String blockClose;
    String closeList;

    public String getListView() {
        return listView;
    }

    public void setListView(String listView) {
        this.listView = listView;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ItemBuilder getItemBuilder() {
        return itemBuilder;
    }

    public void setItemBuilder(ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public String getReturnn() {
        return returnn;
    }

    public void setReturnn(String returnn) {

        this.returnn = returnn;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        System.out.println(widget.codeGenerationJAVASCRIPT());
        return listView + dot + builder + openList + "\n                   "+
                itemCount + colon + itemCountView.toString() + comma + "\n                   "+
                itemBuilder.toString() + blockOpen + "\n                   "+ returnn+"  " + widget.toString() + semicolon + "\n                   "+ blockClose + "\n                 "+ closeList;
    }

    @Override
    public String codeGenerationHTML() {
        return

                "  <div id=\"ProductList\"></div>\n" +
                "\n" +
                "                   <div id=\"ProductDetails\" class=\"Product-details\">\n" +
                "                       <img id=\"ProductImage\" src=\"\" alt=\"Product Image\" width=\"200\">\n" +
                "                       <h2 id=\"ProductName\"></h2>\n" +
                "                       <p id=\"ProductPrice\"></p>\n" +
                "                       <p id=\"ProductDescription\"></p>\n" +
                "                   </div>\n" ;
    }




    @Override
    public  String codeGenerationJAVASCRIPT() {
        return
               "               const productListContainer = document.getElementById('ProductList');\n" +
                       "               const productDetailsContainer = document.getElementById('ProductDetails');\n" +
                       "               const productImage = document.getElementById('ProductImage');\n" +
                       "               const productName = document.getElementById('ProductName');\n" +
                       "               const productPrice = document.getElementById('ProductPrice');\n" +
                       "               const productDescription = document.getElementById('ProductDescription');\n" +
                       "\n" +
                       "               function showProductList() {\n" +
                       "                   productListContainer.style.display = 'block';\n" +
                       "                   productDetailsContainer.style.display = 'none';\n" +
                       "               }\n"+mapElement.codeGenerationJAVASCRIPTT()+
                       "\n" +
                       "               function createProductElements() {\n" +
                       "                   " +widget.codeGenerationJAVASCRIPT()+".forEach((product) => {\n" +
                       "                       const productItem = document.createElement('div');\n" +
                       "                       productItem.classList.add('Product-item');\n" +
                       "                       productItem.innerHTML = `\n" +
                       "                           <img src=\"${product.imageName}\" alt=\"Product Image\" width=\"100\">\n" +
                       "                           <h3>${product.name}</h3>\n" +
                       "                       `;\n" +
                       "                       productItem.addEventListener('click', () => {\n" +
                       "                           showProductDetails(product);\n" +
                       "                       });\n" +
                       "\n" +
                       "                       productListContainer.appendChild(productItem);\n" +
                       "                   });\n" +
                       "               }\n" +
                       "\n" +
                       "               createProductElements();";
    }
}
