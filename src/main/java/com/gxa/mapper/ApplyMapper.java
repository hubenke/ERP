package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.ApplyAddDto;
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

    List<ApplyDto> queryGoogs(ApplyAddDto applyAddDto); //查询商品

    Integer  queryApplyId(ApplyAddDto applyAddDto); //查询请购单id

    int addapply(ApplyAddDto applyAddDto); //添加请购单基础数据


    int addGoods(ApplyAddDto applyAddDto,Integer applyId);  //添加请购单商品

    int deleteApply(ApplyAddDto applyAddDto);  //删除apply

    int deleteApplyGoods(ApplyAddDto applyAddDto);
}
