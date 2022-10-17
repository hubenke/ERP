package com.gxa.dto;


import com.baomidou.mybatisplus.annotation.TableField;
import com.gxa.entity.Purchase;
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

    @ApiModelProperty("采购单类")
    private Purchase purchase;

    @ApiModelProperty("采购单商品详情类")
    private List<PurchaseGoods> purchaseGoodsList;

    @ApiModelProperty("供应商编号")
    private Integer sid;

    @ApiModelProperty("请购单id")
    private Integer applyId;

}
