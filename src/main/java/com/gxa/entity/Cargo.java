package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("货位实体类")
public class Cargo {
    @ApiModelProperty("货位id")
    private Integer cid;

    @ApiModelProperty("货位号")
    private String location;

    @ApiModelProperty("货区")
    private String area;

    @ApiModelProperty("仓库名")
    private String rname;




    @ApiModelProperty(value = "仓库",name = "仓库")
    private Repository repository;

    @ApiModelProperty(value = "商品",name = "商品")
    private Goods goods;
}
