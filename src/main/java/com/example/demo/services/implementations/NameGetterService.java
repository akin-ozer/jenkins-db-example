package com.example.demo.services.implementations;

import com.example.demo.domains.Customer;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.services.NameGetterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameGetterService implements NameGetterServiceImpl {

    @Autowired
    private CustomerRepository customerRepository;

    public String getFirstName() {
        for (Customer customer : customerRepository.findByFirstName("Akin")) {
            if (customer.getFirstName().equals("Akin")) {
                return customer.getFirstName();
            }
        }
        return "yok öyle bisi";

    }

    public Iterable findAll(){
        return customerRepository.findAll();
    }

}