package com.gxa.service;

import com.gxa.dto.AssignDto;
import com.gxa.dto.InboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Inbound;

import java.util.List;

public interface InboundService {
    List<Inbound> queryInboundDto(InboundDto inboundDto);

    void updateInboundStatus(Inbound inbound);

    List<Emp> queryEmp(AssignDto assignDto);

    void updateAssignById(Inbound inbound);

    void updateRepealById(Integer id);


}
