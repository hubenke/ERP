package com.gxa.service;

import com.gxa.dto.RepositoryDto;
import com.gxa.entity.Cargo;
import com.gxa.entity.Repository;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RepositoryService {
    List<Repository> queryAll(RepositoryDto repositoryDto);


    List<Repository> queryStructure();


//新增仓库
    void insertNew(Repository repository);



    void insertArea(Cargo cargo);

    List<Cargo> queryLevelByRnameCargos( String rname);

    void insertCargo(Cargo cargo);

}
