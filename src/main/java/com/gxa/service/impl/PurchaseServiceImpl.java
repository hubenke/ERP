package com.gxa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;
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
    public List<PurchaseQueryDto> queryAll(PurchaseDto purchaseDto) {
        List<PurchaseQueryDto> purchases = this.purchaseMapper.queryAll(purchaseDto);

//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.ge("id",10);
//        queryWrapper.ge(StringUtils.hasText(),id,10)
//        this.purchaseMapper.selectList(queryWrapper);
        return purchases;
    }

    @Override
    public void add(PurchaseAddDto purchaseAddDto) {
        //purchaseMapper.insertPurchase(purchaseAddDto.getPurchase());
    }

    @Override
    public void update(PurchaseAddDto purchaseAddDto) {
        //this.purchaseMapper.updateById(purchase);
    }

    @Override
    public void updateStatus(Integer id, Integer btnNum) {
        purchaseMapper.updateStatus(id, btnNum);
    }
}
