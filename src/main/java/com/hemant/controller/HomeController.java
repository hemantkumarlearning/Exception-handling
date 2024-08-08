package com.hemant.controller;

import com.hemant.exception.CustomerNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class HomeController {

    @GetMapping("/{customerId}")
    public String getCustomer(@PathVariable int customerId) {
        if (customerId>100) {
            return "Hemant Customer";
        } else {
           throw new CustomerNotFoundException("Invalid customer id");
        }

    }
}
