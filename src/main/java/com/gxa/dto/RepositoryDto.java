package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("按条件筛选仓储")
public
class RepositoryDto {

    @ApiModelProperty("所属仓库，id")
    private Integer repositoryId;

    @ApiModelProperty("所属区域，id")
    private Date regionId;

    @ApiModelProperty("商品品类，对应商品表一级类")
    private String type;

    @ApiModelProperty("商品名称 ")
    private String goodsName;

    @ApiModelProperty("商品品牌")
    private String brand;


}
