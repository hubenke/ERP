package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:
 * @ClassName:Details
 * @Package:com.gxa.entity.Details
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("商品详情")
public class GoodsDetail {
    @ApiModelProperty("id")
    private Integer did;

    @ApiModelProperty("商品一级类别")
    private String  typeA;

    @ApiModelProperty("商品二级类别")
    private String  typeB;

    @ApiModelProperty("颜色")
    private String  color;

    @ApiModelProperty("尺寸")
    private  Integer size;

    @ApiModelProperty("规格")
    private String spec;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("商品id")
    private Integer goodsId;


}
