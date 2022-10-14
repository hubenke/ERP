package com.gxa.controller;

import com.gxa.dto.SupplierDto;
import com.gxa.common.uitls.R;
import com.gxa.dto.SupplierDto;
import com.gxa.entity.Supplier;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Api(tags = "供应商接口")
@RestController
public
class SupplierController {
    @ApiOperation(value = "点击供应商，供应商页面数据展示")
    @GetMapping("/suppiler/slist/")
    public R queryAll() {

        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);





        return R.ok(map);
    }



    @ApiOperation(value = "按条件查询供应商")
    @GetMapping("/supplier/condition")
    public R querybyCondition(@RequestBody SupplierDto suppierDto){
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }



//    @ApiOperation(value = "点击商品添加，数据显示")
//    @GetMapping()
//    public R suppilerAddList(){
//        return null;
//
//    }

//
//    @PostMapping("/suppiler/BasicAdd")
//    @ApiOperation(value = "供应商基本信息保存")
//    public R suppilerAdd(Integer sid){
//        List list =new ArrayList();
//        list.add("供应商信息");
//        R r = new R(0,"suc",list);
//
//       return r;
//    }


//    @ApiOperation(value = "点击绑定商品，商品下拉框信息")
//    @GetMapping("/suppiler/goodsInfo")
//    public
//    R queryGoods() {
//
//        List list =new ArrayList();
//
//        list.add("可以传");
//
//        R r = new R(0,"suc",list);
//
//
//        return r;
//    }



    @PostMapping("/suppiler/BasicAdd")
    @ApiOperation(value = "添加供应商基本信息保存")
    public R suppilerBasicAdd(@RequestBody Supplier supplier){
        List list =new ArrayList();
        list.add("可以传");
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




        //创建一个int类型的数组.
//        int [] numberArr = new int[ids.length];
//
//        //把strArr中的数据进行类型转换并存入到int数组中
//        for (int i = 0; i < ids.length; i++) {
//            int number = Integer.parseInt(ids[i]);
//            numberArr[i] = number;
//        }





        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);

    }





//    @ApiOperation("点击供应商编辑，根据供应商编号传输当前供应商信息")
//    @GetMapping("/suppiler/supplierinfo/{sid}")
//    public R querybyId(@PathVariable("sid") Integer sid) {
//        List list =new ArrayList();
//        list.add("供应商信息");
//        R r = new R(0,"suc",list);
//
//        return r;
//    }


    @ApiOperation("编辑绑定商品保存，传输的数据需要编辑后剩下的绑定商品的商品编号构成的数组和当前供应商编号")
    @PutMapping("/suppiler/updateGoods/{sid}")
    public R updateGoods(@PathVariable("sid")Integer sid,@ApiParam("商品编号构成的字符数组") String[] ids) {
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }

    @ApiOperation("编辑基本信息保存，传输的数据")
    @PutMapping("/suppiler/updateBasic/")
    public R updateBasic(@RequestBody Supplier supplier ) {
        List list =new ArrayList();
        list.add("可以传");
        Map<String,Object> map =new HashMap<>();
        map.put("list",list);



        return R.ok(map);
    }
//,@PathVariable("sid")Integer sid












}
