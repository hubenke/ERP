package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;
import com.gxa.entity.Purchase;

import java.util.List;

public interface PurchaseMapper extends BaseMapper<Purchase> {

    List<PurchaseQueryDto> queryAll(PurchaseDto purchaseDto);

    int count(PurchaseDto purchaseDto);

    int queryIdByNo(String purchaseNo);

    int insert(PurchaseAddDto purchaseAddDto);

    int updateById(PurchaseAddDto purchaseAddDto);

}
