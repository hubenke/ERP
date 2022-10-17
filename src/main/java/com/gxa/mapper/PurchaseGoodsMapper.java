package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.entity.PurchaseGoods;
import org.apache.ibatis.annotations.Param;

public interface PurchaseGoodsMapper extends BaseMapper<PurchaseGoods> {
    int insert(@Param("purchaseAddDto") PurchaseAddDto purchaseAddDto, @Param("purchaseid") int purchaseId);
}
