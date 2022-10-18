package com.gxa.mapper;

import java.util.Date;
import java.util.List;

public interface IndexMapper {

    Integer queryDepositSum();

    Integer queryOutBoundSum();

    List<Integer> queryOrdersSum(Date date);
}
