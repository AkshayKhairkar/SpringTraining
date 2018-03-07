package com.app;

import com.aspects.Monitor;
import com.beans.CustomerService;
import com.beans.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class Application {

    private CustomerService service;

    @Autowired
    public Application(CustomerService service){
        System.out.println("Application.Application");
        this.service=service;
    }

    @Monitor
    public void printCustomerName(){
        System.out.println("Customer Name: " + service.getFullName());
    }

    public static void main(String[] args) {

        //Load the spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //Handel to a bean(by type)

        /*Hello hello = context.getBean(Hello.class);
        System.out.println("Result: " + hello.sayHello());*/

        //Handel to a bean(by name)

        Hello hello = (Hello) context.getBean("hello");
        System.out.println("Type of hello: " + hello.getClass().getName());
        System.out.println("Result: " + hello.sayHello());

        Application app = context.getBean(Application.class);
        app.printCustomerName();

        Application app1 = context.getBean(Application.class);
        app1.printCustomerName();

        ((ClassPathXmlApplicationContext)context).close();
    }
}
