package com.example.demo.services.implementations;

import com.example.demo.domains.Customer;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.services.NameSetterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameSetterService implements NameSetterServiceImpl {

    private CustomerRepository customerRepository;

    @Autowired
    public NameSetterService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addCustomer(String name, String lastName) {
        Customer customer = new Customer(name, lastName);
        customerRepository.save(customer);
    }
}
