package com.company.ast.models;

import com.company.ast.models.ValueConstructor;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Call_Constructor_With_Param extends Node {
    String id;
    String open_list;
    String close_list;
    ArrayList<ValueConstructor> value_constructors=new ArrayList<ValueConstructor>();
    String comma;
    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public void setClose_list(String close_list){this.close_list=close_list;}

    public String getClose_list(){return this.close_list;}

    public void setId(String id){this.id=id;}

    public String getId(){return this.id;}

    public void setOpen_list(String open_list){this.open_list=open_list;}

    public String getOpen_list(){return this.open_list;}

    public Call_Constructor_With_Param(){}

    public void setValue_constructors( ArrayList<ValueConstructor>value_constructors){this.value_constructors=value_constructors;}

    public  ArrayList<ValueConstructor> getValue_constructors(){return this.value_constructors;}

    public String toString (){
        String s = new String("");

        if (this.value_constructors.size() > 0) {
            s = s + this.value_constructors.get(0).toString();
            for(int i = 1; i < this.value_constructors.size(); i++) {
                s = s + ",";
                s = s + this.value_constructors.get(i).toString();
            }
        }
       return  id+open_list+s+close_list;
   }

    @Override
    public String codeGenerationJAVASCRIPT() {
        String s = new String("");

        if (this.value_constructors.size() > 0) {
            s = s + this.value_constructors.get(0).codeGenerationJAVASCRIPT();
            for(int i = 1; i < this.value_constructors.size(); i++) {
                s = s + ",";
                s = s + this.value_constructors.get(i).codeGenerationJAVASCRIPT();
            }
        }
        return  s;
    }
}
