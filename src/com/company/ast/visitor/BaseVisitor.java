package com.company.ast.visitor;


import com.company.Main;
import com.company.SymbolTablle.Scope;
import com.company.SymbolTablle.Symbol;
import com.company.SymbolTablle.SymbolTable;
import com.company.ast.models.*;
import com.company.ast.nodes.Node;
import com.company.dartParser;
import com.company.dartParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;

public class BaseVisitor extends dartParserBaseVisitor {
    //SymbolTable symbolTable=new SymbolTable();
    public BaseVisitor() {
    }
    boolean isFunction = false  ;
    @Override
    public Program visitProgram(dartParser.ProgramContext ctx) {
        Program program = new Program();
        createScope("prog" , "general");
        int i;
        for (i = 0; i < ctx.import_statement().size(); ++i) {
            program.getImportStatements().add( this.visitImport_statement(ctx.import_statement(i)));
        }
        for (i = 0; i < ctx.declare_class().size(); ++i) {
            program.getDeclare_classes().add( this.visitDeclare_class(ctx.declare_class(i)));
        }
        for (i = 0; i < ctx.main_function().size(); ++i) {
            program.getMain_functions().add( this.visitMain_function(ctx.main_function(i)));
        }
        removeScope();
//        this.symbolTable.print();
        return program;
    }



    ////////////
    @Override
    public For_loop visitFor_loop(dartParser.For_loopContext ctx) {
        createScope("for" ,"for" ) ;
        For_loop for_loop = new For_loop();
        for_loop.setFor(ctx.FOR().toString());
        for_loop.setOpen(ctx.OPEN_LIST().toString());
        for_loop.setParts(this.visitForLoopParts(ctx.forLoopParts()));
        for_loop.setClose(ctx.CLOSE_LIST().toString());
        for_loop.setbody( this.visitBody_for_if_while(ctx.body_for_if_while()));
        removeScope();
        return for_loop;
    }

    ///////////
    @Override
    public For_loop_parts visitForLoopParts(dartParser.ForLoopPartsContext ctx) {
//        Symbol symbol = new Symbol() ;
        For_loop_parts parts_loop = new For_loop_parts();
        parts_loop.setIntial( this.visitForInitializerStatementTerminator(ctx.forInitializerStatementTerminator()));
        parts_loop.setCondition( this.visitForCondition(ctx.forCondition()));
        parts_loop.setIncrement( this.visitForIncrement(ctx.forIncrement()));
        return parts_loop;
    }

    /////////////
    @Override
    public For_Initializer_Statement_Terminator visitForInitializerStatementTerminator(dartParser.ForInitializerStatementTerminatorContext ctx) {
        For_Initializer_Statement_Terminator Intializer = new For_Initializer_Statement_Terminator();
        for (int i = 0; i < ctx.declaretion().size(); ++i) {
            Intializer.getDeclarrtionss().add( this.visitDeclaretion(ctx.declaretion(i)));
        }
        return Intializer;

    }

    /////////////
    @Override
    public For_Condition visitForCondition(dartParser.ForConditionContext ctx) {
        For_Condition for_condition = new For_Condition();
        for_condition.setId(ctx.ID().toString());
        for_condition.setSemi(ctx.SEMICOLON().toString());
        for_condition.setCond_op(this.visitConditional_operator(ctx.conditional_operator()));
        createSymbol(getCurrentScope() , for_condition.getId() , null , false , null);
        return for_condition;
    }

    ///////////////
    @Override
    public For_Increment visitForIncrement(dartParser.ForIncrementContext ctx) {
        For_Increment for_increment = new For_Increment();
        if (ctx.assignment() != null) {
            for_increment.setAssignment((Assignment) this.visitAssignment(ctx.assignment()));
        }
        if (ctx.PLUS_PLUS() != null) {
            for_increment.setPlus_plus(ctx.PLUS_PLUS().toString());
            for_increment.setId(ctx.ID().toString());
        }
        if (ctx.MINUS_MINUS() != null) {
            for_increment.setMinus_minus(ctx.MINUS_MINUS().toString());
            for_increment.setId(ctx.ID().toString());
        }
        if (ctx.MINUS() != null) {
            for_increment.setMinus(ctx.MINUS().toString());
            for_increment.setEqual(ctx.EQUAL().toString());
            for_increment.setId(ctx.ID().toString());
            for_increment.setValue_constructor(this.visitValue_constructor(ctx.value_constructor()));
        }
        if (ctx.PLUS() != null) {
            for_increment.setPlus(ctx.PLUS().toString());
            for_increment.setEqual(ctx.EQUAL().toString());
            for_increment.setId(ctx.ID().toString());
            for_increment.setValue_constructor(this.visitValue_constructor(ctx.value_constructor()));

        }
        return for_increment;
    }

    ////////newobject
    @Override
    public NewObject visitNewObject(dartParser.NewObjectContext ctx) {
        NewObject newObject = new NewObject();
        newObject.setId1(ctx.ID(0).toString().trim());
        newObject.setId2(ctx.ID(1).toString().trim());
        if (ctx.EQUAL()!= null)
            newObject.setEqual(ctx.EQUAL().toString());
        if (ctx.NEW() != null) newObject.setNeww(ctx.NEW().toString());
        newObject.setCall_constructor(visitCall_constructor(ctx.call_constructor()));
        newObject.setSemi(ctx.SEMICOLON().toString());
        String name = newObject.getId2() ;
        String type = newObject.getId1() ;
        createSymbol(getCurrentScope() , name , type , false , null );
        return newObject;
    }
    //////////

    @Override
    public ConstructorClass visitConstructor_class(dartParser.Constructor_classContext ctx) {
        ConstructorClass constructorClass = new ConstructorClass();
        constructorClass.setId(ctx.ID().toString());
        constructorClass.setOp_list(ctx.OPEN_LIST().toString());
        constructorClass.setClose_list(ctx.CLOSE_LIST().toString());
        constructorClass.setSemi(ctx.SEMICOLON().toString());
        if (ctx.COMMA() != null && ctx.COMMA().size() > 0)
            constructorClass.setComma(ctx.COMMA().get(0).toString().trim());
        for (int i = 0; i < ctx.item_constructor_class().size(); i++) {
            constructorClass.getItemConstructorClasses().add(visitItem_constructor_class(ctx.item_constructor_class(i)));
        }
        String type = "constructor" ;
        String name = constructorClass.getId() ;
        Symbol symbol = new Symbol(name) ;
        symbol.setFinal(false);
        symbol.setType(type);
        createSymbol(getCurrentScope() ,name , type , false , null);
        return constructorClass;
    }

    @Override
    public ItemConstructorClass visitItem_constructor_class(dartParser.Item_constructor_classContext ctx) {
        ItemConstructorClass itemConstructorClass = new ItemConstructorClass();
        itemConstructorClass.setThiss(ctx.THIS().toString());
        itemConstructorClass.setDot(ctx.DOT().toString());
        itemConstructorClass.setId(ctx.ID().toString());
        return itemConstructorClass;
    }


    //////////////////
    @Override
    public Assignment visitAssignment(dartParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();
        String type = null ;
        if (ctx.type() != null) {
            assignment.setType(this.visitType(ctx.type()));
            type = assignment.getType().toString() ;
        }
        assignment.setId(ctx.ID().toString());
        assignment.setEqual(ctx.EQUAL().toString());
        assignment.setAssignment_type(this.visitAssignment_type(ctx.assignment_type()));
        assignment.setSemicolon(ctx.SEMICOLON().toString());
        String name = assignment.getId() ;
        String value = assignment.getAssignment_type().toString() ;
        createSymbol(getCurrentScope() , name ,type , false , value);
        return assignment;
    }

    ///////////
    @Override
    public Assignment_type visitAssignment_type(dartParser.Assignment_typeContext ctx) {
        Assignment_type assignment_type = new Assignment_type();
        if (ctx.ID() != null) assignment_type.setId(ctx.ID().toString());
        ///////////error
        if (ctx.value() != null) assignment_type.setValue(this.visitValue(ctx.value()));
        if (ctx.relationalExpression() != null)
            assignment_type.setRelationalExpression(this.visitRelationalExpression(ctx.relationalExpression()));
        return assignment_type;
    }

    ////////////////
    @Override
    public WhileLoop visitWhile_loop(dartParser.While_loopContext ctx) {
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.setWhilee(ctx.WHILE().toString());
        whileLoop.setOpenList(ctx.OPEN_LIST().toString());
        whileLoop.setCondition((Condition) this.visitCondition(ctx.condition()));
        whileLoop.setCloseList(ctx.CLOSE_LIST().toString());
        whileLoop.setBodyForIfWhile((BodyForIfWhile) this.visitBody_for_if_while(ctx.body_for_if_while()));
        return whileLoop;
    }


    ///////////////
    @Override
    public IfRule visitIf_rule(dartParser.If_ruleContext ctx) {
        IfRule ifRule = new IfRule();
        ifRule.setIff(ctx.IF().toString());
        ifRule.setOpenList(ctx.OPEN_LIST().toString());
        ifRule.setCondition((Condition) this.visitCondition(ctx.condition()));
        ifRule.setCloseList(ctx.CLOSE_LIST().toString());
        ifRule.setBodyForIfWhile((BodyForIfWhile) this.visitBody_for_if_while(ctx.body_for_if_while()));
        if (ctx.elsee() != null) ifRule.setElsee(this.visitElsee(ctx.elsee()));
        return ifRule;
    }

