package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Emp;
import com.gxa.service.EmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "员工接口")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/empDto/list")
    @ApiOperation("员工数据")
    public R queryEmpDto(@RequestBody EmpDto empDto){

        try {
            Page<Map<String,Object>> pageHelperList = PageHelper.startPage(empDto.getPage(), empDto.getLimit());
            List<Emp> emps = this.empService.queryEmpDto(empDto);
            Map<String,Object> map = new HashMap<>();
            map.put("emps",emps);
            map.put("count",pageHelperList.getTotal());
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }
    @PostMapping("/emp/add")
    @ApiOperation("添加员工")
    public R addEmp(@RequestBody Emp emp) {
        try {
            this.empService.addEmp(emp);
            return R.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    @PostMapping("/emp/update")
    @ApiOperation("根据员工编号修改员工数据")
    public R updateEmp(@RequestBody Emp emp) {
        try {
            this.empService.updateEmpByEid(emp);
            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }
}
