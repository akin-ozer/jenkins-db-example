package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface NameSetterServiceImpl {
    void addCustomer(String name, String lastName);
}
