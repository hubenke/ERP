package com.gxa.service.impl;

import com.gxa.dto.ApplyDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;
import com.gxa.mapper.ApplyMapper;
import com.gxa.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Apply> queryAll(ApplyDto applyDto) {
        List<Apply> applies = this.applyMapper.queryAll(applyDto);

        return applies;
    }

    @Override
    public List<Emp> queryDeot() {
        this.applyMapper.queryDept();
        return null;
    }
}
