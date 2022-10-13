package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("采购单详情模型")
public class PurchaseDetail {
    @ApiModelProperty("采购单详情id")
    private Integer id;

    @ApiModelProperty("购买数量")
    private Integer buyQty;

    @ApiModelProperty("采购单id")
    //数据库中有这个字段，但是采购单实体类中有采购单id了----“id”
    private Integer purchaseId;

    @ApiModelProperty("商品id")
    private Integer goodsId;
}
