package com.gxa.service;

import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;

import java.util.List;

public interface PurchaseService {
    List<PurchaseQueryDto> queryAll(PurchaseDto purchaseDto);

    int add(PurchaseAddDto purchaseAddDto);

    int update(PurchaseAddDto purchaseAddDto);
}
