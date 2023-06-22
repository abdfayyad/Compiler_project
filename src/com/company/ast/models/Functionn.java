package com.company.ast.models;

import com.company.ast.models.FunctionArgumentsReturn;
import com.company.ast.models.FunctionNoArgumentsNoReturn;
import com.company.ast.models.FunctionNoArgumentsReturn;
import com.company.ast.models.FunctionWithArgumentsNoReturn;
import com.company.ast.nodes.Node;

public class Functionn extends Node {
    FunctionNoArgumentsNoReturn functionNoArgumentsNoReturn;
    FunctionWithArgumentsNoReturn functionWithArgumentsNoReturn;
    FunctionNoArgumentsReturn functionNoArgumentsReturn;
    FunctionArgumentsReturn functionArgumentsReturn;

    public FunctionNoArgumentsNoReturn getFunctionNoArgumentsNoReturn() {
        return functionNoArgumentsNoReturn;
    }

    public void setFunctionNoArgumentsNoReturn(FunctionNoArgumentsNoReturn functionNoArgumentsNoReturn) {
        this.functionNoArgumentsNoReturn = functionNoArgumentsNoReturn;
    }

    public FunctionWithArgumentsNoReturn getFunctionWithArgumentsNoReturn() {
        return functionWithArgumentsNoReturn;
    }

    public void setFunctionWithArgumentsNoReturn(FunctionWithArgumentsNoReturn functionWithArgumentsNoReturn) {
        this.functionWithArgumentsNoReturn = functionWithArgumentsNoReturn;
    }

    public FunctionNoArgumentsReturn getFunctionNoArgumentsReturn() {
        return functionNoArgumentsReturn;
    }

    public void setFunctionNoArgumentsReturn(FunctionNoArgumentsReturn functionNoArgumentsReturn) {
        this.functionNoArgumentsReturn = functionNoArgumentsReturn;
    }

    public FunctionArgumentsReturn getFunctionArgumentsReturn() {
        return functionArgumentsReturn;
    }

    public void setFunctionArgumentsReturn(FunctionArgumentsReturn functionArgumentsReturn) {
        this.functionArgumentsReturn = functionArgumentsReturn;
    }

    @Override
    public String toString() {
      if(functionWithArgumentsNoReturn!=null) return functionWithArgumentsNoReturn.toString();
      else if(functionNoArgumentsNoReturn!=null)return functionNoArgumentsNoReturn.toString();
      else if(functionNoArgumentsReturn!=null)return functionNoArgumentsReturn.toString();
      else return functionArgumentsReturn.toString();

    }
}
