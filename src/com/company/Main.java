package com.company;

import com.company.ErrorHandeling.ErrorHandling;
import com.company.SymbolTablle.SymbolTable;
import com.company.ast.models.*;
import com.company.ast.visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //public static SymbolTable symbolTable = new SymbolTable();
    public static SymbolTable symbolTable = new SymbolTable();
    public static ErrorHandling errorHandling = new ErrorHandling();

    public static void main(String[] args) throws IOException {
        try {

            FileWriter fw;
            Program p = new Program();
//            String source = "samples/flutter.txt";
           String source = "errors/error1.txt";
            CharStream input = CharStreams.fromFileName(source);
            dartLexer lexer = new dartLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            dartParser parser = new dartParser(tokens);
            ParseTree ASTtree = parser.program();
            Program prog = (Program) new BaseVisitor().visit(ASTtree);
           for (int i=0;i<prog.getElements().size();i++)
           System.out.println(prog.getElements().get(i).codeGenerationHTML());
           //print symbol table
          // symbolTable.print();
            errorHandling.setSymbolTable(symbolTable);
            errorHandling.collectErrors();
            //print errors
            errorHandling.errors();

            //-------------------------------------------------
            //print ast
            // System.out.println(prog);

            fw = new FileWriter("C:\\xampp\\htdocs\\" + "app" + ".html");

            fw.write(prog.codeGenerationHTML());
            fw.close();
            String filePath = "C:\\xampp\\htdocs\\app.html";

            // Create a File object
            File file = new File(filePath);
            try {
                // Open the file in the default web browser
                if(errorHandling.getErrors().size()<=0)
                Desktop.getDesktop().browse(file.toURI());
            } catch (IOException e) {
                e.printStackTrace();
            }


          //  System.out.println(prog.codeGenerationHTML());
           // System.out.println(image.codeGenerationHTML());
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(errorHandling.getTypeOfSymbol( symbolTable.getScopes().get(0).getSymbols().get(3) ) ) ;

    }


}
