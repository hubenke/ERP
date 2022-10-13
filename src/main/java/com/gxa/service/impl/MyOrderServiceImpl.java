package com.gxa.service.impl;

import com.gxa.entity.MyOrder;
import com.gxa.service.MyOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyOrderServiceImpl  implements MyOrderService {
    @Override

    public List<MyOrder> queryAll() {
        return null;
    }

    @Override
    public void save(MyOrder myOrder) {

    }

    @Override
    public MyOrder queryByOrder(Integer orderno) {
        return null;
    }

    @Override
    public void update(MyOrder myOrder) {

    }

    @Override
    public void deleteByEmpno(Integer orderno) {

    }
}
