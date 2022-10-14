package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.ApplyDto;
import com.gxa.entity.Apply;
import com.gxa.entity.ApplyDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "请购单接口")
@RestController
public class ApplyController {

    @ApiOperation(value = "点击请购单，请购单页面数据展示")
    @GetMapping("/apply/applylist")
    public
    R queryAll() {

        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation(value = "请购单页面按条件查询")
    @GetMapping("/apply/alistcondition")
    public R querybyCondition(@RequestBody ApplyDto applyDto){
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }


//    @ApiOperation(value = "点击添加，展示员工")
//    @GetMapping("/apply/add/emp")
//public R queryEmp() {
//        List list = new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0, "suc", list);
//        return r;
//    }

//    @ApiOperation(value = "点击添加后的添加商品，展示商品信息")
//    @GetMapping("/apply/add/goods")
//    public R queryGoods(){
//        List list = new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0, "suc", list);
//        return r;
//    }

    @PostMapping("/apply/add/goodsAdd")
    @ApiOperation(value = "添加请购单的商品添加保存")
    public R applyGoodsAdd(@RequestBody ApplyDetail applyDetail){
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);


        return R.ok(map);
    }


    @PostMapping("/apply/add/infoAdd")
    @ApiOperation(value = "请购单添加保存")
    public R applyAdd(@RequestBody Apply apply){
        List list =new ArrayList();
        list.add("可以传");

        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

//    @ApiOperation(value = "点击编辑，返回请购单编号，展示请购单信息")
//    @GetMapping("/apply/update/info/{sid}")
//    public R queryUpdateInfo(@PathVariable("sid") Integer sid){
//        List list = new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0, "suc", list);
//        return r;
//
//    }

    @ApiOperation("请购单编辑保存")
    @PutMapping("/apply/update")
    public R applyupdate(@RequestBody Apply apply) {
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }



//@ApiOperation("请购单商品")
//@DeleteMapping("apply/goodsDelete")
//public  R applyDelete(){
//    List list = new ArrayList();
//
//    list.add("可以传");
//
//    R r = new R(0, "suc", list);
//    return r;
//};




//    @ApiOperation("点击指派，员工数据显示")
//    @GetMapping("apply/assignList/{current}/{limit}")
//    public  R queryEmp(@ApiParam("current")int current, @ApiParam("limit") int limit){
//        List list = new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0, "suc", list);
//        return r;
//    };
//    @ApiOperation("按条件查询员工")
//    @GetMapping("apply/assignListcondition/{current}/{limit}")
//    public  R queryConditonEmp(@ApiParam("current")int current, @ApiParam("limit") int limit, EmpDto empDto){
//        List list = new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0, "suc", list);
//        return r;
//    };



    @ApiOperation("指派员工保存，返回当前请购单编号和指派的员工姓名")
    @PutMapping("/apply/edit/{applyno}")
    public R updateEmp(@PathVariable("applyno") Integer applyno, @ApiParam("指派的员工姓名") String ename) {

        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation("撤销确定，返回当前撤销的请购单编号")
    @DeleteMapping("/apply/delete/{applyno}")
    public R DeleteEmp(@PathVariable("applyno") Integer applyno,@ApiParam("撤销的员工姓名") String ename) {

        List list =new ArrayList();

        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }


    @ApiOperation("审核通过确定，返回当前请购单编号")
    @PutMapping("/apply/update/auditPass")
    public R auditPass(@ApiParam("当前点击审核的用户") String aduitMan) {
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation("审核未通过确定,返回当前请购单编号和审核不通过理由")
    @PutMapping("/apply/update/auditFailed")
    public R auditFailed(@PathVariable("applyno") Integer applyno,@ApiParam("审核不通过的理由") String reason) {
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }
}
