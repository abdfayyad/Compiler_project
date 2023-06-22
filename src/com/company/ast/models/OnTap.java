package com.company.ast.models;

import com.company.ast.models.NavigationBetweenPages;
import com.company.ast.models.Statement;
import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class  OnTap extends Node{
    String ontap;
    String colon;
    String open_list;
    String close_list;
    String bloc_open;

    @Override
    public String codeGenerationJAVASCRIPT() {
        if(navigation_between_pages_getx.getGetx()!=null){
            return navigation_between_pages_getx.codeGenerationJAVASCRIPT() ;
        }
        if(navigationBetweenPages.getPush()!=null) return navigationBetweenPages.codeGenerationJAVASCRIPT();
        return null;
    }

    @Override
    public String toString() {
        if(navigation_between_pages_getx.getGetx()!=null){
            return  ontap  +
                    colon  +
                    open_list  +
                    close_list  +
                    bloc_open  +
                    navigation_between_pages_getx.toString()+
                    bloc_close  +"," ;
        }
        if(navigationBetweenPages.getPush()!=null) return   ontap  +
                colon +
                open_list +
                close_list +
                bloc_open  + navigationBetweenPages.toString()+ bloc_close  +
                "," ;
        return null;
    }


    public String getOntap() {
        return ontap;
    }

    public void setOntap(String ontap) {
        this.ontap = ontap;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getOpen_list() {
        return open_list;
    }

    public void setOpen_list(String open_list) {
        this.open_list = open_list;
    }

    public String getClose_list() {
        return close_list;
    }

    public void setClose_list(String close_list) {
        this.close_list = close_list;
    }

    public String getBloc_open() {
        return bloc_open;
    }

    public void setBloc_open(String bloc_open) {
        this.bloc_open = bloc_open;
    }

    public String getBloc_close() {
        return bloc_close;
    }

    public void setBloc_close(String bloc_close) {
        this.bloc_close = bloc_close;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }


    public NavigationBetweenPages getNavigationBetweenPages() {
        return navigationBetweenPages;
    }

    public void setNavigationBetweenPages(NavigationBetweenPages navigationBetweenPages) {
        this.navigationBetweenPages = navigationBetweenPages;
    }

    public Navigation_Between_Pages_Getx getNavigation_between_pages_getx() {
        return navigation_between_pages_getx;
    }

    public void setNavigation_between_pages_getx(Navigation_Between_Pages_Getx navigation_between_pages_getx) {
        this.navigation_between_pages_getx = navigation_between_pages_getx;
    }

    String bloc_close;
    String comma;

    NavigationBetweenPages navigationBetweenPages=new NavigationBetweenPages();
    Navigation_Between_Pages_Getx navigation_between_pages_getx=new Navigation_Between_Pages_Getx();

}