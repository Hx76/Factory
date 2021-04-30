package com.impl;

public class ShapFactory {
    public Shap getShap(String type){
        if (type==null){
            return null;
        }
        if (type.equalsIgnoreCase("矩形")){
            return new Retangle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
