package com.company.ErrorHandeling;

import com.company.SymbolTablle.Scope;
import com.company.SymbolTablle.Symbol;
import com.company.SymbolTablle.SymbolTable;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

public class ErrorHandling {
    SymbolTable symbolTable ;

    public ArrayList<String> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<String> errors) {
        this.errors = errors;
    }

    ArrayList<String> errors = new ArrayList<String>() ;

    public void setSymbolTable(SymbolTable symbolTable){
        this.symbolTable = symbolTable ;
    }

    void checkRepped(){
        for(Scope scope : symbolTable.getScopes()){
            if (!scope.getName().equals("prog")) {
                checkReppedInScope(scope);
            }
        }
    }
    void checkCallConstructors(){
        for (Scope scope : symbolTable.getScopes())
            for(Symbol symbol : scope.getSymbols())
                if (symbol.getType()!=null && symbol.getType().equals("call_constructor")&&! symbol.getName().equals("TextEditingController"))
                    if (!checkCallConstructor(symbol)){
                        errors.add("there is no class with name " + symbol.getName()) ;
                    }
    }
    void checkListsElement(){
        for (Scope scope : symbolTable.getScopes())
            for(Symbol symbol : scope.getSymbols())
                if(symbol.getType()!= null &&symbol.getType().equals("list"))
                    checkListElement(symbol);
    }
    void checkListElement(Symbol symbol){
        String type = getTypeOList(symbol.getListPar().get(0)) ;
        if (type.equals("call_constructor")) {
            String construct = symbol.getListPar().get(0) ;
            for (String s : symbol.getListPar()) {
                if (!s.equals(construct)) {
                    errors.add("wrong value in list " + symbol.getName());
                    return ;
                }
            }
        }else {
            for (String s : symbol.getListPar())
                if (!getTypeOList(s).equals(type)){
                    errors.add("wrong value in list " + symbol.getName());
                    return ;
                }
        }
    }

    /*
     * check if constructor declared in the correct class
     * */
    void checkConstructorDeclare(){
        for (Scope scope : symbolTable.getScopes()){
            checkConstructorInScope(scope) ;
        }
    }

    /*
     * check if var didn't declared
     * */
    void checkDeclaration(){
        for(Scope scope : symbolTable.getScopes()){
            if (scope.getType().equals("function") || scope.getType().equals("for")||scope.getType().equals("class") ) {
                checkDidntDeclareclass(scope);
            }

        }
    }
    void checkIfcondition(){
        for(Scope scope : symbolTable.getScopes())
            for(Symbol symbol : scope.getSymbols())
                if (symbol.getType() != null && symbol.getType().equals("condition")){
                    checkCondition(symbol) ;
                }
    }
    boolean checkCallConstructor(Symbol symbol){
        for(Scope scope :symbolTable.getScopes()){
            if (scope.getName().equals(symbol.getName()))
                return true ;
        }
        return false ;
    }
    void checkAssigment(){
        for(Scope scope : symbolTable.getScopes()){
            for(Symbol symbol : scope.getSymbols()){
                String typeOFsymbol  ;
                if (symbol.getType() == null){
                    typeOFsymbol = getTypeOfSymbol(symbol) ;
                }else typeOFsymbol = symbol.getType() ;
                if ( !typeOFsymbol.equals("class") &&
                        !typeOFsymbol.equals("list") && !typeOFsymbol.equals("constructor") &&
                        !typeOFsymbol.equals("call_constructor")&&
                        !typeOFsymbol.equals("condition") &&
                        symbol.getValue() != null
                )
                    if (!typeOFsymbol.equals(getTypeOfValue(symbol)) && !typeOFsymbol.equals("not Declared")) {

                        errors.add("wrong assigment to var " + symbol.getName());
                    }
            }

        }
    }
    /*
     * this function check scope if has a sybole declared mor than one
     */
    void checkReppedInScope(Scope scope) {
        for(Symbol symbol : scope.getSymbols()){
            if (symbol.getType()!= null) {
                symbol.setNewVar("true");
                checkInsideScope(scope, symbol);
            }
            if (scope.getName().equals("for")){
                while (scope.getParent()!=null) {
                    checkInsideScope(scope.getParent(), symbol);
                    scope = scope.getParent() ;
                }
            }
        }
    }
    void checkCondition(Symbol symbol){
        String value1 = getTypeOfString(symbol.getName() , symbol.getScope()) ;
        String value2 = getTypeOfString(symbol.getValue() , symbol.getScope()) ;
        if (!value1.equals(value2))
            errors.add("can not compare "+ value1 + " with " + value2 ) ;
    }
    /*
     * this function find the var that it not declared in the class
     * and add it to errors List
     */
    void checkDidntDeclareclass(Scope scope){
        for(Symbol symbol : scope.getSymbols()){
            symbol.setVar(true);
            if(!checkIfDeclared(symbol ,scope) ){
                errors.add("this var "+symbol.getName()+" didnt declared") ;
            }
        }
    }
    void checkConstructorInScope(Scope scope){
        for(Symbol symbol : scope.getSymbols()){
            if (symbol.getType() != null &&symbol.getType().equals("constructor") )
                if(!symbol.getName().equals(scope.getName()))
                    errors.add("wrong name to constructor "+symbol.getName()+" the name should be " + scope.getName()) ;
        }
    }
    /*
     * this function check if the var was declared in his scope
     * and use with class scope and function scope only
     * no return but it add an error to errors List
     * */
    void checkInsideScope(Scope scope , Symbol symbol){
        for(Symbol s : scope.getSymbols()){
            if (s.getName().equals(symbol.getName()  )&&
                    !(s.isNewVar().equals("true") )&&
                    hasType(s) &&
                    hasType(symbol)
            )
            {
                errors.add("this vare "+symbol.getName()+" already declared in " + scope.getType() + " " + scope.getName()) ;
            }
        }
    }
    /*
     * this function check if the symbol was in his scope and his father scope
     * @return Boolean
     * */
    boolean checkIfDeclared(Symbol symbol , Scope scope){
        for(Symbol symbol1 : scope.getSymbols()){
            if (symbol1.getName() .equals (symbol.getName()) && symbol1.getType() != null   ){
                return true ;
            }
        }
        for(Symbol symbol1 : scope.getParent().getSymbols()){
            if (symbol1.getName().equals(symbol.getName()) && symbol1.getType() != null){
                return true ;
            }
        }
        return false ;
    }

    String getTypeOfString(String value , Scope scope){
        if (value == null )
            return "null" ;
        if (value.charAt(0) == '\"' || value.charAt(0) == '\''){
            return "String" ;
        }
        if (value.equals("true")  ||value.equals("false") )
            return "bool" ;
        if ( ( value.charAt(0) >=65 &&value.charAt(0) <=90 ) ||
                ( value.charAt(0) >=97 && value.charAt(0)<=122 ) ||
                value.charAt(0) == '_'
        ) {
            return checkTypeOfvar(value , scope);
        }
        for(int i = 0 ; i<value.length() ; i++){
            if (value.charAt(i) == '.')
                return "double" ;
        }
        return "int" ;
    }


    public void collectErrors (){
        checkRepped() ;//declare more than one
        checkDeclaration() ;//didn't declaration
        checkAssigment();//assigment wrong value to var
        checkMainCount();//check  main declared
        checkConstructorDeclare();//check if constructor was declared in correct position
        checkListsElement();//check if all element in the list has same type
        checkCallConstructors() ;
        checkIfcondition() ;

    }
    String yellow = "\u001B[33m";
    public void errors(){
        for (String s : this.errors){
            System.out.println(yellow+s);
        }
    }


    boolean hasType(Symbol symbol){
        return symbol.getType() != null &&
                symbol.getType()!="call_constructor" &&
                symbol.getType()!="condition" ;
    }
    /*
     * this function return the type of value after equals mark
     * example i = 5 : 5 is the  value we get its type
     * @return  String
     * */
    public String getTypeOfValue(Symbol symbol){
        if (symbol.getValue() == null )
            return "null" ;
        if (symbol.getValue().charAt(0) == '\"' || symbol.getValue().charAt(0) == '\''){
            return "String" ;
        }
        if (symbol.getValue().equals("true")  ||symbol.getValue().equals("false") )
            return "bool" ;
        if ( ( symbol.getValue().toString().charAt(0) >=65 && symbol.getValue().toString().charAt(0) <=90 ) ||
                ( symbol.getValue().toString().charAt(0) >=97 && symbol.getValue().toString().charAt(0)<=122 ) ||
                symbol.getValue().toString().charAt(0) == '_'
        ) {
            return checkTypeOfvar(symbol.getValue() ,symbol.getScope());
        }
        for(int i = 0 ; i<symbol.getValue().length() ; i++){
            if (symbol.getValue().charAt(i) == '.')
                return "double" ;
        }
        return "int" ;

    }
    /*
     * this function return the type of value if it was var
     * example : i = x : x is the var we get its value
     * @return String
     * */
    String checkTypeOfvar(String s , Scope scope){

        for (Symbol symbol1 : scope.getSymbols()){
            if (symbol1.getName().equals(s) && symbol1.getType() !=null && !symbol1.getType().equals("condition")) {
                return symbol1.getType().toString();
            }
        }
        if (!scope.getParent().getName().equals("prog")){
            scope = scope.getParent() ;

            for (Symbol symbol1 : scope.getSymbols()){
                if (symbol1.getName().equals(s) && symbol1.getType() !=null && !symbol1.getType().equals("condition")) {
                    return symbol1.getType().toString();
                }
            }
        }
        return "not Declalred" ;
    }
    /*
     * this function get the type of one scope
     * example : i = 6 : i it's the scope we get its type
     * @return String
     * */
    String getTypeOfSymbol(Symbol symbol){
        Scope scope = symbol.getScope() ;
        for(Symbol symbol1 : scope.getSymbols()){
            if (symbol1.getName().equals(symbol.getName()) && symbol1.getType() != null)
                return symbol1.getType() ;
        }
        scope = scope.getParent() ;
        for(Symbol symbol1 : scope.getSymbols()){
            if (symbol1.getName().equals(symbol.getName()) && symbol1.getType() != null)
                return symbol1.getType() ;
        }
        return "not Declared" ;
    }
    /*
     * check if main was declared no once or mor than onr
     * */
    void checkMainCount(){
        if (symbolTable.getMainCont() < 1 )
            errors.add("there is no main function") ;
        else if (symbolTable.getMainCont() > 1 )
            errors.add("there is more than main function");
    }
    String getTypeOList(String s){

        if (s.charAt(0) == '\"' ||s.charAt(0) == '\''){
            return "String" ;
        }
        if (s.equals("true")  ||s.equals("false") )
            return "bool" ;
        if ( ( s.charAt(0)>=65 && s.charAt(0) <=90 ) ||
                ( s.charAt(0) >=97 && s.charAt(0)<=122 ) ||
                s.charAt(0) == '_'
        ) {
            return "call_constructor";
        }
        for(int i = 0 ; i<s.length() ; i++){
            if (s.charAt(0)== '.')
                return "double" ;
        }
        return "int" ;
    }

}
