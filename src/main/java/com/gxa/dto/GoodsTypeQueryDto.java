package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品属性返回模型")
public class GoodsTypeQueryDto {

    @ApiModelProperty("商品ID")
    private Integer did;

    @ApiModelProperty("商品名称")
    private String gname;

    @ApiModelProperty("颜色")
    private String color;

    @ApiModelProperty("尺寸")
    private String size;

    @ApiModelProperty("规格")
    private String spec;

}
