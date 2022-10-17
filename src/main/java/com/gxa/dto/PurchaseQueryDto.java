package com.gxa.dto;

import com.gxa.entity.Purchase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("采购单查询模型")
public class PurchaseQueryDto {

    @ApiModelProperty("采购单")
    private Purchase purchase;

    @ApiModelProperty("供应商编号")
    private Integer sid;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty(value = "请购负责人",name = "请购负责人")
    private String principal;

}
