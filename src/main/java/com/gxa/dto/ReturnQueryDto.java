package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("退货单查询模型")
public class ReturnQueryDto {

    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("发起日期")
    private Date createTime;

    @ApiModelProperty("退货日期")
    private Date returnTime;

    @ApiModelProperty("退货单号")
    private String returnNo;

    @ApiModelProperty("退货单状态")
    private Integer status;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty("发起人")
    private String initiatorName;

    @ApiModelProperty("退货仓库")
    private String rname;

    @ApiModelProperty("退货方式")
    private Integer type;

    @ApiModelProperty("退货联系人")
    private String contact;
}
