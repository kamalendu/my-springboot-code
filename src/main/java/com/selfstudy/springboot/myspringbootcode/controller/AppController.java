package com.selfstudy.springboot.myspringbootcode.controller;

import java.util.List;
import com.selfstudy.springboot.myspringbootcode.model.customer.Customer;
import com.selfstudy.springboot.myspringbootcode.nosql_model.feedback.Feedback;
import com.selfstudy.springboot.myspringbootcode.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController{

    @Value("${server.port}")
    private int portNum;
    @Value("${spring.application.name}")
    private String appName;
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/pulse") 
    public String pulseCheck(){
        return "Running "+appName+" on "+portNum;
    }
    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<List<Customer>>(customerService.getAllCustomer(), HttpStatus.OK) ;
    }
    @GetMapping("/customer/{id}/feedback")
    public ResponseEntity<List<Feedback>> getCustomerFeedbacks(@PathVariable("id") Integer id){
        return new ResponseEntity<List<Feedback>>(customerService.getCustFeedbacks(id), HttpStatus.OK);
    }
    @PostMapping("/customer/{id}/feedback")
    public ResponseEntity<Feedback> postFeedBack(@RequestBody Feedback fb, @PathVariable("id") int customerId){
        return new ResponseEntity<Feedback>(customerService.postFeedback(fb,customerId), HttpStatus.CREATED);
    }
}