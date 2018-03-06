package com.beans;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerTestRepositoryImpl implements CustomerRepository {

    @Override
    public String getFirstName() {
        return "Sandeep";
    }

    @Override
    public String getLastName() {
        return "Juneja";
    }

    public CustomerTestRepositoryImpl() {
        System.out.println("CustomerTestRepositoryImpl.CustomerTestRepositoryImpl");
    }
}
