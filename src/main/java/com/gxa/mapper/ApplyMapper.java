package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.ApplyDto;
import com.gxa.entity.Apply;

import java.util.List;

public interface ApplyMapper  {


    List<Apply> queryAll(ApplyDto applyDto);
}
