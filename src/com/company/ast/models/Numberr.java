package com.company.ast.models;

import com.company.ast.nodes.Node;

public class Numberr extends Node{

        String intt;
        String doublee;

        public String getIntt() {
            return intt;
        }

        public String getDoublee() {
            return doublee;
        }

        public void setIntt(String intt) {
            this.intt = intt;
        }

        public void setDoublee(String doublee) {
            this.doublee = doublee;
        }

        @Override
        public String toString() {
            if(intt!=null)
                return intt;
            else return doublee;
        }

}