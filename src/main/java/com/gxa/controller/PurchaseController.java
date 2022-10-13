package com.gxa.controller;

import com.gxa.common.uitls.TableResult;
import com.gxa.dto.PurchaseDto;
import com.gxa.entity.Purchase;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PurchaseController {
    @GetMapping("/purchase/list")
    @ApiOperation("查询所有采购单")
    public TableResult queryAll(){
        TableResult result = new TableResult(0,"success",null);

        try{
//            Purchase purchase = new Purchase();
//            List<Purchase> purchases = new ArrayList<>();
//            purchases.add(purchase);
//            result.setData(purchases);
            List list = new ArrayList();
            list.add("d");
            list.add("a");
            list.add("c");
            result.setData(list);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("请求异常");
            return result;
        }
    }

    @GetMapping("/queryPurchaseByCondition/list")
    @ApiOperation("根据条件查询满足条件的采购单")
    public TableResult queryPurchaseByCondition(PurchaseDto purchaseDto){
        TableResult result = new TableResult(0,"success",null);
        try{
//            List<Purchase> purchases = new ArrayList<>();
//            result.setData(purchases);
            List list = new ArrayList();
            list.add("d");
            list.add("a");
            list.add("c");
            result.setData(list);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("查询失败");
            return result;
        }

    }

    @PostMapping("/purchase/add")
    @ApiOperation("添加采购单")
    public  TableResult addPurchase(@RequestBody Purchase purchase){
        TableResult result = new TableResult(0,"success",null);
        try{
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("添加失败");
            return result;
        }

    }

    @PutMapping("/purchase/edit")
    @ApiOperation("修改采购单")
    public TableResult updatePurchaseById(@RequestBody Purchase purchase){
        TableResult result = new TableResult(0,"success",null);
        try{
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("修改失败");
            return result;
        }
    }

    @PutMapping("/purchase/check/{id}")
    @ApiOperation("根据id审核采购单")
    public TableResult checkPurchase(@PathVariable("id") Integer id){
        TableResult result = new TableResult(0,"success",null);
        try{
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("审核失败");
            return result;
        }
    }




    @PutMapping("/purchase/suspend")
    @ApiOperation("根据id终止采购单")
    public TableResult suspendPurchase(@PathVariable("id") Integer id){
        TableResult result = new TableResult(0,"success",null);
        try{
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("中止失败");
            return result;
        }
    }



}
