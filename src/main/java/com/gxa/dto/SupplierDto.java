package com.gxa.dto;

import com.gxa.entity.Region;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("供应商条件模型")
@Data
public class SupplierDto {

    @ApiModelProperty("供应商编号")
    private Integer sid ;

    @ApiModelProperty("引进负责人")
    private String introducer;

    @ApiModelProperty("供应商来源")
    private String origin;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty("经营范围")
    private String range ;

    @ApiModelProperty("联系人")
    private String contact;

    @ApiModelProperty("建档时间")
    private Date createTime;







}
