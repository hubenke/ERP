package com.gxa.controller;

import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.GoodsQueryDto;
import com.gxa.dto.GoodsTypeConditionDto;
import com.gxa.dto.GoodsTypeQueryDto;
import com.gxa.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "商品属性")
public class GoodsAttributeController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("/goods/goodsAttribute")
    @ApiOperation("根据分页和条件查询商品属性")
    public R queryGoodsAttribute(@RequestBody GoodsTypeConditionDto goodsTypeConditionDto){
        try {
            PageHelper.startPage(goodsTypeConditionDto.getPage(), goodsTypeConditionDto.getLimit());
            List<GoodsTypeQueryDto> goodsAttribute = this.goodsService.queryGoodsAttribute(goodsTypeConditionDto);
            Map<String,Object> map = new HashMap<>();
            map.put("goodsAttribute",goodsAttribute);
            return  R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("查询失败");
        }

    }

    @PutMapping("/goods/updateGoodsAttr")
    public R updateGoodsAttribute(@RequestBody GoodsTypeQueryDto goodsTypeQueryDto){
        try {
            this.goodsService.updateGoodsAttribute(goodsTypeQueryDto);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }

    }



}
