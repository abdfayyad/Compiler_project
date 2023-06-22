package com.company.ast.models;

import com.company.ast.models.BodyForIfWhile;
import com.company.ast.models.For_loop_parts;
import com.company.ast.nodes.Node;

public class For_loop extends Node {
String ffor;
String open_list;
For_loop_parts parts=new For_loop_parts();
String close_list;
BodyForIfWhile body=new BodyForIfWhile();

public For_loop(){}
public void setFor(String forr){
    this.ffor=ffor;
}
public String getFor(){return this.ffor;}

public void setOpen(String open_list){
        this.open_list=open_list;
    }
  public String getOpen(){return this.open_list;}
    public void setClose(String close_list){
        this.close_list=close_list;
    }
    public String getClose(){return this.close_list;}
    public void setParts(For_loop_parts parts){this.parts=parts;}
    public For_loop_parts getParts(){return this.parts; }
    public void setbody(BodyForIfWhile body){this.body=body;}
    public BodyForIfWhile getbody(){return this.body; }
    /////// to print
    public String toString() {
        return this.ffor + this.open_list +  this.parts + this.close_list + "\n"+this.body;
    }
}
