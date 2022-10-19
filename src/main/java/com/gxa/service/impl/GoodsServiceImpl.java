package com.gxa.service.impl;

import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;
import com.gxa.mapper.GoodsDetailMapper;
import com.gxa.mapper.GoodsMapper;
import com.gxa.mapper.StockMapper;
import com.gxa.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class GoodsServiceImpl  implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsDetailMapper goodsDetailMapper;
    @Autowired
    private StockMapper stockMapper;


    @Override
    public List<GoodsQueryDto> queryGoodsList() {
        List<GoodsQueryDto> goodsList = this.goodsMapper.queryGoodsList();
        return goodsList;
    }

    @Override
    public List<GoodsQueryDto> queryAll(GoodsDto goodsDto) {
        List<GoodsQueryDto> goodsList = this.goodsMapper.queryAll(goodsDto);
        return goodsList;
    }

    @Override
    public List<GoodsDetail> selectType() {
        List<GoodsDetail> goodsDetailList = this.goodsMapper.selectType();
        return goodsDetailList;
    }

    @Override
    public void updateShelves(Integer did){
       this.goodsMapper.updateShelves(did);
    }

    @Override
    public int addGoods(Goods goods) { //添加
        int i = this.goodsMapper.addGoods(goods);
        if(i != 0){
            int j = this.goodsDetailMapper.addGoodsDetail(goods);
            if( j != 0){
                int k = this.stockMapper.addStock(goods);
                if(k != 0){
                    return k;
                }else {
                    return 0;
                }
            }else {
                return 0;
            }
        }else {
            return 0;
        }

    }

    @Override
    public void updateGoodsById(GoodsDetail goodsDetail) {
        this.goodsMapper.updateGoodsById(goodsDetail);
    }


}
