package com.tlong.wallet.api.client;

import com.tlong.wallet.api.client.fallback.WalletClientFallbackFactory;
import com.tlong.wallet.api.WalletApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "WALLET-CLIENT", path = "/api/wallet", fallbackFactory = WalletClientFallbackFactory.class)
public interface WalletClient extends WalletApi {
}
