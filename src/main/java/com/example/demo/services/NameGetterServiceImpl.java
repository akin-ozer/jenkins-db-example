package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public interface NameGetterServiceImpl {
    String getFirstName();
    Iterable findAll();
}
