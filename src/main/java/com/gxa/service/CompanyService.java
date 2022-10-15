package com.gxa.service;


import java.awt.*;

public interface CompanyService {

    void add(Integer component); //根据模块名称添加负责人

    void  update(Integer component);//根据模板名称编辑

    CompanyService queryName(String name);//根据模板名字查询


}
