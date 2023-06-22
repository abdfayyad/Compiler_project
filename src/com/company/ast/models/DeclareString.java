package com.company.ast.models;

import com.company.ast.nodes.Node;

public class DeclareString extends Node {
    String finall;
    String typeString;
    String id ;
    String equal;
    String string;
    String semicolon;

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }
     boolean isequal=false;
    @Override
    public String toString() {
        if(finall!=null&&string!=null){
            return  finall + typeString + id + equal + string + semicolon ;
        }else if(finall!=null){
            return finall + typeString + id + semicolon ;
        } else if (string!=null) {
            return typeString + id + equal + string + semicolon ;
        }else{
            return  typeString + id + semicolon ;
        }
    }
}
