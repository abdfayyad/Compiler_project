parser grammar dartParser;
options { tokenVocab=dartLexer; }
//finish
program:(import_statement|main_function|declare_class)+EOF;

//for(int i=0;i<8;i++){}
//finish
for_loop: FOR OPEN_LIST forLoopParts CLOSE_LIST   body_for_if_while;
//int i=0;i<8;i++
//finish
forLoopParts
    : forInitializerStatementTerminator
      forCondition
      forIncrement
      ;
 //int i=0;
 //finish
forInitializerStatementTerminator:declaretion+;
//i<8;
//finish
forCondition:ID conditional_operator value_constructor SEMICOLON ;
//i++
//finish
forIncrement:ID PLUS_PLUS                    |
             ID MINUS_MINUS                  |
             ID PLUS EQUAL value_constructor |
             ID MINUS EQUAL value_constructor|
             assignment
            ;
//ClassName name=new ClassName();
//finish
////////////new
/////finish
newObject:ID ID EQUAL NEW? call_constructor SEMICOLON;
///////////////////////////////////////edited
///////////////finish
class_object: NEW? call_constructor ;
//int dd=2+4;
//dd=3+4;
//d=3+3;
//finish
assignment:type? ID EQUAL assignment_type SEMICOLON;
assignment_type:(relationalExpression|ID|value);
// dd(this.ss,this.e);
//////////////////////new
////////////////////done
constructor_class:ID OPEN_LIST item_constructor_class (COMMA item_constructor_class)*CLOSE_LIST SEMICOLON;
item_constructor_class: THIS DOT ID ;
//constructor_class:function_noarguments_noreturn;
//parameters_constructor:(item_constructor_class COMMA)*
////                      (named_item_constructor_class COMMA)*
//                      ;
//item_constructor_class: THIS DOT ID  (COMMA constructor_class)*;
//named_item_constructor_class:BLOCK_OPEN requaried_item_constructor_class  BLOCK_CLOSE;
/////runnn
//while(r>=4){}
//while(r>=h){}
//finish
while_loop:WHILE OPEN_LIST condition CLOSE_LIST body_for_if_while;
//if(r>=2){
//}
//else{}
//finish
if_rule:IF OPEN_LIST condition CLOSE_LIST  body_for_if_while   elsee? ;
elsee:(ELSE body_for_if_while);
//2,d
// finish
condition_object:INT|DOUBLE|STRING|BOOLEAN|ID;
//r>=5
//finish
condition: condition_object operator condition_object;
//==,>=,<=
// finish
operator:EQUAL_EQUAL |
         EQUAL_GTHAN |
         EQUAL_LTHAN |
         GTHAN       |
         LTHAN       |
         NOTEQUAL_EQUAL;
//for(var rr in dd){}
//finish
for_in:FOR OPEN_LIST TYPEVAR ID IN ID CLOSE_LIST body_for_if_while;
//{ int dd=44;
//break;
// }//finish
body_for_if_while:BLOCK_OPEN
                    statement*  break_loop? continue_loop? BLOCK_CLOSE;
//break;
//finish
break_loop:BREAK SEMICOLON;
//continue;
// finish
continue_loop:CONTINUE SEMICOLON;
//3+2,3+r,3+r*3
//finish
relationalExpression
      : additiveExpression (relationalOperator additiveExpression)*
      ;
//!=,==,>=
// finish
    relationalOperator
      : GTHAN        |
        LTHAN        |
        EQUAL_GTHAN  |
        EQUAL_LTHAN  |
        EQUAL_EQUAL  |
        NOTEQUAL_EQUAL
      ;
 //2*(2+3),2+(2*3)
 //finish
    additiveExpression
      : multiplicativeExpression (additiveOperator multiplicativeExpression)*
      ;
//+,-
//finish
    additiveOperator
      : PLUS | MINUS
      ;
//finish
    multiplicativeExpression
      : unaryExpression (multiplicativeOperator unaryExpression)*
      ;
