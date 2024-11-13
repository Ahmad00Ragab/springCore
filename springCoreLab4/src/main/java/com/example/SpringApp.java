package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class SpringApp {


    public static void main(String[] args) {

        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
            /*  Fetch beans and execute logic using Dependency injection */
            MyBean myBean = context.getBean("myBean", MyBean.class);
            myBean.execute();
    
            
            /*  New instance created each request due to prototype scope */
            PrototypeComponent prototype1 = context.getBean("prototypeBean", PrototypeComponent.class);
            prototype1.display();

            PrototypeComponent prototype2 = context.getBean("prototypeBean", PrototypeComponent.class);
            prototype2.display(); 
    

            /* Testing ManagedBeanExample  */
            ManagedBeanExample managedBean = context.getBean(ManagedBeanExample.class);
            managedBean.managedOperation();
    

            /* Testing the CustomScope */           
            MyScope scope1 = context.getBean(MyScope.class);
            MyScope scope2 = context.getBean(MyScope.class);
            scope1.performService();  
            scope2.performService();  

        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}




