package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyMapper  {


    List<Apply> queryAll(ApplyDto applyDto);

    List<Emp> queryDept();

    void updateCheck(Apply apply);

    List<Emp> queryEmp(EmpDto empDto);

    void assign(@Param("applyno") Integer applyno, @Param("eid") Integer eid);

    void backout(Integer applyno);
}
