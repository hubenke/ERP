package com.gxa.service;


import java.awt.*;

public interface CompanyService {

    void add(Component component); //添加负责人

    void  update(Component component);//修改负责人

    CompanyService queryName(String name);//根据模板名字查询


}
