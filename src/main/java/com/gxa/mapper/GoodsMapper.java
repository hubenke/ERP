package com.gxa.mapper;


import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.dto.GoodsTypeConditionDto;
import com.gxa.dto.GoodsTypeQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;

import java.util.List;

public interface GoodsMapper {

    //查询所有商品详情
    List<GoodsQueryDto> queryGoodsList();

    //根据条件和分页查询满足条件的商品详情
    List<GoodsQueryDto> queryAll(GoodsDto goodsDto);

    //查询所有分类
    List<GoodsDetail> selectType();

    //根据id下架商品
    void updateShelves(Integer did);

    //添加商品
    int addGoods(Goods goods);

    //编辑商品
    void updateGoodsById(GoodsDetail goodsDetail);

    //根据条件查询商品属性
    List<GoodsTypeQueryDto> queryGoodsAttribute(GoodsTypeConditionDto goodsTypeConditionDto);


    //根据商品id修改商品属性
    void updateGoodsAttribute(GoodsTypeQueryDto goodsTypeQueryDto);
}
