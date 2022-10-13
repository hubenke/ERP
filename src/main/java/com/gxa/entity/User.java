package com.gxa.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户")
public class User {
    @ApiModelProperty("用户id")
    private Integer uid;
    @ApiModelProperty("用户名")
    private String uname;
    @ApiModelProperty(value="密码",required = true)
    private String password;
    @ApiModelProperty(value = "盐值")
    private String salt;
    @ApiModelProperty(value = "手机号")
    private String tel;
    @ApiModelProperty(value = "权限   1：超级管理员    2：中级管理员     3：普通管理员   ")
    private int limit;
}
