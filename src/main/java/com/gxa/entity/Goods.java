package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;


import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品")
@TableName("goods")
public class Goods {
    @ApiModelProperty("商品id")
    @TableField("gid")
    private Integer gid;

    @ApiModelProperty("商品名字")
    @TableField("gname")
    private  String gname;

    @ApiModelProperty("商品图片")
    @TableField("picture")
    private  String picture;

    @ApiModelProperty("商品品牌")
    @TableField("brand")
    private  String brand;

    @ApiModelProperty("商品详情实体类")
    private GoodsDetail goodsDetail;

    @ApiModelProperty("库存实体类")
    private Stock stock;



}
