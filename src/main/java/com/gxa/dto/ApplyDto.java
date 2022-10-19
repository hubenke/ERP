package com.gxa.dto;

import com.gxa.entity.ApplyGoods;
import com.gxa.entity.Emp;
import com.gxa.entity.Goods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@ApiModel("请购单条件模型")
public class ApplyDto {

    @ApiModelProperty("请购单表id")
    private Integer id;

    @ApiModelProperty("请购单编号")
    private String applyno;

    @ApiModelProperty("采购单状态，0：待审核；1：审核通过")
    private Integer state;

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

    @ApiModelProperty("审核人")
    private String applyChecker;

    @ApiModelProperty("员工")
    private Emp emp;

    @ApiModelProperty("商品应用" )
    private Goods goods;

    @ApiModelProperty("规格")
    private String spec;

    @ApiModelProperty("单位")
    private String unit;

    @ApiModelProperty("请购数量")
    private Integer requestqty;

    @ApiModelProperty("可用库存")
    private Integer realqty;

    @ApiModelProperty("现存量")
    private Integer qty;

    @ApiModelProperty("页数")
    private Integer page;

    @ApiModelProperty("条数")
    private Integer limit;

    @ApiModelProperty("商品id")
    private Integer gid;

    private String gname;

    private Integer eid;

    @ApiModelProperty("请购商品详情对象列表")
    private List<ApplyGoodsDto> applyGoodsDtoListList;
}
