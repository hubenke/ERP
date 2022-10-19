package com.gxa.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("商品查询模型")
public class GoodsQueryDto {
    @ApiModelProperty("商品id")
    private Integer did;

    @ApiModelProperty("商品名字")
    private String gname;

    @ApiModelProperty("商品销售价格")
    private double sellingPrice;

    @ApiModelProperty("商品品牌")
    private String brand;

    @ApiModelProperty("尺寸")
    private  String size;

    @ApiModelProperty("颜色")
    private String  color;

    @ApiModelProperty("规格")
    private String spec;

    @ApiModelProperty("商品剩余可用")
    private Integer realQty;

    @ApiModelProperty("状态 1:上架 0:下架")
    private Integer status;
}
