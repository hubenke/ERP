package com.gxa.service.impl;

import com.gxa.dto.MyOrderDto;
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
    public List<MyOrder> queryByCondition(MyOrderDto myOrderDto) {
        List<MyOrder> queryByConditionMyOrders = this.myOrderMapper.queryByCondition(myOrderDto);
        return queryByConditionMyOrders;
    }

    @Override
    public void add(MyOrder myOrder) {
        this.myOrderMapper.add(myOrder);
    }

    @Override
    public void updateStatusByOut(Integer id) {
        this.myOrderMapper.updateStatusByOut(id);
    }

    @Override
    public void updateStatusByClose(Integer id) {
        this.myOrderMapper.updateStatusByClose(id);
    }

    @Override
    public void updateStatusByFinish(Integer id) {
        this.myOrderMapper.updateStatusByFinish(id);
    }

    @Override
    public void delete(Integer id) {
        this.myOrderMapper.delete(id);
    }


}
