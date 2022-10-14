package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("出库表实体类")
@TableName("outbound")

public class Outbound {
    @ApiModelProperty("id")
    private Integer id;

    @ApiModelProperty("出库编号")
    private Integer outno;

    @ApiModelProperty("配送方式")
    private String type;

    @ApiModelProperty("出库日期")
    @TableField("out_time")
    private Date outTime;

    @ApiModelProperty("收货人")
    private String receiver;

    @ApiModelProperty("联系方式")
    private String tel;

    @ApiModelProperty("仓库")
    private Repository repository;

    @ApiModelProperty("区域")
    private Region region;

}
