package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("退货单条件模型")
public class ReturnBillDto {

    @ApiModelProperty("退货单状态")
    private Integer status;

    @ApiModelProperty("退货单创建日期")
    private Date createTime;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty("退货仓库")
    private String rname;
}
