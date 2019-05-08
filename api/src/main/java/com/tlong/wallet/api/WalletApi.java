package com.tlong.wallet.api;

import com.tlong.wallet.api.dto.WalletBaseResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@Api("文件上传相关接口")
public interface WalletApi {

    @ApiOperation("普通单个文件上传")
    @GetMapping("/singleUpload")
    WalletBaseResultDto singleUpload();

}
