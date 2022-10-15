package com.gxa.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;

import java.util.List;

public interface CompanyMapper  extends BaseMapper<Company> {
  void  add();//添加操作

  List<Company> queryAll(CompanyDto companyDto);


}
