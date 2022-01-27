package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.Customer;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController extends BaseController<Customer>{
    @Autowired
    private CustomerService customerService;
    @Override
    public BaseService<Customer> baseService() {
        return customerService;
    }
}
