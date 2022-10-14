package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseDto;
import com.gxa.entity.Purchase;

import java.util.List;

public interface PurchaseMapper extends BaseMapper<Purchase> {

    List<Purchase> queryAll( PurchaseDto purchaseDto);
}
