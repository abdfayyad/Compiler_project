package com.company.ast.models;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Program extends Node {
    ArrayList<Node> elements = new ArrayList<Node>();
    ArrayList<ImportStatement> importStatements = new ArrayList();
    ArrayList<Declare_Class> declare_classes = new ArrayList<>();
    ArrayList<Main_function> main_functions = new ArrayList<>();

    ListView listView;


    public ArrayList<ImportStatement> getImportStatements() {
        return importStatements;
    }

    public void setImportStatements(ArrayList<ImportStatement> importStatements) {
        this.importStatements = importStatements;
    }

    public ArrayList<Declare_Class> getDeclare_classes() {
        return declare_classes;
    }

    public void setDeclare_classes(ArrayList<Declare_Class> declare_classes) {
        this.declare_classes = declare_classes;
    }

    public ArrayList<Main_function> getMain_functions() {
        return main_functions;
    }

    public void setMain_functions(ArrayList<Main_function> main_functions) {
        this.main_functions = main_functions;
    }


    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    Widget widget;

    public ArrayList<Node> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Node> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        String s = new String();
        if (importStatements != null)
            for (ImportStatement importStatement : this.importStatements)
                s += importStatement.toString();
        if (main_functions != null)
            for (Main_function mainFunction : this.main_functions)
                s += mainFunction.toString();
        if (declare_classes != null)
            for (Declare_Class declare_class : this.declare_classes)
                s += declare_class.toString();
        return s;
    }

    @Override
    public String codeGenerationHTML() {
        String s = new String();


        s += "<!DOCTYPE html>\n" +
                "   <html>\n" +
                "           <head>\n" +
                "               <title>My Application</title>\n" +
                "           </head>\n" +
                "           <body>\n";

        for (Declare_Class declare_class1 : this.declare_classes)
            if (declare_class1.getWidget_build() != null && declare_class1.getWidget_build().getWidget() != null)
                s += "                " + declare_class1.getWidget_build().getWidget().codeGenerationHTML();
        s += "<script>";
        for (Declare_Class declare_classes1 : this.declare_classes) {
            if (declare_classes1.getEextend().extendss != null) s += "\n";
            else s += declare_classes1.codeGenerationJAVASCRIPT() + "\n";
            s += declare_classes1.codeGenerationList();
            if (declare_classes1.widget_build != null)
            if (declare_classes1.widget_build.widget != null)
            if (declare_classes1.widget_build.widget.scaffold != null)
            if (declare_classes1.widget_build.widget.scaffold.body != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0) != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget.container != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget.container.child != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget.container.child.widget != null)
            if (declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget.container.child.widget.listView != null)
              s += declare_classes1.widget_build.widget.scaffold.body.widget.row.widgets.get(0).expanded.child.widget.container.child.widget.listView.codeGenerationJAVASCRIPT() ;
        }
        s+= "</script>";
        s += "           </body>\n" +
                "  </html>\n";

        return s;

    }


}
/*



  <div id="app">
//    <div id="productList">
      <!-- Product items will be dynamically added here -->
    </div>

    <div id="productDetails" style="display: none;">
      <h2 id="productTitle"></h2>
      <p id="productDescription"></p>
      <button id="backButton">Back to Product List</button>
    </div>
  </div>

  <script src="product.js"></script>
</body>
</html>
*/