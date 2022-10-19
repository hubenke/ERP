package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品")
public class GoodsDto {
    @ApiModelProperty("商品编号")
    private Integer did;

    @ApiModelProperty("商品名称")
    private String gname;

    @ApiModelProperty("商品品牌")
    private String brand;

    @ApiModelProperty("状态 1:上架 0:下架")
    private Integer status;

    @ApiModelProperty("页数")
    private Integer page;

    @ApiModelProperty("条数")
    private Integer limit;
}
