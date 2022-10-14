package com.gxa.dto;

import com.gxa.entity.Emp;
import com.gxa.entity.Purchase;
import com.gxa.entity.Repository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("入库数据传输模型")
public class InboundDto {

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

    @ApiModelProperty("员工引用")
    private Emp emp;

    @ApiModelProperty("采购单引用")
    private Purchase purchase;

    @ApiModelProperty("仓库引用")
    private Repository repository;


}
