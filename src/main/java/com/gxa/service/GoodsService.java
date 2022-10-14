package com.gxa.service;


import com.gxa.entity.Goods;

import java.util.List;

/**
 * @author:
 * @ClassName:GoodsService
 * @Package:com.gxa.service.GoodsService
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
public interface GoodsService {
    List<Goods> queryAll(); //查询所有

    void add(Goods goods );;//添加商品

    void  queryGoods();//查询商品表

    void  update(Goods goods);//修改

    void delete(Integer gid);//删除指定商品


}
