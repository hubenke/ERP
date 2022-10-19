package com.gxa.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.AssignDto;
import com.gxa.dto.InboundDto;
import com.gxa.entity.Emp;
import com.gxa.entity.Inbound;
import com.gxa.service.InboundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "入库接口")
@RestController
public class InboundController {

   @Autowired
   private InboundService inboundService;
   //查询
   @ApiOperation("入库页面查询接口")
   @PostMapping("/inboundDto/list")
   public R queryInbound(@RequestBody InboundDto inboundDto){
      try {
         Page<Map<String,Object>> pageHelperList = PageHelper.startPage(inboundDto.getPage(), inboundDto.getLimit());
         List<Inbound> inbounds = this.inboundService.queryInboundDto(inboundDto);
         Map<String,Object> map = new HashMap<>();
         map.put("inbounds",inbounds);
         map.put("count",pageHelperList.getTotal());
         return R.ok(map);
      }catch (Exception e){
         e.printStackTrace();
         return R.error("查询失败");
      }
   }

   //完成入库
   @ApiOperation("入库完成接口")
   @PutMapping("/inbound/updateStatus")
   public R updateInboundStatus(@RequestBody Inbound inbound){
      try {
         this.inboundService.updateInboundStatus(inbound);
         return R.ok("入库成功");
      }catch (Exception e){
         e.printStackTrace();
         return R.error("入库失败");
      }
   }
   //查询员工 emp表
   @ApiOperation("查询员工接口")
   @PostMapping("/assignInbound/emp")
   public R queryStaff(@RequestBody AssignDto assignDto){
      try {
         Page<Map<String,Object>> pageHelper = PageHelper.startPage(assignDto.getPage(), assignDto.getLimit());
         List<Emp> emps = this.inboundService.queryEmp(assignDto);
         Map<String,Object> map = new HashMap<>();
         map.put("emps",emps);
         map.put("count",pageHelper.getTotal());
         return R.ok(map);
      }catch (Exception e){
         e.printStackTrace();
         return R.error("查询失败");
      }
   }

   //指派员工   修改关联eid
   @ApiOperation("指派员工接口")
   @PutMapping("/assignInbound/updateInbound")
   public R assign(@RequestBody Inbound inbound){   // assign 分派，布置
      try {
         this.inboundService.updateAssignById(inbound);
         return R.ok("指派成功");
      }catch (Exception e){
         e.printStackTrace();
         return R.error("指派失败");
      }


   }

   //撤回指派  删除关联eid
   @ApiOperation("撤销指派接口")
   @PutMapping("/repealInbound/updateInbound")
   public R repeal(Integer id){  //repeal 废除，废止
      try {
         this.inboundService.updateRepealById(id);
         return R.ok("撤销成功");
      }catch (Exception e){
         e.printStackTrace();
         return R.error("撤销失败");
      }

   }
}
