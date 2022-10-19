package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.ReturnAddDto;
import com.gxa.dto.ReturnBillDto;
import com.gxa.dto.ReturnQueryDto;
import com.gxa.entity.ReturnBill;
import com.gxa.service.ReturnGoodsService;
import com.gxa.service.ReturnService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@Api(tags = "退货单接口")
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    @Autowired
    private ReturnGoodsService returnGoodsService;

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
    public R addReturnBill(@RequestBody ReturnAddDto returnAddDto){
        //构建退货单编号
        String returnNo = this.createReturnNo();
        returnAddDto.getReturnBill().setReturnNo(returnNo);

        try{
            returnGoodsService.addReturn(returnAddDto);
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }

    }

    @PutMapping("/return/check")
    @ApiOperation("根据Id审核退货单")
    public R checkReturn(@ApiParam("退货单id") Integer id, @ApiParam("按钮id")Integer btnNum){
        try{
            returnService.updateStatus(id,btnNum);
            return R.ok("审核通过");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("审核失败");
        }
    }

    @GetMapping("/return/queryReturnType")
    @ApiOperation("查询退货方式")
    public R queryReturnType(){
        int[] types = returnService.queryReturnType();
        Map<String, Object> map = new HashMap<>();
        map.put("types", types);
        return R.ok(map);
    }

    //构建退货单编号
    private String createReturnNo(){
        StringBuilder sb = new StringBuilder();

        //获取当前日期
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        sb.append("CG" + year + month + day);

        Random random = new Random();
        int ends = random.nextInt(99);
        String format = String.format("%02d", ends);//如果不足两位，前面补0
        sb.append(format);

        return sb.toString();
    }

}
