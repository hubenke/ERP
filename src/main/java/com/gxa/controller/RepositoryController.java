package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.entity.Repository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "仓库接口")
@RestController
public class RepositoryController {
//    @Autowired
//    private RepositoryService repositoryService;

//    @GetMapping("/repository/structure")
//    @ApiOperation("点击仓库结构，呈现数据")
//    public R queryStructure(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//    @PostMapping("/repository/regionAdd")
//    @ApiOperation("添加仓库结构区域数据")
//    public R addRegion(@RequestBody Repository repository){
//        try {
//            return R.ok("添加成功");
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("添加失败");
//        }
//    }
//
//    @PostMapping("/repository/cargoAdd")
//    @ApiOperation("添加仓库结构货架数据")
//    public R addCargo(@RequestBody Repository repository){
//        try {
//            return R.ok("添加成功");
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("添加失败");
//        }
//    }
//
//
//    @PutMapping("/repository/{rid}")
//    @ApiOperation("根据id修改仓库数据")
//    public R updateRepository(@PathVariable("rid") Integer rid){
//        try {
//            return R.ok("修改成功");
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("修改失败");
//        }
//    }
//
//
//
//
//    @GetMapping("/repository/warehouse")
//    @ApiOperation("点击仓储管理，呈现数据")
//    public R  queryWarehouse(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//    @GetMapping("/repository/warehouse")
//    @ApiOperation("按商品显示，呈现数据")
//    public R  queryGoods(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//
//
//    @GetMapping("/repository/sift")
//    @ApiOperation("仓促管理数据筛选")
//    public R  queryDto(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//
//
//    @PutMapping("/repository/sift")
//    @ApiOperation("移库")
//    public R updateNum (){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//
//    @PutMapping("/repository/Allocate")
//    @ApiOperation("调拨确定")
//    public R updateAllocate (){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//
//
//    @GetMapping("/repository/warehouse")
//    @ApiOperation("仓库报表，呈现数据")
//    public R  queryform(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//    public R  queryFormDto(){
//        List repositories = new ArrayList();
//        repositories.add("s");
//        repositories.add("2");
//        repositories.add("p");
//        Map map = new HashMap();
//        map.put("repositories",repositories);
//        return R.ok(map);
//    }
//
//
//
//
//
//
//
//
//
//





}
