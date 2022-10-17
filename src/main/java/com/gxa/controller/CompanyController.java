package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;
import com.gxa.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "公司架构接口")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @GetMapping("/com/list")
    @ApiOperation("查询公司接口")
    public R queryAll(){


//        List list = new ArrayList()
        List<Company> companies = this.companyService.queryAll();
        Map map = new HashMap();
        map.put("companies",companies);
//
        return R.ok(map);


    }

    @PutMapping("/com/add")
    @ApiOperation("添加公司接口")

    public R addCompany(Company company){

        System.out.println(company);

        this.companyService.add(company);

        return R.ok("添加成功");

//        return R.ok("添加成功");

    }


    @GetMapping("/com/job")
    @ApiOperation("拉取4步负责人，编辑可重复使用")
    public R qureyJob(Company company){

        List list = new ArrayList();
        list.add("销售代表");
        list.add("销售经理");
        list.add("总经理");
        list.add("财务");

        Map map = new HashMap();
        map.put("4步负责人",list);
        return  R.ok();

//        List<Company> companies =this.companyService.querById();
//        Map map =new HashMap();
//        map.put("companies",companies);
//        return  R.ok(map);

    }

    @PutMapping("/com/upjob")
    @ApiOperation("修改接口")
    public R update(CompanyDto companyDto){
//      this.companyService.update();
        return R.ok("修改成功");
    }




}
