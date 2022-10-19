package com.gxa.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsTypeConditionDto {

    @ApiModelProperty("商品名称")
    private String gname;

    @ApiModelProperty("条数")
    private Integer limit;

    @ApiModelProperty("页数")
    private Integer page;
}
