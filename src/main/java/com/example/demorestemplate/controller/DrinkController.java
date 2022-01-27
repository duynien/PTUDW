package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.Drink;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drink")
public class DrinkController extends BaseController<Drink>{
    @Autowired private DrinkService drinkService;
    @Override
    public BaseService<Drink> baseService() {
        return drinkService;
    }
    @GetMapping("/by-type/{typeId}")
    public ResponseEntity<?> getDrinksByTypeId(@PathVariable int typeId){
        return ResponseEntity.ok(drinkService.getDrinksByTypeId(typeId));
    }
}
