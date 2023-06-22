package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Call_Constructor_Without_Param extends Node {
    String id;
    String open_list;
    String close_list;
    public Call_Constructor_Without_Param(){}
    public void setId(String id){this.id=id;}
    public String getId(){return this.id;}
    public void setOpen_list(String open_list){this.open_list=open_list;}
    public String getOpen_list(){return this.open_list;}
    public void setClose_list(String close_list){this.close_list=close_list;}
    public String getClose_list(){return this.close_list;}

    @Override
    public String toString() {
        return id+open_list+close_list;
    }
}
