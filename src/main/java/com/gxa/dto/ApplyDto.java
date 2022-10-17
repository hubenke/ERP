package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("请购单条件模型")
public
class ApplyDto {

    @ApiModelProperty("请购单创建日期")
    private Date createTime;

    @ApiModelProperty("请购审核人")
    private String applyChecker;

    @ApiModelProperty("请购发起人")
    private String applyLaunch ;
}
