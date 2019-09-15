package com.demo.DemoSpring;

public class Rectangle implements Shape {

    private Colour colour;

    public Rectangle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String getShape() {
        return "I'm Rectangle";
    }

    @Override
    public String getShapeColour() {
        return colour.getColour(this);
    }
}
