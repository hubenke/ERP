package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.common.uitls.R;
import com.gxa.dto.RepositoryDto;
import com.gxa.entity.Cargo;
import com.gxa.entity.Repository;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;

public
interface RepositoryMapper extends BaseMapper<Repository> {





//    仓储管理页面和条件查询
    List<Repository> queryAll(RepositoryDto repositoryDto);


//    仓储结构页面
    List<Repository> queryStructure();



//    新增仓库
    void addNew(Repository repository);


    void addArea(Cargo cargo);


    List<Cargo> queryAreaByRnameCargos(String rname);


    void addCargo(Cargo cargo);








}
