package com.gxa.service;

import com.gxa.dto.PurchaseDto;
import com.gxa.entity.Purchase;

import java.util.List;

public interface PurchaseService {
    List<Purchase> queryAll(PurchaseDto purchaseDto);
}
