package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Import extends Node {
String importt;
String string;
String semi;
String mapelement;
public Import(){}
public void setimportt(String importt){this.importt=importt;}
public String getimportt(){return  this.importt;}
    public void setMapelement(String mapelement){this.mapelement=mapelement;}
    public String getMapelement(){return  this.mapelement;}
public void settext(String string){this.string=string;}
public String gettext(){return this.string;}
public void setsemi(String semi){this.semi=semi;}
public String getsemi(){return this.semi;}
public String toString(){
    String var10000 = this.importt;
    if(this.mapelement!=null)return  var10000+this.mapelement+this.semi+"\n";
  else  return var10000 + this.string+ this.semi + "\n";
}
}
