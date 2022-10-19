package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.RegionDto;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Emp;
import com.gxa.entity.GoodsDetail;
import com.gxa.entity.Region;
import com.gxa.entity.Supplier;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SupplierMapper extends BaseMapper<Supplier> {

     List<Supplier> queryAll(SupplierDto supplierDto); //查询管理页面查询

     List<Region> queryRegions(RegionDto regionDto);  //查询省市

     int addSupplier(Supplier supplier);  //添加供应商

     List<GoodsDetail> queryGoods(); //  查询商品


     List<Supplier> queryByID(Integer sid); //编辑页面查询

     int addGoods(@Param("ids") String ids, @Param("sid") Integer sid); //添加供应商关联商品

     int updateSupplier(Supplier supplier); //修改供应商信息

     int updateGoods(@Param("ids") String ids, @Param("sid") Integer sid); //修改供应商关联商品

     List<Emp> queryIntroducer();

}
