package com.gxa.controller;

import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.GoodsDetailsDto;
import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;
import com.gxa.entity.Stock;
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

//    @GetMapping("/goods/list")
//    @ApiOperation("商品的列表")
//    public R queryAll(){
//
//        try {
//            List<Goods> goodsList = this.goodsService.queryGoods();
//            Map<String,Object> map = new HashMap<>();
//            map.put("goods",goodsList);
//            return R.ok(map);
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("请求异常");
//        }
//
//    }
//
//
//    @GetMapping("/goodsByGoodsDto/list")
//    @ApiOperation("根据商品条件查询")
//    public R queryByCondition(GoodsDto goodsDto){
//        try {
//            List<Goods> goodsList = this.goodsService.queryAllByGoodsDto(goodsDto);
//            Map<String,Object> map = new HashMap<>();
//            map.put("goods",goodsList);
//            return R.ok(map);
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("查询失败");
//        }
//
//    }
    @GetMapping("/goods/queryAll")
    @ApiOperation("查询所有商品")
    public R queryGoodsList(){
        try {
            List<GoodsQueryDto> goodsList = this.goodsService.queryGoodsList();
            Map<String,Object> map = new HashMap<>();
            map.put("goods",goodsList);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }
    }
//    @GetMapping("/goods/list")
    @PostMapping("/goods/list")
    @ApiOperation("根据商品条件查询")
//    public R queryAll(GoodsDto goodsDto){
        public R queryAll(@RequestBody GoodsDto goodsDto){
        try {
            PageHelper.startPage(goodsDto.getPage(), goodsDto.getLimit());
            List<GoodsQueryDto> goodsList = this.goodsService.queryAll(goodsDto);
            Map<String,Object> map = new HashMap<>();
            map.put("goods",goodsList);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }

    }

    @GetMapping("/goods/queryType")
    public  R selectType(){
        try {
            List<GoodsDetail> goodsDetailList = this.goodsService.selectType();
            Map<String,Object> map = new HashMap<>();
            map.put("type",goodsDetailList);
            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }

    }

    //  添加商品
    @PostMapping("/goods/add")
    @ApiOperation("商品的添加操作")
    public R addGoods(@RequestBody Goods goods){
//        Result result=new Result(0,"增加操作",null,null);
        int i = this.goodsService.addGoods(goods);
        if(i != 0){
            return R.ok();
        }else {
            return R.error("添加失败");
        }
    }
    //根据id编辑
    @PostMapping("goods/updats")
    @ApiOperation("根据id查询商品")
    public R update(Integer gid){
//        Result result =new Result(0,"修改操作",null,null);
        return R.ok();
    }

    //根据id下架商品
    @PutMapping("/goods/Shelves/{did}")
    @ApiOperation("根据id下架商品")
    public R downShelves(@PathVariable("did") Integer did){
        try {
            this.goodsService.updateShelves(did);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("下架失败");
        }

    }








}
