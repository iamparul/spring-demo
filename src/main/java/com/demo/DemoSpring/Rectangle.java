package com.demo.DemoSpring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Rectangle implements Shape {

    private Colour colour;
    private double height;
    private double width;
    FileSystemXmlApplicationContext context;

    public Rectangle(Colour colour) {
        System.out.println("Contructor called with arg colour");
        this.colour = colour;
    }

    public void setContext(FileSystemXmlApplicationContext context) {
        this.context = context;
    }

    @Override
    public String getShape() {
        return "I'm Rectangle";
    }

    @Override
    public String getShapeColour() {
        return colour.getColour(this);
    }

    @Override
    public double getShapeArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public String setDemo(Colour colour){
        return "Called setDemo";
    }

    Colour getColour(){

        context.getBean("colour");
        return colour;
    }
}
