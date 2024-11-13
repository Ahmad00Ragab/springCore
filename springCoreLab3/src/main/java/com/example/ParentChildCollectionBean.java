package com.example;

import java.util.*;


public class ParentChildCollectionBean extends MyBeanClass{
    
    private List<String> items;

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void printItems() {
        System.out.println("List of Objects: ");
        items.forEach(System.out::println); 
    }
}
