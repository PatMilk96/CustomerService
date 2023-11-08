package com.example.customer_service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    public ArrayList<CustomerDetails> orders = new ArrayList<>();

    public void createCustomer(CustomerDetails customerDetails) {
        orders.add(customerDetails);
    }

    public CustomerDetails findById(int id) {
        for(CustomerDetails order : orders){
            if(order.getCustomerId() == id) {
                return order;
            }
        }
        return null;
}
