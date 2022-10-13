package com.gxa.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("供应商")
public
class Supplier {
    @ApiModelProperty(value = "供应商编号",name = "供应商编号")
    private Integer sid ;

    @ApiModelProperty(value = "供应商来源",name = "供应商来源")
    private    String origin;

    @ApiModelProperty(value = "供应商名称",name = "供应商名称")
    private    String sname;


    @ApiModelProperty(value = "经营范围",name = "经营范围")
    private    String range ;


    @ApiModelProperty(value = "联系人",name = "联系人")
    private    String contact;


    @ApiModelProperty(value = "岗位",name = "岗位")
    private    String position;


    @ApiModelProperty(value = "电话",name = "电话")
    private    String tel;


    @ApiModelProperty(value = "邮件",name = "邮件")
    private    String email;


    @ApiModelProperty(value = "qq",name = "qq")
    private    String qq;


//    @ApiModelProperty(value = "区域",name = "区域")
//    private Region region;
    @ApiModelProperty(value = "商品id",name = "商品id")
         private String goods;

}
