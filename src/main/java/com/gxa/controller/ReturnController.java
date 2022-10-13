package com.gxa.controller;

import com.gxa.common.uitls.TableResult;
import com.gxa.dto.ReturnBillDto;
import com.gxa.entity.ReturnBill;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReturnController {
    @GetMapping("/return/list")
    @ApiOperation("查询所有退货单")
    public TableResult queryAll(){
        TableResult result = new TableResult(0,"success",null);

        try{
            List<ReturnBill> returnBillList = new ArrayList<>();
            result.setData(returnBillList);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("请求异常");
            return result;
        }
    }


    @GetMapping("/queryReturnByCondition/list")
    @ApiOperation("根据条件查询所有满足条件的退货单")
    public TableResult queryReturnByCondition(ReturnBillDto returnBillDto){
        TableResult result = new TableResult(0,"success",null);

        try{
            List<ReturnBill> returnBillList = new ArrayList<>();
            result.setData(returnBillList);
            return result;
        }catch (Exception e){
            e.printStackTrace();
            result.setCode(1);
            result.setMsg("查询失败");
            return result;
        }
    }


    @PostMapping("/Return/add")
    @ApiOperation("添加退货单")
    public TableResult addReturn(@RequestBody ReturnBill returnBill){
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

    @PutMapping("/Return/check/{id}")
    @ApiOperation("根据Id审核退货单")
    public TableResult checkReturn(@PathVariable("id") Integer id){
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




}
