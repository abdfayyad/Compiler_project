package com.company.ast.models;

import com.company.ast.models.Value;
import com.company.ast.nodes.Node;

import java.util.ArrayList;


public class ListType extends Node {

    String comma;
    ArrayList<ListVlaue> list_value=new ArrayList<ListVlaue>();
    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayList<ListVlaue> getList_value() {
        return list_value;
    }

    public void setList_value(ArrayList<ListVlaue> list_value) {
        this.list_value = list_value;
    }

    @Override
    public String toString() {
        String s=new String("");
        if(list_value.size()>0) {
            s +="        "+ list_value.get(0);
            for (int i = 1; i < list_value.size(); i++) {
                s += comma+"\n";
                s += "        "+ list_value.get(i).toString();
            }
        }
        return s;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        String s=new String("");
        if(list_value.size()>0) {
            s +="        "+ list_value.get(0).codeGenerationJAVASCRIPT();
            for (int i = 1; i < list_value.size(); i++) {
                s += comma+"\n";
                s += "        "+ list_value.get(i).codeGenerationJAVASCRIPT();
            }
        }
        return s;
    }
}
