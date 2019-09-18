package com.demo.DemoSpringScope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements ApplicationContextAware {
    B b;
    C c;
    private ApplicationContext context;

    public A() {
        System.out.println("'A' Called");
    }

    public B getB() {
        return context.getBean("b",B.class);
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;

    }
}
