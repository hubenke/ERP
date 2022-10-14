package com.gxa.service;

import com.gxa.entity.Region;
import com.gxa.entity.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> queryAll ();

    List<Region> querySite(); //查询省市

}
