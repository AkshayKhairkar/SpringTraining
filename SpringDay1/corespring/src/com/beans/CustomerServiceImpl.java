package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier("customerRepository")
//    @Qualifier("customerRepositoryImpl")
//    @Qualifier("customerTestRepositoryImpl")
    private CustomerRepository customerRepository;

    @Override
    public String getFullName(){
        return customerRepository.getFirstName() + " " + customerRepository.getLastName();
    }

    public CustomerServiceImpl() {
        System.out.println("CustomerServiceImpl.CustomerServiceImpl");
    }

    /*public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Inside Setter");
        this.customerRepository = customerRepository;
    }*/
}
