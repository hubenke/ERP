package com.gxa.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("销售订单")
public class MyOrder {
    @ApiModelProperty("销售订单id")
    private Integer id;
    @ApiModelProperty("订单编号")
    private String orderno;
    @ApiModelProperty("订单金额")
    private double money;
    @ApiModelProperty("支付方式")
    private Integer payment;
    @ApiModelProperty("订单状态")
    private Integer status;
    @ApiModelProperty("提交时间")
    private Date submitTime;
    @ApiModelProperty("配送方式")
    private Integer type;
    @ApiModelProperty("收货人/用户账号")
    private String receiver;
    @ApiModelProperty("联系电话")
    private String tel;
    @ApiModelProperty("订单数量")
    private Integer saleqty;
    @ApiModelProperty("订单来源")
    private String source;
    @ApiModelProperty("商品类")
    private Goods goods;

}
