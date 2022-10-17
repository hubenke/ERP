package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.ApplyDto;
import com.gxa.entity.Apply;
import com.gxa.entity.ApplyGoods;
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
    public R queryAll(ApplyDto applyDto) {

        List<Apply> applies = this.applyService.queryAll(applyDto);

        Map<String,Object> map =new HashMap<>();
        map.put("applies",applies);

        return R.ok(map);
    }

    @PostMapping("/apply/applyAdd")
    @ApiOperation("新增请购单的保存")
    public R applyGoodsAdd(@RequestBody ApplyGoods applyGoods){
        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);


        return R.ok(map);
    }

    @ApiOperation("查询部门")
    @GetMapping("/apply/dept")
    public R queryDepts(){

        this.applyService.queryDeot();
        return R.ok();
    }



    @GetMapping("/apply/goods")
    @ApiOperation("查询商品")
    public R applyAdd(@RequestBody Apply apply){
        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");

        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }



    @ApiOperation("请购单编辑保存")
    @PutMapping("/apply/update")
    public R applyupdate(@RequestBody Apply apply) {
        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }


    @ApiOperation("指派员工保存，返回当前请购单编号和指派的员工姓名")
    @PutMapping("/apply/edit/{applyno}")
    public R updateEmp(@PathVariable("applyno") Integer applyno, @ApiParam("指派的员工姓名") String ename) {

        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation("撤销确定，返回当前撤销的请购单编号")
    @DeleteMapping("/apply/delete/{applyno}")
    public R DeleteEmp(@PathVariable("applyno") Integer applyno,@ApiParam("撤销的员工姓名") String ename) {

        List list =new ArrayList();
        list.add("123");
        list.add("456");

        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }


    @ApiOperation("审核通过确定，返回当前请购单编号")
    @PutMapping("/apply/update/auditPass")
    public R auditPass(@ApiParam("当前点击审核的用户") String aduitMan) {
        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation("审核未通过确定,返回当前请购单编号和审核不通过理由")
    @PutMapping("/apply/update/auditFailed")
    public R auditFailed(@PathVariable("applyno") Integer applyno,@ApiParam("审核不通过的理由") String reason) {
        List list =new ArrayList();
        list.add("可以传");
        list.add("123");
        list.add("456");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }
}
