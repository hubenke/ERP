package com.gxa.service;

import com.gxa.entity.MyOrder;

import java.util.List;

public interface MyOrderService {
    List<MyOrder> queryAll();
    void add(MyOrder myOrder);
    MyOrder queryByOrder(Integer orderno);

    void update(MyOrder myOrder);

    void deleteByOrdersno(Integer orderno);
}
