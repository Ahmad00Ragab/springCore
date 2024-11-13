package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*  Bean Scopes: Singleton and Prototype */
        MyBean singletonBean1 = context.getBean("singletonBean", MyBean.class);
        MyBean singletonBean2 = context.getBean("singletonBean", MyBean.class);
        System.out.println("Singleton Bean: " + (singletonBean1 == singletonBean2)); 


        MyBean prototypeBean1 = context.getBean("prototypeBean", MyBean.class);
        MyBean prototypeBean2 = context.getBean("prototypeBean", MyBean.class);
        System.out.println("Prototype Bean: " + (prototypeBean1 == prototypeBean2));

        /*  Lazy and Eager Initialization */
        context.getBean("lazyBean", MyLazyBean.class); 
        context.getBean("eagerBean", MyEagerBean.class);


        
        /*  Inner Bean Example */
        OuterBean outerBean = context.getBean("outerBean", OuterBean.class);
        System.out.println("Inner Bean: " + outerBean.getInnerBean());

        /* Collection Injection Example */
        CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);
        System.out.println("Names: " + collectionBean.getNames());

        /* Autowiring by Type Example */
        AutowireByTypeBean autowireByTypeBean = context.getBean("autowireByTypeBean", AutowireByTypeBean.class);
        System.out.println("Autowire by Type: " + autowireByTypeBean.getCollaborator());

        /* Autowiring by Name Example */
        AutowireByNameBean autowireByNameBean = context.getBean("autowireByNameBean", AutowireByNameBean.class);
        System.out.println("Autowire by Name: " + autowireByNameBean.getCollaborator());

        /* `idref` Example  */
        RefExample refExample = context.getBean("refExample", RefExample.class);
        System.out.println("idref Bean ID: " + refExample.getBeanId());

        /*  `depend-on` Example */
        DependentBean dependentBean = context.getBean("dependentBean", DependentBean.class);

        /* Compound Property Name Example */
        CompoundPropertyBean compoundPropertyBean = context.getBean("compoundPropertyBean", CompoundPropertyBean.class);
        System.out.println("City: " + compoundPropertyBean.getAddress().getCity());

        
        System.out.println("============================================================================");
        System.out.println("============================================================================");
        System.out.println("============================================================================");
    }
}
