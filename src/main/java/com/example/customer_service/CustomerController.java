package com.example.customer_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/AddCustomer")
    public String addCustomer(@RequestBody CustomerDetails customerDetails){
        customerService.createCustomer(customerDetails);
        return("Customer Added!");
    }

    @GetMapping("/getById")
    public CustomerDetails getById(@RequestParam int customerId){
        return customerService.findById(customerId);
    }
}
