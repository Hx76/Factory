package com.impl.test;

import com.impl.Shap;
import com.impl.ShapFactory;

public class FactoryTest {
    public static void main(String[] args) {
        final ShapFactory shapFactory = new ShapFactory();
        Shap shap=shapFactory.getShap("square");
        shap.draw();
    }
}
