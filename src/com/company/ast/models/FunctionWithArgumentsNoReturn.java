package com.company.ast.models;

import com.company.ast.models.WithArguments;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class FunctionWithArgumentsNoReturn extends Node {
    String voidd;
    String id;
    WithArguments withArguments;
    String blockOpen;
    ArrayList<Statement> statements=new ArrayList<Statement>();
    String blockClose;

    public String getVoidd() {
        return voidd;
    }

    public void setVoidd(String voidd) {
        this.voidd = voidd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WithArguments getWithArguments() {
        return withArguments;
    }

    public void setWithArguments(WithArguments withArguments) {
        this.withArguments = withArguments;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    @Override
    public String toString() {
        String s = new String();
        for (int i = 1; i < statements.size(); i++) {
            s += statements.get(i).toString();
        }
       if(voidd!=null) return voidd + id + withArguments.toString() + blockOpen + s + blockClose;
      else return id + withArguments.toString() + blockOpen + s  + blockClose;
    }

}
