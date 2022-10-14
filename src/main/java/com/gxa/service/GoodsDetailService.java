package com.gxa.service;

/**
 * @author:
 * @ClassName:DetailsService
 * @Package:com.gxa.service.DetailsService
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
public interface GoodsDetailService {
    GoodsDetailService queryById(Integer did);//根据id查询

    void  add(GoodsDetailService goodsDetail);//添加商品
}
