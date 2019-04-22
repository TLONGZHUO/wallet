package com.tlong.wallet.api.client;

import com.tlong.wallet.api.CoinApi;
import com.tlong.wallet.api.client.fallback.CoinClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 14:43
 * @Description:
 */
@FeignClient(value = "WALLET-CLIENT", path = "/api/coin", fallbackFactory = CoinClientFallbackFactory.class)
public interface CoinClient extends CoinApi {
}
