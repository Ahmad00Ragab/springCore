package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;


public class Service {

    private PrimaryDependency primaryDependency;


    @Autowired(required = false)  
    private PrimaryDependency2 primaryDependency2; /*  Optional dependency */

    
    private SecondaryDependency secondaryDependency;


    @Resource(name = "resourceBean")
    // @Autowired
    private ResourceDependency resourceDependency;



    /*  Constructor Injection */
    @Autowired
    public Service(PrimaryDependency primaryDependency) {
        this.primaryDependency = primaryDependency;
    }


    /*  Setter Injection with @Autowired */
    @Autowired
    public void setPrimaryDependency(PrimaryDependency primaryDependency) {
        this.primaryDependency = primaryDependency;
    }



    /*  Setter Injection with @Qualifier */
    @Autowired
    @Qualifier("secondaryBean")
    public void setSecondaryDependency(SecondaryDependency secondaryDependency) {
        this.secondaryDependency = secondaryDependency;
    }




    /*  Setter Injection with @Autowired */
    public void setPrimaryDependency2(PrimaryDependency2 primaryDependency2) {
        this.primaryDependency2 = primaryDependency2;
    }



    public void performService() {
        System.out.println("Primary Dependency: " + primaryDependency.getMessage());
        if(primaryDependency2 == null){
            System.out.println("primaryDependency2 is null");
        }
        else{
            System.out.println("Resource Dependency: " + primaryDependency2.getMessage());
        }
        System.out.println("Secondary Dependency: " + (secondaryDependency != null ? secondaryDependency.getMessage() : "No Secondary Dependency"));
        System.out.println("Resource Dependency: " + resourceDependency.getMessage());
    }
}
