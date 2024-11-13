package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class ProjectConfig {

    /* bean with a custom init method */
    @Bean(initMethod = "init")
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");
        return parrot;
    }

    /*  Declare a prototype-scoped bean */
    @Bean
    @Scope("prototype")
    public Dog dog() {
        return new Dog();
    }


    /* Bean with dependencies  */
    @Bean
    public Owner owner(Parrot parrot, Dog dog) {
        return new Owner(parrot, dog);
    }

    /*  Profile-based bean definition */
    // @Bean
    // @Profile("dev")
    // public DatabaseConfig devDatabaseConfig() {
    //     return new DatabaseConfig("jdbc:mysql://localhost:3306/dev_db", "root", "devpass");
    // }

    // @Bean
    // @Profile("prod")
    // public DatabaseConfig prodDatabaseConfig() {
    //     return new DatabaseConfig("jdbc:mysql://localhost:3306/prod_db", "admin", "prodpwd");
    // }










    /* using xml with java-based configuration */
    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Bean("databaseConfig")
    public DatabaseConfig databaseconfig() {
        DatabaseConfig dbConfig = new DatabaseConfig();
        /* Setting properties from XML-resolved values */
        dbConfig.setUrl(url);
        dbConfig.setUsername(username);
        dbConfig.setPassword(password);
        return dbConfig;
    }
}
