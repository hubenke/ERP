package com.gxa.service;

import com.gxa.dto.RepositoryDto;
import com.gxa.dto.StockUpdateDto;
import com.gxa.entity.Cargo;
import com.gxa.entity.Repository;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RepositoryService {
    List<Repository> queryAll(RepositoryDto repositoryDto);


    List<Repository> queryStoreAndArea();


    List<Repository> queryStructure();


//新增仓库
    void addNew(Repository repository);



    void addArea(Cargo cargo);

    List<Cargo> queryLevelByRnameCargos( String rname);

    void addCargo(Cargo cargo);

    void updateStock(StockUpdateDto stockUpdateDto);

}
