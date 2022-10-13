package com.gxa.service;

import com.gxa.entity.MyOrder;

import java.util.List;

public interface MyOrderService {
    List<MyOrder> queryAll();
    void save(MyOrder myOrder);
    MyOrder queryByOrder(Integer orderno);

    void update(MyOrder myOrder);

    void deleteByEmpno(Integer orderno);
}
