package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("入库表实体类")
public class Inbound {

    @ApiModelProperty("入库表id")
    private Integer id;

    @ApiModelProperty("入库时间")
    private Date inTime;

    @ApiModelProperty("入库编号")
    private String inboundno;

    @ApiModelProperty("入库状态")
    private String status;

    @ApiModelProperty("入库类型")
    private Integer type;

    @ApiModelProperty("采购单")
    private Purchase purchase;

    @ApiModelProperty("员工")
    private Emp emp;

    @ApiModelProperty("仓库")
    private Repository repository;

}
