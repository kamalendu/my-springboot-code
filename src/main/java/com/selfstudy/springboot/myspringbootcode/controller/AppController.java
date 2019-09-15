package com.selfstudy.springboot.myspringbootcode.controller;

import java.util.List;

import com.selfstudy.springboot.myspringbootcode.model.Customer;
import com.selfstudy.springboot.myspringbootcode.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController{

    @Value("${server.port}")
    private int portNum;
    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/pulse") 
    public String pulseCheck(){
        return "Running "+appName+" on "+portNum;
    }
    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK) ;
    }
}