    ///////////
    @Override
    public Elsee visitElsee(dartParser.ElseeContext ctx) {
        Elsee elsee = new Elsee();
        elsee.setElsee(ctx.ELSE().toString());
        elsee.setBodyForIfWhile((BodyForIfWhile) this.visitBody_for_if_while(ctx.body_for_if_while()));
        return elsee;
    }

    /////////////
    @Override
    public ConditionObject visitCondition_object(dartParser.Condition_objectContext ctx) {
        ConditionObject conditionObject = new ConditionObject();
        if (ctx.BOOLEAN() != null) conditionObject.setBool(ctx.BOOLEAN().toString());
        if (ctx.DOUBLE() != null) conditionObject.setDoublee(ctx.DOUBLE().toString());
        if (ctx.INT() != null) conditionObject.setIntt(ctx.INT().toString());
        if (ctx.STRING() != null) conditionObject.setStringg(ctx.STRING().toString());
        if (ctx.ID() != null) conditionObject.setId(ctx.ID().toString());
        return conditionObject;
    }

    /////////////reviewwww
    @Override
    public Condition visitCondition(dartParser.ConditionContext ctx) {
        Condition condition = new Condition();
        condition.setConditionObject(visitCondition_object(ctx.condition_object(0)));
        condition.setOperator((Operator) visitOperator(ctx.operator()));
        condition.setConditionObject2(visitCondition_object(ctx.condition_object(1)));
        createSymbol(getCurrentScope() ,condition.getConditionObject().toString(),"condition", false , condition.getConditionObject2().toString() );
        return condition;
    }

    ///////////////
    @Override
    public Operator visitOperator(dartParser.OperatorContext ctx) {
        Operator operator = new Operator();
        if (ctx.EQUAL_EQUAL() != null)
            operator.setOperator(ctx.EQUAL_EQUAL().toString().trim());
        else if (ctx.EQUAL_GTHAN() != null)
            operator.setOperator(ctx.EQUAL_GTHAN().toString().trim());
        else if (ctx.EQUAL_LTHAN() != null)
            operator.setOperator(ctx.EQUAL_LTHAN().toString().trim());
        else if (ctx.GTHAN() != null)
            operator.setOperator(ctx.GTHAN().toString().trim());
        else if (ctx.LTHAN() != null)
            operator.setOperator(ctx.LTHAN().toString().trim());
        else if (ctx.NOTEQUAL_EQUAL() != null)
            operator.setOperator(ctx.NOTEQUAL_EQUAL().toString().trim());
        return operator;
    }

    ///////////////reviewww
    @Override
    public ForIn visitFor_in(dartParser.For_inContext ctx) {
        String name  ;
        String value = null;
        boolean isfinal = false ;
        String type ;
        ForIn forIn = new ForIn();
        forIn.setForr(ctx.FOR().toString().trim());
        forIn.setOpenList(ctx.OPEN_LIST().toString().trim());
        forIn.setTypeVar(ctx.TYPEVAR().toString());
        forIn.setId1(ctx.ID(0).toString().trim());
        forIn.setIn(ctx.IN().toString().trim());
        forIn.setId2(ctx.ID(1).toString().trim());
        forIn.setCloseList(ctx.CLOSE_LIST().toString().trim());
        forIn.setBodyForIfWhile((BodyForIfWhile) visitBody_for_if_while(ctx.body_for_if_while()));
        name = forIn.getId1() ;
        type = forIn.getTypeVar() ;
        createSymbol(getCurrentScope(),name , type , isfinal , value);
        return forIn;
    }

