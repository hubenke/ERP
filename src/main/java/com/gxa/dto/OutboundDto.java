package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@ApiModel("出库数据传输")
public class OutboundDto {
    @ApiModelProperty("配送方式")
    private Integer type;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("出库时间")
    private Date outTime;

    @ApiModelProperty("出货仓库")
    private String rid;

    @ApiModelProperty("订单编号")
    private Integer outno;

    private Integer limit;

    private Integer page;
}
