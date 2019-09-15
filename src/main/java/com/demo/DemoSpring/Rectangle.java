package com.demo.DemoSpring;

public class Rectangle implements Shape{

//    private double height;
//    private double width;
    private Colour colour;

    /*public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
*/

    public Rectangle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String getShape() {
        return "It's Rectangle";
    }

   /* public double getArea(){
        return height * width;
    }

    @Override
    public String getShapeColour() {
        return colour.getColour();
    }
*/
  /*  public double getHeight() {
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
*/
}
