package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("出库详情实体类")
public class OutboundGoods {
    @ApiModelProperty("出库单id")
    private Integer id;

    @ApiModelProperty("出库数量")
    private Integer outqty;

    @ApiModelProperty(value = "商品",name = "商品")
    private GoodsDetail goodsDetail;

    @ApiModelProperty(value = "出库",name = "出库")
    private Outbound outbound;

    private Integer limit;

    private Integer page;
}
