package com.example;


import org.springframework.stereotype.Component;


@Component("customService")
public class MyService {

    public void performService() {
        System.out.println("Service is performing its operation...");
    }
}
