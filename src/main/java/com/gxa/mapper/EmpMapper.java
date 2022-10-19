package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Emp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper{

    List<Emp> queryEmpDto(EmpDto empDto);

    void addEmp(Emp emp);

    void updateEmpByEid(Emp emp);


}