    ///////////////
    @Override
    public BodyForIfWhile visitBody_for_if_while(dartParser.Body_for_if_whileContext ctx) {

        BodyForIfWhile bodyForIfWhile = new BodyForIfWhile();
        bodyForIfWhile.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());
        for (int i = 0; i < ctx.statement().size(); i++)
            bodyForIfWhile.getStatements().add((Statement) visitStatement(ctx.statement().get(i)));
        if (ctx.break_loop() != null)
            bodyForIfWhile.setBreakLoop((BreakLoop) visitBreak_loop(ctx.break_loop()));
        if (ctx.continue_loop() != null)
            bodyForIfWhile.setContinueLoop((ContinueLoop) visitContinue_loop(ctx.continue_loop()));
        bodyForIfWhile.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        return bodyForIfWhile;
    }

    //////////////////
    @Override
    public BreakLoop visitBreak_loop(dartParser.Break_loopContext ctx) {
        BreakLoop breakLoop = new BreakLoop();
        breakLoop.setBreakk(ctx.BREAK().toString().trim());
        breakLoop.setSemicolon(ctx.SEMICOLON().toString().trim());
        return breakLoop;
    }

    /////////////
    @Override
    public ContinueLoop visitContinue_loop(dartParser.Continue_loopContext ctx) {
        ContinueLoop continueLoop = new ContinueLoop();
        continueLoop.setContinuee(ctx.CONTINUE().toString().trim());
        continueLoop.setSemicolon(ctx.SEMICOLON().toString().trim());
        return continueLoop;
    }

    ///////////
    @Override
    public RelationalExpression visitRelationalExpression(dartParser.RelationalExpressionContext ctx) {
        RelationalExpression relationalExpression = new RelationalExpression();
        relationalExpression.getAdditiveExpressions().add((AdditiveExpression) visitAdditiveExpression(ctx.additiveExpression().get(0)));
        for (int i = 1; i < ctx.additiveExpression().size(); i++) {
            relationalExpression.getRelationalOperators().add((RelationalOperator) visitRelationalOperator(ctx.relationalOperator().get(i)));
            relationalExpression.getAdditiveExpressions().add((AdditiveExpression) visitAdditiveExpression(ctx.additiveExpression().get(i)));
        }
        return relationalExpression;
    }

    ////////////////
    @Override
    public RelationalOperator visitRelationalOperator(dartParser.RelationalOperatorContext ctx) {
        RelationalOperator relationalOperator = new RelationalOperator();
        if (ctx.GTHAN() != null)
            relationalOperator.setRelaOperator(ctx.GTHAN().toString().trim());
        else if (ctx.LTHAN() != null)
            relationalOperator.setRelaOperator(ctx.LTHAN().toString().trim());
        else if (ctx.EQUAL_GTHAN() != null)
            relationalOperator.setRelaOperator(ctx.EQUAL_GTHAN().toString().trim());
        else if (ctx.EQUAL_LTHAN() != null)
            relationalOperator.setRelaOperator(ctx.EQUAL_LTHAN().toString().trim());
        else if (ctx.EQUAL_EQUAL() != null)
            relationalOperator.setRelaOperator(ctx.EQUAL_EQUAL().toString().trim());
        else if (ctx.NOTEQUAL_EQUAL() != null)
            relationalOperator.setRelaOperator(ctx.NOTEQUAL_EQUAL().toString().trim());
        return relationalOperator;
    }

    /////////////////
    @Override
    public AdditiveExpression visitAdditiveExpression(dartParser.AdditiveExpressionContext ctx) {
        AdditiveExpression additiveExpression = new AdditiveExpression();
        additiveExpression.getMultiplicativeExpressions().add((MultiplicativeExpression) visitMultiplicativeExpression(ctx.multiplicativeExpression().get(0)));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            additiveExpression.getAdditiveOperators().add((AdditiveOperator) visitAdditiveOperator(ctx.additiveOperator().get(i)));
            additiveExpression.getMultiplicativeExpressions().add((MultiplicativeExpression) visitMultiplicativeExpression(ctx.multiplicativeExpression().get(i)));
        }
        return additiveExpression;
    }

    /////////////////

    @Override
    public AdditiveOperator visitAdditiveOperator(dartParser.AdditiveOperatorContext ctx) {
        AdditiveOperator additiveOperator = new AdditiveOperator();
        if (ctx.PLUS() != null)
            additiveOperator.setAdditiveOperator(ctx.PLUS().toString().trim());
        else if (ctx.MINUS() != null)
            additiveOperator.setAdditiveOperator(ctx.MINUS().toString().trim());
        return additiveOperator;
    }

    ////////////////
    @Override
    public MultiplicativeExpression visitMultiplicativeExpression(dartParser.MultiplicativeExpressionContext ctx) {
        MultiplicativeExpression multiplicativeExpression = new MultiplicativeExpression();
        multiplicativeExpression.getUnaryExpressions().add(visitUnaryExpression(ctx.unaryExpression().get(0)));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            multiplicativeExpression.getMultiplicativeOperator().add(visitMultiplicativeOperator(ctx.multiplicativeOperator().get(i)));
            multiplicativeExpression.getUnaryExpressions().add((UnaryExpression) visitUnaryExpression(ctx.unaryExpression().get(i)));
        }
        return multiplicativeExpression;
    }
    ////////////////

    @Override
    public MultiplicativeOperator visitMultiplicativeOperator(dartParser.MultiplicativeOperatorContext ctx) {
        MultiplicativeOperator multiplicativeOperator = new MultiplicativeOperator();
        if (ctx.MULT() != null)
            multiplicativeOperator.setMulti(ctx.MULT().toString().trim());
        else if (ctx.DIVISIOS() != null)
            multiplicativeOperator.setMulti(ctx.DIVISIOS().toString().trim());
        else if (ctx.MODULUS() != null)
            multiplicativeOperator.setMulti(ctx.MODULUS().toString().trim());
        return multiplicativeOperator;

    }

    //////////////////
    @Override
    public UnaryExpression visitUnaryExpression(dartParser.UnaryExpressionContext ctx) {
        UnaryExpression unaryExpression = new UnaryExpression();
        if (ctx.MINUS() != null) {
            unaryExpression.setMinus(ctx.MINUS().toString().trim());
            unaryExpression.setUnaryExpression(visitUnaryExpression(ctx.unaryExpression()));
        }
        if (ctx.primaryExpression() != null)
            unaryExpression.setPrimaryExpression((PrimaryExpression) visitPrimaryExpression(ctx.primaryExpression()));
        return unaryExpression;
    }

    ////////////////
    @Override
    public PrimaryExpression visitPrimaryExpression(dartParser.PrimaryExpressionContext ctx) {
        PrimaryExpression primaryExpression = new PrimaryExpression();
        /////////error
        if (ctx.number() != null)
            primaryExpression.setNumberr(this.visitNumber(ctx.number()));
        if (ctx.ID() != null)
            primaryExpression.setId(ctx.ID().toString().trim());
        if (ctx.OPEN_LIST() != null) {
            primaryExpression.setOpenList(ctx.OPEN_LIST().toString().trim());
            primaryExpression.setRelationalExpression(visitRelationalExpression(ctx.relationalExpression()));
            primaryExpression.setCloseList(ctx.CLOSE_LIST().toString().trim());
        }
        return primaryExpression;
    }
    //////////////////

    @Override
    public Statement visitStatement(dartParser.StatementContext ctx) {
        Statement statement = new Statement();


        if (ctx.for_loop() != null)
            statement.setFor_loop(visitFor_loop(ctx.for_loop()));
        if (ctx.for_in() != null)
            statement.setForIn(visitFor_in(ctx.for_in()));
        if (ctx.if_rule() != null)
            statement.setIfRule(visitIf_rule(ctx.if_rule()));
        if (ctx.while_loop() != null)
            statement.setWhileLoop(visitWhile_loop(ctx.while_loop()));
        if (ctx.functions() != null)
            statement.setFunction(visitFunctions(ctx.functions()));
        if (ctx.declaretion() != null)
            statement.setDeclaretion(visitDeclaretion(ctx.declaretion()));
        if (ctx.assignment() != null)
            statement.setAssignment(visitAssignment(ctx.assignment()));
        if (ctx.call_constructor() != null)
            statement.setCallConstructor(visitCall_constructor(ctx.call_constructor()));
        if (ctx.call_function() != null)
            statement.setCallFunction(visitCall_function(ctx.call_function()));
        if (ctx.relationalExpression() != null)
            statement.setRelationalExpression(visitRelationalExpression(ctx.relationalExpression()));


        return statement;
    }

    /////////////
    @Override
    public Functionn visitFunctions(dartParser.FunctionsContext ctx) {////////////////////////////

        Functionn function = new Functionn();
        if (ctx.function_arguments_return() != null)
            function.setFunctionArgumentsReturn(visitFunction_arguments_return(ctx.function_arguments_return()));
        else if (ctx.function_noarguments_noreturn() != null)
            function.setFunctionNoArgumentsNoReturn(visitFunction_noarguments_noreturn(ctx.function_noarguments_noreturn()));
        else if (ctx.function_noarguments_return() != null)
            function.setFunctionNoArgumentsReturn(visitFunction_noarguments_return(ctx.function_noarguments_return()));
        else if (ctx.function_with_arguments_noreturn() != null)
            function.setFunctionWithArgumentsNoReturn(visitFunction_with_arguments_noreturn(ctx.function_with_arguments_noreturn()));
        return function;
    }

    //////////////
    @Override
    public FunctionNoArgumentsNoReturn visitFunction_noarguments_noreturn(dartParser.Function_noarguments_noreturnContext ctx) {
        FunctionNoArgumentsNoReturn functionNoArgumentsNoReturn = new FunctionNoArgumentsNoReturn();
        createScope(functionNoArgumentsNoReturn.getId() , "function");
        if (ctx.VOID() != null) functionNoArgumentsNoReturn.setVoidd(ctx.VOID().toString().trim());
        functionNoArgumentsNoReturn.setId(ctx.ID().toString().trim());
        functionNoArgumentsNoReturn.setNoArguments(visitNo_arguments(ctx.no_arguments()));
        functionNoArgumentsNoReturn.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());

        for (int i = 0; i < ctx.statement().size(); i++) {
            functionNoArgumentsNoReturn.getStatements().add(visitStatement(ctx.statement().get(i)));
        }
        functionNoArgumentsNoReturn.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        removeScope();
        String name = functionNoArgumentsNoReturn.getId() ;
        String type = functionNoArgumentsNoReturn.getVoidd() ;
        if(type == null) type = "function" ;
        createSymbol(getCurrentScope(),name , type , false ,null);
        return functionNoArgumentsNoReturn;
    }

    //////////
    @Override
    public FunctionWithArgumentsNoReturn visitFunction_with_arguments_noreturn(dartParser.Function_with_arguments_noreturnContext ctx) {
        FunctionWithArgumentsNoReturn functionWithArgumentsNoReturn = new FunctionWithArgumentsNoReturn();
        if (ctx.VOID() != null) functionWithArgumentsNoReturn.setVoidd(ctx.VOID().toString().trim());
        functionWithArgumentsNoReturn.setId(ctx.ID().toString().trim());
        createScope(functionWithArgumentsNoReturn.getId(),"function");
        functionWithArgumentsNoReturn.setWithArguments(visitWith_arguments(ctx.with_arguments()));
        functionWithArgumentsNoReturn.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());
        if (ctx.statement() != null)
            for (int i = 0; i < ctx.statement().size(); i++) {
                functionWithArgumentsNoReturn.getStatements().add((Statement) visitStatement(ctx.statement().get(i)));
            }
        functionWithArgumentsNoReturn.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        removeScope();

        createSymbol(getCurrentScope() , functionWithArgumentsNoReturn.getId() , "function" , false , null);
        return functionWithArgumentsNoReturn;
    }

    ////////////
    @Override
    public FunctionNoArgumentsReturn visitFunction_noarguments_return(dartParser.Function_noarguments_returnContext ctx) {
        FunctionNoArgumentsReturn functionNoArgumentsReturn = new FunctionNoArgumentsReturn();
        functionNoArgumentsReturn.setType(visitType(ctx.type()));
        functionNoArgumentsReturn.setId(ctx.ID().toString().trim());
        functionNoArgumentsReturn.setNoArguments(visitNo_arguments(ctx.no_arguments()));
        functionNoArgumentsReturn.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());
        createScope(functionNoArgumentsReturn.getId(),"function ");
        if (ctx.statement() != null)
            for (int i = 0; i < ctx.statement().size(); i++) {
                functionNoArgumentsReturn.getStatements().add((Statement) visitStatement(ctx.statement().get(i)));
            }
        removeScope();
        String name = functionNoArgumentsReturn.getId() ;
        String type = functionNoArgumentsReturn.getType().toString() ;
        String value = functionNoArgumentsReturn.getReturnFunction().getValue().toString() ;
        if (type == null) type = "function" ;
        createSymbol(getCurrentScope(),name , type , false , value);
        functionNoArgumentsReturn.setReturnFunction(visitReturn_function(ctx.return_function()));
        functionNoArgumentsReturn.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        return functionNoArgumentsReturn;
    }

    ///////
    @Override
    public FunctionArgumentsReturn visitFunction_arguments_return(dartParser.Function_arguments_returnContext ctx) {


        FunctionArgumentsReturn functionArgumentsReturn = new FunctionArgumentsReturn();
        functionArgumentsReturn.setType(visitType(ctx.type()));
        functionArgumentsReturn.setId(ctx.ID().toString().trim());
        createScope(functionArgumentsReturn.getId(),"function");//#####
        functionArgumentsReturn.setWithArguments(visitWith_arguments(ctx.with_arguments()));
        functionArgumentsReturn.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());
        if (ctx.statement() != null)
            for (int i = 0; i < ctx.statement().size(); i++) {
                functionArgumentsReturn.getStatements().add((Statement) visitStatement(ctx.statement().get(i)));
            }
        removeScope();//#####
        functionArgumentsReturn.setReturnFunction(visitReturn_function(ctx.return_function()));
        functionArgumentsReturn.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        //symbol
        String name = functionArgumentsReturn.getId();
        String type = functionArgumentsReturn.getType().toString() ;
        String value  ;
        if (functionArgumentsReturn.getReturnFunction().getId()!=null)
            value = functionArgumentsReturn.getReturnFunction().getId() ;
        else
            value = functionArgumentsReturn.getReturnFunction().getValue().toString() ;
        if(type == null) type = "function" ;
        createSymbol(getCurrentScope(),name , type ,false , value );
        return functionArgumentsReturn;
    }
