package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Declare_Int extends Node {
    String finall;
    String typein;
    String id;
    String equal;
    String intt;
    String semi;

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getFinall() {
        return finall;
    }

    public void setTypein(String typein) {
        this.typein = typein;
    }

    public String getTypein() {
        return typein;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getEqual() {
        return equal;
    }

    public void setIntt(String intt) {
        this.intt = intt;
    }

    public String getIntt() {
        return intt;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String getSemi() {
        return semi;
    }

    public Declare_Int(){}
    public String toString(){
  if(this.intt!=null)return this.finall+this.typein+this.id+this.equal+this.intt+this.semi;
  else return this.finall+this.typein+this.id+this.semi;
    }
}
