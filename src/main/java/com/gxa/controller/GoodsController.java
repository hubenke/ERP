package com.gxa.controller;

import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.GoodsDto;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.entity.Goods;
import com.gxa.entity.GoodsDetail;
import com.gxa.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Api(tags = "商品列表")
public class GoodsController {
    //查询
    @Autowired
    private GoodsService goodsService;

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

<<<<<<< HEAD
    @GetMapping("/goods/queryType")
    @ApiOperation("查询所有分类")
    public  R selectType(){
        try {
            List<GoodsDetail> goodsDetailList = this.goodsService.selectType();
=======

    @PostMapping("/goodsByGoodsDto/list")
    @ApiOperation("根据商品条件查询")
    public R queryByCondition(@RequestBody GoodsDto goodsDto){
//        try {
            List<Goods> goodsList = this.goodsService.queryAllByGoodsDto(goodsDto);
>>>>>>> 033975baa0d77849647d3329ed9d4eaa67bf80cc
            Map<String,Object> map = new HashMap<>();
            map.put("type",goodsDetailList);
            return R.ok(map);
<<<<<<< HEAD
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }
=======

//        }catch (Exception e){
//
//            e.printStackTrace();
//            return R.error("查询失败");
//        }
>>>>>>> 033975baa0d77849647d3329ed9d4eaa67bf80cc

    }

    //  添加商品
    @PostMapping("/goods/add")
    @ApiOperation("商品的添加操作")
    public R addGoods(@RequestBody Goods goods){
        int i = this.goodsService.addGoods(goods);
        if(i != 0){
            return R.ok();
        }else {
            return R.error("添加失败");
        }
    }

    //根据id编辑
    @PutMapping("goods/update")
    @ApiOperation("根据id修改商品")
    public R update(@RequestBody GoodsDetail goodsDetail){
        try {
            this.goodsService.updateGoodsById(goodsDetail);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }

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
