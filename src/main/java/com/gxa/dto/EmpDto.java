package com.gxa.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("员工数据传输")
public class EmpDto {
    @ApiModelProperty("员工账号")
    private String account;

    @ApiModelProperty("员工姓名")
    private String ename;

    @ApiModelProperty("员工职位")
    private String post;

    @ApiModelProperty("员工状态")
    private Integer status;

    @ApiModelProperty("员工编号")
    private Integer eid;

    @ApiModelProperty("部门")
    private String department;
}
