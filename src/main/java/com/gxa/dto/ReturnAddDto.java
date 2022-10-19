package com.gxa.dto;

import com.gxa.entity.ReturnBill;
import com.gxa.entity.ReturnGoods;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ReturnAddDto {

    @ApiModelProperty("退货单")
    private ReturnBill returnBill;

    @ApiModelProperty("供应商编号")
    private Integer sid ;

    @ApiModelProperty("退货仓库")
    private Integer repositoryId;

    @ApiModelProperty("商品List")
    private List<ReturnGoods> returnGoodsList;

}
