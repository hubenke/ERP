package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("退货单详情模型")
public class ReturnDetail {

    @ApiModelProperty("退货单详情id")
    private Integer id;

    @ApiModelProperty("退货数量")
    private Integer returnQty;

    @ApiModelProperty("商品id")
    private Integer goodsId;

    @ApiModelProperty("退货单id")
    //数据库中有这个字段，但是退货单实体类中有id---"id"
    private Integer returnBillId;
}
