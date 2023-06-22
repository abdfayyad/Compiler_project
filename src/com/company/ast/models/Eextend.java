package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Eextend extends Node {
    public Eextend(){}
    String extend;
    Extends_Type extends_type=new Extends_Type();
    public void setExtend (String extend){this.extend=extend;}
    public String getExtend(){return this.extend;}
    public Extends_Type getExtends_type(){return this.extends_type;}
    public void setExtends_type(Extends_Type extends_type){this.extends_type=extends_type;}
}
