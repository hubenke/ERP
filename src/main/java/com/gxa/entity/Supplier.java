package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("供应商")
public class Supplier {

    @ApiModelProperty("供应商引进人")
    private Integer introducer;

    @ApiModelProperty("供应商编号")
    @TableId(value = "sid")
    private Integer sid;

    @ApiModelProperty("供应商来源")
    private String origin;

    @ApiModelProperty("供应商名称")
    private String sname;

    @ApiModelProperty("经营范围")
    private String range;

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

    @ApiModelProperty("商品引用")
    private Goods goods;


}
