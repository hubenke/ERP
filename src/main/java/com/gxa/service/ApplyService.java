package com.gxa.service;

import com.gxa.dto.ApplyDto;
import com.gxa.entity.Apply;

import java.util.List;

public interface ApplyService {
    List<Apply> queryAll(ApplyDto applyDto);
}
