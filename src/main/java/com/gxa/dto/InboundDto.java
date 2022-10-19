package com.gxa.dto;

import com.gxa.entity.Emp;
import com.gxa.entity.Purchase;
import com.gxa.entity.Repository;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel("入库数据传输模型")
public class InboundDto {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("入库时间")
    private Date inTime;

    @ApiModelProperty("入库状态")
    private String status;

    private Integer limit;

    private Integer page;

}
