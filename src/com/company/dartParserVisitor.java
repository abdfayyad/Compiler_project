// Generated from E:/—«»⁄…-›’·  «‰Ì/ﬂÊ„»«Ì·—/final-dart_finish_grammar/src/com/company\dartParser.g4 by ANTLR 4.12.0
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dartParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(dartParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(dartParser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forInitializerStatementTerminator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitializerStatementTerminator(dartParser.ForInitializerStatementTerminatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(dartParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#forIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIncrement(dartParser.ForIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#newObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObject(dartParser.NewObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#class_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_object(dartParser.Class_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#assignment_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_type(dartParser.Assignment_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#constructor_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_class(dartParser.Constructor_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#item_constructor_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_constructor_class(dartParser.Item_constructor_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(dartParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(dartParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elsee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsee(dartParser.ElseeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#condition_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_object(dartParser.Condition_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(dartParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(dartParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#for_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in(dartParser.For_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body_for_if_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_for_if_while(dartParser.Body_for_if_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#break_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_loop(dartParser.Break_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#continue_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_loop(dartParser.Continue_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(dartParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(dartParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(dartParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(dartParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(dartParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(dartParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(dartParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(dartParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(dartParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(dartParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function_noarguments_noreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noarguments_noreturn(dartParser.Function_noarguments_noreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function_with_arguments_noreturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_with_arguments_noreturn(dartParser.Function_with_arguments_noreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function_noarguments_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_noarguments_return(dartParser.Function_noarguments_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#function_arguments_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments_return(dartParser.Function_arguments_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#with_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_arguments(dartParser.With_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#no_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNo_arguments(dartParser.No_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#return_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_function(dartParser.Return_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#call_constructor_without_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_constructor_without_param(dartParser.Call_constructor_without_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#call_constructor_with_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_constructor_with_param(dartParser.Call_constructor_with_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#call_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_constructor(dartParser.Call_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#run_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_app(dartParser.Run_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(dartParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#call_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_object(dartParser.Call_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#object_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_index(dartParser.Object_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(dartParser.Main_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declaretion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaretion(dartParser.DeclaretionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declare_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_class(dartParser.Declare_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(dartParser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(dartParser.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(dartParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#container_propreties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_propreties(dartParser.Container_propretiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxisAlignment(dartParser.MainAxisAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(dartParser.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(dartParser.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#ink_well}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInk_well(dartParser.Ink_wellContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget_build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget_build(dartParser.Widget_buildContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_view(dartParser.List_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#itemCountListView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemCountListView(dartParser.ItemCountListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(dartParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(dartParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#textFormField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFormField(dartParser.TextFormFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#elevatedButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButton(dartParser.ElevatedButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(dartParser.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(dartParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#homeInMaterialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHomeInMaterialApp(dartParser.HomeInMaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#materialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialApp(dartParser.MaterialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#typematerialApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypematerialApp(dartParser.TypematerialAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(dartParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(dartParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend(dartParser.ExtendContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#extends_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_type(dartParser.Extends_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_constructor(dartParser.Value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(dartParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#item_builder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_builder(dartParser.Item_builderContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#height_proprety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight_proprety(dartParser.Height_propretyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#width_proprety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth_proprety(dartParser.Width_propretyContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#center_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter_title(dartParser.Center_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(dartParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(dartParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declareint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareint(dartParser.DeclareintContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declaredouble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaredouble(dartParser.DeclaredoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declarebool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarebool(dartParser.DeclareboolContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declarestring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarestring(dartParser.DeclarestringContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#map_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_element(dartParser.Map_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(dartParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declarevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarevar(dartParser.DeclarevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#declarelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarelist(dartParser.DeclarelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(dartParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#list_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value(dartParser.List_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(dartParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(dartParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(dartParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(dartParser.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigation_between_pages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigation_between_pages(dartParser.Navigation_between_pagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#navigation_between_pages_getx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigation_between_pages_getx(dartParser.Navigation_between_pages_getxContext ctx);
}