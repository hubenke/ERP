package com.gxa.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("采购单查询模型")
public class PurchaseQueryDto {

    @ApiModelProperty("采购单id")
    private Integer id;

    @ApiModelProperty("采购单编号")
    @TableField("purchaseno")
    private String purchaseNo;

    @ApiModelProperty("采购单状态 1：待分配 2：审核通过 3：已终止")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("采购单创建日期")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("采购负责人")
    private String purchaseHandlerName;

    @ApiModelProperty("采购审核人")
    private String purchaseCheckerName;

    @ApiModelProperty("财务审核人")
    private String financeCheckerName;

    @ApiModelProperty("供应商编号")
    private Integer sid;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty(value = "请购负责人",name = "请购负责人")
    private String principal;

}
