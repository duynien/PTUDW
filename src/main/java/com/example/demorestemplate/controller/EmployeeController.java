package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.Employee;
import com.example.demorestemplate.model.payload.LoginRequest;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController<Employee> {
  @Autowired private EmployeeService employeeService;

  @Override
  public BaseService<Employee> baseService() {
    return employeeService;
  }
  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    return ResponseEntity.ok(
        employeeService.loginByEmployee(loginRequest.getEmail(), loginRequest.getPassword()));
  }
  @GetMapping("/max-id")
  public ResponseEntity<?> getMaxId(){
    return ResponseEntity.ok(employeeService.getMaxId());
  }
  @GetMapping("/exist-email/{email}")
  public ResponseEntity<?> existByEmail(@PathVariable String email){
    return ResponseEntity.ok(employeeService.existByEmail(email));
  }
  @DeleteMapping("/logout")
  public void logout(){
    employeeService.logout();
  }
  @GetMapping("/active")
  public ResponseEntity<?> getByStatus(){
    return ResponseEntity.ok(employeeService.getByStatus());
  }
}
