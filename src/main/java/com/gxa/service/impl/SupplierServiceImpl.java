package com.gxa.service.impl;

import com.gxa.entity.Region;
import com.gxa.entity.Supplier;
import com.gxa.mapper.SupplierMapper;
import com.gxa.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public List<Supplier> queryAll() {

//        List<Supplier> suppliers = this.supplierMapper.queryAll();

        return null;
    }

    @Override
    public List<Region> querySite() {

        List<Region> regionList = this.supplierMapper.queryRegions();

        return regionList;
    }


}
