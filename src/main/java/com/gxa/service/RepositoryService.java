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
    int addNew(Repository repository);



    int addArea(Cargo cargo);

    List<Cargo> queryLevelByRnameCargos( String rname);

    int addCargo(Cargo cargo);

    int updateStock(StockUpdateDto stockUpdateDto);

}
