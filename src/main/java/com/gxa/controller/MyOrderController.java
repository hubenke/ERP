package com.gxa.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gxa.common.uitls.R;
import com.gxa.dto.MyOrderDto;
import com.gxa.entity.Goods;
import com.gxa.entity.MyOrder;
import com.gxa.service.MyOrderService;
import com.mysql.cj.x.protobuf.MysqlxCrud;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;


@RestController
@Api(tags = "销售订单接口")
public class MyOrderController {

    @Autowired
    private  MyOrderService myOrderService;

    // @RequiresPermissions("order:list") 权限控制注解
    @GetMapping("/orders")
    @ApiOperation("查询所有销售订单")
    public R list(@ApiParam("页数") Integer page, @ApiParam("条数") Integer limit){
        //Goods goods = new Goods(8,"ppp","lll",20.0,10.0,"kkk",0);
        //MyOrder myOrder = new MyOrder(1,"11",123,0,1,null,4,"jy","888",321,"56",goods);
        try {
            //List<MyOrder> orders = new ArrayList<>();
            //orders.add(myOrder);
           PageHelper.startPage(page, limit);
            List<MyOrder> myOrders = this.myOrderService.queryAll();
            System.out.println("myOrders:----------"+myOrders.toString());
            Map<String,Object> map = new HashMap<>();
            map.put("myOrders",myOrders);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("请求异常");
        }
    }

    @PostMapping("/orders/add")
    @ApiOperation("添加销售订单")
    public R addUser(@RequestBody MyOrder myOrder){
        try {
            this.myOrderService.add(myOrder);
            return R.ok("添加成功");
        } catch (Exception e) {

            e.printStackTrace();
            return R.error("添加失败");
        }
    }

    @GetMapping("/orders/queryByCondition")
    @ApiOperation("根据条件查询销售订单")
    public R queryByCondition(@RequestBody MyOrderDto myOrderDto){
        try {
            System.out.println("myOrderDto------------------" + myOrderDto.toString());
            Map<String,Object> map = new HashMap<>();
            List<MyOrder> orders = new ArrayList<>();
            map.put("result", orders);

            R r = R.ok(map);

            return r;
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("查询失败");
        }
    }

    @PutMapping("/orders/close")
    @ApiOperation("根据id修改订单状态为关闭")
    public R updateCloseById(Integer id){
        try {

            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

    @PutMapping("/orders/outById")
    @ApiOperation("根据id修改订单状态为发货")
    public R updateOutById(Integer id){
        try {

            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

    @PutMapping("/orders/out")
    @ApiOperation("批量修改订单发货")
    public R updateOuts(Integer[] ids){
        System.out.println(ids);
        try {
            return R.ok("批量发货成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("批量发货失败");
        }
    }

    @PutMapping("/orders/finish")
    @ApiOperation("根据id修改订单状态为确认收货已完成")
    public R updateFinishById(Integer id){
        try {

            return R.ok("收货成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("收货失败");
        }
    }

    @DeleteMapping("/orders/deleteById")
    @ApiOperation("根据id删除订单")
    public R deleteById(Integer id){

        try {
            return R.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("删除失败");
        }
    }

    @DeleteMapping("/orders/delete")
    @ApiOperation("批量删除订单")
    public R deleteOrders(Integer[] ids){
        System.out.println(ids);
        try {
            return R.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("删除失败");
        }
    }


}
