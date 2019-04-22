package com.tlong.wallet.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("基本返回数据模型")
public class WalletBaseResultDto implements Serializable {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("处理结果 0成功 1失败")
    private Integer result;

    @ApiModelProperty("处理结果说明")
    private String Detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
