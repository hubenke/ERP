package com.gxa.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;

import java.util.List;

public interface CompanyMapper  extends BaseMapper<Company> {
//  void  add();//添加操作

//  List<Company> queryAll(CompanyDto companyDto);
//  List<Company> queryByCondition( CompanyDto companyDto);

  List<Company> queryAll();

  int addCompany(Company company);//添加操作

  int updateById(Integer id);//根据id去编辑

  List<Company> queryById(Integer id);//根据id去查询

//  void  queryByCondit








}
