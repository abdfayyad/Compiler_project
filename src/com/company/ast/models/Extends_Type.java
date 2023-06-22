package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Extends_Type extends Node {
   String type;

    public Extends_Type(){}
    public void setType(String type){this.type=type;}
    public String getType(){return this.type;}
}
