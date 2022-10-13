package com.gxa.service;

import com.gxa.dto.InboundDto;
import com.gxa.entity.Inbound;

import java.util.List;

public interface InBoundService {
    List<Inbound> queryAll(); //查询所以


//    Integer count(InboundDto inboundDto); 查询条数

    void add();  //入库  添加操作


     void queryEmps();   //查询员工 emp表


    void eidSet();  //指派员工 添加



    void eidRepeal(Integer eid);  //撤回指派


}
