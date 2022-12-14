package com.gxa.service;


import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;

import java.awt.*;
import java.util.List;

public interface CompanyService {
   // List<Company> queryAll(CompanyDto companyDto); 查询所有
    List<Company> queryAll();

//    List<Company> queryAllCompanyDto (CompanyDto companyDto);

    void add(Company company); //添加操作

    void updateById(Integer id);// 进行修改

    List<Company> querById(Integer id);//根据id查询

    List<Company> queryByCondition(CompanyDto companyDto);//条件查询

}
