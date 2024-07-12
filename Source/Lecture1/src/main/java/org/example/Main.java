package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
        Employee employee = (Employee) context.getBean("javaDeveloper");
        Employee employee2 = (Employee) context.getBean("javaDeveloper2");
        Employee employee3 = (Employee) context.getBean("javaDeveloper3");
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}