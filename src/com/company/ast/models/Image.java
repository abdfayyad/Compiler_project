package com.company.ast.models;

import com.company.ast.models.Path;
import com.company.ast.nodes.Node;

public class Image extends Node {
    String image;
    String dot;
    String asset;
    String openList;
    Path path=new Path();
    String closeList;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getOpenList() {
        return openList;
    }

    public void setOpenList(String openList) {
        this.openList = openList;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public String getCloseList() {
        return closeList;
    }

    public void setCloseList(String closeList) {
        this.closeList = closeList;
    }

    @Override
    public String toString() {
        return  image + dot +asset +  openList + path.toString() + closeList ;
    }

    @Override
    public String codeGenerationHTML() {
        return "<img src=\""+path.codeGenerationHTML()+"\""+"alt=\"Hello, Flutter!\" >";
    }
}
/*
* <img src="image.jpg" alt="Hello, Flutter!" >
 */