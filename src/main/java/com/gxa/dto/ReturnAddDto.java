package com.gxa.dto;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class ReturnAddDto {

    @ApiModelProperty("退货单创建日期")
    private Date createTime;

    @ApiModelProperty("退货日期")
    private Date returnTime;

    @ApiModelProperty("供应商编号")
    private Integer sid ;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty("退货地址")
    private String address;

    @ApiModelProperty("退货联系人")
    private String contact;

    @ApiModelProperty("退货联系人电话")
    private String phone;

    @ApiModelProperty("退货仓库")
    private Integer repositoryId;

    @ApiModelProperty("退货方式")
    private Integer type;

    @ApiModelProperty("退货发起人id")
    private Integer initiatorId;

    @ApiModelProperty("退货数量")
    private Integer returnQty;

    @ApiModelProperty("商品id")
    private Integer goodsDetailId;

    @ApiModelProperty("退货单id")
    private Integer returnBillId;
}
