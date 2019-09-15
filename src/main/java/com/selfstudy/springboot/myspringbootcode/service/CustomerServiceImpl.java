package com.selfstudy.springboot.myspringbootcode.service;

import java.util.ArrayList;
import java.util.List;

import com.selfstudy.springboot.myspringbootcode.model.Customer;
import com.selfstudy.springboot.myspringbootcode.repository.CutomerRepositoryI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl{

    @Autowired
    private CutomerRepositoryI customerRepo;
    public List<Customer> getAllCustomer() {
        List<Customer> custList = customerRepo.findAll();
        // Customer cs = new Customer(1, "Kamal", "Atlanta");
        // custList.add(cs);

        return custList;
    }
    
}