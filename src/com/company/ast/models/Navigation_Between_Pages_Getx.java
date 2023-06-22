package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Navigation_Between_Pages_Getx extends Node{
String getx;
String dot;
String to;
String op_list;
String close_list;
Call_Constructor call_constructor=new Call_Constructor();
String semi;

    public String getGetx() {
        return getx;
    }

    public void setGetx(String getx) {
        this.getx = getx;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
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

    public Call_Constructor getCall_constructor() {
        return call_constructor;
    }

    public void setCall_constructor(Call_Constructor call_constructor) {
        this.call_constructor = call_constructor;
    }

    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    @Override
    public String toString() {
        return  getx  +
                 dot  +
                to  +
                 op_list  +
             call_constructor.toString() +close_list +
               semi;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        return  call_constructor.codeGenerationJAVASCRIPT();
    }
}