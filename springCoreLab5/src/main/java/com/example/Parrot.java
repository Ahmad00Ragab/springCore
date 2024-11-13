package com.example;

public class Parrot {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init() {
        System.out.println("Parrot is instantiated successfully");
    }

    @Override
    public String toString() {
        return "Parrot{name='" + name + "'}";
    }
}