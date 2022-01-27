package com.example.demorestemplate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String empName;
  private String address;
  private String phone;
  @Column(updatable = false)
  private LocalDateTime startJob;
  private String sex;
  private String email;
  private String password;
  @Column(updatable = false)
  private String role;
  private String status;

  @JsonIgnore
  @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
  private List<DetailSalary> detailSalaries;

  @JsonIgnore
  @OneToMany(mappedBy = "employee", cascade = CascadeType.MERGE)
  private List<Order> order;
}
