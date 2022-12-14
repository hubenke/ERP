package com.gxa.service;

import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;

import java.util.List;

public interface PurchaseService {
    List<PurchaseQueryDto> queryAll(PurchaseDto purchaseDto);

    void add(PurchaseAddDto purchaseAddDto);

    void update(PurchaseAddDto purchaseAddDto);

    void updateStatus(Integer id, Integer btnNum);
}
