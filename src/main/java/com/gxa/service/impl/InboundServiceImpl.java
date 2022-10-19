package com.gxa.service.impl;

import com.gxa.dto.AssignDto;
import com.gxa.dto.InboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Inbound;
import com.gxa.mapper.InboundMapper;
import com.gxa.service.InboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InboundServiceImpl implements InboundService {

    @Autowired
    private InboundMapper inboundMapper;
    @Override
    public List<Inbound> queryInboundDto(InboundDto inboundDto) {
        List<Inbound> inbounds = this.inboundMapper.queryInboundDto(inboundDto);
        return inbounds;
    }

    @Override
    public void updateInboundStatus(Inbound inbound) {
        this.inboundMapper.updateInboundStatus(inbound);
    }

    @Override
    public List<Emp> queryEmp(AssignDto assignDto) {
        List<Emp> emps = this.inboundMapper.queryEmp(assignDto);
        return emps;
    }

    @Override
    public void updateAssignById(Inbound inbound) {
        this.inboundMapper.updateAssignById(inbound);
    }

    @Override
    public void updateRepealById(Integer id) {
        this.inboundMapper.updateRepealById(id);
    }
}
