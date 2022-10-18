package com.gxa.service;

import com.gxa.dto.PurchaseAddDto;

public interface PurchaseGoodsService {

    int add(PurchaseAddDto purchaseAddDto);

    int batchUpdate(PurchaseAddDto purchaseAddDto);
}
