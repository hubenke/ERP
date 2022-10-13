package com.gxa.dto;


import com.gxa.entity.MyOrder;
import com.gxa.service.MyOrderService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Data
@ApiModel("销售订单数据传输模型")
public class MyOrderDto {
    @ApiModelProperty("订单编号")
    private String orderno;
    @ApiModelProperty("订单状态")
    private Integer status;
    @ApiModelProperty("提交时间")
    private Date submitTime;
    @ApiModelProperty("收货人/用户账号")
    private String receiver;
    @ApiModelProperty("订单来源")
    private String source;
}
