package com.selfstudy.springboot.myspringbootcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class ViewController{
    @RequestMapping("/") 
    public String returnIndexPage(){
        return "index";
    }
}