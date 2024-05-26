package com.example.bean.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.example.Controller")
public class CustomerFormApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CustomerFormApplication.class, args);
		System.out.println("Hii");

	}

}
