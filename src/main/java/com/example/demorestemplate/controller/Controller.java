package com.example.demorestemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id){

        return ResponseEntity.ok("");
    }
}
