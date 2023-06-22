package com.company.ast.models;

import com.company.ast.nodes.Node;

public class NavigationBetweenPages extends Node{
String navigator;
String dot;
String push;
String op_list;
String context;
String comma;
String materialPageroute;
String Colon;
String builder;
String Gthan_Equal;
    String constt;
    String close_list;
    Call_Constructor call_constructor=new Call_Constructor();
    String semi;
    public String getNavigator() {
        return navigator;
    }

    public void setNavigator(String navigator) {
        this.navigator = navigator;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getPush() {
        return push;
    }

    public void setPush(String push) {
        this.push = push;
    }

    public String getOp_list() {
        return op_list;
    }

    public void setOp_list(String op_list) {
        this.op_list = op_list;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getMaterialPageroute() {
        return materialPageroute;
    }

    public void setMaterialPageroute(String materialPageroute) {
        this.materialPageroute = materialPageroute;
    }

    public String getColon() {
        return Colon;
    }

    public void setColon(String colon) {
        Colon = colon;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getGthan_Equal() {
        return Gthan_Equal;
    }

    public void setGthan_Equal(String gthan_Equal) {
        Gthan_Equal = gthan_Equal;
    }

    public String getConstt() {
        return constt;
    }

    public void setConstt(String constt) {
        this.constt = constt;
    }



    public String getSemi() {
        return semi;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    @Override
    public String toString() {
          if(constt!=null)
              return  navigator +
                      dot +
                      push +
                      op_list +
                      context +
                      comma +
                      materialPageroute +op_list+
                      builder +
                      Colon +
                      op_list+context+close_list+
                      Gthan_Equal +constt+
                      call_constructor.toString()+
                      close_list+close_list+
                      semi
                ;
          else return navigator +
                  dot +
                  push +
                  op_list +
                  context +
                  comma +
                  materialPageroute +op_list+
                  builder +
                  Colon +
                  op_list+context+close_list+
                  Gthan_Equal +
                   call_constructor.toString()+
                  close_list+close_list+
                  semi
                  ;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        if(constt!=null)
            return  call_constructor.codeGenerationJAVASCRIPT();
        else return call_constructor.codeGenerationJAVASCRIPT();
    }

    public Call_Constructor getCall_constructor() {
        return call_constructor;
    }

    public void setCall_constructor(Call_Constructor call_constructor) {
        this.call_constructor = call_constructor;
    }

    public String getClose_list() {
        return close_list;
    }

    public void setClose_list(String close_list) {
        this.close_list = close_list;
    }


}