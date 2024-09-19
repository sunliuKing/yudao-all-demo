package com.yudaodemo.labx03scfeigndemo02Bconsumer.config;// DemoProviderFeignClientConfiguration.java

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * 服务 demo-provider 的 FeignClient 配置类
 */
public class DemoProviderFeignClientConfiguration {

    @Bean
    @Primary // 主 Bean
    public Logger.Level feignClientLoggerLevel() {
        return Logger.Level.FULL;
    }

}