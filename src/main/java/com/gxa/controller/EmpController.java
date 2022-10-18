package com.gxa.controller;

import com.gxa.common.uitls.R;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Emp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "员工接口")
@RestController
public class EmpController {
//    @Autowired
//    private EmpService empService;
//    private

    @GetMapping("/emp/list")
    @ApiOperation("员工数据")
    public R queryAll(){
//            List<Outbound> outbounds = this.outboundService.queryOutbound();
        try {
            List outbounds = new ArrayList();
            outbounds.add("s");
            outbounds.add("2");
            outbounds.add("p");
            Map map = new HashMap();
            map.put("outbounds",outbounds);
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }
    @GetMapping("/empDto/list")
    @ApiOperation("员工条件查询")
        public R queryByEmpDto(@RequestBody EmpDto empDto){
        try {
            List outbounds = new ArrayList();
            outbounds.add("s");
            outbounds.add("2");
            outbounds.add("p");
            Map map = new HashMap();
            map.put("outbounds",outbounds);
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

            return R.ok("添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("添加失败");
        }
    }
    @PutMapping("/emp/{eid}")
    @ApiOperation("根据id修改员工数据")
    public R updateEmp(@PathVariable("eid") Integer eid) {
        try {

            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败");
        }
    }

//    @PutMapping("/emp/{tel}")
//    @ApiOperation("修改手机号")
//    public R uptatel(@PathVariable("tel") Integer tel) {
//        try {
//            return R.ok("修改成功");
//        }catch (Exception e){
//            e.printStackTrace();
//            return R.error("修改失败");
//        }
//
//    }


}
