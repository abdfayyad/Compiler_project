package com.company.ast.models;

import com.company.ast.nodes.Node;

public class InkWell extends Node {
    String inkWell;
    String openList;
    Child child;
    String closeList;
   OnTap onTap;

    public OnTap getOnTap() {
        return onTap;
    }

    public void setOnTap(OnTap onTap) {
        this.onTap = onTap;
    }

    public String getInkWell() {
        return inkWell;
    }

    public void setInkWell(String inkWell) {
        this.inkWell = inkWell;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        if(child.getChild()!=null&&onTap!=null)  return inkWell+openList+onTap.toString()+child.toString()+closeList;
        else if(child.getChild()!=null){
            return inkWell+openList+child.toString()+closeList;
        }
        else if(onTap.getOntap()!=null) return inkWell+openList+onTap.toString()+closeList;
        else  return inkWell+openList+closeList;
    }

    @Override
    public String codeGenerationHTML() {

        return "<div class=\"inkwell\" onclick=\"handleTap()\">";
    }

    @Override
    public String codeGenerationJAVASCRIPT() {
        return onTap.codeGenerationJAVASCRIPT();
    }
}/**  <div class="button" onclick="handleButtonClick()">
 Button
 </div>

 function handleButtonClick() {
 console.log('Button clicked!');
 // Perform any desired action here
 }



 */
