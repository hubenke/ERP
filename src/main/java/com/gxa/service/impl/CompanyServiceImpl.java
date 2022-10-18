package com.gxa.service.impl;


import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;
import com.gxa.mapper.CompanyMapper;
import com.gxa.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl  implements CompanyService {

    @Autowired

    private CompanyMapper companyMapper;

//    @Override
//    public List<Company> queryAll() {
//        List<Company> companies = this.companyMapper.queryAll();
//        return  companies;
//    }

    @Override
    public List<Company> queryAll(CompanyDto companyDto) {
        List<Company> companies =this.companyMapper.queryAll();
        return companies;
    }

    @Override
    public Integer add(Company company) {

        int add = companyMapper.add(company);
        return add;


    }

    @Override
    public Integer updateById(Integer id) {
        int updateById = companyMapper.updateById(id);
        return updateById;


    }

    @Override
    public List<Company> querById(Integer id) {
         List<Company> companies=this.companyMapper.queryById(id);
        return companies;


    }
}
