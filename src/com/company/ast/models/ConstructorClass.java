package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class ConstructorClass extends Node{
String id;
String op_list;
    ArrayList<ItemConstructorClass> itemConstructorClasses=new ArrayList<>();
String comma;

    public ArrayList<ItemConstructorClass> getItemConstructorClasses() {
        return itemConstructorClasses;
    }

    public void setItemConstructorClasses(ArrayList<ItemConstructorClass> itemConstructorClasses) {
        this.itemConstructorClasses = itemConstructorClasses;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    String close_list;
    String semi;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getSemi() {
        return semi;
    }
    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String toString() {
        String s=new String("");

        if(itemConstructorClasses.size()>0) {
            s += itemConstructorClasses.get(0);
            for (int i = 1; i < itemConstructorClasses.size(); i++) {
                s += comma;
                s += itemConstructorClasses.get(i).toString();
            }
        }
        return "\n"+id+op_list+s+close_list+semi+"\n";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        String s=new String("");
        String nn=new String("");
        if(itemConstructorClasses.size()>0) {
            s += itemConstructorClasses.get(0).id;
            nn+=itemConstructorClasses.get(0)+"="+itemConstructorClasses.get(0).id+";\n";
            for (int i = 1; i < itemConstructorClasses.size(); i++) {
                s += comma;
                s += itemConstructorClasses.get(i).id;

                nn+=itemConstructorClasses.get(i)+"="+itemConstructorClasses.get(i).id+" ";
                nn+=";\n";
            }
        }
        return "\n"+"constructor"+op_list+s+close_list+"\n"+"{"+nn+"}";
    }
}