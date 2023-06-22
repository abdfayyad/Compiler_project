package com.company.ast.models;

import com.company.ast.models.Declaretion;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class For_Initializer_Statement_Terminator extends Node {
    public For_Initializer_Statement_Terminator(){}
   ArrayList<Declaretion>declarrtionss=new ArrayList<Declaretion>();
  public void setDeclarrtionss(ArrayList<Declaretion>declarrtionss){this.declarrtionss=declarrtionss;}
 public ArrayList<Declaretion> getDeclarrtionss(){return this.declarrtionss;}
    public String toString() {
        String s = new String("");

        for(int i = 0; i < this.declarrtionss.size(); ++i) {
            s = s + (this.declarrtionss.get(i)).toString() + ", ";
        }

        return  s;
    }
}
