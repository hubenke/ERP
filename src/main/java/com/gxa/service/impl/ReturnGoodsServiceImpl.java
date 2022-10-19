package com.gxa.service.impl;

import com.gxa.dto.ReturnAddDto;
import com.gxa.mapper.ReturnGoodsMapper;
import com.gxa.mapper.ReturnMapper;
import com.gxa.service.ReturnGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReturnGoodsServiceImpl implements ReturnGoodsService {

    @Autowired
    private ReturnMapper returnMapper;

    @Autowired
    private ReturnGoodsMapper returnGoodsMapper;

    @Transactional
    @Override
    public void addReturn(ReturnAddDto returnAddDto) {
        returnMapper.insertReturnBill(returnAddDto);

        returnGoodsMapper.insertReturnGoods(returnAddDto);
    }
}
