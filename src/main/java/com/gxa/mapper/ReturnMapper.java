package com.gxa.mapper;

import com.gxa.dto.ReturnAddDto;
import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnMapper {
    List<ReturnQueryDto> queryAllReturnBill(ReturnBillDto returnBillDto);

    void insertReturnBill(ReturnAddDto returnAddDto);

    //查询退货方式
    int[] queryReturnType();

    void updateStatus(@Param("id") Integer id, @Param("btnNum") Integer btnNum);
}
