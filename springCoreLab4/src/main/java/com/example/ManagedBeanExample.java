package com.example;

import org.springframework.stereotype.Component;

import jakarta.annotation.ManagedBean;

@Component
@ManagedBean
public class ManagedBeanExample {

    public void managedOperation() {
        System.out.println("ManagedBean is performing its operation...");
    }
}
