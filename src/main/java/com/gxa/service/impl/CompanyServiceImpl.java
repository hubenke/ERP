package com.gxa.service.impl;


import com.gxa.entity.Company;
import com.gxa.mapper.CompanyMapper;
import com.gxa.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class CompanyServiceImpl  implements CompanyService {

    @Autowired

    private CompanyMapper companyMapper;

    @Override
    public List<Company> queryAll() {
        List<Company> companies = this.companyMapper.queryAll();
        return  companies;
    }

    @Override
    public void add(Company company) {
        this.companyMapper.add(company);
    }

    @Override
    public void update() {

    }

    @Override
    public void querById(Integer id) {

    }
}
