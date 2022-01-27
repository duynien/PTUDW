package com.example.demorestemplate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailSalary implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int month;
  private int year;
  private double price;

  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
