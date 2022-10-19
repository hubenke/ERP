package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiModel("指派条件查询")
public class AssignDto {
    @ApiModelProperty("员工编号")
    private Integer eid;

    @ApiModelProperty("员工姓名")
    private String ename;

    private Integer limit;

    private Integer page;
}
