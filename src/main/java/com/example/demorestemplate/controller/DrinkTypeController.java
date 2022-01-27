package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.DrinkType;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.DrinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drink-type")
public class DrinkTypeController extends BaseController<DrinkType> {
  @Autowired private DrinkTypeService drinkTypeService;

  @Override
  public BaseService<DrinkType> baseService() {
    return drinkTypeService;
  }

  @GetMapping("/is-like/{name}")
  public ResponseEntity<?> getByNameIsLike(@PathVariable String name) {
    return ResponseEntity.ok(drinkTypeService.getByIsLike(name));
  }
}
