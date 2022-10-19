package com.gxa.service;

import com.gxa.dto.RegionDto;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Emp;
import com.gxa.entity.GoodsDetail;
import com.gxa.entity.Region;
import com.gxa.entity.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> queryAll (SupplierDto supplierDto); //查询管理页面查询

    List<Region> querySite(RegionDto regionDto); //查询省市

    int addSuppiler(Supplier supplier);  //添加供应商

    List<GoodsDetail> queryGoogs();//  查询商品


    List<Supplier> queryById(Integer sid); //编辑页面查询

    int updateGoods(String ids, Integer sid);  //修改供应商关联商品

    int addGoods(String ids, Integer sid);  //添加供应商关联商品

    int updateSupplier(Supplier supplier);  //修改供应商信息

    List<Emp> queryIntroducer();
}
