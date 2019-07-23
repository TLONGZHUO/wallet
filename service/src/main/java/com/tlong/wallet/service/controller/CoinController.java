package com.tlong.wallet.service.controller;

import com.tlong.wallet.api.CoinApi;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import com.tlong.wallet.service.service.CoinService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhuo
 */
@RefreshScope
@RestController
@RequestMapping("/api/coin")
public class CoinController implements CoinApi {
    @Value("${name}")
    private String name;

    private final CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @Override
    public WalletBaseResultDto findOne(@PathVariable Long id) {
        System.out.println(name);
        return coinService.findOne(id);
    }
}
