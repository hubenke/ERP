package com.gxa.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
        try {
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

    @GetMapping("/orders/return")
    @ApiOperation("查询所有退换货订单")
    public R listReturn(@ApiParam("页数") Integer page, @ApiParam("条数") Integer limit){
        try {
            List<MyOrder> myOrdersReturn = this.myOrderService.queryAllReturn();
            System.out.println("myOrdersReturn:----------"+myOrdersReturn.toString());
            Map<String,Object> map = new HashMap<>();
            map.put("myOrdersReturn",myOrdersReturn);
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
            List<MyOrder> myOrders = this.myOrderService.queryAll();
            int size = myOrders.size();
            myOrder.setId(size+1);
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
            List<MyOrder> queryByConditionMyOrders = this.myOrderService.queryByCondition(myOrderDto);
            System.out.println("myOrderDto------------------" + myOrderDto.toString());
            Map<String,Object> map = new HashMap<>();
            map.put("result", queryByConditionMyOrders);

            R r = R.ok(map);

            return r;
        } catch (Exception e) {
            e.printStackTrace();

            return R.error("查询失败");
        }
    }

    @GetMapping("/orders/queryReturnByCondition")
    @ApiOperation("根据条件查询退货订单")
    public R queryReturnByCondition(MyOrderDto myOrderDto){
        try {
            List<MyOrder> queryReturnByConditionMyOrders = this.myOrderService.queryReturnByCondition(myOrderDto);
            System.out.println("queryReturnByConditionMyOrders------------------" + queryReturnByConditionMyOrders.toString());
            Map<String,Object> map = new HashMap<>();
            map.put("result", queryReturnByConditionMyOrders);

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
            this.myOrderService.updateStatusByClose(id);
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
            this.myOrderService.updateStatusByOut(id);
            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

    @PutMapping("/orders/out")
    @ApiOperation("批量修改订单发货")
    public R updateOuts(Integer[] ids){
        System.out.println("updateOuts:----------"+ids);
        try {
            this.myOrderService.updateOuts(ids);
            return R.ok("批量发货成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("批量发货失败");
        }
    }

    @PutMapping("/orders/finishById")
    @ApiOperation("根据id修改订单状态为确认收货已完成")
    public R updateFinishById(Integer id){
        try {
            this.myOrderService.updateStatusByFinish(id);
            return R.ok("收货成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("收货失败");
        }
    }

    @PutMapping("/orders/finishes")
    @ApiOperation("根据id修改订单状态为确认收货已完成")
    public R updateFinishes(Integer[] ids){
        try {
            this.myOrderService.updateFinishes(ids);
            return R.ok("批量收货成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("收货失败");
        }
    }

    @DeleteMapping("/orders/deleteById")
    @ApiOperation("根据id删除订单")
    public R deleteById(Integer id){

        try {
            this.myOrderService.delete(id);
            return R.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("删除失败");
        }
    }

    @DeleteMapping("/orders/delete")
    @ApiOperation("批量删除订单")
    public R deleteOrders(Integer[] ids){
        System.out.println("deleteOrders:----------"+ids);
        try {
            this.myOrderService.deleteMyOrders(ids);
            return R.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("删除失败");
        }
    }


}
