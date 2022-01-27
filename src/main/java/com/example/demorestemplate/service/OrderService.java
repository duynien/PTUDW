package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.Order;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService extends BaseService<Order> {
  @Autowired private OrderRepository orderRepository;

  @Override
  public BaseRepository<Order> baseRepository() {
    return orderRepository;
  }
  public List<Order> getOrderByStatus(String status){
    return orderRepository.getAllByStatus(status);
  }
}
