package com.gxa.service.impl;

import com.gxa.dto.EmpDto;
import com.gxa.entity.Emp;
import com.gxa.mapper.EmpMapper;
import com.gxa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {


    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> queryEmpDto(EmpDto empDto) {
        List<Emp> emps = this.empMapper.queryEmpDto(empDto);
        return emps;
    }

    @Override
    public void addEmp(Emp emp) {
       this.empMapper.addEmp(emp);
    }

    @Override
    public void updateEmpByEid(Emp emp) {
        this.empMapper.updateEmpByEid(emp);
    }

}
