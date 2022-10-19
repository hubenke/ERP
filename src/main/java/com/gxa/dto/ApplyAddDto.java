package com.gxa.dto;

import com.gxa.entity.Emp;
import com.gxa.entity.Goods;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class ApplyAddDto {

    @ApiModelProperty("请购单表id")
    private Integer id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")   //转换时间类型
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

    @ApiModelProperty("请购商品详情对象列表")
    private List<ApplyGoodsDto> applyGoodsDtoListList;
}
