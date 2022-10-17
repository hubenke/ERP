package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("区域")
public class RegionDto {

    @ApiModelProperty("区域表id")
    private Integer id;

    @ApiModelProperty("省份")
    private String province;

    @ApiModelProperty("市")
    private String town;

    @ApiModelProperty("详细地址")
    private String address;
}
