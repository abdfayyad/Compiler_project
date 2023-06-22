package com.company.ast.models;

import com.company.ast.models.RelationalExpression;
import com.company.ast.models.Type;
import com.company.ast.nodes.Node;

public class Assignment extends Node {
    Type type;
    String id ;
    String equal;
  Assignment_type assignment_type;
    String semicolon;

    public Assignment_type getAssignment_type() {
        return assignment_type;
    }

    public void setAssignment_type(Assignment_type assignment_type) {
        this.assignment_type = assignment_type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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


    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        String s="";
      if(this.type!=null) s+=this.type;
      s+=this.id+this.equal+this.assignment_type.toString()+this.semicolon;
return s;
    }
}
