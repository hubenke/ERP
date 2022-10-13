package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author:
 * @ClassName:GoodsDto
 * @Package:com.gxa.dto.GoodsDto
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@Data
@ApiModel("商品")
public class GoodsDto {
    @ApiModelProperty("商品编号")
    private Integer gid;

    @ApiModelProperty("商品名称")
    private String gname;

    @ApiModelProperty("商品品牌")
    private String brand;

    @ApiModelProperty("状态 1:上架 0:下架")
    private Integer status;
}
