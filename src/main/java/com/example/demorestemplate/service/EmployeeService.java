package com.example.demorestemplate.service;

import com.example.demorestemplate.exception.NotFoundException;
import com.example.demorestemplate.model.entity.Employee;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService extends BaseService<Employee> {
  @Autowired private EmployeeRepository employeeRepository;

  @Override
  public BaseRepository<Employee> baseRepository() {
    return employeeRepository;
  }

  public Employee loginByEmployee(String email, String password) {
    Employee employee = employeeRepository.findByEmailAndPassword(email, password);
    employeeRepository.updateStatus("active",employee.getId());
    if (employee == null) {
      throw new NotFoundException("Not Found");
    }
    return employee;
  }
  public Employee getByStatus() {
    Employee employee = employeeRepository.getEmployeeByByStatus();
    if (employee == null) {
      throw new NotFoundException("Not Found");
    }
    return employee;
  }
  public int getMaxId(){
    return employeeRepository.getMaxId();
  }
  public boolean existByEmail(String email){
    return employeeRepository.existsByEmail(email);
  }
  public void logout(){
    employeeRepository.logout();
  }
}
