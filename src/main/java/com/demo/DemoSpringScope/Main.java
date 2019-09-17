package com.demo.DemoSpringScope;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new
                FileSystemXmlApplicationContext("/src/main/java/applicationContext.xml");
        A a = context.getBean("a", A.class);
        A a1 = context.getBean("a", A.class);
        //B b = context.getBean("b",B.class);
        //B b1 = context.getBean("b",B.class);
        B b = a.getB();
        B b1 = a1.getB();
        C c = a.getC();
        C c1 = a1.getC();
        System.out.println(a == a1);
        System.out.println(b == b1);
        System.out.println(c == c1);
    }
}
