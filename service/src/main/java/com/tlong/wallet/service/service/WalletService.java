package com.tlong.wallet.service.service;

import com.tlong.oss.api.client.OssClient;
import com.tlong.oss.api.dto.OssBaseResultDto;
import com.tlong.wallet.api.dto.WalletBaseResultDto;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class WalletService {


    private final OssClient ossClient;

    public WalletService(OssClient ossClient) {
        this.ossClient = ossClient;
    }


    /**
     * 测试文件上传
     */
    public WalletBaseResultDto singleUpload() {
        OssBaseResultDto ossBaseResultDto = new OssBaseResultDto();
        try {
             ossBaseResultDto = ossClient.singleUpload();
            System.out.println(ossBaseResultDto.getDetail());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        System.out.println("文件上传项目wallet");
        WalletBaseResultDto baseResultDto = new WalletBaseResultDto();
        baseResultDto.setDetail(ossBaseResultDto.getDetail());
        return baseResultDto;
    }
}
