package com.gxa.service.impl;

import com.gxa.entity.Repository;
import com.gxa.mapper.RepositoryMapper;
import com.gxa.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class   RepositoryServiceImpl implements RepositoryService {

    @Autowired
    private RepositoryMapper repositoryMapper;


    @Override
    public
    List<Repository> queryAll() {
        List<Repository> repositories = this.repositoryMapper.queryAll();
        return repositories;
    }

    @Override
    public
    List<Repository> queryStructure() {
        List<Repository> repositories = this.repositoryMapper.queryAll();
        return repositories;
    }
}
