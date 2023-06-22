package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Value extends Node {
  String  bool;
  String doublee;
  String intt;
  String stringg;

    public String getBool() {
        return bool;
    }

    public String getDoublee() {
        return doublee;
    }

    public String getIntt() {
        return intt;
    }

    public String getStringg() {
        return stringg;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public void setDoublee(String doublee) {
        this.doublee = doublee;
    }

    public void setIntt(String intt) {
        this.intt = intt;
    }

    public void setStringg(String stringg) {
        this.stringg = stringg;
    }

    @Override
    public String toString() {
       if(bool!=null)return this.bool;
      else if(stringg!=null)return this.stringg;
      else if(intt!=null)return this.intt;
      else if(doublee!=null) return doublee;
      else return "";
    }
}
