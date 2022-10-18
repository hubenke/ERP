package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.MyOrderDto;
import com.gxa.entity.MyOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MyOrderMapper extends BaseMapper<MyOrder> {


    List<MyOrder> queryAll();

    List<MyOrder> queryAllReturn();

    List<MyOrder> queryByCondition(MyOrderDto myOrderDto);

    List<MyOrder> queryReturnByCondition(MyOrderDto myOrderDto);

    void add(MyOrder myOrder);

    void updateStatusByClose(Integer id);

    void updateStatusByOut(Integer id);

    void updateOuts(Integer[] ids);

    void updateStatusByFinish(Integer id);

    void updateFinishes(Integer[] ids);

    void delete(String id);

    void deleteMyOrders(Integer[] ids);

}
