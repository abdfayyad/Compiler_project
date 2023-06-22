package com.company.ast.models;

import com.company.ast.models.Call_Constructor;
import com.company.ast.nodes.Node;

public class Run_App extends Node {
    String runApp;
    String open_list;
    String close_list;
    String semi;
    String constance;
    Call_Constructor call_constructor=new Call_Constructor();
    public   void setConstance(String constance){this.constance=constance;}
    public String getConstance(){return this.constance;}
    public void setOpen_list(String open_list){this.open_list=open_list;}
    public String getOpen_list(){return this.open_list;}
    public void setClose_list(String close_list){this.close_list=close_list;}
    public String getClose_list(){return this.close_list;}
    public void setRunApp(String runApp){this.runApp=runApp;}
    public String getRunApp(){return this.runApp;}
    public void setSemi(String semi){this.semi=semi;}
    public String getSemi(){return this.semi;}
    public void setCall_constructor(Call_Constructor call_constructor){this.call_constructor=call_constructor;}
    public Call_Constructor getCall_constructor(){return this.call_constructor;}
    public Run_App(){}
    public String toString(){
        if(this.constance!=null)
            return this.runApp+this.open_list+this.constance+" "+this.call_constructor.toString()+this.close_list+this.semi;

       else return this.runApp+this.open_list+this.call_constructor.toString()+this.close_list+this.semi;
    }
}
