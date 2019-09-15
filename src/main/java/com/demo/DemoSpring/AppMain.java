package com.demo.DemoSpring;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class AppMain {
    public static void main(String[] args) throws Exception {

        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
        Shape shape = context.getBean("shape", Rectangle.class);

        // XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
        System.out.println(shape.getShape());
        //System.out.println(shape.getArea());
      //  System.out.println(shape.getShapeColour());
        context.close();
    }
}
