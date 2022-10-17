package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("采购单模型")
@TableName("purchase")
public class Purchase {

    @ApiModelProperty("采购单id")
    private Integer id;

    @ApiModelProperty("采购单编号")
    @TableField("purchaseno")
    private String purchaseNo;

    @ApiModelProperty("采购单状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("采购单创建日期")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("采购负责人")
    @TableField("purchase_handler")
    private Integer purchaseHandlerId;

    @ApiModelProperty("采购审核人")
    @TableField("purchase_checker")
    private Integer purchaseCheckerId;

    @ApiModelProperty("财务审核人")
    @TableField("finance_checker")
    private Integer financeCheckerId;

    @ApiModelProperty("请购单id")
    private Integer applyId;

    @ApiModelProperty("供应商id")
    private Integer supplierId;

//    @ApiModelProperty("用户id")
//    private Integer userId;

}