/////////////

    @Override
    public WithArguments visitWith_arguments(dartParser.With_argumentsContext ctx) {
        // with_arguments:OPEN_LIST type ID(COMMA type ID)* CLOSE_LIST;
        WithArguments withArguments = new WithArguments();
        withArguments.setOpenList(ctx.OPEN_LIST().toString().trim());
        withArguments.getType().add(visitType(ctx.type().get(0)));
        withArguments.getId().add(ctx.ID(0).toString().trim()) ;
        createSymbol(getCurrentScope(),withArguments.getId().get(0) , withArguments.getType().get(0).toString() , false , null);
        for (int i = 1; i < ctx.type().size(); i++) {
            withArguments.setComma(" , ");
            withArguments.getType().add((Type) visitType(ctx.type().get(i)));
            withArguments.getId().add(ctx.ID(i).toString().trim());
            createSymbol(getCurrentScope(),withArguments.getId().get(i) , withArguments.getType().get(i).toString() , false , null);
        }
        withArguments.setCloseList(ctx.CLOSE_LIST().toString().trim());
        return withArguments;
    }

    /////////////
    @Override
    public NoArguments visitNo_arguments(dartParser.No_argumentsContext ctx) {
        NoArguments noArguments = new NoArguments();
        noArguments.setOpenList(ctx.OPEN_LIST().toString().trim());
        noArguments.setCloseList(ctx.CLOSE_LIST().toString().trim());
        return noArguments;
    }

    ////////////////
    @Override
    public ReturnFunction visitReturn_function(dartParser.Return_functionContext ctx) {
        ReturnFunction returnFunction = new ReturnFunction();
        returnFunction.setReturnn(ctx.RETURN().toString().trim());
        if (ctx.value() != null)
            returnFunction.setValue(visitValue(ctx.value()));
        if (ctx.ID() != null)
            returnFunction.setId(ctx.ID().toString().trim());
        returnFunction.setSemicolon(ctx.SEMICOLON().toString().trim());
        return returnFunction;
    }

    ////////
    @Override
    public Call_Constructor_Without_Param visitCall_constructor_without_param(dartParser.Call_constructor_without_paramContext ctx) {

        Call_Constructor_Without_Param call_constructor_without_param = new Call_Constructor_Without_Param();
        call_constructor_without_param.setId(ctx.ID().toString());
        call_constructor_without_param.setOpen_list(ctx.OPEN_LIST().toString());
        call_constructor_without_param.setClose_list(ctx.CLOSE_LIST().toString());
        String name =  call_constructor_without_param.getId() ;
        String type = "call_constructor" ;
        if (!isFunction)
            createSymbol(getCurrentScope(),name , type , false , null);
        isFunction = false ;
        return call_constructor_without_param;

    }

    ///////////
    @Override
    public Call_Constructor_With_Param visitCall_constructor_with_param(dartParser.Call_constructor_with_paramContext ctx) {

        Call_Constructor_With_Param call_constructor_with_param = new Call_Constructor_With_Param();
        call_constructor_with_param.setId(ctx.ID().toString().trim());
        call_constructor_with_param.setOpen_list(ctx.OPEN_LIST().toString().trim());
        if(ctx.value_constructor()!=null)
            for (int i = 0; i < ctx.value_constructor().size(); i++) {
                call_constructor_with_param.getValue_constructors().add(this.visitValue_constructor(ctx.value_constructor().get(i)));
            }
        call_constructor_with_param.setClose_list(ctx.CLOSE_LIST().toString().trim());
        String name = call_constructor_with_param.getId() ;
        String type = "call_constructor" ;
        if(!isFunction)
            createSymbol(getCurrentScope(),name , type , false , null);
        isFunction = false ;
        return call_constructor_with_param;
    }

    ///////////
    @Override
    public Call_Constructor visitCall_constructor(dartParser.Call_constructorContext ctx) {
        Call_Constructor call_constructor = new Call_Constructor();
        if (ctx.call_constructor_with_param() != null)
            call_constructor.setCall_constructor_with_param(this.visitCall_constructor_with_param(ctx.call_constructor_with_param()));
        if (ctx.call_constructor_without_param() != null)
            call_constructor.setCall_constructor_without_param(this.visitCall_constructor_without_param(ctx.call_constructor_without_param()));
        return call_constructor;
    }


    /////////
    @Override
    public Run_App visitRun_app(dartParser.Run_appContext ctx) {
        Run_App run_app = new Run_App();
        run_app.setRunApp(ctx.RUNAPP().toString());
        run_app.setOpen_list(ctx.OPEN_LIST().toString());
        if (ctx.CONST() != null) {
            run_app.setConstance(ctx.CONST().toString());
        }
        run_app.setCall_constructor((Call_Constructor) visitCall_constructor(ctx.call_constructor()));
        run_app.setClose_list(ctx.CLOSE_LIST().toString());
        run_app.setSemi(ctx.SEMICOLON().toString());
        return run_app;
    }


    /////////////
    @Override
    public CallFunction visitCall_function(dartParser.Call_functionContext ctx) {
        isFunction = true ;
        CallFunction callFunction = new CallFunction();
        callFunction.setId(ctx.ID().toString());
        callFunction.setDot(ctx.DOT().toString());
        callFunction.setCallConstructor((Call_Constructor) this.visitCall_constructor(ctx.call_constructor()));
        callFunction.setSemicolon(ctx.SEMICOLON().toString());
        String name = null ;
        if (callFunction.getCallConstructor().getCall_constructor_with_param().getId()!=null)
            name = callFunction.getCallConstructor().getCall_constructor_with_param().getId() ;
        else name = callFunction.getCallConstructor().getCall_constructor_without_param().getId() ;
        createSymbol(getCurrentScope() , name ,"call_function" ,false , null);
        return callFunction;
    }

    @Override
    public ObjectCall visitCall_object(dartParser.Call_objectContext ctx) {
        ObjectCall objectCall = new ObjectCall();
        objectCall.setId1(ctx.ID(0).toString());
        objectCall.setDot(ctx.DOT().toString());
        objectCall.setId2(ctx.ID(1).toString());
        createSymbol(getCurrentScope(),objectCall.getId1(),null  , false , null);
        return objectCall;
    }

    @Override
    public ObjectIndex visitObject_index(dartParser.Object_indexContext ctx) {
        ObjectIndex objectIndex = new ObjectIndex();
        objectIndex.setId1(ctx.ID(0).toString());
        objectIndex.setOp_list(ctx.LIST_OPEN().toString());
        objectIndex.setId2(ctx.ID(1).toString());
        objectIndex.setClose_list(ctx.LIST_CLOSE().toString());
        if(ctx.DOT()!=null) {
            objectIndex.setDot(ctx.DOT().toString());
            objectIndex.setId3(ctx.ID(2).toString());
        }
        createSymbol(getCurrentScope(),objectIndex.getId1(),null  , false , null);
        return objectIndex;
    }

    ////////////
    @Override
    public Main_function visitMain_function(dartParser.Main_functionContext ctx) {
        Main_function main_function = new Main_function();
        main_function.setVoidd(ctx.VOID().toString());
        main_function.setMainn(ctx.MAIN().toString());
        main_function.setOpenList(ctx.OPEN_LIST().toString());
        main_function.setCloseList(ctx.CLOSE_LIST().toString());
        main_function.setBlockOpen(ctx.BLOCK_OPEN().toString());
        if (ctx.run_app() != null) {
            main_function.setRun_app((Run_App) this.visitRun_app(ctx.run_app()));
        }
        if (ctx.statement() != null) {
            for (int i = 0; i < ctx.statement().size(); ++i) {
                main_function.getStatements().add(this.visitStatement(ctx.statement().get(i)));
            }
        }
        main_function.setBlockClose(ctx.BLOCK_CLOSE().toString());
        Main.symbolTable.setMainCont();
        return main_function;
    }

    //////////
    @Override
    public Declaretion visitDeclaretion(dartParser.DeclaretionContext ctx) {
        Declaretion declaretion = new Declaretion();

        if (ctx.declareint() != null) declaretion.setDeclareInt(this.visitDeclareint(ctx.declareint()));
        if (ctx.declarebool() != null) declaretion.setDeclareBool(this.visitDeclarebool(ctx.declarebool()));
        if (ctx.declarestring() != null) declaretion.setDeclareString(this.visitDeclarestring(ctx.declarestring()));
        if (ctx.declaredouble() != null) declaretion.setDeclarDouble(this.visitDeclaredouble(ctx.declaredouble()));
        if (ctx.declarevar() != null) declaretion.setDeclareVar(this.visitDeclarevar(ctx.declarevar()));
        if (ctx.declarelist() != null) declaretion.setDeclareList(this.visitDeclarelist(ctx.declarelist()));
        if (ctx.map() != null) declaretion.setMap(this.visitMap(ctx.map()));//not work lujain
        return declaretion;
    }

    /////////
    @Override
    public Declare_Class visitDeclare_class(dartParser.Declare_classContext ctx) {
        Declare_Class declare_class = new Declare_Class();
        declare_class.setClas(ctx.CLASS().toString());
        declare_class.setId(ctx.ID().toString());
        String value = null ;
        if (ctx.extend() != null) {
            declare_class.setEextend(this.visitExtend(ctx.extend()));
            value = declare_class.getEextend().getExtendsType().toString() ;
        }
        String name = declare_class.getId() ;
        String type = declare_class.getClas() ;
        createSymbol(getCurrentScope() , name , type , false , value);
        declare_class.setOpen_bl(ctx.BLOCK_OPEN().toString());
        createScope(declare_class.getId() , "class");
        for (int i = 0; i < ctx.declaretion().size(); ++i) {
            declare_class.getDeclaretions().add(this.visitDeclaretion(ctx.declaretion().get(i)));
        }
        for (int i = 0; i < ctx.newObject().size(); ++i) {
            declare_class.getNewObjects().add(this.visitNewObject(ctx.newObject().get(i)));
        }
        for (int i = 0; i < ctx.functions().size(); ++i) {
            declare_class.getFunctionns().add(this.visitFunctions(ctx.functions().get(i)));
        }
        for(int i=0;i<ctx.call_function().size() ; i++){
            declare_class.getCallFunctions().add(this.visitCall_function(ctx.call_function().get(i)));
        }
        if (ctx.constructor_class() != null)
            declare_class.setConstructorClass(visitConstructor_class(ctx.constructor_class()));

        if (ctx.widget_build() != null)
            declare_class.setWidget_build(visitWidget_build(ctx.widget_build()));

        declare_class.setClose_bl(ctx.BLOCK_CLOSE().toString());
        removeScope();

        return declare_class;
    }

    ///////////
    @Override
    public Body visitBody(dartParser.BodyContext ctx) {
        Body body = new Body();
        body.setBody(ctx.BODY().toString());
        body.setColon(ctx.COLON().toString());
        body.setWidget(this.visitWidget(ctx.widget()));
        return body;
    }

    ////////////
    @Override
    public Scaffold visitScaffold(dartParser.ScaffoldContext ctx) {
        Scaffold scaffold = new Scaffold();
        scaffold.setScaffold(ctx.SCAFFOLD().toString());
        scaffold.setOpenList(ctx.OPEN_LIST().toString());
        if (ctx.appBar() != null) {
            scaffold.setAppBar(this.visitAppBar(ctx.appBar()));
            scaffold.setComma(ctx.COMMA().toString());
        }
        if (ctx.body() != null) scaffold.setBody((Body) this.visitBody(ctx.body()));
        scaffold.setCloseList(ctx.CLOSE_LIST().toString());
        return scaffold;
    }


    /////////
    @Override
    public Child visitChild(dartParser.ChildContext ctx) {
        Child child = new Child();
        child.setChild(ctx.CHILD().toString());
        child.setColon(ctx.COLON().toString());
        child.setWidget(this.visitWidget(ctx.widget()));
        child.setComma(ctx.COMMA().toString());
        return child;
    }

    //////////
    @Override
    public Container visitContainer(dartParser.ContainerContext ctx) {
        Container container = new Container();
        container.setContainer(ctx.CONTAINER().toString());
        container.setOpenList(ctx.OPEN_LIST().toString());
        for (int i = 0; i < ctx.container_propreties().size(); ++i) {
            container.getContainerPropreties().add(this.visitContainer_propreties(ctx.container_propreties().get(i)));
        }
        if (ctx.child() != null) container.setChild(this.visitChild(ctx.child()));
        container.setCloseList(ctx.CLOSE_LIST().toString());
        return container;
    }

    //////
    @Override
    public ContainerPropreties visitContainer_propreties(dartParser.Container_propretiesContext ctx) {
        ContainerPropreties containerPropreties = new ContainerPropreties();
        if (ctx.height_proprety() != null)
            containerPropreties.setHeightProprety(this.visitHeight_proprety(ctx.height_proprety()));
        if (ctx.width_proprety() != null)
            containerPropreties.setWidthProprety(this.visitWidth_proprety(ctx.width_proprety()));
        return containerPropreties;
    }

    //////
    @Override
    public MainAxisAlignment visitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx) {
        MainAxisAlignment mainAxisAlignment = new MainAxisAlignment();
        mainAxisAlignment.setMainAAxisAlignment(ctx.MAIN_AXIS_ALIGNMENT().toString());
        mainAxisAlignment.setColon(ctx.COLON().toString());
        mainAxisAlignment.setMainAAxisAlignmentWidget(ctx.MAIN_AXIS_ALIGNMENT_WIDGET().toString());
        mainAxisAlignment.setDot(ctx.DOT().toString());
        mainAxisAlignment.setCenter(ctx.CENTER().toString());
        mainAxisAlignment.setComma(ctx.COMMA().toString());
        return mainAxisAlignment;
    }


    ///////////
    @Override
    public Widget visitWidget(dartParser.WidgetContext ctx) {
        Widget widget = new Widget();
        if (ctx.container() != null) widget.setContainer( this.visitContainer(ctx.container()));
        else if (ctx.image() != null) widget.setImage(this.visitImage(ctx.image()));
        else if (ctx.text() != null) widget.setText(this.visitText(ctx.text()));
        else if (ctx.row() != null) widget.setRow(this.visitRow(ctx.row()));
        else if (ctx.column() != null) widget.setColumn(this.visitColumn(ctx.column()));
        else if (ctx.scaffold() != null) widget.setScaffold( this.visitScaffold(ctx.scaffold()));
        else if (ctx.expanded() != null) widget.setExpanded(this.visitExpanded(ctx.expanded()));
        else if (ctx.sizedBox() != null) widget.setSizedBox(this.visitSizedBox(ctx.sizedBox()));
        else if (ctx.ink_well() != null) widget.setInkWell(this.visitInk_well(ctx.ink_well()));
        else if (ctx.list_view() != null) widget.setListView(this.visitList_view(ctx.list_view()));
        else if (ctx.materialApp() != null) widget.setMaterialApp(this.visitMaterialApp(ctx.materialApp()));
        else if (ctx.textFormField() != null) widget.setTextFormField(this.visitTextFormField(ctx.textFormField()));
        else widget.setElevatedButton( this.visitElevatedButton(ctx.elevatedButton()));
        return widget;
    }


    /////////
    @Override
    public SizedBox visitSizedBox(dartParser.SizedBoxContext ctx) {
        SizedBox sizedBox = new SizedBox();
        if (ctx.CONST() != null) sizedBox.setConstt(ctx.CONST().toString());
        sizedBox.setSizedBox(ctx.SIZED_BOX().toString());
        sizedBox.setOpenList(ctx.OPEN_LIST().toString());
        for (int i = 0; i < ctx.container_propreties().size(); ++i) {
            sizedBox.getContainerPropreties().add(this.visitContainer_propreties(ctx.container_propreties().get(i)));
        }
        sizedBox.setCloseList(ctx.CLOSE_LIST().toString());
        return sizedBox;
    }

    ///////////
    @Override
    public Expanded visitExpanded(dartParser.ExpandedContext ctx) {
        Expanded expanded = new Expanded();
        expanded.setExpanded(ctx.EXPANDED().toString());
        expanded.setOpenList(ctx.OPEN_LIST().toString());
        if (ctx.EXPANDED() != null) expanded.setChild( this.visitChild(ctx.child()));
        expanded.setCloseList(ctx.CLOSE_LIST().toString());
        return expanded;
    }


    /////////
    @Override
    public InkWell visitInk_well(dartParser.Ink_wellContext ctx) {
        InkWell inkWell = new InkWell();
        inkWell.setInkWell(ctx.INK_WELL().toString());
        inkWell.setOpenList(ctx.OPEN_LIST().toString());
        if (ctx.child() != null) inkWell.setChild( this.visitChild(ctx.child()));
        if (ctx.onTap() != null) inkWell.setOnTap(this.visitOnTap(ctx.onTap()));
        inkWell.setCloseList(ctx.CLOSE_LIST().toString());
        return inkWell;
    }


    /////////
    @Override
    public WidgetBuild visitWidget_build(dartParser.Widget_buildContext ctx) {
        WidgetBuild widgetBuild = new WidgetBuild();
        widgetBuild.setOverride(ctx.OVERRIDE().toString());
        widgetBuild.setTypeWidget(ctx.TYPEWIDGET().toString());
        widgetBuild.setBuild(ctx.BUILD().toString());
        widgetBuild.setOpenList(ctx.OPEN_LIST().toString());
        widgetBuild.setBuildContext(ctx.BUILDCONTEXT().toString());
        widgetBuild.setContext(ctx.CONTEXT().toString());
        widgetBuild.setCloseList(ctx.CLOSE_LIST().toString());
        widgetBuild.setBlockOpen(ctx.BLOCK_OPEN().toString());
        widgetBuild.setReturnn(ctx.RETURN().toString());
        widgetBuild.setWidget(this.visitWidget(ctx.widget()));
        widgetBuild.setSemicolon(ctx.SEMICOLON().toString());
        widgetBuild.setBlockClose(ctx.BLOCK_CLOSE().toString());
        return widgetBuild;
    }


    ///////
    @Override
    public ListView visitList_view(dartParser.List_viewContext ctx) {
        ListView listView = new ListView();
        listView.setListView(ctx.LIST_VIEW().toString());
        listView.setDot(ctx.DOT().toString());
        listView.setBuilder(ctx.BUILDER().toString());
        listView.setOpenList(ctx.OPEN_LIST().toString());
        listView.setItemCount(ctx.ITEM_COUNT().toString());
        listView.setColon(ctx.COLON().toString());
        listView.setItemCountView(this.visitItemCountListView(ctx.itemCountListView()));
        listView.setComma(ctx.COMMA().toString());
        listView.setItemBuilder(this.visitItem_builder(ctx.item_builder()));
        listView.setBlockOpen(ctx.BLOCK_OPEN().toString());
        listView.setReturnn(ctx.RETURN().toString());
        listView.setWidget((Widget) this.visitWidget(ctx.widget()));
        listView.setSemicolon(ctx.SEMICOLON().toString());
        listView.setBlockClose(ctx.BLOCK_CLOSE().toString());
        listView.setCloseList(ctx.CLOSE_LIST().toString());
        return listView;
    }

    @Override
    public ItemCountView visitItemCountListView(dartParser.ItemCountListViewContext ctx) {
        ItemCountView itemCountView = new ItemCountView();
        if (ctx.INT() != null) itemCountView.setIntt(ctx.INT().toString());
        else {
            itemCountView.setId(ctx.ID().toString());
            itemCountView.setDot(ctx.DOT().toString());
            itemCountView.setLengthh(ctx.LENGTH().toString());
            String name = itemCountView.getId() ;
            String type = null ;
            createSymbol(getCurrentScope() , name , type , false , null);
        }


        return itemCountView;
    }

    //////////
    @Override
    public Column visitColumn(dartParser.ColumnContext ctx) {
        Column column = new Column();
        column.setColumn(ctx.COLUMN().toString());
        column.setOpenList(ctx.OPEN_LIST().toString());
        if (ctx.mainAxisAlignment() != null)
            column.setMainAxisAlignment((MainAxisAlignment) this.visitMainAxisAlignment(ctx.mainAxisAlignment()));
        column.setChildren(ctx.CHILDREN().toString());
        column.setColon(ctx.COLON().toString());
        column.setListOpen(ctx.LIST_OPEN().toString().trim());
        if (ctx.COMMA() != null) column.setComma(((TerminalNode) ctx.COMMA().get(0)).toString().trim());
        if (ctx.CONST() != null) column.setConstt(ctx.CONST().toString());
        if (ctx.widget() != null) {
            for (int i = 0; i < ctx.widget().size(); ++i) {
                column.getWidgets().add((Widget) this.visitWidget(ctx.widget().get(i)));
            }
        }
        column.setListClose(ctx.LIST_CLOSE().toString().trim());
        column.setCloseList(ctx.CLOSE_LIST().toString().trim());
        return column;
    }


    ////
    @Override
    public Row visitRow(dartParser.RowContext ctx) {
        Row row = new Row();
        row.setRow(ctx.ROW().toString());
        row.setOpenList(ctx.OPEN_LIST().toString());
        if (ctx.mainAxisAlignment() != null)
            row.setMainAxisAlignment((MainAxisAlignment) this.visitMainAxisAlignment(ctx.mainAxisAlignment()));
        row.setChildren(ctx.CHILDREN().toString());
        row.setColon(ctx.COLON().toString());
        row.setListOpen(ctx.LIST_OPEN().toString());
        if (ctx.COMMA() != null) row.setComma((ctx.COMMA()).toString().trim());
        if (ctx.CONST() != null) row.setConstt(ctx.CONST().toString());
        if (ctx.widget() != null) {
            for (int i = 0; i < ctx.widget().size(); ++i) {
                row.getWidgets().add((Widget) this.visitWidget(ctx.widget().get(i)));
            }
        }
        row.setListClose(ctx.LIST_CLOSE().toString().trim());
        row.setCloseList(ctx.CLOSE_LIST().toString().trim());
        return row;
    }


    ////////
    @Override
    public TextFormField visitTextFormField(dartParser.TextFormFieldContext ctx) {
        TextFormField textFormField = new TextFormField();
        textFormField.setTextFormField(ctx.TEXT_FORM_FIELD().toString());
        textFormField.setOpenList("(");
        textFormField.setController(ctx.CONTROLLER().toString());
        textFormField.setColon(":");
        textFormField.setId(ctx.ID().toString());
        textFormField.setComma(",");
        textFormField.setDecoration(ctx.DECORATION().toString());
        textFormField.setColon(":");
        textFormField.setInputDecoration(ctx.INPUT_DECORATION().toString());
        textFormField.setOpenList("(");
        textFormField.setHintText(ctx.HINT_TEXT().getText());
        textFormField.setColon(":");
        textFormField.setString(ctx.STRING().toString());
        textFormField.setComma(",");
        textFormField.setBorder(ctx.BORDER().toString());
        textFormField.setColon(":");
        textFormField.setOutLineInputBorder(ctx.OUT_LINE_INPUT_BORDER().toString());
        textFormField.setOpenList("(");
        textFormField.setBorderRadius(ctx.BORDER_RADIUS().toString());
        textFormField.setColon(":");
        textFormField.setBorderRadiusWidget(ctx.BORDER_RADIUS_WEDGET().toString());
        textFormField.setDot(ctx.DOT().toString());
        textFormField.setCircular(ctx.CIRCULAR().toString());
        textFormField.setOpenList("(");
        textFormField.setNumberr(this.visitNumber(ctx.number()));
        textFormField.setCloseList(")");
        textFormField.setCloseList(")");
        textFormField.setCloseList(")");
        textFormField.setCloseList(")");
        return textFormField;
    }

    //////////////elevatedButton
    @Override
    public ElevatedButton visitElevatedButton(dartParser.ElevatedButtonContext ctx) {
        ElevatedButton elevatedButton = new ElevatedButton();
        elevatedButton.setElevatedButton(ctx.ELIVATED_BUTTON().toString().trim());
        elevatedButton.setOpenList("(");
        elevatedButton.setOnPressed(ctx.ON_PRESSED().toString().trim());
        elevatedButton.setColon(ctx.COLON().toString().trim());
        elevatedButton.setOpenList("(");
        elevatedButton.setCloseList(")");
        elevatedButton.setBlockOpen(ctx.BLOCK_OPEN().toString().trim());
        if (ctx.functions() != null)
            elevatedButton.setFunction(visitFunctions(ctx.functions()));
        elevatedButton.setBlockClose(ctx.BLOCK_CLOSE().toString().trim());
        elevatedButton.setComma(ctx.COMMA().toString().trim());
        elevatedButton.setChild(visitChild(ctx.child()));
        elevatedButton.setCloseList(")");
        return elevatedButton;
    }

    //////////////
    @Override
    public AppBar visitAppBar(dartParser.AppBarContext ctx) {
        AppBar appBar = new AppBar();
        appBar.setAppBar(ctx.APP_BAR().toString());
        appBar.setColon(ctx.COLON().toString());
        appBar.setAppBarWidget(ctx.APP_BAR_WIDGET().toString());
        appBar.setOpenList(ctx.OPEN_LIST().toString());
        appBar.setTitle(this.visitTitle(ctx.title()));
        if (ctx.center_title() != null) appBar.setCenterTitle(this.visitCenter_title(ctx.center_title()));
        appBar.setCloseList(ctx.CLOSE_LIST().toString());
        return appBar;
    }

    ////////////
    @Override
    public Title visitTitle(dartParser.TitleContext ctx) {
        Title title = new Title();
        title.setTitle(ctx.TITLE().toString());
        title.setColon(ctx.COLON().toString());
        title.setText(this.visitText(ctx.text()));
        title.setComma(ctx.COMMA().toString());
        return title;
    }

    /////////////////
    @Override
    public HomeInMaterialApp visitHomeInMaterialApp(dartParser.HomeInMaterialAppContext ctx) {
        HomeInMaterialApp homeInMaterialApp = new HomeInMaterialApp();
        homeInMaterialApp.setHome(ctx.HOME().toString());
        homeInMaterialApp.setColon(ctx.COLON().toString());
        homeInMaterialApp.setId(ctx.ID().toString());
        homeInMaterialApp.setOpenList(ctx.OPEN_LIST().toString());
        homeInMaterialApp.setCloseList(ctx.CLOSE_LIST().toString());
        String name = homeInMaterialApp.getId() ;
        createSymbol(getCurrentScope() , name , "call_constructor" , false , null);
        return homeInMaterialApp;
    }

    @Override
    public TypeMaterialApp visitTypematerialApp(dartParser.TypematerialAppContext ctx) {
        TypeMaterialApp typeMaterialApp = new TypeMaterialApp();
        typeMaterialApp.setMaterialAppp(ctx.MaterialApp().toString());
        return typeMaterialApp;
    }

    ////////////
    @Override
    public MaterialApp visitMaterialApp(dartParser.MaterialAppContext ctx) {
        MaterialApp materialApp = new MaterialApp();
        materialApp.setOpenList(ctx.OPEN_LIST().toString());
        materialApp.setTypeMaterialApp(this.visitTypematerialApp(ctx.typematerialApp()));
        materialApp.setHomeInMaterialApp(this.visitHomeInMaterialApp(ctx.homeInMaterialApp()));
        materialApp.setComma(ctx.COMMA().toString());
        materialApp.setCloseList(ctx.CLOSE_LIST().toString());
        return materialApp;
    }

    @Override
    public Image visitImage(dartParser.ImageContext ctx) {
        Image image = new Image();
        image.setImage(ctx.IMAGE().toString());
        image.setDot(ctx.DOT().toString());
        image.setAsset(ctx.ASSET().toString());
        image.setOpenList(ctx.OPEN_LIST().toString());
        image.setPath(this.visitPath(ctx.path()));
        image.setCloseList(ctx.CLOSE_LIST().toString());
        return image;
    }

    ///////////
    @Override
    public Path visitPath(dartParser.PathContext ctx) {
        Path path = new Path();
        if (ctx.STRING() != null) path.setString(ctx.STRING().toString());
        if (ctx.object_index() != null) path.setObjectIndex(this.visitObject_index(ctx.object_index()));
        if (ctx.call_object() != null) path.setObjectCall(this.visitCall_object(ctx.call_object()));
        return path;
    }

    //////////////
    @Override
    public Extend visitExtend(dartParser.ExtendContext ctx) {
        Extend extend = new Extend();
        extend.setExtendss(ctx.EXTENDS().toString());
        extend.setExtendsType(this.visitExtends_type(ctx.extends_type()));
        return extend;
    }

    ////////////////
    @Override
    public ExtendsType visitExtends_type(dartParser.Extends_typeContext ctx) {
        ExtendsType extends_type = new ExtendsType();
        if (ctx.STATEFULLWIDGIT() != null) extends_type.setExtendsType(ctx.STATEFULLWIDGIT().toString());
        else extends_type.setExtendsType(ctx.STATELESSWIDGIT().toString());
        return extends_type;
    }

    /////////////
    @Override ///done
    public ValueConstructor visitValue_constructor(dartParser.Value_constructorContext ctx) {
        ValueConstructor valueConstructor = new ValueConstructor();
        if (ctx.ID() != null){
            valueConstructor.setValueConstructor(ctx.ID().toString());
            createSymbol(getCurrentScope() , valueConstructor.getId() , "var" , false , null) ;
        }
        if (ctx.value() != null){
            valueConstructor.setValue(this.visitValue(ctx.value()));
//            not work
//            createSymbol(getCurrentScope() , valueConstructor.getValue().toString() , "value" , false , null) ;
        }
        if (ctx.call_object() != null) valueConstructor.setObjectCall(this.visitCall_object(ctx.call_object()));
        if (ctx.object_index() != null){
            valueConstructor.setObjectIndex(this.visitObject_index(ctx.object_index()));
//            createSymbol(getCurrentScope() , valueConstructor.getObjectIndex().getId1(), "object" , false , null) ;
        }

        return valueConstructor;
    }

    /////////////////////
    @Override
    public Value visitValue(dartParser.ValueContext ctx) {
        Value value = new Value();

        if (ctx.BOOLEAN() != null) value.setBool(ctx.BOOLEAN().toString());
        if (ctx.DOUBLE() != null) value.setDoublee(ctx.DOUBLE().toString());
        if (ctx.INT() != null) value.setIntt(ctx.INT().toString());
        if (ctx.STRING() != null) value.setStringg(ctx.STRING().toString());

        return value;
    }

    ////////////////
    @Override
    public ItemBuilder visitItem_builder(dartParser.Item_builderContext ctx) {
        ItemBuilder itemBuilder = new ItemBuilder();
        itemBuilder.setItemBuilder(ctx.ITEM_BUILDER().toString());
        itemBuilder.setColon(ctx.COLON().toString());
        itemBuilder.setOpenList(ctx.OPEN_LIST().toString());
        itemBuilder.setBuildContext(ctx.BUILDCONTEXT().toString());
        itemBuilder.setContext(ctx.CONTEXT().toString());
        itemBuilder.setComma(ctx.COMMA().toString());
        itemBuilder.setTypeInt(ctx.TYPEINT().toString());
        itemBuilder.setId(ctx.ID().toString());
        itemBuilder.setCloseList(ctx.CLOSE_LIST().toString());

        return itemBuilder;
    }

    //////////////
    @Override
    public HeightProprety visitHeight_proprety(dartParser.Height_propretyContext ctx) {
        HeightProprety heightProprety = new HeightProprety();
        heightProprety.setHeight(ctx.HEIGHT().toString());
        heightProprety.setColon(ctx.COLON().toString());
        heightProprety.setNumberr(this.visitNumber(ctx.number()));
        heightProprety.setComma(ctx.COMMA().toString());
        return heightProprety;
    }

    /////////////
    @Override
    public WidthProprety visitWidth_proprety(dartParser.Width_propretyContext ctx) {
        WidthProprety widthProprety = new WidthProprety();
        widthProprety.setWidth(ctx.WIDTH().toString());
        widthProprety.setColon(ctx.COLON().toString());
        widthProprety.setNumberr(this.visitNumber(ctx.number()));
        widthProprety.setComma(ctx.COMMA().toString());
        return widthProprety;
    }

    ///////////
    @Override
    public CenterTitle visitCenter_title(dartParser.Center_titleContext ctx) {
        CenterTitle centerTitle = new CenterTitle();
        centerTitle.setCenterTitle(ctx.CENTER_TITLE().toString());
        centerTitle.setColon(ctx.COLON().toString());
        centerTitle.setBooleann(ctx.BOOLEAN().toString());
        return centerTitle;
    }

    ///////////////
    @Override
    public ConditionalOperator visitConditional_operator(dartParser.Conditional_operatorContext ctx) {
        ConditionalOperator conditional_operator = new ConditionalOperator();
        if (ctx.EQUAL().size() == 1) {
            if (ctx.GTHAN() != null) {
                conditional_operator.setCondOperator(">=");
            } else if (ctx.LTHAN() != null) {
                conditional_operator.setCondOperator("<=");
            } else if (ctx.NOT() != null) {
                conditional_operator.setCondOperator("!=");
            }
        } else if (ctx.EQUAL().size() == 2) {
            conditional_operator.setCondOperator("==");
        } else if (ctx.GTHAN() != null) {
            conditional_operator.setCondOperator(">");
        } else if (ctx.LTHAN() != null) {
            conditional_operator.setCondOperator("<");
        }

        return conditional_operator;
    }

    ////////////////
    @Override
    public Type visitType(dartParser.TypeContext ctx) {
        Type type = new Type();
        if (ctx.TYPEBOOL() != null) type.setBool(ctx.TYPEBOOL().toString());
        if (ctx.TYPEDOUBLE() != null) type.setTypedouble(ctx.TYPEDOUBLE().toString());
        if (ctx.TYPEINT() != null) type.setTypeint(ctx.TYPEINT().toString());
        if (ctx.TYPESTRING() != null) type.setTypestring(ctx.TYPESTRING().toString());
        return type;
    }

    /////////////
    @Override
    public DeclareInt visitDeclareint(dartParser.DeclareintContext ctx) {
        DeclareInt declareInt = new DeclareInt();
        boolean isfinal = false ;
        if (ctx.FINAL() != null) {
            declareInt.setFinall(ctx.FINAL().toString());
            isfinal = true ;
        }
        declareInt.setTypeInt(ctx.TYPEINT().toString());
        declareInt.setId(ctx.ID().toString());
        if (ctx.EQUAL() != null) declareInt.setEqual(ctx.EQUAL().toString());
        if (ctx.INT() != null) declareInt.setIntt(ctx.INT().toString());
        declareInt.setSemicolon(ctx.SEMICOLON().toString());

        String name  =  declareInt.getId() ;
        String value = declareInt.getIntt() ;
        String type = declareInt.getTypeInt();
        createSymbol( getCurrentScope() ,name , type , isfinal ,value);

        return declareInt;

    }

    ///////////
    @Override
    public DeclarDouble visitDeclaredouble(dartParser.DeclaredoubleContext ctx) {
        DeclarDouble declarDouble = new DeclarDouble();
        boolean isFinal = false ;
        if (ctx.FINAL() != null) {
            isFinal = true ;
            declarDouble.setFinall(ctx.FINAL().toString());
        }
        declarDouble.setTypeDouble(ctx.TYPEDOUBLE().toString());
        declarDouble.setId(ctx.ID().toString());
        if (ctx.EQUAL() != null) declarDouble.setEqual(ctx.EQUAL().toString());
        if (ctx.DOUBLE() != null) declarDouble.setDoublee(ctx.DOUBLE().toString());
        declarDouble.setSemicolon(ctx.SEMICOLON().toString());
        String name = declarDouble.getId() ;
        String type = declarDouble.getTypeDouble() ;
        String value = declarDouble.getDoublee() ;
        createSymbol(getCurrentScope() , name , type , isFinal , value);
        return declarDouble;

    }

    /////////
    @Override
    public DeclareBool visitDeclarebool(dartParser.DeclareboolContext ctx) {
        DeclareBool declareBool = new DeclareBool();
        boolean isFinal = false ;
        if (ctx.FINAL() != null) {
            isFinal = true ;
            declareBool.setFinall(ctx.FINAL().toString());
        }
        declareBool.setTypeBool(ctx.TYPEBOOL().toString());
        declareBool.setId(ctx.ID().toString());
        if (ctx.EQUAL() != null) declareBool.setEqual(ctx.EQUAL().toString());
        if (ctx.BOOLEAN() != null) declareBool.setBooleann(ctx.BOOLEAN().toString());
        declareBool.setSemicolon(ctx.SEMICOLON().toString());
        String type = declareBool.getTypeBool() ;
        String name = declareBool.getId() ;
        String value = declareBool.getBooleann();
        createSymbol(getCurrentScope() , name , type , isFinal , value);
        return declareBool;

    }

    ///////////////
    @Override
    public DeclareString visitDeclarestring(dartParser.DeclarestringContext ctx) {
        DeclareString declareString = new DeclareString();
        boolean isFinal = false  ;
        if (ctx.FINAL() != null){
            isFinal = true ;
            declareString.setFinall(ctx.FINAL().toString()) ;
        }
        declareString.setTypeString(ctx.TYPESTRING().toString());
        declareString.setId(ctx.ID().toString());
        if (ctx.EQUAL() != null) declareString.setEqual(ctx.EQUAL().toString());
        if (ctx.STRING() != null) declareString.setString(ctx.STRING().toString());
        declareString.setSemicolon(ctx.SEMICOLON().toString());
        String name = declareString.getId() ;
        String type = declareString.getTypeString() ;
        String value = declareString.getString() ;
        createSymbol(getCurrentScope() , name , type , isFinal , value);

        return declareString;
    }

    ////////review
    @Override
    public MapElement visitMap_element(dartParser.Map_elementContext ctx) {
        MapElement mapElement = new MapElement();
        mapElement.setValue(this.visitValue(
                (dartParser.ValueContext) ctx.value()));
        mapElement.setColon(ctx.COLON().toString());
        return mapElement;
    }


    //////////
    @Override
    public Map visitMap(dartParser.MapContext ctx) {
        Map map = new Map();
        map.setTypeMap(ctx.TYPEMAP().toString());
        map.setId(ctx.ID().toString());
        map.setEqual(ctx.EQUAL().toString());
        map.setBlockOpen(ctx.BLOCK_OPEN().toString());
        if (ctx.COMMA() != null) {
            map.setComma(((TerminalNode) ctx.COMMA().get(0)).toString().trim());
        }

        if (ctx.map_element() != null) {
            for (int i = 0; i < ctx.map_element().size(); ++i) {
                map.getMapElements().add((MapElement) this.visitMap_element(ctx.map_element().get(i)));
            }
        }
        map.setBlockClose(ctx.BLOCK_CLOSE().toString());

        return map;
    }

    //////////
    @Override
    public DeclareVar visitDeclarevar(dartParser.DeclarevarContext ctx) {
        DeclareVar declareVar = new DeclareVar();
        declareVar.setTypeVar(ctx.TYPEVAR().toString());
        declareVar.setId(ctx.ID().toString());
        if (ctx.EQUAL() != null) declareVar.setEqual(ctx.EQUAL().toString());
        if (ctx.value() != null) declareVar.setValue(this.visitValue(ctx.value()));
        declareVar.setSemicolon(ctx.SEMICOLON().toString());
        String name = declareVar.getId() ;
        String type = declareVar.getTypeVar() ;
        String value = declareVar.getValue().toString() ;
        createSymbol(getCurrentScope() , name , type , false, value);

        return declareVar;

    }

    ///////////
    @Override
    public ListType visitList_type(dartParser.List_typeContext ctx) {
        ListType listType = new ListType();
        if (ctx.COMMA() != null) listType.setComma(( ctx.COMMA().get(0)).toString().trim());
        if (ctx.list_value().size()>0) {
            for (int i = 0; i < ctx.list_value().size(); i++) {
                listType.getList_value().add(visitList_value(ctx.list_value().get(i)));
            }
        }


        return listType;
    }

    @Override
    public ListVlaue visitList_value(dartParser.List_valueContext ctx) {
        ListVlaue listVlaue = new ListVlaue();
        if (ctx.value() != null) {
            listVlaue.setValue(visitValue(ctx.value()));
        }
        if (ctx.call_constructor() != null)
            listVlaue.setCall_constructor(visitCall_constructor(ctx.call_constructor()));

        return listVlaue;
    }

    /////////
    @Override
    public DeclareList visitDeclarelist(dartParser.DeclarelistContext ctx) {
        DeclareList declareList = new DeclareList();
        boolean isFinal = false ;
        if (ctx.FINAL() != null) {
            isFinal = true ;
            declareList.setFinall(ctx.FINAL().toString());
        }
        declareList.setTypeList(ctx.TYPELIST().toString());
        declareList.setId(ctx.ID().toString());
        declareList.setEqual(ctx.EQUAL().toString());
        declareList.setOp_list(ctx.LIST_OPEN().toString());
        declareList.setListType(this.visitList_type(ctx.list_type()));
        declareList.setClose_list(ctx.LIST_CLOSE().toString());
        declareList.setSemicolon(ctx.SEMICOLON().toString());
        //store list with his valus
        Symbol symbol = new Symbol(declareList.getId()) ;
        symbol.setType("list");
        symbol.setFinal(isFinal);
        symbol.setValue(null);
        String valuef = null ;
        for(ListVlaue value : declareList.getListType().getList_value()){
            if (value.getCall_constructor().getCall_constructor_with_param().getId()!=null)
                valuef = value.getCall_constructor().getCall_constructor_with_param().getId() ;
            else if (value.getCall_constructor().getCall_constructor_without_param().getId()!=null)
                valuef = value.getCall_constructor().getCall_constructor_without_param().getId() ;
            else valuef = value.toString() ;
            symbol.getListPar().add(valuef) ;
        }



        Main.symbolTable.getScopesStack().peek().getSymbols().add(symbol);
        return declareList;
    }

    //////////////
    @Override
    public Text visitText(dartParser.TextContext ctx) {
        Text text = new Text();
        text.setText(ctx.TEXT().toString());
        text.setOpenList(ctx.OPEN_LIST().toString());
        text.setValueConstructor((ValueConstructor) this.visitValue_constructor(ctx.value_constructor()));
        text.setCloseList(ctx.CLOSE_LIST().toString());
        return text;
    }

    //////////////
    @Override
    public Numberr visitNumber(dartParser.NumberContext ctx) {
        Numberr numberr = new Numberr();
        if (ctx.INT() != null) numberr.setIntt(ctx.INT().toString());
        if (ctx.DOUBLE() != null) numberr.setDoublee(ctx.DOUBLE().toString());
        return numberr;
    }

    ////////////////
    @Override
    public ImportStatement visitImport_statement(dartParser.Import_statementContext ctx) {
        ImportStatement Importt = new ImportStatement();
        Importt.setImportt(ctx.IMPORT().toString().trim());
        Importt.setStringg(ctx.STRING().toString().trim());
        Importt.setSemicolon(ctx.SEMICOLON().toString());
        return Importt;
    }

    @Override public OnTap visitOnTap(dartParser.OnTapContext ctx)
    {   OnTap onTap=new OnTap();
        onTap.setOntap(ctx.ONTAP().toString());
        onTap.setColon(ctx.COLON().toString());
        onTap.setOpen_list(ctx.OPEN_LIST().toString());
        onTap.setClose_list(ctx.CLOSE_LIST().toString());
        onTap.setBloc_open(ctx.BLOCK_OPEN().toString());
        if(ctx.navigation_between_pages()!=null)onTap.setNavigationBetweenPages( this.visitNavigation_between_pages(ctx.navigation_between_pages()));
        if(ctx.navigation_between_pages_getx()!=null)  onTap.setNavigation_between_pages_getx(this.visitNavigation_between_pages_getx(ctx.navigation_between_pages_getx()));
        onTap.setBloc_close(ctx.BLOCK_CLOSE().toString());
        onTap.setComma(ctx.COMMA().toString());
        return onTap;
    }

    @Override
    public NavigationBetweenPages visitNavigation_between_pages(dartParser.Navigation_between_pagesContext ctx) {
        NavigationBetweenPages navigationBetweenPages = new NavigationBetweenPages();
        navigationBetweenPages.setNavigator(ctx.Navigator().toString());//navigator
        navigationBetweenPages.setDot(ctx.DOT().toString());//.
        navigationBetweenPages.setPush(ctx.Push().toString());//push
        navigationBetweenPages.setOp_list(ctx.OPEN_LIST(0).toString());//(
        navigationBetweenPages.setContext(ctx.CONTEXT(0).toString());//context
        navigationBetweenPages.setComma(ctx.COMMA().toString());//comma
        navigationBetweenPages.setMaterialPageroute(ctx.MaterialPageRoute().toString());//material page route
        navigationBetweenPages.setOp_list(ctx.OPEN_LIST(1).toString());//(
        navigationBetweenPages.setBuilder(ctx.BUILDER().toString());//builder
        navigationBetweenPages.setColon(ctx.COLON().toString());//:
        navigationBetweenPages.setOp_list(ctx.OPEN_LIST(2).toString());//(
        navigationBetweenPages.setContext(ctx.CONTEXT(1).toString());//context
        navigationBetweenPages.setClose_list(ctx.CLOSE_LIST(0).toString());//)
        navigationBetweenPages.setGthan_Equal(ctx.GTHAN_EQUAL().toString());//=>
        if (ctx.CONST() != null)
            navigationBetweenPages.setConstt(ctx.CONST().toString());//const?
        navigationBetweenPages.setCall_constructor(this.visitCall_constructor(ctx.call_constructor()));//call constructor
        navigationBetweenPages.setClose_list(ctx.CLOSE_LIST(1).toString());//)
        navigationBetweenPages.setClose_list(ctx.CLOSE_LIST(2).toString());//)
        navigationBetweenPages.setSemi(ctx.SEMICOLON().toString());
        return navigationBetweenPages;

    }

    @Override
    public Navigation_Between_Pages_Getx visitNavigation_between_pages_getx(dartParser.Navigation_between_pages_getxContext ctx) {
        Navigation_Between_Pages_Getx navigation_between_pages_getx = new Navigation_Between_Pages_Getx();
        navigation_between_pages_getx.setGetx(ctx.GETX().toString());
        navigation_between_pages_getx.setDot(ctx.DOT().toString());
        navigation_between_pages_getx.setTo(ctx.TO().toString());
        navigation_between_pages_getx.setOp_list(ctx.OPEN_LIST().toString());
        navigation_between_pages_getx.setCall_constructor(this.visitCall_constructor(ctx.call_constructor()));
        navigation_between_pages_getx.setClose_list(ctx.CLOSE_LIST().toString());
        navigation_between_pages_getx.setSemi(ctx.SEMICOLON().toString());
        return navigation_between_pages_getx;
    }


