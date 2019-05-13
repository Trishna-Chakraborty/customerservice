package com.example.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomerserviceApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext=SpringApplication.run(CustomerserviceApplication.class, args);
        CustomerService customerService=applicationContext.getBean(CustomerService.class);
        customerService.consume("customer");
    }

}
