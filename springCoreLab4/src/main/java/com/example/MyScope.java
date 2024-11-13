package com.example;

import org.springframework.stereotype.Service;

@Service
public class MyScope {

    public void performService() {
        System.out.println("MyScope is performing its operation... Instance: " + this.hashCode());
    }
}
