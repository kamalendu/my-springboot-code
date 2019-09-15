package com.selfstudy.springboot.myspringbootcode;

import java.io.PrintStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class MySpringbootCodeApplication {

	private static Logger logger = LoggerFactory.getLogger(MySpringbootCodeApplication.class);
	public static void main(String[] args) {
		SpringApplication customSpringApp = new SpringApplication(MySpringbootCodeApplication.class);
		customSpringApp.setBanner(
			(Environment environment, Class<?> sourceClass, PrintStream out) ->
				out.println("\n\n>>>>=====> Starting:: "+environment.getProperty("spring.application.name")+"<=====<<<<\n"));
		logger.info("Before app run method");
		customSpringApp.run(args);
		logger.info("After app run method");
	}

}
