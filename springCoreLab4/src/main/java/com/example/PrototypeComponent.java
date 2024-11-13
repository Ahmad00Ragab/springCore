package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("prototypeBean")
@Scope("prototype") 
public class PrototypeComponent {

    public void display() {
        System.out.println("Prototype Component Instance: " + this.hashCode());
    }
}
