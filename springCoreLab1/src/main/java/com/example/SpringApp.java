package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringApp {


    public static void main(String[] args) {

        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        

        /*  Load the Spring context from the XML configuration */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        /*  Retrieve a bean from the Context */
        CalculatorImpl calculatorBean = context.getBean("CalculatorImpl", CalculatorImpl.class);
        /* call the method the related to the object calculatorBean */
        System.out.println("Add : " + calculatorBean.add(10.0,5.0));
        System.out.println("Sub : " + calculatorBean.sub(10.0,5.0));
        System.out.println("Mul : " + calculatorBean.mul(10.0,5.0));
        System.out.println("Div : " + calculatorBean.div(10.0,5.0));
        /*  Retrieve a bean from the Context */
        Service1Impl service1Bean = context.getBean("service1", Service1Impl.class);
        /*  Constructor Injection  (takes int )  */
        System.out.println("Value : " + service1Bean.getValue());
        /*  Constructor Injection  (takes String ) */
        Service2Impl service2Bean = context.getBean("service2", Service2Impl.class);
        /*  Constructor Injection  (takes int )  */
        System.out.println("Value : " + service2Bean.getValue());
        /*  Retrieve a bean from the Context */
        MyBeanClass myBean = context.getBean("myBean", MyBeanClass.class);
        /*  Instatntiation using Static Factory Method  */
        System.out.println(myBean.getPropertName());
        

        System.out.println(" ================= Dependency Injection =================");

        User userBean = context.getBean("user", User.class);
        System.out.println("Name : "+ userBean.getName());

        /* Retrieve the daoService bean */
        /* using constructor-based method*/
        DAOServiceImpl daoService  = context.getBean("daoService", DAOServiceImpl.class);
        
        /* using factory-based method */
        DAOServiceImpl daoService2 = context.getBean("daoServiceFactoryMethod", DAOServiceImpl.class);
        
        /* using setter based method */
        DAOServiceImpl daoService3 = context.getBean("daoServiceSetterMethod", DAOServiceImpl.class);



        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}