//*,/,%
//finish
    multiplicativeOperator
      :MULT     |
       DIVISIOS |
       MODULUS
      ;
//-3,-(-3)
//finish
    unaryExpression
      : MINUS unaryExpression
      | primaryExpression
      ;
//(-3),3,r,(3*r)
//finish
    primaryExpression
      : number
      | ID
      | OPEN_LIST relationalExpression CLOSE_LIST
      ;
      //finish
      //////////////////////////////////////edited
      ///////////done
 statement:for_loop        |
           for_in          |
           if_rule         |
           while_loop      |
           functions       |
           declaretion     |
           assignment      |
           //
           call_constructor|
           call_function   |
           relationalExpression

           ;
//all functions
//finish
 functions:function_noarguments_noreturn   |
           function_with_arguments_noreturn|
           function_noarguments_return     |
           function_arguments_return       ;
   /*
   void dd(){
   for(int i=0;i<=7;i++){}
   }
   *////finish
 function_noarguments_noreturn:VOID? ID no_arguments BLOCK_OPEN  statement* BLOCK_CLOSE;
   /*
   void dd(int s){
   for(int i=0;i<=7;i++){}
   }
   *///finish
 function_with_arguments_noreturn:VOID? ID with_arguments BLOCK_OPEN statement* BLOCK_CLOSE;
 /*
 int dd(){
 for(int i=0;i<=7;i++){}
 return 0;
 }
 *///finish
 function_noarguments_return:type ID no_arguments BLOCK_OPEN statement* return_function  BLOCK_CLOSE;
  /*
  int dd(int s){
  for(int i=0;i<=7;i++){}
  return 0;
  }
  *///finish
 function_arguments_return:type ID with_arguments BLOCK_OPEN statement* return_function  BLOCK_CLOSE;
 // dd(int s)//finsh
 with_arguments:OPEN_LIST type ID(COMMA type ID)* CLOSE_LIST;
 //()finsh
 no_arguments:OPEN_LIST CLOSE_LIST;
 //return 0;,return r;//finsh
 return_function:RETURN (value|ID) SEMICOLON ;

///////////////////////////
//dd()//finish
call_constructor_without_param:ID OPEN_LIST  CLOSE_LIST;
//dd(e,3)//finsh
call_constructor_with_param:ID OPEN_LIST value_constructor (COMMA value_constructor)* CLOSE_LIST ;
//finish
call_constructor:call_constructor_without_param|
                 call_constructor_with_param;

//finish
run_app:RUNAPP OPEN_LIST CONST? call_constructor CLOSE_LIST SEMICOLON;
//dd.functionName();//finsh
call_function:ID DOT call_constructor SEMICOLON;
//////////////new
///////////done
//dd.name
call_object:ID DOT ID ;
/////////////////////new
////////////////done
//dd[index]
//dd[index].d
object_index:ID LIST_OPEN ID LIST_CLOSE (DOT ID)?;
//void main(){}//finish
main_function:VOID MAIN OPEN_LIST CLOSE_LIST BLOCK_OPEN  run_app? statement* BLOCK_CLOSE ;
//finsh
declaretion:declareint  |
           declarebool  |
           declarestring|
           declaredouble|
           declarevar   |
           declarelist  |
           map
           ;
           //finish
////////////////////////////edited
////////////////done //000000000000000//should add call_function ---------------.--------//and edit call_function grammer
declare_class:CLASS  ID (extend)? BLOCK_OPEN    (declaretion|newObject|functions|call_function)* (constructor_class)?  widget_build? BLOCK_CLOSE;
//finish
body:BODY COLON widget;
/*
Scaffold(
appBar:AppBar(
title:Text("adf"),
centerTitle:true
),
body:Text("sdf")
)
*///finish
scaffold:SCAFFOLD OPEN_LIST (appBar COMMA)? (body)? CLOSE_LIST;
//finish
child:CHILD COLON (widget) COMMA;
/*
Container(
height:2.5,
width:2.5,
child:Text("abd"),

)
*///finish
container:CONTAINER OPEN_LIST  container_propreties* child? CLOSE_LIST;
container_propreties:height_proprety|width_proprety;

