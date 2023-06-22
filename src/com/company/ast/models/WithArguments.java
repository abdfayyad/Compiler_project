package com.company.ast.models;

import com.company.ast.models.Type;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class WithArguments extends Node {



    String openList;
    ArrayList<String> id = new ArrayList<>() ;
    String comma;
    ArrayList<Type> type=new ArrayList<Type>();
    String closeList;

    public ArrayList<String> getId() {
        return id;
    }

    public void setId(ArrayList<String> id) {
        this.id = id;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }



    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayList<Type> getType() {
        return type;
    }

    public void setType(ArrayList<Type> type) {
        this.type = type;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        String s=new String();
        if(type.size()>0) {
            s += type.get(0).toString()+ " ";
            s+=id.get(0)+ " ";
            for (int i = 1; i < type.size(); i++) {
                s+=comma + " ";
                s += type.get(i).toString()+ " ";
                s +=id.get(i)+ " ";
            }
        }
        return openList+s+closeList;
    }
}
