package com.gxa.entity;

import io.swagger.annotations.ApiModelProperty;

public
class ApplyDetail {

    @ApiModelProperty("请购表id")
    private Integer did ;

    @ApiModelProperty("请购数量")
    private Integer requestqty;

    @ApiModelProperty("请购单")
    private Apply apply;

//    @ApiModelProperty("商品编号")
//    private Goods goods;


}
