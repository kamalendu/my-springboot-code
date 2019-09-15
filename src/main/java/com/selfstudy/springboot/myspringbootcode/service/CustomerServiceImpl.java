package com.selfstudy.springboot.myspringbootcode.service;

import java.util.ArrayList;
import java.util.List;

import com.selfstudy.springboot.myspringbootcode.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> custList = new ArrayList<>();
        Customer cs = new Customer(1, "Kamal", "Atlanta");
        custList.add(cs);
        return custList;
    }
    
}