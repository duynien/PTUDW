package com.example.demorestemplate.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
public class OrdersPending {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameCus;
    private String addressCus;
    private String phoneCus;
    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drink;
}
