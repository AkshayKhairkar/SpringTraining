package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Lifecycle {

    @Autowired
    private Hello hello;

    public Lifecycle() {
        System.out.println("Lifecycle.Lifecycle" + hello);
    }

    @PostConstruct
    public void init(){
        System.out.println("Lifecycle.init: " + hello);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Lifecycle.destroy");
    }
}
