package com.example.customerservice;


import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @PostMapping("/customer")
    public String checkBalance( @RequestBody String amount){
        System.out.println("Here in check balance");
        Customer customer= new Customer();
        customer.setId(1);
        customer.setBalance(200);
        if(customer.getBalance()>Integer.parseInt(amount)) return String.valueOf(true);
        return String.valueOf(false);
    }
}
