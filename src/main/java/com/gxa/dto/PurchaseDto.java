package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("采购单条件")
public class PurchaseDto {

    @ApiModelProperty("采购单状态")
    private Integer status;

    @ApiModelProperty("采购单创建日期")
    private Date createTime;

    @ApiModelProperty("供货商名称")
    private String sname;

    @ApiModelProperty("请购负责人")
    private Integer principal ;
}
