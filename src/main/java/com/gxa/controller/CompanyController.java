package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.CompanyDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ApiModel("公司架构接口")
public class CompanyController {

    @GetMapping("/com/list")
    @ApiOperation("查询公司接口")
    public R queryAll(){

        List list = new ArrayList();
        list.add("NO 7528");
        list.add("供应商审核模板");
        list.add("销售代表-销售经理-总经理-财务");

        Map map = new HashMap();
        map.put("公司架构",list);

        return R.ok(map);
    }

    @PutMapping("/com/add")
    @ApiOperation("添加公司接口")
    public R addCompany(){


        return R.ok("添加成功");
    }

    @GetMapping("/com/job")
    @ApiOperation("拉取4步负责人，编辑可重复使用")
    public R qureyJob(){
        List list = new ArrayList();
        list.add("销售代表");
        list.add("销售经理");
        list.add("总经理");
        list.add("财务");

        Map map = new HashMap();
        map.put("4步负责人",list);
        return  R.ok();
    }

    @PutMapping("/com/upjob")
    @ApiOperation("修改接口")
    public R update(CompanyDto companyDto){



        return R.ok("修改成功");
    }




}
