package com.demo.DemoSpring;

public class Circle implements Shape {
    private Colour colour;

    public Circle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String getShape() {
        return "I'm Circle";
    }

    @Override
    public String getShapeColour() {
        return colour.getColour(this);
    }
}
