package com.gxa.service.impl;

import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;
import com.gxa.mapper.ReturnMapper;
import com.gxa.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;

    @Override
    public List<ReturnQueryDto> queryAllReturnBill(ReturnBillDto returnBillDto) {
        List<ReturnQueryDto> returnList = returnMapper.queryAllReturnBill(returnBillDto);
        return returnList;
    }

    @Override
    public int[] queryReturnType() {
        int[] types = returnMapper.queryReturnType();
        return types;
    }

    @Transactional
    @Override
    public void updateStatus(Integer id, Integer btnNum) {
        returnMapper.updateStatus(id,btnNum);
    }

}
