package com.gxa.mapper;

import com.gxa.dto.AssignDto;
import com.gxa.dto.InboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Inbound;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface InboundMapper {
      List<Inbound> queryInboundDto(InboundDto inboundDto);

      void updateInboundStatus(Inbound inbound);

      List<Emp> queryEmp(AssignDto assignDto);

      void updateAssignById(Inbound inbound);

      void updateRepealById(Integer id);
}
