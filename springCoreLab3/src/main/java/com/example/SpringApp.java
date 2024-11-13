package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApp {
    public static void main(String[] args) {

        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        /*  Test child bean */
        MyBeanClass childBean = (MyBeanClass) context.getBean("childBean");
        System.out.println("Common Property (Child): " + childBean.getCommonProperty());

        /*  Testing Collection Inheritance */
        ParentChildCollectionBean collectionBean = (ParentChildCollectionBean) context.getBean("childBeanWithList");
        collectionBean.printItems();

        /* Testing Property Placeholder Configurer */
        DatabaseConfig dbConfig = (DatabaseConfig) context.getBean("databaseConfig");
        dbConfig.printConfig();

        System.out.println("----------------------------");

        
        /*  Get the Service bean and test it */
        Service service = (Service) context.getBean("serviceBean");
        service.performService();

        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}
