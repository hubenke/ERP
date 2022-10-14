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
    private Integer applyno;

    @ApiModelProperty(value = "创建时间",name = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "备注",name = "备注")
    private String remark;

    @ApiModelProperty(value = "负责人",name = "负责人")
    private String launchMan;

    @ApiModelProperty(value = "审核人",name = "审核人")
    private String checkMan;

    @ApiModelProperty(value = "员工",name = "员工")
    private Emp emp;


    @ApiModelProperty(value = "商品",name ="商品" )
    private Goods goods;

    @ApiModelProperty("请购商品详情对象列表")
    private List< ApplyDetail> applyDetail;


}
