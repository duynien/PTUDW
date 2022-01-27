package com.example.demorestemplate.repository;

import com.example.demorestemplate.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends BaseRepository<Order> {
    List<Order> getAllByStatus(String status);
}
