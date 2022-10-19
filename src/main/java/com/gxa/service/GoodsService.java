package com.gxa.service;


import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;

import java.util.List;


public interface GoodsService {
//    List<Goods> queryGoods(); //查询所有
//
//    List<Goods> queryAllByGoodsDto(GoodsDto goodsDto);
    List<GoodsQueryDto> queryGoodsList();

    List<GoodsQueryDto> queryAll(GoodsDto goodsDto);

    List<GoodsDetail> selectType();

    void updateShelves(Integer did);

    int addGoods(Goods goods );;//添加商品

//    void  queryGoods();//查询商品表

    void  update(Goods goods);//修改

    void delete(Integer gid);//删除指定商品


}