////////////////symbol functions

    private void createScope(String name ,String type ) {

        Scope scope;
        if (Main.symbolTable.getScopesStack().isEmpty()) {
            scope = new Scope(null);
        } else {
            Scope parntScope1 = Main.symbolTable.getScopesStack().peek();
            scope = new Scope(parntScope1);
        }
        scope.setType(type);
        scope.setName(name) ;
        Main.symbolTable.getScopesStack().push(scope);

//        Main.symbolTable.getScopes().add(scope);
    }

    public static void removeScope() {
        Scope scope = Main.symbolTable.getScopesStack().pop();
        Main.symbolTable.getScopes().add(scope) ;

    }

    //    get acurrent scope from top of stacke
    private Scope getCurrentScope() {
        if (Main.symbolTable.getScopesStack().isEmpty())
            return null;

        return Main.symbolTable.getScopesStack().peek();
    }
    ///create new symbole
    private void createSymbol(Scope scope, String name, String type , boolean isFinal , String value ) {

        Symbol  symbol = new Symbol(name);;
        symbol.setType(type);
        symbol.setFinal(isFinal);
        if(value != null)
            symbol.setValue(value);
        symbol.setScope(scope) ;
        Main.symbolTable.getScopesStack().peek().getSymbols().add(symbol);


    }
    private void addSymbolTocurrentScope(int id , Symbol symbol){
        ArrayList<Scope> scopes = Main.symbolTable.getScopes();
        for(Scope scope : scopes){

            if (scope.getId() == id)
                scope.addSymbol(symbol);

        }

    }
    int getIndex(String s){
        for(int i=0 ; i<s.length() ; i++){
            if (s.charAt(i) == '(')
                return i ;
        }
        return 0 ;
    }
}
