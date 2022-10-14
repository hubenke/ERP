package com.gxa.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("区域实体类")
public
class Region {
    @ApiModelProperty("区域id")

    private Integer id;

    @ApiModelProperty("所在省")

    private String province;

    @ApiModelProperty("所在区域")

    private Integer address;

    @ApiModelProperty("所在市")

    private Integer town;


}
