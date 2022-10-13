package com.gxa.service.impl;

import com.gxa.entity.Outbound;
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
    public List<Outbound> queryOutbound() {
        List<Outbound> outbounds = this.outboundMapper.selectList(null);
        return outbounds;
    }

    @Override
    public void addOutbound(Outbound outbound) {

    }
}
