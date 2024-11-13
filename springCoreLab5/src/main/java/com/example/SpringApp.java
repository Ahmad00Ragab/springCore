package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class SpringApp {


    public static void main(String[] args) {
        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");

        /*  Activate a profile ("dev" or "prod") */
        System.setProperty("spring.profiles.active", "dev");


        /* Get the Context  */
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*  Test bean initialization and dependency injection */
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());


        System.out.println("---------------------");
        /* Test a prototype-scoped bean */
        Dog dog1 = context.getBean(Dog.class);
        System.out.println(dog1);    
        Dog dog2 = context.getBean(Dog.class);
        System.out.println(dog2);


        System.out.println("---------------------");
        Owner owner = context.getBean(Owner.class);
        System.out.println(owner);


  

        System.out.println("---------------------");
        /* Test profile-based beans  */
        // DatabaseConfig dbConfig = context.getBean(DatabaseConfig.class);
        // dbConfig.printConfig();

        /* Testing Using Xml with projectConfig */
        DatabaseConfig dbConfig = (DatabaseConfig) context.getBean("databaseConfig");
        dbConfig.printConfig();

        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}

