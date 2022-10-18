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

    int updateCheck(Apply apply);

    List<Emp> queryEmp(EmpDto empDto);

    int assign(@Param("applyno") Integer applyno, @Param("eid") Integer eid);

    int backout(Integer applyno);

    List<ApplyDto> queryGoogs(); //查询商品

    Integer  queryApplyId(ApplyDto applyDto); //查询请购单id

    int addapply(ApplyDto applyDto); //添加请购单基础数据


    int addGoods(ApplyDto applyDto,Integer applyId);  //添加请购单商品
}
