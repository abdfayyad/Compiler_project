package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Main_function extends Node {
    String voidd;
    String mainn;
    String openList;
    String closeList;
    String blockOpen;
    String blockClose;
    ArrayList<Statement>statements=new ArrayList<>();
    Run_App run_app=new Run_App();

    public String getVoidd() {
        return voidd;
    }

    public void setVoidd(String voidd) {
        this.voidd = voidd;
    }

    public String getMainn() {
        return mainn;
    }

    public void setMainn(String mainn) {
        this.mainn = mainn;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void setStatements(ArrayList<Statement> statements) {
        this.statements = statements;
    }

    public Run_App getRun_app() {
        return run_app;
    }

    public void setRun_app(Run_App run_app) {
        this.run_app = run_app;
    }

    @Override
    public String toString() {
        String s=new String();
        for (int i=0;i<statements.size();i++)
            s+=statements.get(i).toString();
        if(run_app!=null)
            return voidd+" "+mainn+openList+closeList+blockOpen+"\n     "+run_app.toString()+s+blockClose;
       else return     voidd+" "+mainn+openList+closeList+blockOpen+"\n     "+s+blockClose;
    }
}
