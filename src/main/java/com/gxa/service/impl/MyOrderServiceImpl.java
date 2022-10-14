package com.gxa.service.impl;

import com.gxa.entity.MyOrder;
import com.gxa.mapper.MyOrderMapper;
import com.gxa.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyOrderServiceImpl  implements MyOrderService {

    @Autowired
    private MyOrderMapper myOrderMapper;

    @Override
    public List<MyOrder> queryAll()
    {
        List<MyOrder> myOrders = this.myOrderMapper.queryAll();
        return myOrders;
    }

    @Override
    public void add(MyOrder myOrder) {
        this.myOrderMapper.add(myOrder);
    }

    @Override
    public MyOrder queryByOrder(Integer orderno) {
        return null;
    }

    @Override
    public void update(MyOrder myOrder) {

    }

    @Override
    public void deleteByOrdersno(Integer orderno) {

    }
}
