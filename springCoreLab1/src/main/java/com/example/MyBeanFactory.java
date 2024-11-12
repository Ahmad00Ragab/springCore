package com.example;

public class MyBeanFactory {
    public  MyBeanClass createInstance() {
        MyBeanClass myBean = new MyBeanClass();
        myBean.setPropertyName("Created using Non-Static factory method inside Factory bean");
        return myBean;
    }
}
