package com.gxa.controller;

import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.ApplyAddDto;
import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.ApplyGoods;
import com.gxa.entity.Emp;
import com.gxa.service.ApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "请购单接口")
@RestController
public class ApplyController {

    @Autowired
    private ApplyService applyService;


    @ApiOperation("点击请购单，请购单页面数据展示,与搜索使用一个接口")
    @PostMapping("/apply/applylist")
    public R queryAll(@RequestBody ApplyDto applyDto) {

        PageHelper.startPage(applyDto.getPage(),applyDto.getLimit());  //使用此方法进行分页

        List<Apply> applies = this.applyService.queryAll(applyDto);

        Map<String,Object> map =new HashMap<>();
        map.put("applies",applies);

        return R.ok(map);
    }

    @PostMapping("/apply/applyAdd")
    @ApiOperation("新增请购单的保存")
    public R applyGoodsAdd(@RequestBody ApplyAddDto applyAddDto){

        System.out.println("接收到的数据是-------"+applyAddDto);
        int i = this.applyService.addApply(applyAddDto);
        if(i != 0){
            return R.ok("添加成功");
        }

        return R.error("添加失败");
    }

    @ApiOperation("查询部门")
    @GetMapping("/apply/dept")
    public R queryDepts(){

        List<Emp> emps = this.applyService.queryDeot();

        Map<String,Object> map =new HashMap<>();
        map.put("emps",emps);
        return R.ok(map);
    }

    @ApiOperation("查询人员")
    @PostMapping("/apply/emp")
    public R queryEmp(EmpDto empDto){

//        PageHelper.startPage(page, limit);  //使用此方法进行分页

        System.out.println("接收的数据是-----------"+empDto);

        List<Emp> emps = this.applyService.queryEmp(empDto);

        Map<String,Object> map =new HashMap<>();
        map.put("emps",emps);

        return  R.ok(map);
    }



    @GetMapping("/apply/goods")
    @ApiOperation("查询商品")
    public R applyAdd(ApplyAddDto applyAddDto){

        List<ApplyDto> goods = this.applyService.queryGoods(applyAddDto);

        Map<String,Object> map =new HashMap<>();
        map.put("goods",goods);

        return R.ok(map);
    }



    @ApiOperation("请购单编辑保存")
    @PutMapping("/apply/update")
    public R applyupdate(ApplyDto applyDto) {



//        if (i != 0){
//            return R.ok();
//        }else {
            return R.error();
//        }
    }


    @ApiOperation("指派员工保存，返回当前请购单编号和指派的员工姓名")
    @PutMapping("/apply/edit")
    public R updateEmp(@ApiParam("请购单编号") Integer applyno, @ApiParam("指派的员工id") Integer eid) {

        int i = this.applyService.assign(applyno, eid);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }

    }

    @ApiOperation("撤销接口，需要给到请购单编号")
    @PutMapping("/apply/delete")
    public R DeleteEmp(@ApiParam("请购单编号") Integer applyno) {

        int i = this.applyService.backout(applyno);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }

    }


    @ApiOperation("审核通过确定，返回当前请购单编号，0不通过，1表示通过，不通过请添加说明remark")
    @PutMapping("/apply/check")
    public R updateCheck(@ApiParam("用来接收的模型")Apply apply) {

        int i = this.applyService.updateCheck(apply);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }

    }

    @ApiOperation("删除接口")
    @DeleteMapping("/apply/del")
    private R deleteApply(ApplyAddDto applyAddDto){

        this.applyService.deleteApply(applyAddDto);

        return R.ok();
    }


}
