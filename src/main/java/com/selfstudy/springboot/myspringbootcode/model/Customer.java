package com.selfstudy.springboot.myspringbootcode.model;


import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Customer {
    private int id;
    private String name;
    private String city;
}
