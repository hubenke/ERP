package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品详情")
@TableName("goods_detail")
public class GoodsDetail {
    @ApiModelProperty("id")
    @TableField("did")
    private Integer did;

    @ApiModelProperty("商品一级类别  ，1对应鞋子 2对应化妆品，3对应手机"  )
    @TableField("type_a")
    private Integer  typeA;

    @ApiModelProperty("商品二级类别")
    @TableField("type_b")
    private String  typeB;

    @ApiModelProperty("颜色")
    @TableField("color")
    private String  color;

    @ApiModelProperty("尺寸")
    @TableField("size")
    private  String size;

    @ApiModelProperty("规格")
    @TableField("spec")
    private String spec;

    @ApiModelProperty("单位")
    @TableField("unit")
    private String unit;

    @ApiModelProperty("商品销售价格")
    @TableField("sale_price")
    private double salePrice;

    @ApiModelProperty("商品采购价格")
    @TableField("buy_price")
    private  double buyPrice;

    @ApiModelProperty("商品预售价格")
    @TableField("selling_price")
    private double sellingPrice;

    @ApiModelProperty("状态 1:上架 0:下架")
    @TableField("status")
    private  Integer status;

    @ApiModelProperty("商品实体类")
    private Goods goods;



}
