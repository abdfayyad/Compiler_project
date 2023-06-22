package com.company.ast.models;

import com.company.ast.models.Call_Constructor_With_Param;
import com.company.ast.models.Call_Constructor_Without_Param;
import com.company.ast.nodes.Node;

public class Call_Constructor extends Node {
    Call_Constructor_With_Param call_constructor_with_param=new Call_Constructor_With_Param();
    Call_Constructor_Without_Param call_constructor_without_param=new Call_Constructor_Without_Param();
    public Call_Constructor(){}
    public void setCall_constructor_with_param(Call_Constructor_With_Param call_constructor_with_param){this.call_constructor_with_param=call_constructor_with_param;}
    public Call_Constructor_With_Param getCall_constructor_with_param(){return this.call_constructor_with_param;}
    public void setCall_constructor_without_param(Call_Constructor_Without_Param call_constructor_without_param){this.call_constructor_without_param=call_constructor_without_param;}
    public Call_Constructor_Without_Param getCall_constructor_without_param(){return  this.call_constructor_without_param;}

    public String toString(){
        if(call_constructor_without_param.open_list!=null)return this.call_constructor_without_param.toString();
       if(call_constructor_with_param.value_constructors!=null) return this.call_constructor_with_param.toString();
       else return "";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        if(call_constructor_without_param.open_list!=null)return "";
        if(call_constructor_with_param.value_constructors!=null) return this.call_constructor_with_param.codeGenerationJAVASCRIPT();
        else return "";
    }
}
