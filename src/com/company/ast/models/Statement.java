package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Statement extends Node {
    For_loop for_loop;
    ForIn forIn;
    IfRule ifRule;
    WhileLoop whileLoop;
    Functionn function;
    Declaretion declaretion;
    Assignment assignment;
    Call_Constructor callConstructor;
    CallFunction callFunction;
    RelationalExpression relationalExpression;

    public For_loop getFor_loop() {
        return for_loop;
    }

    public void setFor_loop(For_loop for_loop) {
        this.for_loop = for_loop;
    }

    public ForIn getForIn() {
        return forIn;
    }

    public void setForIn(ForIn forIn) {
        this.forIn = forIn;
    }

    public IfRule getIfRule() {
        return ifRule;
    }

    public void setIfRule(IfRule ifRule) {
        this.ifRule = ifRule;
    }

    public WhileLoop getWhileLoop() {
        return whileLoop;
    }

    public void setWhileLoop(WhileLoop whileLoop) {
        this.whileLoop = whileLoop;
    }

    public Functionn getFunction() {
        return function;
    }

    public void setFunction(Functionn function) {
        this.function = function;
    }

    public Declaretion getDeclaretion() {
        return declaretion;
    }

    public void setDeclaretion(Declaretion declaretion) {
        this.declaretion = declaretion;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }



    public Call_Constructor getCallConstructor() {
        return callConstructor;
    }

    public void setCallConstructor(Call_Constructor callConstructor) {
        this.callConstructor = callConstructor;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public RelationalExpression getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(RelationalExpression relationalExpression) {
        this.relationalExpression = relationalExpression;
    }

    @Override
    public String toString() {
     if(for_loop!=null)return  for_loop.toString();
     else if(forIn!=null)return  forIn.toString();
     else if(whileLoop!=null)return  whileLoop.toString();
     else if(function!=null)return  function.toString();
     else if(declaretion!=null)return declaretion.toString();
     else if(assignment!=null)return  assignment.toString();
     else if(callConstructor!=null)return callConstructor.toString();
     else if(callFunction!=null)return callFunction.toString();
     else  return relationalExpression.toString();
    }
}
