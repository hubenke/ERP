package com.gxa.dto;

import com.gxa.entity.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("按条件筛选仓储")
public
class RepositoryDto {

    @ApiModelProperty("仓库名称")
    private String rname;


    @ApiModelProperty("所属区域")
    private String area;



    @ApiModelProperty("商品品类，对应商品一级类")
    private Integer type_A;


    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("商品品牌")
    private String brand;














}
