package com.selfstudy.springboot.myspringbootcode.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class ServletContainerConfig{
    @Bean
    public ConfigurableServletWebServerFactory webServletFactory(){
        JettyServletWebServerFactory webServletFactory = new JettyServletWebServerFactory();
        webServletFactory.setContextPath("/myapp");
        Set<ErrorPage> errPageSet = new HashSet<>();
        errPageSet.add(new ErrorPage(HttpStatus.NOT_FOUND, "src\\main\\resources\\templates\\error.html"));
        webServletFactory.setErrorPages(errPageSet);
        return webServletFactory;
    }
}