package com.gxa.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gxa.entity.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("按条件筛选仓储")
public
class RepositoryDto {
    @JsonProperty(value = "rname")
    @ApiModelProperty("仓库名称")
    private String rname;

    @JsonProperty(value = "area")
    @ApiModelProperty("所属区域")
    private String area;


    @JsonProperty(value = "typeA")
    @ApiModelProperty("商品品类，对应商品一级类")
    private Integer typeA;

    @JsonProperty(value = "goodsName")
    @ApiModelProperty("商品名称")
    private String goodsName;


    @JsonProperty(value = "brand")
    @ApiModelProperty("商品品牌")
    private String brand;














}
