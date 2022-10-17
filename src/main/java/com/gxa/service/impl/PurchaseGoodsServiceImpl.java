package com.gxa.service.impl;

import com.gxa.dto.PurchaseAddDto;
import com.gxa.mapper.PurchaseGoodsMapper;
import com.gxa.mapper.PurchaseMapper;
import com.gxa.service.PurchaseGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
@Transactional
public class PurchaseGoodsServiceImpl implements PurchaseGoodsService {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private PurchaseGoodsMapper purchaseGoodsMapper;

    @Override
    public int add(PurchaseAddDto purchaseAddDto) {
        int i = purchaseMapper.insert(purchaseAddDto);
        //i:插入语句影响的行数
        if (i != 0) {
            //通过采购单编号查询插入第一条语句的自增id
            int purchaseid = purchaseMapper.queryIdByNo(purchaseAddDto.getPurchaseNo());

            //第一条语句插入成功，第二条语句没有插入成功的话就要回滚
            int j = purchaseGoodsMapper.insert(purchaseAddDto,purchaseid);
            if (j != 0) {
                return 1;
            } else {
                //强制手动事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return 0;
            }
        }else{
            //强制手动事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return 0;
        }
    }

}
