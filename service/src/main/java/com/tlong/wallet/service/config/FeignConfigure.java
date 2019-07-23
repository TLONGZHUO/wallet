//package com.tlong.wallet.service.config;
//
//import feign.Request;
//import feign.Retryer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author wangzhuo
// */
//@Configuration
//public class FeignConfigure {
//     //超时时间
//     public static int connectTimeOutMillis = 12000;
//     public static int readTimeOutMillis = 12000;
//     @Bean
//     public Request.Options options() {
//            return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
//     }
//
//     @Bean
//     public Retryer feignRetryer() {
//          return Retryer.NEVER_RETRY;
//     }
//}
