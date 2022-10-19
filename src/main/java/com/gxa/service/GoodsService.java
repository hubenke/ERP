package com.gxa.service;


import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;

import java.util.List;


public interface GoodsService {

    List<GoodsQueryDto> queryGoodsList();

    List<GoodsQueryDto> queryAll(GoodsDto goodsDto);

    List<GoodsDetail> selectType();

    void updateShelves(Integer did);

    int addGoods(Goods goods);;//添加商品

    void updateGoodsById(GoodsDetail goodsDetail);


}
