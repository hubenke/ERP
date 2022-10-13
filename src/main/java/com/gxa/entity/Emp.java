package com.gxa.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName("emp")
@ApiModel("员工表实体类")
public class Emp {
    @ApiModelProperty("员工编号")
    private Integer eid;

    @ApiModelProperty("员工姓名")
    private String ename;

    @ApiModelProperty("员工账号")
    private String account;

    @ApiModelProperty("所在部门")
    private String department;

    @ApiModelProperty("员工岗位")
    private String post;

    @ApiModelProperty("手机号")
    private String tel;

    @ApiModelProperty("员工状态")
    private Integer status;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("直属上级")
    private String mgr;

//    @ApiModelProperty("用户id")
//    @TableField("user_id")
//    private User userId;
}
