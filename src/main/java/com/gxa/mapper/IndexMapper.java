package com.gxa.mapper;

import com.gxa.entity.Index;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IndexMapper {

    Integer queryDepositSum();

    Integer queryOutBoundSum();

    Integer queryOrdersMoneySum();

    List<Index> queryOrdersTypeSum();
}
