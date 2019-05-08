package com.example.customerservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customerBalance/amount/{amount}")
    public boolean checkBalance( @PathVariable("amount") Double amount){
        System.out.println("Here in check balance");
        Customer customer= new Customer();
        customer.setId(1);
        customer.setBalance(200);
        if(customer.getBalance()>amount) return true;
        return false;
    }
}
