package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.MyOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MyOrderMapper extends BaseMapper<MyOrder> {


    List<MyOrder> queryAll();

    void add(MyOrder myOrder);
    void updateStatusByClose(Integer id);
    void updateStatusByOut(Integer id);
    void updateStatusByFinish(Integer id);
    void delete(Integer id);
//    MyOrder queryByOrder(Integer orderno);
//
//    void update(MyOrder myOrder);
//
//    void deleteByEmpno(Integer orderno);
}
