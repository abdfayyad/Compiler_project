package com.company.ast.models;

import com.company.ast.models.BreakLoop;
import com.company.ast.models.ContinueLoop;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class BodyForIfWhile extends Node {
    String blockOpen;
    ArrayList<Statement> statements=new ArrayList<Statement>();
    BreakLoop breakLoop;
    ContinueLoop continueLoop;
    String BlockClose;

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

    public BreakLoop getBreakLoop() {
        return breakLoop;
    }

    public void setBreakLoop(BreakLoop breakLoop) {
        this.breakLoop = breakLoop;
    }

    public ContinueLoop getContinueLoop() {
        return continueLoop;
    }

    public void setContinueLoop(ContinueLoop continueLoop) {
        this.continueLoop = continueLoop;
    }

    public String getBlockClose() {
        return BlockClose;
    }

    public void setBlockClose(String blockClose) {
        BlockClose = blockClose;
    }

    @Override
    public String toString() {
        String s = new String();
        for (int i = 1; i < statements.size(); i++) {
            s += statements.get(i).toString();
        }
        if (breakLoop!=null&&continueLoop!=null)return blockOpen+s+breakLoop.toString()+continueLoop.toString()+blockOpen;
        else if(breakLoop!=null)return blockOpen+s+breakLoop.toString()+blockOpen;
        else if(continueLoop!=null)return blockOpen+s+continueLoop.toString()+blockOpen;
        else return blockOpen+s+blockOpen;
    }
}
