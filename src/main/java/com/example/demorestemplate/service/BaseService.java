package com.example.demorestemplate.service;

import com.example.demorestemplate.repository.BaseRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class BaseService<T> {
  public abstract BaseRepository<T> baseRepository();
  @Transactional
  public T getById(int id) {
    return baseRepository().findById(id).get();
  }
  @Transactional
  public List<T> getAll(){
      return baseRepository().findAll();
  }
  @Transactional
  public T create(T entity){
    T response = baseRepository().save(entity);
    return response;
  }
  @Transactional
  public T update(T entity){
    T response = baseRepository().save(entity);
    return response;
  }
  @Transactional
  @Modifying
  public void delete(int id){
    baseRepository().deleteById(id);
  }
}
