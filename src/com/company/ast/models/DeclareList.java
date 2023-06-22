package com.company.ast.models;

import com.company.ast.models.ListType;
import com.company.ast.nodes.Node;

public class DeclareList extends Node {
String finall;
String typeList;
String id ;
String equal;
ListType listType=new ListType();
String semicolon;

    public String getOp_list() {
        return op_list;
    }

    public void setOp_list(String op_list) {
        this.op_list = op_list;
    }

    public String getClose_list() {
        return close_list;
    }

    public void setClose_list(String close_list) {
        this.close_list = close_list;
    }

    String op_list;
String close_list;

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public ListType getListType() {
        return listType;
    }

    public void setListType(ListType listType) {
        this.listType = listType;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        if(finall!=null)return "\n"+finall+typeList+"  "+id+equal+'['+"\n"+listType.toString()+']'+semicolon+"\n";
        else return "\n"+typeList+"  "+id+equal+'['+"\n"+listType.toString()+']'+semicolon+"\n";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        return "var"+"  "+id+equal+'['+"\n"+listType.codeGenerationJAVASCRIPT()+']'+semicolon+"\n";
    }
}
