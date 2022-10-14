package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author:
 * @ClassName:Goods
 * @Package:com.gxa.entity.Goods
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
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

    @ApiModelProperty("商品销售价格")
    @TableField("sale_price")
    private double salePrice;

    @ApiModelProperty("商品采购价格")
    @TableField("buy_price")
    private  double buyPrice;

    @ApiModelProperty("商品品牌")
    @TableField("brand")
    private  String brand;

    @ApiModelProperty("状态 1:上架 0:下架")
    @TableField("status")
    private  Integer status;

}
