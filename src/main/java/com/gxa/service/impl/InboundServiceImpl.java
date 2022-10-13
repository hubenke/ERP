package com.gxa.service.impl;

import com.github.pagehelper.PageHelper;
import com.gxa.entity.Inbound;
import com.gxa.mapper.InboundMapper;
import com.gxa.service.InBoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InboundServiceImpl implements InBoundService {

    @Autowired
    private InboundMapper inBoundMapper;

    @Override
    public List<Inbound> queryAll() {

        List<Inbound> inbounds = this.inBoundMapper.queryAll();
        return inbounds;
    }

    @Override
    public void add() {  //入库  添加操作

    }

    @Override
    public void queryEmps() {  //查询员工 emp表

    }

    @Override
    public void eidSet() {  //指派员工 添加

    }

    @Override
    public void eidRepeal(Integer eid) {  //撤回指派

    }
}
