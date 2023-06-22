package com.company.ast.models;

import com.company.ast.models.ReturnFunction;
import com.company.ast.models.Type;
import com.company.ast.models.WithArguments;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class FunctionArgumentsReturn extends Node {
    Type type;
    String id;
    WithArguments withArguments;
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
        for (int i = 0; i < statements.size(); i++) {
            s += statements.get(i).toString();
        }
        return type + id + withArguments+ blockOpen + s + returnFunction+ blockClose;
    }
}
