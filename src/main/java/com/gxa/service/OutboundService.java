package com.gxa.service;

import com.gxa.dto.AssignDto;
import com.gxa.dto.OutboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Outbound;
import com.gxa.entity.OutboundGoods;

import java.util.List;

public interface OutboundService {

    List<Outbound> queryOutboundDto(OutboundDto outboundDto);

    void addOutbound(Outbound outbound);

    void updateOutboundStatus(Outbound outbound);

    List<Emp> queryEmp(AssignDto assignDto);

    void updateAssignById(Outbound outbound);

    void updateRepealById(Integer id);

    List<OutboundGoods> queryGoods();

    void addOutboundGoods(OutboundGoods outboundDetail);

    void deleteOutboundGoodsById(Integer id);
}
