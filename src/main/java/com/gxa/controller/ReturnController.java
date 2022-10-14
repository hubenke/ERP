package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.ReturnBillDto;
import com.gxa.entity.ReturnBill;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReturnController {
    @GetMapping("/return/list")
    @ApiOperation("查询所有退货单")
    public R queryAll(){
        ReturnBill returnBill = new ReturnBill();

        try{
            List<ReturnBill> returnBillList = new ArrayList<>();
            returnBillList.add(returnBill);
            Map<String,Object> map = new HashMap<>();
            map.put("returnBillList",returnBillList);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("请求异常");
        }
    }


    @GetMapping("/queryReturnByCondition/list")
    @ApiOperation("根据条件查询所有满足条件的退货单")
    public R queryReturnByCondition(ReturnBillDto returnBillDto){


        ReturnBill returnBill = new ReturnBill();

        try{
            List<ReturnBill> returnBillList = new ArrayList<>();
            returnBillList.add(returnBill);
            Map<String,Object> map = new HashMap<>();
            map.put("returnBillList",returnBillList);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }


    @PostMapping("/Return/add")
    @ApiOperation("添加退货单")
    public R addReturn(@RequestBody ReturnBill returnBill){

        try{
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }

    }

    @PutMapping("/Return/check/{id}")
    @ApiOperation("根据Id审核退货单")
    public R checkReturn(@PathVariable("id") Integer id){
        try{
            return R.ok("审核通过");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("审核失败");
        }
    }




}