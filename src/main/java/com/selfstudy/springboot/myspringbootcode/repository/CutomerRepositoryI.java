package com.selfstudy.springboot.myspringbootcode.repository;

import com.selfstudy.springboot.myspringbootcode.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CutomerRepositoryI extends JpaRepository<Customer, Integer> {

}