package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.OrdersPending;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.OrdersPendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pending")
public class OrdersPendingController extends BaseController<OrdersPending>{
    @Autowired
    private OrdersPendingService ordersPendingService;
    @Override
    public BaseService<OrdersPending> baseService() {
        return ordersPendingService;
    }
}
