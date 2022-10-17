package com.gxa.service.impl;

import com.gxa.dto.RegionDto;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Emp;
import com.gxa.entity.GoodsDetail;
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
    public List<Supplier> queryAll(SupplierDto supplierDto) {  //查询管理页面查询

        List<Supplier> suppliers = this.supplierMapper.queryAll(supplierDto);

        return suppliers;
    }

    @Override
    public List<Region> querySite(RegionDto regionDto) {  //查询省市

        List<Region> regionList = this.supplierMapper.queryRegions(regionDto);

        return regionList;
    }

    @Override
    public void addSuppiler(Supplier supplier) {  //添加供应商

        this.supplierMapper.addSupplier(supplier);

    }

    @Override
    public List<GoodsDetail> queryGoogs() {  //  查询商品

        List<GoodsDetail> goodsDetails = this.supplierMapper.queryGoods();
        return goodsDetails;
    }

    @Override
    public List<Supplier> queryById(Integer sid) {  //编辑页面查询

        List SupplierList = this.supplierMapper.queryByID(sid);

        return SupplierList;
    }

    @Override
    public void updateGoods(String str, Integer sid) {  //修改供应商关联商品
        this.supplierMapper.updateGoods(str,sid);
    }

    @Override
    public void addGoods(String ids, Integer sid) {  //添加供应商关联商品
        this.supplierMapper.addGoods(ids,sid);
    }

    @Override
    public void updateSupplier(Supplier supplier) {  //修改供应商信息
        this.supplierMapper.updateSupplier(supplier);
    }

    @Override
    public List<Emp> queryIntroducer() {
        List<Emp> emps = this.supplierMapper.queryIntroducer();
        return emps;
    }


}
