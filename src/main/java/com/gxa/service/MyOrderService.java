package com.gxa.service;

import com.gxa.entity.MyOrder;

import java.util.List;

public interface MyOrderService {
    List<MyOrder> queryAll();
    void add(MyOrder myOrder);
    void updateStatusByOut(Integer id);
    void updateStatusByClose(Integer id);
    void updateStatusByFinish(Integer id);
    void delete(Integer id);
//    MyOrder queryByOrder(Integer orderno);
//
//    void update(MyOrder myOrder);
//
//    void deleteByOrdersno(Integer orderno);
}
