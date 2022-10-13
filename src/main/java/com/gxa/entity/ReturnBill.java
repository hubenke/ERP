package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("退货单模型")
public class ReturnBill {

    @ApiModelProperty("退货单id")
    private Integer id;

    @ApiModelProperty("退货单编号")
    private String returnNo;

    @ApiModelProperty("退货单状态")
    private Integer status;

    @ApiModelProperty("退货方式")
    private Integer type;

    @ApiModelProperty("退货单创建日期")
    private Date createTime;

    @ApiModelProperty("退货日期")
    private Date returnTime;

    @ApiModelProperty("退货地址")
    private String address;

    @ApiModelProperty("退货联系人")
    private String contact;

    @ApiModelProperty("退货联系人电话")
    private String phone;

    @ApiModelProperty("退货单备注")
    private String remark;

    @ApiModelProperty("退货单详情实体类")
    private ReturnDetail returnDetail;

//    @ApiModelProperty("供应商实体类")
//    private Supplier supplier;

//    @ApiModelProperty("人员实体类")
//    private Emp emp;

//    @ApiModelProperty("仓库实体类")
//    private Repository repository;
}
