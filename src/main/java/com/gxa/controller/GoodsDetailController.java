package com.gxa.controller;

import com.gxa.dto.GoodsDetailsDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Api(tags = "销售详情接口")
public class GoodsDetailController {

    //查询
    @GetMapping("/goodsdetail/querys")
    @ApiOperation("查询列表商品")
    public R queryAllDetail(){
        Goods goods =new Goods();
        GoodsDetail goodsDetail = new GoodsDetail(1,1,"男鞋","黑色",39,"板鞋","双",goods );
        List<GoodsDetail> lists = new ArrayList<>();
        lists.add(goodsDetail);
        Map<String,Object> map = new HashMap<>();
        map.put("lists",lists);


        return  R.ok(map);
    }

    //添加
    @PostMapping("/goodsdetail/adds")
    @ApiOperation("商品添加操作")
    public R addDetail(){

        return  R.ok();
    }


    @PostMapping("/goodsdetail/queryids")
    @ApiOperation("根据商品id查询")
    public R queryById(Integer did){
        return R.ok();
    }


    @GetMapping("/goodsdetail/bytests")
    @ApiOperation("根据商品条件查询")
    public R queryByCondition(GoodsDetailsDto goodsDetailsDto){

        return R.ok();
    }




    @GetMapping("/goodsdetail/querycolors")
    @ApiOperation("根据商品条件属性查询")
    public R queryByColor(GoodsDetailsDto goodsDetailsDto){
        return R.ok();
    }

    @DeleteMapping("/goodsdetail/deletes")
    @ApiOperation("根据商品属性删除")
    public  R  queryBySize(String color){
        return R.ok();
    }

    @PostMapping("/goodsdetail/add")
    @ApiOperation("根据商品属性添加")
    public R addGoodsDetails(){
        return  R.ok();
    }

    @PostMapping("/goodsdetail/updatss")
    @ApiOperation("根据商品属性编辑商品")
    public R updateGoodsDetails(){

        return R.ok();
   }




}
