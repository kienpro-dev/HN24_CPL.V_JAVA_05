package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();
        Employee instance1 = ctx.getBean(Employee.class);
        Employee instance2 = ctx.getBean(Employee.class);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        ctx.close();
    }
}