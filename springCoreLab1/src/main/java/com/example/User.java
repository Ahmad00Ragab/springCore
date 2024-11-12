package com.example;

public class User {
    
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String firstName, String lastName){
        this.name = firstName+ " " + lastName;    
    }
}
