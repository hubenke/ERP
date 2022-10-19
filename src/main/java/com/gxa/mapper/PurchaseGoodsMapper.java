package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.entity.PurchaseGoods;
import org.apache.ibatis.annotations.Param;

public interface PurchaseGoodsMapper extends BaseMapper<PurchaseGoods> {
    void insert(PurchaseAddDto purchaseAddDto);

    void batchUpdate(PurchaseAddDto purchaseAddDto);

    //根据采购单id查询采购单中的商品
    int[] queryGoodsDetailId(int purchaseId);

    //删除采购单商品
    void deleteById(String ids);
}
