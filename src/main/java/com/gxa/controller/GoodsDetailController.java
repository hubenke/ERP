package com.gxa.controller;

import com.gxa.dto.GoodsDetailsDto;
import com.gxa.entity.GoodsDetail;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//
//@RestController
//@Api(tags = "销售详情接口")
//public class GoodsDetailController {
//
//    //查询
//    @GetMapping("/goodsdetail/query")
//    @ApiOperation("查询列表商品")
//    public R queryAllDetail(){
//        GoodsDetail goodsDetail = new GoodsDetail(1,"鞋子","男鞋","黑色",39,"板鞋","双",1170);
//        List<GoodsDetail> lists = new ArrayList<>();
//        lists.add(goodsDetail);
//        Map<String,Object> map = new HashMap<>();
//        map.put("lists",lists);
//
//
//        return  R.ok(map);
//    }
//
//    //添加
//    @PostMapping("/goodsdetails/add")
//    @ApiOperation("商品添加l操作")
//    public R addDetail(){
//
//        return  R.ok();
//    }
//
//
//    @PostMapping("/goodsdetails/queryid")
//    @ApiOperation("根据商品id查询")
//    public R queryById(Integer did){
//        return R.ok();
//    }
//
//
//    @GetMapping("/goodsdetails/bytest")
//    @ApiOperation("根据商品条件查询")
//    public R queryByCondition(GoodsDetailsDto goodsDetailsDto){
//
//        return R.ok();
//    }
//
//}
