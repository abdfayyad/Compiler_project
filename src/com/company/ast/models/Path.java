package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Path extends Node {
     String string;
     ObjectIndex objectIndex=new ObjectIndex();
    ObjectCall objectCall=new ObjectCall();

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

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {

      if(string!=null)  return string;
      else if(objectCall.getId1()!=null)return objectCall.toString();
      else return objectIndex.toString();
    }

    @Override
    public String codeGenerationHTML() {
        if(string!=null)return string;
        else return  "";
    }
}
