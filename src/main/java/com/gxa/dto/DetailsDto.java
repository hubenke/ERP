package com.gxa.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author:
 * @ClassName:DetailsDto
 * @Package:com.gxa.dto.DetailsDto
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/
@Data
@ApiModel("商品详情")
public class DetailsDto {
    @ApiModelProperty("id")
    private Integer id;
}
