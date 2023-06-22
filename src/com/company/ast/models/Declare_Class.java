package com.company.ast.models;


import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Declare_Class extends Node {
    String clas;
    String id;
    Extend eextend = new Extend();
    String open_bl;
    WidgetBuild widget_build = new WidgetBuild();

    String close_bl;
    ConstructorClass constructorClass=new ConstructorClass();
    WidgetBuild widgetBuild=new WidgetBuild();
    ArrayList<Declaretion>declaretions=new ArrayList<>();
    ArrayList<NewObject>newObjects=new ArrayList<>();
    ArrayList<Functionn>functionns=new ArrayList<>();
    ArrayList<CallFunction>callFunctions=new ArrayList<>();

    public ArrayList<CallFunction> getCallFunctions() {
        return callFunctions;
    }

    public void setCallFunctions(ArrayList<CallFunction> callFunctions) {
        this.callFunctions = callFunctions;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Extend getEextend() {
        return eextend;
    }

    public void setEextend(Extend eextend) {
        this.eextend = eextend;
    }

    public String getOpen_bl() {
        return open_bl;
    }

    public void setOpen_bl(String open_bl) {
        this.open_bl = open_bl;
    }

    public String getClose_bl() {
        return close_bl;
    }

    public void setClose_bl(String close_bl) {
        this.close_bl = close_bl;
    }

    public ConstructorClass getConstructorClass() {
        return constructorClass;
    }

    public void setConstructorClass(ConstructorClass constructorClass) {
        this.constructorClass = constructorClass;
    }

    public WidgetBuild getWidgetBuild() {
        return widgetBuild;
    }

    public void setWidgetBuild(WidgetBuild widgetBuild) {
        this.widgetBuild = widgetBuild;
    }

    public ArrayList<Declaretion> getDeclaretions() {
        return declaretions;
    }

    public void setDeclaretions(ArrayList<Declaretion> declaretions) {
        this.declaretions = declaretions;
    }

    public ArrayList<NewObject> getNewObjects() {
        return newObjects;
    }

    public void setNewObjects(ArrayList<NewObject> newObjects) {
        this.newObjects = newObjects;
    }

    public ArrayList<Functionn> getFunctionns() {
        return functionns;
    }

    public void setFunctionns(ArrayList<Functionn> functionns) {
        this.functionns = functionns;
    }

    public WidgetBuild getWidget_build() {
        return widget_build;
    }

    public void setWidget_build(WidgetBuild widget_build) {
        this.widget_build = widget_build;
    }

    @Override
    public String toString() {
        String s=new String();
        s+=clas+" "+id;
        if(eextend.getExtendss()!=null)s+=eextend.toString();
        s+='{'+"\n";
        if(declaretions.size()>0) {
            for (Declaretion declaretion : declaretions) {
                s += "    " + declaretion.toString() + "\n";
            }
        }
        if(newObjects.size()>0) {
            for (NewObject newObject : newObjects) {
                s += newObject.toString() + "\n";
            }
        }
        if(functionns.size()>0) {
            for (Functionn functionn : functionns) {
                s += functionn.toString() + "\n";
            }
        }
        if(callFunctions.size()>0){
            for(CallFunction callFunction:callFunctions){
                s+=callFunction.toString()+"\n";
            }
        }
        //new abdalkarem
        if(constructorClass.id!=null)s+=constructorClass.toString();
        if(widget_build.override!=null)s+=widget_build.toString();
        s+='}';
        return s;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        String s=new String();
        s+="class"+" "+id;
        s+="{";
       if (constructorClass!=null)
           s+=constructorClass.codeGenerationJAVASCRIPT();
        s+="}\n";
        return s;
    }
    public  String codeGenerationList(){
        String s=new String();

        if(declaretions.size()>0)
            for (Declaretion declaretion : declaretions)
                s += "    " + declaretion.codeGenerationJAVASCRIPT() + "";
            return s;
    }
}