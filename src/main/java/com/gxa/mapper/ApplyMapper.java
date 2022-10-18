package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;

import java.util.List;

public interface ApplyMapper  {


    List<Apply> queryAll(ApplyDto applyDto);

    List<Emp> queryDept();

    void updateCheck(Apply apply);

    List<Emp> queryEmp(EmpDto empDto);
}
