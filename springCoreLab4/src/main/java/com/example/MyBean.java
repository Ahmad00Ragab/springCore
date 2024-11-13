package com.example;

import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named("myBean")
public class MyBean {

    private final MyService service;

    @Inject
    public MyBean(MyService service) {
        this.service = service;
    }

    public void execute() {
        service.performService();
        System.out.println("Bean execution completed");
    }
}
