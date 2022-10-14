package com.gxa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.dto.PurchaseDto;
import com.gxa.entity.Purchase;
import com.gxa.mapper.PurchaseMapper;
import com.gxa.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<Purchase> queryAll(PurchaseDto purchaseDto) {
        List<Purchase> purchases = this.purchaseMapper.queryAll(purchaseDto);

//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.ge("id",10);
//        queryWrapper.ge(StringUtils.hasText(),id,10)
//        this.purchaseMapper.selectList(queryWrapper);
        return purchases;
    }

    @Override
    public int add(Purchase purchase) {
        QueryWrapper queryWrapper = new QueryWrapper();
        int i = this.purchaseMapper.insert(purchase);
        return i;
    }

    @Override
    public int update(Purchase purchase) {
        QueryWrapper queryWrapper = new QueryWrapper();
        int i = this.purchaseMapper.updateById(purchase);
        return i;
    }
}
