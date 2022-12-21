package com.example.newvelog.controller;

import com.example.newvelog.domain.Customer;
import com.example.newvelog.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/Customer")
@RestController
public class CustomerController {

    private final CustomerService CustomerService;

    @GetMapping
    public List<Customer> getCustomerList () {
        return CustomerService.getCustomerList();
    }
}