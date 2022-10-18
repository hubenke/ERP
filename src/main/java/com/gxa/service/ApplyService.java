package com.gxa.service;

import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;

import java.util.List;

public interface ApplyService {
    List<Apply> queryAll(ApplyDto applyDto);

    List<Emp> queryDeot();

    void updateCheck(Apply apply);

    void addApply();

    List<Emp> queryEmp(EmpDto empDto);
}
