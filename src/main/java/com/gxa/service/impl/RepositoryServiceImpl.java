package com.gxa.service.impl;

import com.gxa.dto.RepositoryDto;
import com.gxa.dto.StockUpdateDto;
import com.gxa.entity.Cargo;
import com.gxa.entity.Repository;
import com.gxa.mapper.RepositoryMapper;
import com.gxa.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class   RepositoryServiceImpl implements RepositoryService {

    @Autowired
    private RepositoryMapper repositoryMapper;


    @Override
    public
    List<Repository> queryAll(RepositoryDto repositoryDto) {
        List<Repository> repositories;
        repositories = this.repositoryMapper.queryAll( repositoryDto);
        return repositories;
    }

    @Override
    public
    List<Repository> queryStoreAndArea() {
        List<Repository> repositories = this.repositoryMapper.queryStoreAndArea();
        return repositories;
    }





    @Override
    public
    List<Repository> queryStructure() {
        List<Repository> repositories = this.repositoryMapper.queryStructure();
        return repositories;
    }

    @Override
    public
   int addNew(Repository repository) {
       int i=  this.repositoryMapper.addNew(repository);
        return i;
    }

    @Override
    public
    int addArea(Cargo cargo) {
        int i=  this.repositoryMapper.addArea(cargo);
        return i;
    }

    @Override
    public
    List<Cargo> queryLevelByRnameCargos(String rname) {
        List<Cargo> cargos = this.repositoryMapper.queryAreaByRnameCargos(rname);
        return cargos;
    }

    @Override
    public
    int addCargo(Cargo cargo) {
        int i=   this.repositoryMapper.addCargo(cargo);
        return i;
    }


    @Override
    public
    int updateStock(StockUpdateDto stockUpdateDto) {
        int i=    this.repositoryMapper.updateDecrease(stockUpdateDto);
        if (i!=0){
            int j = this.repositoryMapper.updateIncrease(stockUpdateDto);
             if (j!=0){
                 return j;
             }else {
                 return 0;}





        }else {return 0;}


    }
}
