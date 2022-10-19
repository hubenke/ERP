package com.gxa.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.AssignDto;
import com.gxa.dto.OutboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Outbound;
import com.gxa.entity.OutboundGoods;
import com.gxa.service.OutboundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "出库接口")
@RestController
public class OutboundController {
    @Autowired
    private OutboundService outboundService;


    @PostMapping("/outboundDto/list")
    @ApiOperation("出库条件查询")
    public R queryByOutboundDto(@RequestBody OutboundDto outboundDto){
        try {
            Page<Map<String,Object>> pageHelper = PageHelper.startPage(outboundDto.getPage(), outboundDto.getLimit());
            List<Outbound> outboundsDto = this.outboundService.queryOutboundDto(outboundDto);
            Map<String,Object> map = new HashMap<>();
            map.put("outboundDto",outboundsDto);
            map.put("count",pageHelper.getTotal());
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/outbound/add")
    @ApiOperation("出库添加")
    public R add(@RequestBody Outbound outbound){
        try {
            this.outboundService.addOutbound(outbound);
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    //查询员工 emp表
    @ApiOperation("查询员工接口")
    @PostMapping("/assignOutbound/emp")
    public R queryStaff(@RequestBody AssignDto assignDto){
        try {
            Page<Map<String,Object>> pageHelper = PageHelper.startPage(assignDto.getPage(), assignDto.getLimit());
            List<Emp> emps = this.outboundService.queryEmp(assignDto);
            Map<String,Object> map = new HashMap<>();
            map.put("count",pageHelper.getTotal());
            map.put("emps",emps);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    //指派员工   修改关联eid
    @ApiOperation("指派员工接口")
    @PutMapping("/assignOutbound/updateOutbound")
    public R assign(Outbound outbound){   // assign 分派，布置
        try {
            this.outboundService.updateAssignById(outbound);
            return R.ok("指派成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("指派失败");
        }


    }

    //撤回指派  删除关联eid
    @ApiOperation("撤销指派接口")
    @PutMapping("/repealOutbound/updateOutbound")
    public R repeal(Integer integer){  //repeal 废除，废止
        try {
            this.outboundService.updateRepealById(integer);
            return R.ok("撤销成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("撤销失败");
        }
    }
    @ApiOperation("查询商品接口")
    @PostMapping("/outbound/listGoods")
    public R queryGoods(@RequestBody OutboundGoods outboundGoods){
        try {
            Page<Map<String,Object>> pageHelper = PageHelper.startPage(outboundGoods.getPage(),outboundGoods.getLimit());
            List<OutboundGoods> outboundDetails = this.outboundService.queryGoods();
            Map<String,Object> map = new HashMap<>();
            map.put("outboundDetails",outboundDetails);
            map.put("count",pageHelper.getTotal());
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/outboundGoods/add")
    @ApiOperation("商品添加")
    public R addOutboundGoods(@RequestBody OutboundGoods outboundGoods){
        try {
            this.outboundService.addOutboundGoods(outboundGoods);
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    @ApiOperation("出库完成接口")
    @PutMapping("/outbound/updateStatus")
    public R updateOutboundStatus(@RequestBody Outbound outbound){
        try {
            this.outboundService.updateOutboundStatus(outbound);
            return R.ok("出库成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("出库失败");
        }
    }
    @DeleteMapping("/outboundGoods/update")
    @ApiOperation("商品删除")
    public R deleteOutboundGoods(Integer id){
        try {
            this.outboundService.deleteOutboundGoodsById(id);
            return R.ok("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("删除失败");
        }
    }
}
