package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.Supplier;

import java.util.List;

public interface SupplierMapper extends BaseMapper<Supplier> {

     List<Supplier> queryAll();


}
