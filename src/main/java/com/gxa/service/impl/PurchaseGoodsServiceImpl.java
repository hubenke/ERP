package com.gxa.service.impl;

import com.gxa.dto.PurchaseAddDto;
import com.gxa.entity.PurchaseGoods;
import com.gxa.mapper.PurchaseGoodsMapper;
import com.gxa.mapper.PurchaseMapper;
import com.gxa.service.PurchaseGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PurchaseGoodsServiceImpl implements PurchaseGoodsService {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private PurchaseGoodsMapper purchaseGoodsMapper;

    @Override
    public void add(PurchaseAddDto purchaseAddDto) {
        purchaseMapper.insert(purchaseAddDto);

        //通过采购单编号查询插入第一条语句的自增id
        //int purchaseid = purchaseMapper.queryIdByNo(purchaseAddDto.getPurchase().getPurchaseNo());

        //第一条语句插入成功，第二条语句没有插入成功的话就要回滚
        purchaseGoodsMapper.insert(purchaseAddDto);
    }

    @Override
    public void batchUpdate(PurchaseAddDto purchaseAddDto) {
        //首先查询数据库的采购单中有哪些商品
        int[] ids = purchaseGoodsMapper.queryGoodsDetailId(purchaseAddDto.getPurchase().getId());

        //编辑之后传过来的商品detailId
        int[] goodses = new int[30];
        List<PurchaseGoods> purchaseGoodsList = purchaseAddDto.getPurchaseGoodsList();
        for(int i = 0;i < purchaseGoodsList.size();i++){
            PurchaseGoods purchaseGoods = purchaseGoodsList.get(i);
            Integer goodsDetailId = purchaseGoods.getGoodsDetailId();
            goodses[i] = goodsDetailId;
        }

        //先更新数据,数量一样的话说明没有删除过商品，数量少了的话就删除有差异的商品id
        purchaseGoodsMapper.batchUpdate(purchaseAddDto);
        if (ids.length != goodses.length) {
            //比较id数组的差异
            int m = 10;
            int[] a = new int[30];
            int[] b = new int[30];
        /*HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < goodses.length; i++) {
            int index = goodses[i] / m;
            if (!map.containsKey(index)) {
                map.put(index, new ArrayList<Integer>());
            }
            map.get(index).add(goodses[i]);
        }
        for (int i = 0; i < ids.length; i++) {
            int index = ids[i] / m;
            if (!map.get(index).contains(ids[i])) {
                System.out.println("不包含的数:" + ids[i]);
                a[i] = ids[i];
            }
        }*/

            for (int i = 0; i < ids.length; i++) {
                int result = 0;
                for (int j = 0; j < goodses.length; j++) {
                    if (ids[i] == goodses[j]) {
                        result = 1;
                    }
                }
                if (result == 0) {
                    a[i] = ids[i];//在界面上删除的商品id(不包含的数)
                }
            }
            String s = Arrays.toString(a);

            //删除多余关联的商品
            purchaseGoodsMapper.deleteById(s);
        }
    }
}
