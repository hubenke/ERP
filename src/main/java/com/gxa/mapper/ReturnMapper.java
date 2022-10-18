package com.gxa.mapper;

import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;

import java.util.List;

public interface ReturnMapper {
    List<ReturnQueryDto> queryAllReturnBill(ReturnBillDto returnBillDto);

    int count(ReturnBillDto returnBillDto);
}
