package com.gxa.dto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("移库修改模型" )
public
class StockUpdateDto {
    @ApiModelProperty("移货数量")
    protected  Integer num;


    @ApiModelProperty("增加的货位名")
    protected  Integer upLocation;

    @ApiModelProperty("减少的货位名")
    protected  Integer downLocation;


}
