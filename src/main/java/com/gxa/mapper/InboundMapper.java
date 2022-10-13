package com.gxa.mapper;

import com.gxa.entity.Inbound;

import java.util.List;


public interface InboundMapper {
//    User queryMyuserNameAndPwd1(@Param("userName") String userName,@Param("pwd") String pwd);
      List<Inbound> queryAll();

      void add();  //入库  添加操作

      void queryEmps();   //查询员工 emp表

      void eidSet();  //指派员工 添加

      void eidRepeal(Integer eid);  //撤回指派

}
