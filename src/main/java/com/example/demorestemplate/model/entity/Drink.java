package com.example.demorestemplate.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink implements Serializable {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;

  private String name;
  private double price;
  private double mass;
  @ManyToOne
  @JoinColumn(name = "drink_type_id")
  private DrinkType drinkType;
  @JsonIgnore
  @OneToMany(mappedBy = "drink")
  private List<OrdersPending> ordersPending;
}
