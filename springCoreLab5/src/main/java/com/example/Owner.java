package com.example;


public class Owner {

    private Parrot parrot;
    private Dog dog;

    public Owner(Parrot parrot, Dog dog) {
        this.parrot = parrot;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Owner{parrot=" + parrot + ", dog=" + dog + "}";
    }
}
