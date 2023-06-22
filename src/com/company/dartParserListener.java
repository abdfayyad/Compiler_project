// Generated from E:/—«»⁄…-›’·  «‰Ì/ﬂÊ„»«Ì·—/final-dart_finish_grammar/src/com/company\dartParser.g4 by ANTLR 4.12.0
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(dartParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(dartParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void enterForLoopParts(dartParser.ForLoopPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forLoopParts}.
	 * @param ctx the parse tree
	 */
	void exitForLoopParts(dartParser.ForLoopPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forInitializerStatementTerminator}.
	 * @param ctx the parse tree
	 */
	void enterForInitializerStatementTerminator(dartParser.ForInitializerStatementTerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forInitializerStatementTerminator}.
	 * @param ctx the parse tree
	 */
	void exitForInitializerStatementTerminator(dartParser.ForInitializerStatementTerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(dartParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(dartParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#forIncrement}.
	 * @param ctx the parse tree
	 */
	void enterForIncrement(dartParser.ForIncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#forIncrement}.
	 * @param ctx the parse tree
	 */
	void exitForIncrement(dartParser.ForIncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(dartParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(dartParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#class_object}.
	 * @param ctx the parse tree
	 */
	void enterClass_object(dartParser.Class_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#class_object}.
	 * @param ctx the parse tree
	 */
	void exitClass_object(dartParser.Class_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#assignment_type}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_type(dartParser.Assignment_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#assignment_type}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_type(dartParser.Assignment_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#constructor_class}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_class(dartParser.Constructor_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#constructor_class}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_class(dartParser.Constructor_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#item_constructor_class}.
	 * @param ctx the parse tree
	 */
	void enterItem_constructor_class(dartParser.Item_constructor_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#item_constructor_class}.
	 * @param ctx the parse tree
	 */
	void exitItem_constructor_class(dartParser.Item_constructor_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(dartParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(dartParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(dartParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(dartParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elsee}.
	 * @param ctx the parse tree
	 */
	void enterElsee(dartParser.ElseeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elsee}.
	 * @param ctx the parse tree
	 */
	void exitElsee(dartParser.ElseeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#condition_object}.
	 * @param ctx the parse tree
	 */
	void enterCondition_object(dartParser.Condition_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#condition_object}.
	 * @param ctx the parse tree
	 */
	void exitCondition_object(dartParser.Condition_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(dartParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(dartParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(dartParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(dartParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#for_in}.
	 * @param ctx the parse tree
	 */
	void enterFor_in(dartParser.For_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#for_in}.
	 * @param ctx the parse tree
	 */
	void exitFor_in(dartParser.For_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body_for_if_while}.
	 * @param ctx the parse tree
	 */
	void enterBody_for_if_while(dartParser.Body_for_if_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body_for_if_while}.
	 * @param ctx the parse tree
	 */
	void exitBody_for_if_while(dartParser.Body_for_if_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#break_loop}.
	 * @param ctx the parse tree
	 */
	void enterBreak_loop(dartParser.Break_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#break_loop}.
	 * @param ctx the parse tree
	 */
	void exitBreak_loop(dartParser.Break_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#continue_loop}.
	 * @param ctx the parse tree
	 */
	void enterContinue_loop(dartParser.Continue_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#continue_loop}.
	 * @param ctx the parse tree
	 */
	void exitContinue_loop(dartParser.Continue_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(dartParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(dartParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(dartParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(dartParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(dartParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(dartParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(dartParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(dartParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(dartParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(dartParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(dartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(dartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(dartParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(dartParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(dartParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(dartParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dartParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dartParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(dartParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(dartParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function_noarguments_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noarguments_noreturn(dartParser.Function_noarguments_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function_noarguments_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noarguments_noreturn(dartParser.Function_noarguments_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function_with_arguments_noreturn}.
	 * @param ctx the parse tree
	 */
	void enterFunction_with_arguments_noreturn(dartParser.Function_with_arguments_noreturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function_with_arguments_noreturn}.
	 * @param ctx the parse tree
	 */
	void exitFunction_with_arguments_noreturn(dartParser.Function_with_arguments_noreturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function_noarguments_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_noarguments_return(dartParser.Function_noarguments_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function_noarguments_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_noarguments_return(dartParser.Function_noarguments_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#function_arguments_return}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments_return(dartParser.Function_arguments_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#function_arguments_return}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments_return(dartParser.Function_arguments_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#with_arguments}.
	 * @param ctx the parse tree
	 */
	void enterWith_arguments(dartParser.With_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#with_arguments}.
	 * @param ctx the parse tree
	 */
	void exitWith_arguments(dartParser.With_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#no_arguments}.
	 * @param ctx the parse tree
	 */
	void enterNo_arguments(dartParser.No_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#no_arguments}.
	 * @param ctx the parse tree
	 */
	void exitNo_arguments(dartParser.No_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#return_function}.
	 * @param ctx the parse tree
	 */
	void enterReturn_function(dartParser.Return_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#return_function}.
	 * @param ctx the parse tree
	 */
	void exitReturn_function(dartParser.Return_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#call_constructor_without_param}.
	 * @param ctx the parse tree
	 */
	void enterCall_constructor_without_param(dartParser.Call_constructor_without_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#call_constructor_without_param}.
	 * @param ctx the parse tree
	 */
	void exitCall_constructor_without_param(dartParser.Call_constructor_without_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#call_constructor_with_param}.
	 * @param ctx the parse tree
	 */
	void enterCall_constructor_with_param(dartParser.Call_constructor_with_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#call_constructor_with_param}.
	 * @param ctx the parse tree
	 */
	void exitCall_constructor_with_param(dartParser.Call_constructor_with_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#call_constructor}.
	 * @param ctx the parse tree
	 */
	void enterCall_constructor(dartParser.Call_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#call_constructor}.
	 * @param ctx the parse tree
	 */
	void exitCall_constructor(dartParser.Call_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#run_app}.
	 * @param ctx the parse tree
	 */
	void enterRun_app(dartParser.Run_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#run_app}.
	 * @param ctx the parse tree
	 */
	void exitRun_app(dartParser.Run_appContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(dartParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(dartParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#call_object}.
	 * @param ctx the parse tree
	 */
	void enterCall_object(dartParser.Call_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#call_object}.
	 * @param ctx the parse tree
	 */
	void exitCall_object(dartParser.Call_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#object_index}.
	 * @param ctx the parse tree
	 */
	void enterObject_index(dartParser.Object_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#object_index}.
	 * @param ctx the parse tree
	 */
	void exitObject_index(dartParser.Object_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#main_function}.
	 * @param ctx the parse tree
	 */
	void enterMain_function(dartParser.Main_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#main_function}.
	 * @param ctx the parse tree
	 */
	void exitMain_function(dartParser.Main_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declaretion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaretion(dartParser.DeclaretionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declaretion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaretion(dartParser.DeclaretionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declare_class}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_class(dartParser.Declare_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declare_class}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_class(dartParser.Declare_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(dartParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(dartParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(dartParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(dartParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#container_propreties}.
	 * @param ctx the parse tree
	 */
	void enterContainer_propreties(dartParser.Container_propretiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#container_propreties}.
	 * @param ctx the parse tree
	 */
	void exitContainer_propreties(dartParser.Container_propretiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(dartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(dartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void enterSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 */
	void exitSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void enterExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 */
	void exitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#ink_well}.
	 * @param ctx the parse tree
	 */
	void enterInk_well(dartParser.Ink_wellContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#ink_well}.
	 * @param ctx the parse tree
	 */
	void exitInk_well(dartParser.Ink_wellContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget_build}.
	 * @param ctx the parse tree
	 */
	void enterWidget_build(dartParser.Widget_buildContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget_build}.
	 * @param ctx the parse tree
	 */
	void exitWidget_build(dartParser.Widget_buildContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list_view}.
	 * @param ctx the parse tree
	 */
	void enterList_view(dartParser.List_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list_view}.
	 * @param ctx the parse tree
	 */
	void exitList_view(dartParser.List_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#itemCountListView}.
	 * @param ctx the parse tree
	 */
	void enterItemCountListView(dartParser.ItemCountListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#itemCountListView}.
	 * @param ctx the parse tree
	 */
	void exitItemCountListView(dartParser.ItemCountListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(dartParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(dartParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(dartParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(dartParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#textFormField}.
	 * @param ctx the parse tree
	 */
	void enterTextFormField(dartParser.TextFormFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#textFormField}.
	 * @param ctx the parse tree
	 */
	void exitTextFormField(dartParser.TextFormFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBar(dartParser.AppBarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(dartParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(dartParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#homeInMaterialApp}.
	 * @param ctx the parse tree
	 */
	void enterHomeInMaterialApp(dartParser.HomeInMaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#homeInMaterialApp}.
	 * @param ctx the parse tree
	 */
	void exitHomeInMaterialApp(dartParser.HomeInMaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void enterMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 */
	void exitMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#typematerialApp}.
	 * @param ctx the parse tree
	 */
	void enterTypematerialApp(dartParser.TypematerialAppContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#typematerialApp}.
	 * @param ctx the parse tree
	 */
	void exitTypematerialApp(dartParser.TypematerialAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(dartParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(dartParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(dartParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(dartParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#extend}.
	 * @param ctx the parse tree
	 */
	void enterExtend(dartParser.ExtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#extend}.
	 * @param ctx the parse tree
	 */
	void exitExtend(dartParser.ExtendContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#extends_type}.
	 * @param ctx the parse tree
	 */
	void enterExtends_type(dartParser.Extends_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#extends_type}.
	 * @param ctx the parse tree
	 */
	void exitExtends_type(dartParser.Extends_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterValue_constructor(dartParser.Value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitValue_constructor(dartParser.Value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(dartParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(dartParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#item_builder}.
	 * @param ctx the parse tree
	 */
	void enterItem_builder(dartParser.Item_builderContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#item_builder}.
	 * @param ctx the parse tree
	 */
	void exitItem_builder(dartParser.Item_builderContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#height_proprety}.
	 * @param ctx the parse tree
	 */
	void enterHeight_proprety(dartParser.Height_propretyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#height_proprety}.
	 * @param ctx the parse tree
	 */
	void exitHeight_proprety(dartParser.Height_propretyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#width_proprety}.
	 * @param ctx the parse tree
	 */
	void enterWidth_proprety(dartParser.Width_propretyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#width_proprety}.
	 * @param ctx the parse tree
	 */
	void exitWidth_proprety(dartParser.Width_propretyContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#center_title}.
	 * @param ctx the parse tree
	 */
	void enterCenter_title(dartParser.Center_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#center_title}.
	 * @param ctx the parse tree
	 */
	void exitCenter_title(dartParser.Center_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(dartParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(dartParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(dartParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(dartParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declareint}.
	 * @param ctx the parse tree
	 */
	void enterDeclareint(dartParser.DeclareintContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declareint}.
	 * @param ctx the parse tree
	 */
	void exitDeclareint(dartParser.DeclareintContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declaredouble}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredouble(dartParser.DeclaredoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declaredouble}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredouble(dartParser.DeclaredoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void enterDeclarebool(dartParser.DeclareboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declarebool}.
	 * @param ctx the parse tree
	 */
	void exitDeclarebool(dartParser.DeclareboolContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declarestring}.
	 * @param ctx the parse tree
	 */
	void enterDeclarestring(dartParser.DeclarestringContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declarestring}.
	 * @param ctx the parse tree
	 */
	void exitDeclarestring(dartParser.DeclarestringContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#map_element}.
	 * @param ctx the parse tree
	 */
	void enterMap_element(dartParser.Map_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#map_element}.
	 * @param ctx the parse tree
	 */
	void exitMap_element(dartParser.Map_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(dartParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(dartParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarevar(dartParser.DeclarevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarevar(dartParser.DeclarevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#declarelist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarelist(dartParser.DeclarelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#declarelist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarelist(dartParser.DeclarelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(dartParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(dartParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#list_value}.
	 * @param ctx the parse tree
	 */
	void enterList_value(dartParser.List_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#list_value}.
	 * @param ctx the parse tree
	 */
	void exitList_value(dartParser.List_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(dartParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(dartParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(dartParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(dartParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(dartParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(dartParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#onTap}.
	 * @param ctx the parse tree
	 */
	void enterOnTap(dartParser.OnTapContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#onTap}.
	 * @param ctx the parse tree
	 */
	void exitOnTap(dartParser.OnTapContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigation_between_pages}.
	 * @param ctx the parse tree
	 */
	void enterNavigation_between_pages(dartParser.Navigation_between_pagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigation_between_pages}.
	 * @param ctx the parse tree
	 */
	void exitNavigation_between_pages(dartParser.Navigation_between_pagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#navigation_between_pages_getx}.
	 * @param ctx the parse tree
	 */
	void enterNavigation_between_pages_getx(dartParser.Navigation_between_pages_getxContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#navigation_between_pages_getx}.
	 * @param ctx the parse tree
	 */
	void exitNavigation_between_pages_getx(dartParser.Navigation_between_pages_getxContext ctx);
}