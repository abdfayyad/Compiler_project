package com.company.ast.models;

import com.company.ast.nodes.Node;

public class BreakLoop extends Node {
    String breakk;
    String semicolon;

    public String getBreakk() {
        return breakk;
    }

    public void setBreakk(String breakk) {
        this.breakk = breakk;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        return breakk+semicolon;
    }
}
