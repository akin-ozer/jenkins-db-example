package com.example.demo.controllers;

import com.example.demo.domains.formhelpers.CustomerImpl;
import com.example.demo.services.NameGetterServiceImpl;
import com.example.demo.services.NameSetterServiceImpl;
import com.example.demo.services.implementations.NameGetterService;
import com.example.demo.services.implementations.NameSetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CustomerController {

    private NameGetterServiceImpl nameGetterService;
    private NameSetterServiceImpl nameSetterService;
    @Autowired
    public CustomerController(NameGetterService nameGetterService, NameSetterService nameSetterService) {
        this.nameGetterService = nameGetterService;
        this.nameSetterService = nameSetterService;
    }

    @GetMapping({"/"," ",""})
    public String get(Model model){
        model.addAttribute("customer", nameGetterService.findAll());
        model.addAttribute("customerone", nameGetterService.getFirstName());
        model.addAttribute("customerImpl", new CustomerImpl());
        return "index";
    }

    @PostMapping({"/",""," "})
    public String set(@ModelAttribute CustomerImpl customerImpl){
        nameSetterService.addCustomer(customerImpl.getFirstName(),customerImpl.getLastName());
        return "redirect:/";
    }





}
