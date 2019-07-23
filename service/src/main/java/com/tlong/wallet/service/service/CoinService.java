package com.tlong.wallet.service.service;

import com.tlong.oss.api.client.OssClient;
import com.tlong.oss.api.dto.OssBaseResultDto;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wangzhuo
 */
@Component
@Transactional
public class CoinService {

    private final OssClient ossClient;

    public CoinService(OssClient ossClient) {
        this.ossClient = ossClient;
    }

    public WalletBaseResultDto findOne(Long id) {
        OssBaseResultDto ossBaseResultDto = ossClient.singleUpload();
        System.out.println(ossBaseResultDto.getDetail());
//        System.out.println("哈哈");
        WalletBaseResultDto resultDto = new WalletBaseResultDto();
//        resultDto.setId(id);
        resultDto.setDetail(ossBaseResultDto.getDetail());
        return resultDto;
    }
}
