package com.gxa.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
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


//        System.out.println();
//        Subject subject =SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(user.getUname(),user.getPassword());




        //Subject subject = SecurityUtils.getSubject();
        //根据传过来的用户名 和 密码创建一个token
        //String jwtToken = JwtUtil.getJwtToken(user.getUname(),user.getPassword());

        //转换成OAuth2Token
        //OAuth2Token oAuth2Token = new OAuth2Token(jwtToken);

        try {
//            subject.login(token);
            //登录成功
            return R.ok("redirect:/main.html");

            //subject.login(oAuth2Token);

//            Map<String,Object> map = new HashMap<>();
            //map.put("token",jwtToken);

//            return R.ok(map);
        } catch (Exception e) {
            e.printStackTrace();
            //登录失败
            return R.error("redirect:/index.html");
        }
 }


    @GetMapping("/user/loginout")
    @ApiOperation("退出登陆")
    public R loginout(){
        return  R.ok("redirect:/index.html");

    }


    @PutMapping("/user/update")
    @ApiOperation("修改用户信息")
    public R updateById(){

        try {
           // userService.updateUser(user);

            return R.ok("修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error("修改失败,请重新再试");
        }
    }

//盐值计算

    public static void main(String[] args){
        String hashAlgorithName ="MD5";
        Object credentials="zhansan";
        ByteSource salt=ByteSource.Util.bytes("123");
        SimpleHash simpleHash=new SimpleHash(hashAlgorithName,credentials,salt,1024);
        System.out.println(simpleHash);
    }






}
