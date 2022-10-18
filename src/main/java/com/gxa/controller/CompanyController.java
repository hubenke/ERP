package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.CompanyDto;
import com.gxa.entity.Company;
import com.gxa.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public R queryAll(@ApiParam("条数") Integer limit) {


//        List list = new ArrayList()
        List<Company> companies = this.companyService.queryAll();
        Map map = new HashMap();
        map.put("companies", companies);
//
        return R.ok(map);


    }

    @PutMapping("/com/add")
    @ApiOperation("添加公司接口")

    public R addCompany(@RequestBody Company company) {

        try {
            return R.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("添加失败");
        }


    }


    @GetMapping("/com/job")
    @ApiOperation("拉取4步负责人，编辑可重复使用")
    public R qureyJob(@RequestBody Company company) {
        try {
            Company company1=new Company();
            company.setCompno(1);
            company.setId(1);
            company.setJob("销售代表");
            company.setName("公司名称");

            Map map=new HashMap();
            map.put("company1",company1);

            return  R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");

        }


    }

//        List list = new ArrayList();
//
//
//        Map map = new HashMap();
//        map.put("4步负责人", list);
//        return R.ok();

//        List<Company> companies =this.companyService.querById();
//        Map map =new HashMap();
//        map.put("companies",companies);



    @PutMapping("/com/upjob")
    @ApiOperation("修改接口")
    public R update(@RequestBody CompanyDto companyDto) {
//      this.companyService.update();
        return R.ok("修改成功");
    }

    @PutMapping("com/updateid")
    @ApiOperation("根据id编辑")
    public R updateById(Integer id) {
        try {
            this.companyService.updateById(id);
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("修改失败");
        }

    }
    @GetMapping("/com/{byid}")
    @ApiOperation("通过id查询")
    public R querById(@PathVariable("byid") Integer byid){
        try {
            return R.ok("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

        }
}

