package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.Drink;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService extends BaseService<Drink>{
    @Autowired
    private DrinkRepository
    drinkRepository;
    @Override
    public BaseRepository<Drink> baseRepository() {
        return drinkRepository;
    }
    public List<Drink> getDrinksByTypeId(int typeId){
        return drinkRepository.getDrinkByDrinkType_Id(typeId);
    }
}
