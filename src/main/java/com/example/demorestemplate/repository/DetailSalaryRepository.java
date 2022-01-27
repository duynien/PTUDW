package com.example.demorestemplate.repository;

import com.example.demorestemplate.model.entity.DetailSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailSalaryRepository extends BaseRepository<DetailSalary> {
    List<DetailSalary> getDetailSalaryByEmployee_EmpNameContains(String name);
}
