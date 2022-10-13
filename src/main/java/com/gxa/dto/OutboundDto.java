package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("出库数据传输")
public class OutboundDto {
    @ApiModelProperty("配送方式")
    private String type;

    @ApiModelProperty("出库时间")
    private Date outTime;

    @ApiModelProperty("chu出货仓库")
    private String repositoryId;

    @ApiModelProperty("订单编号")
    private Integer outno;
}
