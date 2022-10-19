package com.gxa.mapper;


import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;

import java.util.List;

public interface GoodsMapper {

//    List<Goods> queryGoods();
//
//    List<Goods> queryAllByGoodsDto(GoodsDto goodsDto);
    List<GoodsQueryDto> queryGoodsList();

    List<GoodsQueryDto> queryAll(GoodsDto goodsDto);

    List<GoodsDetail> selectType();

    void updateShelves(Integer did);

    int addGoods(Goods goods);
}
