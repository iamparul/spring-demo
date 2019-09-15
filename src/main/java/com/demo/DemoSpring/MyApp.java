package com.demo.DemoSpring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new
                FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
        Shape shape = context.getBean("shape", Circle.class);
        System.out.println(shape.getShape());
        System.out.println(shape.getShapeColour());
        System.out.println(shape.getShapeArea());
        context.close();
    }
}
