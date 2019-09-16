package com.demo.DemoSpring;

public class FillColour implements Colour {
    public FillColour() {
        System.out.println("Constructor called");
    }

    @Override
    public String getColour(Object object) {
        System.out.println(object.getClass().getName());
        return "Red";
    }

}
