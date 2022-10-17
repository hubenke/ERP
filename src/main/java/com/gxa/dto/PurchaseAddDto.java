package com.gxa.dto;


import com.baomidou.mybatisplus.annotation.TableField;
import com.gxa.entity.PurchaseGoods;
import com.gxa.entity.Supplier;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//添加
public class PurchaseAddDto {

    @ApiModelProperty("采购单编号")
    @TableField("purchaseno")
    private Integer purchaseNo;

    @ApiModelProperty("采购单创建日期")
    @TableField("create_time")
    private Timestamp createTime;

    @ApiModelProperty("到货地址")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("采购负责人")
    @TableField("purchase_handler")
    private String purchaseHandlerName;

    @ApiModelProperty("采购审核人")
    @TableField("purchase_checker")
    private String purchaseCheckerName;

    @ApiModelProperty("财务审核人")
    @TableField("finance_checker")
    private String financeCheckerName;

    @ApiModelProperty("采购单商品详情类")
    private List<PurchaseGoods> purchaseGoodsList;

    @ApiModelProperty("供应商编号")
    private Integer sid;


    @ApiModelProperty("请购单id")
    private Integer applyId;

}
