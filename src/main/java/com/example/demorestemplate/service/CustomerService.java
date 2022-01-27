package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.Customer;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer> {
  @Autowired private CustomerRepository customerRepository;

  @Override
  public BaseRepository<Customer> baseRepository() {
    return customerRepository;
  }
}
