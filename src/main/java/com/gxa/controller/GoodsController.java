package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.GoodsDetailsDto;
import com.gxa.dto.GoodsDto;
import com.gxa.entity.Goods;
import com.gxa.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Api(tags = "商品列表")
public class GoodsController {
    //查询
    @Autowired
    private GoodsService goodsService;
    @GetMapping("/goods/list")
    @ApiOperation("商品的列表")

    public R queryAll(){

        try {
            List<Goods> goods = this.goodsService.queryGoods();
            Map<String,Object> map = new HashMap<>();
            map.put("goods",goods);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

    }

    //  添加商品
    @PostMapping("/goods/add")
    @ApiOperation("商品的添加操作")
    public R insert(){
//        Result result=new Result(0,"增加操作",null,null);
        return  R.ok();
    }
    //根据id编辑
    @PostMapping("goods/updats")
    @ApiOperation("根据id查询商品")
    public R update(Integer gid){
//        Result result =new Result(0,"修改操作",null,null);
        return R.ok();
    }

    //根据id删除
    @DeleteMapping("/goods/del")
    @ApiOperation("根据id删除数据")
    public R delete(Integer gid){
//        Result result =new Result(0,"删除操作",null,null);
        return R.ok();

    }
    @GetMapping("/goods/bytest")
    @ApiOperation("根据商品条件查询")
    public R queryByCondition(GoodsDto goodsDto){

        return R.ok();
    }




}
