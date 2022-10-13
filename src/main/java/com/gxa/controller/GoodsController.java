package com.gxa.controller;

import com.gxa.dto.GoodsDto;
import com.gxa.entity.Goods;
import com.gxa.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:
 * @ClassName:GoodsController
 * @Package:com.gxa.controller.GoodsController
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@RestController
@Api(tags = "商品列表接口")
public class GoodsController {
    //查询
    @GetMapping("/goods/list")
    @ApiOperation("商品列表")
    public R queryAll(){
        Goods goods =new Goods(1120,"神仙水",null,1200.00,800.00,"sk-2",1);
        List<Goods> list =new ArrayList<>();
        list.add(goods);
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);

        return R.ok(map);


//        R r =new R(0,"查询操作",null,null);
//        return r;
    }

    //  添加商品
    @ApiOperation("添加商品")
    @PostMapping("/goods/add")
    public R insert(){
        return  R.ok();
    }
    //根据id编辑
    @ApiOperation("商品编辑操作")
    @PostMapping("/goods/updats")
    public R update(Integer gid,@RequestBody Goods goods){
        return R.ok();
    }


    //根据id删除
    @ApiOperation("商品删除操作")
    @DeleteMapping("/goods/del")
    public R delete(Integer gid){
        return R.ok();

    }
    @GetMapping("/goods/querybytest")
    @ApiOperation("根据商品条件查询")
    public R queryById(GoodsDto goodsDto){

        return R.ok();
    }




}
