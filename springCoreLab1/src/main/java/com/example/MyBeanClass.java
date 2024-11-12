package com.example;


public class MyBeanClass {
    
    private String propertyName;

    public static MyBeanClass createInstance() {
        MyBeanClass myBean = new MyBeanClass();
        myBean.setPropertyName("Created using static factory method");
        return myBean;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertName(){
        return this.propertyName;
    }
}
