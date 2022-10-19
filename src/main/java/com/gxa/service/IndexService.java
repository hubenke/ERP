package com.gxa.service;

import com.gxa.entity.Index;

import java.util.Date;
import java.util.List;

public interface IndexService {
    Integer queryDepositSum();

    Integer queryOutBoundSum();

    Integer queryOrdersMoneySum();

    List<Index> queryOrdersTypeSum();
}
