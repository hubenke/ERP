package com.gxa.service;

import com.gxa.dto.MyOrderDto;
import com.gxa.entity.MyOrder;

import java.util.List;

public interface MyOrderService {
    List<MyOrder> queryAll();

    List<MyOrder> queryByCondition(MyOrderDto myOrderDto);

    List<MyOrder> queryAllReturn();

    List<MyOrder> queryReturnByCondition(MyOrderDto myOrderDto);

    void add(MyOrder myOrder);

    void updateStatusByOut(Integer id);

    void updateOuts(Integer[] ids);

    void updateStatusByClose(Integer id);

    void updateStatusByFinish(Integer id);

    void updateFinishes(Integer[] ids);

    void delete(String id);

    void deleteMyOrders(Integer[] ids);

}
