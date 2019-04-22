package com.tlong.wallet.api.client.fallback;

import com.tlong.wallet.api.client.CoinClient;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 14:43
 * @Description:
 */
@Component
public class CoinClientFallbackFactory implements FallbackFactory<CoinClient> {
    @Override
    public CoinClient create(Throwable throwable) {
        return new CoinClient() {
            @Override
            public WalletBaseResultDto findOne(Long id) {
                WalletBaseResultDto resultDto = new WalletBaseResultDto();
                resultDto.setDetail("服务器异常!请稍后再试");
                return resultDto;
            }
        };
    }
}
