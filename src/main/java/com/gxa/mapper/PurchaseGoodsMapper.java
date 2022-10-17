package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.entity.PurchaseGoods;
import org.apache.ibatis.annotations.Param;

public interface PurchaseGoodsMapper extends BaseMapper<PurchaseGoods> {
    int insert(@Param("purchaseAddDto") PurchaseAddDto purchaseAddDto, @Param("purchaseid") int purchaseId);

    int updateByPurchaseId(PurchaseAddDto purchaseAddDto);

    //根据采购单id查询采购单中的商品
    int[] queryGoodsId(int purchaseId);

    //删除采购单商品
    int deleteById(String ids);
}
