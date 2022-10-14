package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.PurchaseDto;
import com.gxa.entity.Purchase;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PurchaseController {
    @GetMapping("/purchase/list")
    @ApiOperation("查询所有采购单")
    public R queryAll(){
        Purchase purchase = new Purchase();

        try{
            List<Purchase> purchases = new ArrayList<>();
            purchases.add(purchase);
            Map<String,Object> map = new HashMap<>();
            map.put("purchases",purchases);

            return R.ok(map);

        }catch (Exception e){
            e.printStackTrace();
           return R.error("请求异常");
        }
    }

    @GetMapping("/queryPurchaseByCondition/list")
    @ApiOperation("根据条件查询满足条件的采购单")
    public R queryPurchaseByCondition(PurchaseDto purchaseDto){
        Purchase purchase = new Purchase();

        try{
            List<Purchase> purchases = new ArrayList<>();
            purchases.add(purchase);
            Map<String,Object> map = new HashMap<>();
            map.put("purchases",purchases);

            return R.ok(map);

        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/purchase/add")
    @ApiOperation("添加采购单")
    public  R addPurchase(@RequestBody Purchase purchase){

        try{
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }

    }

    @PutMapping("/purchase/edit")
    @ApiOperation("修改采购单")
    public R updatePurchaseById(@RequestBody Purchase purchase){

        try{
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

    @PutMapping("/purchase/check/{id}")
    @ApiOperation("根据id审核采购单")
    public R checkPurchase(@PathVariable("id") Integer id){

        try{
            return R.ok("审核通过");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("审核失败");
        }
    }




    @PutMapping("/purchase/suspend")
    @ApiOperation("根据id终止采购单")
    public R suspendPurchase(@PathVariable("id") Integer id){

        try{
            return R.ok("终止成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("终止失败");
        }
    }



}