//finish
mainAxisAlignment:MAIN_AXIS_ALIGNMENT COLON MAIN_AXIS_ALIGNMENT_WIDGET DOT CENTER COMMA;










//isEmpty
widget:container|image|text|row|column|scaffold|expanded|sizedBox|ink_well|list_view|materialApp|textFormField|elevatedButton;
//finish






sizedBox:CONST? SIZED_BOX OPEN_LIST container_propreties* CLOSE_LIST;
//finish
expanded:EXPANDED OPEN_LIST child? CLOSE_LIST;
//finish
////////////////////////edited
///////////////////done
ink_well:INK_WELL OPEN_LIST onTap? child? CLOSE_LIST;
//finish
widget_build:OVERRIDE TYPEWIDGET BUILD OPEN_LIST BUILDCONTEXT CONTEXT CLOSE_LIST
             BLOCK_OPEN
             RETURN widget SEMICOLON
             BLOCK_CLOSE
;//finish
///////////////edited
//////////////done
list_view:LIST_VIEW DOT BUILDER OPEN_LIST
          ITEM_COUNT COLON itemCountListView COMMA
          item_builder  BLOCK_OPEN
          RETURN   widget SEMICOLON
                    BLOCK_CLOSE
           CLOSE_LIST;
///////////////new
////////////////done
itemCountListView:INT|(ID DOT LENGTH);

/*
Column(
mainAxisAlignment:MainAxisAlignment.center,
children:[
const Text("abd")
]
)
*/
//finish
column:COLUMN OPEN_LIST mainAxisAlignment? CHILDREN COLON LIST_OPEN CONST? widget(COMMA CONST? widget)*  LIST_CLOSE CLOSE_LIST;
/*
Row(
mainAxisAlignment:MainAxisAlignment.center,
children:[
const Text("abd")
]
)
*/
//finish
row:ROW OPEN_LIST mainAxisAlignment? CHILDREN COLON LIST_OPEN  widget(COMMA CONST? widget)*  LIST_CLOSE CLOSE_LIST;
/*
  TextFormField(
              controller: passwordController,
              decoration: InputDecoration(
                hintText: 'password',
                  border: OutlineInputBorder(
                      borderRadius: BorderRadius.circular(30.0)
                                            )
                                          ),
            ),
*/
//finish
textFormField:TEXT_FORM_FIELD OPEN_LIST
              CONTROLLER COLON ID COMMA
              DECORATION COLON INPUT_DECORATION OPEN_LIST
              HINT_TEXT COLON STRING COMMA
              BORDER COLON OUT_LINE_INPUT_BORDER OPEN_LIST
              BORDER_RADIUS COLON BORDER_RADIUS_WEDGET DOT CIRCULAR OPEN_LIST number CLOSE_LIST  CLOSE_LIST  CLOSE_LIST  CLOSE_LIST ;

/*
 ElevatedButton(
              onPressed: () {  },
              child: Text("6"),
              ),
*///need function method
elevatedButton:ELIVATED_BUTTON OPEN_LIST
               ON_PRESSED COLON OPEN_LIST CLOSE_LIST BLOCK_OPEN functions? BLOCK_CLOSE COMMA
               child CLOSE_LIST;
               //--------------------------------------------------------------------------------------------------------------------------------------------------
/*finish
appBar:AppBar(
title:Text("adf"),
centerTitle:true
)
*/
appBar:APP_BAR COLON APP_BAR_WIDGET OPEN_LIST title center_title? CLOSE_LIST;
title:TITLE COLON text COMMA ;

//MaterialApp(
  //      home:  MyHomePage(),
  //    );
