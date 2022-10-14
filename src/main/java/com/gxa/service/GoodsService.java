package com.gxa.service;


import com.gxa.entity.Goods;

import java.util.List;


public interface GoodsService {
    List<Goods> queryGoods(); //查询所有

    void add(Goods goods );;//添加商品

//    void  queryGoods();//查询商品表

    void  update(Goods goods);//修改

    void delete(Integer gid);//删除指定商品


}
