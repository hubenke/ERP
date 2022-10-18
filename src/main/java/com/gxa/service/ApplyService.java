package com.gxa.service;

import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;

import java.util.List;

public interface ApplyService {
    List<Apply> queryAll(ApplyDto applyDto);

    List<Emp> queryDeot();

    int updateCheck(Apply apply);

    int addApply(ApplyDto applyDto);

    List<Emp> queryEmp(EmpDto empDto);

    int assign(Integer applyno,Integer eid);

    int backout(Integer applyno);

    List<ApplyDto> queryGoods();

    int addGoods(ApplyDto applyDto);
}
