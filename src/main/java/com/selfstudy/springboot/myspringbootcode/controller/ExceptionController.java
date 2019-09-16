package com.selfstudy.springboot.myspringbootcode.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class ExceptionController implements ErrorController{

    @Override
    public String getErrorPath() {
        return "/error";
    }
    @RequestMapping("/error")
    public String getErrorPage(){
        return "error";
    }
}