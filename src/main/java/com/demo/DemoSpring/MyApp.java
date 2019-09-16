package com.demo.DemoSpring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new
                FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
        Shape shape = context.getBean("shape", Rectangle.class);
        Rectangle rectangle = context.getBean("shape",Rectangle.class);
        rectangle.setContext(context);
        Rectangle rectangle2 = context.getBean("shape",Rectangle.class);
        System.out.println(rectangle == rectangle2);
        System.out.println(shape.getShape());
        System.out.println(shape.getShapeColour());
        System.out.println(shape.getShapeArea());
        System.out.println(rectangle.setDemo(new FillColour()));
        context.close();
    }
}
