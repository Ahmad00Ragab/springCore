package com.example;


public class DatabaseConfig {
    
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void printConfig() {
        System.out.println("DB URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
