package com.company.ast.models;

import com.company.ast.nodes.Node;

public class  ObjectIndex extends Node{
String id1;
String op_list;
String id2;
    String close_list;
    String dot;
    String id3;
    @Override
    public String toString() {
        if(this.dot!=null) {
            return
                    id1  +
                            op_list +
                            id2 +
                            close_list +
                            dot +
                            id3
                           ;
        }
        else   return
                  id1 +
                        op_list +
                        id2 +
                        close_list
                ;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        return id1;
    }

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getOp_list() {
        return op_list;
    }

    public void setOp_list(String op_list) {
        this.op_list = op_list;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public String getClose_list() {
        return close_list;
    }

    public void setClose_list(String close_list) {
        this.close_list = close_list;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getId3() {
        return id3;
    }

    public void setId3(String id3) {
        this.id3 = id3;
    }


}