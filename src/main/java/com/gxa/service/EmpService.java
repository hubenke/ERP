package com.gxa.service;

import com.gxa.dto.EmpDto;
import com.gxa.entity.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


import java.util.List;


public interface EmpService {
    List<Emp> queryEmpDto(EmpDto empDto);

    void addEmp(Emp emp);

    void updateEmpByEid(Emp emp);

}
