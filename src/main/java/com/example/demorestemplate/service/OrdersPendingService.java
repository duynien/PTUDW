package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.OrdersPending;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.OrdersPendingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersPendingService extends BaseService<OrdersPending> {
  @Autowired OrdersPendingRepository ordersPendingRepository;

  @Override
  public BaseRepository<OrdersPending> baseRepository() {
    return ordersPendingRepository;
  }
}
