package com.selfstudy.springboot.myspringbootcode.model.customer;

import com.selfstudy.springboot.myspringbootcode.model.customer.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CutomerRepositoryI extends JpaRepository<Customer, Integer> {

}