package com.gxa.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ApplyGoodsDto {

    @ApiModelProperty("请购表id")
    private Integer applyId;

    @ApiModelProperty("请购商品id")
    private Integer goodsId;

    @ApiModelProperty("请购数量")
    private Integer requestqty;


}
