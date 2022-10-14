package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("供应商条件模型")
@Data
public
class SupplierDto {
    @ApiModelProperty(value = "供应商编号",name = "供应商编号")
    private Integer sid ;


    @ApiModelProperty(value = "供应商来源",name = "供应商来源")
    private    String origin;

    @ApiModelProperty(value = "供应商名称",name = "供应商名称")
    private    String sname;

    @ApiModelProperty(value = "经营范围",name = "经营范围")
    private    String range ;


    @ApiModelProperty(value = "联系人",name = "联系人")
    private    String contact;




}
