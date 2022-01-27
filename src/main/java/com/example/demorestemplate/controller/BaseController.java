package com.example.demorestemplate.controller;

import com.example.demorestemplate.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseController<T> {
  public abstract BaseService<T> baseService();

  @GetMapping("/by-id/{id}")
  public ResponseEntity<?> getById(@PathVariable int id) {
    return ResponseEntity.ok(baseService().getById(id));
  }

  @GetMapping("/all")
  public ResponseEntity<?> getAll() {
    return ResponseEntity.ok(baseService().getAll());
  }

  @PostMapping("/create")
  public ResponseEntity<?> create(@RequestBody T entity) {
    T response = baseService().create(entity);
    return ResponseEntity.ok(response);
  }

  @PutMapping("/update")
  public ResponseEntity<?> update(@RequestBody T entity) {
    T response = baseService().update(entity);
    return ResponseEntity.ok(response);
  }

  @DeleteMapping("/delete/{id}")
  public void delete(@PathVariable int id) {
    baseService().delete(id);
  }
}
