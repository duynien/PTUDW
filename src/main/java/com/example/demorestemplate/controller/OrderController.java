package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.Order;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<Order> {
  @Autowired private OrderService orderService;

  @Override
  public BaseService<Order> baseService() {
    return orderService;
  }

  @GetMapping("by-status/{status}")
  public ResponseEntity<?> getOrderByStatus(@PathVariable String status) {
    return ResponseEntity.ok(orderService.getOrderByStatus(status));
  }
}
