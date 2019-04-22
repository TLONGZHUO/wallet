package com.tlong.wallet.service.controller;

import com.tlong.wallet.api.CoinApi;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import com.tlong.wallet.service.service.CoinService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 14:47
 * @Description:
 */
@RestController
@RequestMapping("/api/coin")
public class CoinController implements CoinApi {

    private final CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @Override
    public WalletBaseResultDto findOne(@PathVariable Long id) {
        return coinService.findOne(id);
    }
}
