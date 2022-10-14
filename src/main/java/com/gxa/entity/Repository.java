package com.gxa.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("仓库表实体类")
@TableName("repository")
public class Repository {
    @ApiModelProperty("仓库id")
    private Integer rid;

    @ApiModelProperty("仓库名称")
    private String rname;

    @ApiModelProperty("仓库地址")
    private String address;

    @ApiModelProperty("区域数量")
    @TableField("area_num")
    private Integer areaNum;

    @ApiModelProperty("货架数量")
    @TableField("shelves_num")
    private Integer shelvesNum;

    @ApiModelProperty("仓库管理员")
    private Emp storeManager;
}

