package com.tlong.wallet.service.service;

import com.tlong.wallet.api.dto.WalletBaseResultDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: wangzhuo
 * @Date: 2019-04-22 14:48
 * @Description:
 */
@Component
@Transactional
public class CoinService {


    public WalletBaseResultDto findOne(Long id) {
        WalletBaseResultDto resultDto = new WalletBaseResultDto();
        resultDto.setId(id);
        resultDto.setDetail("哈哈");
        return resultDto;
    }
}
