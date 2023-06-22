package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ConditionObject extends Node {
    String intt;
    String doublee;
    String stringg;
 String bool;
 String id;

    public String getDoublee() {
        return doublee;
    }

    public String getBool() {
        return bool;
    }

    public String getStringg() {
        return stringg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    public void setStringg(String stringg) {
        this.stringg = stringg;
    }

    public void setDoublee(String doublee) {
        this.doublee = doublee;
    }

    public void setIntt(String intt) {
        this.intt = intt;
    }

    public String getIntt() {
        return intt;
    }

    @Override
    public String toString() {
        if(this.bool!=null)return this.bool;
        else if(this.doublee!=null)return this.doublee;
        else if(this.stringg!=null)return this.stringg;
        else if(this.intt!=null)return this.intt;
        else return this.id;
    }
}
