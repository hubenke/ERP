package com.gxa.service.impl;

import com.gxa.entity.Index;
import com.gxa.mapper.IndexMapper;
import com.gxa.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public Integer queryDepositSum() {
        Integer integer = this.indexMapper.queryDepositSum();
        return integer;
    }

    @Override
    public Integer queryOutBoundSum() {
        Integer integer = this.indexMapper.queryOutBoundSum();
        return integer;
    }

    @Override
    public Integer queryOrdersMoneySum() {
        Integer OrdersSumList = this.indexMapper.queryOrdersMoneySum();
        return OrdersSumList;
    }

    @Override
    public List<Index> queryOrdersTypeSum() {
        List<Index> indices = this.indexMapper.queryOrdersTypeSum();
        return indices;
    }
}
