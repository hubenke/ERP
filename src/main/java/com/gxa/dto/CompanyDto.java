package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("公司架构Dto")
public class CompanyDto {

    @ApiModelProperty("公司架构边id")
    public Integer id;

    @ApiModelProperty("公司编号")
    public Integer compno;

    @ApiModelProperty("公司名称")
    public String name;

    @ApiModelProperty("职位")
    public String job;
}
