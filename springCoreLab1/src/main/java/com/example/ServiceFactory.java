package com.example;


public class ServiceFactory {
 
    public DAOServiceImpl createDAOService(ProductDAO productDAO){
        return new DAOServiceImpl(productDAO);
    }

}