homeInMaterialApp:HOME COLON ID OPEN_LIST CLOSE_LIST ;
materialApp:typematerialApp OPEN_LIST homeInMaterialApp COMMA CLOSE_LIST;
/////////////////new
////////////////done
typematerialApp:(MaterialApp|GetMaterialApp);
/////////////edit
////////done
//Image.asset("cxv")//Image.network("cxv")
image: IMAGE DOT ASSET OPEN_LIST path CLOSE_LIST;
////////////edited
////////////done
path:STRING |object_index |call_object;

extend:EXTENDS extends_type;
extends_type:STATELESSWIDGIT|
             STATEFULLWIDGIT|ID;
///////////edited
////////////done
value_constructor:value|ID|object_index|call_object;
////////////////edited
/////////////done
value:INT
     |DOUBLE
     |STRING
     |BOOLEAN
     ;

item_builder:ITEM_BUILDER COLON OPEN_LIST BUILDCONTEXT CONTEXT COMMA TYPEINT ID CLOSE_LIST;
height_proprety:HEIGHT COLON number COMMA
               ;
width_proprety:WIDTH COLON number COMMA
              ;
center_title:CENTER_TITLE COLON BOOLEAN;
conditional_operator:EQUAL_GTHAN
                     |EQUAL_LTHAN
                     |NOT EQUAL
                     |EQUAL EQUAL
                     |GTHAN
                     |LTHAN
                    ;
 type:TYPEINT
      |TYPESTRING
      |TYPEDOUBLE
      |TYPEBOOL
      ;
//int s=4;
declareint:FINAL? TYPEINT ID (EQUAL INT)? SEMICOLON;
//double s=4.4;
declaredouble:FINAL? TYPEDOUBLE ID (EQUAL DOUBLE)? SEMICOLON;
//bool s=true;
declarebool:FINAL? TYPEBOOL ID (EQUAL BOOLEAN)? SEMICOLON;
//String a="dsf";
declarestring:FINAL? TYPESTRING ID (EQUAL STRING)? SEMICOLON;
//'j':"hj"
 map_element:value COLON value;
//Map c={'j':"hj"}
 map: TYPEMAP ID EQUAL BLOCK_OPEN map_element (COMMA map_element)* BLOCK_CLOSE;
 //var s=4;
 //finish
declarevar:TYPEVAR ID (EQUAL value)? SEMICOLON;
/////////////////////////edited
// List abd=[
//  dd('ss','aaa'),
//  dd('www','www')
//  ];
declarelist:FINAL? TYPELIST ID EQUAL LIST_OPEN  list_type LIST_CLOSE SEMICOLON;
list_type:(list_value)(COMMA list_value)*;
//////////////////////new
/////////////done
list_value:value|call_constructor;

//finish
text:TEXT OPEN_LIST value_constructor   CLOSE_LIST ;
//finish
number:INT
      |DOUBLE
      ;
//finish
import_statement:IMPORT STRING SEMICOLON
                ;
////////////////////new
///////////////done
onTap:ONTAP COLON OPEN_LIST CLOSE_LIST BLOCK_OPEN (navigation_between_pages|navigation_between_pages_getx) BLOCK_CLOSE COMMA;
 /*
Navigator.push(
   context,
   MaterialPageRoute(builder: (context) => const SecondRoute()));
*/
/////////////////////new
/////////////////done
navigation_between_pages:Navigator DOT Push OPEN_LIST
                       CONTEXT COMMA
                        MaterialPageRoute OPEN_LIST BUILDER COLON OPEN_LIST CONTEXT CLOSE_LIST GTHAN_EQUAL CONST? call_constructor CLOSE_LIST CLOSE_LIST SEMICOLON;
////////////////////new
/////////////done
/*
Get.to(NextScreen());
*/
navigation_between_pages_getx:GETX DOT TO OPEN_LIST call_constructor  CLOSE_LIST SEMICOLON;