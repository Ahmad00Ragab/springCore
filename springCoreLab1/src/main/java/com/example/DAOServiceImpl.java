package com.example;


public class DAOServiceImpl {

    private ProductDAO productDAO;
    private UserDAO    userDAO;


    public DAOServiceImpl() {
        System.out.println("Inside the Default Constructor");
    }

    public DAOServiceImpl(ProductDAO productDAO, UserDAO userDAO) {
        this.productDAO = productDAO;
        this.userDAO    = userDAO;
        System.out.println("Inside DAOServiceImpl with input ProductDAO and UserDAO");
    }


    public DAOServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
        System.out.println("Inside DAOServiceImpl with input ProductDAO ");
    }



    public DAOServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
        System.out.println("Inside DAOServiceImpl with input UserDAO ");
    }


    public void setProductDAO(ProductDAO productDAO){
        this.productDAO = productDAO;
        System.out.println("Inside setProductDAO");
    }


    public void doNothing(){
    }

}
