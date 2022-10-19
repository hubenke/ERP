package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
    @ApiOperation("查询所有公司")
    public R queryAll(@ApiParam("页数") Integer page,@ApiParam("条数") Integer limit) {
        try{
           // PageHelper.startPage(page, limit);

            Page<Map<String,Object>> PageHelperList =PageHelper.startPage(page,limit);
            List<Company> companies = this.companyService.queryAll();
            System.out.println("company:------------"+companies.toString());
            System.out.println("count:--------"+PageHelperList.getTotal());
            Map<String,Object> map =new HashMap<>();
            map.put("company", companies);
            map.put("count",PageHelperList.getTotal());
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

//        List list = new ArrayList()
//
    }

    @GetMapping("/com/queryByCondition")
    @ApiOperation("根据条件模块名称查询")
    public R queryByCondition(@RequestBody CompanyDto companyDto){
        try {
            List<Company> queryByConditionCompanys =this.companyService.queryByCondition(companyDto);

            System.out.println("companyDto---------"+companyDto.toString());
            Map<String,Object> map =new HashMap<>();
            map.put("result",queryByConditionCompanys);
            R r =R.ok(map);
            return r;
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }


    @PostMapping("/com/add")
    @ApiOperation("添加公司接口")

    public R addCompany( Company company) {


        try {
            this.companyService.add(company);
            return R.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("添加失败");
        }


    }


    @GetMapping("/com/job")
    @ApiOperation("拉取4步负责人，编辑可重复使用")
    public R qureyJob( Company company) {
        try {
            Company company1=new Company();
            company1.setCompno(1);
            company1.setId(1);
            company1.setJob("销售代表");
            company1.setName("公司名称");

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



//    @PostMapping("/com/upjob")
//    @ApiOperation("修改接口")
//    public R update(CompanyDto companyDto) {
//      this.companyService.update();
//        return R.ok("修改成功");
//    }

    @PostMapping("/com/updateid")
    @ApiOperation("根据id编辑操作")
    public R updateById( Integer id) {
        try {
            this.companyService.updateById(id);
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("修改失败");
        }

    }
    @GetMapping("/com/byido")
    @ApiOperation("通过id查询操作")
    public R querById( Integer id){
        try {
            this.companyService.querById(id);
            return R.ok("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

        }
}

