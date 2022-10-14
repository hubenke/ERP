package com.gxa.controller;


import com.gxa.common.uitls.R;
import io.swagger.annotations.ApiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:
 * @ClassName:DetailsController
 * @Package:com.gxa.controller.DetailsController
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@RestController
@ApiModel("")
public class DetailsController {
    //查询
    @GetMapping("/details/list")
    public R queryAll(){
//        Result result =new  Result(0,"查询",null,null);
        return  R.ok();
    }

    //添加
    @PostMapping("/details/add")
    public R add(){
//        Result result =new Result(0,"添加",null,null);
        return  R.ok();
    }

}
