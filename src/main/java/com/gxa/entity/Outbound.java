package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    private Integer type;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("出库日期")
    @TableField("out_time")
    private Date outTime;

    @ApiModelProperty("收货人")
    private String receiver;

    @ApiModelProperty("联系方式")
    private String tel;

    @ApiModelProperty("出库状态")
    private Integer status;

    @ApiModelProperty("仓库对象")
    private Repository repository;

    @ApiModelProperty("区域对象")
    private Region region;

    @ApiModelProperty("指派人")
    private Integer principal;

}
