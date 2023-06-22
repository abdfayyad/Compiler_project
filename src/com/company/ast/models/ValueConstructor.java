package com.company.ast.models;

import com.company.ast.nodes.Node;

public class ValueConstructor extends Node {
  String id;
  Value value;
  ObjectIndex objectIndex=new ObjectIndex();
  ObjectCall objectCall=new ObjectCall();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectIndex getObjectIndex() {
        return objectIndex;
    }

    public void setObjectIndex(ObjectIndex objectIndex) {
        this.objectIndex = objectIndex;
    }

    public ObjectCall getObjectCall() {
        return objectCall;
    }

    public void setObjectCall(ObjectCall objectCall) {
        this.objectCall = objectCall;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getValueConstructor() {
        return id;
    }

    public void setValueConstructor(String id) {
        this.id = id;
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        if(id!=null)return "";
        else if(value!=null)return  "";
        else if(objectIndex.op_list!=null)return  objectIndex.codeGenerationJAVASCRIPT();
        else {
            return "";
        }
    }

    @Override
    public String toString() {

         if(id!=null)return id;
         else if(value!=null)return  value.toString();
         else if(objectIndex.op_list!=null)return  objectIndex.toString();
         else {
             return objectCall.toString();
         }

    }
}
