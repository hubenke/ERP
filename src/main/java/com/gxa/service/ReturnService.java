package com.gxa.service;

import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;

import java.util.List;

public interface ReturnService {

    List<ReturnQueryDto> queryAllReturnBill(ReturnBillDto returnBillDto);

    int[] queryReturnType();

    void updateStatus(Integer id,Integer btnNum);
}
