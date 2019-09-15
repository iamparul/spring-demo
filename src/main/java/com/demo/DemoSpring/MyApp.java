package com.demo.DemoSpring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new
                FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
        Shape shape = context.getBean("shape", Rectangle.class);
        System.out.println(shape.getShape());
        context.close();
    }
}
