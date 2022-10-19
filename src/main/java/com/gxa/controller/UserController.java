package com.gxa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gxa.common.uitls.R;
import com.gxa.entity.User;
import com.gxa.service.UserService;
import io.swagger.annotations.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;


    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "Authorization", value = "令牌", paramType = "header", required = true),
            @ApiImplicitParam(name = "uname", value = "当前登录用户的账号，由后台从令牌中解析取得", required = true),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "返回用户详细信息"),
            @ApiResponse(code = 306, message = "登录已超时，请重新登录"),
            @ApiResponse(code = 307, message = "令牌格式不正确"),
            @ApiResponse(code = 401, message = "没有权限"),
            @ApiResponse(code = 403, message = "无效请求，本系统只支持AJAX请求"),
            @ApiResponse(code = 500, message = "服务器内部错误")
    })
    @ApiOperation("用户登录")
    @PostMapping("/user/login")
    public R login(User user){
        try {
           this.userService.login(user);//测试失败
//        if (login !=null){
            return R.ok("登录成功");
//        }else {

        }catch (Exception e){
            e.printStackTrace();
            return R.error("登录失败");
        }


//        System.out.println();
//        Subject subject =SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(user.getUname(),user.getPassword());




        //Subject subject = SecurityUtils.getSubject();
        //根据传过来的用户名 和 密码创建一个token
        //String jwtToken = JwtUtil.getJwtToken(user.getUname(),user.getPassword());

        //转换成OAuth2Token
        //OAuth2Token oAuth2Token = new OAuth2Token(jwtToken);
 }

  @ApiOperation("用户修改")
  @PostMapping("/user/updat") //测试失败
  public  R update(Integer id){
        try {
            this.userService.updateById(id);
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

  }



    @GetMapping("/user/loginout")
    @ApiOperation("退出登陆")
    public R loginout(User user){//测试失败
        try {
            this.userService.login(user);
            return  R.ok("退出登录成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("退出登录失败");
        }

    }

    @GetMapping("/user")
    @ApiOperation("查询所有用户")
    public R List(@ApiParam("页数") Integer page,@ApiParam("条数") Integer limit){
        try {
            Page<Map<String,Object>> pageHelperList = PageHelper.startPage(page,limit);
            List<User> users =this.userService.queryAll();
            System.out.println("users:-------" +users.toString());
            System.out.println("count:------"+pageHelperList.getTotal());
            Map<String,Object> map =new HashMap<>();
            map.put("user",users);
            map.put("count",pageHelperList.getTotal());
            return R.ok(map);
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }
    }

    @PostMapping("/user/add")
    @ApiOperation("添加权限分配")
    public R add( User user){
       try {
           this.userService.add(user);
           return R.ok("添加成功");
       }catch (Exception e){
           e.printStackTrace();
           return R.error("添加失败");
       }

    }


    @PutMapping("/user/uid")
    @ApiOperation("修改用户信息")
    public R updateById(Integer uid){
        try {
          this.userService.updateById(uid);
            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败,请重新再试");
        }


    }

    @PutMapping("/user/updaname")
    @ApiOperation("修改用户名和密码")
    public R updateNameAndPwd(User user){
        try {
            this.userService.updateNameAndPwd(user);
            return R.ok("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("修改失败");
        }
    }


    @GetMapping("/uesr/queryId")
    @ApiOperation("根据id查询用户")
    public R queryByUid( Integer id) {//失败
        try {
            this.userService.queryByUid(id);
            return R.ok("查询成功");
        }catch (Exception e){
            e.printStackTrace();
            return R.error("查询失败");
        }

    }

    //盐值计算

}
