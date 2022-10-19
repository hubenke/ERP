package com.gxa.service.impl;

import com.gxa.dto.AssignDto;
import com.gxa.dto.OutboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Inbound;
import com.gxa.entity.Outbound;
import com.gxa.entity.OutboundGoods;
import com.gxa.mapper.OutboundMapper;
import com.gxa.service.OutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutboundServiceImpl implements OutboundService {
    @Autowired
    private OutboundMapper outboundMapper;

    @Override
    public List<Outbound> queryOutboundDto(OutboundDto outboundDto) {
        List<Outbound> outbounds = this.outboundMapper.queryAllOutboundDto(outboundDto);
        return outbounds;
    }

    @Override
    public void addOutbound(Outbound outbound) {
        this.outboundMapper.addOutbound(outbound);
    }

    @Override
    public void updateOutboundStatus(Outbound outbound) {
        this.outboundMapper.updateOutboundStatus(outbound);
    }

    @Override
    public List<Emp> queryEmp(AssignDto assignDto) {
        List<Emp> emps = this.outboundMapper.queryEmp(assignDto);
        return emps;
    }

    @Override
    public List<OutboundGoods> queryGoods() {
        List<OutboundGoods> outboundDetails = this.outboundMapper.queryGoods();
        return outboundDetails;
    }

    @Override
    public void addOutboundGoods(OutboundGoods outboundDetail) {
        this.outboundMapper.addOutboundGoods(outboundDetail);
    }

    @Override
    public void deleteOutboundGoodsById(Integer id) {
        this.outboundMapper.deleteOutboundGoodsById(id);
    }

    @Override
    public void updateAssignById(Outbound outbound) {
        this.outboundMapper.updateAssignById(outbound);
    }

    @Override
    public void updateRepealById(Integer id) {
        this.outboundMapper.updateRepealById(id);
    }
}
