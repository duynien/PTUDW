package com.example.demorestemplate.controller;

import com.example.demorestemplate.model.entity.DetailSalary;
import com.example.demorestemplate.service.BaseService;
import com.example.demorestemplate.service.DetailSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detail-salary")
public class DetailSalaryController extends BaseController<DetailSalary>{
    @Autowired private DetailSalaryService detailSalaryService;
    @Override
    public BaseService<DetailSalary> baseService() {
        return detailSalaryService;
    }

    @GetMapping("/is-like/{name}")
    public ResponseEntity<?> getDetailSalaryByEmpNameLike(@PathVariable String name){
        return ResponseEntity.ok(detailSalaryService.getDetailSalaryByEmpNameLike(name));
    }
}
