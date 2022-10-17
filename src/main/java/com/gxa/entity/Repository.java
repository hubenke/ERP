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
    
    @ApiModelProperty("仓库管理员")
    private Integer storeManager;

    @ApiModelProperty("货架数量")
    @TableField("shelves_num")
    private Integer shelvesNum;

    @ApiModelProperty("区域货位")
    private Cargo cargo;



    @ApiModelProperty("商品")
     private Goods goods;


    @ApiModelProperty("库存")
    private Stock stock;

//    @ApiModelProperty("商品名称")
//    private String goodsName;

//    @ApiModelProperty("商品品牌")
//    private String brand;

    @ApiModelProperty("商品详情")
    private GoodsDetail goodsDetail;




}

