package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@ApiModel("请购单实体类")
public
class Apply {
    @ApiModelProperty("请购单表id")
    private Integer id;

    @ApiModelProperty("请购单编号")
    private String applyno;

    @ApiModelProperty("采购单状态，0：待审核；1：审核通过")
    private Integer state;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("到货地址")
    private String address;

    @ApiModelProperty("请购发起人")
    private String applyLaunch;

    @ApiModelProperty("负责人")
    private String principal;

    @ApiModelProperty("负责人ID")
    private Integer principalId;

    @ApiModelProperty("审核人")
    private String applyChecker;

    @ApiModelProperty("员工")
    private Emp emp;

    @ApiModelProperty("商品应用" )
    private Goods goods;

    @ApiModelProperty("请购商品详情对象列表")
    private List<ApplyGoods> applyGoods;



}
