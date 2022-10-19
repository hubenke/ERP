package com.gxa.service;

import com.gxa.dto.PurchaseAddDto;

public interface PurchaseGoodsService {

    void add(PurchaseAddDto purchaseAddDto);

    void batchUpdate(PurchaseAddDto purchaseAddDto);
}
