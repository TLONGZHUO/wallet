package com.tlong.wallet.api.client.fallback;

import com.tlong.wallet.api.client.WalletClient;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class WalletClientFallbackFactory implements FallbackFactory<WalletClient> {

    @Override
    public WalletClient create(Throwable throwable) {
        return new WalletClient() {
            @Override
            public WalletBaseResultDto singleUpload() {
                WalletBaseResultDto resultDto = new WalletBaseResultDto();
                resultDto.setDetail("服务器异常!请稍后再试");
                return resultDto;
            }
        };
    }
}
