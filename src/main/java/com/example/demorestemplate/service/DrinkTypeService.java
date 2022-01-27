package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.DrinkType;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.DrinkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkTypeService extends BaseService<DrinkType>{
    @Autowired
    private DrinkTypeRepository drinkTypeRepository;
    @Override
    public BaseRepository<DrinkType> baseRepository() {
        return drinkTypeRepository;
    }

    public DrinkType getByIsLike(String name){
        return drinkTypeRepository.getDrinkTypeByNameContains(name);
    }
}
