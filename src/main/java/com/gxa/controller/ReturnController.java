package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;
import com.gxa.entity.ReturnBill;
import com.gxa.service.ReturnService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "退货单接口")
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    /*@GetMapping("/return/list")
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
    }*/

    //@GetMapping("/return/queryByCondition")
    @PostMapping("/return/queryByCondition")
    @ApiOperation("根据条件查询所有满足条件的退货单")
    public R queryReturnByCondition(@RequestBody ReturnBillDto returnBillDto){
        try {
            Page<Map<String,Object>> pageHelperList = PageHelper.startPage(returnBillDto.getPage(), returnBillDto.getLimit());//进行分页

            List<ReturnQueryDto> returnList = returnService.queryAllReturnBill(returnBillDto);

            Map<String, Object> map = new HashMap<>();
            map.put("returnList", returnList);
            map.put("count",pageHelperList.getTotal());
            return R.ok(map);
        }catch (Exception e){
            return R.error("查询失败");
        }
    }


    @PostMapping("/return/add")
    @ApiOperation("添加退货单")
    public R addReturn(@RequestBody ReturnBill returnBill){

        try{
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }

    }

    @PutMapping("/return/check/{id}")
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
