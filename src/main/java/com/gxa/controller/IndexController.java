package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.service.IndexService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "系统首页接口")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/index/aopSum")
    @ApiOperation("查询待处理事务总量")
    public R aopSum(){
        try {
            Integer depositSum = this.indexService.queryDepositSum();
            Integer outBoundSum = this.indexService.queryOutBoundSum();
            Map<String,Object> map = new HashMap<>();
            map.put("depositSum",depositSum);//入库
            map.put("outBoundSum",outBoundSum);//出库
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("请求异常");
        }
    }

    @GetMapping("/index/ordersSum")
    @ApiOperation("查询订单统计总量")
    public R ordersSum(){
        try {
            Map<String,Object> map = new HashMap<>();
            map.put("week",200);
            map.put("decrease",0.1);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("请求异常");
        }
    }

    @GetMapping("/index/ordersDaySum")
    @ApiOperation("查询订单统计每天的总量")
    public R ordersDaySum(){
        try {
            Map<String,Object> map = new HashMap<>();
            map.put("week",200);
            map.put("decrease",0.1);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("请求异常");
        }
    }

    @GetMapping("/index/classifySum")
    @ApiOperation("查询热门分类比例")
    public R classifySum(){
        try {
            Map<String,Object> map = new HashMap<>();
            map.put("week",200);
            map.put("decrease",0.1);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("请求异常");
        }
    }
}
