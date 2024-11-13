package com.example;

import java.util.List;


public class MyBeanClass {

    private String commonProperty;
    private List<String> items;

    /*  Getters and Setters for the properties */
    public String getCommonProperty() {
        return commonProperty;
    }

    public void setCommonProperty(String commonProperty) {
        this.commonProperty = commonProperty;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
