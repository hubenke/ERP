package com.gxa.controller;

import com.gxa.dto.SupplierDto;
import com.gxa.common.uitls.R;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Region;
import com.gxa.entity.Supplier;
import com.gxa.service.SupplierService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Api(tags = "供应商接口")
@RestController
public
class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @ApiOperation("点击供应商管理，供应商页面数据展示")
    @GetMapping("/suppiler/slist")
    public R queryAll() {

        List list =new ArrayList();
        list.add("成功");
//        List<Supplier> suppliers = this.supplierService.queryAll();

        Map map =new HashMap();
        map.put("list",list);

        return R.ok(map);
    }

    @PostMapping("/suppiler/BasicAdd")
    @ApiOperation(value = "添加供应商基本信息保存")
    public R suppilerBasicAdd(@RequestBody Supplier supplier){
        List list =new ArrayList();
        list.add("可以传");

        Map map =new HashMap();
        map.put("list",list);



        return R.ok(map);
    }


    @GetMapping("/supplier/site")
    @ApiOperation("查询省市接口")
    public R querySite(){


        List<Region> regionList = this.supplierService.querySite();
        System.out.println("区域是"+regionList);

        Map map = new HashMap();
        map.put("list",regionList);

        return R.ok(map);
    }

//    @ApiOperation("编辑绑定商品保存，传输的数据需要编辑后剩下的绑定商品的商品编号构成的数组和当前供应商编号")@ApiParam("商品编号构成的字符数组") String[] ids
    @ApiOperation("供应管理编辑，需要带供应商编号")
    @PutMapping("/suppiler/updateGoods/{sid}")
    public R updateGoods(@PathVariable("sid")Integer sid) {
        List list =new ArrayList();
        list.add("可以传");
        list.add(1);
        list.add(2);
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }


    @PostMapping("/suppiler/goodsAdd")
    @ApiOperation(value = "添加供应商绑定商品信息保存,保存的数据需要当前供应商编号和绑定商品的商品编号构成的数组")
    public R suppiler(@ApiParam("商品编号构成的字符数组") String[] ids,@PathVariable("sid")Integer sid){
        List list =new ArrayList();
        list.add("供应商信息");
        //ids = {1170,1123};

        String str = "";
        for(int i = 0;i < ids.length;i++){
            str += Integer.parseInt(ids[i]);

        }

        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);

    }


    @ApiOperation("绑定商品查询")
    @PutMapping("/suppiler/googs")
    public R queryGoods() {

        List list =new ArrayList();
        list.add(1111);
        list.add(2222);
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }













}
