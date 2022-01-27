package com.example.demorestemplate.service;

import com.example.demorestemplate.model.entity.DetailSalary;
import com.example.demorestemplate.repository.BaseRepository;
import com.example.demorestemplate.repository.DetailSalaryRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailSalaryService extends BaseService<DetailSalary>{
    @Autowired
    private DetailSalaryRepository detailSalaryRepository;
    @Override
    public BaseRepository<DetailSalary> baseRepository() {
        return detailSalaryRepository;
    }

    public List<DetailSalary> getDetailSalaryByEmpNameLike(String name){
        return detailSalaryRepository.getDetailSalaryByEmployee_EmpNameContains(name);
    }
}
