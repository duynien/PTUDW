package com.example.demorestemplate.repository;

import com.example.demorestemplate.model.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends BaseRepository<Drink> {
    public List<Drink> getDrinkByDrinkType_Id(int drinkTypeId);
}
