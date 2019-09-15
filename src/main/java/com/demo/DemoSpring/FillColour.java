package com.demo.DemoSpring;

public class FillColour implements Colour {
    @Override
    public String getColour(Object object) {
        System.out.println(object.getClass().getName());
        return "Red";
    }
}
