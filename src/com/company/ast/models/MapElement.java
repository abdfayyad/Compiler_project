package com.company.ast.models;

import com.company.ast.nodes.Node;

public class MapElement extends Node {

    Value value;
    String colon;



    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    @Override
    public String toString() {
        return value.toString() +colon+ value.toString();
    }
   static public  String codeGenerationJAVASCRIPTT(){
        return           "\n" +
                "               function showProductDetails(product) {\n" +
                "                   productListContainer.style.display = 'none';\n" +
                "                   productDetailsContainer.style.display = 'block';\n" +
                "                   productImage.src = product.imageName;\n" +
                "                   productName.textContent = product.name;\n" +
                "                   productPrice.textContent = `Price: ${product.price}`;\n" +
                "                   productDescription.textContent = product.description;\n" +
                "               }\n" ;
    }
}
