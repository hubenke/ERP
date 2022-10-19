package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;
import com.gxa.entity.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseMapper extends BaseMapper<Purchase> {

    List<PurchaseQueryDto> queryAll(PurchaseDto purchaseDto);

    int queryIdByNo(String purchaseNo);

    void insert(PurchaseAddDto purchaseAddDto);

    void updateById(PurchaseAddDto purchaseAddDto);

    void updateStatus(@Param("id") Integer id, @Param("btnNum") Integer btnNum);

}
