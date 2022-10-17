package com.gxa.service.impl;

import com.gxa.dto.RepositoryDto;
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
    List<Repository> queryStructure() {
        List<Repository> repositories = this.repositoryMapper.queryStructure();
        return repositories;
    }

    @Override
    public
   void addNew(Repository repository) {
         this.repositoryMapper.addNew(repository);

    }

    @Override
    public
    void addArea(Cargo cargo) {
      this.repositoryMapper.addArea(cargo);

    }

    @Override
    public
    List<Cargo> queryLevelByRnameCargos(String rname) {
        List<Cargo> cargos = this.repositoryMapper.queryAreaByRnameCargos(rname);
        return cargos;
    }

    @Override
    public
    void addCargo(Cargo cargo) {
        this.repositoryMapper.addCargo(cargo);
    }
}
