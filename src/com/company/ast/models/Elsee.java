package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Elsee extends Node {
    String elsee;
    BodyForIfWhile bodyForIfWhile;

    public BodyForIfWhile getBodyForIfWhile() {
        return bodyForIfWhile;
    }

    public void setElsee(String elsee) {
        this.elsee = elsee;
    }

    public void setBodyForIfWhile(BodyForIfWhile bodyForIfWhile) {
        this.bodyForIfWhile = bodyForIfWhile;
    }

    @Override
    public String toString() {
        return "Elsee{" +
                "elsee='" + this.elsee + '\'' +
                ", bodyForIfWhile=" + bodyForIfWhile.toString() +
                '}';
    }

    public String getElsee() {
        return elsee;
    }
}
