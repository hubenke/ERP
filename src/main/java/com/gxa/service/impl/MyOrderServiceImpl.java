package com.gxa.service.impl;

import com.gxa.dto.MyOrderDto;
import com.gxa.entity.MyOrder;
import com.gxa.mapper.MyOrderMapper;
import com.gxa.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List<MyOrder> queryAllReturn() {
        List<MyOrder> myOrdersReturn = this.myOrderMapper.queryAllReturn();
        return myOrdersReturn;
    }

    @Override
    public List<MyOrder> queryReturnByCondition(MyOrderDto myOrderDto) {
        List<MyOrder> queryReturnByConditionMyOrders = this.myOrderMapper.queryReturnByCondition(myOrderDto);
        return queryReturnByConditionMyOrders;
    }

    @Override
    public void add(MyOrder myOrder) {
        Date dt=new Date();
        String year=String.format("%tY", dt);
        String mon=String .format("%tm", dt);
        String day=String .format("%td", dt);
        String h=String .format("%tH", dt);
        String m=String .format("%tM", dt);
        String s=String .format("%tS", dt);
        String orderno ="XSDD"+year+mon+day+h+m+s;
        System.out.println("newOrderno-----------"+orderno);
        myOrder.setOrderno(orderno);
        this.myOrderMapper.add(myOrder);
    }

    @Override
    public void updateStatusByOut(Integer id) {
        this.myOrderMapper.updateStatusByOut(id);
    }

    @Override
    public void updateOuts(Integer[] ids) {
        this.myOrderMapper.updateOuts(ids);
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
    public void updateFinishes(Integer[] ids) {
        this.myOrderMapper.updateFinishes(ids);
    }

    @Override
    public void delete(Integer id) {
        this.myOrderMapper.delete(id);
    }

    @Override
    public void deleteMyOrders(Integer[] ids) {
        this.myOrderMapper.deleteMyOrders(ids);
    }


}
