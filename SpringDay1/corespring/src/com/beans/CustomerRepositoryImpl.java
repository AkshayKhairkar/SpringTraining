package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String getFirstName(){
        return "Akshay";
    }

    @Override
    public String getLastName(){
        return "Khairkar";
    }

    public CustomerRepositoryImpl() {
        System.out.println("CustomerRepositoryImpl.CustomerRepositoryImpl");
    }
}
