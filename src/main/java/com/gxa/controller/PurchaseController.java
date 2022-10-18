package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.PurchaseAddDto;
import com.gxa.dto.PurchaseDto;
import com.gxa.dto.PurchaseQueryDto;
import com.gxa.service.PurchaseGoodsService;
import com.gxa.service.PurchaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@Api(tags = "采购单接口")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private PurchaseGoodsService purchaseGoodsService;

    /*@GetMapping("/purchase/list")
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
    }*/

    @PostMapping("/purchase/queryByCondition")
    //@GetMapping("/purchase/queryByCondition")
    @ApiOperation("根据条件查询满足条件的采购单")
    public R queryByCondition(@RequestBody PurchaseDto purchaseDto) {

        try {
            Page<Map<String,Object>> pageHelperList = PageHelper.startPage(purchaseDto.getPage(),purchaseDto.getLimit());//进行分页
            List<PurchaseQueryDto> purchases = purchaseService.queryAll(purchaseDto);

            Map<String, Object> map = new HashMap<>();
            map.put("purchases", purchases);
            map.put("count",pageHelperList.getTotal());

            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/purchase/add")
    @ApiOperation("添加采购单")
    public R addPurchase(PurchaseAddDto purchaseAddDto) {
        //构建采购单编号
        String purchaseNo = this.createPurchaseNo();
        purchaseAddDto.getPurchase().setPurchaseNo(purchaseNo);

        int i = this.purchaseGoodsService.add(purchaseAddDto);
        if (i == 1) {
            return R.ok("添加成功");
        } else {
            return R.error(1, "添加失败");
        }
    }

    @PutMapping("/purchase/edit")
    @ApiOperation("修改采购单")
    public R updatePurchaseById(PurchaseAddDto purchaseAddDto) {

        try {
            int i = this.purchaseGoodsService.batchUpdate(purchaseAddDto);
            if (i != 0) {
                return R.ok("修改成功");
            } else {
                return R.error(1, "修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

    @PutMapping("/purchase/updateStatus")
    @ApiOperation("根据id审核/终止采购单")
    //根据按钮来判断点击的是审核还是终止
    //btnNum  1:审核  2：终止
    public R updatePurchaseStatus(@ApiParam("采购单id") Integer id, @ApiParam("按钮id")Integer btnNum) {

        try {
            int i = purchaseService.updateStatus(id, btnNum);
            if(i != 0){
                return R.ok(btnNum == 1 ? "审核通过" : "已终止");
            }else{
                return R.error("操作失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("审核失败");
        }
    }

    //构建采购单编号
    private String createPurchaseNo(){
        StringBuilder sb = new StringBuilder();

        //获取当前日期
        Date date = new Date(System.currentTimeMillis());
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();
        sb.append("CG" + year + month + day);

        Random random = new Random();
        int ends = random.nextInt(99);
        String format = String.format("%02d", ends);//如果不足两位，前面补0
        sb.append(format);

        return sb.toString();
    }

}
