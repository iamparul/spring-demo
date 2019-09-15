package com.demo.DemoSpring;

public class Circle implements Shape {

    private Colour colour;
    private double radius;

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

    @Override
    public double getShapeArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
