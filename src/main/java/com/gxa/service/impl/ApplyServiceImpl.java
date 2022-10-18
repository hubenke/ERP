package com.gxa.service.impl;

import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;
import com.gxa.mapper.ApplyMapper;
import com.gxa.mapper.SupplierMapper;
import com.gxa.service.ApplyService;
import com.gxa.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Apply> queryAll(ApplyDto applyDto) {
        List<Apply> applies = this.applyMapper.queryAll(applyDto);

        return applies;
    }

    @Override
    public List<Emp> queryDeot() {
        List<Emp> emps = this.applyMapper.queryDept();
        return emps;
    }

    @Override
    public void updateCheck(Apply apply) {
        this.applyMapper.updateCheck(apply);
    }

    @Override
    public void addApply() {

    }

    @Override
    public List<Emp> queryEmp(EmpDto empDto) {
        List<Emp> emps = this.applyMapper.queryEmp(empDto);
        return emps;
    }

}
