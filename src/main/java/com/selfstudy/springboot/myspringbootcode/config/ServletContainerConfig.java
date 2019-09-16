package com.selfstudy.springboot.myspringbootcode.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ServletContainerConfig{
    @Bean
    public ConfigurableServletWebServerFactory webServletFactory(){
        JettyServletWebServerFactory webServletFactory = new JettyServletWebServerFactory();
        // TomcatServletWebServerFactory tomcatWebServletFactory = new TomcatServletWebServerFactory();
        webServletFactory.setContextPath("/myapp");
        return webServletFactory;
    }

}