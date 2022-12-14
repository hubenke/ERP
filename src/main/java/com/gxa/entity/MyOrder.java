package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("myorder")
@ApiModel("销售订单")
public class MyOrder {
    @ApiModelProperty("销售订单id")
    private Integer id;
    @ApiModelProperty(value = "订单编号",required = true)
    private String orderno;

    @ApiModelProperty("订单金额")
    private double money;

    @ApiModelProperty("支付方式：0:信用卡 1：网银")
    private Integer payment;

    @ApiModelProperty("订单状态:0:待付款、1:代发货、2:已发货、3:已完成、4:已关闭")
    private Integer status;

    @ApiModelProperty("提交时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @TableField("submit_time")
    private Date submitTime;

    @ApiModelProperty("配送方式")
    private Integer type;

    @ApiModelProperty("收货人/用户账号")
    private String receiver;

    @ApiModelProperty("联系电话")
    private String tel;

    @ApiModelProperty("订单数量")
    private Integer saleqty;

    @ApiModelProperty("订单来源:0:app，1:微信端，2:pc端")
    private String source;

    @ApiModelProperty("退货类:退货单状态：0：待处理 1：处理中 2：已完成 3：已拒绝")
    private ReturnBill returnBill;

    @ApiModelProperty("商品类")
    private Goods goods;

}
