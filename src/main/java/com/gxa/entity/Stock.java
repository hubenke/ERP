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
@ApiModel("库存模型")
@TableName("stock")
public class Stock {
    @ApiModelProperty("库存id")
    @TableField("id")
    private Integer id;

    @ApiModelProperty("可用库存")
    @TableField("realqty")
    private Integer realQty;

    @ApiModelProperty("仓库库存")
    @TableField("qty")
    private Integer qty;

    @ApiModelProperty("库存预警值")
    @TableField("minqty")
    private Integer minQty;

    @ApiModelProperty("货位实体类")
    private Cargo cargo;

    @ApiModelProperty("商品实体类")
    private GoodsDetail goodsDetail;

}
