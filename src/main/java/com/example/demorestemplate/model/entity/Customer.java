package com.example.demorestemplate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String address;
  private String phone;
  @JsonIgnore
  @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  private List<Order> orders;
}
