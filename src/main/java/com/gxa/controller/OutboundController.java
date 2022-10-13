package com.gxa.controller;


import com.gxa.common.uitls.R;
import com.gxa.dto.OutboundDto;
import com.gxa.entity.Outbound;
import com.gxa.service.OutboundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "出库接口")
@RestController
public class OutboundController {
    @Autowired
    private OutboundService outboundService;

    @GetMapping("/outbound/list")
    @ApiOperation("出库数据")
    public R queryAll(){
//            List<Outbound> outbounds = this.outboundService.queryOutbound();
        try {
            List outbounds = new ArrayList();
            outbounds.add("s");
            outbounds.add("2");
            outbounds.add("p");
            Map map = new HashMap();
            map.put("outbounds",outbounds);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }
    @GetMapping("/outboundDto/list")
    @ApiOperation("出库条件查询")
    public R queryByOutboundDto(@RequestBody OutboundDto outboundDto){
//            List<Outbound> outbounds = this.outboundService.queryOutbound();
        try {
            List outbounds = new ArrayList();
            outbounds.add("s");
            outbounds.add("2");
            outbounds.add("p");
            Map map =new HashMap();
            map.put("outbounds",outbounds);
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

            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    @DeleteMapping("/outbound/{outno}")
    @ApiOperation("根据出库编号删除出库数据")
    public R delete(@PathVariable("outno") Integer outno){
        try {

            return R.ok("删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("删除失败");
        }
    }

}
