package com.example.demorestemplate.repository;

import com.example.demorestemplate.model.entity.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkTypeRepository extends BaseRepository<DrinkType> {
    DrinkType getDrinkTypeByNameContains(String name);
}
