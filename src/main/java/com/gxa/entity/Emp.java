package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("员工实体类")
public class Emp {
    @ApiModelProperty("id")
    private Integer eid;

    @ApiModelProperty("姓名")
    private String ename;

    @ApiModelProperty("账号")
    private String account;

    @ApiModelProperty("部门")
    private String department;

    @ApiModelProperty("职务")
    private String post;

    @ApiModelProperty("电话")
    private String tel;

    @ApiModelProperty("员工状态")
    private Integer status;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("上级")
    private Integer mgr;

    @ApiModelProperty("用户引用")
    private User user;

}
