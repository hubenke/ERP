package com.gxa.controller;

import com.gxa.common.uitls.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author:
 * @ClassName:GoodsController
 * @Package:com.gxa.controller.GoodsController
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@RestController
public class GoodsController {
    //查询
    @GetMapping("/goods/list")
    public R queryAll(){
//        Result result =new Result(0,"查询操作",null,null);
        return R.ok();
    }

    //  添加商品
    @PostMapping("/goods/add")
    public R insert(){
//        Result result=new Result(0,"增加操作",null,null);
        return  R.ok();
    }
    //根据id编辑
    @PostMapping("goods/updats")
    public R update(Integer gid){
//        Result result =new Result(0,"修改操作",null,null);
        return R.ok();
    }

    //根据id删除
    @DeleteMapping("/goods/del")
    public R delete(Integer gid){
//        Result result =new Result(0,"删除操作",null,null);
        return R.ok();

    }




}
