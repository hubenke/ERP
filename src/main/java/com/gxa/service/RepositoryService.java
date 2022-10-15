package com.gxa.service;

import com.gxa.entity.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RepositoryService {
    List<Repository> queryAll();
    List<Repository> queryStructure();

}
