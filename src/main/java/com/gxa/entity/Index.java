package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("系统首页")
public class Index {
    @ApiModelProperty("一级分类: 1：服饰 2：电子产品 3：家电 4：化妆品 5：鞋子")
    private Integer type;

    @ApiModelProperty("每类总金额")
    private double salePrice;

    @ApiModelProperty("每类总销量")
    private double buyqty;

    @ApiModelProperty("每类占比")
    private String pro;
}
