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

    @GetMapping("/repository/list")
    @ApiOperation("查询仓库数据")
    public R empList(){
        List repositories = new ArrayList();
        repositories.add("s");
        repositories.add("2");
        repositories.add("p");
        Map map = new HashMap();
        map.put("repositories",repositories);
        return R.ok(map);
    }
    @PostMapping("/repository/add")
    @ApiOperation("添加仓库数据")
    public R addRepository(@RequestBody Repository repository){
        try {
            return R.ok("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    @PutMapping("/repository/{rid}")
    @ApiOperation("根据id修改仓库数据")
    public R updateRepository(@PathVariable("rid") Integer rid){
        try {
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

}
