package com.company.ast.models;

import com.company.ast.models.NoArguments;
import com.company.ast.models.ReturnFunction;
import com.company.ast.models.Type;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class FunctionNoArgumentsReturn extends Node {
    Type type;
    String id;
    NoArguments noArguments;
    String blockOpen;
    ArrayList<Statement> statements = new ArrayList<Statement>();
    ReturnFunction returnFunction;
    String blockClose;

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

    public NoArguments getNoArguments() {
        return noArguments;
    }

    public void setNoArguments(NoArguments noArguments) {
        this.noArguments = noArguments;
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

    public ReturnFunction getReturnFunction() {
        return returnFunction;
    }

    public void setReturnFunction(ReturnFunction returnFunction) {
        this.returnFunction = returnFunction;
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
        return type.toString() + id + noArguments.toString() + blockOpen + s + returnFunction.toString() + blockClose;
    }
}
