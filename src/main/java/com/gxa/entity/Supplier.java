package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("供应商")
public class Supplier {

    @ApiModelProperty("供应商编号")
    private Integer sid ;

    @ApiModelProperty("供应商引进人id")
    private Integer introducerId;

    @ApiModelProperty("供应商引进人姓名")
    private String introducer;

    @ApiModelProperty("供应商来源")
    private String origin;

    @ApiModelProperty("供应商名称")
    private String sname;


    @ApiModelProperty("经营范围")
    private String scope ;


    @ApiModelProperty("联系人")
    private String contact;


    @ApiModelProperty("岗位")
    private String position;


    @ApiModelProperty("电话")
    private String tel;


    @ApiModelProperty("邮件")
    private String email;


    @ApiModelProperty("qq")
    private String qq;

    @ApiModelProperty("建档时间")
    private Date createTime;

    @ApiModelProperty("区域引用")
    private Region region;

    @ApiModelProperty("详细地址")
    private String address;

    @ApiModelProperty("商品引用")
         private Goods goods;


}
