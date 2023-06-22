package com.company.ast.models;

import com.company.ast.models.MapElement;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Map extends Node {
    String typeMap;
    String id ;
    String equal;
    String blockOpen;
    ArrayList<MapElement> mapElements=new ArrayList<MapElement>();
   String comma;
   String blockClose;

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }



    public String getTypeMap() {
        return typeMap;
    }

    public void setTypeMap(String typeMap) {
        this.typeMap = typeMap;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlockOpen() {
        return blockOpen;
    }

    public void setBlockOpen(String blockOpen) {
        this.blockOpen = blockOpen;
    }

    public ArrayList<MapElement> getMapElements() {
        return mapElements;
    }

    public void setMapElements(ArrayList<MapElement> mapElements) {
        this.mapElements = mapElements;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getBlockClose() {
        return blockClose;
    }

    public void setBlockClose(String blockClose) {
        this.blockClose = blockClose;
    }

    @Override
    public String toString() {
        String s=new String();
        s+=typeMap+id+equal;

        if(mapElements.size()>0) {
            s +="{";
            s += mapElements.get(0).toString();
            for (int i = 1; i < mapElements.size(); i++) {
                s += ",";
                s += mapElements.get(i).toString();
            }
            s += "}";
        }
        return s ;}
}
