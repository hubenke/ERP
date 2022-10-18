package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.dto.RegionDto;
import com.gxa.dto.SupplierDto;
import com.gxa.common.uitls.R;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Emp;
import com.gxa.entity.GoodsDetail;
import com.gxa.entity.Region;
import com.gxa.entity.Supplier;
import com.gxa.service.SupplierService;
import com.gxa.service.impl.SupplierServiceImpl;
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
public class SupplierController {

    @Autowired
    private SupplierService supplierService;
    @ApiOperation("点击供应商管理，供应商页面数据展示")
    @PostMapping("/suppiler/slist")
    public R queryAll(@RequestBody SupplierDto supplierDto) {

        System.out.println("前端的数据是-----------"+supplierDto);

        Page<Map<String,Object>> pageHelperList = PageHelper.startPage(supplierDto.getPage(), supplierDto.getLimit());  //使用此方法进行分页

        List<Supplier> suppliers = this.supplierService.queryAll(supplierDto);//调用service

        Map map =new HashMap();
        map.put("suppliers",suppliers);//将数据放入map
        map.put("count",pageHelperList.getTotal());
        return R.ok(map);//返回数据
    }

    @PostMapping("/suppiler/BasicAdd")
    @ApiOperation("添加供应商-基本信息-保存")
    public R suppilerBasicAdd(Supplier supplier){

        System.out.println(supplier);

        int i = this.supplierService.addSuppiler(supplier);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }

    }


    @GetMapping("/supplier/site")
    @ApiOperation("查询省市接口")
    public R querySite(RegionDto regionDto){


        List<Region> regionList = this.supplierService.querySite(regionDto);
        System.out.println("区域是"+regionList);

        Map map = new HashMap();
        map.put("list",regionList);

        return R.ok(map);
    }
    @ApiOperation("绑定商品查询")
    @GetMapping("/suppiler/googs")
    public R queryGoods() {

        List<GoodsDetail> goodsDetails = this.supplierService.queryGoogs();

        Map<String,Object> map =new HashMap<>();

        map.put("goodsDetails",goodsDetails);

        return R.ok(map);
    }

    @PostMapping("/suppiler/goodsAdd")
    @ApiOperation("需要供应商的id，商品编号，多个商品编号使用字符串传输过来 String类型")
    public R suppiler(@ApiParam("商品编号构成的字符数组") String ids,@ApiParam("供应商id") Integer sid){

        System.out.println("ids是----"+ids+"sid是+----"+sid);

        int i = this.supplierService.addGoods(ids, sid);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }

    }

    @ApiOperation("供应商管理编辑，需要带供应商编号")
    @GetMapping("/suppiler/selSuppile")
    public R selSuppile(Supplier supplier,RegionDto regionDto ) {

        Integer sid = supplier.getSid();

        List<Supplier> suppliers = this.supplierService.queryById(sid); //编辑页面查询

        List<Region> regionList = this.supplierService.querySite(regionDto); //查询省市

        Map<String,Object> map =new HashMap<>();
        map.put("suppliers",suppliers);
        map.put("regionList",regionList);

        return R.ok(map);
    }

    @ApiOperation("编辑供应商信息保存")
    @PutMapping("/suppiler/update")
    public R updateSupplier(Supplier supplier){

        int i = this.supplierService.updateSupplier(supplier);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }
    }

    @ApiOperation("编辑供应商关联商品接口")
    @PutMapping("/sippiler/editgoods")
    public R editGoods(@ApiParam("商品编号构成的字符串，逗号隔开") String ids,Integer sid){

        int i = this.supplierService.updateGoods(ids, sid);

        if (i != 0){
            return R.ok();
        }else {
            return R.error();
        }
    }

    @GetMapping("/sippiler/introducer")
    @ApiOperation("引进负责人查询")
    public R queryIntroducer(){

        List<Emp> emps = this.supplierService.queryIntroducer();

        Map<String,Object> map =new HashMap<>();
        map.put("emps",emps);

        return R.ok(map);
    }


}
