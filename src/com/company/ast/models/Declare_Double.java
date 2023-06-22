package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Declare_Double extends Node {
    public Declare_Double(){}
    String finall;
    String typedoub;
    String id;
    String equal;
    String doublee;
    String semi;

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getFinall() {
        return finall;
    }

    public void setTypedoub(String typedoub) {
        this.typedoub = typedoub;
    }

    public String getTypedoub() {
        return typedoub;
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

    public void setDoublee(String intt) {
        this.doublee = intt;
    }

    public String getDoublee() {
        return doublee;
    }

    public void setSemi(String semi) {
        this.semi = semi;
    }

    public String getSemi() {
        return semi;
    }


    public String toString(){
        if(this.doublee!=null)return this.finall+this.typedoub+this.id+this.equal+this.doublee+this.semi;
        else return this.finall+this.typedoub+this.id+this.semi;
    }
}
