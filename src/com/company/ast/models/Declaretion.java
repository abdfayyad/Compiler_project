package com.company.ast.models;

import com.company.ast.models.*;
import com.company.ast.nodes.Node;

public class Declaretion extends Node {
    DeclareInt declareInt;
    DeclareBool declareBool;
    DeclareString declareString;
    DeclarDouble declarDouble;
    DeclareVar declareVar;
    DeclareList declareList;
    Map map;

    public DeclareInt getDeclareInt() {
        return declareInt;
    }

    public void setDeclareInt(DeclareInt declareInt) {
        this.declareInt = declareInt;
    }

    public DeclareBool getDeclareBool() {
        return declareBool;
    }

    public void setDeclareBool(DeclareBool declareBool) {
        this.declareBool = declareBool;
    }

    public DeclareString getDeclareString() {
        return declareString;
    }

    public void setDeclareString(DeclareString declareString) {
        this.declareString = declareString;
    }

    public DeclarDouble getDeclarDouble() {
        return declarDouble;
    }

    public void setDeclarDouble(DeclarDouble declarDouble) {
        this.declarDouble = declarDouble;
    }

    public DeclareVar getDeclareVar() {
        return declareVar;
    }

    public void setDeclareVar(DeclareVar declareVar) {
        this.declareVar = declareVar;
    }

    public DeclareList getDeclareList() {
        return declareList;
    }

    public void setDeclareList(DeclareList declareList) {
        this.declareList = declareList;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
      if(declareInt!=null)return declareInt.toString();
      else if(declareBool!=null)return declareBool.toString();
      else if(declareString!=null)return declareString.toString();
      else if (declarDouble!=null)return declarDouble.toString();
      else if (declareVar!=null)return declareVar.toString();
      else if(declareList!=null)return declareList.toString();
      else return map.toString();
    }

    @Override
    public String codeGenerationJAVASCRIPT() {

        if(declareInt!=null)return "";
        else if(declareBool!=null)return "";
        else if(declareString!=null)return "";
        else if (declarDouble!=null)return "";
        else if (declareVar!=null)return"";
        else if(declareList!=null)return declareList.codeGenerationJAVASCRIPT();
        else return "";

    }
}
