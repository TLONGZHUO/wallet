package com.tlong.wallet.api;

import com.tlong.wallet.api.dto.WalletBaseResultDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 14:44
 * @Description:
 */
@Api("珑币相关接口")
public interface CoinApi {

    @ApiOperation("根据id查询用户信息")
    @GetMapping("/findOne/{id}")
    WalletBaseResultDto findOne(@PathVariable Long id);
}
