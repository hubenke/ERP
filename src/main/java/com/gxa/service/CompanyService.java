package com.gxa.service;


import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;

import java.awt.*;
import java.util.List;

public interface CompanyService {
    List<Company> queryAll(); //查询所有

//    List<Company> queryAllCompanyDto (CompanyDto companyDto);

    void add(Company company); //添加操作

    void  update();// 进行修改

    void querById(Integer id);//根据id查询


}
