package com.tlong.wallet.service.controller;

import com.tlong.wallet.api.WalletApi;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import com.tlong.wallet.service.service.WalletService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallet")
public class WalletController implements WalletApi {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }


    @Override
    public WalletBaseResultDto singleUpload() {
        return walletService.singleUpload();
    }
}
