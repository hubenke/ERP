package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.RepositoryDto;
import com.gxa.dto.StockUpdateDto;
import com.gxa.entity.Cargo;
import com.gxa.entity.Repository;
import com.gxa.service.RepositoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "仓库接口")
@RestController
public class RepositoryController {

    @Autowired
   private RepositoryService repositoryService ;
    @GetMapping("/repository/structure")
    @ApiOperation("点击仓库结构，呈现数据")
    public R queryStructure(){
        List<Repository> repositories = repositoryService.queryStructure();
        Map<String,Object> map = new HashMap();
        map.put("repositories",repositories);
        return R.ok(map);
    }






    @PostMapping("/repository/repositoryAdd")
    @ApiOperation("添加仓库确定")
    public R addNew(@RequestBody Repository repository){

        repositoryService.addNew(repository);
        Map<String,Object> map = new HashMap();
        map.put("repositories",repository);

        try {
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }




    @PostMapping("/repository/areaAdd")
    @ApiOperation("添加仓库结构区域数据")
    public R addArea(@RequestBody Cargo cargo){

        repositoryService.addArea(cargo);


        try {
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }






    @GetMapping
    @ApiOperation("点击新增货架，根据当前仓库名称给所属仓库赋值，并且返回仓库名称，接收查询到的区域名称集合")
    @PostMapping("/repository/queryArea")
    public R queryArea(@ApiParam("仓库名称") String rname){
        List<Cargo> cargos = repositoryService.queryLevelByRnameCargos(rname);

        Map<String,Object> map = new HashMap();
        map.put("cargos",cargos);

        try {
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/repository/cargoAdd")
    @ApiOperation("点击添加仓库结构货架数据，返回当前仓库名称，货架名称，区域名称")
    public R addCargo(@RequestBody Cargo cargo){
        repositoryService.addCargo(cargo);
        try {
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }


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




    @PostMapping("/repository/warehouse")
    @ApiOperation("点击仓储管理，呈现数据,且按条件查询")
    public R  queryWarehouse(@RequestBody RepositoryDto repositoryDto){



      try {List<Repository> repositories = this.repositoryService.queryAll(repositoryDto);

          Map<String,Object> map = new HashMap<>();
          map.put("repositories",repositories);
          return R.ok(map);}
      catch (Exception e) {
          e.printStackTrace();
          return R.error("查询失败");
      }

    }





    @GetMapping("/repository/queryHouseAndArea")
    @ApiOperation("点击筛选，查询已有仓库和区域")
    public R queryStorehouse(){
        List<Repository> houseAndArea = this.repositoryService.queryStoreAndArea();


        Map<String,Object> map = new HashMap();
        map.put("houseAndArea",houseAndArea);

        try {
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }





//
//    @GetMapping("/repository/")
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



//    @PutMapping("/repository/past")
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


    @PutMapping("/repository/Allocate")
    @ApiOperation("调拨确定")
    public R updateAllocate (StockUpdateDto stockUpdateDto) {
        repositoryService.updateStock(stockUpdateDto);
        try {
            return R.ok("调拨完成");

        } catch (Exception e) {
            return R.error("调拨失败");
        }


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


    }

}
