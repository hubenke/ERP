package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("请购单商品详情")
@Data
public
class ApplyGoods {

    @ApiModelProperty("请购表id")
    private Integer did ;

    @ApiModelProperty("请购数量")
    private Integer requestqty;


    @ApiModelProperty("请购单")
    private Apply apply;

    @ApiModelProperty("商品编号")
    private Goods goods;


}
