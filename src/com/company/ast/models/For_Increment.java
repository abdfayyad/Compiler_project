package com.company.ast.models;

import com.company.ast.models.Assignment;
import com.company.ast.models.ValueConstructor;
import com.company.ast.nodes.Node;

public class For_Increment extends Node {
    public For_Increment(){}
    String id;
    String plus_plus;
    String minus_minus;
  String plus;
  String minus;
  String equal;
    ValueConstructor value_constructor=new ValueConstructor();
    Assignment assignment=new Assignment();
    public void setId(String id){this.id=id;}
    public String getId(){return this.id;}
    public void setPlus_plus(String plus_plus){this.plus_plus=plus_plus;}
    public String getPlus_plus(){return this.plus_plus;}
    public void setMinus_minus(String minus_minus){this.minus_minus=minus_minus;}
    public String getMinus_minus(){return this.minus_minus;}
    public void setPlus(String plus){this.plus=plus;}
    public String getPlus(){return this.plus;}
    public void setMinus(String minus){this.minus=minus;}
    public String getMinus(){return this.minus;}
    public void setEqual(String equal){this.equal=equal;}
    public String getEqual(){return  this.equal;}
    public ValueConstructor getValue_constructor(){return  this.value_constructor;}
    public void setValue_constructor(ValueConstructor value_constructor){this.value_constructor=value_constructor;}
    public Assignment getAssignment(){return this.assignment;}
    public void  setAssignment(Assignment assignment){this.assignment=assignment;}


   public String toString(){
     if(this.minus_minus!=null)return this.id+this.minus_minus;
    else if(this.plus_plus!=null)return this.id+this.plus_plus;
    else if(this.minus!=null)return this.id+this.minus+this.equal+this.value_constructor.toString();
    else if(this.plus!=null)return this.id+this.plus+this.equal+this.value_constructor.toString();
       else return this.assignment.toString();

   }
}
